package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public final class qs90 {
    public final View a;

    public qs90(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        view.animate().cancel();
        if (view.getVisibility() == 0) {
            return;
        }
        view.post(new op70(18, this));
    }
}
