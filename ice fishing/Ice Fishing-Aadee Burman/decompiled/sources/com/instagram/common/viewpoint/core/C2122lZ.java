package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2122lZ implements InterfaceC1004Jj {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<C1026Kf> A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2122lZ(List<C1026Kf> list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i = 0; i < cueIndex; i++) {
            C1026Kf c1026Kf = list.get(i);
            int i6 = i * 2;
            this.A01[i6] = c1026Kf.A01;
            int arrayIndex = i6 + 1;
            this.A01[arrayIndex] = c1026Kf.A00;
        }
        this.A02 = Arrays.copyOf(this.A01, this.A01.length);
        Arrays.sort(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final List<C2350pT> A7X(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.A00.size(); i++) {
            if (this.A01[i * 2] <= j6) {
                long j9 = this.A01[(i * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j6 < j9) {
                        C1026Kf c1026Kf = this.A00.get(i);
                        if (c1026Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c1026Kf);
                        } else {
                            C2350pT c2350pT = c1026Kf.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c2350pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((C1026Kf) obj).A01, ((C1026Kf) obj2).A01);
                return compare;
            }
        });
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            arrayList.add(((C1026Kf) arrayList2.get(i6)).A02.A02().A07((-1) - i6, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final long A83(int i) {
        boolean z3 = true;
        AbstractC06243y.A07(i >= 0);
        if (i >= this.A02.length) {
            z3 = false;
        }
        AbstractC06243y.A07(z3);
        return this.A02[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A8a(long j6) {
        int A0K = C5C.A0K(this.A02, j6, false, false);
        int index = this.A02.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
