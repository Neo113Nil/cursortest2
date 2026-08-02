package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes4.dex */
public final class qbj {
    public final AlbumScreenActivity a;
    public final PlaybackScope b;
    public final y c;
    public final kkp d;
    public final t1f e;
    public final mmo f;

    public qbj(AlbumScreenActivity albumScreenActivity, PlaybackScope playbackScope, y yVar, kkp kkpVar, t1f t1fVar) {
        albumScreenActivity.getClass();
        playbackScope.getClass();
        yVar.getClass();
        this.a = albumScreenActivity;
        this.b = playbackScope;
        this.c = yVar;
        this.d = kkpVar;
        this.e = t1fVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(z5l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.f = new mmo(albumScreenActivity, playbackScope, (z5l) qdcVar.C(I), albumScreenActivity.d(), new m9j(0, albumScreenActivity, AlbumScreenActivity.class, "expand", "expand()V", 0, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [ezc, kotlin.jvm.functions.Function1] */
    public final void a(oq oqVar, boolean z, Function1 function1) {
        oqVar.getClass();
        z6n z6nVar = this.a.Z;
        if (z6nVar == null) {
            Intrinsics.j("urlPlayIntegration");
            throw null;
        }
        dyd dydVar = (dyd) z6nVar.b;
        if (dydVar == null || dydVar.c) {
            return;
        }
        xpt xptVar = (xpt) dydVar.b;
        ?? r6 = (ezc) function1;
        if (xptVar.a) {
            this.f.P(oqVar, z, xptVar, r6);
        }
        dydVar.c = true;
    }

    public final void b(oq oqVar) {
        oqVar.getClass();
        t1f t1fVar = this.e;
        rre.X(oqVar, (t) t1fVar.b, (kxi) t1fVar.d, (PlaybackScope) t1fVar.c);
    }

    public final void c(oq oqVar, Function0 function0, Function0 function02) {
        oqVar.getClass();
        j58 J = ild.J(oqVar);
        if (J == null) {
            return;
        }
        i58 i58Var = new i58();
        i58Var.l = J;
        i58Var.m = function0;
        i58Var.n = null;
        i58Var.o = function02;
        i58Var.E(this.c);
    }
}
