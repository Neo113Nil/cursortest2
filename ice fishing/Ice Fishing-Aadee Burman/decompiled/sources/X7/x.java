package X7;

import S7.M;
import S7.N;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3867b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public M[] f3868a;

    public final void a(M m4) {
        m4.d((N) this);
        M[] mArr = this.f3868a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3867b;
        if (mArr == null) {
            mArr = new M[4];
            this.f3868a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            mArr = (M[]) copyOf;
            this.f3868a = mArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        mArr[i] = m4;
        m4.f2926u = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i) {
        Object[] objArr = this.f3868a;
        kotlin.jvm.internal.h.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3867b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i6 = (i - 1) / 2;
            if (i > 0) {
                M m4 = objArr[i];
                kotlin.jvm.internal.h.b(m4);
                Object obj = objArr[i6];
                kotlin.jvm.internal.h.b(obj);
                if (m4.compareTo(obj) < 0) {
                    d(i, i6);
                    c(i6);
                }
            }
            while (true) {
                int i9 = i * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3868a;
                kotlin.jvm.internal.h.b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    kotlin.jvm.internal.h.b(comparable);
                    Object obj2 = objArr2[i10];
                    kotlin.jvm.internal.h.b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i];
                kotlin.jvm.internal.h.b(comparable2);
                Comparable comparable3 = objArr2[i11];
                kotlin.jvm.internal.h.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i11);
                i = i11;
            }
        }
        M m9 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.h.b(m9);
        m9.d(null);
        m9.f2926u = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m9;
    }

    public final void c(int i) {
        while (i > 0) {
            M[] mArr = this.f3868a;
            kotlin.jvm.internal.h.b(mArr);
            int i6 = (i - 1) / 2;
            M m4 = mArr[i6];
            kotlin.jvm.internal.h.b(m4);
            M m9 = mArr[i];
            kotlin.jvm.internal.h.b(m9);
            if (m4.compareTo(m9) <= 0) {
                return;
            }
            d(i, i6);
            i = i6;
        }
    }

    public final void d(int i, int i6) {
        M[] mArr = this.f3868a;
        kotlin.jvm.internal.h.b(mArr);
        M m4 = mArr[i6];
        kotlin.jvm.internal.h.b(m4);
        M m9 = mArr[i];
        kotlin.jvm.internal.h.b(m9);
        mArr[i] = m4;
        mArr[i6] = m9;
        m4.f2926u = i;
        m9.f2926u = i6;
    }
}
