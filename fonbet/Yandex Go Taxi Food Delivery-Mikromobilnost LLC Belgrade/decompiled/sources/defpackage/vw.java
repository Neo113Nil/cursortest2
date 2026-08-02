package defpackage;

import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes10.dex */
public abstract class vw {
    public Object a;
    public boolean b;

    public abstract void a();

    public abstract View b();

    public abstract MenuBuilder c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view);

    public abstract void j(int i);

    public abstract void k(CharSequence charSequence);

    public abstract void l(int i);

    public abstract void m(CharSequence charSequence);

    public void n(boolean z) {
        this.b = z;
    }
}
