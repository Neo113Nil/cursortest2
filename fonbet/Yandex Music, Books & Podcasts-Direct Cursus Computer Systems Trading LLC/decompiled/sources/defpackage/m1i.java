package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.util.Log;
import com.yandex.music.mixes.data.remote.MixesApi;
import com.yandex.music.mixes.data.remote.MixesEntitiesDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.plus.pay.a;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.internal.feature.payment.inapp.google.e;
import com.yandex.plus.pay.internal.feature.user.b;
import com.yandex.plus.pay.internal.g;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class m1i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1i(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m1i((o1i) this.l, continuation, 0);
            case 1:
                return new m1i((g2i) this.l, continuation, 1);
            case 2:
                return new m1i((o8i) this.l, continuation, 2);
            case 3:
                return new m1i((b9i) this.l, continuation, 3);
            case 4:
                return new m1i((sai) this.l, continuation, 4);
            case 5:
                return new m1i((d18) this.l, continuation, 5);
            case 6:
                return new m1i((rli) this.l, continuation, 6);
            case 7:
                return new m1i((Context) this.l, continuation, 7);
            case 8:
                return new m1i((tsi) this.l, continuation, 8);
            case 9:
                return new m1i((bui) this.l, continuation, 9);
            case 10:
                return new m1i((jac) this.l, continuation, 10);
            case 11:
                return new m1i((vwi) this.l, continuation, 11);
            case 12:
                return new m1i((tyi) this.l, continuation, 12);
            case 13:
                return new m1i((b6j) this.l, continuation, 13);
            case 14:
                return new m1i((w8j) this.l, continuation, 14);
            case 15:
                return new m1i((v9j) this.l, continuation, 15);
            case 16:
                return new m1i((ebj) this.l, continuation, 16);
            case 17:
                return new m1i((vcj) this.l, continuation, 17);
            case 18:
                return new m1i((udj) this.l, continuation, 18);
            case 19:
                return new m1i((lmj) this.l, continuation, 19);
            case 20:
                return new m1i((avj) this.l, continuation, 20);
            case 21:
                return new m1i((w1k) this.l, continuation, 21);
            case 22:
                return new m1i((dj4) this.l, continuation, 22);
            case 23:
                return new m1i((n9k) this.l, continuation, 23);
            case 24:
                return new m1i((tck) this.l, continuation, 24);
            case 25:
                return new m1i((vek) this.l, continuation, 25);
            case 26:
                return new m1i((fjk) this.l, continuation, 26);
            case 27:
                return new m1i((kjk) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new m1i((k1l) this.l, continuation, 28);
            default:
                return new m1i((t1f) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((m1i) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((m1i) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 14:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 26:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((m1i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d5, code lost:
    
        if (r10.emit(r2, r9) == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b4, code lost:
    
        if (r10 == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03aa, code lost:
    
        if (r10.emit(r2, r9) == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0389, code lost:
    
        if (r10 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0411, code lost:
    
        if (r0.b() == r1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r10.f0(r2, r9) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0461  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0459 -> B:216:0x045d). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        boolean z2 = false;
        int i = 2;
        int i2 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = ((o1i) this.l).n;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar.emit(j0, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((g2i) this.l).r;
                    String j02 = j66.j0();
                    this.k = 1;
                    if (j0qVar2.emit(j02, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MixesEntitiesDto>> a = ((MixesApi) ((o8i) this.l).a.getValue()).a();
                    this.k = 1;
                    obj = swf.N(a, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                bii biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    ArrayList F = neg.F((MixesEntitiesDto) ((aii) biiVar).a);
                    return F == null ? new nj6(null) : new qj6(F);
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i6 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i6, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            case 3:
                b9i b9iVar = (b9i) this.l;
                xdr xdrVar = b9iVar.k;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    y8i y8iVar = y8i.a;
                    xdrVar.getClass();
                    xdrVar.m(null, y8iVar);
                    o8i o8iVar = b9iVar.m;
                    this.k = 1;
                    o8iVar.getClass();
                    obj = x97.V(dm6.b, new m1i(o8iVar, continuation, i), this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    z8i z8iVar = new z8i((List) ((qj6) rj6Var).a);
                    xdrVar.getClass();
                    xdrVar.m(null, z8iVar);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    x8i x8iVar = x8i.a;
                    xdrVar.getClass();
                    xdrVar.m(null, x8iVar);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    bci bciVar = ((sai) this.l).c;
                    if (bciVar == null) {
                        Intrinsics.j("sheetState");
                        throw null;
                    }
                    this.k = 1;
                    if (bciVar.d(this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                zi3 zi3Var = (zi3) ((d18) this.l).f;
                this.k = 1;
                Object Q = gld.Q(new zig(zi3Var, continuation, 21), this);
                return Q == nm6Var6 ? nm6Var6 : Q;
            case 6:
                rli rliVar = (rli) this.l;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    fkn fknVar = rliVar.b.u;
                    z0i z0iVar = new z0i(i, 4, continuation);
                    this.k = 1;
                    if (zsd.h0(fknVar, z0iVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                suc.c(((vli) rliVar.l.b).m);
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    Context context = (Context) this.l;
                    okd okdVar = new okd(context);
                    this.k = 1;
                    String packageName = context.getPackageName();
                    List<AppWidgetProviderInfo> installedProviders = okdVar.b.getInstalledProviders();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : installedProviders) {
                        if (Intrinsics.d(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
                    }
                    Object a2 = ((wb7) okdVar.c.getValue()).a(new kkd(CollectionsKt.A0(arrayList2), null), this);
                    if (a2 != nm6.a) {
                        a2 = Unit.a;
                    }
                    if (a2 == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    tsi tsiVar = (tsi) this.l;
                    this.k = 1;
                    if (!((Boolean) tsiVar.e.getValue()).booleanValue()) {
                        zcm zcmVar = tsiVar.b;
                        rjq rjqVar = zcmVar.e;
                        t2i t2iVar = (t2i) zcmVar.b.getValue();
                        boolean z3 = t2iVar != null ? !(t2iVar.c != null) : false;
                        if (zcmVar.d || !z3) {
                            zcmVar.d = false;
                            rjqVar.g();
                            x97.y(hld.s(rjqVar, dm6.b()), null, null, new xcm(zcmVar, continuation, z ? 1 : 0), 3);
                        } else {
                            rjq rjqVar2 = zcmVar.f;
                            rjqVar2.g();
                            x97.y(hld.s(rjqVar2, dm6.b()), null, null, new xcm(zcmVar, continuation, i2), 3);
                        }
                    }
                    Object H = tsiVar.H(this);
                    if (H != nm6Var9) {
                        H = Unit.a;
                    }
                    if (H == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((bui) this.l).n;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar.emit(unit, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) ((jyr) ((jac) this.l).d).getValue()).getData();
                    this.k = 1;
                    obj = zsd.g0(data, this);
                    if (obj == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ec7.a((hmm) obj, "promo_is_show");
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    e eVar = (e) ((g) ((vwi) this.l).a).f.getValue();
                    this.k = 1;
                    obj = eVar.a.b(this);
                    if (obj == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                return Boolean.valueOf(plusPayGoogleBillingConfig != null ? plusPayGoogleBillingConfig.isNativePaymentAllowed() : false);
            case 12:
                tyi tyiVar = (tyi) this.l;
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    if (saf.X(getContext())) {
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    tyi.b(tyiVar);
                    if (saf.X(getContext())) {
                        long j = tyiVar.a;
                        this.k = 1;
                        if (y2x.o(j, this) == nm6Var13) {
                            return nm6Var13;
                        }
                        tyi.b(tyiVar);
                        if (saf.X(getContext())) {
                            return Unit.a;
                        }
                    }
                }
            case 13:
                b6j b6jVar = (b6j) this.l;
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                iv1 iv1Var = b6jVar.h;
                if (iv1Var == null) {
                    Intrinsics.j("nfcEnableReceiver");
                    throw null;
                }
                xdr xdrVar2 = (xdr) iv1Var.c;
                fmi fmiVar = new fmi(7, b6jVar);
                this.k = 2;
                xdrVar2.collect(fmiVar, this);
                return nm6Var14;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar3 = ((w8j) this.l).d;
                y8j y8jVar = y8j.a;
                xdrVar3.getClass();
                xdrVar3.m(null, y8jVar);
                return Unit.a;
            case 15:
                v9j v9jVar = (v9j) this.l;
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar4 = v9jVar.u;
                    Boolean bool = Boolean.TRUE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool);
                    vxr vxrVar = (vxr) v9jVar.l.getValue();
                    this.k = 1;
                    obj = vxrVar.a(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar5 = v9jVar.u;
                        Boolean bool2 = Boolean.FALSE;
                        xdrVar5.getClass();
                        xdrVar5.m(null, bool2);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                txr txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar3 = v9jVar.v;
                    String j03 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar52 = v9jVar.u;
                Boolean bool22 = Boolean.FALSE;
                xdrVar52.getClass();
                xdrVar52.m(null, bool22);
                return Unit.a;
            case 16:
                ebj ebjVar = (ebj) this.l;
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    kvh kvhVar = new kvh(ebjVar.b.M(), 14);
                    this.k = 1;
                    if (zsd.g0(kvhVar, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                suc.c(((bbj) ebjVar.d.b).n);
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar6 = ((vcj) this.l).n;
                pcj pcjVar = pcj.a;
                xdrVar6.getClass();
                xdrVar6.m(null, pcjVar);
                return Unit.a;
            case 18:
                udj udjVar = (udj) this.l;
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar7 = udjVar.u;
                    Boolean bool3 = Boolean.TRUE;
                    xdrVar7.getClass();
                    xdrVar7.m(null, bool3);
                    vxr vxrVar2 = (vxr) udjVar.l.getValue();
                    this.k = 1;
                    obj = vxrVar2.a(this);
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar8 = udjVar.u;
                        Boolean bool4 = Boolean.FALSE;
                        xdrVar8.getClass();
                        xdrVar8.m(null, bool4);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                txr txrVar2 = (txr) obj;
                if (!Intrinsics.d(txrVar2, sxr.a)) {
                    if (!Intrinsics.d(txrVar2, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar4 = udjVar.v;
                    String j04 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar82 = udjVar.u;
                Boolean bool42 = Boolean.FALSE;
                xdrVar82.getClass();
                xdrVar82.m(null, bool42);
                return Unit.a;
            case 19:
                lmj lmjVar = (lmj) this.l;
                pmj pmjVar = lmjVar.d;
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    pmjVar.G();
                    this.k = 1;
                    if (pmjVar.a(this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                lmjVar.f.invoke(Boolean.FALSE);
                return Unit.a;
            case 20:
                Object obj3 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    if (!((avj) this.l).f.f) {
                        ((avj) this.l).f.f = true;
                        avj avjVar = (avj) this.l;
                        this.k = 1;
                        avjVar.getClass();
                        avjVar.s = System.currentTimeMillis();
                        avjVar.P.put("releaseTimestamp", new Long(avjVar.s));
                        Object O = a4g.O(new seg(avjVar, continuation, 11), this);
                        Object obj4 = O;
                        if (O != obj3) {
                            obj4 = Unit.a;
                        }
                        if (obj4 == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                w1k w1kVar = (w1k) this.l;
                nm6 nm6Var21 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    tc4 u0 = zsd.u0(w1kVar.f.u(pfg.c), w1kVar.f.u(pfg.b));
                    seg segVar = new seg(w1kVar, continuation, 13);
                    this.k = 1;
                    obj = zsd.j0(u0, segVar, this);
                    if (obj == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hiu hiuVar = (hiu) obj;
                if (hiuVar != null) {
                    if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                        Log.d("Paging", "Jump triggered on PagingSource " + w1kVar.b + " by " + hiuVar);
                    }
                    w1kVar.e.invoke();
                }
                return Unit.a;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar5 = (j0q) ((dj4) this.l).e;
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (j0qVar5.emit(unit2, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = ((n9k) this.l).b;
                    Unit unit3 = Unit.a;
                    this.k = 1;
                    if (x0qVar2.emit(unit3, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    tck tckVar = (tck) this.l;
                    this.k = 1;
                    if (tckVar.p(this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var25 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqn i30 = hrg.i(obj);
                xdr xdrVar9 = frc.a.g;
                tek tekVar = new tek((int) (z2 ? 1 : 0), (Object) i30, this.l);
                this.k = 1;
                xdrVar9.collect(tekVar, this);
                return nm6Var25;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(((b) ((g) ((a) ((fjk) this.l).a.getValue())).d.getValue()).c, 18);
                    this.k = 1;
                    if (zsd.g0(bcaVar, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new wyo(Unit.a);
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    kjk kjkVar = (kjk) this.l;
                    this.k = 1;
                    if (kjk.J(kjkVar, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                k1l k1lVar = (k1l) this.l;
                nm6 nm6Var28 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    cr crVar = k1lVar.g;
                    tf6 tf6Var = k1lVar.d;
                    this.k = 1;
                    break;
                } else {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x0q x0qVar3 = k1lVar.e;
                fmi fmiVar2 = new fmi(23, k1lVar);
                this.k = 2;
                x0qVar3.getClass();
                x0q.m(x0qVar3, fmiVar2, this);
                return nm6Var28;
            default:
                nm6 nm6Var29 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    t1f t1fVar = (t1f) this.l;
                    x0q x0qVar4 = (x0q) t1fVar.d;
                    s1l s1lVar = new s1l(t1fVar, null);
                    this.k = 1;
                    if (zsd.O(x0qVar4, s1lVar, this) == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
