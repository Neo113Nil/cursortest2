package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2559Ei implements InterfaceC2508Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25398a;

    /* renamed from: b, reason: collision with root package name */
    public final C2786Ro f25399b;

    public /* synthetic */ C2559Ei(C2786Ro c2786Ro, int i) {
        this.f25398a = i;
        this.f25399b = c2786Ro;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Bi
    public final void a(HashMap hashMap) {
        char c9;
        switch (this.f25398a) {
            case 0:
                String str = (String) hashMap.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 97520651) {
                        if (hashCode == 109399814 && str.equals("shake")) {
                            c9 = 0;
                        }
                        c9 = 65535;
                    } else {
                        if (str.equals("flick")) {
                            c9 = 1;
                        }
                        c9 = 65535;
                    }
                    C2786Ro c2786Ro = this.f25399b;
                    if (c9 == 0) {
                        c2786Ro.h(EnumC2735Oo.f27441u, true);
                        break;
                    } else if (c9 == 1) {
                        c2786Ro.h(EnumC2735Oo.f27442v, true);
                        break;
                    } else {
                        c2786Ro.h(EnumC2735Oo.f27440n, true);
                        break;
                    }
                }
                break;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f25399b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
