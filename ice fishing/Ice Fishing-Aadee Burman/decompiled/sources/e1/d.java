package e1;

import X0.v;
import android.graphics.Path;
import d1.C4443a;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37111a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37112b;

    /* renamed from: c, reason: collision with root package name */
    public final C4443a f37113c;

    /* renamed from: d, reason: collision with root package name */
    public final C4443a f37114d;

    /* renamed from: e, reason: collision with root package name */
    public final C4443a f37115e;

    /* renamed from: f, reason: collision with root package name */
    public final C4443a f37116f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37117g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37118h;

    public d(String str, int i, Path.FillType fillType, C4443a c4443a, C4443a c4443a2, C4443a c4443a3, C4443a c4443a4, boolean z3) {
        this.f37111a = i;
        this.f37112b = fillType;
        this.f37113c = c4443a;
        this.f37114d = c4443a2;
        this.f37115e = c4443a3;
        this.f37116f = c4443a4;
        this.f37117g = str;
        this.f37118h = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new Z0.h(vVar, iVar, abstractC4498a, this);
    }
}
