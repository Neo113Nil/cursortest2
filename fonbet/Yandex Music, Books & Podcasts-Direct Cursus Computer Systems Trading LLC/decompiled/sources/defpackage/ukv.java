package defpackage;

import android.content.Context;
import android.content.Intent;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes6.dex */
public final class ukv {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final cnv d;
    public final jyr e;

    public ukv(Context context, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, cnv cnvVar) {
        this.a = jyrVar2;
        this.b = jyrVar;
        this.c = jyrVar3;
        this.d = cnvVar;
        this.e = jyrVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rkd rkdVar, Continuation continuation) {
        pkv pkvVar;
        int i;
        Object obj;
        ukv ukvVar;
        if (continuation instanceof pkv) {
            pkvVar = (pkv) continuation;
            int i2 = pkvVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pkvVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = pkvVar.l;
                nm6 nm6Var = nm6.a;
                i = pkvVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    pjc g = ((frt) this.b.getValue()).g();
                    pkvVar.j = rkdVar;
                    pkvVar.k = this;
                    pkvVar.n = 1;
                    Object g0 = zsd.g0(g, pkvVar);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    obj = g0;
                    ukvVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ukv ukvVar2 = pkvVar.k;
                    rkd rkdVar2 = pkvVar.j;
                    qgg.h0(obj2);
                    ukvVar = ukvVar2;
                    rkdVar = rkdVar2;
                    obj = obj2;
                }
                if (((xxq) obj).a()) {
                    ukvVar.f().a();
                } else {
                    Context context = f().a;
                    Intent action = new Intent(context, (Class<?>) MainScreenActivity.class).putExtra("need_expand", true).addFlags(RemoteCameraConfig.Camera.BITRATE).setAction("ACTION_OPEN_PLAYER");
                    action.getClass();
                    Intent addFlags = action.addFlags(268435456);
                    addFlags.getClass();
                    context.startActivity(addFlags);
                    rkdVar.getClass();
                    zlv zlvVar = (zlv) ((knv) this.e.getValue()).i.getValue();
                    zlvVar.getClass();
                    long j = ((fma) zlvVar.b.invoke(rkdVar)).a;
                    nmb nmbVar = zlvVar.e;
                    String G = zlvVar.a.G();
                    wjb wjbVar = wjb.AboutArtistScreen;
                    int c = (int) fma.c(j);
                    int b = (int) fma.b(j);
                    int intValue = ((Number) zlvVar.c.invoke()).intValue();
                    lmb a = zlv.a((qov) zlvVar.d.invoke(rkdVar));
                    pkb pkbVar = pkb.Audiobook;
                    nmbVar.getClass();
                    G.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("hash", G);
                    linkedHashMap.put("page_id", "widget");
                    linkedHashMap.put("skeleton_id", "");
                    linkedHashMap.put("main_object_type", "non_applicable");
                    linkedHashMap.put("main_object_id", "");
                    linkedHashMap.put("from", "widget");
                    linkedHashMap.put("to", "expanded_player_screen");
                    eta.m(c, "deep_link", "", "size_horizontal", linkedHashMap);
                    ouj.y(b, linkedHashMap, "size_vertical", intValue, "widgets_amt");
                    dfi.p(2, "widget_type", a.a, "_meta", linkedHashMap);
                    nmbVar.C("Widget.Navigated", linkedHashMap);
                }
                return Unit.a;
            }
        }
        pkvVar = new pkv(this, continuation);
        Object obj22 = pkvVar.l;
        nm6 nm6Var2 = nm6.a;
        i = pkvVar.n;
        if (i != 0) {
        }
        if (((xxq) obj).a()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rkd rkdVar, Continuation continuation) {
        qkv qkvVar;
        Object obj;
        int i;
        int i2;
        ukv ukvVar;
        if (continuation instanceof qkv) {
            qkvVar = (qkv) continuation;
            int i3 = qkvVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qkvVar.o = i3 - Integer.MIN_VALUE;
                obj = qkvVar.m;
                nm6 nm6Var = nm6.a;
                i = qkvVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.b.getValue()).g();
                    qkvVar.j = rkdVar;
                    qkvVar.k = this;
                    i2 = 0;
                    qkvVar.l = 0;
                    qkvVar.o = 1;
                    obj = zsd.g0(g, qkvVar);
                    if (obj != nm6Var) {
                        ukvVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = qkvVar.l;
                ukv ukvVar2 = qkvVar.k;
                rkd rkdVar2 = qkvVar.j;
                qgg.h0(obj);
                i2 = i4;
                rkdVar = rkdVar2;
                ukvVar = ukvVar2;
                if (((xxq) obj).a()) {
                    ukvVar.f().a();
                } else {
                    qkvVar.j = null;
                    qkvVar.k = null;
                    qkvVar.l = i2;
                    qkvVar.o = 2;
                    g(sjb.Pause, rkdVar);
                    this.d.d(new siv(3));
                }
                return Unit.a;
            }
        }
        qkvVar = new qkv(this, continuation);
        obj = qkvVar.m;
        nm6 nm6Var2 = nm6.a;
        i = qkvVar.o;
        if (i != 0) {
        }
        if (((xxq) obj).a()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rkd rkdVar, Continuation continuation) {
        rkv rkvVar;
        Object obj;
        int i;
        int i2;
        ukv ukvVar;
        if (continuation instanceof rkv) {
            rkvVar = (rkv) continuation;
            int i3 = rkvVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rkvVar.o = i3 - Integer.MIN_VALUE;
                obj = rkvVar.m;
                nm6 nm6Var = nm6.a;
                i = rkvVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.b.getValue()).g();
                    rkvVar.j = rkdVar;
                    rkvVar.k = this;
                    i2 = 0;
                    rkvVar.l = 0;
                    rkvVar.o = 1;
                    obj = zsd.g0(g, rkvVar);
                    if (obj != nm6Var) {
                        ukvVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = rkvVar.l;
                ukv ukvVar2 = rkvVar.k;
                rkd rkdVar2 = rkvVar.j;
                qgg.h0(obj);
                i2 = i4;
                rkdVar = rkdVar2;
                ukvVar = ukvVar2;
                if (((xxq) obj).a()) {
                    ukvVar.f().a();
                } else {
                    rkvVar.j = null;
                    rkvVar.k = null;
                    rkvVar.l = i2;
                    rkvVar.o = 2;
                    g(sjb.ResumePlaying, rkdVar);
                    this.d.d(new siv(8));
                }
                return Unit.a;
            }
        }
        rkvVar = new rkv(this, continuation);
        obj = rkvVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rkvVar.o;
        if (i != 0) {
        }
        if (((xxq) obj).a()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rkd rkdVar, Continuation continuation) {
        skv skvVar;
        Object obj;
        int i;
        ukv ukvVar;
        rkd rkdVar2;
        if (continuation instanceof skv) {
            skvVar = (skv) continuation;
            int i2 = skvVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skvVar.n = i2 - Integer.MIN_VALUE;
                obj = skvVar.l;
                nm6 nm6Var = nm6.a;
                i = skvVar.n;
                Continuation continuation2 = null;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.b.getValue()).g();
                    skvVar.j = rkdVar;
                    skvVar.k = this;
                    skvVar.n = 1;
                    obj = zsd.g0(g, skvVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    ukvVar = this;
                    rkdVar2 = rkdVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ukvVar = skvVar.k;
                    rkdVar2 = skvVar.j;
                    qgg.h0(obj);
                }
                if (((xxq) obj).a()) {
                    ukvVar.f().a();
                } else {
                    String t = weo.t();
                    ((gnv) this.c.getValue()).a(t);
                    rkdVar2.getClass();
                    jyr jyrVar = this.e;
                    zlv zlvVar = (zlv) ((knv) jyrVar.getValue()).i.getValue();
                    zlvVar.getClass();
                    long j = ((fma) zlvVar.b.invoke(rkdVar2)).a;
                    nmb nmbVar = zlvVar.e;
                    String G = zlvVar.a.G();
                    wjb wjbVar = wjb.AboutArtistScreen;
                    nmb.D(nmbVar, G, 0, "playlist", "3", (int) fma.c(j), (int) fma.b(j), ((Number) zlvVar.c.invoke()).intValue(), zlv.a((qov) zlvVar.d.invoke(rkdVar2)), t, 6556);
                    pov a = ((knv) jyrVar.getValue()).a();
                    x97.y(a.d, null, null, new kov(a, continuation2, i3), 3);
                }
                return Unit.a;
            }
        }
        skvVar = new skv(this, continuation);
        obj = skvVar.l;
        nm6 nm6Var2 = nm6.a;
        i = skvVar.n;
        Continuation continuation22 = null;
        int i32 = 1;
        if (i != 0) {
        }
        if (((xxq) obj).a()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rkd rkdVar, Integer num, rnv rnvVar, Continuation continuation) {
        tkv tkvVar;
        int i;
        Object obj;
        rkd rkdVar2;
        Integer num2;
        ukv ukvVar;
        rnv rnvVar2 = rnvVar;
        if (continuation instanceof tkv) {
            tkvVar = (tkv) continuation;
            int i2 = tkvVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tkvVar.p = i2 - Integer.MIN_VALUE;
                Object obj2 = tkvVar.n;
                nm6 nm6Var = nm6.a;
                i = tkvVar.p;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (rnvVar2 == null) {
                        return Unit.a;
                    }
                    pjc g = ((frt) this.b.getValue()).g();
                    tkvVar.j = rkdVar;
                    tkvVar.k = num;
                    tkvVar.l = rnvVar2;
                    tkvVar.m = this;
                    tkvVar.p = 1;
                    Object g0 = zsd.g0(g, tkvVar);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    obj = g0;
                    rkdVar2 = rkdVar;
                    num2 = num;
                    ukvVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ukv ukvVar2 = tkvVar.m;
                    rnv rnvVar3 = tkvVar.l;
                    num2 = tkvVar.k;
                    rkdVar2 = tkvVar.j;
                    qgg.h0(obj2);
                    ukvVar = ukvVar2;
                    rnvVar2 = rnvVar3;
                    obj = obj2;
                }
                if (((xxq) obj).a()) {
                    ukvVar.f().a();
                } else {
                    String t = weo.t();
                    gnv gnvVar = (gnv) this.c.getValue();
                    cvo cvoVar = new cvo(wjb.Widget, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                    jab jabVar = new jab(qkb.Actions, 1, 1, 0);
                    pkb X = g0g.X(rnvVar2);
                    String P = g0g.P(rnvVar2);
                    int intValue = num2 != null ? num2.intValue() : 0;
                    P.getClass();
                    w5l w5lVar = new w5l(cvoVar, jabVar, new thj(X, P, intValue + 1, 1, ""), null);
                    gnvVar.getClass();
                    jyr jyrVar = gnvVar.g;
                    kxi kxiVar = gnvVar.b;
                    t.getClass();
                    gnvVar.c.invoke(rnvVar2);
                    a6l a = kxiVar.a(t);
                    if (rnvVar2 instanceof mnv) {
                        gnvVar.a(t);
                    } else if (rnvVar2 instanceof nnv) {
                        ((bbb) jyrVar.getValue()).d(((nnv) rnvVar2).a, w5lVar, a, kxiVar);
                    } else if (rnvVar2 instanceof qnv) {
                        mg5.a((mg5) gnvVar.k.getValue(), o8g.E(((qnv) rnvVar2).a), kxiVar, w5lVar, null, 24);
                    } else {
                        if (!(rnvVar2 instanceof pnv)) {
                            b6e.s();
                            return null;
                        }
                        ((bbb) jyrVar.getValue()).d(((pnv) rnvVar2).a, w5lVar, a, kxiVar);
                    }
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    rkdVar2.getClass();
                    zlv zlvVar = (zlv) ((knv) this.e.getValue()).i.getValue();
                    zlvVar.getClass();
                    long j = ((fma) zlvVar.b.invoke(rkdVar2)).a;
                    nmb.D(zlvVar.e, zlvVar.a.G(), intValue2 + 1, g0g.X(rnvVar2).a, g0g.P(rnvVar2), (int) fma.c(j), (int) fma.b(j), ((Number) zlvVar.c.invoke()).intValue(), zlv.a((qov) zlvVar.d.invoke(rkdVar2)), t, 6428);
                }
                return Unit.a;
            }
        }
        tkvVar = new tkv(this, continuation);
        Object obj22 = tkvVar.n;
        nm6 nm6Var2 = nm6.a;
        i = tkvVar.p;
        if (i != 0) {
        }
        if (((xxq) obj).a()) {
        }
        return Unit.a;
    }

    public final dnv f() {
        return (dnv) this.a.getValue();
    }

    public final void g(sjb sjbVar, rkd rkdVar) {
        zlv zlvVar = (zlv) ((knv) this.e.getValue()).i.getValue();
        zlvVar.getClass();
        rkdVar.getClass();
        long j = ((fma) zlvVar.b.invoke(rkdVar)).a;
        nmb nmbVar = zlvVar.e;
        String G = zlvVar.a.G();
        wjb wjbVar = wjb.AboutArtistScreen;
        kmb kmbVar = kmb.Tap;
        int c = (int) fma.c(j);
        int b = (int) fma.b(j);
        int intValue = ((Number) zlvVar.c.invoke()).intValue();
        lmb a = zlv.a((qov) zlvVar.d.invoke(rkdVar));
        pkb pkbVar = pkb.Audiobook;
        nmbVar.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "widget");
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", "non_applicable");
        linkedHashMap.put("main_object_id", "");
        linkedHashMap.put("action_type", sjbVar.a);
        eta.m(c, "user_interaction_type", "tap", "size_horizontal", linkedHashMap);
        ouj.y(b, linkedHashMap, "size_vertical", intValue, "widgets_amt");
        dfi.p(2, "widget_type", a.a, "_meta", linkedHashMap);
        nmbVar.C("Widget.ActionPerformed", linkedHashMap);
    }
}
