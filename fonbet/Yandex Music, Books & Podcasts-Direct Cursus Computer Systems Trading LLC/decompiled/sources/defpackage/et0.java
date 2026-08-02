package defpackage;

import android.content.Context;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class et0 {
    public final l7b a;
    public final /* synthetic */ l13 b;

    public et0(l13 l13Var) {
        this.b = l13Var;
        this.a = (l7b) l13Var.a(hag.I(l7b.class));
    }

    public final String a() {
        this.a.getClass();
        bdt I = hag.I(Context.class);
        l13 l13Var = this.b;
        return f1d.g("https://", ((Context) l13Var.a.D(I, l13Var, l13Var.b)).getString(R.string.music_yandex_ru));
    }
}
