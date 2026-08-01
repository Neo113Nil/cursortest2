package e1;

import X0.v;
import Z0.s;
import d1.C4443a;
import d1.C4444b;
import f1.AbstractC4498a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37170a;

    /* renamed from: b, reason: collision with root package name */
    public final C4444b f37171b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37172c;

    /* renamed from: d, reason: collision with root package name */
    public final C4443a f37173d;

    /* renamed from: e, reason: collision with root package name */
    public final C4443a f37174e;

    /* renamed from: f, reason: collision with root package name */
    public final C4444b f37175f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37176g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37177h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f37178j;

    public o(String str, C4444b c4444b, ArrayList arrayList, C4443a c4443a, C4443a c4443a2, C4444b c4444b2, int i, int i6, float f3, boolean z3) {
        this.f37170a = str;
        this.f37171b = c4444b;
        this.f37172c = arrayList;
        this.f37173d = c4443a;
        this.f37174e = c4443a2;
        this.f37175f = c4444b2;
        this.f37176g = i;
        this.f37177h = i6;
        this.i = f3;
        this.f37178j = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new s(vVar, abstractC4498a, this);
    }
}
