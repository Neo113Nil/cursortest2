package defpackage;

import android.content.Context;
import io.appmetrica.analytics.BuildConfig;
import java.io.Serializable;
import java.util.List;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.control.QueuePreparationException;
import ru.yandex.music.common.media.queue.DoNotLaunchQueueStartException;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes4.dex */
public final class bwg {
    public final t3g a;
    public final z5l b;
    public final g0l c;
    public final mg5 d;
    public final cut e;
    public final k21 f;
    public final ay g;
    public final raa h;
    public final tf6 i = gld.e(dm6.b());
    public final l3l j = new l3l();
    public final me1 k;

    public bwg(Context context, t3g t3gVar, z5l z5lVar, e eVar, g0l g0lVar, mg5 mg5Var, cut cutVar, k21 k21Var, ay ayVar, raa raaVar) {
        this.a = t3gVar;
        this.b = z5lVar;
        this.c = g0lVar;
        this.d = mg5Var;
        this.e = cutVar;
        this.f = k21Var;
        this.g = ayVar;
        this.h = raaVar;
        this.k = new me1(context, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bwg bwgVar, String str, cg6 cg6Var) {
        yvg yvgVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof yvg) {
            yvgVar = (yvg) cg6Var;
            int i2 = yvgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yvgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yvgVar.j;
                nm6 nm6Var = nm6.a;
                i = yvgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k21 k21Var = bwgVar.f;
                    yvgVar.l = 1;
                    obj = k21.b(k21Var, str, false, yvgVar, 30);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (i21) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        yvgVar = new yvg(bwgVar, cg6Var);
        Object obj2 = yvgVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yvgVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    public static final Object b(bwg bwgVar, kwg kwgVar, aur aurVar) {
        if (kwgVar instanceof hwg) {
            return bwgVar.d(((hwg) kwgVar).a, aurVar);
        }
        if (kwgVar instanceof jwg) {
            return bwgVar.f(((jwg) kwgVar).a, aurVar);
        }
        if (kwgVar instanceof iwg) {
            su4.s(2, null, "Cannot get download container", null);
            return null;
        }
        b6e.s();
        return null;
    }

    public static w5l c(pkb pkbVar, String str, int i) {
        cvo cvoVar = cvo.i;
        cvo b = o6m.b(wjb.BottomsheetScreen, null, 6);
        jab jabVar = new jab(qkb.Actions, 1, i + 1, 0);
        str.getClass();
        return new w5l(b, jabVar, new thj(pkbVar, str, 1, 1, ""), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(lt ltVar, cg6 cg6Var) {
        wvg wvgVar;
        int i;
        oq oqVar;
        if (cg6Var instanceof wvg) {
            wvgVar = (wvg) cg6Var;
            int i2 = wvgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wvgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wvgVar.j;
                Object obj2 = nm6.a;
                i = wvgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = ltVar.a;
                    wvgVar.l = 1;
                    obj = e(str, true, wvgVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                oqVar = (oq) obj;
                if (oqVar != null) {
                    return null;
                }
                eca ecaVar = eca.d;
                return d51.o(oqVar);
            }
        }
        wvgVar = new wvg(this, cg6Var);
        Object obj3 = wvgVar.j;
        Object obj22 = nm6.a;
        i = wvgVar.l;
        if (i != 0) {
        }
        oqVar = (oq) obj3;
        if (oqVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, boolean z, cg6 cg6Var) {
        xvg xvgVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof xvg) {
            xvgVar = (xvg) cg6Var;
            int i2 = xvgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xvgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xvgVar.j;
                nm6 nm6Var = nm6.a;
                i = xvgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    xvgVar.l = 1;
                    obj = this.g.d(str, z, xvgVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (oq) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        xvgVar = new xvg(this, cg6Var);
        Object obj2 = xvgVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xvgVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(eul eulVar, cg6 cg6Var) {
        zvg zvgVar;
        int i;
        rrl rrlVar;
        List list;
        if (cg6Var instanceof zvg) {
            zvgVar = (zvg) cg6Var;
            int i2 = zvgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zvgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zvgVar.j;
                Object obj2 = nm6.a;
                i = zvgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = eulVar.a;
                    String str2 = eulVar.b;
                    zvgVar.l = 1;
                    obj = g(str, str2, true, zvgVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rrlVar = (rrl) obj;
                if (rrlVar == null || (list = rrlVar.c) == null) {
                    return null;
                }
                eca ecaVar = eca.d;
                return d51.h(rrlVar.a, list);
            }
        }
        zvgVar = new zvg(this, cg6Var);
        Object obj3 = zvgVar.j;
        Object obj22 = nm6.a;
        i = zvgVar.l;
        if (i != 0) {
        }
        rrlVar = (rrl) obj3;
        if (rrlVar == null) {
            eca ecaVar2 = eca.d;
            return d51.h(rrlVar.a, list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, boolean z, cg6 cg6Var) {
        awg awgVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof awg) {
            awgVar = (awg) cg6Var;
            int i2 = awgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awgVar.l = i2 - Integer.MIN_VALUE;
                awg awgVar2 = awgVar;
                Object obj = awgVar2.j;
                nm6 nm6Var = nm6.a;
                i = awgVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    awgVar2.l = 1;
                    obj = cut.h(this.e, str, str2, false, z, awgVar2, BuildConfig.API_LEVEL);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (rrl) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        awgVar = new awg(this, cg6Var);
        awg awgVar22 = awgVar;
        Object obj2 = awgVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = awgVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    public final void h(Throwable th) {
        Context context = this.k.b;
        if (th instanceof DoNotLaunchQueueStartException) {
            return;
        }
        if ((th instanceof QueuePreparationException) || (th instanceof RemoteQueueStartException)) {
            new lum(context).Q(th);
        } else {
            hag.x(context, R.string.check_internet_connection, 0);
        }
    }
}
