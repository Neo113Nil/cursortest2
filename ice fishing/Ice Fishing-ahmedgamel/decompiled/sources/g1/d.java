package g1;

import Z0.v;
import android.graphics.Path;
import b1.InterfaceC0519c;
import f1.C4515a;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37587a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37588b;

    /* renamed from: c, reason: collision with root package name */
    public final C4515a f37589c;

    /* renamed from: d, reason: collision with root package name */
    public final C4515a f37590d;

    /* renamed from: e, reason: collision with root package name */
    public final C4515a f37591e;

    /* renamed from: f, reason: collision with root package name */
    public final C4515a f37592f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37593g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37594h;

    public d(String str, int i, Path.FillType fillType, C4515a c4515a, C4515a c4515a2, C4515a c4515a3, C4515a c4515a4, boolean z6) {
        this.f37587a = i;
        this.f37588b = fillType;
        this.f37589c = c4515a;
        this.f37590d = c4515a2;
        this.f37591e = c4515a3;
        this.f37592f = c4515a4;
        this.f37593g = str;
        this.f37594h = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new b1.h(vVar, iVar, abstractC4563a, this);
    }
}
