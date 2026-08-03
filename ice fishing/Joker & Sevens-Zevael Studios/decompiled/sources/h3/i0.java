package h3;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f2788a;

    public i0(int i10, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2788a = new g0(com.onesignal.common.c.i(i10, interpolator, j3));
        } else {
            this.f2788a = new e0(i10, interpolator, j3);
        }
    }
}
