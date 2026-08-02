package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes5.dex */
public final class bx5 implements tft {
    public final jyr a;

    public bx5(int i) {
        switch (i) {
            case 1:
                this.a = l18.b.b(hag.I(frt.class), true);
                break;
            case 2:
                this.a = l18.b.b(hag.I(y60.class), true);
                break;
            default:
                this.a = l18.b.b(hag.I(cx5.class), true);
                break;
        }
    }

    public static void a(kyd kydVar, long j) {
        kydVar.getClass();
        y2x.t(1000L, kydVar.b, kydVar.c, kydVar.a).c(j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.tft
    public Intent p(Context context, Intent intent, kqt kqtVar) {
        kqtVar.getClass();
        boolean z = v3g.E((frt) this.a.getValue()).h;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((u36) ((byb) qdcVar.C(I)).c(ern.a(u36.class))).h() && kqtVar.c == 1 && z) {
            lhs lhsVar = MainScreenActivity.Q0;
            return imp.J(context, rf3.j, null, null, 12);
        }
        Intent z2 = StubActivity.z(context, rpt.NOT_FOUND);
        z2.getClass();
        return z2;
    }

    public bx5(nyf nyfVar) {
        nyfVar.getClass();
        this.a = l18.b.b(hag.I(bsr.class), true);
        nyfVar.a(new ao7(5, kyf.ON_DESTROY, this));
    }
}
