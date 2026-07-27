package e1;

import X0.v;
import android.graphics.Path;
import d1.C4455a;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37288a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37289b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37290c;

    /* renamed from: d, reason: collision with root package name */
    public final C4455a f37291d;

    /* renamed from: e, reason: collision with root package name */
    public final C4455a f37292e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37293f;

    public l(String str, boolean z8, Path.FillType fillType, C4455a c4455a, C4455a c4455a2, boolean z9) {
        this.f37290c = str;
        this.f37288a = z8;
        this.f37289b = fillType;
        this.f37291d = c4455a;
        this.f37292e = c4455a2;
        this.f37293f = z9;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new Z0.g(vVar, abstractC4490a, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f37288a + '}';
    }
}
