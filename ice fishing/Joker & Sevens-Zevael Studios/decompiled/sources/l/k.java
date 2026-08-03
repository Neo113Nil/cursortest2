package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements PopupWindow.OnDismissListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f3737g;

    public k(l lVar) {
        this.f3737g = lVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3737g.c();
    }
}
