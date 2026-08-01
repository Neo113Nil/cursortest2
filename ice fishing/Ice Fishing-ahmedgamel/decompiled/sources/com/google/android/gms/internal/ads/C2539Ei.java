package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2539Ei implements InterfaceC2488Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24645a;

    /* renamed from: b, reason: collision with root package name */
    public final C2749Qo f24646b;

    public /* synthetic */ C2539Ei(C2749Qo c2749Qo, int i) {
        this.f24645a = i;
        this.f24646b = c2749Qo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2488Bi
    public final void a(HashMap hashMap) {
        char c9;
        switch (this.f24645a) {
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
                    C2749Qo c2749Qo = this.f24646b;
                    if (c9 == 0) {
                        c2749Qo.h(EnumC2698No.f26537u, true);
                        break;
                    } else if (c9 == 1) {
                        c2749Qo.h(EnumC2698No.f26538v, true);
                        break;
                    } else {
                        c2749Qo.h(EnumC2698No.f26536n, true);
                        break;
                    }
                }
                break;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f24646b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
