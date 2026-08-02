package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.f;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class zy extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String a;
        switch (this.a) {
            case 0:
                ((fz) this.receiver).b();
                break;
            case 1:
                v7g.L(((dy) this.receiver).a, new lik(vik.a, null, null));
                break;
            case 2:
                ((bg5) this.receiver).a();
                break;
            case 3:
                ((bg5) this.receiver).d();
                break;
            case 4:
                ((bg5) this.receiver).e();
                break;
            case 5:
                ((v40) this.receiver).d.B();
                break;
            case 6:
                t tVar = ((v40) this.receiver).c.a;
                int i = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.b, p0p.q));
                break;
            case 7:
                v40 v40Var = (v40) this.receiver;
                v40Var.a.a(v40Var.f, new m5(1, v40Var.b, y40.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 8));
                break;
            case 8:
                a60 a60Var = (a60) this.receiver;
                xbc xbcVar = a60Var.a;
                e60 e60Var = a60Var.b;
                xbcVar.a(e60Var.l, new m5(1, e60Var, e60.class, "onSortItemClick", "onSortItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 9));
                break;
            case 9:
                t tVar2 = ((a60) this.receiver).c.a;
                int i2 = SearchActivity.Z;
                tVar2.startActivity(rvf.F(tVar2, c0p.c, p0p.q));
                break;
            case 10:
                ((a60) this.receiver).d.B();
                break;
            case 11:
                View view = (View) this.receiver;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    qdq.M(view);
                }
                if (i3 >= 29 && (r2 = mi.o(view)) != null) {
                    break;
                }
                break;
            case 12:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.j1;
                if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
                    androidComposeView.clearFocus();
                } else if (androidComposeView.hasFocus()) {
                    View findFocus = androidComposeView.findFocus();
                    if (findFocus != null) {
                        findFocus.clearFocus();
                    }
                    androidComposeView.clearFocus();
                }
                break;
            case 13:
                AndroidComposeView androidComposeView2 = (AndroidComposeView) this.receiver;
                Class cls2 = AndroidComposeView.j1;
                break;
            case 14:
                ((f11) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 15:
                m11 m11Var = ((f11) this.receiver).a;
                m11Var.n = true;
                m11Var.p.h();
                break;
            case 16:
                ((f11) this.receiver).a.p.i();
                break;
            case 17:
                ((sai) this.receiver).a();
                break;
            case 18:
                ((b21) this.receiver).c();
                break;
            case 19:
                b21 b21Var = (b21) this.receiver;
                b21Var.c.a(sjb.Share);
                x11 x11Var = b21Var.d;
                c01 c01Var = b21Var.a;
                c01Var.getClass();
                x11Var.e.invoke();
                Activity activity = x11Var.a;
                y yVar = x11Var.c;
                mvp mvpVar = (mvp) x11Var.f.getValue();
                pu0 t = pd.t(new qzm[0]);
                fnb fnbVar = x11Var.d.a;
                mvpVar.getClass();
                yVar.getClass();
                fnbVar.getClass();
                if (c01Var.e) {
                    zwp zwpVar = new zwp(new exp(c01Var.a), c01Var.q, c01Var.b, "");
                    sai saiVar = new sai(false);
                    cvo cvoVar = cvo.i;
                    e3s.X(o6m.b(wjb.ShareScreen, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t, mvpVar, zwpVar, saiVar, activity, yVar, fnbVar, 4), 1326092232, true), 48);
                }
                break;
            case 20:
                b21 b21Var2 = (b21) this.receiver;
                b21Var2.c.a(sjb.PlayOnDevice);
                x11 x11Var2 = b21Var2.d;
                c01 c01Var2 = b21Var2.a;
                List list = b21Var2.i;
                c01Var2.getClass();
                list.getClass();
                x11Var2.e.invoke();
                PlaybackScope f = d.f(c01Var2.a, c01Var2.b);
                ((e) x11Var2.h.getValue()).getClass();
                String a2 = f.d(c01Var2).a();
                Activity activity2 = x11Var2.a;
                r1n r1nVar = r1n.b;
                ((f) x11Var2.g.getValue()).getClass();
                c b = f.b();
                kxi kxiVar = x11Var2.d;
                new j2n(activity2, kxiVar.a, r1nVar, new m2n(c01Var2, list, b, a2, kxiVar), true).m();
                break;
            case 21:
                ((b21) this.receiver).c();
                break;
            case 22:
                s31 s31Var = (s31) this.receiver;
                o43 o43Var = s31Var.b.g.e;
                if (o43Var != null && (a = o43Var.a()) != null) {
                    rmb.k(s31Var.c, a, null, null, 6);
                    w1g.y((hn5) s31Var.d.b, a, true);
                }
                break;
            case 23:
                ((d41) this.receiver).getClass();
                break;
            case 24:
                ((d41) this.receiver).c();
                break;
            case 25:
                ((d41) this.receiver).c();
                break;
            case 26:
                ((d41) this.receiver).getClass();
                break;
            case 27:
                ((bc5) this.receiver).a();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((bc5) this.receiver).d();
                break;
            default:
                ((t71) this.receiver).c();
                break;
        }
        return Unit.a;
    }
}
