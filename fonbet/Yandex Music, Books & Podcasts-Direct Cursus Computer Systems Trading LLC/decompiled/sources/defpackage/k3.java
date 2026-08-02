package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistConcertsDto;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class k3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public /* synthetic */ Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(int i, rn1 rn1Var, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.k = i;
        this.l = rn1Var;
        this.m = aqiVar;
        this.n = aqiVar2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k3((l3) this.m, continuation);
            case 1:
                return new k3((si) this.l, this.m, (x6k) this.n, continuation, 1);
            case 2:
                return new k3((am) this.l, (mqs) this.m, (cvl) this.n, continuation, 2);
            case 3:
                k3 k3Var = new k3((pyc) this.m, (ia0) this.n, continuation, 3);
                k3Var.l = obj;
                return k3Var;
            case 4:
                k3 k3Var2 = new k3((ja0) this.n, (pyc) this.m, continuation);
                k3Var2.l = obj;
                return k3Var2;
            case 5:
                k3 k3Var3 = new k3((pyc) this.m, (ka0) this.n, continuation, 5);
                k3Var3.l = obj;
                return k3Var3;
            case 6:
                k3 k3Var4 = new k3((ryc) this.m, (ia0) this.n, continuation, 6);
                k3Var4.l = obj;
                return k3Var4;
            case 7:
                k3 k3Var5 = new k3((ryc) this.m, (ja0) this.n, continuation, 7);
                k3Var5.l = obj;
                return k3Var5;
            case 8:
                k3 k3Var6 = new k3((ryc) this.m, (ka0) this.n, continuation, 8);
                k3Var6.l = obj;
                return k3Var6;
            case 9:
                return new k3((ua2) this.l, (xb0) this.m, (String) this.n, continuation, 9);
            case 10:
                return new k3((ua2) this.l, (xb0) this.m, (String) this.n, continuation, 10);
            case 11:
                return new k3((cs1) this.l, (uvn) this.m, (xb0) this.n, continuation, 11);
            case 12:
                k3 k3Var7 = new k3((d8t) this.m, (aqi) this.n, continuation, 12);
                k3Var7.l = obj;
                return k3Var7;
            case 13:
                k3 k3Var8 = new k3((iv0) this.m, (yxc) this.n, continuation, 13);
                k3Var8.l = obj;
                return k3Var8;
            case 14:
                return new k3((pv0) this.l, (Context) this.m, (rkd) this.n, continuation, 14);
            case 15:
                return new k3((ArrayList) this.l, (b81) this.m, (fvf) this.n, continuation, 15);
            case 16:
                return new k3((hh1) this.m, (String) this.n, continuation, 16);
            case 17:
                return new k3((sdr) this.l, (aqi) this.m, (aqi) this.n, continuation, 17);
            case 18:
                return new k3(this.k, (rn1) this.l, (aqi) this.m, (aqi) this.n, continuation);
            case 19:
                return new k3((go1) this.l, (String) this.m, (String) this.n, continuation, 19);
            case 20:
                k3 k3Var9 = new k3((Context) this.m, (fw1) this.n, continuation, 20);
                k3Var9.l = obj;
                return k3Var9;
            case 21:
                return new k3((ob3) this.m, (mt) this.n, continuation, 21);
            case 22:
                return new k3((ph3) this.l, (f8j) this.m, (ha0) this.n, continuation, 22);
            case 23:
                k3 k3Var10 = new k3((gs4) this.n, continuation);
                k3Var10.m = obj;
                return k3Var10;
            case 24:
                k3 k3Var11 = new k3((pr3) this.m, (ArrayList) this.n, continuation, 24);
                k3Var11.l = ((zrt) obj).a;
                return k3Var11;
            case 25:
                k3 k3Var12 = new k3((w2f) this.m, (rfg) this.n, continuation, 25);
                k3Var12.l = obj;
                return k3Var12;
            case 26:
                k3 k3Var13 = new k3((pjc[]) this.m, continuation, (wgg) this.n);
                k3Var13.l = obj;
                return k3Var13;
            case 27:
                return new k3((m54) this.l, (Function1) this.m, (aqi) this.n, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new k3((l54) this.l, (Function1) this.m, (aqi) this.n, continuation, 28);
            default:
                return new k3((p44) this.l, (f24) this.m, (String) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 1:
                ((k3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 24:
                String str = ((zrt) obj).a;
                k3 k3Var = new k3((pr3) this.m, (ArrayList) this.n, (Continuation) obj2, 24);
                k3Var.l = str;
                break;
        }
        return ((k3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e5, code lost:
    
        if (r4 == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r1.emit(r0, r18) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (defpackage.lmm.a(r6, r2, r18) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0547, code lost:
    
        if (r0 == r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0587, code lost:
    
        if (r0 == r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04f2, code lost:
    
        if (r6 == r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0676, code lost:
    
        if (r0.b(r18) == r2) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0645, code lost:
    
        if (r1 == r2) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x09c6, code lost:
    
        if (r0.collect(r2, r18) == r1) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x09b2, code lost:
    
        if (defpackage.tyf.L(700, r2, r18) == r1) goto L458;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fd  */
    /* JADX WARN: Type inference failed for: r2v22, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v4, types: [a63] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j1g j1gVar;
        l3 l3Var;
        n3 n3Var;
        sjb sjbVar;
        Object obj2;
        Object invoke;
        Object invoke2;
        Object invoke3;
        Object g;
        Object b;
        i21 i21Var;
        Object V;
        Object b2;
        String str;
        String str2;
        String str3;
        Object g2;
        Object O;
        xdr xdrVar;
        Object obj3;
        rjc rjcVar;
        Object G;
        Iterator it;
        int i = 11;
        int i2 = 2;
        int i3 = 0;
        c5b c5bVar = null;
        Object obj4 = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    l3 l3Var2 = (l3) this.m;
                    w3 w3Var = l3Var2.a;
                    Object value = w3Var.i.getValue();
                    n3 n3Var2 = value instanceof n3 ? (n3) value : null;
                    if (n3Var2 != null) {
                        d3 d3Var = w3Var.g;
                        String str4 = n3Var2.d.a;
                        boolean z = n3Var2.b.e;
                        boolean z2 = !z;
                        this.l = l3Var2;
                        this.n = n3Var2;
                        this.k = 1;
                        d3Var.getClass();
                        if (z2) {
                            j1gVar = j1g.a;
                        } else if (!z) {
                            b6e.s();
                            break;
                        } else {
                            j1gVar = j1g.b;
                        }
                        Object f = ((mu) ((cu) d3Var.a.getValue())).f(str4, j1gVar, System.currentTimeMillis(), this);
                        if (f != nm6Var) {
                            f = Unit.a;
                        }
                        if (f == nm6Var) {
                            break;
                        } else {
                            l3Var = l3Var2;
                            n3Var = n3Var2;
                        }
                    }
                    break;
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    n3Var = (n3) this.n;
                    l3Var = (l3) this.l;
                    qgg.h0(obj);
                }
                boolean z3 = n3Var.b.e;
                if (!z3) {
                    sjbVar = sjb.Like;
                } else if (!z3) {
                    b6e.s();
                    break;
                } else {
                    sjbVar = sjb.Unlike;
                }
                sjb sjbVar2 = sjbVar;
                Object invoke4 = l3Var.e.b.invoke();
                q3 q3Var = invoke4 instanceof q3 ? (q3) invoke4 : null;
                r8 = q3Var != null ? q3Var.e : 0;
                if (r8 != 0) {
                    exa exaVar = l3Var.d;
                    xmb xmbVar = exaVar.c;
                    nab nabVar = exaVar.a;
                    x43 x43Var = r8.a;
                    cvo cvoVar = x43Var.a;
                    thj thjVar = r8.b;
                    String str5 = (String) exaVar.e.get(thjVar.b);
                    if (str5 == null) {
                        str5 = "";
                    }
                    xmb.b(xmbVar, sjbVar2, nabVar, null, cvoVar, x43Var.b, str5, thjVar, 778);
                }
            case 1:
                si siVar = (si) this.l;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                            rj7.f();
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    l5 l5Var = new l5(siVar, this.m, r8, 7);
                    this.k = 1;
                    break;
                }
                vdr vdrVar = siVar.a;
                ri riVar = new ri(i3, (x6k) this.n);
                this.k = 2;
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    rm rmVar = ((am) this.l).a;
                    mqs mqsVar = (mqs) this.m;
                    cvl cvlVar = (cvl) this.n;
                    this.k = 1;
                    jm jmVar = (jm) rmVar.f.getValue();
                    im imVar = jmVar instanceof im ? (im) jmVar : null;
                    if (imVar != null) {
                        if (!Intrinsics.d(imVar.b, mqsVar)) {
                            imVar = null;
                        }
                        if (imVar != null) {
                            Iterator it2 = imVar.c.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((xl) next).c.equals(cvlVar)) {
                                        obj4 = next;
                                    }
                                }
                            }
                            xl xlVar = (xl) obj4;
                            if (xlVar == null) {
                                obj2 = Unit.a;
                            } else {
                                boolean z4 = xlVar.b;
                                fm fmVar = rmVar.c;
                                if (z4) {
                                    obj2 = ((e4t) fmVar.a.getValue()).c(mqsVar, cvlVar, this);
                                    if (obj2 != nm6.a) {
                                        obj2 = Unit.a;
                                    }
                                } else {
                                    obj2 = ((e4t) fmVar.a.getValue()).a(mqsVar, cvlVar, this);
                                    if (obj2 != nm6.a) {
                                        obj2 = Unit.a;
                                    }
                                }
                            }
                            if (obj2 == nm6Var3) {
                                break;
                            }
                        }
                    }
                    obj2 = Unit.a;
                    if (obj2 == nm6Var3) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    i9h i9hVar = (i9h) this.l;
                    pyc pycVar = (pyc) this.m;
                    ba0 ba0Var = (ba0) ((ia0) this.n).n;
                    this.k = 1;
                    if (pycVar.invoke(ba0Var, i9hVar, this) == nm6Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                ml7 ml7Var = (ml7) this.l;
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ?? r2 = (aur) this.m;
                    ca0 ca0Var = ((ja0) this.n).n;
                    this.l = null;
                    this.k = 1;
                    if (r2.invoke(ca0Var, ml7Var, this) == nm6Var5) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    j9h j9hVar = (j9h) this.l;
                    pyc pycVar2 = (pyc) this.m;
                    da0 da0Var = ((ka0) this.n).n;
                    this.k = 1;
                    if (pycVar2.invoke(da0Var, j9hVar, this) == nm6Var6) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    Pair pair = (Pair) this.l;
                    i9h i9hVar2 = (i9h) pair.a;
                    Object obj5 = pair.b;
                    ryc rycVar = (ryc) this.m;
                    ba0 ba0Var2 = (ba0) ((ia0) this.n).n;
                    this.k = 1;
                    if (rycVar.invoke(ba0Var2, i9hVar2, obj5, this) == nm6Var7) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                Pair pair2 = (Pair) this.l;
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ml7 ml7Var2 = (ml7) pair2.a;
                    Object obj6 = pair2.b;
                    ryc rycVar2 = (ryc) this.m;
                    ca0 ca0Var2 = ((ja0) this.n).n;
                    this.l = null;
                    this.k = 1;
                    if (rycVar2.invoke(ca0Var2, ml7Var2, obj6, this) == nm6Var8) {
                        break;
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    Pair pair3 = (Pair) this.l;
                    j9h j9hVar2 = (j9h) pair3.a;
                    Object obj7 = pair3.b;
                    ryc rycVar3 = (ryc) this.m;
                    da0 da0Var2 = ((ka0) this.n).n;
                    this.k = 1;
                    if (rycVar3.invoke(da0Var2, j9hVar2, obj7, this) == nm6Var9) {
                        break;
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    ua2 ua2Var = (ua2) this.l;
                    this.k = 1;
                    invoke = ua2Var.invoke(this);
                    if (invoke == nm6Var10) {
                        break;
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    invoke = obj;
                }
                rj6 rj6Var = (rj6) invoke;
                if (rj6Var != null) {
                    xb0 xb0Var = (xb0) this.m;
                    String str6 = (String) this.n;
                    if (rj6Var instanceof qj6) {
                        xb0Var.a.c.put(str6, ((r14) ((qj6) rj6Var).a).a);
                    } else if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        break;
                    }
                }
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ua2 ua2Var2 = (ua2) this.l;
                    this.k = 1;
                    invoke2 = ua2Var2.invoke(this);
                    if (invoke2 == nm6Var11) {
                        break;
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    invoke2 = obj;
                }
                rj6 rj6Var2 = (rj6) invoke2;
                if (rj6Var2 != null) {
                    xb0 xb0Var2 = (xb0) this.m;
                    String str7 = (String) this.n;
                    if (rj6Var2 instanceof qj6) {
                        xb0Var2.a.d.put(str7, ((b5j) ((qj6) rj6Var2).a).a);
                    } else if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        break;
                    }
                }
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    cs1 cs1Var = (cs1) this.l;
                    uvn uvnVar = (uvn) this.m;
                    this.k = 1;
                    invoke3 = cs1Var.invoke(uvnVar, this);
                    if (invoke3 == nm6Var12) {
                        break;
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    invoke3 = obj;
                }
                rj6 rj6Var3 = (rj6) invoke3;
                if (rj6Var3 != null) {
                    xb0 xb0Var3 = (xb0) this.n;
                    if (rj6Var3 instanceof qj6) {
                        rav ravVar = (rav) ((qj6) rj6Var3).a;
                        c62 c62Var = xb0Var3.a;
                        ArrayList arrayList = ravVar.a;
                        Set set = c62Var.b;
                        set.clear();
                        set.addAll(arrayList);
                    } else if (!(rj6Var3 instanceof pj6)) {
                        b6e.s();
                        break;
                    }
                }
                break;
            case 12:
                d8t d8tVar = (d8t) this.m;
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    jtm jtmVar = (jtm) this.l;
                    eno s0 = szf.s0(new sl0(d8tVar, 0));
                    tl0 tl0Var = new tl0(i3, jtmVar, d8tVar, (aqi) this.n);
                    this.k = 1;
                    if (s0.collect(tl0Var, this) == nm6Var13) {
                        break;
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 13:
                iv0 iv0Var = (iv0) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            qgg.h0(obj);
                            Assertions.throwOrSkip("AppUserCenter", new FailedAssertionException("No token", new IllegalStateException()));
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                        g = obj;
                    }
                } else {
                    qgg.h0(obj);
                    nur nurVar = iv0Var.d;
                    String str8 = ((yxc) this.n).a.a;
                    this.l = mm6Var;
                    this.k = 1;
                    g = nurVar.g(str8, this);
                    break;
                }
                String str9 = (String) g;
                if (str9 == null) {
                    this.l = null;
                    this.k = 2;
                    break;
                } else {
                    iv0Var.i(str9);
                    uzc uzcVar = iv0Var.e;
                    rar rarVar = (rar) uzcVar.f;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    uzcVar.f = ox6.B((eno) uzcVar.b, (tf6) uzcVar.d, new lot(i3, uzcVar));
                }
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        qgg.h0(obj);
                        break;
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    qgg.h0(obj);
                    pv0 pv0Var = (pv0) this.l;
                    Context context = (Context) this.m;
                    rkd rkdVar = (rkd) this.n;
                    this.k = 1;
                    pv0Var.getClass();
                    pv0.g(pv0Var, context, rkdVar, this);
                    break;
                }
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    int indexOf = ((ArrayList) this.l).indexOf((b81) this.m);
                    fvf fvfVar = (fvf) this.n;
                    this.k = 1;
                    apo apoVar = fvf.w;
                    if (fvfVar.f(indexOf, 0, this) == nm6Var16) {
                        break;
                    }
                } else if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 16:
                hh1 hh1Var = (hh1) this.m;
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    k21 k21Var = (k21) hh1Var.d.getValue();
                    String str10 = (String) this.n;
                    this.k = 1;
                    b = k21.b(k21Var, str10, true, this, 28);
                    break;
                } else if (i20 == 1) {
                    qgg.h0(obj);
                    b = obj;
                } else if (i20 == 2) {
                    i21 i21Var2 = (i21) this.l;
                    qgg.h0(obj);
                    i21Var = i21Var2;
                    b2 = obj;
                    a58 a58Var = (a58) b2;
                    if (a58Var != null && (str = a58Var.d) != null) {
                        str2 = (String) avf.Q(str);
                        i21Var.getClass();
                    }
                    str2 = null;
                    i21Var.getClass();
                } else if (i20 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i21 i21Var3 = (i21) this.l;
                    qgg.h0(obj);
                    i21Var = i21Var3;
                    V = obj;
                    vrc vrcVar = (vrc) V;
                    if (vrcVar != null && (str3 = vrcVar.a) != null) {
                        str2 = (String) avf.Q(str3);
                        i21Var.getClass();
                        break;
                    }
                    str2 = null;
                    i21Var.getClass();
                }
                rj6 rj6Var4 = (rj6) b;
                String str11 = (String) this.n;
                if (rj6Var4 instanceof qj6) {
                    i21Var = (i21) ((qj6) rj6Var4).a;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (((i4j) ((byb) qdcVar.C(I)).b(i4j.class)).h()) {
                        hs5 n = lxe.n((List) i21Var.a.t.getValue());
                        if (n != null) {
                            k68 k68Var = (k68) hh1Var.e.getValue();
                            this.l = i21Var;
                            this.k = 2;
                            b2 = k68Var.b(n, this);
                            break;
                        }
                        str2 = null;
                    } else {
                        if (((List) i21Var.a.s.getValue()).contains(h94.e)) {
                            k68 k68Var2 = (k68) hh1Var.e.getValue();
                            this.l = i21Var;
                            this.k = 3;
                            k68Var2.getClass();
                            V = x97.V(dm6.b, new j57(k68Var2, str11, (Continuation) r8, i), this);
                            break;
                        }
                        str2 = null;
                    }
                    i21Var.getClass();
                } else if (rj6Var4 instanceof pj6) {
                    break;
                } else {
                    b6e.s();
                    break;
                }
                break;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new la1((sdr) this.l, 2));
                    nn1 nn1Var = new nn1((aqi) this.m, (aqi) this.n, i3);
                    this.k = 1;
                    if (s02.collect(nn1Var, this) == nm6Var18) {
                        break;
                    }
                } else if (i21 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                int i22 = this.k;
                rn1 rn1Var = (rn1) this.l;
                aqi aqiVar = (aqi) this.m;
                aqi aqiVar2 = (aqi) this.n;
                List list = rn1Var.a;
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((dn1) it3.next()).a.a);
                }
                dfi.r("Attempted to access out-of-bounds artist. Index: " + i22 + ", artists: " + arrayList2 + ", current:" + aqiVar.getValue() + " previous: " + aqiVar2.getValue(), "ArtistsInfoBlockUi");
                break;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistConcertsDto>> a = ((go1) this.l).a.a((String) this.m, "no-cache", (String) this.n);
                    this.k = 1;
                    g2 = uwf.g(a, this);
                    if (g2 == nm6Var20) {
                        break;
                    }
                } else if (i23 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    g2 = obj;
                }
                rj6 rj6Var5 = (rj6) g2;
                if (rj6Var5 instanceof qj6) {
                    ArtistConcertsDto artistConcertsDto = (ArtistConcertsDto) ((qj6) rj6Var5).a;
                    String artistTitle = artistConcertsDto.getArtistTitle();
                    List<ConcertDto> concerts = artistConcertsDto.getConcerts();
                    if (concerts != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ConcertDto concertDto : concerts) {
                            us5 a2 = concertDto != null ? nu5.a(concertDto) : null;
                            if (a2 != null) {
                                arrayList3.add(a2);
                            }
                        }
                        c5bVar = arrayList3;
                    }
                    if (c5bVar == null) {
                        c5bVar = c5b.a;
                    }
                    break;
                } else if (rj6Var5 instanceof pj6) {
                    break;
                } else {
                    b6e.s();
                    break;
                }
            case 20:
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Object systemService = ((Context) this.m).getSystemService(CameraProperty.AUDIO);
                    systemService.getClass();
                    AudioManager audioManager = (AudioManager) systemService;
                    ew1 ew1Var = new ew1(linkedHashSet, ltmVar, (fw1) this.n);
                    audioManager.registerAudioDeviceCallback(ew1Var, null);
                    ap1 ap1Var = new ap1(i2, audioManager, ew1Var);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, ap1Var, this) == nm6Var21) {
                        break;
                    }
                } else if (i24 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    ob3 ob3Var = (ob3) this.m;
                    xdr xdrVar2 = ob3Var.C;
                    mt mtVar = (mt) this.n;
                    this.l = xdrVar2;
                    this.k = 1;
                    O = ob3Var.O(mtVar, this);
                    if (O == nm6Var22) {
                        break;
                    } else {
                        xdrVar = xdrVar2;
                    }
                } else if (i25 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    O = obj;
                }
                xdrVar.l(O);
                break;
            case 22:
                ph3 ph3Var = (ph3) this.l;
                nm6 nm6Var23 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    dc6 dc6Var = ph3Var.o;
                    nh3 nh3Var = new nh3(ph3Var, (f8j) this.m, (ha0) this.n);
                    this.k = 1;
                    dc6Var.getClass();
                    ynn ynnVar = (ynn) nh3Var.invoke();
                    if (ynnVar == null || dc6Var.U0(ynnVar, dc6Var.w)) {
                        obj3 = Unit.a;
                    } else {
                        zt3 zt3Var = new zt3(1, qxe.b(this));
                        zt3Var.s();
                        cc6 cc6Var = new cc6(nh3Var, zt3Var);
                        xzi xziVar = dc6Var.s;
                        eqi eqiVar = (eqi) xziVar.a;
                        ynn ynnVar2 = (ynn) nh3Var.invoke();
                        if (ynnVar2 == null) {
                            r7o r7oVar = z7o.b;
                            zt3Var.resumeWith(Unit.a);
                        } else {
                            zt3Var.u(new al(26, xziVar, cc6Var));
                            IntRange m = yhn.m(0, eqiVar.c);
                            int i27 = m.a;
                            int i28 = m.b;
                            if (i27 <= i28) {
                                while (true) {
                                    ynn ynnVar3 = (ynn) ((cc6) eqiVar.a[i28]).a.invoke();
                                    if (ynnVar3 != null) {
                                        ynn h = ynnVar2.h(ynnVar3);
                                        if (h.equals(ynnVar2)) {
                                            eqiVar.a(i28 + 1, cc6Var);
                                        } else if (!h.equals(ynnVar3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i29 = eqiVar.c - 1;
                                            if (i29 <= i28) {
                                                while (true) {
                                                    ((cc6) eqiVar.a[i28]).b.h(cancellationException);
                                                    if (i29 != i28) {
                                                        i29++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i28 != i27) {
                                        i28--;
                                    }
                                }
                            }
                            eqiVar.a(0, cc6Var);
                            if (!dc6Var.x) {
                                dc6Var.V0();
                            }
                        }
                        obj3 = zt3Var.q();
                        if (obj3 != nm6.a) {
                            obj3 = Unit.a;
                        }
                    }
                    if (obj3 == nm6Var23) {
                        break;
                    }
                } else if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 23:
                gs4 gs4Var = (gs4) this.n;
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            it = (Iterator) this.l;
                            rjcVar = (rjc) this.m;
                            qgg.h0(obj);
                            while (it.hasNext()) {
                                IndexedValue indexedValue = (IndexedValue) it.next();
                                this.m = rjcVar;
                                this.l = it;
                                this.k = 2;
                                if (rjcVar.emit(indexedValue, this) == nm6Var24) {
                                    break;
                                }
                            }
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        rjcVar = (rjc) this.m;
                        qgg.h0(obj);
                        G = obj;
                    }
                } else {
                    qgg.h0(obj);
                    rjcVar = (rjc) this.m;
                    x0 x0Var = (x0) gs4Var.a;
                    this.m = rjcVar;
                    this.k = 1;
                    G = x0Var.G(this);
                    break;
                }
                ((rar) gs4Var.d).start();
                it = ((List) G).iterator();
                while (it.hasNext()) {
                }
            case 24:
                String str12 = (String) this.l;
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        break;
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    qgg.h0(obj);
                    rus rusVar = ((pr3) this.m).e;
                    ArrayList arrayList4 = (ArrayList) this.n;
                    this.l = null;
                    this.k = 1;
                    Object e = rusVar.e(this, str12, arrayList4);
                    if (e == nm6Var25) {
                        break;
                    }
                }
                break;
            case 25:
                nm6 nm6Var26 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    pjq pjqVar = (pjq) this.l;
                    ((w2f) this.m).R(new m40(19, pjqVar));
                    rfg rfgVar = (rfg) this.n;
                    this.k = 1;
                    if (rfgVar.invoke(pjqVar, this) == nm6Var26) {
                        break;
                    }
                } else if (i32 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 26:
                nm6 nm6Var27 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    pjc[] pjcVarArr = (pjc[]) this.m;
                    f04 f04Var = new f04(pjcVarArr, 0);
                    l1 l1Var = new l1((Continuation) r8, (wgg) this.n, i);
                    this.l = null;
                    this.k = 1;
                    if (tt0.y(rjcVar2, l1Var, this, f04Var, pjcVarArr) == nm6Var27) {
                        break;
                    }
                } else if (i33 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 27:
                m54 m54Var = (m54) this.l;
                nm6 nm6Var28 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(szf.s0(new r93(12, m54Var)));
                    v24 v24Var = new v24(m54Var, (Function1) this.m, (aqi) this.n, (Continuation) null, 0);
                    this.k = 1;
                    if (zsd.O(b0, v24Var, this) == nm6Var28) {
                        break;
                    }
                } else if (i34 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l54 l54Var = (l54) this.l;
                nm6 nm6Var29 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    eno s03 = szf.s0(new r93(13, l54Var));
                    v24 v24Var2 = new v24(l54Var, (Function1) this.m, (aqi) this.n, (Continuation) null, 1);
                    this.k = 1;
                    if (zsd.O(s03, v24Var2, this) == nm6Var29) {
                        break;
                    }
                } else if (i35 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                f24 f24Var = (f24) this.m;
                p44 p44Var = (p44) this.l;
                nm6 nm6Var30 = nm6.a;
                int i36 = this.k;
                if (i36 != 0) {
                    if (i36 != 1) {
                        if (i36 == 2) {
                            qgg.h0(obj);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    String str13 = p44.e;
                    wb7 a3 = p44Var.d().a("collection_section_action_timestamps");
                    if (a3 == null) {
                        break;
                    } else {
                        ssg.a(3, p44.e, "register action(source=" + ((String) this.n) + ") for " + f24Var, null);
                        n44 n44Var = new n44(p44Var, f24Var, null);
                        this.k = 1;
                        break;
                    }
                }
                x0q x0qVar = p44Var.d;
                String name = f24Var.name();
                this.k = 2;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.m = l3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3(ja0 ja0Var, pyc pycVar, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.m = (aur) pycVar;
        this.n = ja0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(gs4 gs4Var, Continuation continuation) {
        super(2, continuation);
        this.j = 23;
        this.n = gs4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(pjc[] pjcVarArr, Continuation continuation, wgg wggVar) {
        super(2, continuation);
        this.j = 26;
        this.m = pjcVarArr;
        this.n = wggVar;
    }
}
