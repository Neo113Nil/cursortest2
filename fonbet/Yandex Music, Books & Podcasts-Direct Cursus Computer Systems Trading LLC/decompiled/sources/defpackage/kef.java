package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class kef extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kef(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        f4h f4hVar;
        Object obj2;
        int i = 12;
        boolean z = true;
        int i2 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        switch (this.a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                v2s v2sVar = (v2s) ((jef) this.receiver).b.N().getValue();
                if (v2sVar != null) {
                    v2sVar.g(intValue);
                }
                return Unit.a;
            case 1:
                vbc vbcVar = (vbc) obj;
                vbcVar.getClass();
                cff cffVar = (cff) this.receiver;
                cffVar.getClass();
                x97.y(ot0.F(cffVar), null, null, new ptd(cffVar, vbcVar, objArr == true ? 1 : 0, 11), 3);
                return Unit.a;
            case 2:
                vbc vbcVar2 = (vbc) obj;
                vbcVar2.getClass();
                dff dffVar = (dff) this.receiver;
                dffVar.getClass();
                x97.y(ot0.F(dffVar), null, null, new ptd(dffVar, vbcVar2, objArr2 == true ? 1 : 0, i), 3);
                return Unit.a;
            case 3:
                vbc vbcVar3 = (vbc) obj;
                vbcVar3.getClass();
                fhf fhfVar = (fhf) this.receiver;
                fhfVar.getClass();
                x97.y(ot0.F(fhfVar), null, null, new ptd(fhfVar, vbcVar3, objArr3 == true ? 1 : 0, 14), 3);
                return Unit.a;
            case 4:
                vbc vbcVar4 = (vbc) obj;
                vbcVar4.getClass();
                ghf ghfVar = (ghf) this.receiver;
                ghfVar.getClass();
                x97.y(ot0.F(ghfVar), null, null, new ptd(ghfVar, vbcVar4, objArr4 == true ? 1 : 0, 15), 3);
                return Unit.a;
            case 5:
                kyf kyfVar = (kyf) obj;
                kyfVar.getClass();
                ((krf) this.receiver).b(kyfVar);
                return Unit.a;
            case 6:
                orf orfVar = (orf) obj;
                orfVar.getClass();
                ((krf) this.receiver).a(orfVar);
                return Unit.a;
            case 7:
                ((f7n) this.receiver).getClass();
                return Boolean.valueOf(f7n.a((yxc) obj));
            case 8:
                w3h w3hVar = (w3h) obj;
                w3hVar.getClass();
                ((c6h) this.receiver).a(w3hVar);
                return Unit.a;
            case 9:
                loa loaVar = (loa) obj;
                loaVar.getClass();
                ((c6h) this.receiver).b(loaVar);
                return Unit.a;
            case 10:
                z2h z2hVar = (z2h) obj;
                z2hVar.getClass();
                xdr xdrVar = ((e3h) this.receiver).i;
                do {
                    value = xdrVar.getValue();
                    f4hVar = (f4h) value;
                    if (!Intrinsics.d(f4hVar, a4h.a) && !(f4hVar instanceof b4h) && !(f4hVar instanceof c4h)) {
                        if (!(f4hVar instanceof d4h)) {
                            b6e.s();
                            return null;
                        }
                        d4h d4hVar = (d4h) f4hVar;
                        f4hVar = new d4h(d4hVar.a, z2hVar, d4hVar.c);
                    }
                } while (!xdrVar.k(value, f4hVar));
                return Unit.a;
            case 11:
                return ((t5h) this.receiver).a((Continuation) obj);
            case 12:
                String str = (String) obj;
                str.getClass();
                w8i w8iVar = (w8i) this.receiver;
                w8iVar.getClass();
                qec qecVar = w8iVar.b;
                qecVar.getClass();
                ((k7i) ((v8i) qecVar.b).k.getValue()).a(str);
                return Unit.a;
            case 13:
                rf3 rf3Var = (rf3) obj;
                rf3Var.getClass();
                kii kiiVar = (kii) this.receiver;
                Iterator it = ((Iterable) kiiVar.l.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((tf3) obj2).b) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                tf3 tf3Var = (tf3) obj2;
                rf3 rf3Var2 = tf3Var != null ? tf3Var.a : null;
                fii fiiVar = kiiVar.i;
                if (rf3Var2 != rf3Var) {
                    if (Intrinsics.d(fiiVar != null ? Boolean.valueOf(fiiVar.l(rf3Var)) : null, Boolean.TRUE)) {
                        kiiVar.t(rf3Var, false);
                    }
                } else if (fiiVar != null) {
                    fiiVar.a(rf3Var);
                }
                return Unit.a;
            case 14:
                ((uhh) this.receiver).d((List) obj);
                return Unit.a;
            case 15:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                osh oshVar = ((j76) this.receiver).d;
                if (booleanValue) {
                    x97.y(((qnq) oshVar.a).c, null, null, new ja4(oshVar, objArr5 == true ? 1 : 0, 17), 3);
                }
                return Unit.a;
            case 16:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                w8j w8jVar = (w8j) this.receiver;
                w8jVar.getClass();
                w8jVar.b.b(wjb.ArtistScreen);
                w8jVar.c.a.S(u51Var);
                return Unit.a;
            case 17:
                vbc vbcVar5 = (vbc) obj;
                vbcVar5.getClass();
                v9j v9jVar = (v9j) this.receiver;
                v9jVar.getClass();
                x97.y(ot0.F(v9jVar), null, null, new h1j((Object) v9jVar, (Object) vbcVar5, (Continuation) (objArr6 == true ? 1 : 0), 4), 3);
                return Unit.a;
            case 18:
                int intValue2 = ((Number) obj).intValue();
                v2s v2sVar2 = (v2s) ((ebj) this.receiver).b.N().getValue();
                if (v2sVar2 != null) {
                    v2sVar2.g(intValue2);
                }
                return Unit.a;
            case 19:
                u51 u51Var2 = (u51) obj;
                u51Var2.getClass();
                ncj ncjVar = (ncj) this.receiver;
                ncjVar.getClass();
                ncjVar.b.b(wjb.ArtistScreen);
                mcj mcjVar = ncjVar.c;
                int i3 = ArtistScreenActivity.w0;
                Context context = mcjVar.b;
                context.startActivity(l48.p(context, u51Var2, mcjVar.c, null, 24));
                return Unit.a;
            case 20:
                vbc vbcVar6 = (vbc) obj;
                vbcVar6.getClass();
                udj udjVar = (udj) this.receiver;
                udjVar.getClass();
                x97.y(ot0.F(udjVar), null, null, new h1j((Object) udjVar, (Object) vbcVar6, (Continuation) (objArr7 == true ? 1 : 0), 8), 3);
                return Unit.a;
            case 21:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                eqp eqpVar = (eqp) this.receiver;
                eqpVar.c.b().a(xjb.Offline, booleanValue2);
                tpp tppVar = eqpVar.b;
                if (booleanValue2) {
                    tppVar.getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(uaa.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.isEmpty()) {
                        hag.x(tppVar.a, R.string.no_tracks_for_offline, 0);
                    } else {
                        ((z66) tppVar.b.getValue()).i(u0j.a);
                    }
                } else {
                    ((z66) tppVar.b.getValue()).i(u0j.b);
                }
                return Unit.a;
            case 22:
                ((dmj) this.receiver).a(((Boolean) obj).booleanValue());
                return Unit.a;
            case 23:
                x3r x3rVar = (x3r) obj;
                x3rVar.getClass();
                dtj dtjVar = (dtj) this.receiver;
                tnm tnmVar = dtjVar.e;
                dtjVar.a = x3rVar;
                jp0 jp0Var = dtjVar.f;
                if (!jp0Var.a) {
                    ((ConnectivityManager) jp0Var.f).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (xd0) jp0Var.g);
                    jp0Var.a = true;
                }
                if (((rar) tnmVar.f) == null) {
                    tnmVar.e = men.g(Integer.MAX_VALUE, 6, null);
                    mm6 mm6Var = (mm6) tnmVar.b;
                    dq7 dq7Var = ca8.a;
                    tnmVar.f = x97.y(mm6Var, mn7.d, null, new v0r(tnmVar, objArr8 == true ? 1 : 0, i2), 2);
                }
                zi3 zi3Var = (zi3) tnmVar.e;
                if (zi3Var != null) {
                    zi3Var.c(x3rVar);
                }
                return Unit.a;
            case 24:
                throw ouj.g(this.receiver);
            case 25:
                x1u x1uVar = (x1u) obj;
                x1uVar.getClass();
                a9l a9lVar = (a9l) this.receiver;
                a9lVar.getClass();
                t tVar = a9lVar.a;
                int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    if (x1uVar.i) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.b0(x1uVar, supportFragmentManager, tVar, aVar, a9lVar.b, ru0.NONE);
                return Boolean.valueOf(z);
            case 26:
                x1u x1uVar2 = (x1u) obj;
                x1uVar2.getClass();
                a9l a9lVar2 = (a9l) this.receiver;
                mvp mvpVar = (mvp) a9lVar2.c.getValue();
                pu0 t = pd.t(new qzm[0]);
                t tVar2 = a9lVar2.a;
                y supportFragmentManager2 = tVar2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                new tao(mvpVar, t, supportFragmentManager2, tVar2, a9lVar2.b.a, 0).r(x1uVar2);
                return Unit.a;
            case 27:
                v84 v84Var = (v84) obj;
                v84Var.getClass();
                return Boolean.valueOf(((jub) this.receiver).c(v84Var));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jxi jxiVar = (jxi) obj;
                jxiVar.getClass();
                ((jub) this.receiver).e(jxiVar);
                return Unit.a;
            default:
                v84 v84Var2 = (v84) obj;
                v84Var2.getClass();
                return Boolean.valueOf(((jub) this.receiver).c(v84Var2));
        }
    }
}
