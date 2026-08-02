package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3034c6 implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f30211n;

    public C3034c6(boolean z6) {
        this.f30211n = z6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = 0;
        int i4 = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int f2 = com.IceFishing.LiveIceFishing.k.f((i6 & (~i4)) | i9, (i4 & i10) | i11, i12, i13);
        int i15 = i14 % 496612959;
        C3249g6 c3249g6 = (C3249g6) obj;
        C3249g6 c3249g62 = (C3249g6) obj2;
        int i16 = c3249g6.f31290g;
        if (i16 != c3249g62.f31290g) {
            throw new IllegalArgumentException();
        }
        int i17 = i15 ^ f2;
        try {
            if (i16 == 0) {
                throw null;
            }
            int i18 = i16 + i17;
            boolean z6 = this.f30211n;
            switch (i18) {
                case 1:
                    if (z6) {
                        return c3249g6.l() != c3249g62.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(c3249g6.m(), c3249g62.m());
                case 3:
                    M5 n9 = c3249g6.n();
                    M5 n10 = c3249g62.n();
                    int i19 = 0;
                    while (true) {
                        length = n9.f27037a.length;
                        if (i < length && i19 < n10.f27037a.length) {
                            int compare = Integer.compare(M5.f(n9.b(i)), M5.f(n10.b(i19)));
                            if (compare != 0) {
                                return compare;
                            }
                            i++;
                            i19++;
                        }
                    }
                    return Integer.compare(length, n10.f27037a.length);
                case 4:
                    List o4 = c3249g6.o();
                    List o6 = c3249g62.o();
                    Iterator it = ((ArrayList) o4).iterator();
                    Iterator it2 = ((ArrayList) o6).iterator();
                    while (it.hasNext()) {
                        if (it2.hasNext()) {
                            int compare2 = compare(it.next(), it2.next());
                            if (compare2 != 0) {
                                return compare2;
                            }
                        }
                    }
                    if (it2.hasNext()) {
                        return -1;
                    }
                    break;
                case 5:
                    if (z6) {
                        if (c3249g6.p() != c3249g62.p()) {
                        }
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(c3249g6.q(), c3249g62.q());
            }
        } catch (C3088d6 e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }
}
