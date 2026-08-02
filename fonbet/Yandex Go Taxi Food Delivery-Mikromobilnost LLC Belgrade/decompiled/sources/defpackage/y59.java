package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes10.dex */
public final class y59 {
    public static final y60 c = new y60(5);
    public final odf a;
    public final int b;

    public y59(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        ndf ndfVar = new ndf();
        ndfVar.a = spannableStringBuilder;
        ndfVar.c = alignment;
        ndfVar.e = f;
        ndfVar.f = 0;
        ndfVar.g = i;
        ndfVar.h = f2;
        ndfVar.i = i2;
        ndfVar.l = -3.4028235E38f;
        if (z) {
            ndfVar.o = i3;
            ndfVar.n = true;
        }
        this.a = ndfVar.a();
        this.b = i4;
    }
}
