package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2607Hf implements InterfaceC3950t8 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f26088n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26089u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26090v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26091w;

    public C2607Hf(Context context, String str) {
        this.f26088n = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f26090v = str;
        this.f26091w = false;
        this.f26089u = new Object();
    }

    public final void a(boolean z6) {
        C4906k c4906k = C4906k.f40186C;
        C2641Jf c2641Jf = c4906k.f40212y;
        Context context = this.f26088n;
        if (c2641Jf.a(context)) {
            synchronized (this.f26089u) {
                try {
                    if (this.f26091w == z6) {
                        return;
                    }
                    this.f26091w = z6;
                    String str = this.f26090v;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f26091w) {
                        C2641Jf c2641Jf2 = c4906k.f40212y;
                        if (c2641Jf2.a(context)) {
                            c2641Jf2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C2641Jf c2641Jf3 = c4906k.f40212y;
                        if (c2641Jf3.a(context)) {
                            c2641Jf3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        a(c3896s8.f34667j);
    }
}
