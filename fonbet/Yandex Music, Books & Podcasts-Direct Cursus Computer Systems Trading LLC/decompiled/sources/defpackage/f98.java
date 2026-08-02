package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.donation.AlbumDonationDataDto;
import com.yandex.music.shared.dto.donation.AlbumDonationDto;
import com.yandex.music.shared.dto.donation.DonationDomainItemDto;
import com.yandex.music.shared.network.repositories.retrofit.DonationApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f98 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f98(pjc pjcVar, Continuation continuation, kub kubVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = kubVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                f98 f98Var = new f98((vx6) this.m, continuation, 0);
                f98Var.l = obj;
                return f98Var;
            case 1:
                return new f98((n98) this.m, continuation, 1);
            case 2:
                return new f98((vgu) this.l, (String) this.m, continuation, 2);
            case 3:
                f98 f98Var2 = new f98((b5a) this.m, continuation, 3);
                f98Var2.l = obj;
                return f98Var2;
            case 4:
                return new f98((v7a) this.l, (String) this.m, continuation, 4);
            case 5:
                return new f98((taa) this.l, (mqs) this.m, continuation, 5);
            case 6:
                return new f98((taa) this.l, (zvs) this.m, continuation, 6);
            case 7:
                f98 f98Var3 = new f98((cca) this.m, continuation, 7);
                f98Var3.l = obj;
                return f98Var3;
            case 8:
                return new f98((ida) this.m, continuation, 8);
            case 9:
                return new f98((ida) this.l, (vbc) this.m, continuation, 9);
            case 10:
                return new f98((aea) this.m, continuation, 10);
            case 11:
                return new f98((aea) this.l, (vbc) this.m, continuation, 11);
            case 12:
                return new f98((gha) this.m, continuation, 12);
            case 13:
                return new f98((es6) this.m, continuation, 13);
            case 14:
                return new f98((q04) this.m, continuation, 14);
            case 15:
                return new f98((q04) this.m, continuation, 15);
            case 16:
                f98 f98Var4 = new f98((zwa) this.m, continuation, 16);
                f98Var4.l = obj;
                return f98Var4;
            case 17:
                return new f98((wwa) this.l, (e2o) this.m, continuation, 17);
            case 18:
                return new f98((xxa) this.l, (hxa) this.m, continuation, 18);
            case 19:
                return new f98((p0b) this.l, (List) this.m, continuation, 19);
            case 20:
                return new f98((es6) this.l, (u8l) this.m, continuation, 20);
            case 21:
                return new f98((leb) this.m, continuation, 21);
            case 22:
                return new f98((leb) this.l, (vbc) this.m, continuation, 22);
            case 23:
                return new f98((xhb) this.l, (String) this.m, continuation, 23);
            case 24:
                return new f98((pjc) this.l, (j0q) this.m, continuation, 24);
            case 25:
                return new f98((sdr) this.l, (kub) this.m, continuation, 25);
            case 26:
                f98 f98Var5 = new f98((fk0) this.m, continuation, 26);
                f98Var5.l = obj;
                return f98Var5;
            case 27:
                return new f98((em) this.l, continuation, (kub) this.m, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new f98((pjc) this.l, continuation, (kub) this.m, 28);
            default:
                return new f98((ezb) this.l, (yyb) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((f98) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0348, code lost:
    
        if (r1 == r0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0366, code lost:
    
        if (r1 == r0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x038d, code lost:
    
        if (r1 == r0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04a0, code lost:
    
        if (r1 == r0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04b9, code lost:
    
        if (r1.invoke(r21) == r0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0835, code lost:
    
        if (r1 == r0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0966, code lost:
    
        if (r1 == r0) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        if (r10.f(r2, r21) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (defpackage.fk0.c(r10, r2, r0, null, r21, 12) == r6) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:215:0x04b9 -> B:210:0x0498). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        n98 n98Var;
        Object g;
        ?? r1;
        DonationDomainItemDto data;
        Object e;
        ida idaVar;
        Object f;
        aea aeaVar;
        List list;
        Object n;
        gha ghaVar;
        Object m;
        gha ghaVar2;
        si3 si3Var;
        Object obj2;
        Object d;
        mw4 mw4Var;
        Object a2;
        nrf nrfVar;
        Object obj3;
        Object i;
        leb lebVar;
        long j;
        int i2 = this.j;
        int i3 = 9;
        int i4 = 3;
        int i5 = 7;
        int i6 = 10;
        int i7 = 0;
        Object obj4 = this.m;
        int i8 = 1;
        Continuation continuation = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (i2) {
            case 0:
                vx6 vx6Var = (vx6) obj4;
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    eno m2 = ((gs4) vx6Var.b).m();
                    t58 t58Var = new t58(vx6Var, rjcVar);
                    this.l = null;
                    this.k = 1;
                    if (m2.collect(t58Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                n98 n98Var2 = (n98) obj4;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                try {
                    if (i10 == 0) {
                        qgg.h0(obj);
                        xdr xdrVar = n98Var2.n;
                        Boolean bool = Boolean.TRUE;
                        xdrVar.getClass();
                        xdrVar.m(null, bool);
                        try {
                            vxr vxrVar = n98Var2.l;
                            this.l = n98Var2;
                            this.k = 1;
                            a = vxrVar.a(this);
                            if (a != nm6Var2) {
                                n98Var = n98Var2;
                            }
                            return nm6Var2;
                        } catch (Throwable th) {
                            th = th;
                            xdr xdrVar2 = n98Var2.n;
                            Boolean bool2 = Boolean.FALSE;
                            xdrVar2.getClass();
                            xdrVar2.m(null, bool2);
                            throw th;
                        }
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    n98 n98Var3 = (n98) this.l;
                    try {
                        qgg.h0(obj);
                        n98Var = n98Var3;
                        a = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        n98Var2 = n98Var3;
                        xdr xdrVar22 = n98Var2.n;
                        Boolean bool22 = Boolean.FALSE;
                        xdrVar22.getClass();
                        xdrVar22.m(null, bool22);
                        throw th;
                    }
                    txr txrVar = (txr) a;
                    xdr xdrVar3 = n98Var.n;
                    Boolean bool3 = Boolean.FALSE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool3);
                    if (!Intrinsics.d(txrVar, sxr.a)) {
                        if (!Intrinsics.d(txrVar, rxr.a)) {
                            b6e.s();
                            return null;
                        }
                        this.l = null;
                        this.k = 2;
                        Object emit = n98Var2.o.emit(j66.j0(), this);
                        if (emit != nm6Var2) {
                            emit = Unit.a;
                            break;
                        }
                    } else {
                        n98Var2.G();
                    }
                    return Unit.a;
                } catch (Throwable th3) {
                    th = th3;
                    n98Var2 = n98Var;
                    xdr xdrVar222 = n98Var2.n;
                    Boolean bool222 = Boolean.FALSE;
                    xdrVar222.getClass();
                    xdrVar222.m(null, bool222);
                    throw th;
                }
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vgu vguVar = (vgu) this.l;
                this.k = 1;
                vguVar.getClass();
                dq7 dq7Var = ca8.a;
                Object V = x97.V(mn7.d, new h0t((Object) vguVar, obj4, (Continuation) (z ? 1 : 0), i3), this);
                return V == nm6Var3 ? nm6Var3 : V;
            case 3:
                u4a u4aVar = (u4a) this.l;
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    u4aVar.getClass();
                    this.l = null;
                    this.k = 1;
                    if (b5a.c((b5a) obj4, null, null, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                Object obj5 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumDonationDto>> a3 = ((DonationApi) ((v7a) this.l).a.getValue()).a((String) obj4);
                    this.k = 1;
                    g = uwf.g(a3, this);
                    break;
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                rj6 rj6Var = (rj6) g;
                if (!(rj6Var instanceof qj6)) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                List<AlbumDonationDataDto> donations = ((AlbumDonationDto) ((qj6) rj6Var).a).getDonations();
                if (donations != null) {
                    r1 = new ArrayList();
                    for (AlbumDonationDataDto albumDonationDataDto : donations) {
                        m7a G = (albumDonationDataDto == null || (data = albumDonationDataDto.getData()) == null) ? null : lxe.G(data);
                        if (G != null) {
                            r1.add(G);
                        }
                    }
                } else {
                    r1 = c5b.a;
                }
                if (r1 != 0) {
                    return new qj6(r1);
                }
                obj5 = new nj6(null);
                return obj5;
            case 5:
                nm6 nm6Var5 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((taa) this.l).f((mqs) obj4, kss.a, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i15 = this.k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jur jurVar = ((taa) this.l).b;
                this.k = 1;
                jurVar.getClass();
                Object V2 = x97.V(dm6.b, new n6p(jurVar, (zvs) obj4, z2 ? 1 : 0, i6), this);
                return V2 == nm6Var6 ? nm6Var6 : V2;
            case 7:
                cca ccaVar = (cca) obj4;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var7 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    x97.y(mm6Var, null, null, new g68(ccaVar, z4 ? 1 : 0, 4), 3);
                    String str = cca.k;
                    pjc b0 = zsd.b0(new bca(((kij) ccaVar.e.getValue()).c, 0));
                    ak1 ak1Var = new ak1((Object) ccaVar, (Continuation) (z3 ? 1 : 0), i4);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(b0, ak1Var, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                ida idaVar2 = (ida) obj4;
                jyr jyrVar = idaVar2.n;
                nm6 nm6Var8 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    bda bdaVar = (bda) jyrVar.getValue();
                    this.l = idaVar2;
                    this.k = 1;
                    e = ((v55) bdaVar.b.getValue()).e(this);
                    if (e == nm6Var8) {
                        return nm6Var8;
                    }
                    idaVar = idaVar2;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    idaVar = (ida) this.l;
                    qgg.h0(obj);
                    e = obj;
                }
                ida.a(idaVar, (xca) e);
                xdr xdrVar4 = idaVar2.l;
                yx4 yx4Var = (yx4) ((bda) jyrVar.getValue()).a.getValue();
                ox6.B(new u21(10, xdrVar4, yx4.y(new pjc[]{yx4Var.b.e}, new vw4(yx4Var, z6 ? 1 : 0, z5 ? 1 : 0, i7)), new w83(3, idaVar2, ida.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/screen/downloadedmusic/ui/downloadedalbums/DownloadedAlbumsState;", 4, 2)), ot0.F(idaVar2), new u58(i5, idaVar2));
                return Unit.a;
            case 9:
                ida idaVar3 = (ida) this.l;
                nm6 nm6Var9 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ((jda) idaVar3.o.getValue()).getClass();
                    xca a4 = jda.a((vbc) obj4);
                    ida.a(idaVar3, a4);
                    bda bdaVar2 = (bda) idaVar3.n.getValue();
                    this.k = 1;
                    Object a5 = lmm.a(((v55) bdaVar2.b.getValue()).r(), new c55(a4, null), this);
                    Object obj6 = a5;
                    if (a5 != nm6Var9) {
                        obj6 = Unit.a;
                    }
                    if (obj6 != nm6Var9) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                aea aeaVar2 = (aea) obj4;
                nm6 nm6Var10 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    rda rdaVar = (rda) aeaVar2.q.getValue();
                    this.l = aeaVar2;
                    this.k = 1;
                    f = ((v55) rdaVar.b.getValue()).f(this);
                    if (f == nm6Var10) {
                        return nm6Var10;
                    }
                    aeaVar = aeaVar2;
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aeaVar = (aea) this.l;
                    qgg.h0(obj);
                    f = obj;
                }
                aea.G(aeaVar, (qda) f);
                bea H = aeaVar2.H();
                List list2 = (List) aeaVar2.m.getValue();
                H.getClass();
                qda a6 = bea.a(list2);
                aeaVar2.H().getClass();
                if (a6 == qda.a && (list = aeaVar2.k) != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        xdr xdrVar5 = aeaVar2.l;
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(aea.J((c01) it.next()));
                        }
                        dea deaVar = new dea(arrayList);
                        xdrVar5.getClass();
                        xdrVar5.m(null, deaVar);
                    }
                }
                aea.a(aeaVar2);
                return Unit.a;
            case 11:
                aea aeaVar3 = (aea) this.l;
                nm6 nm6Var11 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    aeaVar3.H().getClass();
                    qda b = bea.b((vbc) obj4);
                    aea.G(aeaVar3, b);
                    rda rdaVar2 = (rda) aeaVar3.q.getValue();
                    this.k = 1;
                    Object a7 = lmm.a(((v55) rdaVar2.b.getValue()).r(), new d55(b, null), this);
                    Object obj7 = a7;
                    if (a7 != nm6Var11) {
                        obj7 = Unit.a;
                    }
                    if (obj7 != nm6Var11) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                gha ghaVar3 = (gha) obj4;
                jyr jyrVar2 = ghaVar3.o;
                nm6 nm6Var12 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    dha dhaVar = (dha) jyrVar2.getValue();
                    this.l = ghaVar3;
                    this.k = 1;
                    n = ((v55) dhaVar.c.getValue()).n(this);
                    if (n != nm6Var12) {
                        ghaVar = ghaVar3;
                    }
                    return nm6Var12;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ghaVar2 = (gha) this.l;
                    qgg.h0(obj);
                    m = obj;
                    gha.a(ghaVar2, (tga) m);
                    xdr xdrVar6 = ghaVar3.q;
                    xdr xdrVar7 = ghaVar3.r;
                    dha dhaVar2 = (dha) jyrVar2.getValue();
                    yx4 yx4Var2 = (yx4) dhaVar2.a.getValue();
                    Boolean bool4 = Boolean.FALSE;
                    pjc A = yx4Var2.A(((frt) dhaVar2.b.getValue()).c().a, null, null, bool4);
                    dha dhaVar3 = (dha) jyrVar2.getValue();
                    ox6.B(zsd.P(xdrVar6, xdrVar7, A, ((yx4) dhaVar3.a.getValue()).A(null, null, ((frt) dhaVar3.b.getValue()).c().a, bool4), new ab5(ghaVar3, z7 ? 1 : 0, i8)), ot0.F(ghaVar3), new u58(i3, ghaVar3));
                    return Unit.a;
                }
                gha ghaVar4 = (gha) this.l;
                qgg.h0(obj);
                ghaVar = ghaVar4;
                n = obj;
                gha.G(ghaVar, (tga) n);
                dha dhaVar4 = (dha) jyrVar2.getValue();
                this.l = ghaVar3;
                this.k = 2;
                m = ((v55) dhaVar4.c.getValue()).m(this);
                if (m != nm6Var12) {
                    ghaVar2 = ghaVar3;
                    gha.a(ghaVar2, (tga) m);
                    xdr xdrVar62 = ghaVar3.q;
                    xdr xdrVar72 = ghaVar3.r;
                    dha dhaVar22 = (dha) jyrVar2.getValue();
                    yx4 yx4Var22 = (yx4) dhaVar22.a.getValue();
                    Boolean bool42 = Boolean.FALSE;
                    pjc A2 = yx4Var22.A(((frt) dhaVar22.b.getValue()).c().a, null, null, bool42);
                    dha dhaVar32 = (dha) jyrVar2.getValue();
                    ox6.B(zsd.P(xdrVar62, xdrVar72, A2, ((yx4) dhaVar32.a.getValue()).A(null, null, ((frt) dhaVar32.b.getValue()).c().a, bool42), new ab5(ghaVar3, z7 ? 1 : 0, i8)), ot0.F(ghaVar3), new u58(i3, ghaVar3));
                    return Unit.a;
                }
                return nm6Var12;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = (zi3) ((es6) obj4).c;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                } else if (i22 == 1) {
                    si3 si3Var2 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var2;
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                        return Unit.a;
                    }
                    Function1 function1 = (Function1) si3Var.d();
                    this.l = si3Var;
                    this.k = 2;
                    break;
                } else {
                    if (i22 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3 si3Var3 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var3;
                }
                this.l = si3Var;
                this.k = 1;
                obj2 = si3Var.c(this);
                break;
            case 14:
                q04 q04Var = (q04) obj4;
                nm6 nm6Var14 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    mw4 mw4Var2 = mw4.DOWNLOADED_ARTISTS;
                    a04 a04Var = (a04) q04Var.d.getValue();
                    this.l = mw4Var2;
                    this.k = 1;
                    d = a04Var.d(8, this);
                    if (d == nm6Var14) {
                        return nm6Var14;
                    }
                    mw4Var = mw4Var2;
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mw4Var = (mw4) this.l;
                    qgg.h0(obj);
                    d = obj;
                }
                xgg xggVar = (xgg) d;
                return new hz3(new nrf(mw4Var.a, mw4Var.b), ((skr) q04Var.a.getValue()).c(R.string.artists), xggVar.a, xggVar.b);
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    mw4 mw4Var3 = mw4.DOWNLOADED_ARTISTS;
                    nrf nrfVar2 = new nrf("collection_downloaded_tracks_id", "COLLECTION_DOWNLOADED_TRACKS");
                    qja qjaVar = (qja) ((q04) obj4).c.getValue();
                    this.l = nrfVar2;
                    this.k = 1;
                    a2 = qjaVar.a(this);
                    if (a2 == nm6Var15) {
                        return nm6Var15;
                    }
                    nrfVar = nrfVar2;
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nrfVar = (nrf) this.l;
                    qgg.h0(obj);
                    a2 = obj;
                }
                return new mja(nrfVar, ((Number) a2).intValue());
            case 16:
                pfm pfmVar = (pfm) this.l;
                nm6 nm6Var16 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    qua quaVar = new qua((zwa) obj4, 1);
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar, null, null, quaVar, this, 7) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                e2o e2oVar = (e2o) obj4;
                Object obj8 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    wwa wwaVar = (wwa) this.l;
                    if (!Intrinsics.d(wwaVar, twa.a)) {
                        if (!Intrinsics.d(wwaVar, uwa.a)) {
                            if (!Intrinsics.d(wwaVar, vwa.a)) {
                                b6e.s();
                                return null;
                            }
                            this.k = 3;
                            act S = weo.S(0, 0, null, 7);
                            if (e2oVar.a()) {
                                obj3 = Unit.a;
                                break;
                            } else {
                                Object h = a.h(e2oVar.a, d2o.b, S, this);
                                obj3 = h;
                                if (h != obj8) {
                                    obj3 = Unit.a;
                                    break;
                                }
                            }
                        } else {
                            this.k = 2;
                            Object h2 = a.h(e2oVar.a, d2o.a, weo.S(0, 0, null, 7), this);
                            Object obj9 = h2;
                            if (h2 != obj8) {
                                obj9 = Unit.a;
                                break;
                            }
                        }
                    } else {
                        act actVar = hva.g;
                        this.k = 1;
                        Object h3 = a.h(e2oVar.a, d2o.c, actVar, this);
                        Object obj10 = h3;
                        if (h3 != obj8) {
                            obj10 = Unit.a;
                            break;
                        }
                    }
                } else {
                    if (i26 != 1 && i26 != 2 && i26 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var17 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((xxa) this.l).l.emit((hxa) obj4, this) == nm6Var17) {
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
            case 19:
                p0b p0bVar = (p0b) this.l;
                nm6 nm6Var18 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                fs fsVar = new fs(12, new ub7(8, new ub7(7, p0bVar.a.b(), p0bVar), (List) obj4));
                this.k = 1;
                Object g0 = zsd.g0(fsVar, this);
                return g0 == nm6Var18 ? nm6Var18 : g0;
            case 20:
                nm6 nm6Var19 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) ((es6) this.l).b).emit((u8l) obj4, this) == nm6Var19) {
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
            case 21:
                leb lebVar2 = (leb) obj4;
                jyr jyrVar3 = lebVar2.n;
                nm6 nm6Var20 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    geb gebVar = (geb) jyrVar3.getValue();
                    this.l = lebVar2;
                    this.k = 1;
                    i = ((v55) gebVar.b.getValue()).i(this);
                    if (i == nm6Var20) {
                        return nm6Var20;
                    }
                    lebVar = lebVar2;
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lebVar = (leb) this.l;
                    qgg.h0(obj);
                    i = obj;
                }
                leb.a(lebVar, (bfa) i);
                ox6.B(new u21(10, lebVar2.l, ((yx4) ((geb) jyrVar3.getValue()).a.getValue()).D(null), new w83(3, lebVar2, leb.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/screen/downloadedmusic/ui/downloadedpodcasts/episodespodcast/EpisodesPodcastScreenState;", 4, 3)), ot0.F(lebVar2), new u58(17, lebVar2));
                return Unit.a;
            case 22:
                leb lebVar3 = (leb) this.l;
                nm6 nm6Var21 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    ((meb) lebVar3.o.getValue()).getClass();
                    bfa a8 = meb.a((vbc) obj4);
                    leb.a(lebVar3, a8);
                    geb gebVar2 = (geb) lebVar3.n.getValue();
                    this.k = 1;
                    Object a9 = lmm.a(((v55) gebVar2.b.getValue()).r(), new g55(a8, null), this);
                    Object obj11 = a9;
                    if (a9 != nm6Var21) {
                        obj11 = Unit.a;
                    }
                    if (obj11 != nm6Var21) {
                        obj11 = Unit.a;
                    }
                    if (obj11 == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a10 = ((xhb) this.l).a((String) obj4, true, this);
                    return a10 == nm6Var22 ? nm6Var22 : a10;
                }
                if (i32 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                nm6 nm6Var23 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    u58 u58Var = new u58(18, (j0q) obj4);
                    this.k = 1;
                    if (pjcVar.collect(u58Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var24 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new xtb((sdr) this.l, i7));
                    ytb ytbVar = new ytb((kub) obj4, i7);
                    this.k = 1;
                    if (s0.collect(ytbVar, this) == nm6Var24) {
                        return nm6Var24;
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
                zn6 zn6Var = (zn6) this.l;
                nm6 nm6Var25 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(zn6Var, xn6.a)) {
                        j = oa5.a;
                    } else {
                        if (!(zn6Var instanceof yn6)) {
                            b6e.s();
                            return null;
                        }
                        j = ((yn6) zn6Var).a;
                    }
                    boolean c = d85.c(((d85) ((fk0) obj4).e.getValue()).a, oa5.a);
                    fk0 fk0Var = (fk0) obj4;
                    if (c) {
                        d85 d85Var = new d85(j);
                        this.l = null;
                        this.k = 1;
                        break;
                    } else {
                        d85 d85Var2 = new d85(j);
                        act S2 = weo.S(400, 0, null, 6);
                        this.l = null;
                        this.k = 2;
                        break;
                    }
                } else {
                    if (i35 != 1 && i35 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                nm6 nm6Var26 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    em emVar = (em) this.l;
                    nz5 nz5Var = new nz5((Continuation) (z8 ? 1 : 0), obj4, 14);
                    this.k = 1;
                    if (zsd.O(emVar, nz5Var, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i36 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var27 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    ytb ytbVar2 = new ytb((kub) obj4, i8);
                    this.k = 1;
                    if (pjcVar2.collect(ytbVar2, this) == nm6Var27) {
                        return nm6Var27;
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
                yyb yybVar = (yyb) obj4;
                ezb ezbVar = (ezb) this.l;
                Object obj12 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    gzb gzbVar = ezbVar.a;
                    this.k = 1;
                    Object V3 = x97.V(dm6.b, new j57(gzbVar, yybVar, continuation, 24), this);
                    Object obj13 = V3;
                    if (V3 != obj12) {
                        obj13 = Unit.a;
                    }
                    if (obj13 == obj12) {
                        return obj12;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar8 = ezbVar.c;
                xdrVar8.getClass();
                xdrVar8.m(null, yybVar);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f98(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f98(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
