package ic;

import a4.d;
import bc.e;
import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends e implements a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Enum[] f3252g;

    public b(Enum[] enumArr) {
        this.f3252g = enumArr;
    }

    @Override // bc.a
    public final int a() {
        return this.f3252g.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // bc.a, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f3252g;
            if (ordinal < enumArr.length) {
                r02 = enumArr[ordinal];
                return r02 != r42;
            }
        }
        r02 = null;
        if (r02 != r42) {
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f3252g;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(d.f(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // bc.e, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r12;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f3252g;
            if (ordinal < enumArr.length) {
                r12 = enumArr[ordinal];
                if (r12 != r42) {
                    return ordinal;
                }
                return -1;
            }
        }
        r12 = null;
        if (r12 != r42) {
        }
    }

    @Override // bc.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
