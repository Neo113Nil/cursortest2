package defpackage;

import android.content.Context;
import ru.yandex.music.catalog.artist.familiar.ArtistFamiliarActivity;

/* loaded from: classes3.dex */
public final class l81 {
    public final x81 a;
    public final k81 b;
    public final rmb c;

    public l81(x81 x81Var, k81 k81Var, rmb rmbVar) {
        rmbVar.getClass();
        this.a = x81Var;
        this.b = k81Var;
        this.c = rmbVar;
    }

    public final void a(j81 j81Var) {
        b81 b81Var;
        wjb wjbVar = wjb.ArtistFamiliarToYouScreen;
        x81 x81Var = this.a;
        rmb.j(this.c, wjbVar, ((d91) x81Var.o.getValue()).a(), null, 12);
        u51 u51Var = x81Var.f;
        Context context = this.b.a;
        u51Var.getClass();
        int ordinal = j81Var.ordinal();
        if (ordinal == 0) {
            b81Var = b81.Wave;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            b81Var = b81.Collection;
        }
        j71 j71Var = new j71(b81Var, u51Var);
        int i = ArtistFamiliarActivity.Y;
        context.startActivity(quj.H(context, j71Var));
    }
}
