package e1;

import X0.v;
import d1.C4443a;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37104a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.f f37105b;

    /* renamed from: c, reason: collision with root package name */
    public final C4443a f37106c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37107d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37108e;

    public a(String str, d1.f fVar, C4443a c4443a, boolean z3, boolean z6) {
        this.f37104a = str;
        this.f37105b = fVar;
        this.f37106c = c4443a;
        this.f37107d = z3;
        this.f37108e = z6;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new Z0.f(vVar, abstractC4498a, this);
    }
}
