package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.t;
import com.yandex.media.ynison.service.e;
import com.yandex.media.ynison.service.f0;
import com.yandex.media.ynison.service.g0;
import com.yandex.music.shared.search.api.feedback.SearchFeedbackRequest;
import com.yandex.music.shared.wave.domain.commands.d;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.services.RoutineService;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public final class s1n extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1n(j2n j2nVar, r74 r74Var, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = j2nVar;
        this.m = r74Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                s1n s1nVar = new s1n((j2n) this.l, continuation, 0);
                s1nVar.m = obj;
                return s1nVar;
            case 1:
                return new s1n((j2n) this.l, (r74) this.m, continuation);
            case 2:
                return new s1n((j2n) this.l, continuation, 2);
            case 3:
                s1n s1nVar2 = new s1n((p7s) this.l, continuation, 3);
                s1nVar2.m = obj;
                return s1nVar2;
            case 4:
                return new s1n((cr) this.m, (String) this.l, continuation, 4);
            case 5:
                return new s1n((p4n) this.m, (zun) this.l, continuation, 5);
            case 6:
                return new s1n((p4n) this.m, (String) this.l, continuation, 6);
            case 7:
                return new s1n((b9n) this.l, continuation, 7);
            case 8:
                s1n s1nVar3 = new s1n((h7a) this.l, continuation, 8);
                s1nVar3.m = obj;
                return s1nVar3;
            case 9:
                return new s1n((kbn) this.m, (r2f) this.l, continuation, 9);
            case 10:
                return new s1n((kbn) this.m, (String) this.l, continuation, 10);
            case 11:
                return new s1n((ocn) this.m, (HashSet) this.l, continuation, 11);
            case 12:
                return new s1n((pjc) this.m, continuation, (x3n) this.l, 12);
            case 13:
                return new s1n((ljn) this.m, (d0o) this.l, continuation, 13);
            case 14:
                s1n s1nVar4 = new s1n((ojn) this.l, continuation, 14);
                s1nVar4.m = obj;
                return s1nVar4;
            case 15:
                s1n s1nVar5 = new s1n((iwe) this.l, continuation, 15);
                s1nVar5.m = obj;
                return s1nVar5;
            case 16:
                return new s1n((kqn) this.l, continuation, 16);
            case 17:
                return new s1n((kvn) this.m, (String) this.l, continuation, 17);
            case 18:
                s1n s1nVar6 = new s1n((Function2) this.l, continuation, 18);
                s1nVar6.m = obj;
                return s1nVar6;
            case 19:
                s1n s1nVar7 = new s1n(continuation, (t1o) this.l);
                s1nVar7.m = obj;
                return s1nVar7;
            case 20:
                return new s1n((pjc) this.m, continuation, (t1o) this.l, 20);
            case 21:
                s1n s1nVar8 = new s1n((ji0) this.l, continuation, 21);
                s1nVar8.m = obj;
                return s1nVar8;
            case 22:
                s1n s1nVar9 = new s1n((RoutineService) this.l, continuation, 22);
                s1nVar9.m = obj;
                return s1nVar9;
            case 23:
                s1n s1nVar10 = new s1n((hjj) this.l, continuation, 23);
                s1nVar10.m = obj;
                return s1nVar10;
            case 24:
                s1n s1nVar11 = new s1n((kuo) this.l, continuation, 24);
                s1nVar11.m = obj;
                return s1nVar11;
            case 25:
                return new s1n((mxo) this.m, (vp5) this.l, continuation, 25);
            case 26:
                return new s1n((f1p) this.m, (SearchFeedbackRequest) this.l, continuation, 26);
            case 27:
                return new s1n((m2p) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new s1n((e3p) this.l, continuation, 28);
            default:
                return new s1n((u0q) this.m, (fvf) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((s1n) create((how) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((s1n) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((s1n) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((s1n) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((s1n) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((s1n) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                ((s1n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0466, code lost:
    
        if (r0 != r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0413, code lost:
    
        if (r4 == r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06e1, code lost:
    
        if (r2.a(r0, r21) == r3) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06fe, code lost:
    
        if (r2.a(r0, r21) == r3) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0744, code lost:
    
        if (r0 == r2) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x072c, code lost:
    
        if (r3 == r2) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0873, code lost:
    
        if (r2 == r0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0856, code lost:
    
        if (r4 == r0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0831, code lost:
    
        if (r2 == r0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r0.emit(r3, r21) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0818, code lost:
    
        if (r4 == r0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r4 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x09f5, code lost:
    
        if (r3.a(r21, r0, (java.util.List) r4) == r2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x09dc, code lost:
    
        if (r4 == r2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
    
        if (r2.emit(r0, r21) == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        if (r0 == r4) goto L63;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        c74 c74Var;
        Object g0;
        Object g;
        Object a2;
        Object a3;
        fkg fkgVar;
        Object g02;
        Object V;
        List list;
        Object g03;
        Object V2;
        Object b;
        Object a4;
        Object obj2;
        ltm ltmVar;
        Object a5;
        f0 f0Var;
        Object b2;
        Object O;
        Object a6;
        k2p k2pVar;
        Object a7;
        k2p k2pVar2;
        a3p a3pVar;
        Object a8;
        a3p a3pVar2;
        int i = 12;
        int i2 = 10;
        int i3 = 8;
        int i4 = 0;
        int i5 = 6;
        int i6 = 2;
        int i7 = 3;
        int i8 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                how howVar = (how) this.m;
                nm6 nm6Var = nm6.a;
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
                j2n j2nVar = (j2n) this.l;
                this.m = null;
                this.k = 1;
                Object b3 = j2n.b(j2nVar, howVar, this);
                return b3 == nm6Var ? nm6Var : b3;
            case 1:
                r74 r74Var = (r74) this.m;
                j2n j2nVar2 = (j2n) this.l;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    mza mzaVar = (mza) j2nVar2.s.getValue();
                    String G = j2nVar2.b.G();
                    G.getClass();
                    nza nzaVar = new nza(G);
                    Context context = j2nVar2.a;
                    context.getClass();
                    vya vyaVar = new vya(i8, j2nVar2, r74Var);
                    this.k = 1;
                    a = mzaVar.a(nzaVar, (t) context, vyaVar, this);
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                if (!((Boolean) a).booleanValue()) {
                    s9f[] s9fVarArr = j2n.D;
                    j2nVar2.e(r74Var);
                }
                return Unit.a;
            case 2:
                j2n j2nVar3 = (j2n) this.l;
                nm6 nm6Var3 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    c74Var = (c74) j2nVar3.m.getValue();
                    xdr xdrVar = j2nVar3.h().n;
                    this.m = c74Var;
                    this.k = 1;
                    g0 = zsd.g0(xdrVar, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c74Var = (c74) this.m;
                    qgg.h0(obj);
                    g0 = obj;
                }
                s9f[] s9fVarArr2 = j2n.D;
                String str = j2nVar3.h().d().b;
                this.m = null;
                this.k = 2;
                break;
            case 3:
                jtm jtmVar = (jtm) this.m;
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar = new tqn();
                    tqnVar.a = true;
                    fkn fknVar = ((p7s) this.l).h;
                    pvj pvjVar = new pvj(jtmVar, tqnVar, continuation, i8);
                    this.m = null;
                    this.k = 1;
                    if (zsd.O(fknVar, pvjVar, this) == nm6Var4) {
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
                String str2 = (String) this.l;
                cr crVar = (cr) this.m;
                nm6 nm6Var5 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    c9k c9kVar = (c9k) ((jyr) crVar.i).getValue();
                    this.k = 1;
                    g = c9kVar.g(str2, this);
                    if (g == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                String str3 = (String) g;
                if (str3 != null) {
                    str2 = str3;
                }
                crVar.getClass();
                suh suhVar = new suh(crVar, str2, i);
                HandlerThread handlerThread = new HandlerThread("clear cookies");
                handlerThread.start();
                new Handler(handlerThread.getLooper()).post(new gtm(i5, new Handler(Looper.getMainLooper()), handlerThread, suhVar));
                return Unit.a;
            case 5:
                zun zunVar = (zun) this.l;
                p4n p4nVar = (p4n) this.m;
                nm6 nm6Var6 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    n9k n9kVar = (n9k) p4nVar.c.getValue();
                    this.k = 1;
                    a2 = n9kVar.a(zunVar, this);
                    if (a2 == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                if (!((Boolean) a2).booleanValue()) {
                    fsr b4 = ((srr) p4nVar.d.getValue()).b();
                    Map d = zunVar.d();
                    d.getClass();
                    b4.c(d);
                }
                return Unit.a;
            case 6:
                p4n p4nVar2 = (p4n) this.m;
                nm6 nm6Var7 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    x4n x4nVar = p4nVar2.b;
                    String str4 = (String) this.l;
                    this.k = 1;
                    a3 = x4nVar.a(ConstantDeviceInfo.APP_PLATFORM, str4, this);
                    if (a3 == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                rj6 rj6Var = (rj6) a3;
                u4n u4nVar = p4nVar2.a;
                rj6Var.getClass();
                u4nVar.a(rj6Var instanceof qj6);
                return Unit.a;
            case 7:
                b9n b9nVar = (b9n) this.l;
                nm6 nm6Var8 = nm6.a;
                int i16 = this.k;
                Continuation continuation2 = null;
                if (i16 == 0) {
                    qgg.h0(obj);
                    fkgVar = b9nVar.d;
                    pjc g2 = b9nVar.c.g();
                    this.m = fkgVar;
                    this.k = 1;
                    g02 = zsd.g0(g2, this);
                    break;
                } else if (i16 == 1) {
                    fkgVar = (fkg) this.m;
                    qgg.h0(obj);
                    g02 = obj;
                } else if (i16 == 2) {
                    qgg.h0(obj);
                    V = obj;
                    if (((List) V).isEmpty()) {
                        V = null;
                    }
                    list = (List) V;
                    if (list == null) {
                        return c5b.a;
                    }
                    pjc g3 = b9nVar.c.g();
                    this.m = list;
                    this.k = 3;
                    g03 = zsd.g0(g3, this);
                    break;
                } else {
                    if (i16 != 3) {
                        if (i16 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V2 = obj;
                        return (List) V2;
                    }
                    list = (List) this.m;
                    qgg.h0(obj);
                    g03 = obj;
                    List list2 = list;
                    String str5 = ((xxq) g03).a;
                    str5.getClass();
                    mn7 mn7Var = dm6.a;
                    z8n z8nVar = new z8n(b9nVar, str5, list2, continuation2, 1);
                    this.m = null;
                    this.k = 4;
                    V2 = x97.V(mn7Var, z8nVar, this);
                    break;
                }
                String str6 = ((xxq) g02).a;
                this.m = null;
                this.k = 2;
                fkgVar.getClass();
                V = x97.V(dm6.b, new yjg(fkgVar, str6, continuation2, i7), this);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.m;
                    h7a h7aVar = (h7a) this.l;
                    x1n x1nVar = new x1n(rjcVar, i);
                    this.m = null;
                    this.k = 1;
                    if (h7aVar.collect(x1nVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    h0m h0mVar = new h0m(((kbn) this.m).c.a.c, 22);
                    this.k = 1;
                    if (zsd.g0(h0mVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r2f r2fVar = (r2f) this.l;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                return Unit.a;
            case 10:
                kbn kbnVar = (kbn) this.m;
                nm6 nm6Var11 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    b = kbnVar.b(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a4 = obj;
                        k5r.v("restoreQueue  startLastQueue isSuccess=", ((Boolean) a4).booleanValue(), 4, "QueueRestoreFacade", null);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                if (!((Boolean) b).booleanValue()) {
                    return Unit.a;
                }
                String str7 = (String) this.l;
                this.k = 2;
                a4 = kbn.a(kbnVar, str7, this);
                break;
            case 11:
                HashSet hashSet = (HashSet) this.l;
                ocn ocnVar = (ocn) this.m;
                nm6 nm6Var12 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 != 1 && i20 != 2) {
                        if (i20 == 3) {
                            qgg.h0(obj);
                            g3t g3tVar = ocnVar.a;
                            this.k = 4;
                            break;
                        } else if (i20 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                qgg.h0(obj);
                ocnVar.e.a.a().getClass();
                g3t g3tVar2 = ocnVar.a;
                this.k = 1;
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.m;
                    fr4 fr4Var = new fr4(continuation, (x3n) this.l, i2);
                    this.k = 1;
                    if (zsd.O(pjcVar, fr4Var, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ljn ljnVar = (ljn) this.m;
                    q02 q02Var = ljnVar.a;
                    xum xumVar = new xum(i5, ljnVar, (d0o) this.l);
                    this.k = 1;
                    Object a9 = q02Var.a(xumVar, this);
                    if (a9 == nm6Var14) {
                        return nm6Var14;
                    }
                    obj2 = a9;
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = ((z7o) obj).a;
                }
                return new z7o(obj2);
            case 14:
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var15 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    pjc f = ((ojn) this.l).a.f(mm6Var, false);
                    this.m = null;
                    this.k = 1;
                    if (zsd.N(f, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                ltm ltmVar2 = (ltm) this.m;
                nm6 nm6Var16 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "RecognizeAudioCenter", "starting recognition", null);
                    ((quk) ((iwe) this.l).c).getClass();
                    it0 it0Var = it0.a;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    it0Var.a("RECOGNITION_START", e5bVar);
                    tqn tqnVar2 = new tqn();
                    rar y = x97.y(ltmVar2, null, null, new c5l((iwe) this.l, tqnVar2, ltmVar2, (Continuation) null, 27), 3);
                    lni lniVar = (lni) ((jyr) ((iwe) this.l).b).getValue();
                    b6n b6nVar = new b6n(17, ltmVar2);
                    i50 i50Var = new i50(y, tqnVar2, (iwe) this.l, ltmVar2, 19);
                    lniVar.getClass();
                    ReentrantLock reentrantLock = lniVar.g;
                    reentrantLock.lock();
                    try {
                        if (lniVar.c != null) {
                            ssg.a(3, "MusicMatchRecognitionService", "already running", null);
                            reentrantLock.unlock();
                            ltmVar = ltmVar2;
                        } else {
                            lniVar.f = false;
                            j6e j6eVar = (j6e) lniVar.b.invoke();
                            yk3 yk3Var = new yk3(8);
                            lniVar.c = j6eVar;
                            lniVar.d = yk3Var;
                            reentrantLock.unlock();
                            os osVar = new os(b6nVar, lniVar, ltmVar2, yk3Var, j6eVar, i50Var, 2);
                            ltmVar = ltmVar2;
                            dae daeVar = new dae(28, lniVar, i50Var);
                            m2g m2gVar = new m2g(15, lniVar, i50Var);
                            ssg.a(3, "MusicMatchClient", "connecting to wss://ws.api.music.yandex.net/match/websocket", null);
                            b0o b0oVar = new b0o();
                            b0oVar.g("wss://ws.api.music.yandex.net/match/websocket");
                            r9t r9tVar = (r9t) j6eVar.a;
                            Map map = (Map) r9tVar.b.invoke();
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    b0oVar.a((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            j6eVar.b = r9tVar.a.d(b0oVar.b(), new jni(osVar, daeVar, m2gVar));
                        }
                        rln rlnVar = new rln(i6, y, (iwe) this.l);
                        this.m = null;
                        this.k = 1;
                        if (y7g.q(ltmVar, rlnVar, this) == nm6Var16) {
                            return nm6Var16;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                kqn kqnVar = (kqn) this.l;
                nm6 nm6Var17 = nm6.a;
                int i25 = this.k;
                try {
                    if (i25 == 0) {
                        qgg.h0(obj);
                        this.k = 1;
                        a5 = kqn.a(kqnVar, this);
                        break;
                    } else if (i25 == 1) {
                        qgg.h0(obj);
                        a5 = obj;
                    } else {
                        if (i25 != 2) {
                            if (i25 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            O = obj;
                            g0 g0Var = (g0) O;
                            ssg.a(3, kqn.c, "<-- response session=" + g0Var.j() + ", ynison=" + g0Var.g(), null);
                            long j = g0Var.j();
                            String g4 = g0Var.g();
                            g4.getClass();
                            String i26 = g0Var.i();
                            i26.getClass();
                            e h = g0Var.k() ? g0Var.h() : null;
                            return new fqn(new xpn(j, g4, i26, h != null ? new wpn(h.g(), h.h()) : null));
                        }
                        f0 f0Var2 = (f0) this.m;
                        qgg.h0(obj);
                        f0Var = f0Var2;
                        b2 = obj;
                        this.m = null;
                        this.k = 3;
                        O = ((dow) b2).O(f0Var, new s2i(), this);
                        break;
                    }
                    aqn aqnVar = (aqn) a5;
                    if (!Intrinsics.d(aqnVar, zpn.a)) {
                        if (aqnVar instanceof ypn) {
                            return new cqn(new bqn(((ypn) aqnVar).a));
                        }
                        b6e.s();
                        return null;
                    }
                    f0Var = (f0) f0.g().b();
                    ssg.a(3, kqn.c, "--> request session", null);
                    qqn qqnVar = kqnVar.a;
                    this.m = f0Var;
                    this.k = 2;
                    b2 = qqnVar.b(this);
                    if (b2 == nm6Var17) {
                        return nm6Var17;
                    }
                    this.m = null;
                    this.k = 3;
                    O = ((dow) b2).O(f0Var, new s2i(), this);
                } catch (tgr e) {
                    ssg.a(6, kqn.c, "<-- " + e, null);
                    return new dqn(e);
                }
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                kvn kvnVar = (kvn) this.m;
                String str8 = (String) this.l;
                this.k = 1;
                Object b5 = kvnVar.b(str8, this);
                return b5 == nm6Var18 ? nm6Var18 : b5;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.m;
                    Function2 function2 = (Function2) this.l;
                    this.k = 1;
                    if (function2.invoke(mm6Var2, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                t1o t1oVar = (t1o) this.l;
                Object obj3 = this.m;
                nm6 nm6Var20 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) obj3).booleanValue()) {
                        long longValue = q9w.a().longValue();
                        this.m = null;
                        this.k = 1;
                        if (y2x.o(longValue, this) == nm6Var20) {
                            return nm6Var20;
                        }
                    }
                    return Unit.a;
                }
                if (i29 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k9q.d.getClass();
                t1oVar.b.a(d.a.c(new s9p(t75.c(r9p.a))), a3t.a);
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.m;
                    s1n s1nVar = new s1n(null, (t1o) this.l);
                    this.k = 1;
                    if (zsd.O(pjcVar2, s1nVar, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var3 = (mm6) this.m;
                ji0 ji0Var = (ji0) this.l;
                x0q x0qVar = ji0Var.o.a;
                tek tekVar = new tek(23, ji0Var, mm6Var3);
                this.k = 1;
                x0qVar.collect(tekVar, this);
                return nm6Var22;
            case 22:
                RoutineService routineService = (RoutineService) this.l;
                mm6 mm6Var4 = (mm6) this.m;
                nm6 nm6Var23 = nm6.a;
                int i32 = this.k;
                try {
                    if (i32 == 0) {
                        qgg.h0(obj);
                        List a10 = RoutineService.a(routineService);
                        ArrayList arrayList = new ArrayList(v75.o(a10, 10));
                        Iterator it = a10.iterator();
                        while (it.hasNext()) {
                            arrayList.add(x97.p(mm6Var4, null, null, new g2l((dho) it.next(), continuation, 27), 3));
                        }
                        this.m = null;
                        this.k = 1;
                        if (ox6.v(arrayList, this) == nm6Var23) {
                            return nm6Var23;
                        }
                    } else {
                        if (i32 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    ssg.a(3, null, UgcLiveVideoData$UgcLiveStatus.FINISHED, null);
                    routineService.stopSelf();
                } catch (CancellationException e2) {
                    routineService.stopSelf();
                    throw e2;
                } catch (Exception e3) {
                    routineService.stopSelf();
                    ssg.a(5, null, "RoutineService error", e3);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar3 = (ltm) this.m;
                    AtomicReference atomicReference = new AtomicReference();
                    ((hjj) this.l).a(new j6e(ltmVar3, atomicReference));
                    b6n b6nVar2 = new b6n(26, atomicReference);
                    this.k = 1;
                    if (y7g.q(ltmVar3, b6nVar2, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var5 = (mm6) this.m;
                    f44 f44Var = ((kuo) this.l).a;
                    this.k = 1;
                    if (f44Var.invoke(mm6Var5, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                mxo mxoVar = (mxo) this.m;
                nm6 nm6Var26 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new oxo(i4, mxoVar));
                    qk qkVar = new qk((vp5) this.l, mxoVar, continuation, i3);
                    this.k = 1;
                    if (zsd.O(s0, qkVar, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    h1p h1pVar = ((f1p) this.m).a;
                    SearchFeedbackRequest searchFeedbackRequest = (SearchFeedbackRequest) this.l;
                    this.k = 1;
                    a6 = h1pVar.a(searchFeedbackRequest, this);
                    if (a6 == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i36 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a6 = obj;
                }
                rj6 rj6Var2 = (rj6) a6;
                if (!(rj6Var2 instanceof qj6)) {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, "Search:FeedbackReporter", "Feedback request failed", ((pj6) rj6Var2).a());
                }
                return Unit.a;
            case 27:
                m2p m2pVar = (m2p) this.l;
                j0q j0qVar = m2pVar.i;
                xdr xdrVar2 = m2pVar.j;
                nm6 nm6Var28 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    if (((z66) m2pVar.g.getValue()).g()) {
                        k2pVar = (k2p) xdrVar2.getValue();
                        h2p h2pVar = new h2p(((o8q) m2pVar.f.getValue()).a.c(R.string.empty_own_search_history));
                        xdrVar2.getClass();
                        xdrVar2.m(null, h2pVar);
                        e2p e2pVar = (e2p) m2pVar.h.getValue();
                        this.m = k2pVar;
                        this.k = 2;
                        a7 = e2pVar.a(this);
                        break;
                    } else {
                        String k0 = j66.k0();
                        this.k = 1;
                        break;
                    }
                    return nm6Var28;
                }
                if (i37 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i37 != 2) {
                    if (i37 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k2pVar2 = (k2p) this.m;
                    qgg.h0(obj);
                    xdrVar2.l(k2pVar2);
                    return Unit.a;
                }
                k2p k2pVar3 = (k2p) this.m;
                qgg.h0(obj);
                k2pVar = k2pVar3;
                a7 = obj;
                if (!((Boolean) a7).booleanValue()) {
                    String j0 = j66.j0();
                    this.m = k2pVar;
                    this.k = 3;
                    if (j0qVar.emit(j0, this) != nm6Var28) {
                        k2pVar2 = k2pVar;
                        xdrVar2.l(k2pVar2);
                    }
                    return nm6Var28;
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                e3p e3pVar = (e3p) this.l;
                nm6 nm6Var29 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar = e3pVar.p;
                    xdr xdrVar3 = e3pVar.m;
                    if (((z66) jyrVar.getValue()).g()) {
                        a3pVar = (a3p) xdrVar3.getValue();
                        w2p w2pVar = w2p.a;
                        xdrVar3.getClass();
                        xdrVar3.m(null, w2pVar);
                        vzo vzoVar = (vzo) e3pVar.o.getValue();
                        this.m = a3pVar;
                        this.k = 2;
                        a8 = vzoVar.a(this);
                        break;
                    } else {
                        j0q j0qVar2 = e3pVar.n;
                        String k02 = j66.k0();
                        this.k = 1;
                        break;
                    }
                    return nm6Var29;
                }
                if (i38 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i38 != 2) {
                    if (i38 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a3pVar2 = (a3p) this.m;
                    qgg.h0(obj);
                    e3pVar.m.l(a3pVar2);
                    return Unit.a;
                }
                a3pVar = (a3p) this.m;
                qgg.h0(obj);
                a8 = obj;
                if (!((Boolean) a8).booleanValue()) {
                    j0q j0qVar3 = e3pVar.n;
                    String j02 = j66.j0();
                    this.m = a3pVar;
                    this.k = 3;
                    if (j0qVar3.emit(j02, this) != nm6Var29) {
                        a3pVar2 = a3pVar;
                        e3pVar.m.l(a3pVar2);
                    }
                    return nm6Var29;
                }
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                int i39 = this.k;
                if (i39 == 0) {
                    qgg.h0(obj);
                    u0q u0qVar = (u0q) this.m;
                    o50 o50Var = new o50((fvf) this.l, i5);
                    this.k = 1;
                    if (u0qVar.collect(o50Var, this) == nm6Var30) {
                        return nm6Var30;
                    }
                } else {
                    if (i39 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1n(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1n(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1n(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1n(Continuation continuation, t1o t1oVar) {
        super(2, continuation);
        this.j = 19;
        this.l = t1oVar;
    }
}
