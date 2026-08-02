package com.squareup.cash.globalsearch.analytics.real;

import android.content.SharedPreferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.globalsearch.GlobalSearchViewItem;
import com.squareup.cash.globalsearch.analytics.api.GlobalSearchAnalyticsContext$Item;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGlobalSearchAnalyticsHelper {
    public final Analytics analytics;
    public final RealGlobalSearchAnalyticsContext analyticsContext;
    public final CoroutineContext ioDispatcher;
    public final SharedPreferences preferences;
    public final LinkedHashSet viewedItemsSet = new LinkedHashSet();

    public RealGlobalSearchAnalyticsHelper(Analytics analytics, RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext, SharedPreferences sharedPreferences, RealUuidGenerator realUuidGenerator, CoroutineContext coroutineContext) {
        this.analytics = analytics;
        this.analyticsContext = realGlobalSearchAnalyticsContext;
        this.preferences = sharedPreferences;
        this.ioDispatcher = coroutineContext;
    }

    public final Object getSharedPreference(String str, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioDispatcher, new RealGlobalSearchAnalyticsHelper$getSharedPreference$2(this, str, null, 0), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitViewItemEvent(SearchOrigin searchOrigin, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        RealGlobalSearchAnalyticsHelper$submitViewItemEvent$1 realGlobalSearchAnalyticsHelper$submitViewItemEvent$1;
        Object obj;
        int i;
        String str5;
        String str6;
        String str7;
        int i2;
        Analytics analytics;
        SearchOrigin searchOrigin2;
        String str8;
        Object sharedPreference;
        String str9;
        Analytics analytics2;
        String str10;
        String str11;
        Object sharedPreference2;
        String str12;
        String str13;
        Analytics analytics3;
        String str14;
        String str15;
        String str16;
        String str17;
        SearchOrigin searchOrigin3;
        if (continuationImpl instanceof RealGlobalSearchAnalyticsHelper$submitViewItemEvent$1) {
            realGlobalSearchAnalyticsHelper$submitViewItemEvent$1 = (RealGlobalSearchAnalyticsHelper$submitViewItemEvent$1) continuationImpl;
            int i3 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    boolean add = this.viewedItemsSet.add(str);
                    int i4 = !add ? 1 : 0;
                    if (add) {
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0 = searchOrigin;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1 = str;
                        str5 = str2;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2 = str5;
                        str6 = str3;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3 = str6;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4 = str4;
                        Analytics analytics4 = this.analytics;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5 = analytics4;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0 = i4;
                        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = 1;
                        Object sharedPreference3 = getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", realGlobalSearchAnalyticsHelper$submitViewItemEvent$1);
                        if (sharedPreference3 != obj) {
                            str7 = str;
                            i2 = i4;
                            analytics = analytics4;
                            searchOrigin2 = searchOrigin;
                            obj2 = sharedPreference3;
                            str8 = str4;
                        }
                        return obj;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str18 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$7;
                        String str19 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6;
                        analytics3 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5;
                        String str20 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4;
                        String str21 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3;
                        String str22 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2;
                        str17 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1;
                        SearchOrigin searchOrigin4 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        str12 = str18;
                        searchOrigin3 = searchOrigin4;
                        str13 = str19;
                        str14 = str20;
                        str15 = str21;
                        str16 = str22;
                        String str23 = (String) obj2;
                        RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext = this.analyticsContext;
                        GlobalSearchAnalyticsContext$Item item = realGlobalSearchAnalyticsContext.getItem(str17);
                        Integer num = item == null ? new Integer(item.absoluteItemIndex) : null;
                        GlobalSearchAnalyticsContext$Item item2 = realGlobalSearchAnalyticsContext.getItem(str17);
                        analytics3.track(new GlobalSearchViewItem(str13, str12, str23, searchOrigin3, str16, str15, num, item2 == null ? new Integer(item2.sectionIndex) : null, str14), null);
                        return Unit.INSTANCE;
                    }
                    i2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0;
                    str9 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6;
                    analytics2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5;
                    str8 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4;
                    str11 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3;
                    str10 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2;
                    str7 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1;
                    searchOrigin2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    String str24 = (String) obj2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0 = searchOrigin2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1 = str7;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2 = str10;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3 = str11;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4 = str8;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5 = analytics2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6 = str9;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$7 = str24;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0 = i2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = 3;
                    sharedPreference2 = getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", realGlobalSearchAnalyticsHelper$submitViewItemEvent$1);
                    if (sharedPreference2 != obj) {
                        str12 = str24;
                        str13 = str9;
                        analytics3 = analytics2;
                        str14 = str8;
                        str15 = str11;
                        str16 = str10;
                        str17 = str7;
                        searchOrigin3 = searchOrigin2;
                        obj2 = sharedPreference2;
                        String str232 = (String) obj2;
                        RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext2 = this.analyticsContext;
                        GlobalSearchAnalyticsContext$Item item3 = realGlobalSearchAnalyticsContext2.getItem(str17);
                        if (item3 == null) {
                        }
                        GlobalSearchAnalyticsContext$Item item22 = realGlobalSearchAnalyticsContext2.getItem(str17);
                        analytics3.track(new GlobalSearchViewItem(str13, str12, str232, searchOrigin3, str16, str15, num, item22 == null ? new Integer(item22.sectionIndex) : null, str14), null);
                        return Unit.INSTANCE;
                    }
                    return obj;
                }
                i2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0;
                analytics = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5;
                str8 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4;
                String str25 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3;
                String str26 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2;
                str7 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1;
                searchOrigin2 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                str6 = str25;
                str5 = str26;
                String str27 = (String) obj2;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0 = searchOrigin2;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1 = str7;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2 = str5;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3 = str6;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4 = str8;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5 = analytics;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6 = str27;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0 = i2;
                realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = 2;
                sharedPreference = getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", realGlobalSearchAnalyticsHelper$submitViewItemEvent$1);
                if (sharedPreference != obj) {
                    Analytics analytics5 = analytics;
                    str9 = str27;
                    obj2 = sharedPreference;
                    analytics2 = analytics5;
                    String str28 = str6;
                    str10 = str5;
                    str11 = str28;
                    String str242 = (String) obj2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0 = searchOrigin2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1 = str7;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2 = str10;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3 = str11;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4 = str8;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5 = analytics2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6 = str9;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$7 = str242;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0 = i2;
                    realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = 3;
                    sharedPreference2 = getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", realGlobalSearchAnalyticsHelper$submitViewItemEvent$1);
                    if (sharedPreference2 != obj) {
                    }
                }
                return obj;
            }
        }
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1 = new RealGlobalSearchAnalyticsHelper$submitViewItemEvent$1(this, continuationImpl);
        Object obj22 = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label;
        if (i != 0) {
        }
        String str272 = (String) obj22;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$0 = searchOrigin2;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$1 = str7;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$2 = str5;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$3 = str6;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$4 = str8;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$5 = analytics;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.L$6 = str272;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.I$0 = i2;
        realGlobalSearchAnalyticsHelper$submitViewItemEvent$1.label = 2;
        sharedPreference = getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", realGlobalSearchAnalyticsHelper$submitViewItemEvent$1);
        if (sharedPreference != obj) {
        }
        return obj;
    }
}
