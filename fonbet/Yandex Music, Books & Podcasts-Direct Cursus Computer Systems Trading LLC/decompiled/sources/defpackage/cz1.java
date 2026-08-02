package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.List;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class cz1 extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz1(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                gw4 gw4Var = ((dz1) this.c).c;
                gw4Var.getClass();
                zus zusVar = zus.b;
                b6v B0 = y5g.B0(mqsVar, syt.a);
                ve veVar = new ve(muo.MY_PODCASTS, zqt.d);
                t tVar = gw4Var.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                kxi kxiVar = gw4Var.b;
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.Z(mqsVar, zusVar, B0, veVar, tVar, supportFragmentManager, kxiVar, aVar, null, null, null, 1792);
                break;
            case 1:
                dw4 dw4Var = ((mdj) this.c).c;
                int i2 = dw4Var.a;
                mqsVar.getClass();
                switch (i2) {
                    case 0:
                        zus zusVar2 = zus.b;
                        b6v B02 = y5g.B0(mqsVar, syt.a);
                        ve veVar2 = new ve(muo.MY_PODCASTS, zqt.d);
                        t tVar2 = dw4Var.b;
                        y supportFragmentManager2 = tVar2.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        kxi kxiVar2 = dw4Var.c;
                        a aVar2 = PlaybackScope.a;
                        aVar2.getClass();
                        rre.Z(mqsVar, zusVar2, B02, veVar2, tVar2, supportFragmentManager2, kxiVar2, aVar2, null, null, null, 1792);
                        break;
                    default:
                        zus zusVar3 = zus.b;
                        b6v B03 = y5g.B0(mqsVar, syt.a);
                        ve veVar3 = new ve(muo.MY_PODCASTS, zqt.d);
                        t tVar3 = dw4Var.b;
                        y supportFragmentManager3 = tVar3.getSupportFragmentManager();
                        supportFragmentManager3.getClass();
                        kxi kxiVar3 = dw4Var.c;
                        a aVar3 = PlaybackScope.a;
                        aVar3.getClass();
                        rre.Z(mqsVar, zusVar3, B03, veVar3, tVar3, supportFragmentManager3, kxiVar3, aVar3, null, null, null, 1792);
                        break;
                }
            default:
                f35 f35Var = ((mam) this.c).c;
                f35Var.getClass();
                zus zusVar4 = zus.b;
                b6v B04 = y5g.B0(mqsVar, syt.a);
                ve veVar4 = new ve(muo.MY_PODCASTS, zqt.d);
                t tVar4 = f35Var.a;
                y supportFragmentManager4 = tVar4.getSupportFragmentManager();
                supportFragmentManager4.getClass();
                kxi kxiVar4 = f35Var.b;
                a aVar4 = PlaybackScope.a;
                aVar4.getClass();
                rre.Z(mqsVar, zusVar4, B04, veVar4, tVar4, supportFragmentManager4, kxiVar4, aVar4, null, null, null, 1792);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                dz1 dz1Var = (dz1) this.c;
                dz1Var.d.getClass();
                lg3.d0("Tracks_TrackClick");
                int indexOf = dz1Var.a.p.indexOf(mqsVar);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((k94) ((byb) qdcVar.C(I)).c(ern.a(k94.class))).h();
                gw4 gw4Var = dz1Var.c;
                if (!h) {
                    List list = dz1Var.a.p;
                    gw4Var.getClass();
                    list.getClass();
                    String t = weo.t();
                    h j = d.j();
                    ((e) gw4Var.d.getValue()).getClass();
                    c h2 = j.h();
                    boolean c = ((z5l) gw4Var.c.getValue()).c(h2, mqsVar, false);
                    jyr jyrVar = gw4Var.c;
                    if (!c) {
                        asq.t(z5l.g((z5l) jyrVar.getValue(), h2, gw4Var.b.a(t), null, mqsVar, 0, 0, null, null, null, new e50(list, null, 3), 23796), gw4Var.a, new p1n(8));
                        hw4 hw4Var = dz1Var.d;
                        String str = mqsVar.a;
                        int indexOf2 = dz1Var.a.p.indexOf(mqsVar);
                        hw4Var.getClass();
                        str.getClass();
                        nmb.z(hw4Var.b, hw4Var.a.G(), wjb.CollectionAudiobooksScreen, null, null, null, null, 0, false, "saved_chapters", "saved_chapters", 0, "track", str, indexOf2 + 1, t, 19708);
                        break;
                    } else {
                        ((z5l) jyrVar.getValue()).i(false);
                        break;
                    }
                } else {
                    de deVar = new de(dz1Var, indexOf, mqsVar, 3);
                    gw4Var.getClass();
                    a0g.G(gw4Var.a, mqsVar, deVar);
                    break;
                }
            case 1:
                mdj mdjVar = (mdj) this.c;
                int indexOf3 = mdjVar.b.w.indexOf(mqsVar);
                if (indexOf3 < 0) {
                    indexOf3 = 0;
                }
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                boolean h3 = ((k94) ((byb) qdcVar2.C(I2)).c(ern.a(k94.class))).h();
                dw4 dw4Var = mdjVar.c;
                if (!h3) {
                    List list2 = mdjVar.b.w;
                    avi aviVar = new avi(6, mdjVar, mqsVar);
                    int i2 = dw4Var.a;
                    mqsVar.getClass();
                    list2.getClass();
                    switch (i2) {
                        case 0:
                            String t2 = weo.t();
                            h j2 = d.j();
                            ((e) dw4Var.e.getValue()).getClass();
                            c h4 = j2.h();
                            jyr jyrVar2 = dw4Var.d;
                            if (!((z5l) jyrVar2.getValue()).c(h4, mqsVar, false)) {
                                asq.t(z5l.g((z5l) jyrVar2.getValue(), h4, dw4Var.c.a(t2), null, mqsVar, 0, 0, null, null, null, new e50(list2, null, 2), 23796), dw4Var.b, new p1n(8));
                                aviVar.invoke(t2);
                                break;
                            } else {
                                ((z5l) jyrVar2.getValue()).i(false);
                                break;
                            }
                        default:
                            String t3 = weo.t();
                            h j3 = d.j();
                            ((e) dw4Var.e.getValue()).getClass();
                            c h5 = j3.h();
                            jyr jyrVar3 = dw4Var.d;
                            if (!((z5l) jyrVar3.getValue()).c(h5, mqsVar, false)) {
                                asq.t(z5l.g((z5l) jyrVar3.getValue(), h5, dw4Var.c.a(t3), null, mqsVar, 0, 0, null, null, null, new e50(list2, null, 4), 23796), dw4Var.b, new p1n(8));
                                aviVar.invoke(t3);
                                break;
                            } else {
                                ((z5l) jyrVar3.getValue()).i(false);
                                break;
                            }
                    }
                } else {
                    de deVar2 = new de(mdjVar, indexOf3, mqsVar, 29);
                    int i3 = dw4Var.a;
                    mqsVar.getClass();
                    switch (i3) {
                        case 0:
                            a0g.G(dw4Var.b, mqsVar, deVar2);
                            break;
                        default:
                            a0g.G(dw4Var.b, mqsVar, deVar2);
                            break;
                    }
                }
            default:
                mam mamVar = (mam) this.c;
                mamVar.d.getClass();
                lg3.d0("Tracks_TrackClick");
                int indexOf4 = mamVar.a.p.indexOf(mqsVar);
                if (indexOf4 < 0) {
                    indexOf4 = 0;
                }
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                boolean h6 = ((k94) ((byb) qdcVar3.C(I3)).c(ern.a(k94.class))).h();
                f35 f35Var = mamVar.c;
                if (!h6) {
                    List list3 = mamVar.a.p;
                    f35Var.getClass();
                    list3.getClass();
                    String t4 = weo.t();
                    h j4 = d.j();
                    ((e) f35Var.d.getValue()).getClass();
                    c h7 = j4.h();
                    boolean c2 = ((z5l) f35Var.c.getValue()).c(h7, mqsVar, false);
                    jyr jyrVar4 = f35Var.c;
                    if (!c2) {
                        asq.t(z5l.g((z5l) jyrVar4.getValue(), h7, f35Var.b.a(t4), null, mqsVar, 0, 0, null, null, null, new e50(list3, null, 5), 23796), f35Var.a, new p1n(8));
                        g35 g35Var = mamVar.d;
                        String str2 = mqsVar.a;
                        int indexOf5 = mamVar.a.p.indexOf(mqsVar);
                        g35Var.getClass();
                        str2.getClass();
                        nmb.z(g35Var.b, g35Var.a.G(), wjb.CollectionPodcastScreen, null, null, null, null, 0, false, "saved_episodes", "saved_episodes", 0, "track", str2, indexOf5 + 1, t4, 19708);
                        break;
                    } else {
                        ((z5l) jyrVar4.getValue()).i(false);
                        break;
                    }
                } else {
                    hsl hslVar = new hsl(mamVar, indexOf4, mqsVar, 1);
                    f35Var.getClass();
                    a0g.G(f35Var.a, mqsVar, hslVar);
                    break;
                }
        }
    }
}
