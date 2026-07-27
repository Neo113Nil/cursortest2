package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4026un {

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f34651b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f34652c;

    /* renamed from: d, reason: collision with root package name */
    public final C3165eo f34653d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34654e;

    /* renamed from: f, reason: collision with root package name */
    public final C3348i7 f34655f;

    /* renamed from: g, reason: collision with root package name */
    public final C5107a f34656g;
    public final C2834Vp i;

    /* renamed from: j, reason: collision with root package name */
    public final Av f34658j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC2949aq f34659k;

    /* renamed from: l, reason: collision with root package name */
    public final C3280gu f34660l;

    /* renamed from: m, reason: collision with root package name */
    public C3999uD f34661m;

    /* renamed from: a, reason: collision with root package name */
    public final C3757pn f34650a = new C3757pn();

    /* renamed from: h, reason: collision with root package name */
    public final C2871Yb f34657h = new C2871Yb();

    public C4026un(CallableC3972tn callableC3972tn) {
        this.f34652c = callableC3972tn.f34461b;
        this.f34654e = callableC3972tn.f34464e;
        this.f34655f = callableC3972tn.f34465f;
        this.f34656g = callableC3972tn.f34466g;
        this.f34651b = callableC3972tn.f34460a;
        this.i = callableC3972tn.f34463d;
        this.f34658j = callableC3972tn.f34467h;
        this.f34653d = callableC3972tn.f34462c;
        this.f34659k = callableC3972tn.i;
        this.f34660l = callableC3972tn.f34468j;
    }

    public final synchronized J3.a a(String str, JSONObject jSONObject) {
        C3999uD c3999uD = this.f34661m;
        if (c3999uD == null) {
            return OD.f26665u;
        }
        return C3686oN.y(c3999uD, new C2624Jj(this, str, jSONObject, 2), this.f34654e);
    }

    public final synchronized void b(String str, InterfaceC2990bc interfaceC2990bc) {
        C3999uD c3999uD = this.f34661m;
        if (c3999uD == null) {
            return;
        }
        C3811qn c3811qn = new C3811qn(this, str, interfaceC2990bc, 0);
        c3999uD.c(new MD(0, c3999uD, c3811qn), this.f34654e);
    }

    public final synchronized void c(String str, InterfaceC2990bc interfaceC2990bc) {
        C3999uD c3999uD = this.f34661m;
        if (c3999uD == null) {
            return;
        }
        C3811qn c3811qn = new C3811qn(this, str, interfaceC2990bc, 1);
        c3999uD.c(new MD(0, c3999uD, c3811qn), this.f34654e);
    }

    public final synchronized void d(Map map) {
        C3999uD c3999uD = this.f34661m;
        if (c3999uD == null) {
            return;
        }
        C3562m7 c3562m7 = new C3562m7(this, map);
        c3999uD.c(new MD(0, c3999uD, c3562m7), this.f34654e);
    }
}
