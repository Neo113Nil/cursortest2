package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2874Yj implements InterfaceC2990bl, InterfaceC2627Jl {

    /* renamed from: n, reason: collision with root package name */
    public C3 f28714n;

    /* renamed from: v, reason: collision with root package name */
    public final Context f28716v;

    /* renamed from: w, reason: collision with root package name */
    public final Wu f28717w;

    /* renamed from: x, reason: collision with root package name */
    public final C5110a f28718x;

    /* renamed from: y, reason: collision with root package name */
    public final RD f28719y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28720z = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f28713A = false;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f28715u = new AtomicBoolean();

    public C2874Yj(Context context, Wu wu, C5110a c5110a, RD rd) {
        this.f28716v = context;
        this.f28717w = wu;
        this.f28718x = c5110a;
        this.f28719y = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
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
        N3.a aVar;
        int i;
        int i6;
        C3089dd m4;
        boolean andSet = this.f28715u.getAndSet(true);
        RD rd = this.f28719y;
        if (!andSet) {
            if (!((Boolean) AbstractC2718Pa.f26835o.r()).booleanValue()) {
                i = 3;
                if (!((Boolean) AbstractC2718Pa.f26836p.r()).booleanValue()) {
                    if (((Boolean) AbstractC2718Pa.f26834n.r()).booleanValue()) {
                        try {
                            String optString = new JSONObject(C4835j.f39730C.f39740h.g().n().f28917e).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i6 = i - 1;
                Wu wu = this.f28717w;
                Context context = this.f28716v;
                if (i6 != 1) {
                    m4 = C4835j.f39730C.f39749r.m(context, C5110a.a(), wu);
                } else if (i6 == 2) {
                    m4 = C4835j.f39730C.f39749r.c(context, C5110a.a(), wu);
                }
                C2866Yb c2866Yb = AbstractC3043cl.f29559C;
                this.f28714n = new C3(context, m4.a("google.afma.sdkConstants.getSdkConstants", c2866Yb, c2866Yb), this.f28718x, rd);
                this.f28720z = true;
            }
            i = 2;
            i6 = i - 1;
            Wu wu2 = this.f28717w;
            Context context2 = this.f28716v;
            if (i6 != 1) {
            }
            C2866Yb c2866Yb2 = AbstractC3043cl.f29559C;
            this.f28714n = new C3(context2, m4.a("google.afma.sdkConstants.getSdkConstants", c2866Yb2, c2866Yb2), this.f28718x, rd);
            this.f28720z = true;
        }
        if (this.f28720z && (c32 = this.f28714n) != null) {
            if (!((Boolean) AbstractC2718Pa.f26822a.r()).booleanValue()) {
                aVar = c32.a();
            } else if (((AtomicBoolean) c32.f24025y).compareAndSet(false, true)) {
                N3.a a9 = c32.a();
                a9.a(new RunnableC3111e(16, c32), AbstractC3413jg.f31275h);
                aVar = a9;
            } else {
                aVar = ND.f26473u;
            }
            if (!this.f28713A && ((Boolean) AbstractC2599Ia.i.r()).booleanValue()) {
                aVar.a(new RunnableC3470kj(2, this), rd);
            }
            MA.f(aVar, "persistFlagsClient", AbstractC3413jg.f31275h);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    public final void b(String str) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    public final void c(C2.t tVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
        a();
    }
}
