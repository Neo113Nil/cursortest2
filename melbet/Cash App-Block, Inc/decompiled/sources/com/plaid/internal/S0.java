package com.plaid.internal;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.C0095a6;
import com.plaid.internal.N0;
import com.plaid.internal.Q0;
import com.plaid.link.result.LinkExit;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class S0 {
    public final Q0.a a;
    public final Json b;

    public S0(Q0.a aVar, Json json) {
        aVar.getClass();
        json.getClass();
        this.a = aVar;
        this.b = json;
    }

    public final boolean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("start_link")) {
                if (!jSONObject.has("open_url")) {
                    return false;
                }
                String string2 = jSONObject.getString("open_url");
                Q0.a aVar = this.a;
                string2.getClass();
                aVar.a(string2);
                return true;
            }
            String jSONObject2 = jSONObject.getJSONObject("start_link").toString();
            jSONObject2.getClass();
            try {
                Json json = this.b;
                N0.b.a();
                M0 a = ((N0) json.decodeFromString(jSONObject2, N0.a.a)).a();
                C0095a6.a.a(C0095a6.a, "embeddedLinkSessionInfo: " + a);
                this.a.a(a);
                return true;
            } catch (SerializationException e) {
                C0095a6.a.b(C0095a6.a, "Unable to parse start_link message: " + jSONObject2 + " " + e.getMessage());
                return false;
            }
        } catch (JSONException e2) {
            C0095a6.a.b(C0095a6.a, "Unable to parse internal event: " + str + ", error: " + e2.getMessage());
            return false;
        }
    }

    public final void b(String str) {
        str.getClass();
        String replace$default = StringsKt__StringsJVMKt.replace$default(str, "plaidlink://", "https://");
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.parse$okhttp(null, replace$default);
        HttpUrl build = builder.build();
        String str2 = build.host;
        Set queryParameterNames = build.queryParameterNames();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(queryParameterNames, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = queryParameterNames.iterator();
        while (true) {
            String str3 = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String queryParameter = build.queryParameter((String) next);
            if (queryParameter != null) {
                str3 = queryParameter;
            }
            linkedHashMap.put(next, str3);
        }
        String str4 = (String) linkedHashMap.get(BreadcrumbHelper.Category.EVENT);
        if (Intrinsics.areEqual(str2, "internal-event") && str4 != null) {
            if (a(str4)) {
                return;
            }
            C0095a6.a.b(C0095a6.a, "failed to handle internal event: ".concat(str4));
            return;
        }
        if (!Intrinsics.areEqual(str2, "exit")) {
            C0095a6.a.b(C0095a6.a, "unknown action: " + str2 + ", parsedUri: " + build);
            return;
        }
        Set queryParameterNames2 = build.queryParameterNames();
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(queryParameterNames2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Object obj : queryParameterNames2) {
            String queryParameter2 = build.queryParameter((String) obj);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap2.put(obj, queryParameter2);
        }
        try {
            this.a.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkedHashMap2));
        } catch (NoSuchElementException unused) {
            this.a.a(L2.b(new C0090a1("Failed to parse exit"), null));
        }
    }
}
