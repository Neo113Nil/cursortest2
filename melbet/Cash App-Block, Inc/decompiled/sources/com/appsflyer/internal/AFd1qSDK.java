package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class AFd1qSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMediationNetwork(List<AFc1aSDK> list) {
        list.getClass();
        List<AFc1aSDK> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1aSDK) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }
}
