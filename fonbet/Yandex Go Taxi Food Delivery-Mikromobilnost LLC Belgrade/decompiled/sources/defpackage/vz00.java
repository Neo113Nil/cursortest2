package defpackage;

import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.masstransit.stop.router.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class vz00 implements l010 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ vz00(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.l010
    public final void a(String str, String str2) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                d dVar = (d) h55Var;
                e310 e310Var = dVar.e0;
                if (e310Var != null) {
                    dVar.U(e310Var, null, new d4l0(str2, str));
                    break;
                }
                break;
            case 1:
                ((b) h55Var).r(new r(str2, str, 17));
                break;
            default:
                ((ru.yandex.taxi.masstransit.stoproute.router.b) h55Var).r(new r(str2, str, 18));
                break;
        }
    }
}
