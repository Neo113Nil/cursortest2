package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
class setLineBreakStyle {
    private static int get = 1;
    private static int initialize;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<X509Certificate> ThreeDS2Service(List<X509Certificate> list) {
        boolean z;
        int i;
        int i2 = initialize;
        int i3 = i2 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i4 = i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i5 = (((i3 | i4) << 1) - (~(-((i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i4))))) - 1;
        get = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (list == null || list.isEmpty()) {
            List<X509Certificate> list2 = Collections.EMPTY_LIST;
            int i6 = get;
            int i7 = (((i6 | 33) << 1) - (~(-(i6 ^ 33)))) - 1;
            initialize = i7 % 128;
            if (i7 % 2 == 0) {
                return list2;
            }
            throw null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList(list);
        linkedList.add((X509Certificate) linkedList2.pollFirst());
        int i8 = get;
        int i9 = i8 & 33;
        int i10 = (i8 | 33) & (~i9);
        int i11 = i9 << 1;
        initialize = (((i10 | i11) << 1) - (i10 ^ i11)) % 128;
        int i12 = 0;
        while (!linkedList2.isEmpty()) {
            int i13 = initialize;
            get = SVG$Unit$EnumUnboxingLocalUtility.m(i13 & 6, i13 | 6, -1, 128);
            X509Certificate x509Certificate = (X509Certificate) linkedList2.pollFirst();
            if (x509Certificate.getIssuerX500Principal().equals(((X509Certificate) linkedList.peekFirst()).getSubjectX500Principal())) {
                initialize = (get + 101) % 128;
                linkedList.offerFirst(x509Certificate);
                int i14 = get;
                initialize = ((i14 ^ 39) + ((i14 & 39) << 1)) % 128;
            } else {
                if (x509Certificate.getSubjectX500Principal().equals(((X509Certificate) linkedList.peekLast()).getIssuerX500Principal())) {
                    int i15 = initialize;
                    int i16 = i15 & 45;
                    int i17 = (i15 | 45) & (~i16);
                    int i18 = -(-(i16 << 1));
                    int i19 = (i17 & i18) + (i17 | i18);
                    get = i19 % 128;
                    if (i19 % 2 == 0) {
                        linkedList.offerLast(x509Certificate);
                    } else {
                        linkedList.offerLast(x509Certificate);
                    }
                } else {
                    linkedList2.offerLast(x509Certificate);
                    int i20 = initialize;
                    get = ((-2) - (((i20 & 6) + (i20 | 6)) ^ (-1))) % 128;
                }
                z = false;
                if (z) {
                    i = ((i12 ^ 2) + ((i12 & 2) << 1)) - 1;
                    if (i == linkedList2.size()) {
                        int i21 = get;
                        int i22 = i21 & 1;
                        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i22, ~(-(-((i21 ^ 1) | i22))), 1, 128);
                        throw setTextAlignment.getSchemeLogoDark.initialize(new Object[0]);
                    }
                } else {
                    int i23 = initialize;
                    int i24 = i23 & 87;
                    int i25 = -(-(i23 | 87));
                    int i26 = (i24 & i25) + (i24 | i25);
                    get = i26 % 128;
                    i = i26 % 2 == 0 ? 1 : 0;
                    get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i23 & (-60)) | ((~i23) & 59), ~((i23 & 59) << 1), 1, 128);
                }
                i12 = i;
                int i27 = initialize;
                get = ((((i27 ^ 21) | (i27 & 21)) << 1) - (((~i27) & 21) | (i27 & (-22)))) % 128;
            }
            z = true;
            if (z) {
            }
            i12 = i;
            int i272 = initialize;
            get = ((((i272 ^ 21) | (i272 & 21)) << 1) - (((~i272) & 21) | (i272 & (-22)))) % 128;
        }
        int i28 = get;
        int i29 = i28 & 87;
        int i30 = (i28 ^ 87) | i29;
        int i31 = (i29 & i30) + (i30 | i29);
        initialize = i31 % 128;
        if (i31 % 2 == 0) {
            return linkedList;
        }
        throw null;
    }
}
