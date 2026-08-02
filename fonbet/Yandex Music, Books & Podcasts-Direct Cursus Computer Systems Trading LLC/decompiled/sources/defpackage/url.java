package defpackage;

import android.content.Context;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class url extends fqm {
    private static final long serialVersionUID = -2752901057906236156L;
    public final cvl a;

    public url(cvl cvlVar) {
        this.a = cvlVar;
    }

    @Override // defpackage.fqm
    public final CharSequence a(Context context, int i) {
        return null;
    }

    @Override // defpackage.fqm
    public final co6 b() {
        return op7.c(this.a);
    }

    @Override // defpackage.fqm
    public final jzb c() {
        return null;
    }

    @Override // defpackage.fqm
    public final CharSequence d() {
        int i = this.a.g;
        return ((skr) sk3.I(skr.class)).b(R.plurals.plural_n_tracks_rtl_support, i, Integer.valueOf(i));
    }

    @Override // defpackage.fqm
    public final CharSequence e() {
        return this.a.b;
    }

    @Override // defpackage.fqm
    public final int f() {
        return 5;
    }
}
