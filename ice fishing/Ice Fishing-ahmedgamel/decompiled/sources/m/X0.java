package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C4655a;

/* loaded from: classes.dex */
public final class X0 implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C4655a f39148n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y0 f39149u;

    public X0(Y0 y02) {
        this.f39149u = y02;
        Context context = y02.f39151a.getContext();
        CharSequence charSequence = y02.f39158h;
        C4655a c4655a = new C4655a();
        c4655a.f38680x = 4096;
        c4655a.f38682z = 4096;
        c4655a.f38671E = null;
        c4655a.f38672F = null;
        c4655a.f38673G = false;
        c4655a.f38674H = false;
        c4655a.f38675I = 16;
        c4655a.f38668B = context;
        c4655a.f38676n = charSequence;
        this.f39148n = c4655a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y0 y02 = this.f39149u;
        Window.Callback callback = y02.f39160k;
        if (callback == null || !y02.f39161l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f39148n);
    }
}
