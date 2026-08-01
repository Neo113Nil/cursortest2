package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2502Cf implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24180a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f24181b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f24182c;

    public /* synthetic */ C2502Cf(C3351iN c3351iN, C3351iN c3351iN2, int i) {
        this.f24180a = i;
        this.f24181b = c3351iN;
        this.f24182c = c3351iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24180a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC2485Bf((Context) this.f24181b.f31039a, (C5069B) this.f24182c.f31039a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f24181b.f31039a;
                C2949ay c2949ay = (C2949ay) this.f24182c.f31039a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                u1.h.i(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new C3755py(executorService, sb.toString(), c2949ay.a0());
            case 2:
                return new C3660oA((Context) this.f24181b.f31039a, (ExecutorService) this.f24182c.f31039a);
            default:
                return new C3821rA((Context) this.f24181b.f31039a, (ExecutorService) this.f24182c.f31039a);
        }
    }
}
