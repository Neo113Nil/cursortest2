package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.yandex.music.skeleton.blocks.banner.data.BannerBlockApi;
import com.yandex.pulse.metrics.o;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class uu1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ uu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 20;
        int i2 = 11;
        switch (this.a) {
            case 0:
                return new HashMap();
            case 1:
                dxa dxaVar = new dxa();
                dxaVar.a = new axq(60, 10.0f);
                dxaVar.b = new axq(40, 3.0f);
                dxaVar.c = new axq(20, 1.0f);
                return dxaVar;
            case 2:
                return new kz1();
            case 3:
                return new cvo(wjb.CollectionAudiobooksScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 4:
                return new w12();
            case 5:
                jyr jyrVar = dzq.f;
                return Boolean.valueOf(quk.f());
            case 6:
                return new td(i);
            case 7:
                return new td(i2);
            case 8:
                return new gsj(i2);
            case 9:
                return new td(28);
            case 10:
                return new wjg(0, new xjf(23));
            case 11:
                HandlerThread handlerThread = new HandlerThread("Music:Background");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 12:
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (BannerBlockApi) ((upq) qdcVar.C(I)).c().a.b(BannerBlockApi.class);
            case 13:
                return new lnq();
            case 14:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((dn2) ((byb) qdcVar2.C(I2)).b(dn2.class)).h());
            case 15:
                throw new IllegalStateException("BarAboveUiConfig is not initialized");
            case 16:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((dn2) ((byb) qdcVar3.C(I3)).b(dn2.class)).h());
            case 17:
                return qld.m();
            case 18:
                jyr jyrVar2 = dvu.e;
                return kwl.c();
            case 19:
                jyr jyrVar3 = dvu.e;
                return Boolean.valueOf(kwl.d());
            case 20:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return Boolean.valueOf(((ykj) ((byb) qdcVar4.C(I4)).b(ykj.class)).h());
            case 21:
                return Boolean.valueOf(((pf3) ((byb) l18.b.c(hag.I(byb.class))).b(pf3.class)).h());
            case 22:
                return qld.m();
            case 23:
                return qld.m();
            case 24:
                return new x83();
            case 25:
                return new y83();
            case 26:
                return Unit.a;
            case 27:
                return szf.g0(Boolean.TRUE);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return szf.g0(new jcj(j0s.a, true));
            default:
                return new t6k(0.0f);
        }
    }

    public /* synthetic */ uu1(ikg ikgVar, int i) {
        this.a = i;
    }
}
