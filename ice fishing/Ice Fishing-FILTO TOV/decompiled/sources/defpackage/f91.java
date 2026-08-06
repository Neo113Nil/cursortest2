package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class f91 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Yi7zF1RB1 = AtomicIntegerFieldUpdater.newUpdater(f91.class, "_size$volatile");
    public tq[] GWasM1elztuh;
    private volatile /* synthetic */ int _size$volatile;

    public final void GWasM1elztuh(tq tqVar) {
        tqVar.xqGvceK5x((uq) this);
        tq[] tqVarArr = this.GWasM1elztuh;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Yi7zF1RB1;
        if (tqVarArr == null) {
            tqVarArr = new tq[4];
            this.GWasM1elztuh = tqVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tqVarArr.length) {
            tqVarArr = (tq[]) Arrays.copyOf(tqVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.GWasM1elztuh = tqVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tqVarArr[i] = tqVar;
        tqVar.EljAMC1QTz = i;
        X1lG3V04pd(i);
    }

    public final void X1lG3V04pd(int i) {
        while (i > 0) {
            tq[] tqVarArr = this.GWasM1elztuh;
            tqVarArr.getClass();
            int i2 = (i - 1) / 2;
            tq tqVar = tqVarArr[i2];
            tqVar.getClass();
            tq tqVar2 = tqVarArr[i];
            tqVar2.getClass();
            if (tqVar.compareTo(tqVar2) <= 0) {
                return;
            }
            xqGvceK5x(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tq Yi7zF1RB1(int i) {
        Object[] objArr = this.GWasM1elztuh;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Yi7zF1RB1;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            xqGvceK5x(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                tq tqVar = objArr[i];
                tqVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (tqVar.compareTo(obj) < 0) {
                    xqGvceK5x(i, i2);
                    X1lG3V04pd(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.GWasM1elztuh;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                xqGvceK5x(i, i5);
                i = i5;
            }
        }
        tq tqVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        tqVar2.getClass();
        tqVar2.xqGvceK5x(null);
        tqVar2.EljAMC1QTz = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return tqVar2;
    }

    public final void xqGvceK5x(int i, int i2) {
        tq[] tqVarArr = this.GWasM1elztuh;
        tqVarArr.getClass();
        tq tqVar = tqVarArr[i2];
        tqVar.getClass();
        tq tqVar2 = tqVarArr[i];
        tqVar2.getClass();
        tqVarArr[i] = tqVar;
        tqVarArr[i2] = tqVar2;
        tqVar.EljAMC1QTz = i;
        tqVar2.EljAMC1QTz = i2;
    }
}
