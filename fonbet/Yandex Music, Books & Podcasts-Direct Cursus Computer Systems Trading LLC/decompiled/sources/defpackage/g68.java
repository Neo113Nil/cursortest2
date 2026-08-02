package defpackage;

import android.content.Context;
import android.util.Log;
import com.yandex.music.playlist_filters.data.local.FilterLocalDto;
import com.yandex.music.playlist_filters.data.local.FiltersLocalInfoDto;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.glagol.data.b;
import ru.yandex.video.m3.player.impl.tracking.a;

/* loaded from: classes3.dex */
public final class g68 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g68(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g68((k68) this.l, continuation, 0);
            case 1:
                return new g68((r88) this.l, continuation, 1);
            case 2:
                return new g68((gc8) this.l, continuation, 2);
            case 3:
                return new g68((taa) this.l, continuation, 3);
            case 4:
                return new g68((cca) this.l, continuation, 4);
            case 5:
                return new g68((m) this.l, continuation, 5);
            case 6:
                return new g68((aea) this.l, continuation, 6);
            case 7:
                return new g68((vla) this.l, continuation, 7);
            case 8:
                return new g68((qva) this.l, continuation, 8);
            case 9:
                return new g68((e2o) this.l, continuation, 9);
            case 10:
                return new g68((vx6) this.l, continuation, 10);
            case 11:
                return new g68((a) this.l, continuation, 11);
            case 12:
                return new g68((upb) this.l, continuation, 12);
            case 13:
                return new g68((g06) this.l, continuation, 13);
            case 14:
                return new g68((mmo) this.l, continuation, 14);
            case 15:
                return new g68((ddc) this.l, continuation, 15);
            case 16:
                return new g68((tx4) this.l, continuation, 16);
            case 17:
                return new g68((pjc) this.l, continuation, 17);
            case 18:
                return new g68((fpc) this.l, continuation, 18);
            case 19:
                return new g68((ir1) this.l, continuation, 19);
            case 20:
                return new g68((lwc) this.l, continuation, 20);
            case 21:
                return new g68((uwc) this.l, continuation, 21);
            case 22:
                return new g68((iz7) this.l, continuation, 22);
            case 23:
                return new g68((wxc) this.l, continuation, 23);
            case 24:
                return new g68((c1d) this.l, continuation, 24);
            case 25:
                return new g68((r1d) this.l, continuation, 25);
            case 26:
                return new g68((chd) this.l, continuation, 26);
            case 27:
                return new g68((lc4) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new g68((b) this.l, continuation, 28);
            default:
                return new g68((wkd) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 4:
                ((g68) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 22:
                ((g68) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((g68) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:346:0x0577, code lost:
    
        if (r8.c(r5, r27) == r0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x063d, code lost:
    
        if (r0 == r2) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0615, code lost:
    
        if (r3 == r2) goto L347;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2 A[LOOP:1: B:101:0x01ac->B:103:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fe A[LOOP:2: B:110:0x01f8->B:112:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024e  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object p;
        Object a;
        Object g0;
        Object a2;
        Long lastTimeUpdateMillis;
        ecc eccVar;
        String id;
        String name;
        HashSet hashSet;
        Object i;
        boolean a3;
        jbu jbuVar;
        Iterator it;
        n8g b;
        o0d o0dVar;
        Iterator it2;
        n8g a4;
        ezd ezdVar;
        boolean z;
        boolean z2;
        int i2;
        Object z0dVar;
        w0d w0dVar;
        int i3 = 14;
        int i4 = 7;
        int i5 = 6;
        int i6 = 2;
        int i7 = 0;
        switch (this.j) {
            case 0:
                k68 k68Var = (k68) this.l;
                qqi qqiVar = k68Var.d;
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                try {
                    if (i8 == 0) {
                        qgg.h0(obj);
                        if (!qqiVar.g()) {
                            return Unit.a;
                        }
                        this.k = 1;
                        if (k68Var.d(this) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    qqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    qqiVar.b(null);
                    throw th;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    r88 r88Var = (r88) this.l;
                    this.k = 1;
                    if (r88Var.h) {
                        r88Var.h = false;
                        p = Unit.a;
                    } else {
                        p = r88Var.p(this);
                        if (p != nm6Var2) {
                            p = Unit.a;
                        }
                    }
                    if (p == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    gc8 gc8Var = (gc8) this.l;
                    this.k = 1;
                    Context context = gc8Var.getContext();
                    context.getClass();
                    Object collect = ((pjc) new pt0(context, 23).b).collect(new v0a(gc8Var, i7), this);
                    if (collect != nm6Var3) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                Object obj2 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    cca ccaVar = ((taa) this.l).c;
                    this.k = 1;
                    ccaVar.getClass();
                    Object Q = gld.Q(new f98(ccaVar, null, i4), this);
                    if (Q != obj2) {
                        Q = Unit.a;
                    }
                    if (Q == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                cca ccaVar2 = (cca) this.l;
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    vdr c = ((z66) ccaVar2.h.getValue()).c();
                    u58 u58Var = new u58(i5, ccaVar2);
                    this.k = 1;
                    if (c.collect(u58Var, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 5:
                nm6 nm6Var5 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    m mVar = (m) this.l;
                    j0q j0qVar = (j0q) mVar.k;
                    Integer num = new Integer(((eca) ((xdr) mVar.h).getValue()).a.size());
                    this.k = 1;
                    if (j0qVar.emit(num, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    aea aeaVar = (aea) this.l;
                    j6e j6eVar = aeaVar.n;
                    qs qsVar = new qs(aeaVar, null, 3);
                    this.k = 1;
                    if (j6eVar.x(qsVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    vla vlaVar = (vla) this.l;
                    this.k = 1;
                    if (vla.a(vlaVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    qva qvaVar = (qva) this.l;
                    lyf lyfVar = lyf.d;
                    nz5 nz5Var = new nz5(qvaVar, (Continuation) null, 13);
                    this.k = 1;
                    if (o8g.K(qvaVar, lyfVar, nz5Var, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                Object obj3 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    e2o e2oVar = (e2o) this.l;
                    act S = weo.S(400, 0, lya.c, 2);
                    this.k = 1;
                    Object h = com.yandex.music.core.ui.compose.draggable.a.h(e2oVar.a, d2o.a, S, this);
                    if (h != obj3) {
                        h = Unit.a;
                    }
                    if (h == obj3) {
                        return obj3;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                vx6 vx6Var = (vx6) this.l;
                Object obj4 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ub7 ub7Var = new ub7(9, new bca(((frt) vx6Var.c).g(), i3), vx6Var);
                    v0b v0bVar = new v0b(((k0b) vx6Var.b).b(), i7);
                    r0b r0bVar = new r0b(vx6Var, null);
                    this.k = 1;
                    Object y = tt0.y(qej.a, new l1((Object) r0bVar, (Continuation) null, 25), this, wg.s, new pjc[]{ub7Var, v0bVar});
                    if (y != obj4) {
                        y = Unit.a;
                    }
                    if (y != obj4) {
                        y = Unit.a;
                    }
                    if (y == obj4) {
                        return obj4;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var9 = nm6.a;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a aVar = (a) this.l;
                ou7 p2 = x97.p(aVar.k, null, null, new ox1(aVar, null, i3), 3);
                this.k = 1;
                Object s = p2.s(this);
                return s == nm6Var9 ? nm6Var9 : s;
            case 12:
                upb upbVar = (upb) this.l;
                nm6 nm6Var10 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    gs4 gs4Var = upbVar.k;
                    boolean z3 = upbVar.n;
                    qc9 qc9Var = upbVar.m;
                    this.k = 1;
                    gs4Var.getClass();
                    a = ((sfg) gs4Var.d).a(qc9Var, new sfm(dq8.EXIT, (JSONObject) null, 6), new sx4(gs4Var, z3, null, i6), this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                this.k = 2;
                Object emit = upbVar.o.emit(new hw8((rv8) a, t75.c(new Pair("exit_screen_is_payment", String.valueOf(upbVar.n)))), this);
                if (emit != nm6Var10) {
                    emit = Unit.a;
                    break;
                }
                break;
            case 13:
                nm6 nm6Var11 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                lyb lybVar = (lyb) ((arf) ((g06) this.l).a).getValue();
                this.k = 1;
                Object a5 = lybVar.a(this);
                return a5 == nm6Var11 ? nm6Var11 : a5;
            case 14:
                mmo mmoVar = (mmo) this.l;
                nm6 nm6Var12 = nm6.a;
                int i22 = this.k;
                try {
                    try {
                        try {
                        } catch (Throwable th2) {
                            mmo.f(mmoVar);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        ssg.a(7, "UserAndExperimentsPeriodicUpdater", "unexpected error", th3);
                    }
                } catch (IOException e) {
                    if (i4w.M(e)) {
                        ssg.a(6, null, "update failed due to network problems", null);
                    } else {
                        ssg.a(7, "UserAndExperimentsPeriodicUpdater", "unexpected IO Error", e);
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                if (i22 == 0) {
                    qgg.h0(obj);
                    pjc g = ((iv0) ((av0) ((jyr) mmoVar.d).getValue())).a.g();
                    this.k = 1;
                    g0 = zsd.g0(g, this);
                    if (g0 == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        mmo.f(mmoVar);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                xxq xxqVar = (xxq) g0;
                byb bybVar = (byb) ((jyr) mmoVar.f).getValue();
                String str = xxqVar.a;
                bybVar.getClass();
                str.getClass();
                bybVar.f(str, true);
                wst wstVar = (wst) ((jyr) mmoVar.e).getValue();
                this.k = 2;
                break;
            case 15:
                nm6 nm6Var13 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    zcc zccVar = (zcc) ((ddc) this.l).b.getValue();
                    this.k = 1;
                    a2 = zccVar.a(this);
                    if (a2 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                FiltersLocalInfoDto filtersLocalInfoDto = (FiltersLocalInfoDto) a2;
                if (filtersLocalInfoDto != null && (lastTimeUpdateMillis = filtersLocalInfoDto.getLastTimeUpdateMillis()) != null) {
                    long longValue = lastTimeUpdateMillis.longValue();
                    List<String> lastTrackIdList = filtersLocalInfoDto.getLastTrackIdList();
                    if (lastTrackIdList != null) {
                        HashSet hashSet2 = new HashSet();
                        for (String str2 : lastTrackIdList) {
                            if (str2 != null) {
                                hashSet2.add(str2);
                            }
                        }
                        List<FilterLocalDto> filters = filtersLocalInfoDto.getFilters();
                        if (filters != null) {
                            ArrayList arrayList = new ArrayList();
                            for (FilterLocalDto filterLocalDto : filters) {
                                if (filterLocalDto == null || (id = filterLocalDto.getId()) == null || (name = filterLocalDto.getName()) == null) {
                                    eccVar = null;
                                } else {
                                    List<String> trackIdList = filterLocalDto.getTrackIdList();
                                    if (trackIdList != null) {
                                        hashSet = new HashSet();
                                        for (String str3 : trackIdList) {
                                            if (str3 != null) {
                                                hashSet.add(str3);
                                            }
                                        }
                                    } else {
                                        hashSet = null;
                                    }
                                    eccVar = new ecc(id, name, hashSet);
                                }
                                if (eccVar != null) {
                                    arrayList.add(eccVar);
                                }
                            }
                            return new ucc(longValue, hashSet2, arrayList);
                        }
                    }
                }
                return null;
            case 16:
                nm6 nm6Var14 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                tx4 tx4Var = (tx4) this.l;
                this.k = 1;
                Object invoke = tx4Var.invoke(this);
                return invoke == nm6Var14 ? nm6Var14 : invoke;
            case 17:
                nm6 nm6Var15 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    this.k = 1;
                    if (zsd.N(pjcVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var16 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    fpc fpcVar = (fpc) this.l;
                    this.k = 1;
                    if (zc4.q(fpcVar, null, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var17 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    ir1 ir1Var = (ir1) this.l;
                    this.k = 1;
                    if (ir1Var.a(this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                lwc lwcVar = (lwc) this.l;
                nm6 nm6Var18 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = lwcVar.d;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar.emit(unit, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj5 = lwc.l;
                lwcVar.c();
                return Unit.a;
            case 21:
                nm6 nm6Var19 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = ((uwc) this.l).e;
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (x0qVar2.emit(unit2, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                iz7 iz7Var = (iz7) this.l;
                nm6 nm6Var20 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    vdr c2 = ((z66) ((jyr) iz7Var.f).getValue()).c();
                    mxc mxcVar = new mxc(iz7Var, i7);
                    this.k = 1;
                    if (c2.collect(mxcVar, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 23:
                wxc wxcVar = (wxc) this.l;
                nm6 nm6Var21 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(10000L, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = wxcVar.b;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 24:
                x0d x0dVar = x0d.a;
                c1d c1dVar = (c1d) this.l;
                e0d e0dVar = c1dVar.l;
                nm6 nm6Var22 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    t0d t0dVar = c1dVar.k;
                    this.k = 1;
                    i = t0dVar.i(this);
                    if (i == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    i = obj;
                }
                f0d f0dVar = (f0d) i;
                awc awcVar = c1dVar.n;
                awcVar.getClass();
                c0d c0dVar = c0d.a;
                f0dVar.getClass();
                List list = f0dVar.a;
                e0dVar.getClass();
                d0d d0dVar = e0dVar.a;
                ee1 ee1Var = (ee1) ((arf) awcVar.a).getValue();
                int i33 = ee1Var.a;
                Object obj6 = ee1Var.b;
                switch (i33) {
                    case 0:
                        a3 = ((iau) ((he1) obj6).a.getValue()).a();
                        break;
                    default:
                        a3 = ((iau) obj6).a();
                        break;
                }
                String str4 = f0dVar.b;
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : list) {
                    String uri = ((CoverPath) obj7).getUri();
                    if (uri != null && !StringsKt.U(uri)) {
                        arrayList2.add(obj7);
                    }
                }
                if (str4 == null || StringsKt.U(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    if (!a3) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        jbuVar = new jbu(str4);
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            CoverPath coverPath = (CoverPath) it.next();
                            String w = vz1.w(coverPath);
                            String pathForSize = coverPath.getPathForSize(frv.b() * 3);
                            pathForSize.getClass();
                            arrayList3.add(new o0d(w, pathForSize));
                        }
                        b = t75.b();
                        o0dVar = (o0d) CollectionsKt.firstOrNull(arrayList3);
                        if (jbuVar != null && o0dVar != null) {
                            b.add(new k0d(jbuVar, o0dVar));
                        }
                        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                        it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(new j0d((o0d) it2.next()));
                        }
                        b.addAll(arrayList4);
                        a4 = t75.a(b);
                        if (a4.isEmpty()) {
                            if (!a4.isEmpty()) {
                                ListIterator listIterator = a4.listIterator(0);
                                do {
                                    ezdVar = (ezd) listIterator;
                                    if (ezdVar.hasNext()) {
                                    }
                                } while (!(((l0d) ezdVar.next()) instanceof k0d));
                                z = true;
                                z2 = d0dVar instanceof b0d;
                                if (!z2) {
                                    z = ((b0d) d0dVar).a == 0 && z;
                                } else if (!d0dVar.equals(c0dVar)) {
                                    b6e.s();
                                    return null;
                                }
                                if (!z2) {
                                    i2 = ((b0d) d0dVar).a;
                                } else {
                                    if (!d0dVar.equals(c0dVar)) {
                                        b6e.s();
                                        return null;
                                    }
                                    i2 = 0;
                                }
                                int e3 = yhn.e(i2, u75.f(a4));
                                z0dVar = new z0d(e3, e3, e3, null, a4, z && list.size() > 1, e0dVar.c);
                            }
                            z = false;
                            z2 = d0dVar instanceof b0d;
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            int e32 = yhn.e(i2, u75.f(a4));
                            z0dVar = new z0d(e32, e32, e32, null, a4, z && list.size() > 1, e0dVar.c);
                        } else {
                            z0dVar = x0dVar;
                        }
                        xdr xdrVar2 = c1dVar.p;
                        xdrVar2.getClass();
                        xdrVar2.m(null, z0dVar);
                        if (!(z0dVar instanceof z0d)) {
                            z0d z0dVar2 = (z0d) z0dVar;
                            w0dVar = new w0d(z0dVar2.a, z0dVar2.e, e0dVar.b, ot0.F(c1dVar), c1dVar.m, new ceb(0, c1dVar, c1d.class, "performScroll", "performScroll()V", 0, 28));
                        } else {
                            if (!z0dVar.equals(y0d.a) && !z0dVar.equals(x0dVar)) {
                                b6e.s();
                                return null;
                            }
                            w0dVar = null;
                        }
                        c1dVar.o = w0dVar;
                        return Unit.a;
                    }
                }
                jbuVar = null;
                ArrayList arrayList32 = new ArrayList(v75.o(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                b = t75.b();
                o0dVar = (o0d) CollectionsKt.firstOrNull(arrayList32);
                if (jbuVar != null) {
                    b.add(new k0d(jbuVar, o0dVar));
                }
                ArrayList arrayList42 = new ArrayList(v75.o(arrayList32, 10));
                it2 = arrayList32.iterator();
                while (it2.hasNext()) {
                }
                b.addAll(arrayList42);
                a4 = t75.a(b);
                if (a4.isEmpty()) {
                }
                xdr xdrVar22 = c1dVar.p;
                xdrVar22.getClass();
                xdrVar22.m(null, z0dVar);
                if (!(z0dVar instanceof z0d)) {
                }
                c1dVar.o = w0dVar;
                return Unit.a;
            case 25:
                nm6 nm6Var23 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    v1d v1dVar = (v1d) ((r1d) this.l).a.getValue();
                    this.k = 1;
                    if (v1dVar.a(this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var24 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(5000L, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((chd) this.l).i = false;
                return Unit.a;
            case 27:
                nm6 nm6Var25 = nm6.a;
                int i36 = this.k;
                if (i36 != 0) {
                    if (i36 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                lc4 lc4Var = (lc4) this.l;
                this.k = 1;
                Object l = lc4Var.l(this);
                return l == nm6Var25 ? nm6Var25 : l;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var26 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    hgp hgpVar = ((b) this.l).j;
                    this.k = 1;
                    if (hgpVar.w(this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var27 = nm6.a;
                int i38 = this.k;
                try {
                    if (i38 == 0) {
                        qgg.h0(obj);
                        wkd wkdVar = (wkd) this.l;
                        rv0 rv0Var = new rv0(wkdVar.b);
                        this.k = 1;
                        if (wkd.a(wkdVar, rv0Var, this) == nm6Var27) {
                            return nm6Var27;
                        }
                    } else {
                        if (i38 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return Unit.a;
                } catch (jq4 e4) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e4));
                }
        }
    }
}
