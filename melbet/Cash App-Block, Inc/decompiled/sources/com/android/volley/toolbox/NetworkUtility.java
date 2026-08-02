package com.android.volley.toolbox;

import com.android.volley.Cache$Entry;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import com.jakewharton.disklrucache.StrictLineReader;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.clientroutes.ClientRoute;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class NetworkUtility {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLinkBankAccount.deepLinkSpecs;
    }

    public static NetworkResponse getNotModifiedNetworkResponse(Request request, List list) {
        Cache$Entry cache$Entry = request.mCacheEntry;
        if (cache$Entry == null) {
            return new NetworkResponse(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((Header) it.next()).mName);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = cache$Entry.allResponseHeaders;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : cache$Entry.allResponseHeaders) {
                    if (!treeSet.contains(header.mName)) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!cache$Entry.responseHeaders.isEmpty()) {
            for (Map.Entry entry : cache$Entry.responseHeaders.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new NetworkResponse(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, cache$Entry.data, true, arrayList);
    }

    public static byte[] inputStreamToBytes(InputStream inputStream, int i, HttpResponse httpResponse) {
        byte[] bArr;
        StrictLineReader.AnonymousClass1 anonymousClass1 = new StrictLineReader.AnonymousClass1(httpResponse, i);
        try {
            bArr = httpResponse.getBuf(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    anonymousClass1.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                    }
                    httpResponse.returnBuf(bArr);
                    anonymousClass1.close();
                    throw th;
                }
            }
            byte[] byteArray = anonymousClass1.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
            }
            httpResponse.returnBuf(bArr);
            anonymousClass1.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
