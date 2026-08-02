package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public final /* synthetic */ class c3 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n7q n7qVar;
        mwk b;
        a63 a63Var;
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.receiver;
                w3 w3Var = l3Var.a;
                exa exaVar = l3Var.d;
                by7 by7Var = l3Var.e;
                Object value = w3Var.j.a.getValue();
                n3 n3Var = value instanceof n3 ? (n3) value : null;
                if (n3Var != null) {
                    wjb wjbVar = wjb.PodcastScreen;
                    Object invoke = by7Var.b.invoke();
                    q3 q3Var = invoke instanceof q3 ? (q3) invoke : null;
                    a63 a63Var2 = q3Var != null ? q3Var.e : null;
                    if (a63Var2 != null) {
                        exaVar.a(wjbVar, a63Var2);
                    }
                    ozw ozwVar = l3Var.b;
                    lt ltVar = n3Var.d;
                    qnq qnqVar = (qnq) ozwVar.b;
                    ltVar.getClass();
                    rre rreVar = tq.a;
                    Album$AlbumType album$AlbumType = ltVar.b;
                    rreVar.getClass();
                    int ordinal = rre.Q(album$AlbumType).ordinal();
                    if (ordinal == 0) {
                        wjbVar = wjb.AlbumScreen;
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            break;
                        } else {
                            wjbVar = wjb.AudiobookScreen;
                        }
                    }
                    Object invoke2 = by7Var.b.invoke();
                    q3 q3Var2 = invoke2 instanceof q3 ? (q3) invoke2 : null;
                    a63 a63Var3 = q3Var2 != null ? q3Var2.e : null;
                    if (a63Var3 != null) {
                        exaVar.a(wjbVar, a63Var3);
                    }
                    qnqVar.b.startActivity(quj.V(qnqVar.b, ltVar, null));
                }
                break;
            case 1:
                l3 l3Var2 = (l3) this.receiver;
                x97.y(l3Var2.c, null, null, new k3(l3Var2, (Continuation) null), 3);
                break;
            case 2:
                l3 l3Var3 = (l3) this.receiver;
                Object value2 = l3Var3.a.j.a.getValue();
                n3 n3Var2 = value2 instanceof n3 ? (n3) value2 : null;
                if (n3Var2 != null) {
                    wjb wjbVar2 = wjb.ShortSummaryScreen;
                    Object invoke3 = l3Var3.e.b.invoke();
                    q3 q3Var3 = invoke3 instanceof q3 ? (q3) invoke3 : null;
                    a63 a63Var4 = q3Var3 != null ? q3Var3.e : null;
                    if (a63Var4 != null) {
                        l3Var3.d.a(wjbVar2, a63Var4);
                    }
                    ozw ozwVar2 = l3Var3.b;
                    String str = n3Var2.d.a;
                    String str2 = n3Var2.a;
                    String str3 = n3Var2.c;
                    str.getClass();
                    str3.getClass();
                    hn5 hn5Var = ((qnq) ozwVar2.b).b;
                    hn5Var.getClass();
                    new xdh((t) hn5Var, str2, str3, new avo(pkb.Podcast, str)).M();
                }
                break;
            case 3:
                d6l x = p6g.x((e6l) ((oq7) ((itb) this.receiver).a.getValue()).a.c.getValue());
                if (x != null && (n7qVar = x.a) != null && (b = n7qVar.b()) != null && (r1 = b.a()) != null) {
                    break;
                }
                break;
            case 4:
                b4 b4Var = (b4) this.receiver;
                Object invoke4 = b4Var.c.b.invoke();
                k4 k4Var = invoke4 instanceof k4 ? (k4) invoke4 : null;
                if (k4Var != null && (a63Var = k4Var.d) != null) {
                    b4Var.b.a(wjb.ShortSummaryScreen, a63Var);
                    kkp kkpVar = b4Var.a;
                    mqs mqsVar = k4Var.c;
                    ef3.g(ef3.b, ((ve) kkpVar.d).a, df3.EPISODE_BOTTOMSHEET, pe3.READ_MORE);
                    rre.a0(mqsVar, (dy7) ((jyr) kkpVar.e).getValue(), (kxi) kkpVar.b, pd.t(new qzm[0]), (y) kkpVar.c, false);
                }
                break;
            case 5:
                ((sai) this.receiver).a();
                break;
            case 6:
                il ilVar = (il) this.receiver;
                ArrayList arrayList = ilVar.e;
                int a = tah.a(v75.o(arrayList, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((evl) next).a.e(), next);
                }
                dl dlVar = ilVar.b;
                mqs mqsVar2 = ilVar.a;
                Map o = uah.o(ilVar.f);
                mqsVar2.getClass();
                Context applicationContext = ((Context) dlVar.a.getValue()).getApplicationContext();
                applicationContext.getClass();
                new e4t(applicationContext).b(mqsVar2, linkedHashMap, o);
                break;
            case 7:
                il ilVar2 = (il) this.receiver;
                el elVar = ilVar2.c;
                mqs mqsVar3 = ilVar2.a;
                elVar.getClass();
                mqsVar3.getClass();
                rn5 rn5Var = new rn5(elVar.a);
                rn5Var.f = t75.c(mqsVar3);
                rn5Var.V(new n(1, elVar));
                break;
            case 8:
                ((sai) this.receiver).a();
                break;
            case 9:
                hr hrVar = (hr) this.receiver;
                hrVar.c.a(sjb.Share);
                hrVar.d.d0(hrVar.a);
                break;
            case 10:
                hr hrVar2 = (hr) this.receiver;
                hrVar2.d.z();
                hrVar2.c.a(sjb.MarkAsListened);
                p0t p0tVar = (p0t) hrVar2.b.f.getValue();
                jyr jyrVar = hrVar2.i;
                p0tVar.a((List) jyrVar.getValue(), true);
                ((h10) hrVar2.h.getValue()).d((List) jyrVar.getValue());
                break;
            case 11:
                hr hrVar3 = (hr) this.receiver;
                hrVar3.d.z();
                hrVar3.c.a(sjb.MarkAsUnlistened);
                ((p0t) hrVar3.b.f.getValue()).a((List) hrVar3.i.getValue(), false);
                break;
            case 12:
                hr hrVar4 = (hr) this.receiver;
                hrVar4.d.z();
                String t = weo.t();
                hrVar4.c.c(xlb.Next, t);
                ((h10) hrVar4.h.getValue()).b(t, hrVar4.a, (List) hrVar4.i.getValue());
                break;
            case 13:
                hr hrVar5 = (hr) this.receiver;
                hrVar5.d.z();
                String t2 = weo.t();
                hrVar5.c.c(xlb.End, t2);
                ((h10) hrVar5.h.getValue()).a(t2, hrVar5.a, (List) hrVar5.i.getValue());
                break;
            case 14:
                hr hrVar6 = (hr) this.receiver;
                hrVar6.c.a(sjb.PlayOnDevice);
                hrVar6.d.c0(hrVar6.a);
                break;
            case 15:
                Object value3 = ((br) this.receiver).u.getValue();
                value3.getClass();
                break;
            case 16:
                ((p7a) this.receiver).b();
                break;
            case 17:
                ((p7a) this.receiver).a();
                break;
            case 18:
                ((t) ((j00) this.receiver).d.d.b).finish();
                break;
            case 19:
                ((AlbumScreenActivity) this.receiver).z();
                break;
            case 20:
                ((t) ((fz) this.receiver).c.d.b).finish();
                break;
            case 21:
                ((fz) this.receiver).c();
                break;
            case 22:
                ((fz) this.receiver).b();
                break;
            case 23:
                e10 e10Var = ((fz) this.receiver).b;
                e10Var.getClass();
                x97.y(ot0.F(e10Var), null, null, new v00(e10Var, null, 5), 3);
                break;
            case 24:
                e10 e10Var2 = ((fz) this.receiver).b;
                e10Var2.getClass();
                x97.y(ot0.F(e10Var2), null, null, new v00(e10Var2, null, 5), 3);
                break;
            case 25:
                ((t) ((fz) this.receiver).c.d.b).finish();
                break;
            case 26:
                ((fz) this.receiver).c();
                break;
            case 27:
                ((fz) this.receiver).b();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((t) ((fz) this.receiver).c.d.b).finish();
                break;
            default:
                ((fz) this.receiver).c();
                break;
        }
        return Unit.a;
    }
}
