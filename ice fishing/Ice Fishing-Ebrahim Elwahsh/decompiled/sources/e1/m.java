package e1;

import X0.v;
import f1.AbstractC4490a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37294a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37295b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37296c;

    public m(String str, List list, boolean z8) {
        this.f37294a = str;
        this.f37295b = list;
        this.f37296c = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new Z0.d(vVar, abstractC4490a, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f37294a + "' Shapes: " + Arrays.toString(this.f37295b.toArray()) + '}';
    }
}
