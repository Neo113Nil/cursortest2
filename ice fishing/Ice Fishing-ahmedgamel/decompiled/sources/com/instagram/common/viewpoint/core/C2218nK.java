package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2218nK extends C06073h {
    public static String[] A0G = {"svIlLfjydeGBu6G0UjrHSopJ4Ky0wypW", "Eix0ooWKKyHx1hOwK", "jEg8xHvrvI0NXBTEehRxqQQjEYaTbIQI", "2fo", "JdZ", "dfBQZRQYRFpeihXeeCDcyjRnxunK4YCt", "ZC", "go43CHW4mwtjJCZZxmpd9eXXAUtGDH29"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray<Map<C2230nW, C2215nH>> A0E;
    public final SparseBooleanArray A0F;

    @Deprecated
    public C2218nK() {
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    public C2218nK(Context context) {
        super(context);
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    @MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public C2218nK(Bundle bundle) {
        super(bundle);
        A0W();
        C07589i c07589i = C07589i.A0J;
        A17(bundle.getBoolean(C07589i.A0W, c07589i.A0C));
        A11(bundle.getBoolean(C07589i.A0Q, c07589i.A06));
        A12(bundle.getBoolean(C07589i.A0R, c07589i.A07));
        A10(bundle.getBoolean(C07589i.A0H(), c07589i.A05));
        A14(bundle.getBoolean(C07589i.A0T, c07589i.A09));
        A0x(bundle.getBoolean(C07589i.A0J(), c07589i.A02));
        A0y(bundle.getBoolean(C07589i.A0N, c07589i.A03));
        A0v(bundle.getBoolean(C07589i.A0K, c07589i.A00));
        A0w(bundle.getBoolean(C07589i.A0L, c07589i.A01));
        A13(bundle.getBoolean(C07589i.A0S, c07589i.A08));
        A16(bundle.getBoolean(C07589i.A0V, c07589i.A0B));
        A18(bundle.getBoolean(C07589i.A0b, c07589i.A0D));
        A0z(bundle.getBoolean(C07589i.A0O, c07589i.A04));
        A15(bundle.getBoolean(C07589i.A0U, c07589i.A0A));
        this.A0E = new SparseArray<>();
        A0X(bundle);
        this.A0F = A0R(bundle.getIntArray(C07589i.A0X));
    }

    @MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public C2218nK(C07589i c07589i) {
        super(c07589i);
        this.A0C = c07589i.A0C;
        this.A06 = c07589i.A06;
        this.A07 = c07589i.A07;
        this.A05 = c07589i.A05;
        this.A09 = c07589i.A09;
        this.A02 = c07589i.A02;
        this.A03 = c07589i.A03;
        this.A00 = c07589i.A00;
        this.A01 = c07589i.A01;
        this.A08 = c07589i.A08;
        this.A0B = c07589i.A0B;
        this.A0D = c07589i.A0D;
        this.A04 = c07589i.A04;
        this.A0A = c07589i.A0A;
        this.A0E = A0G((SparseArray<Map<C2230nW, C2215nH>>) c07589i.A0E);
        this.A0F = c07589i.A0F.clone();
    }

    public static SparseArray<Map<C2230nW, C2215nH>> A0G(SparseArray<Map<C2230nW, C2215nH>> sparseArray) {
        SparseArray<Map<C2230nW, C2215nH>> sparseArray2 = new SparseArray<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    private SparseBooleanArray A0R(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i : iArr) {
            sparseBooleanArray.append(i, true);
        }
        return sparseBooleanArray;
    }

    @MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A0W() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0X(Bundle bundle) {
        BP A01;
        SparseArray A00;
        int[] intArray = bundle.getIntArray(C07589i.A0B());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C07589i.A0C());
        if (parcelableArrayList == null) {
            A01 = BP.A03();
        } else {
            AnonymousClass23<C2230nW> anonymousClass23 = C2230nW.A05;
            String[] strArr = A0G;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "KlsLVpZXOsku5rL5eePguYtdE3UqynPn";
            strArr2[5] = "qpearOu2I9fJNwBbehSRgczBWJlsPwpY";
            A01 = AnonymousClass44.A01(anonymousClass23, parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C07589i.A0Y);
        if (sparseParcelableArray == null) {
            A00 = new SparseArray();
        } else {
            A00 = AnonymousClass44.A00(C2215nH.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != A01.size()) {
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            A0r(intArray[i], (C2230nW) A01.get(i), (C2215nH) A00.get(i));
        }
    }

    @Override // com.instagram.common.viewpoint.core.C06073h
    /* renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final C2218nK A0m(int i, int i6, boolean z3) {
        super.A0m(i, i6, z3);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (com.instagram.common.viewpoint.core.C5C.A1E(r4, r8) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (com.instagram.common.viewpoint.core.C5C.A1E(r4, r8) != false) goto L15;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2218nK A0r(int i, C2230nW c2230nW, C2215nH c2215nH) {
        Map<C2230nW, C2215nH> map = this.A0E.get(i);
        if (map == null) {
            map = new HashMap<>();
            this.A0E.put(i, map);
        }
        boolean containsKey = map.containsKey(c2230nW);
        String[] strArr = A0G;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "Tjk1w46Zsfr3yClteaW3dwU9W0N7TL6X";
        strArr2[5] = "KoERYkShSHV4ud9Re9JlKSMcCXAYN5Cn";
        if (containsKey) {
            C2215nH c2215nH2 = map.get(c2230nW);
            String[] strArr3 = A0G;
            if (strArr3[0].charAt(28) != strArr3[7].charAt(28)) {
                String[] strArr4 = A0G;
                strArr4[1] = "d9Fp2lxah88hbF8VY";
                strArr4[6] = "He";
            } else {
                String[] strArr5 = A0G;
                strArr5[0] = "6G3DmRjovsWEEopHgL7H9VeUKDmRIoIA";
                strArr5[7] = "heYp32NvS9S7pouisOnfj6NnH9zTXJMv";
            }
        }
        map.put(c2230nW, c2215nH);
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C06073h
    /* renamed from: A0s, reason: merged with bridge method [inline-methods] */
    public final C2218nK A0n(Context context) {
        super.A0n(context);
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C06073h
    /* renamed from: A0t, reason: merged with bridge method [inline-methods] */
    public final C2218nK A0o(Context context, boolean z3) {
        super.A0o(context, z3);
        return this;
    }

    public final C2218nK A0u(C2359pc c2359pc) {
        super.A0W(c2359pc);
        return this;
    }

    public final C2218nK A0v(boolean z3) {
        this.A00 = z3;
        return this;
    }

    public final C2218nK A0w(boolean z3) {
        this.A01 = z3;
        return this;
    }

    public final C2218nK A0x(boolean z3) {
        this.A02 = z3;
        return this;
    }

    public final C2218nK A0y(boolean z3) {
        this.A03 = z3;
        return this;
    }

    public final C2218nK A0z(boolean z3) {
        this.A04 = z3;
        return this;
    }

    public final C2218nK A10(boolean z3) {
        this.A05 = z3;
        return this;
    }

    public final C2218nK A11(boolean z3) {
        this.A06 = z3;
        return this;
    }

    public final C2218nK A12(boolean z3) {
        this.A07 = z3;
        return this;
    }

    public final C2218nK A13(boolean z3) {
        this.A08 = z3;
        return this;
    }

    public final C2218nK A14(boolean z3) {
        this.A09 = z3;
        return this;
    }

    @MetaExoPlayerCustomization("D25277746")
    public final C2218nK A15(boolean z3) {
        this.A0A = z3;
        return this;
    }

    public final C2218nK A16(boolean z3) {
        this.A0B = z3;
        return this;
    }

    public final C2218nK A17(boolean z3) {
        this.A0C = z3;
        return this;
    }

    public final C2218nK A18(boolean z3) {
        this.A0D = z3;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C06073h
    /* renamed from: A19, reason: merged with bridge method [inline-methods] */
    public final C07589i A0p() {
        return new C07589i(this);
    }
}
