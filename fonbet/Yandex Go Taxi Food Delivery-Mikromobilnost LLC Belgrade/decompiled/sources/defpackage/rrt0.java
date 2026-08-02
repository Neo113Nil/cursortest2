package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.splash.AfterSplashType;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes8.dex */
public final class rrt0 {
    public final oqt0 a;
    public yo40 b;

    public rrt0(oqt0 oqt0Var) {
        this.a = oqt0Var;
    }

    public final void a(MainActivity mainActivity) {
        int i;
        yo40 yo40Var;
        oqt0 oqt0Var = this.a;
        if (oqt0Var.c()) {
            yo40 yo40Var2 = new yo40((FragmentActivity) mainActivity);
            ((krt0) yo40Var2.a).a();
            this.b = yo40Var2;
            if (oqt0Var.a() != AfterSplashType.WELCOME || (yo40Var = this.b) == null) {
                return;
            }
            ((krt0) yo40Var.a).c();
            return;
        }
        if (jx81.e()) {
            Resources.Theme theme = mainActivity.getTheme();
            TypedValue typedValue = new TypedValue();
            if (!theme.resolveAttribute(dog0.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
                return;
            }
            mainActivity.setTheme(i);
        }
    }
}
