package l;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f38869n;

    public v(w wVar) {
        this.f38869n = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f38869n.c();
    }
}
