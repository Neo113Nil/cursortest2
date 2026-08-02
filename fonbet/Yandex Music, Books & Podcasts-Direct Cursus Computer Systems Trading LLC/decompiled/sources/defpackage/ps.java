package defpackage;

import android.database.SQLException;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.yandex.passport.internal.social.d;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p1;
import com.yandex.plus.bdui.plus.scenario.m;
import com.yandex.plus.home.feature.webviews.internal.uri.n;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class ps implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ps(m mVar, boolean z, d dVar) {
        this.a = 13;
        this.b = z;
        this.c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object[] objArr = 0;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                mmo mmoVar = (mmo) obj;
                if (z) {
                    ((ezc) mmoVar.f).invoke();
                }
                return Unit.a;
            case 1:
                bi1 bi1Var = (bi1) obj;
                if (z) {
                    ((ih1) bi1Var.f).invoke();
                }
                return Unit.a;
            case 2:
                st4 st4Var = (st4) obj;
                if (z) {
                    st4Var.d();
                }
                return Unit.a;
            case 3:
                e66 e66Var = (e66) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                e66Var.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                e66Var.a.d(sb);
                try {
                    p6g.H(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i2 = e66Var.g;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return Unit.a;
                }
            case 4:
                return qld.v(((mcu) obj).b(), z);
            case 5:
                MainScreenActivity mainScreenActivity = (MainScreenActivity) obj;
                if (z) {
                    lhs lhsVar = MainScreenActivity.Q0;
                    jyr jyrVar = p6m.f;
                    if (o6m.c()) {
                        x97.y(wyf.F(mainScreenActivity.getLifecycle()), null, null, new zig(mainScreenActivity, (Continuation) null, mainScreenActivity), 3);
                        return Unit.a;
                    }
                }
                MainScreenActivity.F(mainScreenActivity);
                return Unit.a;
            case 6:
                o0j o0jVar = (o0j) obj;
                if (Intrinsics.d(o0jVar.d, Boolean.valueOf(z))) {
                    return Unit.a;
                }
                if (o0jVar.d != null) {
                    qdc qdcVar = o0jVar.a;
                    k5r.t(qdcVar, qdcVar, z ? "wm_connection_established" : "wm_connection_lost");
                }
                o0jVar.d = Boolean.valueOf(z);
                Iterator it = o0jVar.b.iterator();
                while (it.hasNext()) {
                    l0j l0jVar = (l0j) it.next();
                    if (z) {
                        o0j o0jVar2 = l0jVar.a;
                        o0jVar2.e.getClass();
                        o0jVar2.b.remove(l0jVar);
                        l0jVar.b.invoke();
                    } else {
                        l0jVar.getClass();
                    }
                }
                return Unit.a;
            case 7:
                cxl cxlVar = (cxl) obj;
                if (z) {
                    cxlVar.d.invoke();
                }
                return Unit.a;
            case 8:
                iyq iyqVar = (iyq) obj;
                iyqVar.b().a(z);
                dyq b = iyqVar.b();
                x97.y(b.d, null, null, new byq(b, objArr == true ? 1 : 0, r4), 3);
                return Unit.a;
            case 9:
                Window window = (Window) obj;
                window.getClass();
                c9g.u(window, vyr.StatusBar, z);
                return Unit.a;
            case 10:
                syv syvVar = ((t1w) obj).l;
                if (!syvVar.j) {
                    ((lhs) syvVar.c.getValue()).g = -1L;
                    if (syvVar.i) {
                        ((lhs) syvVar.e.getValue()).d();
                    } else if (!z) {
                        ((lhs) syvVar.f.getValue()).d();
                    }
                    if (!syvVar.h) {
                        v0w v0wVar = (v0w) syvVar.a.b;
                        suc sucVar = v0wVar.l;
                        boolean B = v0wVar.B();
                        sucVar.f.c();
                        if (B) {
                            sucVar.a();
                        } else {
                            sucVar.g.d();
                        }
                        syvVar.h = true;
                    }
                    syvVar.j = true;
                }
                return Unit.a;
            case 11:
                return p1.a((View) obj, z);
            case 12:
                ((TextView) obj).setVisibility(z ? 0 : 8);
                return Unit.a;
            case 13:
                return Boolean.valueOf(((d) obj).b == 0 ? z : false);
            case 14:
                com.yandex.plus.home.feature.webviews.internal.d dVar = (com.yandex.plus.home.feature.webviews.internal.d) obj;
                if (!Intrinsics.d(dVar.j, Boolean.valueOf(z))) {
                    dVar.l();
                }
                return Unit.a;
            default:
                return uah.i((Map) ((n) obj).d.getValue(), tah.b(new Pair("available_features", vop.f("BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "SERVICE_INFORMATION", "MINI_STORIES", z ? "COOKIE_INJECT" : null, "CARD_OVER_BRIDGE", "PAY_BUTTON_CONFIG", "ANDROID_SELL_IN_STORY", "ONLY_AUTHORIZED_PURCHASE", "NATIVE_PURCHASE", "INAPP_PURCHASE", "HOST_PURCHASE", "PURCHASE_TARIFFICATOR", "NATIVE_VIBRATE"))));
        }
    }

    public /* synthetic */ ps(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ ps(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
