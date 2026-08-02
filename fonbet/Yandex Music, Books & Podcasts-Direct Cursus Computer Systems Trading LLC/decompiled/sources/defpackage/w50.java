package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class w50 extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w50(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                f50 f50Var = ((a60) this.d).c;
                f50Var.getClass();
                zus zusVar = zus.b;
                b6v B0 = y5g.B0(mqsVar, cyt.a);
                ve veVar = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar = f50Var.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                rre.Z(mqsVar, zusVar, B0, veVar, tVar, supportFragmentManager, f50Var.b, new h(Page.DOWNLOADS_MUSIC), null, null, null, 1792);
                break;
            case 1:
                p83 p83Var = ((v83) this.d).c;
                p83Var.getClass();
                zus zusVar2 = zus.b;
                b6v B02 = y5g.B0(mqsVar, cyt.a);
                ve veVar2 = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar2 = p83Var.a;
                y supportFragmentManager2 = tVar2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                rre.Z(mqsVar, zusVar2, B02, veVar2, tVar2, supportFragmentManager2, p83Var.b, d.k(), null, null, null, 1792);
                break;
            case 2:
                ((Function1) this.d).invoke(mqsVar);
                break;
            case 3:
                beb bebVar = ((heb) this.d).c;
                bebVar.getClass();
                zus zusVar3 = zus.b;
                b6v B03 = y5g.B0(mqsVar, cyt.a);
                ve veVar3 = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar3 = bebVar.a;
                y supportFragmentManager3 = tVar3.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                rre.Z(mqsVar, zusVar3, B03, veVar3, tVar3, supportFragmentManager3, bebVar.b, d.m(), null, null, null, 1792);
                break;
            case 4:
                ((v3e) this.c).a.b(mqsVar);
                break;
            case 5:
                qgf qgfVar = ((ygf) this.d).c;
                qgfVar.getClass();
                zus zusVar4 = zus.b;
                b6v B04 = y5g.B0(mqsVar, cyt.a);
                ve veVar4 = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar4 = qgfVar.a;
                y supportFragmentManager4 = tVar4.getSupportFragmentManager();
                supportFragmentManager4.getClass();
                rre.Z(mqsVar, zusVar4, B04, veVar4, tVar4, supportFragmentManager4, qgfVar.b, d.l(), null, null, null, 1792);
                break;
            default:
                wy4 wy4Var = ((zgf) this.d).c;
                wy4Var.getClass();
                zus zusVar5 = zus.b;
                b6v B05 = y5g.B0(mqsVar, syt.a);
                ve veVar5 = new ve(muo.MY_KIDS, zqt.d);
                t tVar5 = wy4Var.a;
                y supportFragmentManager5 = tVar5.getSupportFragmentManager();
                supportFragmentManager5.getClass();
                rre.Z(mqsVar, zusVar5, B05, veVar5, tVar5, supportFragmentManager5, wy4Var.b, d.w(), null, null, null, 1792);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        switch (this.b) {
            case 0:
                mqsVar.getClass();
                List list = (List) this.c;
                int indexOf = list.indexOf(mqsVar);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int i = indexOf;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((x35) ((byb) qdcVar.C(I)).c(ern.a(x35.class))).h();
                a60 a60Var = (a60) this.d;
                if (!h) {
                    f50 f50Var = a60Var.c;
                    v50 v50Var = new v50(a60Var, mqsVar, i, 0);
                    f50Var.getClass();
                    a0g.G(f50Var.a, mqsVar, new ye(f50Var, mqsVar, list, v50Var));
                    break;
                } else {
                    f50 f50Var2 = a60Var.c;
                    h00 h00Var = new h00(a60Var, i, list, mqsVar, 1);
                    f50Var2.getClass();
                    a0g.G(f50Var2.a, mqsVar, h00Var);
                    break;
                }
            case 1:
                mqsVar.getClass();
                List list2 = (List) this.c;
                int indexOf2 = list2.indexOf(mqsVar);
                if (indexOf2 < 0) {
                    indexOf2 = 0;
                }
                int i2 = indexOf2;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                boolean h2 = ((x35) ((byb) qdcVar2.C(I2)).c(ern.a(x35.class))).h();
                v83 v83Var = (v83) this.d;
                if (!h2) {
                    p83 p83Var = v83Var.c;
                    v50 v50Var2 = new v50(v83Var, mqsVar, i2, 3);
                    p83Var.getClass();
                    a0g.G(p83Var.a, mqsVar, new ye(p83Var, mqsVar, v50Var2, list2, 8));
                    break;
                } else {
                    p83 p83Var2 = v83Var.c;
                    h00 h00Var2 = new h00(v83Var, i2, list2, mqsVar, 2);
                    p83Var2.getClass();
                    a0g.G(p83Var2.a, mqsVar, h00Var2);
                    break;
                }
            case 2:
                mqsVar.getClass();
                ((Function1) this.c).invoke(mqsVar);
                break;
            case 3:
                mqsVar.getClass();
                List list3 = (List) this.c;
                int indexOf3 = list3.indexOf(mqsVar);
                if (indexOf3 < 0) {
                    indexOf3 = 0;
                }
                int i3 = indexOf3;
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                boolean h3 = ((x35) ((byb) qdcVar3.C(I3)).c(ern.a(x35.class))).h();
                heb hebVar = (heb) this.d;
                if (!h3) {
                    beb bebVar = hebVar.c;
                    v50 v50Var3 = new v50(hebVar, mqsVar, i3, 9);
                    bebVar.getClass();
                    a0g.G(bebVar.a, mqsVar, new ye(bebVar, mqsVar, v50Var3, list3, 16));
                    break;
                } else {
                    beb bebVar2 = hebVar.c;
                    h00 h00Var3 = new h00(hebVar, i3, list3, mqsVar, 7);
                    bebVar2.getClass();
                    a0g.G(bebVar2.a, mqsVar, h00Var3);
                    break;
                }
            case 4:
                mqsVar.getClass();
                ((v3e) this.c).a.c(mqsVar, ((spd) this.d).c);
                break;
            case 5:
                mqsVar.getClass();
                List list4 = (List) this.c;
                int indexOf4 = list4.indexOf(mqsVar);
                if (indexOf4 < 0) {
                    indexOf4 = 0;
                }
                int i4 = indexOf4;
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                boolean h4 = ((x35) ((byb) qdcVar4.C(I4)).c(ern.a(x35.class))).h();
                ygf ygfVar = (ygf) this.d;
                if (!h4) {
                    qgf qgfVar = ygfVar.c;
                    v50 v50Var4 = new v50(ygfVar, mqsVar, i4, 12);
                    qgfVar.getClass();
                    a0g.G(qgfVar.a, mqsVar, new ye(qgfVar, mqsVar, v50Var4, list4, 20));
                    break;
                } else {
                    qgf qgfVar2 = ygfVar.c;
                    h00 h00Var4 = new h00(ygfVar, i4, list4, mqsVar, 8);
                    qgfVar2.getClass();
                    a0g.G(qgfVar2.a, mqsVar, h00Var4);
                    break;
                }
            default:
                mqsVar.getClass();
                ArrayList arrayList = (ArrayList) this.c;
                int indexOf5 = arrayList.indexOf(mqsVar);
                if (indexOf5 < 0) {
                    indexOf5 = 0;
                }
                int i5 = indexOf5;
                l18 l18Var5 = l18.b;
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var5.a;
                qdcVar5.getClass();
                boolean h5 = ((x35) ((byb) qdcVar5.C(I5)).c(ern.a(x35.class))).h();
                zgf zgfVar = (zgf) this.d;
                if (!h5) {
                    wy4 wy4Var = zgfVar.c;
                    dae daeVar = new dae(9, zgfVar, mqsVar);
                    wy4Var.getClass();
                    a0g.G(wy4Var.a, mqsVar, new ye(wy4Var, mqsVar, daeVar, arrayList, 11));
                    break;
                } else {
                    wy4 wy4Var2 = zgfVar.c;
                    h00 h00Var5 = new h00(zgfVar, i5, arrayList, mqsVar, 9);
                    wy4Var2.getClass();
                    a0g.G(wy4Var2.a, mqsVar, h00Var5);
                    break;
                }
        }
    }
}
