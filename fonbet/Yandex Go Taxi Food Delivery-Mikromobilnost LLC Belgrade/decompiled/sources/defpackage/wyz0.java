package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public abstract class wyz0 {
    public static final long a = wdz.j(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    public static final int a(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.Ltr) ? wdz.d(0, j) : wdz.d(2, j);
    }

    public static final int b(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.Ltr) ? wdz.d(2, j) : wdz.d(0, j);
    }

    public static final int c(long j) {
        return wdz.d(3, j);
    }

    public static final int d(long j) {
        return wdz.d(1, j);
    }
}
