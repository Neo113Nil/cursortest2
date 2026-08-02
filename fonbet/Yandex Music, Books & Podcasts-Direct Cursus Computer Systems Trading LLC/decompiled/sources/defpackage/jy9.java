package defpackage;

import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes3.dex */
public final class jy9 implements ky9 {
    @Override // defpackage.ky9
    public final Typeface a() {
        return null;
    }

    @Override // defpackage.ky9
    public final Typeface b() {
        return null;
    }

    @Override // defpackage.ky9
    public final Typeface c() {
        return null;
    }

    @Override // defpackage.ky9
    public final Typeface d() {
        return null;
    }

    @Override // defpackage.ky9
    public final Typeface e(int i) {
        return Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, i, false) : super.e(i);
    }
}
