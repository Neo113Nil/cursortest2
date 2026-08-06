package defpackage;

/* loaded from: classes.dex */
public class og1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater oh6vYeIP = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.og1.class, "_size$volatile");
    public defpackage.ku[] IHQe1A4L2xu;
    private volatile /* synthetic */ int _size$volatile;

    public final void F7NU4MC0GW(int i, int i2) {
        defpackage.ku[] kuVarArr = this.IHQe1A4L2xu;
        kuVarArr.getClass();
        defpackage.ku kuVar = kuVarArr[i2];
        kuVar.getClass();
        defpackage.ku kuVar2 = kuVarArr[i];
        kuVar2.getClass();
        kuVarArr[i] = kuVar;
        kuVarArr[i2] = kuVar2;
        kuVar.xiZrDbcSW0 = i;
        kuVar2.xiZrDbcSW0 = i2;
    }

    public final void IHQe1A4L2xu(defpackage.ku kuVar) {
        kuVar.F7NU4MC0GW((defpackage.lu) this);
        defpackage.ku[] kuVarArr = this.IHQe1A4L2xu;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = oh6vYeIP;
        if (kuVarArr == null) {
            kuVarArr = new defpackage.ku[4];
            this.IHQe1A4L2xu = kuVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= kuVarArr.length) {
            kuVarArr = (defpackage.ku[]) java.util.Arrays.copyOf(kuVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.IHQe1A4L2xu = kuVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        kuVarArr[i] = kuVar;
        kuVar.xiZrDbcSW0 = i;
        r1MBDhnF(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ku oh6vYeIP(int i) {
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        objArr.getClass();
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = oh6vYeIP;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            F7NU4MC0GW(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                defpackage.ku kuVar = objArr[i];
                kuVar.getClass();
                java.lang.Object obj = objArr[i2];
                obj.getClass();
                if (kuVar.compareTo(obj) < 0) {
                    F7NU4MC0GW(i, i2);
                    r1MBDhnF(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                java.lang.Object[] objArr2 = this.IHQe1A4L2xu;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    java.lang.Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    java.lang.Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                java.lang.Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                java.lang.Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                F7NU4MC0GW(i, i5);
                i = i5;
            }
        }
        defpackage.ku kuVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        kuVar2.getClass();
        kuVar2.F7NU4MC0GW(null);
        kuVar2.xiZrDbcSW0 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return kuVar2;
    }

    public final void r1MBDhnF(int i) {
        while (i > 0) {
            defpackage.ku[] kuVarArr = this.IHQe1A4L2xu;
            kuVarArr.getClass();
            int i2 = (i - 1) / 2;
            defpackage.ku kuVar = kuVarArr[i2];
            kuVar.getClass();
            defpackage.ku kuVar2 = kuVarArr[i];
            kuVar2.getClass();
            if (kuVar.compareTo(kuVar2) <= 0) {
                return;
            }
            F7NU4MC0GW(i, i2);
            i = i2;
        }
    }
}
