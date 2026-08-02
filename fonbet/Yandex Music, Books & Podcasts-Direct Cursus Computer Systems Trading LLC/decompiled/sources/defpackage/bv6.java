package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.disclaimers.net.DisclaimerApi;
import com.yandex.music.shared.disclaimers.net.DisclaimerDetailsDto;
import com.yandex.music.shared.disclaimers.net.EntityDisclaimersDto;
import com.yandex.music.shared.disclaimers.net.ForeignAgentDisclaimerDto;
import com.yandex.music.shared.disclaimers.net.ModalDisclaimerDto;
import com.yandex.pulse.metrics.o;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes4.dex */
public final class bv6 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv6(yc4 yc4Var, Continuation continuation, kv6 kv6Var) {
        super(2, continuation);
        this.j = 2;
        this.m = yc4Var;
        this.l = kv6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r8.k(r0, r7) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8 == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        mqs mqsVar = (mqs) this.l;
        Object obj2 = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Context context = (Context) this.m;
            Object[] objArr = {mqsVar.c};
            this.k = 1;
            Object V = x97.V(dm6.b(), new av7(context, R.string.track_removed, objArr, (Continuation) null), this);
            if (V != obj2) {
                V = Unit.a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                neg.A(dyr.e, null);
                qxr.a();
                return Unit.a;
            }
            qgg.h0(obj);
        }
        gs4 gs4Var = new gs4(27);
        this.k = 2;
    }

    private final Object l(Object obj) {
        ev7 ev7Var = (ev7) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            long j = ev7Var.b;
            this.k = 1;
            if (y2x.o(j, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        dn9 dn9Var = (dn9) this.l;
        ldi ldiVar = (ldi) dn9Var.d;
        md mdVar = ev7Var.a;
        z2a z2aVar = (z2a) dn9Var.c;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        ldiVar.b(mdVar, z2aVar, e5bVar);
        return Unit.a;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new bv6((zwf) this.m, (kv6) this.l, continuation, 0);
            case 1:
                bv6 bv6Var = new bv6((kv6) this.l, continuation, 1);
                bv6Var.m = obj;
                return bv6Var;
            case 2:
                return new bv6((yc4) this.m, continuation, (kv6) this.l);
            case 3:
                return new bv6((r2f) this.m, (kw6) this.l, continuation, 3);
            case 4:
                return new bv6((cz6) this.l, continuation, 4);
            case 5:
                bv6 bv6Var2 = new bv6((u07) this.l, continuation, 5);
                bv6Var2.m = obj;
                return bv6Var2;
            case 6:
                bv6 bv6Var3 = new bv6((i27) this.l, continuation, 6);
                bv6Var3.m = obj;
                return bv6Var3;
            case 7:
                return new bv6((h37) this.m, (List) this.l, continuation, 7);
            case 8:
                bv6 bv6Var4 = new bv6((l37) this.l, continuation, 8);
                bv6Var4.m = obj;
                return bv6Var4;
            case 9:
                bv6 bv6Var5 = new bv6((g47) this.l, continuation, 9);
                bv6Var5.m = obj;
                return bv6Var5;
            case 10:
                return new bv6((e57) this.m, (wle) this.l, continuation, 10);
            case 11:
                return new bv6((e57) this.m, (mgk) this.l, continuation, 11);
            case 12:
                return new bv6((e57) this.m, (String) this.l, continuation, 12);
            case 13:
                return new bv6((e57) this.m, (sqr) this.l, continuation, 13);
            case 14:
                return new bv6((y57) this.m, (String) this.l, continuation, 14);
            case 15:
                return new bv6((y57) this.m, (w7o) this.l, continuation, 15);
            case 16:
                return new bv6((y57) this.m, (BigDecimal) this.l, continuation, 16);
            case 17:
                return new bv6((ou7) this.m, (qne) this.l, continuation, 17);
            case 18:
                return new bv6((fe7) this.m, (dn9) this.l, continuation, 18);
            case 19:
                bv6 bv6Var6 = new bv6((ue7) this.l, continuation, 19);
                bv6Var6.m = obj;
                return bv6Var6;
            case 20:
                return new bv6((di7) this.m, (Activity) this.l, continuation, 20);
            case 21:
                bv6 bv6Var7 = new bv6((xn7) this.l, continuation, 21);
                bv6Var7.m = obj;
                return bv6Var7;
            case 22:
                return new bv6((es6) this.m, (gzk) this.l, continuation, 22);
            case 23:
                return new bv6((nq7) this.m, (b3l) this.l, continuation, 23);
            case 24:
                return new bv6((nq7) this.m, (k4d) this.l, continuation, 24);
            case 25:
                return new bv6((gs4) this.l, continuation, 25);
            case 26:
                bv6 bv6Var8 = new bv6((yu7) this.l, continuation, 26);
                bv6Var8.m = obj;
                return bv6Var8;
            case 27:
                return new bv6((Context) this.m, (mqs) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new bv6((ev7) this.m, (dn9) this.l, continuation, 28);
            default:
                return new bv6((le3) this.m, (String) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 3:
                ((bv6) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 26:
                ((bv6) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((bv6) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:484|(1:(1:(4:488|489|490|491)(2:492|493))(1:494))(2:505|(3:507|(1:509)(2:512|(3:514|(1:516)(1:518)|517)(2:519|520))|510)(2:521|522))|495|496|497|498|490|491) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (defpackage.gs4.g(r2, (java.util.List) r3, r25) == r0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0266, code lost:
    
        if (r3.emit(r0, r25) == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x023e, code lost:
    
        if (r3.emit(r2, r25) == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0254, code lost:
    
        if (r4 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0226, code lost:
    
        if (r8 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x030d, code lost:
    
        if (r0.emit(r3, r25) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02de, code lost:
    
        if (r3 == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0703, code lost:
    
        if (r0.emit(r3, r25) == r2) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x06e7, code lost:
    
        if (r3.emit(r9, r25) == r2) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0972, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0973, code lost:
    
        r25.m = r0;
        r25.k = 2;
        r2 = r2.T(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x097b, code lost:
    
        if (r2 != r3) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x095c, code lost:
    
        if (r4 == r3) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0a08, code lost:
    
        if (defpackage.y2x.o(500, r25) == r0) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x09e1, code lost:
    
        if (defpackage.saf.C(r3, r25) == r0) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006b, code lost:
    
        if (r0 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004c, code lost:
    
        if (r4 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        if (r0.emit(r3, r25) == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        if (defpackage.y2x.p(r3, r25) == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0162, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:534:0x09fc  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:475:0x0a08 -> B:467:0x0a0c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x015f -> B:77:0x0145). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oy6 oy6Var;
        Object V;
        zl2 zl2Var;
        Object V2;
        Object obj2;
        qe7 qe7Var;
        Object a;
        Object obj3;
        Object q;
        Object b;
        Object a2;
        gs4 gs4Var;
        Object j;
        Object V3;
        Object N;
        Object obj4;
        eci eciVar;
        String title;
        String reason;
        String title2;
        String text;
        String url;
        int i = this.j;
        int i2 = 6;
        int i3 = 4;
        Object obj5 = this.l;
        boolean z = true;
        r11 = null;
        vrc vrcVar = null;
        switch (i) {
            case 0:
                kv6 kv6Var = (kv6) obj5;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    zwf zwfVar = (zwf) this.m;
                    ExoPlayer k1 = kv6Var.k1();
                    xdr xdrVar = kv6Var.t;
                    this.k = 1;
                    if (zwfVar.g0(k1, xdrVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                kv6 kv6Var2 = (kv6) obj5;
                ltm ltmVar = (ltm) this.m;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    cv6 cv6Var = new cv6(ltmVar);
                    kv6Var2.j0(cv6Var);
                    aw5 aw5Var = new aw5(12, kv6Var2, cv6Var);
                    this.m = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, aw5Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    yc4 yc4Var = (yc4) this.m;
                    nz5 nz5Var = new nz5((Continuation) r11, (kv6) obj5, i3);
                    this.k = 1;
                    if (zsd.O(yc4Var, nz5Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                kw6 kw6Var = (kw6) obj5;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        qgg.h0(obj);
                        r2f r2fVar = (r2f) this.m;
                        if (r2fVar != null) {
                            this.k = 1;
                            break;
                        }
                    } else if (i7 == 1) {
                        qgg.h0(obj);
                    } else {
                        if (i7 == 2) {
                            qgg.h0(obj);
                            throw new fif();
                        }
                        if (i7 == 3) {
                            qgg.h0(obj);
                            kw6Var.c.h(0.0f);
                            this.k = 4;
                        } else {
                            if (i7 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            kw6Var.c.h(1.0f);
                            this.k = 3;
                            if (y2x.o(500L, this) == nm6Var4) {
                                return nm6Var4;
                            }
                            kw6Var.c.h(0.0f);
                            this.k = 4;
                            break;
                        }
                    }
                    kw6Var.c.h(1.0f);
                    if (!kw6Var.a) {
                        this.k = 2;
                        y2x.m(this);
                        return nm6Var4;
                    }
                    this.k = 3;
                    if (y2x.o(500L, this) == nm6Var4) {
                    }
                    kw6Var.c.h(0.0f);
                    this.k = 4;
                } catch (Throwable th) {
                    kw6Var.c.h(0.0f);
                    throw th;
                }
            case 4:
                cz6 cz6Var = (cz6) obj5;
                es6 es6Var = cz6Var.k;
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    cz6Var.p.m(vy6.b);
                    hz6 hz6Var = cz6Var.v;
                    if (hz6Var == null) {
                        Intrinsics.j("arguments");
                        throw null;
                    }
                    if (hz6Var instanceof fz6) {
                        fz6 fz6Var = (fz6) hz6Var;
                        oy6Var = new oy6(fz6Var.b, fz6Var.c);
                    } else {
                        if (!(hz6Var instanceof gz6)) {
                            b6e.s();
                            return null;
                        }
                        ffk ffkVar = ((gz6) hz6Var).a;
                        oy6Var = new oy6(ffkVar.e != null ? cz6Var.o.b(R.string.paymentsdk_prebuilt_family_pay_title) : wxf.O(ffkVar.b), mlr.L(4, ffkVar.c));
                    }
                    this.m = oy6Var;
                    this.k = 1;
                    es6Var.getClass();
                    dq7 dq7Var = ca8.a;
                    V = x97.V(mn7.d, new j57(es6Var, oy6Var, (Continuation) r11, 25), this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.m;
                        qgg.h0(obj);
                        Object T = obj;
                        cz6.a(cz6Var, (JSONObject) T);
                        qne.m(gut.V0(dq8.CVV), th.getMessage(), 2).y();
                        return Unit.a;
                    }
                    oy6Var = (oy6) this.m;
                    qgg.h0(obj);
                    V = obj;
                }
                oy6 oy6Var2 = oy6Var;
                cz6.a(cz6Var, (JSONObject) V);
                gut.V0(dq8.CVV).A(null).y();
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.m;
                u07 u07Var = (u07) obj5;
                bf bfVar = u07Var.o;
                if (bfVar == null) {
                    Intrinsics.j("actionFlowReceiver");
                    throw null;
                }
                x0q x0qVar = bfVar.a;
                gl glVar = new gl(27, mm6Var, u07Var);
                this.k = 1;
                x0qVar.collect(glVar, this);
                return nm6Var6;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var2 = (mm6) this.m;
                i27 i27Var = (i27) obj5;
                bf bfVar2 = i27Var.n;
                if (bfVar2 == null) {
                    Intrinsics.j("actionFlowReceiver");
                    throw null;
                }
                x0q x0qVar2 = bfVar2.a;
                gl glVar2 = new gl(28, mm6Var2, i27Var);
                this.k = 1;
                x0qVar2.collect(glVar2, this);
                return nm6Var7;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((h37) this.m).B.emit((List) obj5, this) == nm6Var8) {
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
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var3 = (mm6) this.m;
                l37 l37Var = (l37) obj5;
                bf bfVar3 = l37Var.k;
                if (bfVar3 == null) {
                    Intrinsics.j("actionFlowReceiver");
                    throw null;
                }
                x0q x0qVar3 = bfVar3.a;
                gl glVar3 = new gl(29, mm6Var3, l37Var);
                this.k = 1;
                x0qVar3.collect(glVar3, this);
                return nm6Var9;
            case 9:
                g47 g47Var = (g47) obj5;
                String str = g47Var.p;
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    w7o w7oVar = (w7o) this.m;
                    if (w7oVar instanceof s7o) {
                        g47.G(g47Var);
                    } else if (w7oVar instanceof u7o) {
                        List list = (List) ((u7o) w7oVar).a;
                        g47Var.u = list;
                        if (list.isEmpty()) {
                            g47.G(g47Var);
                            return Unit.a;
                        }
                        List list2 = g47Var.u;
                        if (str == null) {
                            list2 = null;
                        }
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((zl2) obj2).c.equals(str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            zl2Var = (zl2) obj2;
                        } else {
                            zl2Var = null;
                        }
                        if (zl2Var != null) {
                            g47Var.H(zl2Var.c);
                        } else {
                            vx6 vx6Var = g47Var.l;
                            boolean z2 = g47Var.E;
                            qc9 qc9Var = g47Var.B;
                            if (qc9Var == null) {
                                Intrinsics.j("parsingEnvironment");
                                throw null;
                            }
                            this.k = 1;
                            vx6Var.getClass();
                            dq7 dq7Var2 = ca8.a;
                            V2 = x97.V(mn7.d, new ak1(5, list, vx6Var, qc9Var, null, z2), this);
                            if (V2 == nm6Var10) {
                                return nm6Var10;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                V2 = obj;
                rv8 rv8Var = (rv8) V2;
                g47Var.z = true;
                Pair pair = new Pair("select_bank_screen_headerBackButtonVisible", PListParser.TAG_TRUE);
                zl2 zl2Var2 = (zl2) CollectionsKt.Z(g47Var.u);
                r11 = zl2Var2 != null ? zl2Var2.a : 0;
                g47Var.K(new w37(new hw8(rv8Var, u75.h(pair, new Pair("select_bank_screen_last_bank_name", r11 != 0 ? r11 : "")))));
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar4 = ((e57) this.m).Z;
                    z9h z9hVar = ((wle) obj5).s;
                    String obj6 = z9hVar != null ? z9hVar.toString() : null;
                    this.k = 1;
                    if (x0qVar4.emit(obj6, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                e57 e57Var = (e57) this.m;
                mgk mgkVar = (mgk) obj5;
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    e57Var.w = mgkVar;
                    x0q x0qVar5 = e57Var.x0;
                    this.k = 1;
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
                }
                x0q x0qVar6 = e57Var.w0;
                m47 m47Var = new m47(o8g.p(mgkVar.d()), mgkVar.f());
                this.k = 2;
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = ((e57) this.m).H;
                    eie eieVar = new eie((String) obj5);
                    this.k = 1;
                    if (zi3Var.m(eieVar, this) == nm6Var13) {
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
            case 13:
                e57 e57Var2 = (e57) this.m;
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    e57Var2.y = null;
                    x0q x0qVar7 = e57Var2.I;
                    qcp qcpVar = new qcp(((sqr) obj5).a);
                    this.k = 1;
                    if (x0qVar7.emit(qcpVar, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e57Var2.M();
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var2 = ((y57) this.m).A;
                    eie eieVar2 = new eie((String) obj5);
                    this.k = 1;
                    if (zi3Var2.m(eieVar2, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar8 = ((y57) this.m).H;
                    Object obj7 = ((u7o) ((w7o) obj5)).a;
                    this.k = 1;
                    if (x0qVar8.emit(obj7, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                y57 y57Var = (y57) this.m;
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    y57Var.w0 = null;
                    x0q x0qVar9 = y57Var.B;
                    qcp qcpVar2 = new qcp((BigDecimal) obj5);
                    this.k = 1;
                    if (x0qVar9.emit(qcpVar2, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                y57Var.S();
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    ou7 ou7Var = (ou7) this.m;
                    this.k = 1;
                    if (ou7Var.j0(this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((qne) obj5).a = null;
                return Unit.a;
            case 18:
                fe7 fe7Var = (fe7) this.m;
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    long j2 = fe7Var.c;
                    this.k = 1;
                    if (y2x.o(j2, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                dn9 dn9Var = (dn9) obj5;
                ldi ldiVar = (ldi) dn9Var.d;
                md mdVar = fe7Var.a;
                z2a z2aVar = (z2a) dn9Var.c;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                ldiVar.b(mdVar, z2aVar, e5bVar);
                return Unit.a;
            case 19:
                ue7 ue7Var = (ue7) obj5;
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    qe7 qe7Var2 = (qe7) this.m;
                    if (!((Boolean) ((fkn) ue7Var.c.c).a.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    xdr xdrVar2 = ue7Var.i;
                    this.m = qe7Var2;
                    this.k = 1;
                    xdrVar2.l(qe7Var2);
                    if (Unit.a == nm6Var20) {
                        return nm6Var20;
                    }
                    qe7Var = qe7Var2;
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qe7Var = (qe7) this.m;
                    qgg.h0(obj);
                }
                gag gagVar = ue7Var.d;
                imh imhVar = ue7Var.m;
                xdr xdrVar3 = gagVar.c;
                qe7Var.getClass();
                tk2 tk2Var = qe7Var.l;
                if (tk2Var != null) {
                    LinkedHashSet z0 = CollectionsKt.z0(((eag) xdrVar3.getValue()).o);
                    z0.add(tk2Var);
                    while (true) {
                        Object value = xdrVar3.getValue();
                        LinkedHashSet linkedHashSet = z0;
                        if (!xdrVar3.k(value, eag.a((eag) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashSet, null, null, 114687))) {
                            z0 = linkedHashSet;
                        }
                    }
                }
                cgg cggVar = qe7Var.m;
                if (cggVar != null) {
                    LinkedHashSet z02 = CollectionsKt.z0(((eag) xdrVar3.getValue()).p);
                    z02.add(cggVar);
                    while (true) {
                        Object value2 = xdrVar3.getValue();
                        LinkedHashSet linkedHashSet2 = z02;
                        if (!xdrVar3.k(value2, eag.a((eag) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashSet2, null, 98303))) {
                            z02 = linkedHashSet2;
                        }
                    }
                }
                if (imhVar != null) {
                    pi3 pi3Var = qe7Var.o;
                    if (pi3Var != null) {
                        LinkedHashMap q2 = uah.q(((eag) xdrVar3.getValue()).n);
                        q2.put(imhVar, pi3Var);
                        while (true) {
                            Object value3 = xdrVar3.getValue();
                            LinkedHashMap linkedHashMap = q2;
                            if (!xdrVar3.k(value3, eag.a((eag) value3, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, 122879))) {
                                q2 = linkedHashMap;
                            }
                        }
                    }
                    vcu vcuVar = qe7Var.c;
                    if (vcuVar != null) {
                        LinkedHashMap q3 = uah.q(((eag) xdrVar3.getValue()).m);
                        q3.put(imhVar, vcuVar);
                        while (true) {
                            Object value4 = xdrVar3.getValue();
                            LinkedHashMap linkedHashMap2 = q3;
                            if (!xdrVar3.k(value4, eag.a((eag) value4, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap2, null, null, null, null, 126975))) {
                                q3 = linkedHashMap2;
                            }
                        }
                    }
                }
                return Unit.a;
            case 20:
                di7 di7Var = (di7) this.m;
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    qh7 qh7Var = (qh7) di7Var.l.getValue();
                    String str2 = di7Var.k.a;
                    this.k = 1;
                    jyr jyrVar = qh7Var.a;
                    jyr jyrVar2 = qh7Var.b;
                    qkj b2 = ((k5m) jyrVar.getValue()).b();
                    if (str2 == null) {
                        str2 = ((mh7) jyrVar2.getValue()).a();
                    }
                    a = b2.a(new rkj(22, "music_deeplink_screen", null, str2, null, ((mh7) jyrVar2.getValue()).b()), this);
                    if (a == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                ukj ukjVar = (ukj) a;
                if (ukjVar instanceof tkj) {
                    bve bveVar = (bve) CollectionsKt.R(((tkj) ukjVar).a.b.values());
                    obj3 = bveVar != null ? new bi7(bveVar) : zh7.b;
                } else {
                    if (!(ukjVar instanceof skj)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, null, "error loading offers for DeeplinkPaymentScreen. reason = " + ((skj) ukjVar).a, null);
                    obj3 = zh7.a;
                }
                xdr xdrVar4 = di7Var.q;
                if (!di7Var.n.a()) {
                    boolean z3 = obj3 instanceof zh7;
                    ai7 ai7Var = ai7.a;
                    if (z3) {
                        Activity activity = (Activity) obj5;
                        ((yh7) di7Var.m.getValue()).getClass();
                        activity.getClass();
                        int i25 = TariffPaywallActivity.z;
                        activity.startActivity(dml.b(activity, new lik(vik.e, null, null)));
                        activity.finish();
                        obj3 = ai7Var;
                    } else if (!obj3.equals(ai7Var) && !(obj3 instanceof bi7)) {
                        b6e.s();
                        return null;
                    }
                }
                xdrVar4.getClass();
                xdrVar4.m(null, obj3);
                return Unit.a;
            case 21:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var22 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    co6 co6Var = op7.a;
                    this.m = rjcVar;
                    this.k = 1;
                    q = ((xn7) obj5).q(co6Var, this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    q = obj;
                }
                Bitmap bitmap = (Bitmap) q;
                ssg.a(4, "WidgetRecentlyManagerImpl", "[DefaultLibraryLoader] bitmap was loaded success = " + (bitmap != null), null);
                List c = t75.c(new wnv(bitmap, mnv.a));
                this.m = null;
                this.k = 2;
                break;
            case 22:
                nm6 nm6Var23 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((x0q) ((es6) this.m).b).emit((gzk) obj5, this) == nm6Var23) {
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
            case 23:
                b3l b3lVar = (b3l) obj5;
                nq7 nq7Var = (nq7) this.m;
                x0q x0qVar10 = nq7Var.s;
                q4d q4dVar = nq7Var.i;
                d5d d5dVar = nq7Var.r;
                nm6 nm6Var24 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    b5d b5dVar = nq7Var.l;
                    n5n a3 = q4dVar.a();
                    this.k = 1;
                    b = b5dVar.b(d5dVar, a3, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 == 3) {
                                qgg.h0(obj);
                                a2 = obj;
                                e5d e5dVar = (e5d) a2;
                                if (e5dVar != null) {
                                    Pair pair2 = new Pair(e5dVar, b3lVar);
                                    this.k = 4;
                                    break;
                                } else {
                                    ssg.a(3, "DefaultSharedGenerativePlaybackQueue", "stop station=" + d5dVar, null);
                                    nq7Var.o.V();
                                }
                                return Unit.a;
                            }
                            if (i28 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                rj6 rj6Var = (rj6) b;
                if (rj6Var instanceof qj6) {
                    Pair pair3 = new Pair(((qj6) rj6Var).a, b3lVar);
                    this.k = 2;
                    break;
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    j4d j4dVar = nq7Var.m;
                    String a4 = d5dVar.a();
                    q4dVar.a();
                    this.k = 3;
                    a2 = j4dVar.a(a4, this);
                    break;
                }
                return nm6Var24;
            case 24:
                k4d k4dVar = (k4d) obj5;
                nq7 nq7Var2 = (nq7) this.m;
                nm6 nm6Var25 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(nq7Var2.j.a(k4dVar.a), 1);
                    n71 n71Var = new n71(nq7Var2, k4dVar, (Continuation) r11, i2);
                    this.k = 1;
                    if (zsd.O(d0, n71Var, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var26 = nm6.a;
                int i30 = this.k;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (IllegalStateException unused) {
                    ssg.a(6, "LeftoverFeedbackReporter", "DB is closed while reporting leftover feedback", null);
                }
                if (i30 == 0) {
                    qgg.h0(obj);
                    gs4Var = (gs4) obj5;
                    sml smlVar = (sml) gs4Var.a;
                    this.m = gs4Var;
                    this.k = 1;
                    j = smlVar.j(this);
                    if (j == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gs4Var = (gs4) this.m;
                    qgg.h0(obj);
                    j = obj;
                }
                this.m = null;
                this.k = 2;
                break;
            case 26:
                rjc rjcVar2 = (rjc) this.m;
                nm6 nm6Var27 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        Unit unit = Unit.a;
                        this.m = rjcVar2;
                        this.k = 2;
                        break;
                    } else if (i31 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                qgg.h0(obj);
                long j3 = ((yu7) obj5).a;
                this.m = rjcVar2;
                this.k = 1;
                break;
            case 27:
                return k(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return l(obj);
            default:
                String str3 = (String) obj5;
                le3 le3Var = (le3) this.m;
                nm6 nm6Var28 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    e68 e68Var = (e68) le3Var.a;
                    if (e68Var != null) {
                        this.k = 1;
                        V3 = x97.V(dm6.b, new d68(e68Var, str3, r11, z ? 1 : 0), this);
                        break;
                    }
                    Call<MusicBackendResponse<EntityDisclaimersDto>> b3 = ((DisclaimerApi) ((jyr) le3Var.b).getValue()).b(str3);
                    this.k = 2;
                    N = swf.N(b3, this);
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        N = obj;
                        bii biiVar = (bii) N;
                        if (biiVar instanceof aii) {
                            EntityDisclaimersDto entityDisclaimersDto = (EntityDisclaimersDto) ((aii) biiVar).a;
                            entityDisclaimersDto.getClass();
                            ModalDisclaimerDto modal = entityDisclaimersDto.getModal();
                            if (modal == null || (reason = modal.getReason()) == null || (title2 = modal.getTitle()) == null) {
                                eciVar = null;
                            } else {
                                String description = modal.getDescription();
                                DisclaimerDetailsDto details = modal.getDetails();
                                eciVar = new eci(reason, title2, description, (details == null || (text = details.getText()) == null || (url = details.getUrl()) == null) ? null : new f58(text, url));
                            }
                            ForeignAgentDisclaimerDto foreignAgent = entityDisclaimersDto.getForeignAgent();
                            if (foreignAgent != null && (title = foreignAgent.getTitle()) != null) {
                                vrcVar = new vrc(title);
                            }
                            return new qj6(new z9b(eciVar, vrcVar));
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
                        int i33 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str4 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        obj4 = new kj6(i33, musicBackendInvocationError.getDetails(), str4, message == null ? "" : message, xhiVar.a);
                        return obj4;
                    }
                    qgg.h0(obj);
                    V3 = obj;
                }
                obj4 = (rj6) V3;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv6(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv6(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
