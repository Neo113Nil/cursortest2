package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1xSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMonetizationNetwork(List<AFd1fSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(kotlin.collections.p.c(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1fSDK) it.next()).AFAdRevenueData());
        }
        return new JSONArray((Collection) arrayList);
    }
}
