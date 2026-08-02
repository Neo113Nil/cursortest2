package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.mixes.MixesScreenActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class qbp extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbp(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Continuation continuation = null;
        int i = 1;
        switch (this.a) {
            case 0:
                ((u8q) this.receiver).K();
                break;
            case 1:
                ((u8q) this.receiver).K();
                break;
            case 2:
                xep xepVar = (xep) this.receiver;
                xepVar.b();
                xepVar.i();
                break;
            case 3:
                ((xep) this.receiver).k();
                break;
            case 4:
                ((mpp) this.receiver).a.getOnBackPressedDispatcher().d();
                break;
            case 5:
                mpp mppVar = (mpp) this.receiver;
                ((tnb) mppVar.b.c.getValue()).i(sjb.SettingsClearMemory);
                crt crtVar = (crt) mppVar.d.getValue();
                crtVar.getClass();
                x97.y(cmd.a, dm6.b, null, new brt(crtVar, continuation, i), 2);
                rar rarVar = crtVar.f;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                tqn tqnVar = new tqn();
                tqnVar.a = true;
                crtVar.f = x97.y(crtVar.g, null, null, new h0t(crtVar, tqnVar, continuation, 5), 3);
                mppVar.a.getOnBackPressedDispatcher().d();
                break;
            case 6:
                ((eqp) this.receiver).b.a.getOnBackPressedDispatcher().d();
                break;
            case 7:
                ((lrp) this.receiver).d();
                break;
            case 8:
                ((lrp) this.receiver).c();
                break;
            case 9:
                ((lrp) this.receiver).e();
                break;
            case 10:
                ((lrp) this.receiver).f();
                break;
            case 11:
                ((lrp) this.receiver).g();
                break;
            case 12:
                ((lrp) this.receiver).h();
                break;
            case 13:
                ((lrp) this.receiver).b();
                break;
            case 14:
                ((sai) this.receiver).a();
                break;
            case 15:
                ((sai) this.receiver).a();
                break;
            case 16:
                ((rwp) this.receiver).dismissAllowingStateLoss();
                break;
            case 17:
                uwp uwpVar = (uwp) this.receiver;
                qf1 qf1Var = uwpVar.b;
                String string = uwpVar.a.getString(R.string.url_yandex_plus_conditions);
                string.getClass();
                w1g.y(qf1Var.a, string, true);
                break;
            case 18:
                uwp uwpVar2 = (uwp) this.receiver;
                qf1 qf1Var2 = uwpVar2.b;
                String string2 = uwpVar2.a.getString(R.string.url_yandex_plus_privilege_list);
                string2.getClass();
                w1g.y(qf1Var2.a, string2, true);
                break;
            case 19:
                wwp wwpVar = (wwp) this.receiver;
                qf1 qf1Var3 = wwpVar.b;
                rwp rwpVar = new rwp();
                y yVar = qf1Var3.b;
                yVar.getClass();
                x7f.B(rwpVar, yVar, "SHARE_DETAILS_INFO_COMPAT");
                x3n x3nVar = wwpVar.c;
                nmb nmbVar = (nmb) ((jyr) x3nVar.b).getValue();
                String G = ((fnb) x3nVar.c).G();
                cvo cvoVar = (cvo) x3nVar.d;
                wjb wjbVar = cvoVar.a;
                ilb ilbVar = ilb.Sheet;
                glb glbVar = glb.Bottom;
                avo avoVar = cvoVar.e;
                pkb pkbVar = avoVar.a;
                String str = avoVar.b;
                qkb qkbVar = qkb.Carousel;
                String str2 = (String) x3nVar.a;
                if (str2 == null) {
                    str2 = "None";
                }
                String a = cvoVar.a();
                nmbVar.n(cvoVar.a, wjb.SubscriptionConditionsScreen, G, wjbVar, (r60 & 16) != 0 ? ilb.Fullscreen : ilbVar, (r60 & 32) != 0 ? glb.Fullscreen : glbVar, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : pkbVar, (r60 & 256) != 0 ? "" : str, avoVar.a, avoVar.b, (r60 & 2048) != 0 ? 0 : 0, (r60 & 4096) != 0 ? 0 : 0, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, "share_subscription", "share_subscription", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : null, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str2, a, "", (r60 & 268435456) != 0 ? "" : null);
                break;
            case 20:
                ((pgq) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 21:
                sgq sgqVar = ((pgq) this.receiver).a;
                sgqVar.m = true;
                sgqVar.G();
                sgqVar.o.h();
                break;
            case 22:
                sgq sgqVar2 = ((pgq) this.receiver).a;
                sgqVar2.G();
                sgqVar2.o.i();
                break;
            case 23:
                ((bc5) this.receiver).a();
                break;
            case 24:
                ejq ejqVar = (ejq) this.receiver;
                Object value = ejqVar.c.getValue();
                njq njqVar = value instanceof njq ? (njq) value : null;
                if (njqVar != null) {
                    eul eulVar = njqVar.a;
                    rjp rjpVar = ejqVar.b;
                    dud k0 = hdg.k0(eulVar.d);
                    int i2 = PlaylistScreenActivity.B0;
                    ((Context) rjpVar.a).startActivity(dxl.j((Context) rjpVar.a, new jxl(eulVar.a, eulVar.b), k0, d.p(((djq) ((s63) rjpVar.b).a).a), null, 112));
                    ejqVar.a.f.e(ox6.M(eulVar, 0, ""), null);
                }
                break;
            case 25:
                ((qqq) this.receiver).c.a.getOnBackPressedDispatcher().d();
                break;
            case 26:
                t tVar = ((qqq) this.receiver).c.a;
                int i3 = MixesScreenActivity.Y;
                tVar.startActivity(new Intent(tVar, (Class<?>) MixesScreenActivity.class));
                break;
            case 27:
                t tVar2 = ((qqq) this.receiver).c.a;
                lhs lhsVar = MainScreenActivity.Q0;
                tVar2.startActivity(imp.J(tVar2, rf3.h, null, null, 12));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                t tVar3 = ((qqq) this.receiver).c.a;
                lhs lhsVar2 = MainScreenActivity.Q0;
                tVar3.startActivity(imp.J(tVar3, rf3.l, null, null, 12));
                break;
            default:
                ((qqq) this.receiver).b.S();
                break;
        }
        return Unit.a;
    }
}
