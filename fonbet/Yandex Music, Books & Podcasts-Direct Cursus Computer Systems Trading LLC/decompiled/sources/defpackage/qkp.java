package defpackage;

import android.os.Bundle;
import com.yandex.pulse.metrics.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class qkp implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ qkp(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        int i2 = 1;
        int i3 = 3;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                return new alp(Bundle.EMPTY, "stubNext");
            case 1:
                return new and(new l48(new e()));
            case 2:
                return new cmp();
            case 3:
                return new zm4();
            case 4:
                l18 l18Var = l18.b;
                bdt I = hag.I(qqp.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (crt) ((qqp) qdcVar.C(I)).c.getValue();
            case 5:
                return new pqp();
            case 6:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(qqp.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                ((isp) ((qqp) qdcVar2.C(I2)).b.getValue()).getClass();
                return new cqp();
            case 7:
                return new isp();
            case 8:
                return (crt) l18.b.c(hag.I(crt.class));
            case 9:
                jyr jyrVar = dzq.f;
                return Boolean.valueOf(quk.f());
            case 10:
                return new irp();
            case 11:
                return new grp();
            case 12:
                return new wjg(i, new xjf(23));
            case 13:
                float f = trp.a;
                return Float.valueOf(1.0f);
            case 14:
                return qld.m();
            case 15:
                jyr jyrVar2 = ntp.e;
                return (vxb) l18.b.c(hag.I(vxb.class));
            case 16:
                eg0 eg0Var = new eg0();
                l18 l18Var3 = l18.b;
                eg0Var.c = l18Var3.b(hag.I(z66.class), true);
                eg0Var.d = l18Var3.b(hag.I(e5c.class), true);
                eg0Var.e = btf.b(new qkp(18));
                eg0Var.f = btf.b(new oxo(12, eg0Var));
                eg0Var.g = l18Var3.b(hag.I(owp.class), true);
                eg0Var.a = R.string.share_track_copy_link_title;
                eg0Var.b = R.string.facebook_music_app_id;
                return new cxp(eg0Var);
            case 17:
                return qld.m();
            case 18:
                return new nxp();
            case 19:
                l18 l18Var4 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var4.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((xg5) ((byb) qdcVar3.C(I3)).b(xg5.class)).h());
            case 20:
                return "BduiLottie";
            case 21:
                return "Bdu";
            case 22:
                l18 l18Var5 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var5.a;
                qdcVar4.getClass();
                return Boolean.valueOf(((yz9) ((byb) qdcVar4.C(I4)).b(yz9.class)).h());
            case 23:
                l18 l18Var6 = l18.b;
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var6.a;
                qdcVar5.getClass();
                return Boolean.valueOf(((xg5) ((byb) qdcVar5.C(I5)).b(xg5.class)).h());
            case 24:
                l18 l18Var7 = l18.b;
                bdt I6 = hag.I(byb.class);
                qdc qdcVar6 = l18Var7.a;
                qdcVar6.getClass();
                return Boolean.valueOf(((xg5) ((byb) qdcVar6.C(I6)).b(xg5.class)).h());
            case 25:
                return new p31();
            case 26:
                return new pk1();
            case 27:
                return szf.g0(Boolean.FALSE);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new p1q(new vzp(10), new cle((pyc) new q1q(i3, i, continuation), (Continuation) null, 22));
            default:
                return new p1q(new vzp(11), new cle((pyc) new q1q(i3, i2, continuation), (Continuation) null, 22));
        }
    }

    public /* synthetic */ qkp(int i, Object obj) {
        this.a = i;
    }
}
