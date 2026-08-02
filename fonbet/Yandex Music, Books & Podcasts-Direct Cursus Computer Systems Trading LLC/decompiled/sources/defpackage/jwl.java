package defpackage;

import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackContextName;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class jwl implements pur, hs6, w8n, kou, ngl {
    public final /* synthetic */ int a;

    public /* synthetic */ jwl(int i) {
        this.a = i;
    }

    public static void a(int i) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // defpackage.ngl
    public void H(String str, String str2, Object obj, Object... objArr) {
        str.getClass();
    }

    @Override // defpackage.w8n
    public Object J(igr igrVar) {
        a0q a0qVar;
        e0t e0tVar = igrVar.k;
        e0tVar.getClass();
        if (e0tVar instanceof d0t) {
            return new d0t(((d0t) e0tVar).a, true);
        }
        if (!e0tVar.equals(f0t.a)) {
            b6e.s();
            return null;
        }
        d0t d0tVar = new d0t(t75.c("user:onyourwave"), true);
        xsu xsuVar = igrVar.c;
        xsuVar.getClass();
        if (!(xsuVar instanceof wsu)) {
            if (!(xsuVar instanceof qsu) && !xsuVar.equals(rsu.a)) {
                b6e.s();
                return null;
            }
            su4.s(2, null, "No playables when TrackRadioContentStartIdStandardAutoflow (" + xsuVar + ")", null);
            return d0tVar;
        }
        List list = ((wsu) xsuVar).a;
        jzs jzsVar = (jzs) CollectionsKt.firstOrNull(list);
        izs izsVar = jzsVar != null ? jzsVar.g : null;
        if (izsVar instanceof e6v) {
            a0qVar = ((e6v) izsVar).getEntity().getId();
        } else {
            if (!Intrinsics.d(izsVar, hzs.a) && izsVar != null) {
                b6e.s();
                return null;
            }
            a0qVar = null;
        }
        if (a0qVar != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.d(((jzs) it.next()).g, jzsVar != null ? jzsVar.g : null)) {
                    }
                }
            }
            return a0qVar;
        }
        return d0tVar;
    }

    @Override // defpackage.ngl
    public void M(String str, String str2, Object obj, Throwable th, Object... objArr) {
        str.getClass();
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        String J = xz0.J(objArr, ", ", san.l, 30);
        StringBuilder m = f1d.m("YandexPlayer: ", str, StringUtil.SPACE, str2, StringUtil.SPACE);
        m.append(obj);
        m.append(StringUtil.SPACE);
        m.append(localizedMessage);
        m.append(" [");
        ssg.a(6, null, su4.o(m, J, "]"), null);
    }

    @Override // defpackage.w8n
    public Object Q(se5 se5Var) {
        jyr b = btf.b(new oxo(15, se5Var));
        c cVar = se5Var.a;
        String str = se5Var.m;
        cVar.getClass();
        nyk nykVar = cVar.b;
        String str2 = nykVar.b;
        PlaybackContextName playbackContextName = nykVar.a;
        Object obj = null;
        switch (s3q.a[playbackContextName.ordinal()]) {
            case 1:
                if (str2 == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                obj = new yc5(str2);
                break;
            case 2:
                if (str2 == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                obj = new xc5(str2);
                break;
            case 3:
                if (str2 == null) {
                    if (cVar.a.l() == PlaybackScope.Type.CHART) {
                        obj = i9w.A("414787002:1076", null);
                        break;
                    }
                } else {
                    obj = i9w.A(str2, str);
                    break;
                }
                break;
            case 4:
            case 5:
                obj = new cd5((List) b.getValue());
                break;
            case 6:
            case 9:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
                dfi.r("Context " + playbackContextName + " is not supported for CommonContentId extraction", "SharedPlaybackCommonEntityExtractor");
                break;
            default:
                b6e.s();
                return null;
        }
        return obj == null ? new cd5((List) b.getValue()) : obj;
    }

    @Override // defpackage.w8n
    public Object b(uid uidVar) {
        qhd e = ((t1q) uidVar.c.r.k.getValue()).a.e();
        String str = e.a;
        if (str == null) {
            return new l1q(qhd.f.a);
        }
        switch (e.b.ordinal()) {
            case 0:
                StationId f = StationId.f(str);
                f.getClass();
                return new v1q(f, t75.c(str), e.e);
            case 1:
                return new b2q(str);
            case 2:
                return new d1q(str);
            case 3:
                return new f1q(str);
            case 4:
                bd5 A = i9w.A(str, null);
                return A != null ? new s1q(new nvl(A.getId(), A.a())) : new l1q(str);
            case 5:
                return new l1q(str);
            case 6:
                return new i1q(str);
            case 7:
                return new l1q(str);
            default:
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        zcoVar.y((1.0f - f) * nmq.b(zcoVar.p) * 0.5833333f);
        zcoVar.a(f);
    }

    @Override // defpackage.w8n
    public Object o(u4d u4dVar) {
        StationId stationId = u4dVar.d.a;
        stationId.getClass();
        String p = stationId.p();
        p.getClass();
        String n = stationId.n();
        n.getClass();
        return new w3d(new d5d(p, n));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kou
    public void m() {
    }
}
