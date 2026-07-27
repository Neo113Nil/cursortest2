package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2587Hf implements InterfaceC3927t8 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f25335n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25336u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25337v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25338w;

    public C2587Hf(Context context, String str) {
        this.f25335n = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f25337v = str;
        this.f25338w = false;
        this.f25336u = new Object();
    }

    public final void a(boolean z3) {
        C4835j c4835j = C4835j.f39730C;
        C2621Jf c2621Jf = c4835j.f39756y;
        Context context = this.f25335n;
        if (c2621Jf.a(context)) {
            synchronized (this.f25336u) {
                try {
                    if (this.f25338w == z3) {
                        return;
                    }
                    this.f25338w = z3;
                    String str = this.f25337v;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f25338w) {
                        C2621Jf c2621Jf2 = c4835j.f39756y;
                        if (c2621Jf2.a(context)) {
                            c2621Jf2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C2621Jf c2621Jf3 = c4835j.f39756y;
                        if (c2621Jf3.a(context)) {
                            c2621Jf3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        a(c3873s8.f33899j);
    }
}
