package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q8c {
    public static boolean e;
    public static final q8c f = new q8c();
    public static final List a = u75.h("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final AtomicReference c = new AtomicReference(o8c.a);
    public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();

    public static JSONObject a(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        bundle.putString("fields", TextUtils.join(StringUtils.COMMA, arrayList));
        String str2 = ood.j;
        ood oodVar = new ood(null, str, null, null, null, 0);
        oodVar.i = true;
        oodVar.h = true;
        oodVar.d = bundle;
        JSONObject jSONObject = oodVar.c().a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    public static final n8c b(String str) {
        return (n8c) b.get(str);
    }

    public static final void c() {
        Context b2 = j3c.b();
        String c2 = j3c.c();
        boolean D = gvt.D(c2);
        o8c o8cVar = o8c.d;
        q8c q8cVar = f;
        AtomicReference atomicReference = c;
        if (D) {
            atomicReference.set(o8cVar);
            q8cVar.e();
            return;
        }
        if (b.containsKey(c2)) {
            atomicReference.set(o8c.c);
            q8cVar.e();
            return;
        }
        while (true) {
            o8c o8cVar2 = o8c.a;
            o8c o8cVar3 = o8c.b;
            if (atomicReference.compareAndSet(o8cVar2, o8cVar3)) {
                break;
            }
            if (atomicReference.get() != o8cVar2) {
                while (!atomicReference.compareAndSet(o8cVar, o8cVar3)) {
                    if (atomicReference.get() != o8cVar) {
                        q8cVar.e();
                        return;
                    }
                }
            }
        }
        j3c.d().execute(new l8c(b2, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{c2}, 1)), c2));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n8c d(String str, JSONObject jSONObject) {
        nsh nshVar;
        JSONArray jSONArray;
        String optString;
        JSONArray optJSONArray;
        List split$default;
        op opVar;
        str.getClass();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        y9w y9wVar = nsh.m;
        if (optJSONArray2 == null) {
            nshVar = null;
        } else {
            int length = optJSONArray2.length();
            HashMap hashMap = null;
            HashMap hashMap2 = null;
            HashMap hashMap3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i = 0;
            while (i < length) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                if (optJSONObject == null || (optString = optJSONObject.optString("name")) == null) {
                    jSONArray = optJSONArray2;
                } else {
                    jSONArray = optJSONArray2;
                    if (optString.equalsIgnoreCase("other")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        hashMap = y9w.M(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        hashMap2 = y9w.M(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str4 = optJSONObject.optString("recovery_message", null);
                        hashMap3 = y9w.M(optJSONObject);
                    }
                }
                i++;
                optJSONArray2 = jSONArray;
            }
            nshVar = new nsh(hashMap, hashMap2, hashMap3, str2, str3, str4);
        }
        if (nshVar == null) {
            nshVar = y9wVar.m();
        }
        nsh nshVar2 = nshVar;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString2 = jSONObject.optString("gdpv4_nux_content", "");
        optString2.getClass();
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        yzq yzqVar = yzq.Enabled;
        long optLong = jSONObject.optLong("seamless_login");
        EnumSet noneOf = EnumSet.noneOf(yzq.class);
        Iterator it = yzq.e.iterator();
        while (it.hasNext()) {
            yzq yzqVar2 = (yzq) it.next();
            if ((yzqVar2.a & optLong) != 0) {
                noneOf.add(yzqVar2);
            }
        }
        noneOf.getClass();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap hashMap4 = new HashMap();
        if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("data")) != null) {
            int length2 = optJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                optJSONObject3.getClass();
                String optString3 = optJSONObject3.optString("name");
                if (!gvt.D(optString3)) {
                    optString3.getClass();
                    split$default = StringsKt__StringsKt.split$default(optString3, new String[]{"|"}, false, 0, 6, null);
                    if (split$default.size() == 2) {
                        String str5 = (String) CollectionsKt.Q(split$default);
                        String str6 = (String) CollectionsKt.Y(split$default);
                        if (gvt.D(str5) || gvt.D(str6)) {
                            opVar = null;
                        } else {
                            String optString4 = optJSONObject3.optString("url");
                            if (!gvt.D(optString4)) {
                                Uri.parse(optString4);
                            }
                            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("versions");
                            if (optJSONArray4 != null) {
                                int length3 = optJSONArray4.length();
                                int[] iArr = new int[length3];
                                for (int i3 = 0; i3 < length3; i3++) {
                                    int i4 = -1;
                                    int optInt3 = optJSONArray4.optInt(i3, -1);
                                    if (optInt3 == -1) {
                                        String optString5 = optJSONArray4.optString(i3);
                                        if (!gvt.D(optString5)) {
                                            try {
                                                optString5.getClass();
                                                i4 = Integer.parseInt(optString5);
                                            } catch (NumberFormatException unused) {
                                                HashSet hashSet = j3c.a;
                                            }
                                            optInt3 = i4;
                                        }
                                    }
                                    iArr[i3] = optInt3;
                                }
                            }
                            opVar = new op(str5, str6, false);
                        }
                        if (opVar == null) {
                            String str7 = opVar.a;
                            Map map = (Map) hashMap4.get(str7);
                            if (map == null) {
                                map = new HashMap();
                                hashMap4.put(str7, map);
                            }
                            map.put(opVar.b, opVar);
                        }
                    }
                }
                opVar = null;
                if (opVar == null) {
                }
            }
        }
        String optString6 = jSONObject.optString("smart_login_bookmark_icon_url");
        optString6.getClass();
        String optString7 = jSONObject.optString("smart_login_menu_icon_url");
        optString7.getClass();
        String optString8 = jSONObject.optString("sdk_update_message");
        optString8.getClass();
        n8c n8cVar = new n8c(optBoolean, optString2, optInt2, noneOf, hashMap4, z, nshVar2, optString6, optString7, z2, z3, optJSONArray3, optString8, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        b.put(str, n8cVar);
        return n8cVar;
    }

    public static final n8c f(String str, boolean z) {
        str.getClass();
        if (!z) {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                return (n8c) concurrentHashMap.get(str);
            }
        }
        n8c d2 = d(str, a(str));
        if (str.equals(j3c.c())) {
            c.set(o8c.c);
            f.e();
        }
        return d2;
    }

    public final synchronized void e() {
        o8c o8cVar = (o8c) c.get();
        if (o8c.a != o8cVar && o8c.b != o8cVar) {
            n8c n8cVar = (n8c) b.get(j3c.c());
            Handler handler = new Handler(Looper.getMainLooper());
            if (o8c.d == o8cVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = d;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new p8c((st0) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = d;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new p8c((st0) concurrentLinkedQueue2.poll(), n8cVar));
                    }
                }
            }
        }
    }
}
