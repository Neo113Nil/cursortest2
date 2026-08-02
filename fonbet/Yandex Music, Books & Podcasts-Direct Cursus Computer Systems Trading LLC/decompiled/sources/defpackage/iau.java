package defpackage;

import android.content.Context;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class iau {
    public final icu a;
    public final z66 b;
    public final Context c;

    public iau(icu icuVar, z66 z66Var, Context context) {
        this.a = icuVar;
        this.b = z66Var;
        this.c = context;
    }

    public final boolean a() {
        return !this.c.getResources().getBoolean(R.bool.is_tablet) && ((Boolean) this.a.a.getValue()).booleanValue() && this.b.g();
    }
}
