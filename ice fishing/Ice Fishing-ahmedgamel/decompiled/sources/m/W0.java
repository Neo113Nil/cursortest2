package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C4644a;

/* loaded from: classes.dex */
public final class W0 implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C4644a f39078n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X0 f39079u;

    public W0(X0 x02) {
        this.f39079u = x02;
        Context context = x02.f39081a.getContext();
        CharSequence charSequence = x02.f39088h;
        C4644a c4644a = new C4644a();
        c4644a.f38753x = 4096;
        c4644a.f38755z = 4096;
        c4644a.f38744E = null;
        c4644a.f38745F = null;
        c4644a.f38746G = false;
        c4644a.f38747H = false;
        c4644a.f38748I = 16;
        c4644a.f38741B = context;
        c4644a.f38749n = charSequence;
        this.f39078n = c4644a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        X0 x02 = this.f39079u;
        Window.Callback callback = x02.f39090k;
        if (callback == null || !x02.f39091l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f39078n);
    }
}
