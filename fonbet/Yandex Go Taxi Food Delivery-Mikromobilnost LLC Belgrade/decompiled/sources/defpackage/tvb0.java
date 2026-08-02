package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class tvb0 {
    public final Float a;
    public final List b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tvb0(qzb0 qzb0Var) {
        this(r6, j73.A(new svb0[]{r1, r2, new svb0(Float.MAX_VALUE, r0)}));
        PinState pinState = qzb0Var.e;
        Float f = qzb0Var.d;
        svb0 svb0Var = new svb0(Float.NEGATIVE_INFINITY, PinState.INVISIBLE);
        svb0 svb0Var2 = null;
        if (f != null) {
            PinState pinState2 = PinState.DUST;
            Float f2 = pinState == pinState2 ? f : null;
            if (f2 != null) {
                svb0Var2 = new svb0(f2.floatValue(), pinState2);
            }
        }
    }

    public final PinState a(float f) {
        PinState pinState = d(f).b;
        Float f2 = this.a;
        return (f2 == null || f < f2.floatValue() || pinState != PinState.INVISIBLE) ? pinState : PinState.DUST;
    }

    public final svb0 b(float f) {
        for (svb0 svb0Var : this.b) {
            if (svb0Var.a >= f) {
                return svb0Var;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    public final tvb0 c() {
        Float f = this.a;
        if (f != null) {
            float floatValue = f.floatValue();
            svb0 d = d(floatValue);
            svb0 b = b(floatValue);
            if (d.b == PinState.INVISIBLE) {
                PinState pinState = b.b;
                PinState pinState2 = PinState.DUST;
                if (pinState == pinState2) {
                    List list = this.b;
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(list.indexOf(b), new svb0(floatValue, pinState2));
                    this = new tvb0(f, arrayList);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List list2 = this.b;
        int i = 1;
        int size = list2.size() - 1;
        while (i < size) {
            int i2 = i + 1;
            if (((svb0) list2.get(i - 1)).b == ((svb0) list2.get(i2)).b) {
                arrayList2.add(list2.get(i));
            }
            i = i2;
        }
        if (arrayList2.isEmpty()) {
            return this;
        }
        ArrayList arrayList3 = new ArrayList(list2);
        arrayList3.removeAll(arrayList2);
        return new tvb0(this.a, arrayList3);
    }

    public final svb0 d(float f) {
        List list = this.b;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            svb0 svb0Var = (svb0) listIterator.previous();
            if (svb0Var.a <= f) {
                return svb0Var;
            }
        }
        w511.i("List contains no element matching the predicate.");
        return null;
    }

    public final tvb0 e(qzb0 qzb0Var) {
        Float f;
        tvb0 tvb0Var;
        PinState pinState = qzb0Var.e;
        List list = this.b;
        PinState pinState2 = ((svb0) a.Z(list)).b;
        if (pinState2 != pinState) {
            int compareTo = pinState2.compareTo(pinState);
            Float f2 = this.a;
            if (compareTo < 0) {
                tvb0Var = new tvb0(f2, a.o0(a.K(list), new svb0(Float.MAX_VALUE, pinState)));
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((svb0) obj).b.compareTo(pinState) >= 0) {
                        break;
                    }
                    arrayList.add(obj);
                }
                tvb0Var = new tvb0(f2, a.o0(arrayList, new svb0(Float.MAX_VALUE, pinState)));
            }
            this = tvb0Var;
        }
        Float f3 = qzb0Var.d;
        if (f3 != null && ((f = this.a) == null || f3.floatValue() < f.floatValue())) {
            List list2 = this.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                svb0 svb0Var = (svb0) obj2;
                if (svb0Var.a < f3.floatValue() || (svb0Var.a >= f3.floatValue() && svb0Var.b.compareTo(PinState.DUST) >= 0)) {
                    arrayList2.add(obj2);
                }
            }
            this = new tvb0(f3, arrayList2);
        }
        return this.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvb0)) {
            return false;
        }
        tvb0 tvb0Var = (tvb0) obj;
        return jl40.l(this.a, tvb0Var.a) && jl40.l(this.b, tvb0Var.b);
    }

    public final int hashCode() {
        Float f = this.a;
        return this.b.hashCode() + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "PinComplexState(mustBeVisibleAtZoom=" + this.a + ", bounds=" + this.b + Extension.C_BRAKE;
    }

    public tvb0(Float f, List list) {
        this.a = f;
        this.b = list;
    }
}
