package app.cash.local.backend;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalInStoreOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalRemoteOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent$Intent$InStoreOrdering;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent$Intent$RemoteOrdering;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class BuyerIntentManagerKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowLimitHubBulletinInfo.deepLinkSpecs;
    }

    public static final boolean isMissingWebViewPackageException(Exception exc) {
        String message;
        String message2;
        String canonicalName = exc.getClass().getCanonicalName();
        return (canonicalName != null && StringsKt.contains((CharSequence) canonicalName, (CharSequence) "MissingWebViewPackageException", false)) || ((message = exc.getMessage()) != null && StringsKt.contains((CharSequence) message, (CharSequence) "No WebView installed", false)) || ((message2 = exc.getMessage()) != null && StringsKt.contains((CharSequence) message2, (CharSequence) "failed to redirect ResourcesImpl", false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BuyerIntentState toBuyerIntentState(LocalUserIntent localUserIntent, BrandSpot brandSpot, LocalBrand localBrand, FulfillmentConfiguration fulfillmentConfiguration) {
        String str;
        String str2;
        FulfillmentConfiguration fulfillmentConfiguration2;
        FulfillmentConfiguration fulfillmentConfiguration3;
        FulfillmentConfiguration.Delivery asDelivery;
        localUserIntent.getClass();
        brandSpot.getClass();
        String str3 = localUserIntent.token;
        String str4 = null;
        if (str3 != null) {
            String str5 = !StringsKt.isBlank(str3) ? str3 : null;
            if (str5 != null) {
                String str6 = localUserIntent.brand_token;
                if (str6 != null) {
                    if (StringsKt.isBlank(str6)) {
                        str6 = null;
                    }
                }
                str6 = brandSpot.brandToken;
                String str7 = str6;
                str7.getClass();
                String str8 = brandSpot.locationToken;
                zzja zzjaVar = localUserIntent.intent;
                if (zzjaVar instanceof LocalUserIntent$Intent$RemoteOrdering) {
                    LocalRemoteOrderingIntent localRemoteOrderingIntent = ((LocalUserIntent$Intent$RemoteOrdering) zzjaVar).value;
                    List list = localUserIntent.errors;
                    String str9 = localRemoteOrderingIntent.location_token;
                    if (str9 != null) {
                        if (StringsKt.isBlank(str9)) {
                            str9 = null;
                        }
                        if (str9 != null) {
                            str2 = str9;
                            BrandSpot brandSpot2 = new BrandSpot(str7, str2);
                            if (str2 == null) {
                                LocalFulfillment localFulfillment = localRemoteOrderingIntent.fulfillment;
                                if (localFulfillment != null) {
                                    fulfillmentConfiguration3 = FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(FulfillmentKt.toFulfillment(localFulfillment), str2, (fulfillmentConfiguration == null || (asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration)) == null) ? null : asDelivery.deliveryFee);
                                } else {
                                    fulfillmentConfiguration3 = null;
                                }
                                fulfillmentConfiguration2 = fulfillmentConfiguration3;
                            } else {
                                fulfillmentConfiguration2 = null;
                            }
                            return new BuyerIntentState(new BuyerIntentScope(brandSpot2, BuyerIntentType.REMOTE_ORDERING, null), str5, str7, str2, localRemoteOrderingIntent, null, list, fulfillmentConfiguration2);
                        }
                    }
                    str2 = str8;
                    BrandSpot brandSpot22 = new BrandSpot(str7, str2);
                    if (str2 == null) {
                    }
                    return new BuyerIntentState(new BuyerIntentScope(brandSpot22, BuyerIntentType.REMOTE_ORDERING, null), str5, str7, str2, localRemoteOrderingIntent, null, list, fulfillmentConfiguration2);
                }
                if (zzjaVar instanceof LocalUserIntent$Intent$InStoreOrdering) {
                    LocalInStoreOrderingIntent localInStoreOrderingIntent = ((LocalUserIntent$Intent$InStoreOrdering) zzjaVar).value;
                    List list2 = localUserIntent.errors;
                    String str10 = localInStoreOrderingIntent.location_token;
                    String str11 = localInStoreOrderingIntent.ordering_station_token;
                    if (str10 != null) {
                        if (StringsKt.isBlank(str10)) {
                            str10 = null;
                        }
                        if (str10 != null) {
                            str = str10;
                            BuyerIntentScope buyerIntentScope = new BuyerIntentScope(new BrandSpot(str7, str), BuyerIntentType.IN_STORE_ORDERING, (str11 != null || StringsKt.isBlank(str11)) ? null : str11);
                            if (str11 != null && !StringsKt.isBlank(str11)) {
                                str4 = str11;
                            }
                            FulfillmentConfiguration inStoreFulfillmentConfiguration = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand, str4);
                            return new BuyerIntentState(buyerIntentScope, str5, str7, str, null, localInStoreOrderingIntent, list2, inStoreFulfillmentConfiguration != null ? fulfillmentConfiguration : inStoreFulfillmentConfiguration);
                        }
                    }
                    str = str8;
                    BuyerIntentScope buyerIntentScope2 = new BuyerIntentScope(new BrandSpot(str7, str), BuyerIntentType.IN_STORE_ORDERING, (str11 != null || StringsKt.isBlank(str11)) ? null : str11);
                    if (str11 != null) {
                        str4 = str11;
                    }
                    FulfillmentConfiguration inStoreFulfillmentConfiguration2 = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand, str4);
                    return new BuyerIntentState(buyerIntentScope2, str5, str7, str, null, localInStoreOrderingIntent, list2, inStoreFulfillmentConfiguration2 != null ? fulfillmentConfiguration : inStoreFulfillmentConfiguration2);
                }
                if (zzjaVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
        }
        return null;
    }
}
