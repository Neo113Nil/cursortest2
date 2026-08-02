package defpackage;

import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class u6z0 extends ad5 {
    public String A;
    public final exu0 x;
    public final c y;
    public final pwy0 z;

    public u6z0(exu0 exu0Var, c cVar, pwy0 pwy0Var) {
        super(r6z0.class);
        this.x = exu0Var;
        this.y = cVar;
        this.z = pwy0Var;
    }

    public final void Kg(ThemeType themeType) {
        cxu0 a;
        String str = this.A;
        exu0 exu0Var = this.x;
        if (str == null || (a = ((nrt) exu0Var).b(themeType, str)) == null) {
            a = exu0Var.a(themeType);
        }
        ((r6z0) Dg()).Ca(a.b);
    }
}
