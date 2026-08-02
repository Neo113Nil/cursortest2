package defpackage;

import android.content.ClipData;
import androidx.fragment.app.y;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.shared.offline.recommender.proto.a;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.chat.SupportChatActivity;
import ru.yandex.music.services.RoutineService;

/* loaded from: classes4.dex */
public final class fpq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fpq(pyc pycVar, pqm pqmVar, lfm lfmVar, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        this.l = (aur) pycVar;
        this.m = pqmVar;
        this.n = lfmVar;
    }

    private final Object k(Object obj) {
        bjm bjmVar;
        AtomicReference atomicReference;
        x3n x3nVar = (x3n) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            u6q b = ((p5q) x3nVar.a).a.b();
            b7q b7qVar = b.n;
            euk eukVar = b.s;
            bdt I = hag.I(xol.class);
            qdc qdcVar = b7qVar.a;
            qdcVar.getClass();
            bjm bjmVar2 = new bjm(b7qVar, eukVar, new apo((xol) qdcVar.C(I), eukVar));
            ((AtomicReference) x3nVar.d).set(bjmVar2);
            try {
                xg xgVar = (xg) this.n;
                this.l = bjmVar2;
                this.k = 1;
                if (xgVar.invoke(bjmVar2, this) == nm6Var) {
                    return nm6Var;
                }
                bjmVar = bjmVar2;
            } catch (Throwable th) {
                th = th;
                bjmVar = bjmVar2;
                atomicReference = (AtomicReference) x3nVar.d;
                while (!atomicReference.compareAndSet(bjmVar, null) && atomicReference.get() == bjmVar) {
                }
                throw th;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bjmVar = (bjm) this.l;
            try {
                qgg.h0(obj);
            } catch (Throwable th2) {
                th = th2;
                atomicReference = (AtomicReference) x3nVar.d;
                while (!atomicReference.compareAndSet(bjmVar, null)) {
                }
                throw th;
            }
        }
        AtomicReference atomicReference2 = (AtomicReference) x3nVar.d;
        while (!atomicReference2.compareAndSet(bjmVar, null) && atomicReference2.get() == bjmVar) {
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            u21 u21Var = (u21) this.l;
            ygl yglVar = new ygl(null, (qzs) this.m, (tf6) this.n);
            this.k = 1;
            if (zsd.O(u21Var, yglVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        i8l i8lVar = (i8l) this.m;
        Long l = (Long) this.n;
        ltm ltmVar = (ltm) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "TrackPreHeatUtils", "onRangeBufferedFlow callbackFlow target=" + l + "ms, maxBuffer=50000ms", null);
            long max = Math.max(i8lVar.J0(), 0L);
            if (50000 + max < (l != null ? l.longValue() : 0L)) {
                StringBuilder sb = new StringBuilder("target position is too far from current position: current=");
                sb.append(max);
                sb.append("ms, target=");
                sb.append(l);
                v3w.m(sb, "ms, maxBuffer=50000ms", 5, "TrackPreHeatUtils", null);
            }
            tqn tqnVar = new tqn();
            szs szsVar = new szs(i8lVar, l, tqnVar, ltmVar);
            i8lVar.j0(szsVar);
            o(i8lVar, l, tqnVar, ltmVar);
            xes xesVar = new xes(6, i8lVar, szsVar);
            this.l = null;
            this.k = 1;
            if (y7g.q(ltmVar, xesVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(i8l i8lVar, Long l, tqn tqnVar, ltm ltmVar) {
        if (i8lVar.c() != 3) {
            return;
        }
        long max = Math.max(i8lVar.J0(), 0L);
        long t0 = i8lVar.t0();
        Long N = ywf.N(i8lVar);
        if (N != null) {
            long longValue = N.longValue();
            long min = Math.min(l != null ? l.longValue() : 0L, longValue);
            if ((min > max && (min > Math.min(max + 50000, longValue) || t0 < min)) || tqnVar.a) {
                return;
            }
            tqnVar.a = true;
            ((oc4) ltmVar).c(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v12, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fpq((gpq) this.l, (String) this.m, (String) this.n, continuation, 0);
            case 1:
                fpq fpqVar = new fpq((rpq) this.n, continuation, 1);
                fpqVar.m = obj;
                return fpqVar;
            case 2:
                return new fpq((stq) this.l, (hqi) this.m, (Function2) this.n, continuation);
            case 3:
                fpq fpqVar2 = new fpq((swq) this.n, continuation, 3);
                fpqVar2.m = obj;
                return fpqVar2;
            case 4:
                fpq fpqVar3 = new fpq((dyq) this.n, continuation, 4);
                fpqVar3.m = obj;
                return fpqVar3;
            case 5:
                return new fpq((ExoPlayer) this.l, (e0r) this.m, (bqi) this.n, continuation, 5);
            case 6:
                return new fpq((ExoPlayer) this.l, (e0r) this.m, (bqi) this.n, continuation, 6);
            case 7:
                fpq fpqVar4 = new fpq((CoroutineContext) this.m, (pjc) this.n, continuation, 7);
                fpqVar4.l = obj;
                return fpqVar4;
            case 8:
                return new fpq((String) this.m, (SupportChatActivity) this.l, (String) this.n, continuation);
            case 9:
                return new fpq((fk0) this.l, (Function1) this.m, (sur) this.n, continuation, 9);
            case 10:
                return new fpq((z2h) this.l, (u6k) this.m, (fvf) this.n, continuation, 10);
            case 11:
                return new fpq((sdr) this.l, (u6k) this.m, (x3h) this.n, continuation, 11);
            case 12:
                return new fpq((ixr) this.n, continuation, 12);
            case 13:
                return new fpq((aqi) this.l, (fvf) this.m, (aqi) this.n, continuation, 13);
            case 14:
                return new fpq((sdr) this.l, (fvf) this.m, (aqi) this.n, continuation, 14);
            case 15:
                return new fpq((q3s) this.l, (String) this.m, (z3s) this.n, continuation, 15);
            case 16:
                return new fpq((l4s) this.l, (zh5) this.m, (hn5) this.n, continuation, 16);
            case 17:
                return new fpq((pyc) this.l, (pqm) this.m, (lfm) this.n, continuation);
            case 18:
                fpq fpqVar5 = new fpq((r2f) this.m, (Function2) this.n, continuation);
                fpqVar5.l = obj;
                return fpqVar5;
            case 19:
                return new fpq((qbs) this.n, continuation, 19);
            case 20:
                fpq fpqVar6 = new fpq((Function2) this.m, (e7o) this.n, continuation, 20);
                fpqVar6.l = obj;
                return fpqVar6;
            case 21:
                return new fpq((cks) this.n, continuation, 21);
            case 22:
                fpq fpqVar7 = new fpq((String) this.m, this.k, (int[]) this.n, continuation);
                fpqVar7.l = obj;
                return fpqVar7;
            case 23:
                return new fpq((vx6) this.l, (pls) this.m, (ToggleCommand) this.n, continuation, 23);
            case 24:
                return new fpq((cvl) this.l, (uws) this.m, (Collection) this.n, continuation, 24);
            case 25:
                return new fpq((eca) this.m, (uws) this.n, continuation, 25);
            case 26:
                return new fpq((x3n) this.m, (xg) this.n, continuation, 26);
            case 27:
                return new fpq((u21) this.l, continuation, (qzs) this.m, (tf6) this.n);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                fpq fpqVar8 = new fpq((i8l) this.m, (Long) this.n, continuation, 28);
                fpqVar8.l = obj;
                return fpqVar8;
            default:
                return new fpq((l0t) this.l, (String) this.m, (psd) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((fpq) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((fpq) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((fpq) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((fpq) create((a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((fpq) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fpq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:143)(2:160|161))(4:162|(1:164)|149|150)|144|145|146|147|148|149|150) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025b, code lost:
    
        if (r0 == r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026b, code lost:
    
        if (r0 == r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x033a, code lost:
    
        defpackage.ssg.a(6, "TinyMlProgramStateStorage", "Failed to clean storage due to IO error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0330, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0334, code lost:
    
        defpackage.ssg.a(6, "TinyMlProgramStateStorage", "Failed to clean storage due to a security exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05f9, code lost:
    
        if (((defpackage.aur) r9).invoke(r1, r23) == r0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05ec, code lost:
    
        if (r2.j0(r23) == r0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0192, code lost:
    
        if (defpackage.x97.V(r3, r5, r23) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0862, code lost:
    
        if (r2 == r1) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0892, code lost:
    
        if (r2 == r1) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x08e3, code lost:
    
        if (r9.collect(r0, r23) == r1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x08f1, code lost:
    
        if (defpackage.x97.V(r0, r3, r23) == r1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0a0c, code lost:
    
        if (r0.emit(r2, r23) == r1) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x09ff, code lost:
    
        if (r2 == r1) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0b37, code lost:
    
        if (r0.emit(r2, r23) == r1) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0b2a, code lost:
    
        if (r2 == r1) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        if (r0 != r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if (r0 == r1) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r14v1, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v53, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [long] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r3v74, types: [mse] */
    /* JADX WARN: Type inference failed for: r9v15, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:420:0x092b -> B:413:0x092f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:440:0x098e -> B:433:0x0992). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object z;
        xdr xdrVar;
        Object iwqVar;
        Object a;
        Object b2;
        Object a2;
        androidx.fragment.app.o oVar;
        d51 d51Var;
        Object g0;
        RoutineService routineService;
        mm6 mm6Var;
        axf axfVar;
        obs obsVar;
        obs obsVar2;
        Object dp4Var;
        obs obsVar3;
        ?? r0;
        obs obsVar4;
        hes hesVar;
        ynn ynnVar;
        ?? r24;
        long j;
        float f;
        long j2;
        float f2;
        float f3;
        wof c;
        wof c2;
        wof c3;
        wof c4;
        Object Q;
        AtomicReference atomicReference;
        cks cksVar;
        qqi qqiVar;
        Object H;
        Object F;
        boolean booleanValue;
        Continuation continuation;
        Object a3;
        Object obj2;
        Object V;
        hca hcaVar;
        Object d;
        int i = this.j;
        int i2 = 7;
        int i3 = 4;
        int i4 = 6;
        int i5 = 3;
        boolean z2 = false;
        z2 = false;
        int i6 = 2;
        Object obj3 = this.n;
        int i7 = 1;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        ?? r114 = 0;
        Object obj4 = null;
        switch (i) {
            case 0:
                gpq gpqVar = (gpq) this.l;
                String str = (String) obj3;
                String str2 = (String) this.m;
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "Skeleton:List", "reloadWithDefaultTab: tabId=" + str2 + " blockId=" + str, null);
                    xdr xdrVar2 = gpqVar.l;
                    xdrVar2.getClass();
                    xdrVar2.m(null, apq.a);
                    this.k = 1;
                    if (gpqVar.V(str2, str, true, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    bvb bvbVar = ((rpq) obj3).a;
                    this.m = null;
                    this.l = rjcVar;
                    this.k = 1;
                    b = bvbVar.b(this);
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
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                    b = obj;
                }
                this.m = null;
                this.l = null;
                this.k = 2;
                break;
            case 2:
                stq stqVar = (stq) this.l;
                x6k x6kVar = stqVar.b;
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    x6kVar.setValue(Boolean.TRUE);
                    mqi mqiVar = stqVar.d;
                    fa0 fa0Var = stqVar.c;
                    this.k = 1;
                    mqiVar.getClass();
                    if (gld.Q(new ga3((hqi) this.m, mqiVar, (Function2) obj3, (Object) fa0Var, (Continuation) null), this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x6kVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 3:
                swq swqVar = (swq) obj3;
                zvq zvqVar = swqVar.m;
                mm6 mm6Var2 = (mm6) this.m;
                nm6 nm6Var4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = swqVar.x;
                    sfm sfmVar = swqVar.w;
                    boolean z3 = swqVar.o;
                    this.m = mm6Var2;
                    this.l = xdrVar3;
                    this.k = 1;
                    z = sfmVar.z(z3, zvqVar, this);
                    if (z == nm6Var4) {
                        return nm6Var4;
                    }
                    xdrVar = xdrVar3;
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    z = obj;
                }
                rj6 rj6Var = (rj6) z;
                if (rj6Var instanceof qj6) {
                    tmb tmbVar = swqVar.l;
                    pkb pkbVar = pkb.Audiobook;
                    String d2 = zvqVar.d();
                    qj6 qj6Var = (qj6) rj6Var;
                    ptq ptqVar = (ptq) qj6Var.a;
                    rmb.h(tmbVar.a(new lab(1, 1, ptqVar.b.size(), "slide", d2), null), 0, 3);
                    x97.y(mm6Var2, null, null, new rwq(swqVar, qj6Var, r113 == true ? 1 : 0, z2 ? 1 : 0), 3);
                    x97.y(mm6Var2, null, null, new n6p(swqVar, qj6Var, r112 == true ? 1 : 0, i4), 3);
                    x97.y(mm6Var2, null, null, new rwq(swqVar, qj6Var, r11 == true ? 1 : 0, i7), 3);
                    iwqVar = new kwq(ptqVar);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ((pj6) rj6Var).a().getClass();
                    iwqVar = new iwq();
                    CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, iwqVar);
                return Unit.a;
            case 4:
                rjc rjcVar2 = (rjc) this.m;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    u12 u12Var = ((dyq) obj3).b;
                    this.m = null;
                    this.l = rjcVar2;
                    this.k = 1;
                    a = ((nyq) ((wyq) u12Var.d.getValue()).b.getValue()).a(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar2 = (rjc) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                this.m = null;
                this.l = null;
                this.k = 2;
                break;
            case 5:
                e0r e0rVar = (e0r) this.m;
                ExoPlayer exoPlayer = (ExoPlayer) this.l;
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    if (exoPlayer.J0() < e0rVar.f) {
                    }
                    return Unit.a;
                }
                if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long J0 = exoPlayer.J0();
                bqi bqiVar = (bqi) obj3;
                long j3 = e0rVar.e;
                long j4 = e0rVar.f;
                if (J0 <= j4 && j3 <= J0) {
                    Float f4 = new Float(zwf.w(j4, J0, e0rVar.h));
                    xdr xdrVar4 = (xdr) bqiVar;
                    xdrVar4.getClass();
                    xdrVar4.m(null, f4);
                }
                if (exoPlayer.J0() < e0rVar.f || !exoPlayer.e()) {
                    return Unit.a;
                }
                long j5 = e0rVar.b;
                this.k = 1;
                if (y2x.o(j5, this) == nm6Var6) {
                    return nm6Var6;
                }
                long J02 = exoPlayer.J0();
                bqi bqiVar2 = (bqi) obj3;
                long j32 = e0rVar.e;
                long j42 = e0rVar.f;
                if (J02 <= j42) {
                    Float f42 = new Float(zwf.w(j42, J02, e0rVar.h));
                    xdr xdrVar42 = (xdr) bqiVar2;
                    xdrVar42.getClass();
                    xdrVar42.m(null, f42);
                }
                if (exoPlayer.J0() < e0rVar.f) {
                }
                return Unit.a;
            case 6:
                e0r e0rVar2 = (e0r) this.m;
                ExoPlayer exoPlayer2 = (ExoPlayer) this.l;
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    if (exoPlayer2.J0() < e0rVar2.f) {
                    }
                    return Unit.a;
                }
                if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long J03 = exoPlayer2.J0();
                bqi bqiVar3 = (bqi) obj3;
                long j6 = e0rVar2.e;
                long j7 = e0rVar2.f;
                if (J03 <= j7 && j6 <= J03) {
                    Float f5 = new Float(zwf.w(j7, J03, e0rVar2.h));
                    xdr xdrVar5 = (xdr) bqiVar3;
                    xdrVar5.getClass();
                    xdrVar5.m(null, f5);
                }
                if (exoPlayer2.J0() < e0rVar2.f || !exoPlayer2.e()) {
                    return Unit.a;
                }
                long j8 = e0rVar2.b;
                this.k = 1;
                if (y2x.o(j8, this) == nm6Var7) {
                    return nm6Var7;
                }
                long J032 = exoPlayer2.J0();
                bqi bqiVar32 = (bqi) obj3;
                long j62 = e0rVar2.e;
                long j72 = e0rVar2.f;
                if (J032 <= j72) {
                    Float f52 = new Float(zwf.w(j72, J032, e0rVar2.h));
                    xdr xdrVar52 = (xdr) bqiVar32;
                    xdrVar52.getClass();
                    xdrVar52.m(null, f52);
                }
                if (exoPlayer2.J0() < e0rVar2.f) {
                }
                return Unit.a;
            case 7:
                pjc pjcVar = (pjc) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) this.m;
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    jtm jtmVar = (jtm) this.l;
                    if (!Intrinsics.d(coroutineContext, g.a)) {
                        vjc vjcVar = new vjc(pjcVar, jtmVar, r114 == true ? 1 : 0, i7);
                        this.k = 2;
                        break;
                    } else {
                        iwb iwbVar = new iwb(jtmVar, 6);
                        this.k = 1;
                        break;
                    }
                } else {
                    if (i15 != 1 && i15 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                String str3 = (String) obj3;
                SupportChatActivity supportChatActivity = (SupportChatActivity) this.l;
                nm6 nm6Var9 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    String str4 = (String) this.m;
                    bx5 bx5Var = supportChatActivity.v;
                    if (str4 == null) {
                        Serializable serializableExtra = supportChatActivity.getIntent().getSerializableExtra("extra.entrypoint");
                        esr esrVar = serializableExtra instanceof esr ? (esr) serializableExtra : null;
                        if (esrVar != null) {
                            this.k = 2;
                            b2 = ((bsr) bx5Var.a.getValue()).b(new qh4(), esrVar, str3, this);
                            break;
                        } else {
                            return Unit.a;
                        }
                    } else {
                        this.k = 1;
                        a2 = ((bsr) bx5Var.a.getValue()).a(new nh4(str4), str3, this);
                        break;
                    }
                    return nm6Var9;
                }
                if (i16 == 1) {
                    qgg.h0(obj);
                    a2 = obj;
                    oVar = (androidx.fragment.app.o) a2;
                } else {
                    if (i16 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b2 = obj;
                    oVar = (androidx.fragment.app.o) b2;
                }
                y supportFragmentManager = supportChatActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.content_frame, oVar, null);
                aVar.k(true, true);
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    act S = weo.S(350, 0, lya.c, 2);
                    fk0 fk0Var = (fk0) this.l;
                    Float f6 = new Float(1.0f);
                    this.k = 1;
                    if (fk0.c(fk0Var, f6, S, null, this, 12) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((Function1) this.m).invoke((sur) obj3);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    if (((z2h) this.l) == z2h.a) {
                        eno s0 = szf.s0(new mub((u6k) this.m, 1));
                        o50 o50Var = new o50((fvf) obj3, i2);
                        this.k = 1;
                        if (s0.collect(o50Var, this) == nm6Var11) {
                            return nm6Var11;
                        }
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
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new a9q((sdr) this.l, 17));
                    jqp jqpVar = new jqp(12, (u6k) this.m, (x3h) obj3);
                    this.k = 1;
                    if (s02.collect(jqpVar, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    d51Var = d51.i;
                    eps epsVar = ((ixr) obj3).a;
                    RoutineService routineService2 = (RoutineService) epsVar.a;
                    pjc g = ((frt) epsVar.b).g();
                    this.l = d51Var;
                    this.m = routineService2;
                    this.k = 1;
                    g0 = zsd.g0(g, this);
                    if (g0 == nm6Var13) {
                        return nm6Var13;
                    }
                    routineService = routineService2;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RoutineService routineService3 = (RoutineService) this.m;
                    d51Var = (d51) this.l;
                    qgg.h0(obj);
                    routineService = routineService3;
                    g0 = obj;
                }
                xxq xxqVar = (xxq) g0;
                this.l = null;
                this.m = null;
                this.k = 2;
                d51Var.getClass();
                dq7 dq7Var = ca8.a;
                Object V2 = x97.V(mn7.d, new fmk(xxqVar, "SyncRoutine", routineService, 3600000L, null), this);
                return V2 == nm6Var13 ? nm6Var13 : V2;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    eno s03 = szf.s0(new ruf((aqi) this.l, (fvf) this.m));
                    oc ocVar = new oc((aqi) obj3, i4);
                    this.k = 1;
                    if (s03.collect(ocVar, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    eno s04 = szf.s0(new rln(28, (sdr) this.l, (fvf) this.m));
                    oc ocVar2 = new oc((aqi) obj3, i2);
                    this.k = 1;
                    if (s04.collect(ocVar2, this) == nm6Var15) {
                        return nm6Var15;
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
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a4 = ((q3s) this.l).a((String) this.m, (z3s) obj3, this);
                    return a4 == nm6Var16 ? nm6Var16 : a4;
                }
                if (i23 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object e = ((l4s) this.l).a.e((zh5) this.m, (hn5) obj3, false, null, this);
                    return e == nm6Var17 ? nm6Var17 : e;
                }
                if (i24 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    ?? r1 = (aur) this.l;
                    pqm pqmVar = (pqm) this.m;
                    enj enjVar = new enj(((lfm) obj3).c);
                    this.k = 1;
                    if (r1.invoke(pqmVar, enjVar, this) == nm6Var18) {
                        return nm6Var18;
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
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    mm6Var = (mm6) this.l;
                    r2f r2fVar = (r2f) this.m;
                    this.l = mm6Var;
                    this.k = 1;
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
                    mm6Var = (mm6) this.l;
                    qgg.h0(obj);
                }
                this.l = null;
                this.k = 2;
                break;
            case 19:
                qbs qbsVar = (qbs) obj3;
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    if (!qbsVar.i() || ((axfVar = qbsVar.d) != null && !((Boolean) axfVar.q.getValue()).booleanValue())) {
                        return Unit.a;
                    }
                    obsVar = !rds.b(qbsVar.k().b) ? new obs(qbsVar, i7) : null;
                    obsVar2 = (rds.b(qbsVar.k().b) || !qbsVar.h()) ? null : new obs(qbsVar, i6);
                    if (qbsVar.h()) {
                        kp4 kp4Var = qbsVar.h;
                        if (kp4Var != null) {
                            this.l = obsVar;
                            this.m = obsVar2;
                            this.k = 1;
                            ClipData primaryClip = ((ce0) kp4Var).a.a.getPrimaryClip();
                            dp4Var = primaryClip != null ? new dp4(primaryClip) : null;
                            if (dp4Var == nm6Var20) {
                                return nm6Var20;
                            }
                            obsVar3 = obsVar2;
                        }
                        r0 = false;
                        if (r0 != false) {
                            obsVar4 = new obs(qbsVar, i5);
                            obs obsVar5 = obsVar;
                            obs obsVar6 = obsVar2;
                            obs obsVar7 = rds.c(qbsVar.k().b) == qbsVar.k().a.b.length() ? new obs(qbsVar, i3) : null;
                            obs obsVar8 = (qbsVar.h() || !rds.b(qbsVar.k().b)) ? null : new obs(qbsVar, z2 ? 1 : 0);
                            hesVar = qbsVar.j;
                            if (hesVar != null) {
                                axf axfVar2 = qbsVar.d;
                                if (axfVar2 != null) {
                                    axf axfVar3 = axfVar2.p ? null : axfVar2;
                                    if (axfVar3 != null) {
                                        int d3 = qbsVar.b.d((int) (qbsVar.k().b >> 32));
                                        int d4 = qbsVar.b.d((int) (qbsVar.k().b & 4294967295L));
                                        axf axfVar4 = qbsVar.d;
                                        long S2 = (axfVar4 == null || (c4 = axfVar4.c()) == null) ? 0L : c4.S(qbsVar.j(true));
                                        axf axfVar5 = qbsVar.d;
                                        if (axfVar5 == null || (c3 = axfVar5.c()) == null) {
                                            r24 = ' ';
                                            j = 0;
                                        } else {
                                            r24 = ' ';
                                            j = c3.S(qbsVar.j(false));
                                        }
                                        axf axfVar6 = qbsVar.d;
                                        if (axfVar6 == null || (c2 = axfVar6.c()) == null) {
                                            f = 0.0f;
                                            j2 = 4294967295L;
                                            f2 = 0.0f;
                                        } else {
                                            f = 0.0f;
                                            j2 = 4294967295L;
                                            f2 = Float.intBitsToFloat((int) (c2.S((Float.floatToRawIntBits(0.0f) << r24) | (Float.floatToRawIntBits(axfVar3.d() != null ? r6.a.b.b(d3).b : 0.0f) & 4294967295L)) & 4294967295L));
                                        }
                                        axf axfVar7 = qbsVar.d;
                                        if (axfVar7 == null || (c = axfVar7.c()) == null) {
                                            f3 = f;
                                        } else {
                                            f3 = Float.intBitsToFloat((int) (c.S((Float.floatToRawIntBits(f) << r24) | (Float.floatToRawIntBits(axfVar3.d() != null ? r5.a.b.b(d4).b : f) & j2)) & j2));
                                        }
                                        int i28 = (int) (S2 >> r24);
                                        int i29 = (int) (j >> r24);
                                        ynnVar = new ynn(Math.min(Float.intBitsToFloat(i28), Float.intBitsToFloat(i29)), Math.min(f2, f3), Math.max(Float.intBitsToFloat(i28), Float.intBitsToFloat(i29)), (axfVar3.a.g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (S2 & j2)), Float.intBitsToFloat((int) (j & j2))));
                                        ((zi0) hesVar).a(ynnVar, obsVar5, obsVar4, obsVar6, obsVar7, obsVar8);
                                    }
                                }
                                ynnVar = ynn.e;
                                ((zi0) hesVar).a(ynnVar, obsVar5, obsVar4, obsVar6, obsVar7, obsVar8);
                            }
                            return Unit.a;
                        }
                    }
                    obsVar4 = null;
                    obs obsVar52 = obsVar;
                    obs obsVar62 = obsVar2;
                    if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                    }
                    if (qbsVar.h()) {
                    }
                    hesVar = qbsVar.j;
                    if (hesVar != null) {
                    }
                    return Unit.a;
                }
                if (i27 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obsVar3 = (obs) this.m;
                obsVar = (obs) this.l;
                qgg.h0(obj);
                dp4Var = obj;
                dp4 dp4Var2 = (dp4) dp4Var;
                if (dp4Var2 == null || !dp4Var2.a.getDescription().hasMimeType("text/*")) {
                    obsVar2 = obsVar3;
                    r0 = false;
                    if (r0 != false) {
                    }
                    obsVar4 = null;
                    obs obsVar522 = obsVar;
                    obs obsVar622 = obsVar2;
                    if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                    }
                    if (qbsVar.h()) {
                    }
                    hesVar = qbsVar.j;
                    if (hesVar != null) {
                    }
                    return Unit.a;
                }
                obsVar2 = obsVar3;
                r0 = true;
                if (r0 != false) {
                }
                obsVar4 = null;
                obs obsVar5222 = obsVar;
                obs obsVar6222 = obsVar2;
                if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                }
                if (qbsVar.h()) {
                }
                hesVar = qbsVar.j;
                if (hesVar != null) {
                }
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var3 = (mm6) this.l;
                    AtomicReference atomicReference2 = new AtomicReference(null);
                    inr inrVar = new inr((Function2) this.m, (e7o) obj3, mm6Var3, atomicReference2, (Continuation) null, 4);
                    this.l = atomicReference2;
                    this.k = 1;
                    Q = gld.Q(inrVar, this);
                    if (Q == nm6Var21) {
                        return nm6Var21;
                    }
                    atomicReference = atomicReference2;
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = (AtomicReference) this.l;
                    qgg.h0(obj);
                    Q = obj;
                }
                r2f r2fVar2 = (r2f) atomicReference.get();
                if (r2fVar2 != null) {
                    r2fVar2.g(null);
                }
                return Q;
            case 21:
                Object obj5 = nm6.a;
                int i31 = this.k;
                try {
                    if (i31 == 0) {
                        qgg.h0(obj);
                        cks cksVar2 = (cks) obj3;
                        qqi qqiVar2 = cksVar2.c;
                        this.l = qqiVar2;
                        this.m = cksVar2;
                        this.k = 1;
                        if (qqiVar2.a(this) != obj5) {
                            cksVar = cksVar2;
                            qqiVar = qqiVar2;
                        }
                        return obj5;
                    }
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cksVar = (cks) this.m;
                    qqiVar = (qqi) this.l;
                    qgg.h0(obj);
                    cksVar.b.delete();
                    z2 = true;
                    obj5 = Boolean.valueOf(z2);
                    return obj5;
                } finally {
                    qqiVar.b(null);
                }
            case 22:
                a aVar2 = (a) this.l;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                g3d m30toBuilder = aVar2.m30toBuilder();
                String str5 = (String) this.m;
                int i32 = this.k;
                int[] iArr = (int[]) obj3;
                dks dksVar = (dks) m30toBuilder;
                dksVar.d();
                a aVar3 = (a) dksVar.b;
                aVar3.getClass();
                str5.getClass();
                aVar3.a = str5;
                dksVar.d();
                ((a) dksVar.b).b = i32;
                long currentTimeMillis = System.currentTimeMillis();
                dksVar.d();
                ((a) dksVar.b).d = currentTimeMillis;
                dksVar.d();
                a aVar4 = (a) dksVar.b;
                aVar4.getClass();
                aVar4.c = o3d.emptyIntList();
                iArr.getClass();
                Iterable vz0Var = iArr.length == 0 ? c5b.a : new vz0(1, iArr);
                dksVar.d();
                a aVar5 = (a) dksVar.b;
                ?? r3 = aVar5.c;
                if (!((u8) r3).a) {
                    aVar5.c = o3d.mutableCopy((mse) r3);
                }
                c8.addAll(vz0Var, aVar5.c);
                return m30toBuilder.b();
            case 23:
                vx6 vx6Var = (vx6) this.l;
                f7l f7lVar = (f7l) vx6Var.b;
                nm6 nm6Var23 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "ToggleCommandsExecutor", "toggle", null);
                    if (!p6g.C((e6l) f7lVar.c.getValue()) && !p6g.C((e6l) f7lVar.d.getValue())) {
                        aem aemVar = ((pls) this.m).a;
                        boolean forSecondaryQueue = ((ToggleCommand) obj3).getForSecondaryQueue();
                        this.k = 2;
                        F = ixf.F(vx6Var, aemVar, forSecondaryQueue, this);
                        break;
                    } else {
                        this.k = 1;
                        H = q5g.H(this, vx6Var, false);
                        break;
                    }
                    return nm6Var23;
                }
                if (i33 == 1) {
                    qgg.h0(obj);
                    H = obj;
                    booleanValue = ((Boolean) H).booleanValue();
                } else {
                    if (i33 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    F = obj;
                    booleanValue = ((Boolean) F).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 24:
                Collection collection = (Collection) obj3;
                cvl cvlVar = (cvl) this.l;
                nm6 nm6Var24 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    if (rvf.G(cvlVar)) {
                        return Unit.a;
                    }
                    btl btlVar = ((uws) this.m).a;
                    Collection collection2 = collection;
                    ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new t2m(((mqs) it.next()).d(), null));
                    }
                    this.k = 1;
                    if (btlVar.l(cvlVar, arrayList, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                aoi.c().d(collection);
                return Unit.a;
            case 25:
                uws uwsVar = (uws) obj3;
                jyr jyrVar = uwsVar.g;
                nm6 nm6Var25 = nm6.a;
                int i35 = this.k;
                Continuation continuation2 = null;
                if (i35 == 0) {
                    qgg.h0(obj);
                    eca ecaVar = (eca) this.m;
                    hca hcaVar2 = ecaVar.b;
                    if (hcaVar2 == null) {
                        continuation = null;
                        ArrayList a5 = ecaVar.a();
                        this.l = null;
                        this.k = 3;
                        a3 = uws.a(uwsVar, a5, this);
                        break;
                    } else {
                        Collection a6 = hcaVar2.a();
                        this.l = hcaVar2;
                        this.k = 1;
                        if (hcaVar2 instanceof fca) {
                            V = uwsVar.b(((fca) hcaVar2).a, a6, this);
                            if (V != nm6Var25) {
                                V = Unit.a;
                            }
                            obj2 = null;
                        } else {
                            if (!(hcaVar2 instanceof gca)) {
                                b6e.s();
                                return null;
                            }
                            obj2 = null;
                            V = x97.V(dm6.b, new fpq(((gca) hcaVar2).a, uwsVar, a6, continuation2, 24), this);
                            if (V != nm6Var25) {
                                V = Unit.a;
                            }
                            if (V != nm6Var25) {
                                V = Unit.a;
                            }
                        }
                        if (V != nm6Var25) {
                            hcaVar = hcaVar2;
                            this.l = obj2;
                            this.k = 2;
                            if (!(hcaVar instanceof fca)) {
                            }
                        }
                    }
                    return nm6Var25;
                }
                if (i35 != 1) {
                    if (i35 != 2) {
                        if (i35 == 3) {
                            qgg.h0(obj);
                            a3 = obj;
                            continuation = null;
                            List list = (List) a3;
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!((mqs) it2.next()).Z) {
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
                                        }
                                    }
                                }
                            }
                            if (!list.isEmpty()) {
                                mn7 mn7Var = dm6.a;
                                ta2 ta2Var = new ta2(list, continuation);
                                this.l = continuation;
                                this.k = 4;
                                break;
                            }
                            return Unit.a;
                        }
                        if (i35 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                hcaVar = (hca) this.l;
                qgg.h0(obj);
                obj2 = null;
                this.l = obj2;
                this.k = 2;
                if (!(hcaVar instanceof fca)) {
                    d = ((wca) uwsVar.e.getValue()).d(new jca(((fca) hcaVar).a.a, ((zzp) jyrVar.getValue()).b()), this);
                    if (d != nm6Var25) {
                        d = Unit.a;
                        break;
                    }
                } else {
                    if (!(hcaVar instanceof gca)) {
                        b6e.s();
                        return null;
                    }
                    sga sgaVar = (sga) uwsVar.f.getValue();
                    cvl cvlVar2 = ((gca) hcaVar).a;
                    long b3 = ((zzp) jyrVar.getValue()).b();
                    drt drtVar = cvlVar2.c;
                    d = sgaVar.d(new fga(new uga(drtVar.a, drtVar.b, drtVar.c), cvlVar2.a, b3), this);
                    if (d != nm6Var25) {
                        d = Unit.a;
                        break;
                    }
                }
                break;
            case 26:
                return k(obj);
            case 27:
                return l(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return n(obj);
            default:
                nm6 nm6Var26 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object c5 = ((l0t) this.l).c((String) this.m, (psd) obj3, this);
                    return c5 == nm6Var26 ? nm6Var26 : c5;
                }
                if (i36 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpq(u21 u21Var, Continuation continuation, qzs qzsVar, tf6 tf6Var) {
        super(2, continuation);
        this.j = 27;
        this.l = u21Var;
        this.m = qzsVar;
        this.n = tf6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fpq(r2f r2fVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.m = r2fVar;
        this.n = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fpq(stq stqVar, hqi hqiVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.l = stqVar;
        this.m = hqiVar;
        this.n = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpq(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpq(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpq(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpq(String str, int i, int[] iArr, Continuation continuation) {
        super(2, continuation);
        this.j = 22;
        this.m = str;
        this.k = i;
        this.n = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpq(String str, SupportChatActivity supportChatActivity, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.m = str;
        this.l = supportChatActivity;
        this.n = str2;
    }
}
