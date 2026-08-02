package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.location.selector.ui.logic.impl.network.ConcertLocationDto;
import com.yandex.music.shared.concert.location.selector.ui.logic.impl.network.ConcertLocationSelectorApi;
import com.yandex.music.shared.concert.location.selector.ui.logic.impl.network.ConcertLocationsDto;
import com.yandex.music.shared.disclaimers.net.DisclaimerApi;
import com.yandex.music.shared.disclaimers.net.DisclaimerDetailsDto;
import com.yandex.music.shared.disclaimers.net.DisclaimerDto;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class ja4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja4(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ja4((la4) this.l, continuation, 0);
            case 1:
                return new ja4((pf4) this.l, continuation, 1);
            case 2:
                return new ja4((kkp) this.l, continuation, 2);
            case 3:
                return new ja4((hr4) this.l, continuation, 3);
            case 4:
                return new ja4((ru4) this.l, continuation, 4);
            case 5:
                return new ja4((xv4) this.l, continuation, 5);
            case 6:
                return new ja4((d35) this.l, continuation, 6);
            case 7:
                return new ja4((t20) this.l, continuation, 7);
            case 8:
                return new ja4((gb5) this.l, continuation, 8);
            case 9:
                return new ja4((ei5) this.l, continuation, 9);
            case 10:
                return new ja4((wl5) this.l, continuation, 10);
            case 11:
                return new ja4((yt5) this.l, continuation, 11);
            case 12:
                return new ja4((vw5) this.l, continuation, 12);
            case 13:
                return new ja4((ww5) this.l, continuation, 13);
            case 14:
                return new ja4((dz5) this.l, continuation, 14);
            case 15:
                return new ja4((evj) this.l, continuation, 15);
            case 16:
                return new ja4((d26) this.l, continuation, 16);
            case 17:
                return new ja4((osh) this.l, continuation, 17);
            case 18:
                return new ja4((ConstraintTrackingWorker) this.l, continuation, 18);
            case 19:
                return new ja4((oh6) this.l, continuation, 19);
            case 20:
                return new ja4((vo6) this.l, continuation, 20);
            case 21:
                return new ja4((cz6) this.l, continuation, 21);
            case 22:
                return new ja4((g47) this.l, continuation, 22);
            case 23:
                return new ja4((cb7) this.l, continuation, 23);
            case 24:
                return new ja4((vb7) this.l, continuation, 24);
            case 25:
                return new ja4((il7) this.l, continuation, 25);
            case 26:
                return new ja4((qp7) this.l, continuation, 26);
            case 27:
                return new ja4((s48) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ja4((bw1) this.l, continuation, 28);
            default:
                return new ja4((le3) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 13:
                ((ja4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((ja4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x013b, code lost:
    
        if (r3 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0147, code lost:
    
        if (r3 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0468, code lost:
    
        if (r1.f(r5, r20) == r2) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0429, code lost:
    
        if (r3 == r2) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05ec, code lost:
    
        if (r2 == r1) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x080d, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r2, r3, r20) == r1) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x07fb, code lost:
    
        if (r2 == r1) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x08d2, code lost:
    
        if (r3.emit(r4, r20) == r2) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x08b1, code lost:
    
        if (r3 == r2) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x096a, code lost:
    
        if (r3.emit(r4, r20) == r2) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0949, code lost:
    
        if (r3 == r2) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x09b6, code lost:
    
        if (defpackage.hr4.b(r3, r4, r20) == r1) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x09a2, code lost:
    
        if (r2 == r1) goto L476;
     */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0611 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        Object a3;
        Object a4;
        Object value;
        ul5 ul5Var;
        Object V;
        Object obj2;
        Object value2;
        Object N;
        ArrayList arrayList;
        Long id;
        ov5 ov5Var;
        Object m;
        Object a5;
        long j;
        ss3 I;
        Object o;
        Object d;
        Object f;
        l68 l68Var;
        Object N2;
        a58 a58Var;
        String id2;
        String type;
        String text;
        String url;
        int i = 10;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cb7 cb7Var = ((la4) this.l).c;
                this.k = 1;
                Object M = cb7Var.M(this);
                return M == nm6Var ? nm6Var : M;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                pf4 pf4Var = (pf4) this.l;
                this.k = 1;
                Object a6 = pf4Var.a(true, this);
                return a6 == nm6Var2 ? nm6Var2 : a6;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                kkp kkpVar = (kkp) this.l;
                this.k = 1;
                Serializable a7 = kkp.a(kkpVar, this);
                return a7 == nm6Var3 ? nm6Var3 : a7;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    br4 br4Var = br4.a;
                    this.k = 1;
                    a = br4Var.a(this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                hr4 hr4Var = (hr4) this.l;
                cr4 cr4Var = new cr4((String) a, i3);
                this.k = 2;
                break;
            case 4:
                ru4 ru4Var = (ru4) this.l;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = ru4Var.m;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    vxr vxrVar = (vxr) ru4Var.r.getValue();
                    this.k = 1;
                    a2 = vxrVar.a(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar2 = ru4Var.m;
                        Boolean bool2 = Boolean.FALSE;
                        xdrVar2.getClass();
                        xdrVar2.m(null, bool2);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                txr txrVar = (txr) a2;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar = ru4Var.n;
                    String j0 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar22 = ru4Var.m;
                Boolean bool22 = Boolean.FALSE;
                xdrVar22.getClass();
                xdrVar22.m(null, bool22);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    xv4 xv4Var = (xv4) this.l;
                    j6e j6eVar = xv4Var.l;
                    hv0 hv0Var = new hv0(xv4Var, z ? 1 : 0, i4);
                    this.k = 1;
                    if (j6eVar.x(hv0Var, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                d35 d35Var = (d35) this.l;
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = d35Var.q;
                    Boolean bool3 = Boolean.TRUE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool3);
                    vxr vxrVar2 = (vxr) d35Var.k.getValue();
                    this.k = 1;
                    a3 = vxrVar2.a(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar4 = d35Var.q;
                        Boolean bool4 = Boolean.FALSE;
                        xdrVar4.getClass();
                        xdrVar4.m(null, bool4);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                txr txrVar2 = (txr) a3;
                if (!Intrinsics.d(txrVar2, sxr.a)) {
                    if (!Intrinsics.d(txrVar2, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar2 = d35Var.r;
                    String j02 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar42 = d35Var.q;
                Boolean bool42 = Boolean.FALSE;
                xdrVar42.getClass();
                xdrVar42.m(null, bool42);
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s5c s5cVar = (s5c) ((jyr) ((t20) this.l).h).getValue();
                this.k = 1;
                Object a8 = s5cVar.a(this);
                return a8 == nm6Var8 ? nm6Var8 : a8;
            case 8:
                gb5 gb5Var = (gb5) this.l;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    long b = ((aeu) men.t(gb5Var, es5.s)).b();
                    this.k = 1;
                    if (y2x.o(b, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Function0 function0 = gb5Var.I;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    ei5 ei5Var = (ei5) this.l;
                    this.k = 1;
                    a4 = ei5.a(ei5Var, this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a4 = obj;
                }
                xc xcVar = new xc(i4, 8, z2 ? 1 : 0);
                this.k = 2;
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar5 = ((wl5) this.l).m;
                do {
                    value = xdrVar5.getValue();
                    ul5Var = (ul5) value;
                    if (ul5Var instanceof tl5) {
                        ul5Var = new tl5(((tl5) ul5Var).a, true);
                    }
                } while (!xdrVar5.k(value, ul5Var));
                return Unit.a;
            case 11:
                yt5 yt5Var = (yt5) this.l;
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    kt5 kt5Var = yt5Var.o;
                    lt5 lt5Var = yt5Var.n;
                    String str = lt5Var.a;
                    String str2 = lt5Var.b;
                    Long a9 = yt5Var.q.a();
                    String valueOf = a9 != null ? String.valueOf(a9.longValue()) : null;
                    this.k = 1;
                    kt5Var.getClass();
                    V = x97.V(dm6.b, new ov(kt5Var, str, str2, valueOf, (Continuation) null, 11), this);
                    if (V == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                rj6 rj6Var = (rj6) V;
                s9f[] s9fVarArr = yt5.u;
                if (rj6Var instanceof qj6) {
                    et5 et5Var = (et5) ((qj6) rj6Var).a;
                    List<s26> list = et5Var.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    for (s26 s26Var : list) {
                        it5 it5Var = yt5Var.m;
                        boolean z9 = yt5Var.p;
                        it5Var.getClass();
                        s26Var.getClass();
                        h06 h06Var = s26Var.a;
                        arrayList2.add(new ht5(h06Var, aaw.d(h06Var, it5Var.a, wct.t(), z9)));
                    }
                    rmb.h(yt5Var.k, arrayList2.size(), 2);
                    int i18 = 15;
                    obj2 = new zt5(new gt5(et5Var.a, new fs(i18, new v3k(new fs(i18, new f1k(arrayList2)), v3k.e, v3k.f, new ep7(arrayList2, i3)))));
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = au5.a;
                }
                xdr xdrVar6 = yt5Var.s;
                do {
                    value2 = xdrVar6.getValue();
                } while (!xdrVar6.k(value2, obj2));
                xdr xdrVar7 = yt5Var.t;
                Boolean bool5 = Boolean.FALSE;
                xdrVar7.getClass();
                xdrVar7.m(null, bool5);
                return Unit.a;
            case 12:
                Object obj3 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertLocationsDto>> a10 = ((ConcertLocationSelectorApi) ((vw5) this.l).a.getValue()).a();
                    this.k = 1;
                    N = swf.N(a10, this);
                    break;
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    N = obj;
                }
                bii biiVar = (bii) N;
                if (!(biiVar instanceof aii)) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i20 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str3 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i20, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                ConcertLocationsDto concertLocationsDto = (ConcertLocationsDto) ((aii) biiVar).a;
                concertLocationsDto.getClass();
                List<ConcertLocationDto> locations = concertLocationsDto.getLocations();
                if (locations != null) {
                    arrayList = new ArrayList();
                    for (ConcertLocationDto concertLocationDto : locations) {
                        if (concertLocationDto != null && (id = concertLocationDto.getId()) != null) {
                            long longValue = id.longValue();
                            String name2 = concertLocationDto.getName();
                            if (name2 != null) {
                                ov5Var = new ov5(longValue, name2);
                                if (ov5Var == null) {
                                    arrayList.add(ov5Var);
                                }
                            }
                        }
                        ov5Var = null;
                        if (ov5Var == null) {
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return new qj6(arrayList);
                }
                obj3 = new nj6(null);
                return obj3;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ww5 ww5Var = (ww5) this.l;
                x0q x0qVar = ww5Var.b.s;
                i64 i64Var = new i64(19, ww5Var);
                this.k = 1;
                x0qVar.collect(i64Var, this);
                return nm6Var13;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar3 = ((dz5) this.l).n;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar3.emit(unit, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                w16 w16Var = (w16) ((evj) this.l).e;
                this.k = 1;
                Object a11 = w16Var.a(this);
                return a11 == nm6Var15 ? nm6Var15 : a11;
            case 16:
                d26 d26Var = (d26) this.l;
                nm6 nm6Var16 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    vdr vdrVar = d26Var.k;
                    xc xcVar2 = new xc(i4, i, z3 ? 1 : 0);
                    this.k = 1;
                    if (zsd.h0(vdrVar, xcVar2, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                suc.c((suc) ((d16) d26Var.g.b).m.b);
                return Unit.a;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    osh oshVar = (osh) this.l;
                    this.k = 1;
                    if (osh.p(oshVar, this) == nm6Var17) {
                        return nm6Var17;
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
                nm6 nm6Var18 = nm6.a;
                int i26 = this.k;
                if (i26 != 0) {
                    if (i26 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.l;
                this.k = 1;
                Object f2 = ConstraintTrackingWorker.f(constraintTrackingWorker, this);
                return f2 == nm6Var18 ? nm6Var18 : f2;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    oh6 oh6Var = (oh6) this.l;
                    this.k = 1;
                    m = oh6.m(oh6Var, this);
                    if (m == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    m = obj;
                }
                e73 e73Var = (e73) m;
                e73Var.getClass();
                if (e73Var instanceof c73) {
                    oh6 oh6Var2 = (oh6) this.l;
                    ssg.a(3, oh6Var2.h, hrg.q("Block load error[", oh6Var2.g.a.a, "]"), null);
                }
                kzp kzpVar = ((oh6) this.l).k;
                if (kzpVar != null) {
                    kzpVar.invoke(e73Var);
                }
                ((oh6) this.l).i = false;
                return Unit.a;
            case 20:
                vo6 vo6Var = (vo6) this.l;
                nm6 nm6Var20 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    pce pceVar = new pce(vo6Var.c);
                    pceVar.c = vo6Var.a;
                    pceVar.e(lmq.c);
                    pceVar.j = xee.L(xz0.X(new e7t[]{new g3r(true)}));
                    rce a12 = pceVar.a();
                    cce cceVar = vo6Var.d;
                    this.k = 1;
                    a5 = cceVar.a(a12, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a5 = obj;
                }
                sce sceVar = (sce) a5;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        j = c3x.f(bitmap.getPixel(0, 0));
                    } else {
                        su4.s(2, null, tlm.j("Unexpected cover type ", drawable.getClass()), null);
                        j = vo6Var.b;
                    }
                    fk0 fk0Var = vo6Var.e;
                    d85 d85Var = new d85(j);
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cz6 cz6Var = (cz6) this.l;
                x0q x0qVar2 = cz6Var.n.a;
                i64 i64Var2 = new i64(24, cz6Var);
                this.k = 1;
                x0qVar2.collect(i64Var2, this);
                return nm6Var21;
            case 22:
                g47 g47Var = (g47) this.l;
                nm6 nm6Var22 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    x3n x3nVar = g47Var.k;
                    aro aroVar = g47Var.n;
                    x3nVar.getClass();
                    aroVar.getClass();
                    if (aroVar instanceof xqo) {
                        I = zsd.I(new fro(x3nVar, z6 ? 1 : 0, i5));
                    } else {
                        if (!(aroVar.equals(yqo.a) ? true : aroVar.equals(zqo.a))) {
                            b6e.s();
                            return null;
                        }
                        I = zsd.I(new fro(x3nVar, z4 ? 1 : 0, i2));
                    }
                    bv6 bv6Var = new bv6((Object) g47Var, (Continuation) (z5 ? 1 : 0), 9);
                    this.k = 1;
                    Object collect = I.collect(new t58(12, qej.a, bv6Var), this);
                    if (collect != nm6Var22) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var22) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cb7 cb7Var2 = (cb7) this.l;
                this.k = 1;
                Object M2 = cb7Var2.M(this);
                return M2 == nm6Var23 ? nm6Var23 : M2;
            case 24:
                Object obj4 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    vb7 vb7Var = (vb7) this.l;
                    this.k = 1;
                    Object V2 = x97.V(vb7Var.b, new j57((Object) vb7Var, (Continuation) (z7 ? 1 : 0), i3), this);
                    Object obj5 = V2;
                    if (V2 != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 != 0) {
                    if (i33 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vqn vqnVar = new vqn();
                vqn vqnVar2 = new vqn();
                vqn vqnVar3 = new vqn();
                il7 il7Var = (il7) this.l;
                x0q x0qVar3 = il7Var.o.a;
                pm pmVar = new pm(vqnVar, vqnVar2, vqnVar3, il7Var, 5);
                this.k = 1;
                x0qVar3.collect(pmVar, this);
                return nm6Var24;
            case 26:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    qp7 qp7Var = (qp7) this.l;
                    boolean z10 = qp7Var.c;
                    this.k = 1;
                    o = qp7Var.o(z10, this);
                    if (o == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    o = obj;
                }
                e73 e73Var2 = (e73) o;
                e73Var2.getClass();
                if (e73Var2 instanceof c73) {
                    ssg.a(3, ((qp7) this.l).n(), hrg.q("Block load error[", ((qp7) this.l).a().a().a, "]"), null);
                }
                kzp kzpVar2 = ((qp7) this.l).b;
                if (kzpVar2 != null) {
                    kzpVar2.invoke(e73Var2);
                }
                ((qp7) this.l).c = false;
                return Unit.a;
            case 27:
                s48 s48Var = (s48) this.l;
                nm6 nm6Var26 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    ((z66) s48Var.c.getValue()).i(u0j.b);
                    vdr c = ((z66) s48Var.c.getValue()).c();
                    xc xcVar3 = new xc(i4, 16, z8 ? 1 : 0);
                    this.k = 1;
                    if (zsd.h0(c, xcVar3, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                s48Var.b.invoke();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                bw1 bw1Var = (bw1) this.l;
                nm6 nm6Var27 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    q58 q58Var = (q58) bw1Var.d;
                    if (q58Var instanceof l3j) {
                        q58Var.getClass();
                        this.k = 1;
                        f = bw1.f(bw1Var, (l3j) q58Var, this);
                        break;
                    } else {
                        this.k = 2;
                        d = bw1.d(bw1Var, q58Var, this);
                        break;
                    }
                    return nm6Var27;
                }
                if (i36 == 1) {
                    qgg.h0(obj);
                    f = obj;
                    l68Var = (l68) f;
                } else {
                    if (i36 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                    l68Var = (l68) d;
                }
                if (l68Var != null) {
                    y58 y58Var = (y58) bw1Var.j;
                    if (y58Var != null) {
                        q13 q13Var = y58Var.i;
                        q13 q13Var2 = y58Var.g;
                        q13 q13Var3 = y58Var.f;
                        q13 q13Var4 = y58Var.d;
                        s9f[] s9fVarArr2 = y58.n;
                        ImageView imageView = (ImageView) q13Var4.a(s9fVarArr2[1]);
                        int i37 = l68Var.a;
                        String str4 = l68Var.f;
                        g58 g58Var = l68Var.d;
                        imageView.setImageResource(i37);
                        ((TextView) y58Var.e.a(s9fVarArr2[2])).setText(l68Var.b);
                        TextView textView = (TextView) q13Var3.a(s9fVarArr2[3]);
                        String str5 = l68Var.c;
                        textView.setText(str5);
                        ((TextView) q13Var3.a(s9fVarArr2[3])).setVisibility(str5 != null ? 0 : 8);
                        ((Button) q13Var2.a(s9fVarArr2[4])).setText(g58Var != null ? g58Var.a : null);
                        ((Button) q13Var2.a(s9fVarArr2[4])).setVisibility(g58Var != null ? 0 : 8);
                        ((Button) y58Var.h.a(s9fVarArr2[5])).setText(l68Var.e);
                        ((Button) q13Var.a(s9fVarArr2[6])).setText(str4);
                        ((Button) q13Var.a(s9fVarArr2[6])).setVisibility(str4 != null ? 0 : 8);
                        y58Var.m = g58Var;
                    }
                    bw1Var.s(false);
                } else {
                    ((i58) ((xzi) bw1Var.e).a).D(bw1Var.b);
                }
                return Unit.a;
            default:
                nm6 nm6Var28 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<DisclaimerDto>>> a13 = ((DisclaimerApi) ((jyr) ((le3) this.l).b).getValue()).a();
                    this.k = 1;
                    N2 = swf.N(a13, this);
                    if (N2 == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    N2 = obj;
                }
                bii biiVar2 = (bii) N2;
                if (!(biiVar2 instanceof aii)) {
                    if (biiVar2 instanceof xhi) {
                        xhi xhiVar2 = (xhi) biiVar2;
                        MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                        int i39 = xhiVar2.b;
                        String name3 = musicBackendInvocationError2.getName();
                        String str6 = name3 == null ? "" : name3;
                        String message2 = musicBackendInvocationError2.getMessage();
                        return new kj6(i39, musicBackendInvocationError2.getDetails(), str6, message2 == null ? "" : message2, xhiVar2.a);
                    }
                    if (biiVar2 instanceof yhi) {
                        yhi yhiVar2 = (yhi) biiVar2;
                        return new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                    }
                    if (biiVar2 instanceof zhi) {
                        return uwf.J((zhi) biiVar2);
                    }
                    b6e.s();
                    return null;
                }
                List<DisclaimerDto> list2 = (List) ((aii) biiVar2).a;
                ArrayList arrayList3 = new ArrayList();
                for (DisclaimerDto disclaimerDto : list2) {
                    if (disclaimerDto == null || (id2 = disclaimerDto.getId()) == null || (type = disclaimerDto.getType()) == null) {
                        a58Var = null;
                    } else {
                        String reason = disclaimerDto.getReason();
                        String title = disclaimerDto.getTitle();
                        String description = disclaimerDto.getDescription();
                        DisclaimerDetailsDto details = disclaimerDto.getDetails();
                        a58Var = new a58(id2, type, reason, title, description, (details == null || (text = details.getText()) == null || (url = details.getUrl()) == null) ? null : new f58(text, url));
                    }
                    if (a58Var != null) {
                        arrayList3.add(a58Var);
                    }
                }
                return new qj6(arrayList3);
        }
    }
}
