package dd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import yc.p0;
import yc.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1893b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public p0[] f1894a;

    public final void a(p0 p0Var) {
        p0Var.d((q0) this);
        p0[] p0VarArr = this.f1894a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1893b;
        if (p0VarArr == null) {
            p0VarArr = new p0[4];
            this.f1894a = p0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= p0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(p0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            pc.j.d(copyOf, "copyOf(...)");
            p0VarArr = (p0[]) copyOf;
            this.f1894a = p0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        p0VarArr[i10] = p0Var;
        p0Var.f8891h = i10;
        c(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p0 b(int i10) {
        Object[] objArr = this.f1894a;
        pc.j.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1893b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                p0 p0Var = objArr[i10];
                pc.j.b(p0Var);
                Object obj = objArr[i11];
                pc.j.b(obj);
                if (p0Var.compareTo(obj) < 0) {
                    d(i10, i11);
                    c(i11);
                }
            }
            while (true) {
                int i12 = i10 * 2;
                int i13 = i12 + 1;
                if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f1894a;
                pc.j.b(objArr2);
                int i14 = i12 + 2;
                if (i14 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i14];
                    pc.j.b(comparable);
                    Object obj2 = objArr2[i13];
                    pc.j.b(obj2);
                }
                i14 = i13;
                Comparable comparable2 = objArr2[i10];
                pc.j.b(comparable2);
                Comparable comparable3 = objArr2[i14];
                pc.j.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i10, i14);
                i10 = i14;
            }
        }
        p0 p0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        pc.j.b(p0Var2);
        p0Var2.d(null);
        p0Var2.f8891h = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return p0Var2;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            p0[] p0VarArr = this.f1894a;
            pc.j.b(p0VarArr);
            int i11 = (i10 - 1) / 2;
            p0 p0Var = p0VarArr[i11];
            pc.j.b(p0Var);
            p0 p0Var2 = p0VarArr[i10];
            pc.j.b(p0Var2);
            if (p0Var.compareTo(p0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        p0[] p0VarArr = this.f1894a;
        pc.j.b(p0VarArr);
        p0 p0Var = p0VarArr[i11];
        pc.j.b(p0Var);
        p0 p0Var2 = p0VarArr[i10];
        pc.j.b(p0Var2);
        p0VarArr[i10] = p0Var;
        p0VarArr[i11] = p0Var2;
        p0Var.f8891h = i10;
        p0Var2.f8891h = i11;
    }
}
