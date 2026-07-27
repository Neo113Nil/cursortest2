package e1;

import X0.v;
import f1.AbstractC4498a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37163a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37164b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37165c;

    public m(String str, List list, boolean z3) {
        this.f37163a = str;
        this.f37164b = list;
        this.f37165c = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new Z0.d(vVar, abstractC4498a, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f37163a + "' Shapes: " + Arrays.toString(this.f37164b.toArray()) + '}';
    }
}
