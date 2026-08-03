package y1;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f8584a;

    public m0(ViewConfiguration viewConfiguration) {
        this.f8584a = viewConfiguration;
    }

    @Override // y1.o1
    public final float a() {
        return this.f8584a.getScaledMaximumFlingVelocity();
    }

    @Override // y1.o1
    public final float b() {
        return this.f8584a.getScaledTouchSlop();
    }
}
