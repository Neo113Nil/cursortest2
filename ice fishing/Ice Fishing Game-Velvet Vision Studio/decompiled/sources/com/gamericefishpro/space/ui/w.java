package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.r0;
import com.gamericefishpro.space.pi.s0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class w {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public r0[] a;

    public final void a(r0 r0Var) {
        r0Var.d((s0) this);
        r0[] r0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (r0VarArr == null) {
            r0VarArr = new r0[4];
            this.a = r0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= r0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(r0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            r0VarArr = (r0[]) objArrCopyOf;
            this.a = r0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        r0VarArr[i] = r0Var;
        r0Var.e = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final r0 b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        Intrinsics.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                r0 r0Var = objArr2[i];
                Intrinsics.b(r0Var);
                Object obj2 = objArr2[i5];
                Intrinsics.b(obj2);
                if (r0Var.compareTo(obj2) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        Intrinsics.b(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            Intrinsics.b(comparable3);
                            obj = objArr[i3];
                            Intrinsics.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        Intrinsics.b(comparable);
                        comparable2 = objArr[i4];
                        Intrinsics.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    Intrinsics.b(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        Intrinsics.b(comparable3);
                        obj = objArr[i3];
                        Intrinsics.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    Intrinsics.b(comparable);
                    comparable2 = objArr[i4];
                    Intrinsics.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        r0 r0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.b(r0Var2);
        r0Var2.d(null);
        r0Var2.e = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return r0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            r0[] r0VarArr = this.a;
            Intrinsics.b(r0VarArr);
            int i2 = (i - 1) / 2;
            r0 r0Var = r0VarArr[i2];
            Intrinsics.b(r0Var);
            r0 r0Var2 = r0VarArr[i];
            Intrinsics.b(r0Var2);
            if (r0Var.compareTo(r0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        r0[] r0VarArr = this.a;
        Intrinsics.b(r0VarArr);
        r0 r0Var = r0VarArr[i2];
        Intrinsics.b(r0Var);
        r0 r0Var2 = r0VarArr[i];
        Intrinsics.b(r0Var2);
        r0VarArr[i] = r0Var;
        r0VarArr[i2] = r0Var2;
        r0Var.e = i;
        r0Var2.e = i2;
    }
}
