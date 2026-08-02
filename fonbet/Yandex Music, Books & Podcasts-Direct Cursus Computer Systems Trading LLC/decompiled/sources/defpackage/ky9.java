package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public interface ky9 {
    public static final jy9 a = new jy9();

    Typeface a();

    Typeface b();

    Typeface c();

    Typeface d();

    default Typeface e(int i) {
        return (i < 0 || i >= 350) ? (i < 350 || i >= 450) ? (i < 450 || i >= 600) ? a() : d() : c() : b();
    }
}
