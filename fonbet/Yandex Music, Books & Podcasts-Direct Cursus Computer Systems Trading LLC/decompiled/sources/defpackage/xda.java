package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final class xda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yda b;
    public final /* synthetic */ xb1 c;

    public /* synthetic */ xda(yda ydaVar, xb1 xb1Var, int i) {
        this.a = i;
        this.b = ydaVar;
        this.c = xb1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xb1 xb1Var = this.c;
        yda ydaVar = this.b;
        switch (i) {
            case 0:
                c01 c01Var = xb1Var.a;
                ydaVar.getClass();
                c01Var.getClass();
                sda sdaVar = ydaVar.c;
                sdaVar.getClass();
                int i2 = ArtistScreenActivity.w0;
                t tVar = sdaVar.a;
                PlaybackScope d = d.d(c01Var);
                qi1 qi1Var = qi1.a;
                tVar.startActivity(l48.o(tVar, c01Var, d, 16));
                break;
            default:
                c01 c01Var2 = xb1Var.a;
                ydaVar.getClass();
                c01Var2.getClass();
                sda sdaVar2 = ydaVar.c;
                sdaVar2.getClass();
                lwg E = g0g.E(c01Var2);
                y supportFragmentManager = sdaVar2.a.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, E), d.d(c01Var2));
                break;
        }
        return Unit.a;
    }
}
