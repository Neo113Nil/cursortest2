package com.fillr.browsersdk.adapters;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.cursoradapter.widget.CursorFilter;
import androidx.emoji2.text.MetadataRepo;
import com.fillr.browsersdk.dialog.AddressSelectionDialog;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressQueryResult;
import com.fillr.core.model.FillrAddressQueryResultList;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.ConnectionUtil;
import com.fillr.profile.adapter.ProfileAdapter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.oneformapp.schema.Element;

/* loaded from: classes4.dex */
public final class PlaceAutocompleteAdapter extends ArrayAdapter implements Filterable {
    public MetadataRepo mAddressSelectionDialogListener;
    public AddressAutocompletionClient mAutocompleteClient;
    public List mResultList;

    public final class AddressAutocompletionClient implements ConsumerAPIClientListener {
        public final SecureRandom sequenceGenerator = new SecureRandom();
        public final Map responses = Collections.synchronizedMap(new HashMap());
        public final Repository apiClient = new Repository(this);

        @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
        public final boolean onBeforeAPICallback() {
            return true;
        }

        @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
        public final void onConsumerAPICallProgressStart(String str) {
        }

        @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
        public final void onConsumerAPIData(int i, ModelBase modelBase) {
            ArrayList arrayList = new ArrayList();
            if (modelBase instanceof FillrAddressQueryResultList) {
                Iterator it = ((FillrAddressQueryResultList) modelBase).mComponentList.iterator();
                while (it.hasNext()) {
                    arrayList.add((FillrAddressQueryResult) it.next());
                }
            }
            synchronized (this.responses) {
                this.responses.put(Integer.valueOf(i), arrayList);
                this.responses.notify();
            }
        }

        @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
        public final void onConsumerAPIError(int i) {
        }

        @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
        public final void onConsumerAPILog(String str) {
        }
    }

    static {
        new StyleSpan(1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        List list = this.mResultList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new CursorFilter(this, 1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final FillrAddressQueryResult getItem(int i) {
        List list = this.mResultList;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (FillrAddressQueryResult) this.mResultList.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        FillrAddressQueryResult item = getItem(i);
        TextView textView = (TextView) view2.findViewById(R.id.text1);
        TextView textView2 = (TextView) view2.findViewById(R.id.text2);
        if (item != null) {
            textView.setText(item.getHumanReadableAddress());
            textView2.setText("");
            return view2;
        }
        textView.setText("");
        textView2.setText("");
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        MetadataRepo metadataRepo = this.mAddressSelectionDialogListener;
        if (metadataRepo != null) {
            Context context = (Context) metadataRepo.mMetadataList;
            if (ConnectionUtil.isConnected(context)) {
                return;
            }
            ((AddressSelectionDialog) metadataRepo.mEmojiCharArray).dismiss();
            ProfileAdapter profileAdapter = (ProfileAdapter) metadataRepo.mTypeface;
            Element element = (Element) metadataRepo.mRootNode;
            new AlertDialog.Builder(context).setMessage(com.squareup.cash.R.string.fillr_lost_internet_during_google_address_lookup).setPositiveButton(com.squareup.cash.R.string.fillr_ok, new FillrBaseAdapter$2(profileAdapter.mHostingFragment, element, 0)).setCancelable(false).create().show();
        }
    }
}
