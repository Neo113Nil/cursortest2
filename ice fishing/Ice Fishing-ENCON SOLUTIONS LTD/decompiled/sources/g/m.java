package g;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3098a;

    public m(n nVar) {
        this.f3098a = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3098a.c();
    }
}
