package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import w.AbstractC5128c;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2522Cf implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24915a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f24916b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f24917c;

    public /* synthetic */ C2522Cf(C3374iN c3374iN, C3374iN c3374iN2, int i) {
        this.f24915a = i;
        this.f24916b = c3374iN;
        this.f24917c = c3374iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f24915a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC2505Bf((Context) this.f24916b.f31812a, (C5140B) this.f24917c.f31812a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f24916b.f31812a;
                C2972ay c2972ay = (C2972ay) this.f24917c.f31812a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                AbstractC5128c.h(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new C3778py(executorService, sb.toString(), c2972ay.a0());
            case 2:
                return new C3683oA((Context) this.f24916b.f31812a, (ExecutorService) this.f24917c.f31812a);
            default:
                return new C3844rA((Context) this.f24916b.f31812a, (ExecutorService) this.f24917c.f31812a);
        }
    }
}
