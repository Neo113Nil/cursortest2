package g1;

import Z0.v;
import b1.C0520d;
import b1.InterfaceC0519c;
import h1.AbstractC4563a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37639a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37640b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37641c;

    public m(String str, List list, boolean z6) {
        this.f37639a = str;
        this.f37640b = list;
        this.f37641c = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new C0520d(vVar, abstractC4563a, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f37639a + "' Shapes: " + Arrays.toString(this.f37640b.toArray()) + '}';
    }
}
