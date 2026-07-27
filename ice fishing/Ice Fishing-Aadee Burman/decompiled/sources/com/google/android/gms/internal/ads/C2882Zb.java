package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2882Zb implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f28890n = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f28891u = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f17906p);
        boolean equals = "tick".equals(str);
        Pattern pattern = f28890n;
        if (!equals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    int i = u2.z.f41319b;
                    v2.i.f("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32032H2)).booleanValue() || f28891u.matcher(str2).matches()) {
                    ((C3785qa) interfaceC4061vh.m().f2798v).c("e", str2);
                    return;
                } else {
                    int i6 = u2.z.f41319b;
                    v2.i.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i9 = u2.z.f41319b;
                    v2.i.f("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i10 = u2.z.f41319b;
                    v2.i.f("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32032H2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((C3785qa) interfaceC4061vh.m().f2798v).c(str3, str4);
                    return;
                } else {
                    int i11 = u2.z.f41319b;
                    v2.i.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get(com.anythink.expressad.foundation.d.d.f18596u);
        if (TextUtils.isEmpty(str5)) {
            int i12 = u2.z.f41319b;
            v2.i.f("No label given for CSI tick.");
            return;
        }
        C3301ha c3301ha = AbstractC3569ma.f32032H2;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i13 = u2.z.f41319b;
            v2.i.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i14 = u2.z.f41319b;
            v2.i.f("No timestamp given for CSI tick.");
            return;
        }
        try {
            long parseLong = Long.parseLong(str7);
            C4835j c4835j = C4835j.f39730C;
            c4835j.f39742k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c4835j.f39742k.getClass();
            long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i15 = u2.z.f41319b;
                v2.i.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            S0.l m4 = interfaceC4061vh.m();
            HashMap hashMap = (HashMap) m4.f2797u;
            C3677oa c3677oa = (C3677oa) hashMap.get(str6);
            String[] strArr = {str5};
            if (c3677oa != null) {
                ((C3785qa) m4.f2798v).a(c3677oa, elapsedRealtime, strArr);
            }
            hashMap.put(str5, new C3677oa(elapsedRealtime, null, null));
        } catch (NumberFormatException e9) {
            int i16 = u2.z.f41319b;
            v2.i.g("Malformed timestamp for CSI tick.", e9);
        }
    }
}
