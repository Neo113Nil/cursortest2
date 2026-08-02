package app.cash.local.navigation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.store.real.RealLocalInstalledStore;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.work.data.api.TaxFormData;
import com.squareup.cash.work.service.api.taxforms.TaxFormAttributes;
import com.squareup.cash.work.service.api.taxforms.TaxFormJsonData;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public abstract class LocalInstalledStoreKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowRepayCustomAmount.deepLinkSpecs;
    }

    public static final Flow localCashBalanceOrNothing(LocalInstalledStore localInstalledStore) {
        return ((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalCashBalance);
    }

    public static final TaxFormData toTaxFormData(TaxFormJsonData taxFormJsonData) {
        taxFormJsonData.getClass();
        TaxFormAttributes taxFormAttributes = taxFormJsonData.attributes;
        String str = taxFormAttributes.periodDisplay;
        String str2 = taxFormAttributes.formName;
        if (str != null && str2 != null) {
            str = Recorder$$ExternalSyntheticOutline2.m(str, " ", str2);
        } else if (str2 != null) {
            str = str2;
        } else if (str == null) {
            str = null;
        }
        return new TaxFormData(taxFormJsonData.id, str, taxFormAttributes.downloadUrl);
    }
}
