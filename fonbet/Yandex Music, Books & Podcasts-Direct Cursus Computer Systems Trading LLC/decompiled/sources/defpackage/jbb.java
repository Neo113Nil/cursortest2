package defpackage;

import android.net.Uri;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.sloth.w;
import com.yandex.passport.sloth.data.g0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.dependencies.i;
import com.yandex.passport.sloth.url.v;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes4.dex */
public final class jbb extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbb(ueo ueoVar, Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.o = obj;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new jbb((kbb) this.l, (lt) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 0);
            case 1:
                return new jbb((kbb) this.l, (u51) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 1);
            case 2:
                return new jbb((kbb) this.l, (eul) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 2);
            case 3:
                return new jbb((bwg) this.l, (lt) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 3);
            case 4:
                return new jbb((bwg) this.l, (u51) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 4);
            case 5:
                return new jbb((bwg) this.l, (eul) this.o, (PlaybackScope) this.m, (a6l) this.n, continuation, 5);
            case 6:
                return new jbb((ueo) this.l, continuation, (btl) this.o, (String) this.m, (List) this.n, 6);
            case 7:
                return new jbb((ueo) this.l, continuation, (xqn) this.o, (ArrayList) this.m);
            case 8:
                return new jbb((wkp) this.o, continuation, (i8l) this.m, (wkp) this.n);
            case 9:
                return new jbb((a7q) this.l, (v2q) this.o, (js2) this.m, (Long) this.n, continuation, 9);
            case 10:
                return new jbb((a7q) this.l, (EnumSet) this.o, (Long) this.m, (u2q) this.n, continuation, 10);
            case 11:
                return new jbb((MainDatabase) this.l, continuation, (mys) this.o, (List) this.m, (uys) this.n, 11);
            case 12:
                return new jbb((b4u) this.l, (String) this.o, (Collection) this.m, (Integer) this.n, continuation, 12);
            case 13:
                return new jbb((v) this.o, (o0) this.m, (Uri) this.n, continuation);
            default:
                return new jbb((g) this.l, (String) this.o, (String) this.m, (String) this.n, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((jbb) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x026f, code lost:
    
        if (r2 == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x018f, code lost:
    
        if (r2 == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r1 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r4 == r2) goto L37;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object b;
        Object e;
        Object e2;
        Object a2;
        Object g;
        Object b2;
        MainDatabase mainDatabase;
        qvs b3;
        Object G;
        v vVar;
        Object e3;
        Uri uri;
        Object r;
        switch (this.j) {
            case 0:
                kbb kbbVar = (kbb) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    String str = ((lt) this.o).a;
                    this.k = 1;
                    a = kbb.a(kbbVar, str, true, this);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                oq oqVar = (oq) a;
                if (oqVar == null) {
                    kac.f("album is null!");
                    return null;
                }
                qe5 h = l3l.h(e.a((PlaybackScope) this.m, oqVar), oqVar.F, (a6l) this.n);
                h.a(oqVar);
                return h.b();
            case 1:
                kbb kbbVar2 = (kbb) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str2 = ((u51) this.o).a;
                    this.k = 1;
                    b = kbb.b(kbbVar2, str2, this);
                    if (b == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                i21 i21Var = (i21) b;
                if (i21Var == null) {
                    kac.f("artistBriefInfo is null!");
                    return null;
                }
                PlaybackScope playbackScope = (PlaybackScope) this.m;
                c01 c01Var = i21Var.a;
                playbackScope.getClass();
                c01Var.getClass();
                return l3l.h(playbackScope.d(c01Var), i21Var.g, (a6l) this.n).b();
            case 2:
                kbb kbbVar3 = (kbb) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    eul eulVar = (eul) this.o;
                    String str3 = eulVar.a;
                    String str4 = eulVar.b;
                    this.k = 1;
                    e = kbb.e(kbbVar3, str3, str4, true, this);
                    if (e == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                rrl rrlVar = (rrl) e;
                if (rrlVar == null) {
                    kac.f("playlist is null!");
                    return null;
                }
                cvl cvlVar = rrlVar.a;
                List list = rrlVar.c;
                if (list == null) {
                    kac.f("playlist tracks are null!");
                    return null;
                }
                qe5 h2 = l3l.h(e.f((PlaybackScope) this.m, cvlVar), list, (a6l) this.n);
                h2.c(cvlVar);
                return h2.b();
            case 3:
                bwg bwgVar = (bwg) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    String str5 = ((lt) this.o).a;
                    this.k = 1;
                    e2 = bwgVar.e(str5, true, this);
                    if (e2 == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e2 = obj;
                }
                oq oqVar2 = (oq) e2;
                if (oqVar2 == null) {
                    kac.f("album is null!");
                    return null;
                }
                c b4 = ((PlaybackScope) this.m).b(oqVar2);
                l3l l3lVar = bwgVar.j;
                LinkedList linkedList = oqVar2.F;
                a6l a6lVar = (a6l) this.n;
                l3lVar.getClass();
                qe5 h3 = l3l.h(b4, linkedList, a6lVar);
                h3.a(oqVar2);
                return h3.b();
            case 4:
                bwg bwgVar2 = (bwg) this.l;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    String str6 = ((u51) this.o).a;
                    this.k = 1;
                    a2 = bwg.a(bwgVar2, str6, this);
                    if (a2 == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                i21 i21Var2 = (i21) a2;
                if (i21Var2 == null) {
                    kac.f("artistBriefInfo is null!");
                    return null;
                }
                c d = ((PlaybackScope) this.m).d(i21Var2.a);
                l3l l3lVar2 = bwgVar2.j;
                List list2 = i21Var2.g;
                a6l a6lVar2 = (a6l) this.n;
                l3lVar2.getClass();
                return l3l.h(d, list2, a6lVar2).b();
            case 5:
                bwg bwgVar3 = (bwg) this.l;
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    eul eulVar2 = (eul) this.o;
                    String str7 = eulVar2.a;
                    String str8 = eulVar2.b;
                    this.k = 1;
                    g = bwgVar3.g(str7, str8, true, this);
                    if (g == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                rrl rrlVar2 = (rrl) g;
                if (rrlVar2 == null) {
                    kac.f("playlist is null!");
                    return null;
                }
                cvl cvlVar2 = rrlVar2.a;
                List list3 = rrlVar2.c;
                if (list3 == null) {
                    kac.f("playlist tracks are null!");
                    return null;
                }
                c f = e.f((PlaybackScope) this.m, cvlVar2);
                l3l l3lVar3 = bwgVar3.j;
                a6l a6lVar3 = (a6l) this.n;
                l3lVar3.getClass();
                qe5 h4 = l3l.h(f, list3, a6lVar3);
                h4.c(cvlVar2);
                return h4.b();
            case 6:
                String str9 = (String) this.m;
                btl btlVar = (btl) this.o;
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    i2m i2mVar = btlVar.d;
                    List list4 = (List) this.n;
                    this.k = 1;
                    b2 = i2mVar.b(this, str9, list4);
                    if (b2 == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b2 = obj;
                }
                List list5 = (List) b2;
                p2m p2mVar = btlVar.b;
                List<i1m> list6 = list5;
                ArrayList arrayList = new ArrayList(v75.o(list6, 10));
                for (i1m i1mVar : list6) {
                    String str10 = i1mVar.c;
                    String str11 = i1mVar.d;
                    int i8 = i1mVar.e;
                    long j = i1mVar.b;
                    StringBuilder m = f1d.m("delete ", str10, StringUtils.PROCESS_POSTFIX_DELIMITER, str11, " at ");
                    m.append(i8);
                    m.append(" from playlist_id ");
                    m.append(j);
                    ssg.a(3, null, m.toString(), null);
                    arrayList.add(new hys(j, 2, i8, str10, str11, null));
                }
                p2mVar.getClass();
                p2m.a(str9, arrayList);
                return new Integer(list5.size());
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase2 = (MainDatabase) ((ueo) this.l);
                    q1m K = mainDatabase2.K();
                    long j2 = ((cvl) ((xqn) this.o).a).k;
                    List w0 = CollectionsKt.w0((ArrayList) this.m);
                    this.n = mainDatabase2;
                    this.k = 1;
                    if (K.c(j2, w0, this) == nm6Var8) {
                        return nm6Var8;
                    }
                    mainDatabase = mainDatabase2;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainDatabase = (MainDatabase) this.n;
                    qgg.h0(obj);
                }
                mainDatabase.F("playlist_track");
                return Unit.a;
            case 8:
                wkp wkpVar = (wkp) this.n;
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ump umpVar = (ump) this.l;
                    qgg.h0(obj);
                    return umpVar;
                }
                qgg.h0(obj);
                NoopCallbackCommand noopCallbackCommand = new NoopCallbackCommand();
                boolean C0 = ((i8l) this.m).C0();
                wkpVar.d.b(new eyk(u75.h(new SetShuffleCommand(!C0), noopCallbackCommand)), new b3t("queue_shuffle"));
                y60 e4 = wkpVar.e.e();
                String str12 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                arf g2 = tlm.g(bwf.c);
                Map map = (Map) g2.getValue();
                ub ubVar = new ub();
                ubVar.c(new String[]{Constants.KEY_ACTION, "custom_shuffle"}, !C0 ? "on" : "off");
                map.put("MediaSession", ubVar.b());
                tlm.o(e4, str12, g2.isInitialized() ? (Map) g2.getValue() : null);
                ump umpVar2 = wkpVar.f;
                wkp wkpVar2 = (wkp) this.o;
                this.l = umpVar2;
                this.k = 1;
                return wkp.a(wkpVar2, noopCallbackCommand, this) == nm6Var9 ? nm6Var9 : umpVar2;
            case 9:
                Object obj2 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    g7q g7qVar = ((a7q) this.l).n;
                    this.k = 1;
                    g7qVar.c(true);
                    Object T = a4g.T(this);
                    Object obj3 = T;
                    if (T != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                kv6 kv6Var = ((a7q) this.l).a;
                v2q v2qVar = (v2q) this.o;
                js2 js2Var = (js2) this.m;
                Long l = (Long) this.n;
                long longValue = l != null ? l.longValue() : -9223372036854775807L;
                v2qVar.getClass();
                kv6Var.k1().y();
                kv6Var.k1().stop();
                kv6Var.j1(true);
                kv6Var.m = false;
                kv6Var.r.l(null);
                kv6Var.y = kv6Var.f ? null : 0L;
                kv6Var.k1().X0(js2Var, longValue);
                kv6Var.k1().q();
                a7q.a((a7q) this.l);
                ((a7q) this.l).n.c(false);
                return Unit.a;
            case 10:
                Object obj4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    g7q g7qVar2 = ((a7q) this.l).n;
                    this.k = 1;
                    g7qVar2.c(true);
                    Object T2 = a4g.T(this);
                    Object obj5 = T2;
                    if (T2 != obj4) {
                        obj5 = Unit.a;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                boolean contains = ((EnumSet) this.o).contains(g5q.c);
                Long l2 = (Long) this.m;
                if (l2 == null) {
                    kv6 kv6Var2 = ((a7q) this.l).a;
                    u2q u2qVar = (u2q) this.n;
                    u2qVar.getClass();
                    if (kv6Var2.f) {
                        if (!contains || kv6Var2.y == null) {
                            if (contains && (b3 = u2qVar.b()) != null) {
                                l2 = Long.valueOf(b3.a);
                            }
                            l2 = null;
                        } else {
                            l2 = kv6Var2.y;
                        }
                    } else if (kv6Var2.e && u2qVar.equals(kv6Var2.z) && contains) {
                        l2 = kv6Var2.y;
                    } else {
                        kv6Var2.y = 0L;
                        l2 = null;
                    }
                }
                Long l3 = l2;
                boolean z = ((EnumSet) this.o).contains(g5q.a) && ((u2q) this.n).d;
                boolean z2 = contains && ((Long) this.m) == null && l3 != null && l3.longValue() > 0;
                u2q u2qVar2 = (u2q) this.n;
                gy1 gy1Var = u2qVar2.c;
                pxs pxsVar = u2qVar2.f;
                ((a7q) this.l).a.l1(new iom(u2qVar2, l3, z, z2, gy1Var, pxsVar != null ? o2g.k0(pxsVar) : null, ((EnumSet) this.o).contains(g5q.b)));
                ((a7q) this.l).n.c(false);
                j0l j0lVar = ((a7q) this.l).h;
                zgl zglVar = new zgl(l3, z ? ((u2q) this.n).e : null);
                this.k = 2;
                Object emit = j0lVar.a.emit(zglVar, this);
                if (emit != obj4) {
                    emit = Unit.a;
                    break;
                }
                break;
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    mys mysVar = (mys) this.o;
                    List list7 = (List) this.m;
                    this.k = 1;
                    mysVar.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT * FROM track_operation WHERE playlist_id IN(");
                    swf.x(list7.size(), sb);
                    sb.append(") ORDER BY _id");
                    G = up6.G(mysVar.a, true, false, new i20(sb.toString(), list7, 6), this);
                    if (G == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = obj;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((Iterable) G).iterator();
                while (it.hasNext()) {
                    iys g3 = uys.g((jys) it.next());
                    if (g3 != null) {
                        arrayList2.add(g3);
                    }
                }
                return arrayList2;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b4u b4uVar = (b4u) this.l;
                String str13 = (String) this.o;
                Collection collection = (Collection) this.m;
                Integer num = (Integer) this.n;
                this.k = 1;
                Object g4 = b4uVar.g(str13, collection, num, this);
                return g4 == nm6Var11 ? nm6Var11 : g4;
            case 13:
                o0 o0Var = (o0) this.m;
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    vVar = (v) this.o;
                    i iVar = vVar.b;
                    this.l = vVar;
                    this.k = 1;
                    e3 = ((w) iVar).e((g0) o0Var, this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        r = ((b) obj).a;
                        return new b((String) r);
                    }
                    vVar = (v) this.l;
                    qgg.h0(obj);
                    e3 = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (e3 instanceof t7o) {
                    e3 = null;
                }
                b bVar = (b) e3;
                String str14 = bVar != null ? bVar.a : null;
                if (str14 == null || (uri = Uri.parse(str14)) == null) {
                    uri = (Uri) this.n;
                }
                f fVar = ((g0) o0Var).e;
                com.yandex.passport.common.core.c cVar = com.yandex.passport.common.core.c.a;
                this.l = null;
                this.k = 2;
                r = vVar.r(uri, fVar, cVar, this);
                break;
            default:
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2 = ((g) this.l).k;
                    String str15 = (String) this.o;
                    String str16 = (String) this.m;
                    String str17 = (String) this.n;
                    this.k = 1;
                    if (bVar2.k(str15, str16, str17, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbb(ueo ueoVar, Continuation continuation, xqn xqnVar, ArrayList arrayList) {
        super(1, continuation);
        this.j = 7;
        this.l = ueoVar;
        this.o = xqnVar;
        this.m = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbb(wkp wkpVar, Continuation continuation, i8l i8lVar, wkp wkpVar2) {
        super(1, continuation);
        this.j = 8;
        this.o = wkpVar;
        this.m = i8lVar;
        this.n = wkpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbb(v vVar, o0 o0Var, Uri uri, Continuation continuation) {
        super(1, continuation);
        this.j = 13;
        this.o = vVar;
        this.m = o0Var;
        this.n = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbb(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = obj;
        this.o = obj2;
        this.m = obj3;
        this.n = obj4;
    }
}
