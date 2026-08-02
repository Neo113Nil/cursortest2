package defpackage;

import android.content.Context;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes.dex */
public final class k7i {
    public final Context a;
    public final s63 b;

    public k7i(Context context, s63 s63Var) {
        context.getClass();
        this.a = context;
        this.b = s63Var;
    }

    public final void a(String str) {
        l7i l7iVar;
        str.getClass();
        ypt a = fqt.a(str, true, false);
        if (a != null) {
            int i = UrlActivity.C;
            s63 s63Var = this.b;
            PlaybackScope hVar = (s63Var == null || (l7iVar = (l7i) s63Var.a) == null) ? new h(Page.LANDING) : d.p(l7iVar.a);
            Context context = this.a;
            context.startActivity(zfm.a(context, a, hVar, null, true));
        }
    }
}
