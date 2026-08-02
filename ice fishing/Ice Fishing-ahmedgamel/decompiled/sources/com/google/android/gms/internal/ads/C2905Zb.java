package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2905Zb implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f29667n = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f29668u = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f18693p);
        boolean equals = "tick".equals(str);
        Pattern pattern = f29667n;
        if (!equals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    int i = w2.z.f41712b;
                    x2.i.f("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32812H2)).booleanValue() || f29668u.matcher(str2).matches()) {
                    ((C3808qa) interfaceC4084vh.m().f2927v).c("e", str2);
                    return;
                } else {
                    int i4 = w2.z.f41712b;
                    x2.i.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i6 = w2.z.f41712b;
                    x2.i.f("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i9 = w2.z.f41712b;
                    x2.i.f("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32812H2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((C3808qa) interfaceC4084vh.m().f2927v).c(str3, str4);
                    return;
                } else {
                    int i10 = w2.z.f41712b;
                    x2.i.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get(com.anythink.expressad.foundation.d.d.f19383u);
        if (TextUtils.isEmpty(str5)) {
            int i11 = w2.z.f41712b;
            x2.i.f("No label given for CSI tick.");
            return;
        }
        C3324ha c3324ha = AbstractC3592ma.f32812H2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i12 = w2.z.f41712b;
            x2.i.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i13 = w2.z.f41712b;
            x2.i.f("No timestamp given for CSI tick.");
            return;
        }
        try {
            long parseLong = Long.parseLong(str7);
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c4906k.f40198k.getClass();
            long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i14 = w2.z.f41712b;
                x2.i.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            S0.l m9 = interfaceC4084vh.m();
            HashMap hashMap = (HashMap) m9.f2926u;
            C3700oa c3700oa = (C3700oa) hashMap.get(str6);
            String[] strArr = {str5};
            if (c3700oa != null) {
                ((C3808qa) m9.f2927v).a(c3700oa, elapsedRealtime, strArr);
            }
            hashMap.put(str5, new C3700oa(elapsedRealtime, null, null));
        } catch (NumberFormatException e9) {
            int i15 = w2.z.f41712b;
            x2.i.g("Malformed timestamp for CSI tick.", e9);
        }
    }
}
