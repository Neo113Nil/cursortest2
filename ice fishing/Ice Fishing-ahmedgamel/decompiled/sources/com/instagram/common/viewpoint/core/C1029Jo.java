package com.instagram.common.viewpoint.core;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1029Jo {
    public static final Comparator<C1029Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((C1029Jo) obj2).A00, ((C1029Jo) obj).A00);
            return compare;
        }
    };
    public final int A00;
    public final C2370pT A01;

    public C1029Jo(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i4, float f9, int i6, float f10, boolean z6, int i9, int i10) {
        C06343o cueBuilder = new C06343o().A0G(charSequence).A0F(alignment).A07(f2, i).A09(i4).A04(f9).A0A(i6).A06(f10);
        if (z6) {
            cueBuilder.A0C(i9);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i10;
    }
}
