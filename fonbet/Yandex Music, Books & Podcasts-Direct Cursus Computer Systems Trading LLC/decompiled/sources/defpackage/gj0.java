package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class gj0 implements aeu {
    public final ViewConfiguration a;

    public gj0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.aeu
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.aeu
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.aeu
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return sb.l(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.aeu
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.aeu
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.aeu
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return sb.k(this.a);
        }
        return 16.0f;
    }
}
