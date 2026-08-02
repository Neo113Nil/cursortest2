package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import com.fillr.browsersdk.adapters.PlaceAutocompleteAdapter;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerAPIClientTask;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressQueryResult;
import com.withpersona.sdk2.inquiry.steps.ui.adapter.StyleableSelectArrayAdapter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CursorFilter extends Filter {
    public final /* synthetic */ int $r8$classId;
    public BaseAdapter mClient;

    public /* synthetic */ CursorFilter(ArrayAdapter arrayAdapter, int i) {
        this.$r8$classId = i;
        this.mClient = arrayAdapter;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (!(obj instanceof FillrAddressQueryResult)) {
                    break;
                } else {
                    break;
                }
        }
        return super.convertResultToString(obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        switch (this.$r8$classId) {
            case 0:
                Cursor runQueryOnBackgroundThread = ((CursorAdapter) this.mClient).runQueryOnBackgroundThread(charSequence);
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (runQueryOnBackgroundThread != null) {
                    filterResults.count = runQueryOnBackgroundThread.getCount();
                    filterResults.values = runQueryOnBackgroundThread;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            case 1:
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                if (charSequence != null) {
                    PlaceAutocompleteAdapter placeAutocompleteAdapter = (PlaceAutocompleteAdapter) this.mClient;
                    PlaceAutocompleteAdapter.AddressAutocompletionClient addressAutocompletionClient = placeAutocompleteAdapter.mAutocompleteClient;
                    String charSequence2 = charSequence.toString();
                    int nextInt = addressAutocompletionClient.sequenceGenerator.nextInt();
                    long currentTimeMillis = System.currentTimeMillis() + 60000;
                    Repository repository = addressAutocompletionClient.apiClient;
                    repository.getClass();
                    String deobfuscateString = new Obfuscator(String.format("%.10f", Double.valueOf(3.141592653589793d)), 0).deobfuscateString(Repository.obfuscatedKEY);
                    ConsumerAPIClientParams consumerAPIClientParams = repository.getConsumerAPIClientParams(APIEndpoint.GET_PLACE_AUTOCOMPLETE);
                    consumerAPIClientParams.putQueryParam("key", deobfuscateString);
                    consumerAPIClientParams.putQueryParam("input", charSequence2);
                    consumerAPIClientParams.putQueryParam("types", "address");
                    consumerAPIClientParams.putQueryParam("sessiontoken", Repository.getGooglePlacesSessionId());
                    new ConsumerAPIClientTask((ConsumerAPIClientListener) repository.consumerAPIClient, null, nextInt).performAPICall(consumerAPIClientParams);
                    synchronized (addressAutocompletionClient.responses) {
                        while (!addressAutocompletionClient.responses.containsKey(Integer.valueOf(nextInt)) && System.currentTimeMillis() < currentTimeMillis) {
                            try {
                                addressAutocompletionClient.responses.wait(60000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                    placeAutocompleteAdapter.mResultList = addressAutocompletionClient.responses.containsKey(Integer.valueOf(nextInt)) ? (List) addressAutocompletionClient.responses.remove(Integer.valueOf(nextInt)) : Collections.EMPTY_LIST;
                    List list = ((PlaceAutocompleteAdapter) this.mClient).mResultList;
                    if (list != null) {
                        filterResults2.values = list;
                        filterResults2.count = list.size();
                    }
                }
                return filterResults2;
            default:
                Filter.FilterResults filterResults3 = new Filter.FilterResults();
                List list2 = ((StyleableSelectArrayAdapter) this.mClient).objects;
                filterResults3.values = list2;
                filterResults3.count = list2.size();
                return filterResults3;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.$r8$classId) {
            case 0:
                CursorAdapter cursorAdapter = (CursorAdapter) this.mClient;
                Cursor cursor = cursorAdapter.mCursor;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    cursorAdapter.changeCursor((Cursor) obj);
                    break;
                }
                break;
            case 1:
                PlaceAutocompleteAdapter placeAutocompleteAdapter = (PlaceAutocompleteAdapter) this.mClient;
                if (filterResults != null && filterResults.count > 0) {
                    placeAutocompleteAdapter.notifyDataSetChanged();
                    break;
                } else {
                    placeAutocompleteAdapter.notifyDataSetInvalidated();
                    break;
                }
                break;
            default:
                ((StyleableSelectArrayAdapter) this.mClient).notifyDataSetChanged();
                break;
        }
    }

    public /* synthetic */ CursorFilter() {
        this.$r8$classId = 0;
    }
}
