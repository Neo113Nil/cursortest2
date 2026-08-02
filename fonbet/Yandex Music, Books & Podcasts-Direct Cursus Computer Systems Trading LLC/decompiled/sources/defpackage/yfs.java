package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public class yfs {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(yfs.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public pib[] a;

    public final void a(pib pibVar) {
        pibVar.d((qib) this);
        pib[] pibVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (pibVarArr == null) {
            pibVarArr = new pib[4];
            this.a = pibVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= pibVarArr.length) {
            pibVarArr = (pib[]) Arrays.copyOf(pibVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = pibVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        pibVarArr[i] = pibVar;
        pibVar.b = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pib b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                pib pibVar = objArr[i];
                pibVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (pibVar.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
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
                d(i, i5);
                i = i5;
            }
        }
        pib pibVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        pibVar2.getClass();
        pibVar2.d(null);
        pibVar2.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return pibVar2;
    }

    public final void c(int i) {
        while (i > 0) {
            pib[] pibVarArr = this.a;
            pibVarArr.getClass();
            int i2 = (i - 1) / 2;
            pib pibVar = pibVarArr[i2];
            pibVar.getClass();
            pib pibVar2 = pibVarArr[i];
            pibVar2.getClass();
            if (pibVar.compareTo(pibVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        pib[] pibVarArr = this.a;
        pibVarArr.getClass();
        pib pibVar = pibVarArr[i2];
        pibVar.getClass();
        pib pibVar2 = pibVarArr[i];
        pibVar2.getClass();
        pibVarArr[i] = pibVar;
        pibVarArr[i2] = pibVar2;
        pibVar.b = i;
        pibVar2.b = i2;
    }
}
