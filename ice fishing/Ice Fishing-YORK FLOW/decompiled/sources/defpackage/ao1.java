package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class ao1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater giKS3J6vZuNy = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.ao1.class, "_size$volatile");
    public defpackage.yv[] ZpBGe2uQfcn8;
    private volatile /* synthetic */ int _size$volatile;

    public final void JhCgjQRTAOCT(int i, int i2) {
        defpackage.yv[] yvVarArr = this.ZpBGe2uQfcn8;
        yvVarArr.getClass();
        defpackage.yv yvVar = yvVarArr[i2];
        yvVar.getClass();
        defpackage.yv yvVar2 = yvVarArr[i];
        yvVar2.getClass();
        yvVarArr[i] = yvVar;
        yvVarArr[i2] = yvVar2;
        yvVar.oh71FJcDz6S2 = i;
        yvVar2.oh71FJcDz6S2 = i2;
    }

    public final void ZpBGe2uQfcn8(defpackage.yv yvVar) {
        yvVar.JhCgjQRTAOCT((defpackage.zv) this);
        defpackage.yv[] yvVarArr = this.ZpBGe2uQfcn8;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = giKS3J6vZuNy;
        if (yvVarArr == null) {
            yvVarArr = new defpackage.yv[4];
            this.ZpBGe2uQfcn8 = yvVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= yvVarArr.length) {
            yvVarArr = (defpackage.yv[]) java.util.Arrays.copyOf(yvVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.ZpBGe2uQfcn8 = yvVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        yvVarArr[i] = yvVar;
        yvVar.oh71FJcDz6S2 = i;
        fWTAfUmVKrZq(i);
    }

    public final void fWTAfUmVKrZq(int i) {
        while (i > 0) {
            defpackage.yv[] yvVarArr = this.ZpBGe2uQfcn8;
            yvVarArr.getClass();
            int i2 = (i - 1) / 2;
            defpackage.yv yvVar = yvVarArr[i2];
            yvVar.getClass();
            defpackage.yv yvVar2 = yvVarArr[i];
            yvVar2.getClass();
            if (yvVar.compareTo(yvVar2) <= 0) {
                return;
            }
            JhCgjQRTAOCT(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.yv giKS3J6vZuNy(int i) {
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        objArr.getClass();
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = giKS3J6vZuNy;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            JhCgjQRTAOCT(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                defpackage.yv yvVar = objArr[i];
                yvVar.getClass();
                java.lang.Object obj = objArr[i2];
                obj.getClass();
                if (yvVar.compareTo(obj) < 0) {
                    JhCgjQRTAOCT(i, i2);
                    fWTAfUmVKrZq(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                java.lang.Object[] objArr2 = this.ZpBGe2uQfcn8;
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
                JhCgjQRTAOCT(i, i5);
                i = i5;
            }
        }
        defpackage.yv yvVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        yvVar2.getClass();
        yvVar2.JhCgjQRTAOCT(null);
        yvVar2.oh71FJcDz6S2 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return yvVar2;
    }
}
