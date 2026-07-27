package e1;

import X0.v;
import android.graphics.Path;
import d1.C4443a;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37157a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37159c;

    /* renamed from: d, reason: collision with root package name */
    public final C4443a f37160d;

    /* renamed from: e, reason: collision with root package name */
    public final C4443a f37161e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37162f;

    public l(String str, boolean z3, Path.FillType fillType, C4443a c4443a, C4443a c4443a2, boolean z6) {
        this.f37159c = str;
        this.f37157a = z3;
        this.f37158b = fillType;
        this.f37160d = c4443a;
        this.f37161e = c4443a2;
        this.f37162f = z6;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new Z0.g(vVar, abstractC4498a, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f37157a + '}';
    }
}
