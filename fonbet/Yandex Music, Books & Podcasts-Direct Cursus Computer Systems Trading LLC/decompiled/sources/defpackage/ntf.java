package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ntf extends xci implements ipa {
    public b o;

    @Override // defpackage.xci
    public final void K0() {
        this.o.j = this;
    }

    @Override // defpackage.xci
    public final void L0() {
        b bVar = this.o;
        bVar.e();
        bVar.b = null;
        bVar.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntf) && Intrinsics.d(this.o, ((ntf) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        ou3 ou3Var = opfVar.a;
        ArrayList arrayList = this.o.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ltf ltfVar = (ltf) arrayList.get(i);
            xod xodVar = ltfVar.n;
            if (xodVar != null) {
                long j = ltfVar.m;
                long j2 = xodVar.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
                ((xzi) ou3Var.b.b).m0(f, f2);
                try {
                    yd5.s(opfVar, xodVar);
                } finally {
                    ((xzi) ou3Var.b.b).m0(-f, -f2);
                }
            }
        }
        opfVar.a();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + ')';
    }
}
