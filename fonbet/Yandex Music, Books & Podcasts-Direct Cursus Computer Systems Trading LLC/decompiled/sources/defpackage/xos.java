package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class xos {
    public static final /* synthetic */ s9f[] b;
    public final q13 a;

    static {
        yxm yxmVar = new yxm(xos.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        ern.a.getClass();
        b = new s9f[]{yxmVar};
    }

    public xos(View view, hq0 hq0Var, n7b n7bVar) {
        jyr jyrVar;
        view.getClass();
        this.a = new q13(new fum(view, 5));
        Toolbar a = a();
        a.m(R.menu.profile_menu);
        a.setNavigationOnClickListener(new xal(11, hq0Var));
        a.setOnMenuItemClickListener(new h5n(27, n7bVar));
        a.setTitle(R.string.profile_title);
        qdq.d(a, false, (r3 & 2) == 0, false, (r3 & 8) == 0);
        Context context = view.getContext();
        Menu menu = a().getMenu();
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            int M = weo.M(context, R.attr.iconPrimary);
            Drawable icon = item.getIcon();
            jyrVar = sht.a;
            icon.getClass();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mode.getClass();
            Drawable mutate = icon.mutate();
            mutate.getClass();
            mutate.setTintMode(mode);
            mutate.setTint(M);
            item.setIcon(mutate);
        }
    }

    public final Toolbar a() {
        return (Toolbar) this.a.a(b[0]);
    }
}
