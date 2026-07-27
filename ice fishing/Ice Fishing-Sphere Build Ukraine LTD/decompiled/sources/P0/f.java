package P0;

import Q0.u;
import a.AbstractC0069a;
import java.util.ArrayList;
import t0.C0252g;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: e, reason: collision with root package name */
    public final v0.i f840e;

    /* renamed from: f, reason: collision with root package name */
    public final int f841f;

    /* renamed from: g, reason: collision with root package name */
    public final int f842g;

    public f(v0.i iVar, int i2, int i3) {
        this.f840e = iVar;
        this.f841f = i2;
        this.f842g = i3;
    }

    public abstract Object a(N0.p pVar, v0.d dVar);

    public abstract f b(v0.i iVar, int i2, int i3);

    @Override // O0.d
    public Object c(O0.e eVar, v0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.j());
        Object I2 = AbstractC0069a.I(uVar, uVar, dVar2);
        return I2 == w0.a.f3076e ? I2 : C0252g.f2994a;
    }

    @Override // P0.j
    public final O0.d h(v0.i iVar, int i2, int i3) {
        v0.i iVar2 = this.f840e;
        v0.i f2 = iVar.f(iVar2);
        int i4 = this.f842g;
        int i5 = this.f841f;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (E0.i.a(f2, iVar2) && i2 == i5 && i3 == i4) ? this : b(f2, i2, i3);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        v0.j jVar = v0.j.f3014e;
        v0.i iVar = this.f840e;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f841f;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f842g;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + u0.d.D(arrayList, ", ", null, null, null, 62) + ']';
    }
}
