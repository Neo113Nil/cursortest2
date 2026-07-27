package l;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f39011n;

    public u(v vVar) {
        this.f39011n = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f39011n.c();
    }
}
