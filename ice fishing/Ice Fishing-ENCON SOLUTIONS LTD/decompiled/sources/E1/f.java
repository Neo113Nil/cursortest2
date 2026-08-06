package E1;

import h1.C0239i;
import i1.AbstractC0252i;
import java.util.ArrayList;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final l1.i f321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f323c;

    public f(l1.i iVar, int i2, int i3) {
        this.f321a = iVar;
        this.f322b = i2;
        this.f323c = i3;
    }

    public abstract Object a(C1.r rVar, l1.d dVar);

    public abstract f b(l1.i iVar, int i2, int i3);

    @Override // E1.j
    public final D1.d o(l1.i iVar, int i2, int i3) {
        l1.i iVar2 = this.f321a;
        l1.i l2 = iVar.l(iVar2);
        int i4 = this.f323c;
        int i5 = this.f322b;
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
        return (kotlin.jvm.internal.i.a(l2, iVar2) && i2 == i5 && i3 == i4) ? this : b(l2, i2, i3);
    }

    @Override // D1.d
    public Object r(D1.e eVar, l1.d dVar) {
        d dVar2 = new d(eVar, this, null);
        F1.t tVar = new F1.t(dVar, dVar.getContext());
        Object I2 = R1.d.I(tVar, tVar, dVar2);
        return I2 == EnumC0985a.f8194a ? I2 : C0239i.f3393a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        l1.j jVar = l1.j.f8138a;
        l1.i iVar = this.f321a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f322b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f323c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + AbstractC0252i.K(arrayList, ", ", null, null, null, 62) + ']';
    }
}
