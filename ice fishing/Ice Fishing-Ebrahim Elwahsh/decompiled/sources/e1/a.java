package e1;

import X0.v;
import d1.C4455a;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37235a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.e f37236b;

    /* renamed from: c, reason: collision with root package name */
    public final C4455a f37237c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37239e;

    public a(String str, d1.e eVar, C4455a c4455a, boolean z8, boolean z9) {
        this.f37235a = str;
        this.f37236b = eVar;
        this.f37237c = c4455a;
        this.f37238d = z8;
        this.f37239e = z9;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new Z0.f(vVar, abstractC4490a, this);
    }
}
