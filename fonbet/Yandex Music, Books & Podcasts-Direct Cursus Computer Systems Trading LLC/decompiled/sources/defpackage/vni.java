package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class vni {
    public final t a;
    public final y b;
    public final int c;

    public vni(o oVar) {
        oVar.getClass();
        t requireActivity = oVar.requireActivity();
        requireActivity.getClass();
        this.a = requireActivity;
        y supportFragmentManager = requireActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.b = supportFragmentManager;
        this.c = R.id.fragment_container_view;
    }

    public final void a() {
        y yVar = this.b;
        if (yVar.H() == 0) {
            this.a.finish();
        } else {
            yVar.T();
        }
    }

    public final void b(jnb jnbVar) {
        y yVar = this.b;
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.c(null);
        aVar.e(this.c, jnbVar, null);
        aVar.j();
    }
}
