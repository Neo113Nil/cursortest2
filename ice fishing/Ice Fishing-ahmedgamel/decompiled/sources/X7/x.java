package X7;

import S7.M;
import S7.N;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3822b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public M[] f3823a;

    public final void a(M m9) {
        m9.d((N) this);
        M[] mArr = this.f3823a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3822b;
        if (mArr == null) {
            mArr = new M[4];
            this.f3823a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            mArr = (M[]) copyOf;
            this.f3823a = mArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        mArr[i] = m9;
        m9.f3009u = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i) {
        Object[] objArr = this.f3823a;
        kotlin.jvm.internal.h.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3822b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i4 = (i - 1) / 2;
            if (i > 0) {
                M m9 = objArr[i];
                kotlin.jvm.internal.h.b(m9);
                Object obj = objArr[i4];
                kotlin.jvm.internal.h.b(obj);
                if (m9.compareTo(obj) < 0) {
                    d(i, i4);
                    c(i4);
                }
            }
            while (true) {
                int i6 = i * 2;
                int i9 = i6 + 1;
                if (i9 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3823a;
                kotlin.jvm.internal.h.b(objArr2);
                int i10 = i6 + 2;
                if (i10 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i10];
                    kotlin.jvm.internal.h.b(comparable);
                    Object obj2 = objArr2[i9];
                    kotlin.jvm.internal.h.b(obj2);
                }
                i10 = i9;
                Comparable comparable2 = objArr2[i];
                kotlin.jvm.internal.h.b(comparable2);
                Comparable comparable3 = objArr2[i10];
                kotlin.jvm.internal.h.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i10);
                i = i10;
            }
        }
        M m10 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.h.b(m10);
        m10.d(null);
        m10.f3009u = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m10;
    }

    public final void c(int i) {
        while (i > 0) {
            M[] mArr = this.f3823a;
            kotlin.jvm.internal.h.b(mArr);
            int i4 = (i - 1) / 2;
            M m9 = mArr[i4];
            kotlin.jvm.internal.h.b(m9);
            M m10 = mArr[i];
            kotlin.jvm.internal.h.b(m10);
            if (m9.compareTo(m10) <= 0) {
                return;
            }
            d(i, i4);
            i = i4;
        }
    }

    public final void d(int i, int i4) {
        M[] mArr = this.f3823a;
        kotlin.jvm.internal.h.b(mArr);
        M m9 = mArr[i4];
        kotlin.jvm.internal.h.b(m9);
        M m10 = mArr[i];
        kotlin.jvm.internal.h.b(m10);
        mArr[i] = m9;
        mArr[i4] = m10;
        m9.f3009u = i;
        m10.f3009u = i4;
    }
}
