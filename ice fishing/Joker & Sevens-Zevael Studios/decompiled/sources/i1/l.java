package i1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3103a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f3103a) {
            case 0:
                if (!(view instanceof m) || (outline2 = ((m) view).f3109k) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                pc.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                a4.d.s(view);
                throw null;
        }
    }
}
