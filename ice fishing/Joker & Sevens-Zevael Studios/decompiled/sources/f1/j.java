package f1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f2265a;

    public j(PathMeasure pathMeasure) {
        this.f2265a = pathMeasure;
    }

    public final void a(float f10, float f11, i iVar) {
        if (iVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f2265a.getSegment(f10, f11, iVar.f2261a, true);
    }
}
