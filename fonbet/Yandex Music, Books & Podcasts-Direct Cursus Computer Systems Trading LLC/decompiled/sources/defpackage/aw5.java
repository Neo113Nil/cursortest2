package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.Choreographer;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class aw5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aw5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        we weVar;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        ?? r4 = 0;
        ?? r42 = 0;
        ?? r43 = 0;
        switch (this.a) {
            case 0:
                tnb tnbVar = (tnb) this.b;
                nsh nshVar = (nsh) this.c;
                tnb.d(tnbVar, wjb.ConcertPurchaseScreen);
                qxp qxpVar = (qxp) nshVar.b;
                String str = ((bz5) nshVar.c).a;
                String str2 = ((ew5) nshVar.d).h;
                qxpVar.getClass();
                str.getClass();
                str2.getClass();
                a0g.D(((bz5) qxpVar.a).c, str, str2);
                return Unit.a;
            case 1:
                d31 d31Var = (d31) this.b;
                tdl tdlVar = ((f31) ((g31) this.c)).c;
                d31Var.getClass();
                d31Var.a.a(tdlVar);
                xdl xdlVar = d31Var.b;
                wjb wjbVar = wjb.ConcertScreen;
                gke gkeVar = xdlVar.c;
                if (gkeVar != null) {
                    xdlVar.a.c(gkeVar, wjbVar, "");
                }
                y21 y21Var = d31Var.c;
                String str3 = tdlVar.b;
                String str4 = tdlVar.a.a;
                Context context = y21Var.a;
                Activity R = vq2.R(context);
                ConcertActivity concertActivity = R instanceof ConcertActivity ? (ConcertActivity) R : null;
                if (concertActivity != null) {
                    jyr jyrVar = concertActivity.Y;
                    str4.getClass();
                    if (jyrVar.isInitialized() && !concertActivity.isDestroyed() && !concertActivity.isFinishing()) {
                        vs5 vs5Var = (vs5) jyrVar.getValue();
                        z = Intrinsics.d(vs5Var != null ? vs5Var.a : null, str4);
                    }
                    if (z) {
                        xy5 xy5Var = (xy5) concertActivity.Z.getValue();
                        o C = concertActivity.getSupportFragmentManager().C(R.id.fragment_container_view);
                        if (C != null) {
                            xy5Var.getClass();
                            if (C instanceof dz5) {
                                dz5 dz5Var = (dz5) C;
                                x97.y(wyf.F(dz5Var.getLifecycle()), null, null, new ja4(dz5Var, r4 == true ? 1 : 0, 14), 3);
                            }
                        }
                    }
                }
                if (!z) {
                    int i = ConcertActivity.w0;
                    context.startActivity(bkp.j0(context, str4, str3));
                }
                return Unit.a;
            case 2:
                c4 c4Var = (c4) this.b;
                return new ey5((String) c4Var.d, (dy5) c4Var.e, (i06) c4Var.c, (tmb) this.c, new fp5(2));
            case 3:
                eps epsVar = (eps) this.b;
                us5 us5Var = (us5) this.c;
                epsVar.getClass();
                String str5 = us5Var.p;
                if (str5 != null) {
                    ((ty5) epsVar.d).C(str5);
                }
                return Unit.a;
            case 4:
                return new tmb(12, ((kxi) this.b).a, (cvo) this.c).a(new jab(qkb.ConcertHeader, 1, 1, 1), null);
            case 5:
                String str6 = (String) this.b;
                t36 t36Var = (t36) this.c;
                if (str6 == null) {
                    return Unit.a;
                }
                t36Var.getClass();
                w1g.y(t36Var.a, str6, true);
                return Unit.a;
            case 6:
                return new IllegalRequestOnNetworkModeException((String) this.b, (v76) this.c);
            case 7:
                return new ik6((hk6) ((zx7) this.b).getValue(), (sk6) this.c);
            case 8:
                ((pc5) this.b).f(((j1g) ((aqi) this.c).getValue()) == j1g.a);
                return Unit.a;
            case 9:
                try {
                    return ((Context) this.b).getContentResolver().openInputStream((Uri) this.c);
                } catch (IllegalArgumentException e) {
                    Assertions.throwOrSkip("CoverProcessingUtils", new FailedAssertionException("Can't read file data", e));
                    throw new IOException("Can't open uri", e);
                } catch (SecurityException e2) {
                    Assertions.throwOrSkip("CoverProcessingUtils", new FailedAssertionException("No read permission", e2));
                    throw new IOException("Can't open uri", e2);
                }
            case 10:
                xxk xxkVar = (xxk) this.b;
                xo6 xo6Var = (xo6) this.c;
                String str7 = xxkVar.e;
                d85 d85Var = xxkVar.f;
                Context context2 = xo6Var.a;
                l18 l18Var = l18.b;
                bdt I = hag.I(cce.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new bo6(str7, d85Var, context2, (cce) qdcVar.C(I), xo6Var.b);
            case 11:
                kr6 kr6Var = (kr6) this.b;
                Function0 function0 = (Function0) this.c;
                xdr xdrVar = kr6Var.a.m;
                or6 or6Var = or6.a;
                xdrVar.getClass();
                xdrVar.m(null, or6Var);
                function0.invoke();
                return Unit.a;
            case 12:
                ((kv6) this.b).x0((cv6) this.c);
                return Unit.a;
            case 13:
                return emm.a(((dc7) this.b).a, (String) this.c);
            case 14:
                md mdVar = (md) this.b;
                bq7 bq7Var = (bq7) this.c;
                if (mdVar != null) {
                    List f = bq7Var.a.c.f();
                    ListIterator listIterator = f.listIterator(f.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            weVar = listIterator.previous();
                            if (((o) weVar) instanceof we) {
                            }
                        } else {
                            weVar = null;
                        }
                    }
                    we weVar2 = weVar instanceof we ? weVar : null;
                    if (weVar2 != null) {
                        weVar2.c(mdVar);
                    }
                }
                return Unit.a;
            case 15:
                n18 n18Var = (n18) this.b;
                bdt bdtVar = (bdt) this.c;
                qdc qdcVar2 = n18Var.a;
                qdcVar2.getClass();
                return qdcVar2.C(bdtVar);
            case 16:
                g88 g88Var = (g88) this.b;
                o78 o78Var = (o78) this.c;
                if (g88Var.equals(l48.c)) {
                    o78Var.a.b.a();
                } else {
                    if (!g88Var.equals(fs7.c)) {
                        b6e.s();
                        return null;
                    }
                    n78 n78Var = o78Var.a;
                    n78Var.b.a();
                    t tVar = n78Var.a;
                    SettingsActivity.v0.getClass();
                    Intent intent = new Intent(tVar, (Class<?>) SettingsActivity.class);
                    intent.putExtra("ARG_OPEN_CLEAR_MEMORY", true);
                    tVar.startActivity(intent);
                }
                return Unit.a;
            case 17:
                return ((dc7) ((cc7) ((jyr) this.b).getValue())).c(((frt) ((jyr) this.c).getValue()).c().a, "disk_space_dialog_storage");
            case 18:
                Activity activity = (Activity) this.b;
                m88 m88Var = (m88) this.c;
                if (activity instanceof np2) {
                    return (np2) activity;
                }
                ru.yandex.music.utils.Assertions.fail(m88Var + " has to be attached to BaseActivity in order to use shared tabs");
                return null;
            case 19:
                qne.v((qne) this.b, new o88(), ((r88) this.c).j, 4);
                return Unit.a;
            case 20:
                ((Context) ((pt0) this.b).a).unregisterComponentCallbacks((et8) this.c);
                return Unit.a;
            case 21:
                Choreographer.getInstance().postFrameCallback(new f3a(z ? 1 : 0, (o3a) this.b, (l6a) this.c));
                return Unit.a;
            case 22:
                b61 b61Var = (b61) this.b;
                udl udlVar = ((d61) ((e61) this.c)).c;
                b61Var.getClass();
                b61Var.a.a(udlVar);
                xdl xdlVar2 = b61Var.b;
                String str8 = udlVar.a.a;
                wjb wjbVar2 = wjb.Link;
                gke gkeVar2 = xdlVar2.c;
                if (gkeVar2 != null) {
                    xdlVar2.a.c(gkeVar2, wjbVar2, str8);
                }
                wnd wndVar = b61Var.c;
                jyr jyrVar2 = y7a.a;
                y7a.a(wndVar.b, str8, false);
                return Unit.a;
            case 23:
                rdk rdkVar = (rdk) this.b;
                Uri uri = (Uri) this.c;
                if (Build.VERSION.SDK_INT >= 29) {
                    rdkVar.W(uri);
                } else {
                    ((x0) rdkVar.d).Z(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new pt0(rdkVar, uri));
                }
                return Unit.a;
            case 24:
                return CollectionsKt.w0(CollectionsKt.U((List) ((jyr) this.c).getValue(), CollectionsKt.u0((ArrayList) this.b)));
            case 25:
                return new wca((sca) this.b, ((yka) ((vka) this.c).a).e);
            case 26:
                return new sga((oga) this.b, ((yka) ((vka) this.c).a).e);
            case 27:
                return new km2((hta) this.b, (jnq) this.c);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                x97.y((mm6) this.b, null, null, new g68((e2o) this.c, r42 == true ? 1 : 0, 9), 3);
                return Unit.a;
            default:
                sxa sxaVar = (sxa) this.b;
                gxa gxaVar = ((uxa) this.c).d;
                if (gxaVar == null) {
                    sxaVar.getClass();
                } else {
                    sxaVar.c.b(gxaVar.a);
                    xxa xxaVar = sxaVar.a;
                    xxaVar.getClass();
                    x97.y(ot0.F(xxaVar), null, null, new f98(xxaVar, new hxa(gxaVar.b), (Continuation) (r43 == true ? 1 : 0), 18), 3);
                }
                return Unit.a;
        }
    }
}
