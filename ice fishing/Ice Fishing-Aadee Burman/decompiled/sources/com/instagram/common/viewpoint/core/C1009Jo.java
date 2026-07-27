package com.instagram.common.viewpoint.core;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1009Jo {
    public static final Comparator<C1009Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((C1009Jo) obj2).A00, ((C1009Jo) obj).A00);
            return compare;
        }
    };
    public final int A00;
    public final C2350pT A01;

    public C1009Jo(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i6, float f9, int i9, float f10, boolean z3, int i10, int i11) {
        C06143o cueBuilder = new C06143o().A0G(charSequence).A0F(alignment).A07(f3, i).A09(i6).A04(f9).A0A(i9).A06(f10);
        if (z3) {
            cueBuilder.A0C(i10);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i11;
    }
}
