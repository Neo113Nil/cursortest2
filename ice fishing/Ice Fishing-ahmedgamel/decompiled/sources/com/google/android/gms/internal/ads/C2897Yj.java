package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2897Yj implements InterfaceC3013bl, InterfaceC2664Kl {

    /* renamed from: n, reason: collision with root package name */
    public C3 f29489n;

    /* renamed from: v, reason: collision with root package name */
    public final Context f29491v;

    /* renamed from: w, reason: collision with root package name */
    public final Wu f29492w;

    /* renamed from: x, reason: collision with root package name */
    public final C5189a f29493x;

    /* renamed from: y, reason: collision with root package name */
    public final RD f29494y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29495z = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f29488A = false;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f29490u = new AtomicBoolean();

    public C2897Yj(Context context, Wu wu, C5189a c5189a, RD rd) {
        this.f29491v = context;
        this.f29492w = wu;
        this.f29493x = c5189a;
        this.f29494y = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C3 c32;
        P3.a aVar;
        int i;
        int i4;
        C3112dd l9;
        boolean andSet = this.f29490u.getAndSet(true);
        RD rd = this.f29494y;
        if (!andSet) {
            if (!((Boolean) AbstractC2738Pa.f27623o.r()).booleanValue()) {
                i = 3;
                if (!((Boolean) AbstractC2738Pa.f27624p.r()).booleanValue()) {
                    if (((Boolean) AbstractC2738Pa.f27622n.r()).booleanValue()) {
                        try {
                            String optString = new JSONObject(C4906k.f40186C.f40196h.g().n().f29694e).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i4 = i - 1;
                Wu wu = this.f29492w;
                Context context = this.f29491v;
                if (i4 != 1) {
                    l9 = C4906k.f40186C.f40205r.l(context, C5189a.a(), wu);
                } else if (i4 == 2) {
                    l9 = C4906k.f40186C.f40205r.c(context, C5189a.a(), wu);
                }
                C2889Yb c2889Yb = AbstractC3066cl.f30344C;
                this.f29489n = new C3(context, l9.a("google.afma.sdkConstants.getSdkConstants", c2889Yb, c2889Yb), this.f29493x, rd);
                this.f29495z = true;
            }
            i = 2;
            i4 = i - 1;
            Wu wu2 = this.f29492w;
            Context context2 = this.f29491v;
            if (i4 != 1) {
            }
            C2889Yb c2889Yb2 = AbstractC3066cl.f30344C;
            this.f29489n = new C3(context2, l9.a("google.afma.sdkConstants.getSdkConstants", c2889Yb2, c2889Yb2), this.f29493x, rd);
            this.f29495z = true;
        }
        if (this.f29495z && (c32 = this.f29489n) != null) {
            if (!((Boolean) AbstractC2738Pa.f27610a.r()).booleanValue()) {
                aVar = c32.a();
            } else if (((AtomicBoolean) c32.f24788y).compareAndSet(false, true)) {
                P3.a a9 = c32.a();
                a9.a(new RunnableC3134e(16, c32), AbstractC3436jg.f32062h);
                aVar = a9;
            } else {
                aVar = ND.f27257u;
            }
            if (!this.f29488A && ((Boolean) AbstractC2619Ia.i.r()).booleanValue()) {
                aVar.a(new RunnableC3493kj(2, this), rd);
            }
            MA.f(aVar, "persistFlagsClient", AbstractC3436jg.f32062h);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    public final void b(String str) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    public final void c(E2.s sVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
        a();
    }
}
