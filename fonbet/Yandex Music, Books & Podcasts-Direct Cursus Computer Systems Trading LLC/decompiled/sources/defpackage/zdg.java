package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.k;
import com.yandex.media.ynison.service.m;
import com.yandex.media.ynison.service.p;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.s;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.u;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.WrappedTrackDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.skeleton.blocks.tabs.TabDataDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Response;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.novelties.podcasts.PodcastsActivity;

/* loaded from: classes5.dex */
public abstract class zdg {
    public final /* synthetic */ int a;

    public /* synthetic */ zdg(int i) {
        this.a = i;
    }

    public static zjj A(Function1 function1) {
        return new zjj(null, function1);
    }

    public static ueu B(xjo xjoVar, String str) {
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
        try {
            ueu ueuVar = D0.q() ? new ueu(D0.x0(0), D0.x0(1)) : new ueu(str, null);
            i4w.w(D0, null);
            return ueuVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i4w.w(D0, th);
                throw th2;
            }
        }
    }

    public static int C(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    public static final ukd E(ukd ukdVar, Function1 function1) {
        ifp ifpVar = new ifp();
        function1.invoke(ifpVar);
        return ukdVar.d(new lfp(ifpVar));
    }

    public static final m2k G(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        float f = 4;
        float n0 = jx7Var.n0(f);
        float n02 = jx7Var.n0(3);
        float n03 = jx7Var.n0(2);
        float n04 = jx7Var.n0(f);
        agr agrVar = eq0.a;
        return new m2k(n0, n02, n03, n04, ((dq0) oq5Var.j(agrVar)).a.c, ((dq0) oq5Var.j(agrVar)).a.a, 6);
    }

    public static l2f I(String str, Function0 function0, int i) {
        boolean z = (i & 2) == 0;
        int i2 = (i & 16) != 0 ? -1 : 1;
        l2f l2fVar = new l2f(function0);
        if (z) {
            l2fVar.setDaemon(true);
        }
        if (i2 > 0) {
            l2fVar.setPriority(i2);
        }
        l2fVar.setName(str);
        l2fVar.start();
        return l2fVar;
    }

    public static final d70 J(nav navVar, int i, String str) {
        navVar.getClass();
        str.getClass();
        return new d70(navVar.e, c70.e, navVar.a, i, str);
    }

    public static ymk K(Float f) {
        if (f == null) {
            long j = d85.n;
            return new ymk(j, j, j, j, null);
        }
        float floatValue = f.floatValue();
        int i = d85.o;
        return new ymk(mvt.z(floatValue, 1.0f, 0.5f, 0.0f, 24), mvt.z(f.floatValue(), 0.85f, 0.4f, 0.0f, 24), mvt.z(f.floatValue(), 0.6f, 0.45f, 0.0f, 24), mvt.z(f.floatValue(), 1.0f, 0.35f, 0.0f, 24), f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final rrl L(PlaylistHeaderDto playlistHeaderDto) {
        Collection collection;
        ?? r1;
        t2m t2mVar;
        String id;
        TrackDto track;
        playlistHeaderDto.getClass();
        cvl I = uwf.I(playlistHeaderDto);
        List<WrappedTrackDto> tracks = playlistHeaderDto.getTracks();
        if (tracks != null) {
            collection = new ArrayList();
            for (WrappedTrackDto wrappedTrackDto : tracks) {
                mqs a = (wrappedTrackDto == null || (track = wrappedTrackDto.getTrack()) == null) ? null : wts.a(track);
                if (a != null) {
                    collection.add(a);
                }
            }
        } else {
            collection = c5b.a;
        }
        if (collection.isEmpty()) {
            List<WrappedTrackDto> tracks2 = playlistHeaderDto.getTracks();
            if (tracks2 != null) {
                r1 = new ArrayList();
                for (WrappedTrackDto wrappedTrackDto2 : tracks2) {
                    if (wrappedTrackDto2 == null || (id = wrappedTrackDto2.getId()) == null) {
                        t2mVar = null;
                    } else {
                        String albumId = wrappedTrackDto2.getAlbumId();
                        qc7 timestamp = wrappedTrackDto2.getTimestamp();
                        t2mVar = new t2m(id, albumId, timestamp != null ? timestamp.b : null);
                    }
                    if (t2mVar != null) {
                        r1.add(t2mVar);
                    }
                }
            } else {
                r1 = c5b.a;
            }
        } else {
            Iterable iterable = collection;
            r1 = new ArrayList(v75.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                r1.add(new t2m(((mqs) it.next()).d(), null));
            }
        }
        return new rrl(I, r1, collection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x024b, code lost:
    
        return new defpackage.cbq(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aaq M(x xVar) {
        String str;
        fa7 fa7Var;
        p j;
        dd5 dd5Var;
        o3q o3qVar;
        iow iowVar;
        k3q k3qVar;
        iow iowVar2;
        i3q i3qVar;
        String g;
        xVar.getClass();
        fhl l = xVar.C().l();
        switch (l == null ? -1 : mym.a[l.ordinal()]) {
            case -1:
            case 5:
            case 6:
                return new paq("");
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                u l2 = xVar.C().n().l();
                l2.getClass();
                s k = l2.l() ? l2.k() : null;
                if (k != null) {
                    String U = u7g.U(k);
                    String u = xVar.u();
                    u.getClass();
                    return new dbq(u, U);
                }
                rse j2 = l2.j();
                List A = xVar.A();
                A.getClass();
                j2.getClass();
                arf a = btf.a(bwf.c, new r93(7, j2));
                Iterator it = A.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        break;
                    } else {
                        f fVar = (f) it.next();
                        if (gut.F(fVar) != null) {
                            break;
                        } else {
                            int i3 = i2 * 31;
                            String str2 = (String) avf.Q(fVar.t());
                            if (str2 == null) {
                                str2 = "";
                            }
                            int c = k5r.c(i3, 31, str2);
                            dlr p = fVar.p();
                            if (p == null || (g = p.g()) == null || (str = (String) avf.Q(g)) == null || StringsKt.N(str, ':')) {
                                str = null;
                            }
                            int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
                            r rVar = (r) ((Map) a.getValue()).get(Integer.valueOf(fVar.x().j()));
                            if (rVar != null && (j = rVar.j()) != null) {
                                int n = j.n();
                                int i4 = n == 0 ? -1 : zzk.a[ouj.D(n)];
                                if (i4 != -1) {
                                    if (i4 == 1) {
                                        String h = j.k().h();
                                        h.getClass();
                                        dd5Var = new yc5(h);
                                    } else if (i4 == 2) {
                                        String j3 = j.o().j();
                                        j3.getClass();
                                        dd5Var = i9w.A(j3, j.o().i().g());
                                    } else if (i4 == 3) {
                                        String h2 = j.j().h();
                                        h2.getClass();
                                        dd5Var = new xc5(h2);
                                    } else if (i4 != 4) {
                                        b6e.s();
                                        return null;
                                    }
                                    if (!(dd5Var instanceof xc5)) {
                                        int m = j.m();
                                        if (m == 0) {
                                            throw null;
                                        }
                                        switch (ouj.D(m)) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                                iowVar2 = iow.a;
                                                break;
                                            case 4:
                                                iowVar2 = iow.e;
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                        switch (iowVar2.ordinal()) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 5:
                                            case 6:
                                            case 7:
                                                i3qVar = i3q.a;
                                                break;
                                            case 4:
                                                i3qVar = i3q.b;
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                        fa7Var = new fa7(dd5Var, i3qVar);
                                    } else if (dd5Var instanceof yc5) {
                                        int m2 = j.m();
                                        if (m2 == 0) {
                                            throw null;
                                        }
                                        switch (ouj.D(m2)) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 5:
                                            case 8:
                                                iowVar = iow.a;
                                                break;
                                            case 4:
                                                iowVar = iow.e;
                                                break;
                                            case 6:
                                                iowVar = iow.g;
                                                break;
                                            case 7:
                                                iowVar = iow.h;
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                        switch (iowVar.ordinal()) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 5:
                                                k3qVar = k3q.a;
                                                break;
                                            case 4:
                                                k3qVar = k3q.d;
                                                break;
                                            case 6:
                                                k3qVar = k3q.b;
                                                break;
                                            case 7:
                                                k3qVar = k3q.c;
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                        fa7Var = new fa7(dd5Var, k3qVar);
                                    } else if (dd5Var instanceof bd5) {
                                        int m3 = j.m();
                                        if (m3 == 0) {
                                            throw null;
                                        }
                                        int D = ouj.D(m3);
                                        switch ((D != 0 ? D != 4 ? iow.a : iow.e : iow.a).ordinal()) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 5:
                                            case 6:
                                            case 7:
                                                o3qVar = o3q.b;
                                                break;
                                            case 4:
                                                o3qVar = o3q.a;
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                        fa7Var = new fa7(dd5Var, o3qVar);
                                    } else if (dd5Var instanceof cd5) {
                                        fa7Var = new fa7(dd5Var, o2g.m0(bfg.M(j.m())));
                                    } else if (dd5Var != null) {
                                        b6e.s();
                                        return null;
                                    }
                                    i2 = hashCode + (fa7Var != null ? fa7Var.hashCode() : 0);
                                }
                                dd5Var = null;
                                if (!(dd5Var instanceof xc5)) {
                                }
                                i2 = hashCode + (fa7Var != null ? fa7Var.hashCode() : 0);
                            }
                            fa7Var = null;
                            i2 = hashCode + (fa7Var != null ? fa7Var.hashCode() : 0);
                        }
                    }
                }
                break;
            case 2:
                String h3 = xVar.C().m().h();
                h3.getClass();
                return new uaq(h3);
            case 3:
                String h4 = xVar.C().k().h();
                h4.getClass();
                return new caq(h4);
            case 4:
                String g2 = xVar.C().j().g();
                g2.getClass();
                return new paq(g2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static r0s N(TabDataDto tabDataDto, gnq gnqVar) {
        String id;
        String title;
        ?? r5;
        List list;
        String type;
        fnq b;
        if (tabDataDto == null || (id = tabDataDto.getId()) == null || (title = tabDataDto.getTitle()) == null) {
            return null;
        }
        String subtitle = tabDataDto.getSubtitle();
        List covers = tabDataDto.getCovers();
        if (covers != null) {
            List<String> list2 = covers;
            r5 = new ArrayList(v75.o(list2, 10));
            for (String str : list2) {
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                webPath$Storage.getClass();
                r5.add(etn.B(str, webPath$Storage));
            }
        } else {
            r5 = c5b.a;
        }
        List<inq> blocks = tabDataDto.getBlocks();
        if (blocks != null) {
            list = new ArrayList();
            for (inq inqVar : blocks) {
                drf b2 = (inqVar == null || (type = inqVar.getType()) == null || gnqVar == null || (b = gnqVar.b(type)) == null) ? null : b.b(inqVar);
                if (b2 != null) {
                    list.add(b2);
                }
            }
        } else {
            list = c5b.a;
        }
        return new r0s(id, title, subtitle, r5, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final x O(maq maqVar, s0 s0Var) {
        aow aowVar;
        i0 i0Var;
        g9p a;
        String str;
        w Q;
        String str2;
        boolean z = maqVar instanceof jbq;
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (z) {
            jbq jbqVar = (jbq) maqVar;
            gxc gxcVar = jbqVar.c;
            bbq bbqVar = jbqVar.b;
            if (bbqVar instanceof abq) {
                gbq gbqVar = ((abq) bbqVar).a;
                if (gbqVar instanceof ebq) {
                    str2 = ((ebq) gbqVar).b;
                } else {
                    if (!(gbqVar instanceof fbq)) {
                        b6e.s();
                        return null;
                    }
                    str2 = ((fbq) gbqVar).b;
                }
                str = str2;
            } else {
                if (!(bbqVar instanceof xaq)) {
                    b6e.s();
                    return null;
                }
                str = null;
            }
            Map map = bbqVar.f().a;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(y7g.W((d6v) entry.getValue(), ((Number) entry.getKey()).intValue()));
            }
            Map map2 = bbqVar.f().b;
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(y7g.V((b6v) entry2.getValue(), ((Number) entry2.getKey()).intValue()));
            }
            naq naqVar = (naq) CollectionsKt.firstOrNull(jbqVar.q());
            if (str == null) {
                Q = t7g.P(jbqVar.n().size(), gxcVar.a, gxcVar.b, arrayList2);
            } else {
                ArrayList g0 = CollectionsKt.g0(arrayList, arrayList2);
                List q = jbqVar.q();
                ArrayList arrayList3 = new ArrayList(v75.o(q, 10));
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    arrayList3.add(qgg.k0(((naq) it.next()).d));
                }
                Q = t7g.Q(str, g0, arrayList3, jbqVar.k, gxcVar.a, gxcVar.b);
            }
            List n = naqVar == null ? jbqVar.n() : CollectionsKt.h0(jbqVar.n(), naqVar);
            ArrayList arrayList4 = new ArrayList(v75.o(n, 10));
            Iterator it2 = n.iterator();
            while (it2.hasNext()) {
                arrayList4.add(qgg.k0(((naq) it2.next()).d));
            }
            fyu X = u1g.X(jbqVar.s(), naqVar == null);
            s9p P = qgg.P(bbqVar.getId());
            aowVar = new aow(Q, arrayList4, X, P != null ? P.a() : null);
        } else {
            int i = 12;
            if (maqVar instanceof vaq) {
                vaq vaqVar = (vaq) maqVar;
                String str4 = vaqVar.b.b.a;
                str4.getClass();
                dhl t = w.t();
                ghl i2 = m.i();
                i2.d();
                m.f((m) i2.b, str4);
                m mVar = (m) i2.b();
                t.d();
                w.g((w) t.b, mVar);
                w wVar = (w) t.b();
                List list = vaqVar.c;
                ArrayList arrayList5 = new ArrayList(v75.o(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(qgg.k0(((saq) it3.next()).d));
                }
                aowVar = new aow(wVar, (List) arrayList5, (g9p) (objArr3 == true ? 1 : 0), i);
            } else if (maqVar instanceof eaq) {
                dhl t2 = w.t();
                ehl i3 = k.i();
                eaq eaqVar = (eaq) maqVar;
                i3.h(eaqVar.b.c.a);
                k kVar = (k) i3.b();
                t2.d();
                w.f((w) t2.b, kVar);
                w wVar2 = (w) t2.b();
                List list2 = eaqVar.e;
                ArrayList arrayList6 = new ArrayList(v75.o(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(qgg.k0(((daq) it4.next()).d));
                }
                aowVar = new aow(wVar2, (List) arrayList6, (g9p) (objArr2 == true ? 1 : 0), i);
            } else {
                if (!(maqVar instanceof raq)) {
                    b6e.s();
                    return null;
                }
                x xVar = ((raq) maqVar).e;
                w C = xVar.C();
                C.getClass();
                List A = xVar.A();
                A.getClass();
                aowVar = new aow(C, A, (g9p) (objArr == true ? 1 : 0), i);
            }
        }
        List list3 = aowVar.b;
        if (!z) {
            if (maqVar instanceof vaq) {
                vaq vaqVar2 = (vaq) maqVar;
                int i4 = vaqVar2.d;
                String str5 = vaqVar2.f;
                b0 M = v7g.M(2);
                gxc gxcVar2 = vaqVar2.e;
                return v7g.K(aowVar.a, i4, list3, str5, gxcVar2.a, gxcVar2.b, M, null, s0Var, null);
            }
            if (maqVar instanceof eaq) {
                return v7g.K(aowVar.a, 0, list3, "android-main-app", ((eaq) maqVar).c.c().b.a, null, v7g.M(2), null, s0Var, null);
            }
            if (!(maqVar instanceof raq)) {
                b6e.s();
                return null;
            }
            raq raqVar = (raq) maqVar;
            chl I = x.I(raqVar.e);
            I.getClass();
            I.h(raqVar.d);
            I.d();
            x.q((x) I.b, s0Var);
            return (x) I.b();
        }
        jbq jbqVar2 = (jbq) maqVar;
        int i5 = jbqVar2.l;
        b0 M2 = v7g.M(rvf.Q(jbqVar2.e));
        fyu fyuVar = aowVar.c;
        if (fyuVar instanceof eyu) {
            List list4 = ((eyu) fyuVar).a;
            meq k = i0.k();
            k.h(list4);
            i0Var = (i0) k.b();
        } else {
            if (!Intrinsics.d(fyuVar, dyu.a) && fyuVar != null) {
                b6e.s();
                return null;
            }
            i0Var = null;
        }
        bbq bbqVar2 = jbqVar2.b;
        if (bbqVar2 instanceof abq) {
            gbq gbqVar2 = ((abq) bbqVar2).a;
            if (gbqVar2 instanceof ebq) {
                a = ((ebq) gbqVar2).a.a();
            } else {
                if (!(gbqVar2 instanceof fbq)) {
                    b6e.s();
                    return null;
                }
                a = ((fbq) gbqVar2).a.a();
            }
            str3 = o8g.Q(a);
        } else if (!(bbqVar2 instanceof xaq)) {
            b6e.s();
            return null;
        }
        String str6 = str3;
        gxc gxcVar3 = jbqVar2.c;
        return v7g.K(aowVar.a, i5, list3, null, gxcVar3.a, gxcVar3.b, M2, i0Var, s0Var, str6);
    }

    public static final raq P(x xVar, String str, ArrayList arrayList) {
        List list;
        if (arrayList.isEmpty()) {
            list = t75.c(new qaq(uow.j));
        } else {
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new qaq(((faq) it.next()).e()));
            }
            list = arrayList2;
        }
        raq raqVar = new raq(new oaq(), list, yhn.e(xVar.r(), u75.f(list)), xVar);
        s0 E = xVar.E();
        E.getClass();
        raqVar.a = swf.m0(E, str);
        return raqVar;
    }

    public static final void R(qfp qfpVar, int i, y66 y66Var) {
        qfp qfpVar2;
        eqi eqiVar = new eqi(new qfp[16]);
        List g = qfpVar.g(false, false);
        while (true) {
            eqiVar.f(g, eqiVar.c);
            while (true) {
                int i2 = eqiVar.c;
                if (i2 == 0) {
                    return;
                }
                qfpVar2 = (qfp) eqiVar.m(i2 - 1);
                boolean k0 = bkp.k0(qfpVar2);
                jfp jfpVar = qfpVar2.d;
                tpi tpiVar = jfpVar.a;
                if (!k0 && !tpiVar.c(ufp.i)) {
                    f8j c = qfpVar2.c();
                    if (c == null) {
                        throw ouj.f("Expected semantics node to have a coordinator.");
                    }
                    aqe W = jf0.W(ltg.w(c));
                    if (W.a < W.c && W.b < W.d) {
                        Object g2 = jfpVar.a.g(hfp.e);
                        if (g2 == null) {
                            g2 = null;
                        }
                        Function2 function2 = (Function2) g2;
                        Object g3 = tpiVar.g(ufp.t);
                        cwo cwoVar = (cwo) (g3 != null ? g3 : null);
                        if (function2 != null && cwoVar != null && ((Number) cwoVar.b.invoke()).floatValue() > 0.0f) {
                            int i3 = i + 1;
                            y66Var.invoke(new dwo(qfpVar2, i3, W, c));
                            R(qfpVar2, i3, y66Var);
                        }
                    }
                }
            }
            g = qfpVar2.g(false, false);
        }
    }

    public static final void c(float f, hq5 hq5Var, int i) {
        float f2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-259607136);
        int i2 = i | 6;
        int i3 = 0;
        int i4 = 1;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            f2 = 160;
            int a = eeh.a(f2 * 0.035d);
            vci vciVar = vci.a;
            yci m = d.m(vciVar, f2);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new gkm(29);
                oq5Var.k0(K);
            }
            yci a2 = nfp.a(m, (Function1) K);
            iz2 iz2Var = b2c.f;
            kfh d = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci m2 = d.m(vciVar, 69);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kin(i3);
                oq5Var.k0(K2);
            }
            gae.b(a0g.E(R.drawable.ic_microphone_40, 0, oq5Var), null, nfp.a(m2, (Function1) K2), ((dq0) oq5Var.j(eq0.a)).a.a, oq5Var, 48, 0);
            yci m3 = d.m(b.a.a(vciVar, iz2Var), f2);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new kin(i4);
                oq5Var.k0(K3);
            }
            yci a3 = nfp.a(m3, (Function1) K3);
            d(androidx.compose.foundation.layout.a.k(a3, a, 0.0f, 2), oq5Var, 0);
            d(a3, oq5Var, 0);
            d(androidx.compose.foundation.layout.a.k(a3, -a, 0.0f, 2), oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
            f2 = f;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xd1(i, f2, 4);
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1003779166);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new kin(2);
                oq5Var.k0(K);
            }
            ksw.j((i2 & 14) | 48, oq5Var, yciVar, (Function1) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 10);
        }
    }

    public static final void e(l8i l8iVar, hq5 hq5Var, int i) {
        l8iVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(932008683);
        int i2 = (oq5Var.f(l8iVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            t7i t7iVar = (t7i) szf.Q(l8iVar.c, oq5Var).getValue();
            if (t7iVar instanceof s7i) {
                oq5Var.Z(-1492736649);
                qgg.c(l8iVar, (s7i) t7iVar, oq5Var, i2 & 14);
                oq5Var.p(false);
            } else {
                if (!(t7iVar instanceof p7i)) {
                    throw vz1.i(oq5Var, -1987818188, false);
                }
                oq5Var.Z(-1492573930);
                bfg.c(l8iVar, (p7i) t7iVar, oq5Var, i2 & 14);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(l8iVar, i, 6);
        }
    }

    public static final void f(String str, o6g o6gVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(576356609);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(o6gVar) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            long j = ((dq0) oq5Var2.j(eq0.a)).b.a;
            ges a = ges.a(nu0.e(), o6gVar);
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            xcs.b(str, vciVar, j, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, a, oq5Var, (i2 & 14) | 48, 3120, 54776);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(str, o6gVar, yciVar2, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(int i, int i2, long j, hq5 hq5Var, yci yciVar, Function0 function0) {
        yci yciVar2;
        long j2;
        int i3;
        int i4;
        yci yciVar3;
        yci yciVar4;
        long j3;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1999644487);
        int i5 = i | (oq5Var.h(function0) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i2 & 4) != 0) {
                j2 = j;
                if (oq5Var.e(j2)) {
                    i3 = 256;
                    i4 = i5 | i3;
                    if ((i4 & 147) == 146 || !oq5Var.z()) {
                        oq5Var.U();
                        if ((i & 1) != 0 || oq5Var.y()) {
                            yci yciVar5 = i6 != 0 ? vci.a : yciVar2;
                            if ((i2 & 4) != 0) {
                                j2 = d85.b(((d85) oq5Var.j(sb6.a)).a, ((Number) oq5Var.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                                i4 &= -897;
                            }
                            yciVar3 = yciVar5;
                        } else {
                            oq5Var.S();
                            if ((i2 & 4) != 0) {
                                i4 &= -897;
                            }
                            yciVar3 = yciVar2;
                        }
                        long j4 = j2;
                        oq5Var.q();
                        float f = 48;
                        aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f, f, 0.0f, 0.0f, 12), "overflow"), false, ild.C(-1641875115, new bu0(j4, 6), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
                        yciVar4 = yciVar3;
                        j3 = j4;
                    } else {
                        oq5Var.S();
                        yciVar4 = yciVar2;
                        j3 = j2;
                    }
                    r = oq5Var.r();
                    if (r != null) {
                        r.d = new p74(function0, yciVar4, j3, i, i2, 1);
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i3 = 128;
            i4 = i5 | i3;
            if ((i4 & 147) == 146) {
            }
            oq5Var.U();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            yciVar3 = yciVar5;
            long j42 = j2;
            oq5Var.q();
            float f2 = 48;
            aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f2, f2, 0.0f, 0.0f, 12), "overflow"), false, ild.C(-1641875115, new bu0(j42, 6), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
            yciVar4 = yciVar3;
            j3 = j42;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        i4 = i5 | i3;
        if ((i4 & 147) == 146) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        yciVar3 = yciVar5;
        long j422 = j2;
        oq5Var.q();
        float f22 = 48;
        aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f22, f22, 0.0f, 0.0f, 12), "overflow"), false, ild.C(-1641875115, new bu0(j422, 6), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
        yciVar4 = yciVar3;
        j3 = j422;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void h(lin linVar, grv grvVar, hq5 hq5Var, int i) {
        int i2;
        lin linVar2;
        grv grvVar2;
        int i3;
        grv grvVar3;
        float f;
        boolean z;
        Object r9nVar;
        yci yciVar;
        String str;
        kjn kjnVar;
        vci vciVar;
        float f2;
        int i4;
        float f3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(305373964);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.f(linVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i5 = i2 | 16;
        if (oq5Var.P(i5 & 1, (i5 & 19) != 18)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                i3 = i5 & (-113);
                grvVar3 = ltg.A(oq5Var).a;
            } else {
                oq5Var.S();
                i3 = i5 & (-113);
                grvVar3 = grvVar;
            }
            oq5Var.q();
            vci vciVar2 = vci.a;
            float f4 = 16;
            float f5 = 0;
            yci u = xp3.u(d.d(vciVar2, 1.0f), ugo.b(f4, f4, f5, f5));
            agr agrVar = eq0.a;
            float f6 = 24;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(u, ((dq0) oq5Var.j(agrVar)).c.b, vnj.i), f6, 0.0f, 2);
            ta5 a = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i6 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f7 = 40;
            u1g.l(oq5Var, d.e(vciVar2, f7));
            iz2 iz2Var = b2c.f;
            Object K = oq5Var.K();
            int i7 = i3;
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = new gkm(28);
                oq5Var.k0(K);
            }
            yci a2 = nfp.a(vciVar2, (Function1) K);
            kfh d = ug3.d(iz2Var, false);
            int i8 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (grvVar3.b.equals(jpv.b)) {
                f = 0.0f;
                z = false;
                oq5Var.Z(938901714);
            } else {
                oq5Var.Z(941679717);
                f = 0.0f;
                z = false;
                c(0.0f, oq5Var, 0);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar2, f6));
            boolean z2 = z;
            xv7.j(rvf.M(R.string.permissions_microphone, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65274);
            float f8 = 12;
            u1g.l(oq5Var, d.e(vciVar2, f8));
            xv7.j(rvf.M(R.string.permissions_microphone_desc, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65274);
            u1g.l(oq5Var, d.e(vciVar2, f6));
            float f9 = 150;
            yci t = d.t(vciVar2, f9, f, 2);
            String M = rvf.M(R.string.permissions_microphone_to_settings, oq5Var);
            int i9 = i7 & 14;
            boolean z3 = i9 != 4 ? z2 : true;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar2) {
                grvVar2 = grvVar3;
                yciVar = t;
                str = M;
                kjnVar = kjnVar2;
                vciVar = vciVar2;
                f2 = f8;
                i4 = 2;
                f3 = f7;
                r9nVar = new r9n(0, linVar, lin.class, "onTryClicked", "onTryClicked()V", 0, 5);
                oq5Var.k0(r9nVar);
            } else {
                grvVar2 = grvVar3;
                f2 = f8;
                kjnVar = kjnVar2;
                yciVar = t;
                str = M;
                r9nVar = K2;
                f3 = f7;
                i4 = 2;
                vciVar = vciVar2;
            }
            hdg.o(str, (Function0) ((h9f) r9nVar), yciVar, 0.0f, oq5Var, 384, 8);
            u1g.l(oq5Var, d.e(vciVar, f2));
            yci t2 = d.t(vciVar, f9, 0.0f, i4);
            if (i9 == 4) {
                z2 = true;
            }
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                K3 = new r9n(0, linVar, lin.class, "onNotNowClicked", "onNotNowClicked()V", 0, 6);
                linVar2 = linVar;
                oq5Var.k0(K3);
            } else {
                linVar2 = linVar;
            }
            oq5Var = oq5Var;
            bcx.d((Function0) ((h9f) K3), t2, false, ltg.j, oq5Var, 3120, 4);
            eta.p(vciVar, f3, oq5Var, true);
        } else {
            linVar2 = linVar;
            oq5Var.S();
            grvVar2 = grvVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(linVar2, grvVar2, i, 4);
        }
    }

    public static final void i(dsu dsuVar, t tVar, u0q u0qVar, hq5 hq5Var, int i) {
        int i2;
        u0q u0qVar2;
        dzf dzfVar;
        dsu dsuVar2;
        t tVar2;
        dsuVar.getClass();
        tVar.getClass();
        u0qVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1401934292);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(dsuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(u0qVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            dsuVar2 = dsuVar;
            tVar2 = tVar;
            u0qVar2 = u0qVar;
        } else {
            dzf dzfVar2 = (dzf) oq5Var.j(ykg.a);
            boolean h = oq5Var.h(u0qVar) | oq5Var.h(dzfVar2) | oq5Var.h(dsuVar) | oq5Var.h(tVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                u0qVar2 = u0qVar;
                K = new lco(u0qVar2, dzfVar2, dsuVar, tVar, (Continuation) null, 25);
                dzfVar = dzfVar2;
                dsuVar2 = dsuVar;
                tVar2 = tVar;
                oq5Var.k0(K);
            } else {
                tVar2 = tVar;
                u0qVar2 = u0qVar;
                dzfVar = dzfVar2;
                dsuVar2 = dsuVar;
            }
            gld.y(u0qVar2, dzfVar, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(dsuVar2, tVar2, u0qVar2, i, 19);
        }
    }

    public static final void k(final yci yciVar, xxk xxkVar, bo6 bo6Var, ld1 ld1Var, Function0 function0, Function0 function02, Function0 function03, final Function0 function04, Function0 function05, final Function0 function06, final Function0 function07, Function0 function08, hq5 hq5Var, int i, int i2, int i3) {
        int i4;
        xxk xxkVar2;
        bo6 bo6Var2;
        ld1 ld1Var2;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        int i5;
        Function0 function012;
        int i6;
        int i7;
        int i8;
        int i9;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        yciVar.getClass();
        xxkVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1657214142);
        if ((i & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            xxkVar2 = xxkVar;
            i4 |= oq5Var.f(xxkVar2) ? 32 : 16;
        } else {
            xxkVar2 = xxkVar;
        }
        if ((i & 384) == 0) {
            bo6Var2 = bo6Var;
            i4 |= oq5Var.f(bo6Var2) ? 256 : 128;
        } else {
            bo6Var2 = bo6Var;
        }
        if ((i & 3072) == 0) {
            ld1Var2 = ld1Var;
            i4 |= oq5Var.f(ld1Var2) ? 2048 : 1024;
        } else {
            ld1Var2 = ld1Var;
        }
        if ((i & 24576) == 0) {
            function09 = function0;
            i4 |= oq5Var.h(function09) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function09 = function0;
        }
        if ((196608 & i) == 0) {
            function010 = function02;
            i4 |= oq5Var.h(function010) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function010 = function02;
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i5 = i4 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            function011 = function03;
        } else {
            function011 = function03;
            i5 = i4 | (oq5Var.h(function011) ? 1048576 : 524288);
        }
        if ((i & 12582912) == 0) {
            i5 |= oq5Var.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i11 = i3 & 256;
        if (i11 != 0) {
            i6 = i5 | 100663296;
            function012 = function05;
        } else {
            function012 = function05;
            i6 = i5 | (oq5Var.h(function012) ? 67108864 : 33554432);
        }
        if ((i & 805306368) == 0) {
            i6 |= oq5Var.h(function06) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i7 = i2 | (oq5Var.h(function07) ? 4 : 2);
        } else {
            i7 = i2;
        }
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i9 = i7 | 48;
            i8 = i12;
        } else {
            i8 = i12;
            i9 = i7 | (oq5Var.h(function08) ? 32 : 16);
        }
        if (oq5Var.P(i6 & 1, ((i6 & 306783379) == 306783378 && (i9 & 19) == 18) ? false : true)) {
            final Function0 function016 = i10 != 0 ? null : function011;
            final Function0 function017 = i11 != 0 ? null : function012;
            final Function0 function018 = i8 != 0 ? null : function08;
            final xxk xxkVar3 = xxkVar2;
            final bo6 bo6Var3 = bo6Var2;
            final ld1 ld1Var3 = ld1Var2;
            final Function0 function019 = function09;
            final Function0 function020 = function010;
            bg3.a(null, null, false, ild.C(745255700, new pyc() { // from class: nws
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    x2i x2iVar;
                    kb5 kb5Var;
                    kb5 kb5Var2;
                    grb grbVar;
                    kb5 kb5Var3;
                    xxk xxkVar4;
                    qho qhoVar;
                    boolean z;
                    kjn kjnVar;
                    ld1 ld1Var4;
                    vci vciVar;
                    yci yciVar2;
                    vci vciVar2;
                    boolean z2;
                    xxk xxkVar5;
                    boolean z3;
                    boolean z4;
                    nws nwsVar;
                    boolean z5;
                    boolean z6;
                    Function0 function021;
                    Function0 function022;
                    String str;
                    yci yciVar3;
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    hz2 hz2Var = b2c.m;
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                        float d = cVar.d();
                        yci a = androidx.compose.ui.platform.a.a(yci.this, "track_info");
                        hz2 hz2Var2 = b2c.l;
                        x2i x2iVar2 = qx0.a;
                        nho a2 = lho.a(x2iVar2, hz2Var2, oq5Var2, 48);
                        int i13 = oq5Var2.P;
                        a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, a);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar2);
                        } else {
                            oq5Var2.n0();
                        }
                        kb5 kb5Var4 = wp5.f;
                        g0g.U(oq5Var2, a2, kb5Var4);
                        kb5 kb5Var5 = wp5.e;
                        g0g.U(oq5Var2, l, kb5Var5);
                        kb5 kb5Var6 = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i13))) {
                            ouj.x(i13, oq5Var2, i13, kb5Var6);
                        }
                        kb5 kb5Var7 = wp5.d;
                        g0g.U(oq5Var2, H, kb5Var7);
                        vci vciVar3 = vci.a;
                        bo6 bo6Var4 = bo6Var3;
                        if (bo6Var4 != null) {
                            oq5Var2.Z(1365295960);
                            kb5Var = kb5Var7;
                            kb5Var3 = kb5Var4;
                            grbVar = grbVar2;
                            x2iVar = x2iVar2;
                            kb5Var2 = kb5Var6;
                            quj.c(bo6Var4, androidx.compose.foundation.layout.a.q(d.m(vciVar3, 52), 0.0f, 0.0f, 8, 0.0f, 11), 4, 0.0f, oq5Var2, 432, 8);
                        } else {
                            x2iVar = x2iVar2;
                            kb5Var = kb5Var7;
                            kb5Var2 = kb5Var6;
                            grbVar = grbVar2;
                            kb5Var3 = kb5Var4;
                            oq5Var2.Z(1361464298);
                        }
                        oq5Var2.p(false);
                        int compare = Float.compare(d, 335);
                        xxk xxkVar6 = xxkVar3;
                        kjn kjnVar2 = gq5.a;
                        qho qhoVar2 = qho.a;
                        if (compare > 0 || ((Boolean) fjl.a.getValue()).booleanValue()) {
                            oq5Var2.Z(1365668239);
                            Object K = oq5Var2.K();
                            if (K == kjnVar2) {
                                K = new w41();
                                oq5Var2.k0(K);
                            }
                            w41 w41Var = (w41) K;
                            List list = xxkVar6.p;
                            List list2 = list;
                            if (list2 == null || list2.isEmpty() || (ld1Var4 = ld1Var3) == null) {
                                xxkVar4 = xxkVar6;
                                qhoVar = qhoVar2;
                                z = false;
                                kjnVar = kjnVar2;
                                oq5Var2.Z(1361464298);
                            } else {
                                oq5Var2.Z(1365835019);
                                oq5Var2.W(1013891183, list);
                                Object K2 = oq5Var2.K();
                                if (K2 == kjnVar2) {
                                    K2 = new phs(14);
                                    oq5Var2.k0(K2);
                                }
                                yci u = d.u(qhoVar2.b(d.e(androidx.compose.foundation.layout.a.q(nfp.a(vciVar3, (Function1) K2), 8, 0.0f, 0.0f, 0.0f, 14), 0), hz2Var), hz2Var, true);
                                kjnVar = kjnVar2;
                                xxkVar4 = xxkVar6;
                                qhoVar = qhoVar2;
                                ma1.b(list.size(), 3072, w41Var, ld1Var4, oq5Var2, u, function019, function018, xxkVar6.m == qxk.b);
                                z = false;
                                oq5Var2.p(false);
                            }
                            oq5Var2.p(z);
                            oq5Var2.p(z);
                        } else {
                            oq5Var2.Z(1361464298);
                            oq5Var2.p(false);
                            xxkVar4 = xxkVar6;
                            kjnVar = kjnVar2;
                            qhoVar = qhoVar2;
                        }
                        boolean d2 = oq5Var2.d(xxkVar4.m.ordinal());
                        Object K3 = oq5Var2.K();
                        if (d2 || K3 == kjnVar) {
                            K3 = Boolean.valueOf(u75.h(qxk.c, qxk.b).contains(xxkVar4.m));
                            oq5Var2.k0(K3);
                        }
                        boolean booleanValue = ((Boolean) K3).booleanValue();
                        yci a3 = qhoVar.a(1.0f, vciVar3, true);
                        Object K4 = oq5Var2.K();
                        if (K4 == kjnVar) {
                            K4 = new phs(15);
                            oq5Var2.k0(K4);
                        }
                        yci b = nfp.b(a3, false, (Function1) K4);
                        ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                        int i14 = oq5Var2.P;
                        a l2 = oq5Var2.l();
                        yci H2 = vnj.H(oq5Var2, b);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a4, kb5Var3);
                        g0g.U(oq5Var2, l2, kb5Var5);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i14))) {
                            ouj.x(i14, oq5Var2, i14, kb5Var2);
                        }
                        kb5 kb5Var8 = kb5Var;
                        g0g.U(oq5Var2, H2, kb5Var8);
                        yci d3 = d.d(vciVar3, 1.0f);
                        Function0 function023 = function020;
                        if (function023 == null || !booleanValue) {
                            vciVar = vciVar3;
                            oq5Var2.Z(-746336660);
                            oq5Var2.p(false);
                            yciVar2 = vciVar;
                        } else {
                            oq5Var2.Z(-746667709);
                            vciVar = vciVar3;
                            yciVar2 = androidx.compose.foundation.a.j(xp3.u(vciVar3, ugo.a(4)), rvf.M(R.string.copy, oq5Var2), irf.S(function016, oq5Var2, 0), function023, 103);
                            oq5Var2.p(false);
                        }
                        yci f = d3.f(yciVar2);
                        float f2 = 8;
                        yci q = androidx.compose.foundation.layout.a.q(f, f2, 0.0f, 0.0f, 0.0f, 14);
                        Object K5 = oq5Var2.K();
                        if (K5 == kjnVar) {
                            K5 = new phs(16);
                            oq5Var2.k0(K5);
                        }
                        yci b2 = nfp.b(q, false, (Function1) K5);
                        nho a5 = lho.a(x2iVar, hz2Var, oq5Var2, 48);
                        int i15 = oq5Var2.P;
                        a l3 = oq5Var2.l();
                        yci H3 = vnj.H(oq5Var2, b2);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a5, kb5Var3);
                        g0g.U(oq5Var2, l3, kb5Var5);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i15))) {
                            ouj.x(i15, oq5Var2, i15, kb5Var2);
                        }
                        g0g.U(oq5Var2, H3, kb5Var8);
                        Object K6 = oq5Var2.K();
                        if (K6 == kjnVar) {
                            K6 = tlm.h(0.0f, oq5Var2);
                        }
                        jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                        t6k t6kVar = (t6k) ((poi) K6);
                        float d0 = jx7Var.d0(t6kVar.e()) - jx7Var.p(v7g.y(2.5d));
                        float f3 = 0;
                        if (d0 >= f3) {
                            f3 = d0;
                        }
                        String obj4 = xxkVar4.b.toString();
                        vci vciVar4 = vciVar;
                        float f4 = 10;
                        float f5 = 20;
                        yci a6 = androidx.compose.ui.platform.a.a(wdg.V(qhoVar.a(1.0f, vciVar4, false), f4, f5), "track_name");
                        ges b3 = nu0.b();
                        agr agrVar = eq0.a;
                        float f6 = f3;
                        long j = ((dq0) oq5Var2.j(agrVar)).a.a;
                        Object K7 = oq5Var2.K();
                        if (K7 == kjnVar) {
                            K7 = new bh0(t6kVar);
                            oq5Var2.k0(K7);
                        }
                        xv7.j(obj4, a6, j, 0L, 0L, 0, 0L, 0, false, 0, 0, (Function1) ((h9f) K7), b3, oq5Var2, 0, 196608, 32760);
                        oq5 oq5Var3 = oq5Var2;
                        float f7 = 4;
                        yci q2 = androidx.compose.foundation.layout.a.q(vciVar4, f7, 0.0f, 0.0f, f6, 6);
                        xxk xxkVar7 = xxkVar4;
                        yci m = d.m(q2, ff7.P(v7g.z(16), oq5Var3));
                        if (xxkVar7.j != null) {
                            oq5Var3.Z(1171719279);
                            vciVar2 = vciVar4;
                            lg3.q(xxkVar7.j, m, ((dq0) oq5Var3.j(agrVar)).b.a, oq5Var3, 0, 0);
                            z2 = false;
                        } else {
                            vciVar2 = vciVar4;
                            z2 = false;
                            oq5Var3.Z(1163692976);
                        }
                        oq5Var3.p(z2);
                        oq5Var3.p(true);
                        String valueOf = String.valueOf(xxkVar7.c);
                        if (valueOf.length() > 0) {
                            oq5Var3.Z(-744427618);
                            yci d4 = d.d(vciVar2, 1.0f);
                            Function0 function024 = function04;
                            if (function024 == null || !booleanValue) {
                                xxkVar5 = xxkVar7;
                                str = valueOf;
                                oq5Var3.Z(-743784244);
                                oq5Var3.p(false);
                                yciVar3 = vciVar2;
                            } else {
                                oq5Var3.Z(-744121059);
                                str = valueOf;
                                xxkVar5 = xxkVar7;
                                yciVar3 = androidx.compose.foundation.a.j(xp3.u(vciVar2, ugo.a(f7)), rvf.M(R.string.copy, oq5Var3), irf.S(function017, oq5Var3, 0), function024, 103);
                                oq5Var3.p(false);
                            }
                            yci q3 = androidx.compose.foundation.layout.a.q(d4.f(yciVar3), f2, 0.0f, 0.0f, 0.0f, 14);
                            Object K8 = oq5Var3.K();
                            if (K8 == kjnVar) {
                                K8 = new phs(17);
                                oq5Var3.k0(K8);
                            }
                            yci b4 = nfp.b(q3, false, (Function1) K8);
                            kfh d5 = ug3.d(b2c.b, false);
                            int i16 = oq5Var3.P;
                            a l4 = oq5Var3.l();
                            yci H4 = vnj.H(oq5Var3, b4);
                            oq5Var3.d0();
                            if (oq5Var3.O) {
                                oq5Var3.k(grbVar);
                            } else {
                                oq5Var3.n0();
                            }
                            g0g.U(oq5Var3, d5, kb5Var3);
                            g0g.U(oq5Var3, l4, kb5Var5);
                            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i16))) {
                                ouj.x(i16, oq5Var3, i16, kb5Var2);
                            }
                            g0g.U(oq5Var3, H4, kb5Var8);
                            nwsVar = this;
                            xv7.j(str, androidx.compose.ui.platform.a.a(wdg.V(vciVar2, f4, f5), "artist_name"), ((dq0) oq5Var3.j(agrVar)).a.c, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, 0, 0, 65528);
                            oq5Var3 = oq5Var3;
                            z3 = true;
                            oq5Var3.p(true);
                            z4 = false;
                        } else {
                            xxkVar5 = xxkVar7;
                            z3 = true;
                            z4 = false;
                            nwsVar = this;
                            oq5Var3.Z(-752859308);
                        }
                        oq5Var3.p(z4);
                        oq5Var3.p(z3);
                        xxk xxkVar8 = xxkVar5;
                        if (!xxkVar8.k || (function022 = function06) == null) {
                            z5 = false;
                            oq5Var3.Z(1361464298);
                        } else {
                            oq5Var3.Z(1371321988);
                            Object K9 = oq5Var3.K();
                            if (K9 == kjnVar) {
                                K9 = new phs(18);
                                oq5Var3.k0(K9);
                            }
                            z5 = false;
                            aae.a(function022, nfp.b(vciVar2, false, (Function1) K9), false, sj2.f, oq5Var3, 24576, 12);
                        }
                        oq5Var3.p(z5);
                        if (!xxkVar8.l || (function021 = function07) == null) {
                            z6 = false;
                            oq5Var3.Z(1361464298);
                        } else {
                            oq5Var3.Z(1371870471);
                            aae.a(function021, androidx.compose.ui.platform.a.a(vciVar2, "overflow_button"), false, sj2.g, oq5Var3, 24624, 12);
                            z6 = false;
                        }
                        oq5Var3.p(z6);
                        oq5Var3.p(true);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 7);
            function013 = function018;
            function015 = function016;
            function014 = function017;
        } else {
            oq5Var.S();
            function013 = function08;
            function014 = function012;
            function015 = function011;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g4k(yciVar, xxkVar, bo6Var, ld1Var, function0, function02, function015, function04, function014, function06, function07, function013, i, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0193, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1.K(), java.lang.Integer.valueOf(r11)) == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0356 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03a1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(gsu gsuVar, nru nruVar, sai saiVar, bci bciVar, yci yciVar, hq5 hq5Var, int i) {
        Object obj;
        boolean z;
        boolean z2;
        Object K;
        yoc yocVar;
        aqi aqiVar;
        c3r c3rVar;
        aqi aqiVar2;
        Object obj2;
        String str;
        int i2;
        aqi aqiVar3;
        int i3;
        int i4;
        boolean f;
        Object K2;
        boolean g;
        Object K3;
        int i5;
        Object obj3;
        boolean z3;
        String str2;
        boolean f2;
        Object rh1Var;
        boolean z4;
        String str3;
        c3r c3rVar2;
        yoc yocVar2;
        aqi aqiVar4;
        boolean z5;
        Object obj4;
        f3r f3rVar;
        rbf rbfVar;
        boolean z6;
        Object K4;
        rbf rbfVar2;
        f3r f3rVar2;
        boolean f3;
        Object K5;
        boolean f4;
        Object K6;
        oq5 oq5Var;
        yci yciVar2;
        gsuVar.getClass();
        String str4 = gsuVar.b;
        saiVar.getClass();
        bciVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1569087738);
        int i6 = i | (oq5Var2.h(gsuVar) ? 4 : 2) | (oq5Var2.h(nruVar) ? 32 : 16) | (oq5Var2.f(saiVar) ? 256 : 128) | (oq5Var2.h(bciVar) ? 2048 : 1024) | 24576;
        if ((i6 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            Object obj5 = gsuVar.a;
            String K7 = mlr.K(200, str4);
            boolean f5 = oq5Var2.f(obj5);
            Object K8 = oq5Var2.K();
            Object obj6 = gq5.a;
            if (f5 || K8 == obj6) {
                int length = K7.length();
                K8 = szf.g0(new ybs(K7, y5g.P(length, length), 4));
                oq5Var2.k0(K8);
            }
            aqi aqiVar5 = (aqi) K8;
            String obj7 = StringsKt.t0(((ybs) aqiVar5.getValue()).a.b).toString();
            boolean z7 = (Intrinsics.d(obj7, StringsKt.t0(str4).toString()) || StringsKt.U(obj7)) ? false : true;
            Object K9 = oq5Var2.K();
            if (K9 == obj6) {
                K9 = new yoc();
                oq5Var2.k0(K9);
            }
            yoc yocVar3 = (yoc) K9;
            c3r c3rVar3 = (c3r) oq5Var2.j(es5.p);
            boolean f6 = oq5Var2.f(obj5);
            Object K10 = oq5Var2.K();
            if (f6 || K10 == obj6) {
                K10 = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K10);
            }
            aqi aqiVar6 = (aqi) K10;
            Boolean bool = (Boolean) aqiVar6.getValue();
            bool.getClass();
            boolean f7 = oq5Var2.f(aqiVar6);
            if ((i6 & 7168) != 2048) {
                obj = bciVar;
                if (!oq5Var2.h(obj)) {
                    z = false;
                    z2 = f7 | z;
                    K = oq5Var2.K();
                    if (!z2 || K == obj6) {
                        yocVar = yocVar3;
                        aqiVar = aqiVar6;
                        Object obj8 = obj;
                        c3rVar = c3rVar3;
                        aqiVar2 = aqiVar5;
                        obj2 = obj5;
                        str = obj7;
                        i2 = 0;
                        K = new h0t(yocVar, aqiVar, obj8, null, 14);
                        oq5Var2.k0(K);
                    } else {
                        aqiVar2 = aqiVar5;
                        str = obj7;
                        c3rVar = c3rVar3;
                        aqiVar = aqiVar6;
                        yocVar = yocVar3;
                        obj2 = obj5;
                        i2 = 0;
                    }
                    gld.y(bool, obj2, (Function2) K, oq5Var2);
                    vci vciVar = vci.a;
                    yci d = d.d(vciVar, 1.0f);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, i2);
                    int i7 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, d);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.n0();
                    } else {
                        oq5Var2.k(function0);
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var2, a, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var2, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    yoc yocVar4 = yocVar;
                    if (oq5Var2.O) {
                        aqiVar3 = aqiVar;
                    } else {
                        aqiVar3 = aqiVar;
                    }
                    ouj.x(i7, oq5Var2, i7, kb5Var3);
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var2, H, kb5Var4);
                    yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 8, 0.0f, 2);
                    nho a2 = lho.a(qx0.a, b2c.l, oq5Var2, 48);
                    i3 = oq5Var2.P;
                    a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, o);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.n0();
                    } else {
                        oq5Var2.k(function0);
                    }
                    g0g.U(oq5Var2, a2, kb5Var);
                    g0g.U(oq5Var2, l2, kb5Var2);
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var2, i3, kb5Var3);
                    }
                    g0g.U(oq5Var2, H2, kb5Var4);
                    i4 = i6 & 896;
                    f = oq5Var2.f(c3rVar) | (i4 != 256);
                    K2 = oq5Var2.K();
                    if (!f || K2 == obj6) {
                        K2 = new xes(23, c3rVar, saiVar);
                        oq5Var2.k0(K2);
                    }
                    xee.q((Function0) K2, null, false, null, xee.f, oq5Var2, 805306368, 510);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    u1g.l(oq5Var2, new LayoutWeightElement(true, 1.0f));
                    g = oq5Var2.g(z7);
                    K3 = oq5Var2.K();
                    if (!g || K3 == obj6) {
                        K3 = new esu(0, z7);
                        oq5Var2.k0(K3);
                    }
                    yci s = wyf.s(vciVar, (Function0) K3);
                    boolean f8 = oq5Var2.f(c3rVar) | oq5Var2.h(nruVar);
                    i5 = i6 & 14;
                    if (i5 == 4) {
                        obj3 = gsuVar;
                        if (!oq5Var2.h(obj3)) {
                            z3 = false;
                            boolean z8 = f8 | z3;
                            str2 = str;
                            f2 = z8 | oq5Var2.f(str2) | (i4 == 256);
                            Object K11 = oq5Var2.K();
                            if (!f2 || K11 == obj6) {
                                z4 = z7;
                                Object obj9 = obj3;
                                str3 = str2;
                                c3rVar2 = c3rVar;
                                yocVar2 = yocVar4;
                                aqiVar4 = aqiVar3;
                                z5 = false;
                                obj4 = obj6;
                                rh1Var = new rh1(c3rVar2, nruVar, obj9, str3, saiVar, 12);
                                oq5Var2.k0(rh1Var);
                            } else {
                                str3 = str2;
                                c3rVar2 = c3rVar;
                                yocVar2 = yocVar4;
                                z5 = false;
                                z4 = z7;
                                obj4 = obj6;
                                rh1Var = K11;
                                aqiVar4 = aqiVar3;
                            }
                            boolean z9 = z4;
                            String str5 = str3;
                            yoc yocVar5 = yocVar2;
                            aqi aqiVar7 = aqiVar4;
                            c3r c3rVar4 = c3rVar2;
                            xee.q((Function0) rh1Var, s, z9, null, xee.g, oq5Var2, 805306368, 504);
                            oq5Var2.p(true);
                            ybs ybsVar = (ybs) aqiVar2.getValue();
                            ges d2 = nu0.d();
                            ozm ozmVar = eq0.a;
                            ges b = ges.b(d2, ((dq0) oq5Var2.j(ozmVar)).b.a, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16773118);
                            f3rVar = new f3r(((dq0) oq5Var2.j(ozmVar)).b.a);
                            rbfVar = new rbf(118);
                            boolean g2 = oq5Var2.g(z9) | oq5Var2.f(c3rVar4) | oq5Var2.h(nruVar) | ((i5 != 4 || oq5Var2.h(gsuVar)) ? true : z5) | oq5Var2.f(str5);
                            if (i4 == 256) {
                                z5 = true;
                            }
                            z6 = g2 | z5;
                            K4 = oq5Var2.K();
                            if (!z6 || K4 == obj4) {
                                rbfVar2 = rbfVar;
                                f3rVar2 = f3rVar;
                                Object d6pVar = new d6p(z9, c3rVar4, nruVar, gsuVar, str5, saiVar);
                                oq5Var2.k0(d6pVar);
                                K4 = d6pVar;
                            } else {
                                rbfVar2 = rbfVar;
                                f3rVar2 = f3rVar;
                            }
                            pbf pbfVar = new pbf(62, (Function1) K4);
                            yci a3 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.o(d.g(d.d(vciVar, 1.0f), 80, 0.0f, 2), 16, 0.0f, 2), yocVar5);
                            f3 = oq5Var2.f(aqiVar7);
                            K5 = oq5Var2.K();
                            if (!f3 || K5 == obj4) {
                                K5 = new x80(aqiVar7, 23);
                                oq5Var2.k0(K5);
                            }
                            yci d3 = androidx.compose.ui.layout.a.d(a3, (Function1) K5);
                            aqi aqiVar8 = aqiVar2;
                            f4 = oq5Var2.f(aqiVar8);
                            K6 = oq5Var2.K();
                            if (!f4 || K6 == obj4) {
                                K6 = new x80(aqiVar8, 24);
                                oq5Var2.k0(K6);
                            }
                            nv2.a(ybsVar, (Function1) K6, d3, false, b, rbfVar2, pbfVar, false, 0, 0, null, null, null, f3rVar2, null, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 0, 48920);
                            oq5Var = oq5Var2;
                            eta.p(vciVar, 32, oq5Var, true);
                            yciVar2 = vciVar;
                        }
                    } else {
                        obj3 = gsuVar;
                    }
                    z3 = true;
                    boolean z82 = f8 | z3;
                    str2 = str;
                    f2 = z82 | oq5Var2.f(str2) | (i4 == 256);
                    Object K112 = oq5Var2.K();
                    if (f2) {
                    }
                    z4 = z7;
                    Object obj92 = obj3;
                    str3 = str2;
                    c3rVar2 = c3rVar;
                    yocVar2 = yocVar4;
                    aqiVar4 = aqiVar3;
                    z5 = false;
                    obj4 = obj6;
                    rh1Var = new rh1(c3rVar2, nruVar, obj92, str3, saiVar, 12);
                    oq5Var2.k0(rh1Var);
                    boolean z92 = z4;
                    String str52 = str3;
                    yoc yocVar52 = yocVar2;
                    aqi aqiVar72 = aqiVar4;
                    c3r c3rVar42 = c3rVar2;
                    xee.q((Function0) rh1Var, s, z92, null, xee.g, oq5Var2, 805306368, 504);
                    oq5Var2.p(true);
                    ybs ybsVar2 = (ybs) aqiVar2.getValue();
                    ges d22 = nu0.d();
                    ozm ozmVar2 = eq0.a;
                    ges b2 = ges.b(d22, ((dq0) oq5Var2.j(ozmVar2)).b.a, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16773118);
                    f3rVar = new f3r(((dq0) oq5Var2.j(ozmVar2)).b.a);
                    rbfVar = new rbf(118);
                    boolean g22 = oq5Var2.g(z92) | oq5Var2.f(c3rVar42) | oq5Var2.h(nruVar) | ((i5 != 4 || oq5Var2.h(gsuVar)) ? true : z5) | oq5Var2.f(str52);
                    if (i4 == 256) {
                    }
                    z6 = g22 | z5;
                    K4 = oq5Var2.K();
                    if (z6) {
                    }
                    rbfVar2 = rbfVar;
                    f3rVar2 = f3rVar;
                    Object d6pVar2 = new d6p(z92, c3rVar42, nruVar, gsuVar, str52, saiVar);
                    oq5Var2.k0(d6pVar2);
                    K4 = d6pVar2;
                    pbf pbfVar2 = new pbf(62, (Function1) K4);
                    yci a32 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.o(d.g(d.d(vciVar, 1.0f), 80, 0.0f, 2), 16, 0.0f, 2), yocVar52);
                    f3 = oq5Var2.f(aqiVar72);
                    K5 = oq5Var2.K();
                    if (!f3) {
                    }
                    K5 = new x80(aqiVar72, 23);
                    oq5Var2.k0(K5);
                    yci d32 = androidx.compose.ui.layout.a.d(a32, (Function1) K5);
                    aqi aqiVar82 = aqiVar2;
                    f4 = oq5Var2.f(aqiVar82);
                    K6 = oq5Var2.K();
                    if (!f4) {
                    }
                    K6 = new x80(aqiVar82, 24);
                    oq5Var2.k0(K6);
                    nv2.a(ybsVar2, (Function1) K6, d32, false, b2, rbfVar2, pbfVar2, false, 0, 0, null, null, null, f3rVar2, null, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 0, 48920);
                    oq5Var = oq5Var2;
                    eta.p(vciVar, 32, oq5Var, true);
                    yciVar2 = vciVar;
                }
            } else {
                obj = bciVar;
            }
            z = true;
            z2 = f7 | z;
            K = oq5Var2.K();
            if (z2) {
            }
            yocVar = yocVar3;
            aqiVar = aqiVar6;
            Object obj82 = obj;
            c3rVar = c3rVar3;
            aqiVar2 = aqiVar5;
            obj2 = obj5;
            str = obj7;
            i2 = 0;
            K = new h0t(yocVar, aqiVar, obj82, null, 14);
            oq5Var2.k0(K);
            gld.y(bool, obj2, (Function2) K, oq5Var2);
            vci vciVar2 = vci.a;
            yci d4 = d.d(vciVar2, 1.0f);
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var2, i2);
            int i72 = oq5Var2.P;
            a l3 = oq5Var2.l();
            yci H3 = vnj.H(oq5Var2, d4);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var2, a4, kb5Var5);
            kb5 kb5Var22 = wp5.e;
            g0g.U(oq5Var2, l3, kb5Var22);
            kb5 kb5Var32 = wp5.g;
            yoc yocVar42 = yocVar;
            if (oq5Var2.O) {
            }
            ouj.x(i72, oq5Var2, i72, kb5Var32);
            kb5 kb5Var42 = wp5.d;
            g0g.U(oq5Var2, H3, kb5Var42);
            yci o2 = androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), 8, 0.0f, 2);
            nho a22 = lho.a(qx0.a, b2c.l, oq5Var2, 48);
            i3 = oq5Var2.P;
            a l22 = oq5Var2.l();
            yci H22 = vnj.H(oq5Var2, o2);
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, a22, kb5Var5);
            g0g.U(oq5Var2, l22, kb5Var22);
            if (!oq5Var2.O) {
            }
            ouj.x(i3, oq5Var2, i3, kb5Var32);
            g0g.U(oq5Var2, H22, kb5Var42);
            i4 = i6 & 896;
            f = oq5Var2.f(c3rVar) | (i4 != 256);
            K2 = oq5Var2.K();
            if (!f) {
            }
            K2 = new xes(23, c3rVar, saiVar);
            oq5Var2.k0(K2);
            xee.q((Function0) K2, null, false, null, xee.f, oq5Var2, 805306368, 510);
            if (1.0f <= 0.0d) {
            }
            u1g.l(oq5Var2, new LayoutWeightElement(true, 1.0f));
            g = oq5Var2.g(z7);
            K3 = oq5Var2.K();
            if (!g) {
            }
            K3 = new esu(0, z7);
            oq5Var2.k0(K3);
            yci s2 = wyf.s(vciVar2, (Function0) K3);
            boolean f82 = oq5Var2.f(c3rVar) | oq5Var2.h(nruVar);
            i5 = i6 & 14;
            if (i5 == 4) {
            }
            z3 = true;
            boolean z822 = f82 | z3;
            str2 = str;
            f2 = z822 | oq5Var2.f(str2) | (i4 == 256);
            Object K1122 = oq5Var2.K();
            if (f2) {
            }
            z4 = z7;
            Object obj922 = obj3;
            str3 = str2;
            c3rVar2 = c3rVar;
            yocVar2 = yocVar42;
            aqiVar4 = aqiVar3;
            z5 = false;
            obj4 = obj6;
            rh1Var = new rh1(c3rVar2, nruVar, obj922, str3, saiVar, 12);
            oq5Var2.k0(rh1Var);
            boolean z922 = z4;
            String str522 = str3;
            yoc yocVar522 = yocVar2;
            aqi aqiVar722 = aqiVar4;
            c3r c3rVar422 = c3rVar2;
            xee.q((Function0) rh1Var, s2, z922, null, xee.g, oq5Var2, 805306368, 504);
            oq5Var2.p(true);
            ybs ybsVar22 = (ybs) aqiVar2.getValue();
            ges d222 = nu0.d();
            ozm ozmVar22 = eq0.a;
            ges b22 = ges.b(d222, ((dq0) oq5Var2.j(ozmVar22)).b.a, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16773118);
            f3rVar = new f3r(((dq0) oq5Var2.j(ozmVar22)).b.a);
            rbfVar = new rbf(118);
            boolean g222 = oq5Var2.g(z922) | oq5Var2.f(c3rVar422) | oq5Var2.h(nruVar) | ((i5 != 4 || oq5Var2.h(gsuVar)) ? true : z5) | oq5Var2.f(str522);
            if (i4 == 256) {
            }
            z6 = g222 | z5;
            K4 = oq5Var2.K();
            if (z6) {
            }
            rbfVar2 = rbfVar;
            f3rVar2 = f3rVar;
            Object d6pVar22 = new d6p(z922, c3rVar422, nruVar, gsuVar, str522, saiVar);
            oq5Var2.k0(d6pVar22);
            K4 = d6pVar22;
            pbf pbfVar22 = new pbf(62, (Function1) K4);
            yci a322 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.o(d.g(d.d(vciVar2, 1.0f), 80, 0.0f, 2), 16, 0.0f, 2), yocVar522);
            f3 = oq5Var2.f(aqiVar722);
            K5 = oq5Var2.K();
            if (!f3) {
            }
            K5 = new x80(aqiVar722, 23);
            oq5Var2.k0(K5);
            yci d322 = androidx.compose.ui.layout.a.d(a322, (Function1) K5);
            aqi aqiVar822 = aqiVar2;
            f4 = oq5Var2.f(aqiVar822);
            K6 = oq5Var2.K();
            if (!f4) {
            }
            K6 = new x80(aqiVar822, 24);
            oq5Var2.k0(K6);
            nv2.a(ybsVar22, (Function1) K6, d322, false, b22, rbfVar2, pbfVar22, false, 0, 0, null, null, null, f3rVar2, null, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 0, 48920);
            oq5Var = oq5Var2;
            eta.p(vciVar2, 32, oq5Var, true);
            yciVar2 = vciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 25, gsuVar, nruVar, saiVar, bciVar, yciVar2);
        }
    }

    public static final void m(Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1673482676);
        if ((((oq5Var.h(function0) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            sp0.c(vut.g, d.e(vci.a, 44), ild.C(-36639930, new xtp(11, function0), oq5Var), null, ((dq0) oq5Var.j(eq0.a)).c.a, 0L, ((d3w) oq5Var.j(e3w.a)).f.a, oq5Var, 438, 40);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function0, i, 12);
        }
    }

    public static final void n(hxv hxvVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1322161627);
        int i2 = (oq5Var.f(hxvVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(hxvVar.a, oq5Var);
            yci q = androidx.compose.foundation.layout.a.q(d.c(vci.a, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
            boolean f = ((i2 & 14) == 4) | oq5Var.f(O);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new itv(2, O, hxvVar);
                oq5Var.k0(K);
            }
            weo.g(q, null, null, null, null, null, false, (Function1) K, oq5Var, 6, 254);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new exv(hxvVar, i, 1);
        }
    }

    public static final void o(hxv hxvVar, hq5 hq5Var, int i) {
        hxvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1456090152);
        int i2 = (oq5Var.f(hxvVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new dxv(0, hxvVar);
                oq5Var.k0(K);
            }
            pd.c(0, 1, oq5Var, (Function0) K, false);
            yci c = d.c(gut.z(gut.a0(gut.p1(vci.a))), 1.0f);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z2 = i3 == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                vtu vtuVar = new vtu(0, hxvVar, hxv.class, "closeLikedArtistsScreen", "closeLikedArtistsScreen()V", 0, 19);
                oq5Var.k0(vtuVar);
                K2 = vtuVar;
            }
            m((Function0) ((h9f) K2), oq5Var, 0);
            n(hxvVar, oq5Var, i3);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new exv(hxvVar, i, 0);
        }
    }

    public static final Object p(g4q g4qVar, z7q z7qVar) {
        g4qVar.getClass();
        z7qVar.getClass();
        if (g4qVar instanceof a1q) {
            return z7qVar.o((a1q) g4qVar);
        }
        if (g4qVar instanceof b1q) {
            return z7qVar.G((b1q) g4qVar);
        }
        if (g4qVar instanceof a8q) {
            return z7qVar.r((a8q) g4qVar);
        }
        if (g4qVar instanceof k9q) {
            return z7qVar.E((k9q) g4qVar);
        }
        if (g4qVar instanceof z1q) {
            return z7qVar.D((z1q) g4qVar);
        }
        if (g4qVar instanceof wpw) {
            return z7qVar.s((wpw) g4qVar);
        }
        kac.j(g4qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final r7w q(Throwable th) {
        return new r7w("Failure from Throwable: " + th + "\nUnderlying stack trace: " + Log.getStackTraceString(th), null);
    }

    public static final ExecutorService r(String str) {
        f4s f4sVar = nif.a;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new y36(str, 1));
        newSingleThreadExecutor.getClass();
        return newSingleThreadExecutor;
    }

    public static final m6e x(Response response, pxm pxmVar, MusicBackendResponse musicBackendResponse) {
        response.getClass();
        String str = pxmVar.a;
        l3o l3oVar = response.a;
        nyr nyrVar = new nyr(str, l3oVar.k, l3oVar.l);
        String a = l3oVar.f.a("X-Request-Id");
        int i = l3oVar.d;
        Object obj = sbo.a;
        rbo rboVar = (rbo) rbo.class.cast(l3oVar.a.e.get(rbo.class));
        return new m6e(nyrVar, a, pxmVar, i, musicBackendResponse, rboVar != null ? rboVar.a : 0);
    }

    public static final n6e y(Response response, pxm pxmVar) {
        response.getClass();
        l3o l3oVar = response.a;
        String a = l3oVar.f.a("X-Request-Id");
        int i = l3oVar.d;
        Object obj = sbo.a;
        rbo rboVar = (rbo) rbo.class.cast(l3oVar.a.e.get(rbo.class));
        return new n6e(a, pxmVar, i, rboVar != null ? rboVar.a : 0);
    }

    public static Intent z(Context context, kem kemVar, lem lemVar, String str) {
        Intent putExtra = new Intent(context, (Class<?>) PodcastsActivity.class).putExtra("catalogType", kemVar).putExtra("entityType", lemVar).putExtra("entityId", str);
        putExtra.getClass();
        return putExtra;
    }

    public abstract void D();

    public abstract void F();

    public abstract void H(beg begVar);

    public abstract void Q(List list);

    public reb s() {
        List t = t();
        o2g.S(t, "%s does not have exactly one group", t.size() == 1);
        return (reb) t.get(0);
    }

    public abstract List t();

    public String toString() {
        switch (this.a) {
            case 26:
                return ((e9x) this).b.toString();
            default:
                return super.toString();
        }
    }

    public abstract xu1 u();

    public abstract zc4 v();

    public abstract Object w();
}
