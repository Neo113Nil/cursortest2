package app.cash.local.presenters.brand;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class LocalOpenTabFooterModelFactoryKt {
    public static final LocalBottomModalViewModel checkedInFooterModal(FulfillmentConfiguration.InStore inStore, AndroidStringManager androidStringManager) {
        String str;
        LocalFulfillment.InStoreDetails inStoreDetails;
        FulfillmentConfiguration.InStore asInStore = FulfillmentConfigurationKt.getAsInStore(inStore);
        String str2 = null;
        if (asInStore == null || (inStoreDetails = asInStore.inStoreDetails) == null || (str = inStoreDetails.ordering_station_label) == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String str3 = androidStringManager.get(R.string.local_presenters_checked_in_footer_title);
        if (str != null) {
            String str4 = androidStringManager.get(R.string.local_presenters_in_store_for_here);
            str4.getClass();
            Object[] objArr = {str, str4};
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.local_presenters_checked_in_footer_subtitle)).format(objArr);
            str2.getClass();
        }
        return new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.OpenTabInfo(str3, str2), androidStringManager.get(R.string.local_presenters_start_order), false, 18);
    }

    public static final LocalBottomModalViewModel openTabFooterModal(LocalCart localCart, FulfillmentConfiguration fulfillmentConfiguration, AndroidStringManager androidStringManager) {
        String str;
        String str2;
        String format2;
        LocalFulfillment.InStoreDetails inStoreDetails;
        Integer num;
        LocalCart.OpenTabInfo openTabInfo;
        Resources resources = androidStringManager.resources;
        String str3 = null;
        if ((fulfillmentConfiguration != null ? FulfillmentConfigurationKt.getAsInStore(fulfillmentConfiguration) : null) != null) {
            if ((localCart != null ? localCart.open_tab_info : null) != null) {
                List<LocalCart.OpenTabInfo.Round> list = (localCart == null || (openTabInfo = localCart.open_tab_info) == null) ? null : openTabInfo.rounds;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                Iterator<T> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Iterator<T> it2 = ((LocalCart.OpenTabInfo.Round) it.next()).lines.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        LocalCart.Line.Selection selection = ((LocalCart.Line) it2.next()).selection;
                        i2 += (selection == null || (num = selection.quantity) == null) ? 1 : num.intValue();
                    }
                    i += i2;
                }
                if (OpenTabStateKt.getHasOpenTabRounds(localCart)) {
                    Integer valueOf = Integer.valueOf(i);
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("count", valueOf);
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.local_presenters_items_count)).format(arrayMap);
                    str.getClass();
                } else {
                    str = null;
                }
                FulfillmentConfiguration.InStore asInStore = FulfillmentConfigurationKt.getAsInStore(fulfillmentConfiguration);
                if (asInStore == null || (inStoreDetails = asInStore.inStoreDetails) == null || (str2 = inStoreDetails.ordering_station_label) == null || StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (str != null) {
                    if (str2 != null) {
                        resources.getClass();
                        format2 = new MessageFormat(resources.getString(R.string.local_presenters_open_tab_footer_subtitle)).format(new Object[]{str2, str});
                        format2.getClass();
                    } else {
                        resources.getClass();
                        format2 = new MessageFormat(resources.getString(R.string.local_presenters_open_tab_footer_item_count_subtitle)).format(new Object[]{str});
                        format2.getClass();
                    }
                    str3 = format2;
                }
                return new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.OpenTabInfo(androidStringManager.get(R.string.local_presenters_open_tab_footer_title), str3), androidStringManager.get(R.string.local_presenters_view_cart), false, 18);
            }
        }
        return null;
    }
}
