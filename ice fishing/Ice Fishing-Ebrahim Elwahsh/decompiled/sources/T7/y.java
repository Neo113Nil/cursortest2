package T7;

import O7.M;
import O7.N;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3176b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public M[] f3177a;

    public final void a(M m8) {
        m8.d((N) this);
        M[] mArr = this.f3177a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3176b;
        if (mArr == null) {
            mArr = new M[4];
            this.f3177a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            mArr = (M[]) copyOf;
            this.f3177a = mArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        mArr[i] = m8;
        m8.f2562u = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i) {
        Object[] objArr = this.f3177a;
        kotlin.jvm.internal.h.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3176b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i4 = (i - 1) / 2;
            if (i > 0) {
                M m8 = objArr[i];
                kotlin.jvm.internal.h.b(m8);
                Object obj = objArr[i4];
                kotlin.jvm.internal.h.b(obj);
                if (m8.compareTo(obj) < 0) {
                    d(i, i4);
                    c(i4);
                }
            }
            while (true) {
                int i9 = i * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3177a;
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
        m9.f2562u = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m9;
    }

    public final void c(int i) {
        while (i > 0) {
            M[] mArr = this.f3177a;
            kotlin.jvm.internal.h.b(mArr);
            int i4 = (i - 1) / 2;
            M m8 = mArr[i4];
            kotlin.jvm.internal.h.b(m8);
            M m9 = mArr[i];
            kotlin.jvm.internal.h.b(m9);
            if (m8.compareTo(m9) <= 0) {
                return;
            }
            d(i, i4);
            i = i4;
        }
    }

    public final void d(int i, int i4) {
        M[] mArr = this.f3177a;
        kotlin.jvm.internal.h.b(mArr);
        M m8 = mArr[i4];
        kotlin.jvm.internal.h.b(m8);
        M m9 = mArr[i];
        kotlin.jvm.internal.h.b(m9);
        mArr[i] = m8;
        mArr[i4] = m9;
        m8.f2562u = i;
        m9.f2562u = i4;
    }
}
