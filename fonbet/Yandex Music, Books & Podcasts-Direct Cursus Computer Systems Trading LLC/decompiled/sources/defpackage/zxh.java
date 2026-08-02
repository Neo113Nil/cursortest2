package defpackage;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class zxh implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ayh a;

    public zxh(ayh ayhVar) {
        this.a = ayhVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
