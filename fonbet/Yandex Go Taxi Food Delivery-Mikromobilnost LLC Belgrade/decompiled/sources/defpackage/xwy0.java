package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public abstract class xwy0 extends x0 implements nwy0 {
    public ThemeType N;

    public xwy0(View view) {
        super(view);
        this.N = qje.X(view.getContext());
    }

    public void applyTheme(ThemeType themeType) {
        xvy0.b(this.a, this.N, true, new c90(22, this));
    }
}
