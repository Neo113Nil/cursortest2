package g1;

import Z0.v;
import android.graphics.Path;
import b1.InterfaceC0519c;
import f1.C4515a;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37633a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37634b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37635c;

    /* renamed from: d, reason: collision with root package name */
    public final C4515a f37636d;

    /* renamed from: e, reason: collision with root package name */
    public final C4515a f37637e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37638f;

    public l(String str, boolean z6, Path.FillType fillType, C4515a c4515a, C4515a c4515a2, boolean z9) {
        this.f37635c = str;
        this.f37633a = z6;
        this.f37634b = fillType;
        this.f37636d = c4515a;
        this.f37637e = c4515a2;
        this.f37638f = z9;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new b1.g(vVar, abstractC4563a, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f37633a + '}';
    }
}
