package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C0217a;

/* loaded from: classes.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0217a f3919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f3920b;

    public b1(c1 c1Var) {
        this.f3920b = c1Var;
        Context context = c1Var.f3923a.getContext();
        CharSequence charSequence = c1Var.f3929h;
        C0217a c0217a = new C0217a();
        c0217a.e = 4096;
        c0217a.f3656g = 4096;
        c0217a.f3659l = null;
        c0217a.f3660m = null;
        c0217a.f3661n = false;
        c0217a.f3662o = false;
        c0217a.f3663p = 16;
        c0217a.i = context;
        c0217a.f3651a = charSequence;
        this.f3919a = c0217a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c1 c1Var = this.f3920b;
        Window.Callback callback = c1Var.f3930k;
        if (callback == null || !c1Var.f3931l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3919a);
    }
}
