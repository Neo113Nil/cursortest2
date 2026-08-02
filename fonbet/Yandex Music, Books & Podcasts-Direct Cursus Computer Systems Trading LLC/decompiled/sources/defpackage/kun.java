package defpackage;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.playback.api.commands.ReplayCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.exo.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class kun extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kun(zi3 zi3Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 27;
        this.m = zi3Var;
        this.n = (aur) function2;
    }

    private final Object k(Object obj) {
        mwk mwkVar;
        Long l;
        qvs b;
        Long l2;
        n5q n5qVar = (n5q) this.m;
        p5d p5dVar = (p5d) this.n;
        mwk mwkVar2 = p5dVar.a;
        Object obj2 = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            if (!gld.T(n5qVar.e)) {
                xq0.x("Failed requirement.");
                return null;
            }
            ssg.a(3, "SharedPlayerAdapter", "prepare() - " + p5dVar, null);
            n5qVar.g = null;
            n5qVar.f.getClass();
            n5qVar.f = new i5q(p5dVar);
            n5qVar.h = p5dVar.h;
            a7q a7qVar = n5qVar.a;
            float f = p5dVar.e.a;
            this.l = mwkVar2;
            this.k = 1;
            a7qVar.getClass();
            Object V = x97.V(mal.b(), new z6q(a7qVar, f, continuation, 0), this);
            if (V != obj2) {
                V = Unit.a;
            }
            if (V == obj2) {
                return obj2;
            }
            mwkVar = mwkVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mwkVar = (mwk) this.l;
            qgg.h0(obj);
        }
        if (Intrinsics.d(mwkVar2, h1b.e)) {
            ssg.a(7, "SharedPlayerAdapter", "cannot prepare Playable.NONE", null);
            return Unit.a;
        }
        knn knnVar = n5qVar.d;
        mwkVar.getClass();
        u3q u3qVar = p5dVar.f;
        u5q u5qVar = (u5q) knnVar.b;
        pre preVar = u5qVar.b;
        v2q v2qVar = (v2q) dag.p(mwkVar, new vm7(false, gut.R(u3qVar), (Function0) new o5q(u5qVar, 7)));
        long j = p5dVar.d;
        if (j > 0) {
            l2 = new Long(j);
        } else {
            if (!(p5dVar.g instanceof r0q) || (b = v2qVar.b()) == null) {
                l = null;
                x97.y(n5qVar.e, null, null, new lco(n5qVar, p5dVar, v2qVar, l, (Continuation) null, 10), 3);
                return Unit.a;
            }
            l2 = new Long(b.a);
        }
        l = l2;
        x97.y(n5qVar.e, null, null, new lco(n5qVar, p5dVar, v2qVar, l, (Continuation) null, 10), 3);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if (r2.b(r14) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        Collection b;
        Collection collection;
        y5q y5qVar = (y5q) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 2;
        if (i == 0) {
            qgg.h0(obj);
            xdr xdrVar = saa.a;
            q3t q3tVar = y5qVar.b;
            String str = (String) this.n;
            zvs zvsVar = str != null ? new zvs(str) : null;
            String a = q3tVar.n.a();
            a.getClass();
            j3t j3tVar = q3tVar.a;
            ssg.a(4, "TracksCacheDatabaseImpl", "markAllPermanent for user ".concat(a), null);
            i3t a2 = j3tVar.a.a(a);
            css cssVar = css.f;
            a2.getClass();
            cssVar.getClass();
            up6.F(a2.a, false, true, new gb2(cssVar, i2));
            yfx yfxVar = q3tVar.b;
            String str2 = ((frt) yfxVar.c).c().a;
            str2.getClass();
            ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "delete all for user ".concat(str2), null);
            up6.F(((w62) yfxVar.b).a(str2).a, false, true, new uv1(20));
            ArrayList c = j3tVar.c(a);
            ArrayList arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                zvs zvsVar2 = ((iss) it.next()).a;
                if (Intrinsics.d(zvsVar2, zvsVar)) {
                    zvsVar2 = null;
                }
                if (zvsVar2 != null) {
                    arrayList.add(zvsVar2);
                }
            }
            b = q3tVar.b(CollectionsKt.w0(CollectionsKt.z0(arrayList)));
            wca wcaVar = (wca) y5qVar.d.getValue();
            this.l = b;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                collection = (Collection) this.l;
                qgg.h0(obj);
                y5qVar.c(null, collection);
                return Unit.a;
            }
            Collection collection2 = (Collection) this.l;
            qgg.h0(obj);
            b = collection2;
        }
        sga sgaVar = (sga) y5qVar.e.getValue();
        this.l = b;
        this.k = 2;
        if (sgaVar.b(this) != nm6Var) {
            collection = b;
            y5qVar.c(null, collection);
            return Unit.a;
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r10 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r10 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        i6n i6nVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            j7q j7qVar = (j7q) this.m;
            i6nVar = j7qVar.b;
            frt frtVar = j7qVar.a;
            this.l = i6nVar;
            this.k = 1;
            obj = frtVar.f(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6nVar = (i6n) this.l;
            qgg.h0(obj);
        }
        i6n i6nVar2 = i6nVar;
        this.l = null;
        this.k = 2;
        i6nVar2.getClass();
        Object V = x97.V(dm6.b, new n71(i6nVar2, (xxq) obj, (i7q) this.n, (Continuation) null, 27), this);
        if (V != nm6Var) {
            V = Unit.a;
        }
    }

    private final Object o(Object obj) {
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            xqn i2 = hrg.i(obj);
            pjc pjcVar = (pjc) this.m;
            g2p g2pVar = new g2p(i2, mm6Var, (i1r) this.n, 1);
            this.l = null;
            this.k = 1;
            if (pjcVar.collect(g2pVar, this) == nm6Var) {
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

    /* JADX WARN: Type inference failed for: r1v19, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v12, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new kun((mun) this.l, (jun) this.m, (dn9) this.n, continuation, 0);
            case 1:
                return new kun((pjc) this.l, (aqi) this.m, (aqi) this.n, continuation, 1);
            case 2:
                return new kun((oxn) this.l, (aqi) this.m, (aqi) this.n, continuation, 2);
            case 3:
                return new kun((uol) this.l, (azn) this.m, (ReplayCommand) this.n, continuation, 3);
            case 4:
                return new kun((a) this.l, (nb7) this.m, (IOException) this.n, continuation, 4);
            case 5:
                return new kun((a) this.l, (nb7) this.m, (DoNotRetryException) this.n, continuation, 5);
            case 6:
                return new kun((a) this.l, (List) this.m, (nb7) this.n, continuation, 6);
            case 7:
                kun kunVar = new kun((uoi) this.m, (ii0) this.n, continuation, 7);
                kunVar.l = obj;
                return kunVar;
            case 8:
                kun kunVar2 = new kun((gm5) this.m, (Function2) this.n, continuation);
                kunVar2.l = obj;
                return kunVar2;
            case 9:
                kun kunVar3 = new kun((pjc) this.m, (eij) this.n, continuation, 9);
                kunVar3.l = obj;
                return kunVar3;
            case 10:
                kun kunVar4 = new kun((goa) this.m, (iyo) this.n, continuation, 10);
                kunVar4.l = obj;
                return kunVar4;
            case 11:
                kun kunVar5 = new kun((iyo) this.m, (Function2) this.n, continuation, 11);
                kunVar5.l = obj;
                return kunVar5;
            case 12:
                return new kun((uoi) this.l, (Function0) this.m, (yoc) this.n, continuation, 12);
            case 13:
                kun kunVar6 = new kun((a2p) this.m, (i1r) this.n, continuation, 13);
                kunVar6.l = obj;
                return kunVar6;
            case 14:
                kun kunVar7 = new kun((b6p) this.n, continuation, 14);
                kunVar7.m = obj;
                return kunVar7;
            case 15:
                return new kun((pdp) this.l, (String) this.m, (tx3) this.n, continuation, 15);
            case 16:
                kun kunVar8 = new kun((sdr) this.m, (fk0) this.n, continuation, 16);
                kunVar8.l = obj;
                return kunVar8;
            case 17:
                return new kun((List) this.m, (cr) this.n, continuation, 17);
            case 18:
                return new kun((eqp) this.l, (List) this.m, (fvf) this.n, continuation, 18);
            case 19:
                kun kunVar9 = new kun((ovp) this.n, continuation, 19);
                kunVar9.m = obj;
                return kunVar9;
            case 20:
                kun kunVar10 = new kun((yvp) this.n, continuation, 20);
                kunVar10.m = obj;
                return kunVar10;
            case 21:
                return new kun((yvp) this.l, (fyp) this.m, (Context) this.n, continuation, 21);
            case 22:
                return new kun((zwp) this.l, (owp) this.m, (File) this.n, continuation, 22);
            case 23:
                kun kunVar11 = new kun((pyc) this.m, (PlaybackCommand$QueueBound.Basic) this.n, continuation);
                kunVar11.l = obj;
                return kunVar11;
            case 24:
                return new kun((n5q) this.m, (p5d) this.n, continuation, 24);
            case 25:
                return new kun((y5q) this.m, (String) this.n, continuation, 25);
            case 26:
                return new kun((j7q) this.m, (i7q) this.n, continuation, 26);
            case 27:
                kun kunVar12 = new kun((zi3) this.m, (Function2) this.n, continuation);
                kunVar12.l = obj;
                return kunVar12;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                kun kunVar13 = new kun((pjc) this.m, (i1r) this.n, continuation, 28);
                kunVar13.l = obj;
                return kunVar13;
            default:
                kun kunVar14 = new kun((vtm) this.m, (Function1) this.n, continuation, 29);
                kunVar14.l = obj;
                return kunVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 13:
                ((kun) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 18:
                ((kun) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((kun) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0167, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0178, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0189, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019a, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ac, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01bd, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0220, code lost:
    
        if (r6.m.b((defpackage.fyp) r18.m, r6.k, (android.content.Context) r8, r4, r18) == r12) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0200, code lost:
    
        if (defpackage.x97.V(r0, r1, r18) == r12) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026c, code lost:
    
        if (r0.emit(r2, r18) == r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x025f, code lost:
    
        if (r2 == r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f3, code lost:
    
        if (r3.k(r0, r18) == r2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02da, code lost:
    
        if (r0 == r2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0385, code lost:
    
        if (r0 == r3) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r1.A(r4, r18) != r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0399, code lost:
    
        if (kotlin.Unit.a == r3) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06f7, code lost:
    
        if (r1 == r3) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04e1, code lost:
    
        r2 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04e5, code lost:
    
        if (r6 == (-1)) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04e8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04e9, code lost:
    
        if (r2 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04eb, code lost:
    
        r4 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04ef, code lost:
    
        r1 = new defpackage.hc0(r4, r7, r1.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
    
        if (r4 == r2) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0940  */
    /* JADX WARN: Type inference failed for: r2v115, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [mm6] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r8v17, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v34, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kdl kdlVar;
        Object b;
        gm5 gm5Var;
        Object invoke;
        gm5 gm5Var2;
        Throwable th;
        Throwable a;
        Object G;
        List split$default;
        Object obj2;
        Object obj3;
        r82 r82Var;
        Object gc0Var;
        w02 w02Var;
        z02 z02Var;
        List split$default2;
        Object obj4;
        Object obj5;
        t72 t72Var;
        List split$default3;
        List split$default4;
        Object obj6;
        Object obj7;
        String str;
        int i;
        eb2 eb2Var;
        Unit unit;
        Object i0;
        List list;
        btl btlVar;
        cvl cvlVar;
        Object p;
        Object b2;
        Object e;
        Object e2;
        Object e3;
        Object a2;
        Object f;
        Object e4;
        r2f r2fVar;
        Object O;
        r2f r2fVar2;
        int i2 = this.j;
        int i3 = 0;
        Object obj8 = this.n;
        int i4 = 1;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (mun.c((mun) this.l, (jun) this.m, (dn9) obj8, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    nn1 nn1Var = new nn1((aqi) this.m, (aqi) obj8, i4);
                    this.k = 1;
                    if (pjcVar.collect(nn1Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                aqi aqiVar = (aqi) obj8;
                oxn oxnVar = (oxn) this.l;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    long g = enj.g(((enj) ((aqi) this.m).getValue()).a, ((enj) oxnVar.c.invoke()).a);
                    long i8 = swf.i((((int) (((hqe) aqiVar.getValue()).a >> 32)) / 2.0f) + enj.e(g), (((int) (((hqe) aqiVar.getValue()).a & 4294967295L)) / 2.0f) + enj.f(g));
                    ayn aynVar = oxnVar.a;
                    Object obj9 = oxnVar.b;
                    this.k = 1;
                    if (aynVar.h(obj9, i8, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
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
                uol uolVar = (uol) this.l;
                int ordinal = ((ReplayCommand) obj8).getReason().ordinal();
                if (ordinal == 0) {
                    kdlVar = kdl.a;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    kdlVar = kdl.b;
                }
                this.k = 1;
                if (uolVar.j(kdlVar, this) == nm6Var4) {
                    return nm6Var4;
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a aVar = (a) this.l;
                nb7 nb7Var = (nb7) this.m;
                qco qcoVar = new qco((IOException) obj8);
                this.k = 1;
                Object c = a.c(aVar, nb7Var, qcoVar, this);
                return c == nm6Var5 ? nm6Var5 : c;
            case 5:
                nm6 nm6Var6 = nm6.a;
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
                a aVar2 = (a) this.l;
                nb7 nb7Var2 = (nb7) this.m;
                pco pcoVar = new pco((DoNotRetryException) obj8);
                this.k = 1;
                Object c2 = a.c(aVar2, nb7Var2, pcoVar, this);
                return c2 == nm6Var6 ? nm6Var6 : c2;
            case 6:
                a aVar3 = (a) this.l;
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    b = aVar3.h.b((List) this.m, (nb7) obj8, this);
                    if (b == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                zsj zsjVar = (zsj) b;
                Uri uri = zsjVar.a;
                long j = zsjVar.b;
                aVar3.p = uri;
                nb7 nb7Var3 = zsjVar.c;
                aVar3.j = nb7Var3;
                aVar3.k = nb7Var3;
                aVar3.i = 0L;
                aVar3.l = Long.valueOf(j);
                aVar3.m = true;
                if (zsjVar.e) {
                    aVar3.c = zsjVar.d;
                    Iterator it = aVar3.u.iterator();
                    while (it.hasNext()) {
                        yzm yzmVar = new yzm(aVar3, (t6t) it.next());
                        aVar3.c.q(yzmVar);
                        yzmVar.h(aVar3.c, nb7Var3, true);
                        yzmVar.C(aVar3.c, nb7Var3, true);
                    }
                    dpt dptVar = aVar3.f;
                    Uri uri2 = aVar3.o;
                    if (uri2 == null) {
                        Intrinsics.j("originalUri");
                        throw null;
                    }
                    dptVar.a(uri2, uri2);
                }
                nb7 nb7Var4 = aVar3.j;
                if (nb7Var4 == null) {
                    Intrinsics.j("dataSpec");
                    throw null;
                }
                String scheme = nb7Var4.a.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                if (!StringsKt.M(scheme, "file", false)) {
                    ssg.a(3, aVar3.v, "tryHedgeOpen opened hedgedResult=" + zsjVar, null);
                }
                nb7 nb7Var5 = aVar3.k;
                if (nb7Var5 != null) {
                    aVar3.x(j, nb7Var5);
                    return new Long(j);
                }
                Intrinsics.j("nextOpenDataSpec");
                throw null;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.l;
                x0q x0qVar = ((uoi) this.m).a;
                tek tekVar = new tek(22, (ii0) obj8, mm6Var);
                this.k = 1;
                x0qVar.collect(tekVar, this);
                return nm6Var8;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.l;
                    gm5Var = (gm5) this.m;
                    ?? r8 = (aur) obj8;
                    try {
                        r7o r7oVar = z7o.b;
                        this.l = gm5Var;
                        this.k = 1;
                        invoke = r8.invoke(mm6Var2, this);
                        if (invoke == nm6Var9) {
                            return nm6Var9;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gm5Var2 = gm5Var;
                        r7o r7oVar2 = z7o.b;
                        gm5Var = gm5Var2;
                        invoke = new t7o(th);
                        a = z7o.a(invoke);
                        if (a == null) {
                        }
                        return Unit.a;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gm5Var2 = (gm5) this.l;
                    try {
                        qgg.h0(obj);
                        gm5Var = gm5Var2;
                        invoke = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        r7o r7oVar22 = z7o.b;
                        gm5Var = gm5Var2;
                        invoke = new t7o(th);
                        a = z7o.a(invoke);
                        if (a == null) {
                        }
                        return Unit.a;
                    }
                }
                r7o r7oVar3 = z7o.b;
                a = z7o.a(invoke);
                if (a == null) {
                    gm5Var.U(invoke);
                } else {
                    gm5Var.m0(a);
                }
                return Unit.a;
            case 9:
                eij eijVar = (eij) obj8;
                wjj wjjVar = eijVar.a;
                nm6 nm6Var10 = nm6.a;
                ?? r2 = this.k;
                try {
                    if (r2 == 0) {
                        qgg.h0(obj);
                        mm6 mm6Var3 = (mm6) this.l;
                        pjc pjcVar2 = (pjc) this.m;
                        gfl gflVar = new gfl(25, eijVar);
                        this.l = mm6Var3;
                        this.k = 1;
                        r2 = mm6Var3;
                        if (pjcVar2.collect(gflVar, this) == nm6Var10) {
                            return nm6Var10;
                        }
                    } else {
                        if (r2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mm6 mm6Var4 = (mm6) this.l;
                        qgg.h0(obj);
                        r2 = mm6Var4;
                    }
                    if (!eijVar.b()) {
                        try {
                            wjjVar.onComplete();
                            ra8.b(eijVar);
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    if (th4 instanceof CancellationException) {
                        if (!eijVar.b()) {
                            try {
                                wjjVar.onComplete();
                            } finally {
                            }
                        }
                    } else if (!eijVar.d(th4)) {
                        q5g.E(th4, r2.getCoroutineContext());
                    }
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    hyo hyoVar = (hyo) this.l;
                    goa goaVar = (goa) this.m;
                    afg afgVar = new afg(29, hyoVar, (iyo) obj8);
                    this.k = 1;
                    if (goaVar.invoke(afgVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    rwo rwoVar = (rwo) this.l;
                    iyo iyoVar = (iyo) this.m;
                    iyoVar.j = rwoVar;
                    hyo hyoVar2 = iyoVar.k;
                    this.k = 1;
                    if (((Function2) obj8).invoke(hyoVar2, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = ((uoi) this.l).a;
                tek tekVar2 = new tek(24, (Function0) this.m, (yoc) obj8);
                this.k = 1;
                x0qVar2.collect(tekVar2, this);
                return nm6Var13;
            case 13:
                mm6 mm6Var5 = (mm6) this.l;
                nm6 nm6Var14 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqn i19 = hrg.i(obj);
                j0q j0qVar = ((a2p) this.m).e;
                g2p g2pVar = new g2p(i19, mm6Var5, (i1r) obj8, i3);
                this.l = null;
                this.k = 1;
                j0qVar.collect(g2pVar, this);
                return nm6Var14;
            case 14:
                jtm jtmVar = (jtm) this.m;
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    b6p b6pVar = (b6p) obj8;
                    c0p c0pVar = b6pVar.o;
                    if (c0pVar == null) {
                        Intrinsics.j("argSearchContext");
                        throw null;
                    }
                    this.m = null;
                    this.l = jtmVar;
                    this.k = 1;
                    G = b6p.G(b6pVar, c0pVar, this);
                    if (G == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jtmVar = (jtm) this.l;
                    qgg.h0(obj);
                    G = obj;
                }
                jtmVar.setValue(G);
                return Unit.a;
            case 15:
                Object obj10 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    gfp gfpVar = ((pdp) this.l).d;
                    this.k = 1;
                    Object a3 = lmm.a(gfpVar.b(), new ffp((String) this.m, gfpVar, (tx3) obj8, null), this);
                    if (a3 != obj10) {
                        a3 = Unit.a;
                    }
                    if (a3 == obj10) {
                        return obj10;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var6 = (mm6) this.l;
                    eno s0 = szf.s0(new sep((sdr) this.m, 1));
                    tep tepVar = new tep((fk0) obj8, mm6Var6, i3);
                    this.k = 1;
                    if (s0.collect(tepVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                List list2 = (List) this.m;
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        i0 = obj;
                        list2 = (List) i0;
                        list = list2;
                        if (list != null) {
                        }
                        return c5b.a;
                    }
                    if (i23 != 2 && i23 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) this.l;
                    qgg.h0(obj);
                    list = list2;
                    if (list != null) {
                        return list;
                    }
                    return c5b.a;
                }
                qgg.h0(obj);
                onh onhVar = (onh) CollectionsKt.firstOrNull(list2);
                if (onhVar != null) {
                    String str2 = onhVar.a;
                    cr crVar = (cr) obj8;
                    jnh jnhVar = onhVar.f;
                    jnhVar.getClass();
                    String str3 = jnhVar.b;
                    Uri uri3 = jnhVar.a;
                    str2.getClass();
                    if (str3 != null) {
                        kuh kuhVar = (kuh) crVar.e;
                        this.l = null;
                        this.k = 1;
                        i0 = kuhVar.a.i0(str3, onhVar, this);
                        break;
                    } else if (uri3 != null) {
                        this.l = list2;
                        this.k = 2;
                        break;
                    } else {
                        if (!str2.equals("")) {
                            iuh iuhVar = (iuh) crVar.d;
                            this.l = list2;
                            this.k = 3;
                            kc0 kc0Var = iuhVar.a;
                            kc0Var.a.a.a(str2);
                            n82 n82Var = (n82) kc0Var.b.getValue();
                            n82Var.getClass();
                            jyr jyrVar = n82Var.f;
                            jyr jyrVar2 = n82Var.e;
                            jyr jyrVar3 = n82Var.d;
                            jyr jyrVar4 = n82Var.c;
                            jyr jyrVar5 = n82Var.b;
                            jyr jyrVar6 = n82Var.g;
                            ((n42) jyrVar6.getValue()).getClass();
                            o42[] o42VarArr = o42.a;
                            if ("COLLECTION_FAVOURITE_PLAYLIST_PLAYABLE_MEDIA_ID".equals(str2)) {
                                y42 y42Var = (y42) ((n42) jyrVar6.getValue()).a.getValue();
                                y42Var.a().getClass();
                                String a4 = y42Var.a();
                                new nvl(a4, "3");
                                a4.getClass();
                                gc0Var = new gc0(new zc5(a4, "3"), false);
                            } else {
                                ((fb2) jyrVar5.getValue()).getClass();
                                if (c.v(str2, "track_playable_base_prefix_", false)) {
                                    ((fb2) jyrVar5.getValue()).getClass();
                                    split$default4 = StringsKt__StringsKt.split$default(str2, new String[]{StringUtil.SPACE}, false, 0, 6, null);
                                    List list3 = split$default4;
                                    Iterator it2 = list3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj6 = it2.next();
                                            if (c.v((String) obj6, "track_playable_base_prefix_", false)) {
                                            }
                                        } else {
                                            obj6 = null;
                                        }
                                    }
                                    String str4 = (String) obj6;
                                    Iterator it3 = list3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj7 = it3.next();
                                            if (c.v((String) obj7, "track_playable_content_id_", false)) {
                                            }
                                        } else {
                                            obj7 = null;
                                        }
                                    }
                                    String str5 = (String) obj7;
                                    if (str4 == null || str5 == null) {
                                        str = null;
                                        i = 2;
                                        su4.s(2, null, "track media id is corrupted", null);
                                        eb2Var = null;
                                    } else {
                                        String Y = StringsKt.Y(str4, "track_playable_base_prefix_");
                                        String Y2 = StringsKt.Y(str5, "track_playable_content_id_");
                                        eb2Var = new eb2(Y, Y2, ((Set) umh.a.getValue()).contains(Y2));
                                        str = null;
                                        i = 2;
                                    }
                                    if (eb2Var != null) {
                                        List list4 = (List) n82Var.a.a.get(eb2Var.b);
                                        if (list4 == null) {
                                            su4.s(i, str, "There are no tracks for such contentId", str);
                                            list4 = null;
                                        }
                                        if (list4 == null) {
                                            list4 = c5b.a;
                                        }
                                        Iterator it4 = list4.iterator();
                                        int i24 = 0;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                i24 = -1;
                                                break;
                                            } else {
                                                Object next = it4.next();
                                                if (i24 < 0) {
                                                    u75.n();
                                                    throw null;
                                                }
                                                if (Intrinsics.d(((mqs) next).a, eb2Var.a)) {
                                                    break;
                                                } else {
                                                    i24++;
                                                }
                                            }
                                        }
                                    }
                                    gc0Var = null;
                                } else {
                                    ((s82) jyrVar4.getValue()).getClass();
                                    if (c.v(str2, "playlist_playable_prefix_", false) || c.v(str2, "downloaded_playlist_playable_prefix_", false)) {
                                        ((s82) jyrVar4.getValue()).getClass();
                                        split$default = StringsKt__StringsKt.split$default(str2, new String[]{StringUtil.SPACE}, false, 0, 6, null);
                                        boolean v = c.v(str2, "downloaded_playlist_playable_prefix_", false);
                                        List list5 = split$default;
                                        Iterator it5 = list5.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                obj2 = it5.next();
                                                if (c.v((String) obj2, "uid_prefix_", false)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        String str6 = (String) obj2;
                                        Iterator it6 = list5.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj3 = it6.next();
                                                if (c.v((String) obj3, "kind_prefix", false)) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        String str7 = (String) obj3;
                                        if (str6 == null || str7 == null) {
                                            su4.s(2, null, "playlist media id is corrupted", null);
                                            r82Var = null;
                                        } else {
                                            r82Var = new r82(StringsKt.Y(str6, "uid_prefix_"), StringsKt.Y(str7, "kind_prefix"), v);
                                        }
                                        if (r82Var != null) {
                                            gc0Var = new gc0(new zc5(r82Var.a, r82Var.b), r82Var.c);
                                        }
                                        gc0Var = null;
                                    } else {
                                        ((x02) jyrVar3.getValue()).getClass();
                                        if (c.v(str2, "album_playable_prefix_", false) || c.v(str2, "downloaded_album_playable_prefix_", false)) {
                                            ((x02) jyrVar3.getValue()).getClass();
                                            boolean v2 = c.v(str2, "downloaded_album_playable_prefix_", false);
                                            String Y3 = StringsKt.Y(str2, v2 ? "downloaded_album_playable_prefix_" : "album_playable_prefix_");
                                            if (Y3.equals(str2) || Y3.length() == 0) {
                                                su4.s(2, null, "album media id is corrupted", null);
                                                w02Var = null;
                                            } else {
                                                w02Var = new w02(Y3, v2);
                                            }
                                            if (w02Var != null) {
                                                gc0Var = new ec0(new xc5(w02Var.a), w02Var.b);
                                            }
                                            gc0Var = null;
                                        } else {
                                            ((a12) jyrVar2.getValue()).getClass();
                                            if (c.v(str2, "artist_playable_prefix_", false) || c.v(str2, "downloaded_artist_playable_prefix_", false)) {
                                                ((a12) jyrVar2.getValue()).getClass();
                                                boolean v3 = c.v(str2, "downloaded_artist_playable_prefix_", false);
                                                String Y4 = StringsKt.Y(str2, v3 ? "downloaded_artist_playable_prefix_" : "artist_playable_prefix_");
                                                if (Y4.equals(str2) || Y4.length() == 0) {
                                                    su4.s(2, null, "artist media id is corrupted", null);
                                                    z02Var = null;
                                                } else {
                                                    z02Var = new z02(Y4, v3);
                                                }
                                                if (z02Var != null) {
                                                    gc0Var = new fc0(new yc5(z02Var.a), z02Var.b);
                                                }
                                                gc0Var = null;
                                            } else {
                                                ((u72) jyrVar.getValue()).getClass();
                                                if (c.v(str2, str2, false)) {
                                                    ((u72) jyrVar.getValue()).getClass();
                                                    split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{StringUtil.SPACE}, false, 0, 6, null);
                                                    List list6 = split$default2;
                                                    Iterator it7 = list6.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            obj4 = it7.next();
                                                            if (c.v((String) obj4, "my_vibe_prefix_", false)) {
                                                            }
                                                        } else {
                                                            obj4 = null;
                                                        }
                                                    }
                                                    String str8 = (String) obj4;
                                                    Iterator it8 = list6.iterator();
                                                    while (true) {
                                                        if (it8.hasNext()) {
                                                            obj5 = it8.next();
                                                            if (c.v((String) obj5, "my_vibe_seeds_prefix_", false)) {
                                                            }
                                                        } else {
                                                            obj5 = null;
                                                        }
                                                    }
                                                    String str9 = (String) obj5;
                                                    if (str8 == null || str9 == null) {
                                                        su4.s(2, null, "my vibe media id is corrupted", null);
                                                        t72Var = null;
                                                    } else {
                                                        String Y5 = StringsKt.Y(str8, "my_vibe_prefix_");
                                                        split$default3 = StringsKt__StringsKt.split$default(StringsKt.Y(str9, "my_vibe_seeds_prefix_"), new String[]{StringUtils.COMMA}, false, 0, 6, null);
                                                        t72Var = new t72(Y5, split$default3);
                                                    }
                                                    if (t72Var != null) {
                                                        gc0Var = new ic0(o8g.E(t72Var.b));
                                                    }
                                                }
                                                gc0Var = null;
                                            }
                                        }
                                    }
                                }
                            }
                            if (gc0Var != null) {
                                x97.y(iuhVar.c, null, null, new zig(iuhVar, gc0Var, null, 17), 3);
                                unit = Unit.a;
                                break;
                            } else {
                                unit = Unit.a;
                                break;
                            }
                        } else {
                            list2 = c5b.a;
                        }
                        list = list2;
                        if (list != null) {
                        }
                    }
                    return nm6Var17;
                }
                return c5b.a;
            case 18:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    eqp eqpVar = (eqp) this.l;
                    dkn dknVar = eqpVar.i;
                    hyl hylVar = new hyl((List) this.m, (fvf) obj8, eqpVar);
                    this.k = 1;
                    if (dknVar.a.collect(hylVar, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 19:
                jxp jxpVar = (jxp) this.m;
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 != 0) {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    btl btlVar2 = (btl) this.l;
                    qgg.h0(obj);
                    btlVar = btlVar2;
                    p = obj;
                    rj6 rj6Var = (rj6) p;
                    if (rj6Var instanceof qj6) {
                        cvl cvlVar2 = (cvl) ((qj6) rj6Var).a;
                        this.m = null;
                        this.l = null;
                        this.k = 2;
                        break;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                btlVar = new btl();
                if (jxpVar instanceof gxp) {
                    gxp gxpVar = (gxp) jxpVar;
                    cvlVar = btlVar.h(gxpVar.c, gxpVar.d);
                } else {
                    cvlVar = null;
                }
                if (cvlVar != null) {
                    String str10 = cvlVar.a;
                    if (!Intrinsics.d(cvlVar.r, "public") && !Intrinsics.d(str10, "3")) {
                        cut cutVar = (cut) ((ovp) obj8).d.getValue();
                        String str11 = cvlVar.c.a;
                        this.m = null;
                        this.l = btlVar;
                        this.k = 1;
                        p = cutVar.p(str11, str10, "public", this);
                        break;
                    }
                }
                return Unit.a;
            case 20:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    swp swpVar = ((yvp) obj8).l;
                    this.m = null;
                    this.l = rjcVar;
                    this.k = 1;
                    b2 = swpVar.a.b(this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                    b2 = obj;
                }
                this.m = null;
                this.l = null;
                this.k = 2;
                break;
            case 21:
                yvp yvpVar = (yvp) this.l;
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = yvpVar.p;
                    xdrVar.getClass();
                    xdrVar.m(null, uvp.a);
                    dq7 dq7Var = ca8.a;
                    mn7 mn7Var = mn7.d;
                    glp glpVar = new glp(yvpVar, continuation, i4);
                    this.k = 1;
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        yvpVar.o.invoke();
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                boolean booleanValue = ((Boolean) yvpVar.s.getValue()).booleanValue();
                this.k = 2;
                break;
            case 22:
                File file = (File) obj8;
                owp owpVar = (owp) this.m;
                nm6 nm6Var22 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        zwp zwpVar = (zwp) this.l;
                        jxp jxpVar2 = zwpVar.a;
                        if (jxpVar2 instanceof hxp) {
                            this.k = 1;
                            e4 = owpVar.e(zwpVar, file, this);
                            break;
                        } else if (jxpVar2 instanceof gxp) {
                            this.k = 2;
                            f = owpVar.f(zwpVar, file, this);
                            break;
                        } else if (jxpVar2 instanceof dxp) {
                            this.k = 3;
                            a2 = owpVar.a(zwpVar, file, this);
                            break;
                        } else if (jxpVar2 instanceof exp) {
                            this.k = 4;
                            e3 = owpVar.e(zwpVar, file, this);
                            break;
                        } else if (jxpVar2 instanceof ixp) {
                            this.k = 5;
                            e2 = owpVar.e(zwpVar, file, this);
                            break;
                        } else {
                            if (!(jxpVar2 instanceof fxp)) {
                                b6e.s();
                                return null;
                            }
                            this.k = 6;
                            e = owpVar.e(zwpVar, file, this);
                            break;
                        }
                        return nm6Var22;
                    case 1:
                        qgg.h0(obj);
                        e4 = obj;
                        return (pwp) e4;
                    case 2:
                        qgg.h0(obj);
                        f = obj;
                        return (pwp) f;
                    case 3:
                        qgg.h0(obj);
                        a2 = obj;
                        return (pwp) a2;
                    case 4:
                        qgg.h0(obj);
                        e3 = obj;
                        return (pwp) e3;
                    case 5:
                        qgg.h0(obj);
                        e2 = obj;
                        return (pwp) e2;
                    case 6:
                        qgg.h0(obj);
                        e = obj;
                        return (pwp) e;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 23:
                z1q z1qVar = (z1q) this.l;
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (((aur) this.m).invoke(z1qVar, (PlaybackCommand$QueueBound.Basic) obj8, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return n(obj);
            case 27:
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    pjq pjqVar = new pjq((mm6) this.l, (zi3) this.m);
                    this.k = 1;
                    if (((aur) obj8).invoke(pjqVar, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj);
            default:
                sfm sfmVar = (sfm) ((vtm) this.m).a;
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    CoroutineContext.Element element = ((mm6) this.l).getCoroutineContext().get(o6c.l);
                    if (element == null) {
                        xq0.q("Internal error. coroutineScope should've created a job.");
                        return null;
                    }
                    r2fVar = (r2f) element;
                    this.l = r2fVar;
                    this.k = 1;
                    O = sfmVar.O(r2fVar, this);
                    break;
                } else if (i31 == 1) {
                    r2fVar = (r2f) this.l;
                    qgg.h0(obj);
                    O = obj;
                } else {
                    if (i31 != 2) {
                        if (i31 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i31 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th5 = (Throwable) this.l;
                        qgg.h0(obj);
                        throw th5;
                    }
                    r2fVar2 = (r2f) this.l;
                    try {
                        qgg.h0(obj);
                        this.l = null;
                        this.k = 3;
                        break;
                    } catch (Throwable th6) {
                        th = th6;
                        this.l = th;
                        this.k = 4;
                        if (sfmVar.A(r2fVar2, this) != nm6Var25) {
                        }
                        return nm6Var25;
                    }
                }
                r2f r2fVar3 = r2fVar;
                if (((Boolean) O).booleanValue()) {
                    try {
                        this.l = r2fVar3;
                        this.k = 2;
                        if (((Function1) obj8).invoke(this) != nm6Var25) {
                            r2fVar2 = r2fVar3;
                            this.l = null;
                            this.k = 3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r2fVar2 = r2fVar3;
                        this.l = th;
                        this.k = 4;
                        if (sfmVar.A(r2fVar2, this) != nm6Var25) {
                            throw th;
                        }
                        return nm6Var25;
                    }
                    return nm6Var25;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kun(gm5 gm5Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.m = gm5Var;
        this.n = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kun(pyc pycVar, PlaybackCommand$QueueBound.Basic basic, Continuation continuation) {
        super(2, continuation);
        this.j = 23;
        this.m = (aur) pycVar;
        this.n = basic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kun(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kun(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kun(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
