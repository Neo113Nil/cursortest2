package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class wef implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zef b;
    public final /* synthetic */ qvl c;

    public /* synthetic */ wef(zef zefVar, qvl qvlVar, int i) {
        this.a = i;
        this.b = zefVar;
        this.c = qvlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qvl qvlVar = this.c;
        zef zefVar = this.b;
        switch (i) {
            case 0:
                cvl cvlVar = qvlVar.b;
                zefVar.getClass();
                oef oefVar = zefVar.c;
                oefVar.getClass();
                t tVar = oefVar.a;
                h l = d.l();
                int i2 = PlaylistScreenActivity.B0;
                tVar.startActivity(dxl.f(tVar, cvlVar, false, null, mxl.a, l));
                break;
            default:
                cvl cvlVar2 = qvlVar.b;
                zefVar.getClass();
                oef oefVar2 = zefVar.c;
                oefVar2.getClass();
                t tVar2 = oefVar2.a;
                lwg G = g0g.G(cvlVar2);
                y supportFragmentManager = tVar2.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), d.t());
                break;
        }
        return Unit.a;
    }
}
