package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011c6 implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29428n;

    public C3011c6(boolean z3) {
        this.f29428n = z3;
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
        int i6 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[5];
        int i14 = iArr[6];
        int i15 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i9 & (~i6)) | i10, (i6 & i11) | i12, i13, i14);
        int i16 = i15 % 496612959;
        C3226g6 c3226g6 = (C3226g6) obj;
        C3226g6 c3226g62 = (C3226g6) obj2;
        int i17 = c3226g6.f30524g;
        if (i17 != c3226g62.f30524g) {
            throw new IllegalArgumentException();
        }
        int i18 = i16 ^ g4;
        try {
            if (i17 == 0) {
                throw null;
            }
            int i19 = i17 + i18;
            boolean z3 = this.f29428n;
            switch (i19) {
                case 1:
                    if (z3) {
                        return c3226g6.l() != c3226g62.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(c3226g6.m(), c3226g62.m());
                case 3:
                    M5 n9 = c3226g6.n();
                    M5 n10 = c3226g62.n();
                    int i20 = 0;
                    while (true) {
                        length = n9.f26246a.length;
                        if (i < length && i20 < n10.f26246a.length) {
                            int compare = Integer.compare(M5.f(n9.b(i)), M5.f(n10.b(i20)));
                            if (compare != 0) {
                                return compare;
                            }
                            i++;
                            i20++;
                        }
                    }
                    return Integer.compare(length, n10.f26246a.length);
                case 4:
                    List o6 = c3226g6.o();
                    List o9 = c3226g62.o();
                    Iterator it = ((ArrayList) o6).iterator();
                    Iterator it2 = ((ArrayList) o9).iterator();
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
                    if (z3) {
                        if (c3226g6.p() != c3226g62.p()) {
                        }
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(c3226g6.q(), c3226g62.q());
            }
        } catch (C3065d6 e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }
}
