package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.passport.api.exception.s;
import com.yandex.passport.api.o;
import com.yandex.passport.api.x1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.data.network.i8;
import com.yandex.passport.data.network.k0;
import com.yandex.passport.data.network.n8;
import com.yandex.passport.data.network.p0;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.l;
import com.yandex.passport.internal.k;
import com.yandex.passport.internal.link_auth.c;
import com.yandex.passport.internal.link_auth.d;
import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.m6;
import com.yandex.passport.internal.methods.n4;
import com.yandex.passport.internal.methods.o3;
import com.yandex.passport.internal.methods.performer.k1;
import com.yandex.passport.internal.methods.performer.m1;
import com.yandex.passport.internal.methods.performer.o0;
import com.yandex.passport.internal.methods.performer.u;
import com.yandex.passport.internal.methods.s3;
import com.yandex.passport.internal.network.client.g;
import com.yandex.passport.internal.push.h0;
import com.yandex.passport.internal.push.m;
import com.yandex.passport.internal.report.a8;
import com.yandex.passport.internal.report.b8;
import com.yandex.passport.internal.report.bf;
import com.yandex.passport.internal.report.e8;
import com.yandex.passport.internal.report.f8;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.g5;
import com.yandex.passport.internal.report.reporters.d0;
import com.yandex.passport.internal.report.reporters.e;
import com.yandex.passport.internal.report.reporters.e0;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.report.t;
import com.yandex.passport.internal.report.w;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.ui.util.j;
import com.yandex.passport.internal.upgrader.p;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.f2;
import com.yandex.passport.internal.usecase.s0;
import com.yandex.passport.internal.usecase.w1;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.plus.pay.ui.core.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.YMApplication;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes4.dex */
public final class wzv extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzv(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        Object t7oVar;
        f L;
        k1 k1Var = (k1) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            t7oVar = new t7o(th);
        }
        if (i == 0) {
            qgg.h0(obj);
            z1 z1Var = (z1) ((k5) this.m).c.c;
            L = z1Var != null ? b.L(z1Var) : null;
            this.l = L;
            this.k = 1;
            t7oVar = k1.a(k1Var, L, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                t7oVar = ((z7o) obj).a;
                qgg.h0(t7oVar);
                return new z7o(t7oVar);
            }
            L = (f) this.l;
            qgg.h0(obj);
            t7oVar = ((z7o) obj).a;
        }
        r7o r7oVar2 = z7o.b;
        if (!(t7oVar instanceof t7o)) {
            f2 f2Var = k1Var.c;
            this.l = null;
            this.k = 2;
            obj = f2Var.g(L, this);
        }
        return new z7o(t7oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
    
        if (r3 == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0128, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r1 == r4) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        Object g;
        t7o t7oVar;
        i8 i8Var;
        n4 n4Var = (n4) this.m;
        m1 m1Var = (m1) this.n;
        d dVar = m1Var.c;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.common.core.b L = a.L((com.yandex.passport.api.impl.b) n4Var.c.c);
            SharedPreferences sharedPreferences = dVar.d;
            long j = sharedPreferences.getLong("link_auth_one_time_last_update", 0L);
            int i2 = sharedPreferences.getInt("link_auth_one_time_count", 0);
            dVar.c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - j;
            if (!dVar.b(currentTimeMillis, j2)) {
                boolean z = j2 < 600000;
                boolean z2 = ((Number) dVar.b.b(l.a)).intValue() > i2;
                if (z && !z2) {
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(new c(s.a));
                    return new z7o(t7oVar);
                }
            }
            SharedPreferences sharedPreferences2 = dVar.d;
            long j3 = sharedPreferences2.getLong("link_auth_last_update", 0L);
            int i3 = sharedPreferences2.getInt("link_auth_current_count", 0);
            dVar.c.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            long j4 = currentTimeMillis2 - j3;
            if (!dVar.a(currentTimeMillis2, j4)) {
                boolean z3 = j4 < 86400000;
                boolean z4 = ((Number) dVar.b.b(l.b)).intValue() > i3;
                if (z3 && !z4) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(new c(s.b));
                    return new z7o(t7oVar);
                }
            }
            n8 n8Var = m1Var.a;
            m1Var.e.getClass();
            d8 d8Var = new d8(com.yandex.passport.internal.network.mappers.b.a(L), (String) n4Var.d.c, (String) n4Var.e.c);
            this.k = 1;
            g = n8Var.g(d8Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i8Var = this.l;
                qgg.h0(obj);
                e0 e0Var = m1Var.d;
                e0Var.getClass();
                r7o r7oVar3 = z7o.b;
                if (!(i8Var instanceof t7o)) {
                    i8 i8Var2 = i8Var;
                    e0Var.n(f8.d, new ff(i8Var2.a, 14), new ff(i8Var2.b.toString(), 12));
                }
                Throwable a = z7o.a(i8Var);
                if (a != null) {
                    e0Var.n(e8.d, new ff(a));
                }
                t7oVar = i8Var;
                return new z7o(t7oVar);
            }
            qgg.h0(obj);
            g = obj;
        }
        i8Var = ((z7o) g).a;
        this.l = i8Var;
        this.k = 2;
        Object V = x97.V(((com.yandex.passport.common.coroutine.b) dVar.a).d, new pjt(dVar, null, 17), this);
        if (V != nm6Var) {
            V = Unit.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r13 == r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        f L;
        Object u;
        o3 o3Var = (o3) this.m;
        m6 m6Var = o3Var.d;
        com.yandex.passport.internal.methods.performer.ui.b bVar = (com.yandex.passport.internal.methods.performer.ui.b) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            L = b.L((z1) o3Var.c.c);
            int ordinal = ((p) m6Var.c).ordinal();
            if (ordinal == 0) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getCached for Uid=" + L, 8);
                }
                com.yandex.passport.internal.l e = bVar.a.a().e(L);
                u = avf.u(e != null ? e.m() : o.a);
            } else if (ordinal == 1) {
                com.yandex.passport.internal.upgrader.o oVar = com.yandex.passport.internal.upgrader.o.b;
                this.l = L;
                this.k = 1;
                u = com.yandex.passport.internal.methods.performer.ui.b.a(bVar, L, oVar, this);
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                com.yandex.passport.internal.upgrader.o oVar2 = com.yandex.passport.internal.upgrader.o.a;
                this.l = L;
                this.k = 2;
                u = com.yandex.passport.internal.methods.performer.ui.b.a(bVar, L, oVar2, this);
            }
        } else {
            if (i != 1 && i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            L = (f) this.l;
            qgg.h0(obj);
            u = ((z7o) obj).a;
        }
        z7o z7oVar = new z7o(u);
        e eVar = bVar.c;
        p pVar = (p) m6Var.c;
        eVar.getClass();
        L.getClass();
        pVar.getClass();
        eVar.n(w.d, new ff(L), new ff(pVar), new bf(new r(26), u));
        if (pVar == p.a) {
            com.yandex.passport.internal.ui.a.x(eVar.b, z7o.a(u) == null ? com.yandex.plus.core.locale.b.p((o) u) : false ? t.d : com.yandex.passport.internal.report.s.d, new ff(L));
        }
        return z7oVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wzv((Function0) this.l, (dzv) this.m, (rxv) this.n, continuation, 0);
            case 1:
                wzv wzvVar = new wzv((t1w) this.n, continuation, 1);
                wzvVar.m = obj;
                return wzvVar;
            case 2:
                return new wzv((kpm) this.l, (t4w) this.m, (upj) this.n, continuation, 2);
            case 3:
                return new wzv((n5w) this.l, (ucg) this.m, (z3w) this.n, continuation, 3);
            case 4:
                return new wzv((hgl) this.l, (paw) this.m, (rdk) this.n, continuation, 4);
            case 5:
                wzv wzvVar2 = new wzv((taw) this.m, (iz7) this.n, continuation, 5);
                wzvVar2.l = obj;
                return wzvVar2;
            case 6:
                return new wzv((cbw) this.n, continuation, 6);
            case 7:
                wzv wzvVar3 = new wzv((ccw) this.n, continuation, 7);
                wzvVar3.m = obj;
                return wzvVar3;
            case 8:
                wzv wzvVar4 = new wzv((a0) this.m, (String) this.n, continuation, 8);
                wzvVar4.l = obj;
                return wzvVar4;
            case 9:
                wzv wzvVar5 = new wzv((c0) this.m, (String) this.n, continuation, 9);
                wzvVar5.l = obj;
                return wzvVar5;
            case 10:
                wzv wzvVar6 = new wzv((kot) this.m, (String) this.n, continuation, 10);
                wzvVar6.l = obj;
                return wzvVar6;
            case 11:
                wzv wzvVar7 = new wzv((bd5) this.m, (iow) this.n, continuation, 11);
                wzvVar7.l = obj;
                return wzvVar7;
            case 12:
                wzv wzvVar8 = new wzv((String) this.m, (wab) this.n, continuation, 12);
                wzvVar8.l = obj;
                return wzvVar8;
            case 13:
                wzv wzvVar9 = new wzv((u9n) this.m, (akw) this.n, continuation, 13);
                wzvVar9.l = obj;
                return wzvVar9;
            case 14:
                wzv wzvVar10 = new wzv((List) this.m, continuation, (jkw) this.n);
                wzvVar10.l = obj;
                return wzvVar10;
            case 15:
                wzv wzvVar11 = new wzv((jsw) this.m, (orw) this.n, continuation, 15);
                wzvVar11.l = obj;
                return wzvVar11;
            case 16:
                return new wzv((nyf) this.l, (pjc) this.m, (aqi) this.n, continuation, 16);
            case 17:
                wzv wzvVar12 = new wzv((PassportProcessGlobalComponent) this.m, (YMApplication) this.n, continuation, 17);
                wzvVar12.l = obj;
                return wzvVar12;
            case 18:
                return new wzv((com.yandex.passport.internal.account.d) this.l, (com.yandex.passport.common.core.b) this.m, (k) this.n, continuation, 18);
            case 19:
                return new wzv((i) this.l, (com.yandex.passport.internal.l) this.m, (x0) this.n, continuation, 19);
            case 20:
                return new wzv((com.yandex.passport.internal.core.linkage.c) this.l, (com.yandex.passport.internal.l) this.m, (com.yandex.passport.internal.i) this.n, continuation, 20);
            case 21:
                return new wzv((com.yandex.passport.internal.filter.l) this.l, (ArrayList) this.m, (com.yandex.passport.internal.entities.k) this.n, continuation, 21);
            case 22:
                return new wzv((s3) this.m, (u) this.n, continuation, 22);
            case 23:
                return new wzv((com.yandex.passport.internal.methods.performer.e0) this.m, (f) this.n, continuation, 23);
            case 24:
                return new wzv((o0) this.l, (f) this.m, (com.yandex.passport.internal.credentials.f) this.n, continuation, 24);
            case 25:
                return new wzv((k5) this.m, (k1) this.n, continuation, 25);
            case 26:
                return new wzv((n4) this.m, (m1) this.n, continuation, 26);
            case 27:
                return new wzv((o3) this.m, (com.yandex.passport.internal.methods.performer.ui.b) this.n, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new wzv((m) this.l, (h0) this.m, (com.yandex.passport.internal.l) this.n, continuation, 28);
            default:
                return new wzv((m) this.l, (com.yandex.passport.internal.push.c0) this.m, (com.yandex.passport.internal.l) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 5:
                ((wzv) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((wzv) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x012e, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x058d, code lost:
    
        if (r0 == r4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x052e, code lost:
    
        if (r7.c(r37) == r4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x060d, code lost:
    
        if (r0.emit((defpackage.orw) r11, r37) == r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05ef, code lost:
    
        if (defpackage.y2x.o(5000, r37) == r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06e6, code lost:
    
        if (r0 == r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0726, code lost:
    
        if (r0 == r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x08c6, code lost:
    
        if (r0.emit(r1, r37) == r2) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x08b9, code lost:
    
        if (r1 == r2) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x092a, code lost:
    
        if (defpackage.x97.V(r2, r3, r37) == r0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x090c, code lost:
    
        if (r1.a(r37) == r0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a5f, code lost:
    
        if (r15 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a6f, code lost:
    
        if (r3.emit(r4, r37) != r2) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a7c, code lost:
    
        if (defpackage.y2x.o(50, r37) == r2) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a7f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0b30, code lost:
    
        if (r0 == r2) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0c37, code lost:
    
        if (r0.emit(r2, r37) == r1) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0c1f, code lost:
    
        if (r0.j0(r37) == r1) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0c12, code lost:
    
        if (r2.j0(r37) == r1) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0bf9, code lost:
    
        if (r2.j0(r37) == r1) goto L482;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023d A[LOOP:3: B:81:0x0237->B:83:0x023d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int, oqi] */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [ru.yandex.video.m3.data.PlaybackStats] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:389:0x0a7c -> B:344:0x0a80). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        r2f y;
        t4w t4wVar;
        ucg ucgVar;
        Object obj2;
        rjc rjcVar;
        ?? j;
        long E;
        zkp zkpVar;
        SessionColor sessionColor;
        Object obj3;
        SessionColor sessionColor2;
        SessionColor sessionColor3;
        PlaybackStats j2;
        oqi oqiVar;
        Object V;
        Object c;
        Object c2;
        Object u;
        Object g;
        f fVar;
        Object V2;
        ArrayList<com.yandex.passport.internal.database.auth_cookie.e> arrayList;
        Iterator it;
        List split$default;
        int i = this.j;
        int i2 = 22;
        int i3 = 11;
        int i4 = 14;
        int i5 = 6;
        int i6 = 10;
        int i7 = 4;
        int i8 = 3;
        int i9 = 0;
        int i10 = 2;
        Object obj4 = this.n;
        int i11 = 1;
        Continuation continuation2 = null;
        String str = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new gct(22, (Function0) this.l));
                    qk qkVar = new qk((dzv) this.m, (rxv) obj4, (Continuation) null, 9);
                    this.k = 1;
                    if (zsd.O(s0, qkVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                t1w t1wVar = (t1w) obj4;
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var2 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    continuation = null;
                    y = x97.y(mm6Var, null, null, new dt0(i10, 20, continuation), 3);
                    v2w v2wVar = (v2w) t1wVar.q.getValue();
                    rar y2 = x97.y(v2wVar.b, null, null, new u2w(v2wVar, continuation, 1), 3);
                    this.m = null;
                    this.l = y;
                    this.k = 1;
                    break;
                } else if (i13 == 1) {
                    y = (r2f) this.l;
                    qgg.h0(obj);
                    continuation = null;
                } else if (i13 == 2) {
                    y = (r2f) this.l;
                    qgg.h0(obj);
                    continuation = null;
                    this.m = continuation;
                    this.l = continuation;
                    this.k = 3;
                    break;
                } else {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    continuation = null;
                    t1wVar.K().c();
                    j0q j0qVar = t1wVar.y;
                    q0w q0wVar = q0w.c;
                    this.m = continuation;
                    this.l = continuation;
                    this.k = 4;
                    break;
                }
                rar a = ((x2w) t1wVar.r.getValue()).a();
                this.m = continuation;
                this.l = y;
                this.k = 2;
                break;
            case 2:
                t4w t4wVar2 = (t4w) this.m;
                nm6 nm6Var3 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    pjc L = ((kpm) this.l).L(t4wVar2);
                    azu azuVar = new azu(7, (upj) obj4, t4wVar2);
                    this.k = 1;
                    if (L.collect(azuVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                ucg ucgVar2 = (ucg) this.m;
                n5w n5wVar = (n5w) this.l;
                t4w t4wVar3 = n5wVar.a;
                Object obj5 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    Context context = n5wVar.b;
                    z3w z3wVar = (z3w) obj4;
                    j4w j4wVar = n5wVar.d;
                    this.k = 1;
                    String str2 = y3w.a;
                    if (!t4wVar3.q || Build.VERSION.SDK_INT >= 31) {
                        t4wVar = t4wVar3;
                        ucgVar = ucgVar2;
                        obj2 = Unit.a;
                        break;
                    } else {
                        lno lnoVar = j4wVar.d;
                        lnoVar.getClass();
                        kotlinx.coroutines.a E2 = u2x.E(lnoVar);
                        ocu ocuVar = new ocu(ucgVar2, t4wVar3, z3wVar, context, (Continuation) null, 9);
                        ucgVar = ucgVar2;
                        t4wVar = t4wVar3;
                        Object V3 = x97.V(E2, ocuVar, this);
                        obj2 = V3;
                        if (V3 != obj5) {
                            obj2 = Unit.a;
                            break;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    t4wVar = t4wVar3;
                    ucgVar = ucgVar2;
                }
                String str3 = o5w.a;
                jsg.j().e(str3, "Starting work for " + t4wVar.c);
                ys3 b = ucgVar.b();
                this.k = 2;
                Object a2 = o5w.a(b, ucgVar, this);
                if (a2 != obj5) {
                    return a2;
                }
                return obj5;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    hgl hglVar = (hgl) this.l;
                    fkn fknVar = hglVar.d;
                    tnf tnfVar = new tnf((paw) this.m, hglVar, (rdk) obj4, (Continuation) null, 5);
                    this.k = 1;
                    if (zsd.O(fknVar, tnfVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                taw tawVar = (taw) this.m;
                iz7 iz7Var = tawVar.v;
                nm6 nm6Var5 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rjcVar = (rjc) this.l;
                        qgg.h0(obj);
                        continuation2 = null;
                        tawVar.b();
                        paw pawVar = (paw) iz7Var.e;
                        j = pawVar == null ? pawVar.j() : continuation2;
                        if (j == null) {
                            paw pawVar2 = (paw) iz7Var.e;
                            E = pawVar2 != null ? pawVar2.E() : -1L;
                        } else {
                            E = j.getLiveOffset();
                        }
                        zmf zmfVar = new zmf(Long.valueOf(E), Long.valueOf(j != null ? j.getTargetLiveOffset() : -1L));
                        Calendar calendar = tawVar.a;
                        String format = new SimpleDateFormat(dfi.c(calendar.getTimeZone().getRawOffset() / 3600000, "HH:mm:ss, 'UTC+'", ", MMMM d yyyy"), Locale.CANADA).format(calendar.getTime());
                        format.getClass();
                        paw pawVar3 = (paw) iz7Var.e;
                        Long l = new Long((pawVar3 != null || (j2 = pawVar3.j()) == null) ? 0L : j2.getMaxTargetBufferMs());
                        zkpVar = (zkp) ((iz7) obj4).i;
                        if (zkpVar != null) {
                            zkpVar.X(xkp.e, new ykp(zkpVar, 0));
                            zkpVar.X(xkp.f, new ykp(zkpVar, 1));
                            Collection values = zkpVar.i.values();
                            Iterator it2 = values.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (((SessionColor) obj3) == SessionColor.RED) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            sessionColor = (SessionColor) obj3;
                            if (sessionColor == null) {
                                Iterator it3 = values.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        sessionColor2 = it3.next();
                                        if (((SessionColor) sessionColor2) == SessionColor.YELLOW) {
                                        }
                                    } else {
                                        sessionColor2 = 0;
                                    }
                                }
                                sessionColor = sessionColor2;
                                if (sessionColor == null) {
                                    Iterator it4 = values.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            sessionColor3 = it4.next();
                                            if (((SessionColor) sessionColor3) == SessionColor.GREEN) {
                                            }
                                        } else {
                                            sessionColor3 = 0;
                                        }
                                    }
                                    sessionColor = sessionColor3;
                                    if (sessionColor == null) {
                                        sessionColor = SessionColor.NONE;
                                        break;
                                    }
                                }
                            }
                        }
                        sessionColor = SessionColor.NONE;
                        djs djsVar = new djs(zmfVar, format, l, sessionColor);
                        this.l = rjcVar;
                        this.k = 1;
                        break;
                    } else {
                        rjcVar = (rjc) this.l;
                        qgg.h0(obj);
                        this.l = rjcVar;
                        this.k = 2;
                        break;
                    }
                } else {
                    qgg.h0(obj);
                    rjcVar = (rjc) this.l;
                    tawVar.b();
                    paw pawVar4 = (paw) iz7Var.e;
                    if (pawVar4 == null) {
                    }
                    if (j == null) {
                    }
                    zmf zmfVar2 = new zmf(Long.valueOf(E), Long.valueOf(j != null ? j.getTargetLiveOffset() : -1L));
                    Calendar calendar2 = tawVar.a;
                    String format2 = new SimpleDateFormat(dfi.c(calendar2.getTimeZone().getRawOffset() / 3600000, "HH:mm:ss, 'UTC+'", ", MMMM d yyyy"), Locale.CANADA).format(calendar2.getTime());
                    format2.getClass();
                    paw pawVar32 = (paw) iz7Var.e;
                    Long l2 = new Long((pawVar32 != null || (j2 = pawVar32.j()) == null) ? 0L : j2.getMaxTargetBufferMs());
                    zkpVar = (zkp) ((iz7) obj4).i;
                    if (zkpVar != null) {
                    }
                    sessionColor = SessionColor.NONE;
                    djs djsVar2 = new djs(zmfVar2, format2, l2, sessionColor);
                    this.l = rjcVar;
                    this.k = 1;
                }
                break;
            case 6:
                cbw cbwVar = (cbw) obj4;
                nm6 nm6Var6 = nm6.a;
                ?? r1 = this.k;
                try {
                    if (r1 == 0) {
                        qgg.h0(obj);
                        oqiVar = (oqi) cbwVar.E.getValue();
                        this.l = oqiVar;
                        this.m = cbwVar;
                        this.k = 1;
                        break;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = (oqi) this.l;
                            qgg.h0(obj);
                            oqiVar.b(null);
                            return Unit.a;
                        }
                        cbwVar = (cbw) this.m;
                        oqiVar = (oqi) this.l;
                        qgg.h0(obj);
                    }
                    Future future = cbwVar.q;
                    if (future != null) {
                        future.cancel(false);
                    }
                    cbwVar.q = null;
                    l8j l8jVar = l8j.c;
                    r1w r1wVar = new r1w(cbwVar, continuation2, i7);
                    this.l = oqiVar;
                    this.m = null;
                    this.k = 2;
                    break;
                } catch (Throwable th) {
                    r1.b(null);
                    throw th;
                }
            case 7:
                rjc rjcVar2 = (rjc) this.m;
                nm6 nm6Var7 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    z6u z6uVar = ((ccw) obj4).b;
                    this.m = null;
                    this.l = rjcVar2;
                    this.k = 1;
                    V = x97.V(ca8.a, new fzb(new ftr(i2, (xpn) z6uVar.b, (dd4) z6uVar.c, (dgw) z6uVar.d), continuation2, 29), this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar2 = (rjc) this.l;
                    qgg.h0(obj);
                    V = obj;
                }
                this.m = null;
                this.l = null;
                this.k = 2;
                break;
            case 8:
                ccw ccwVar = (ccw) this.l;
                Object obj6 = nm6.a;
                int i19 = this.k;
                int i20 = 1;
                if (i19 == 0) {
                    qgg.h0(obj);
                    a0 a0Var = (a0) this.m;
                    this.l = null;
                    this.k = 1;
                    ccwVar.getClass();
                    Object V4 = x97.V(dm6.b, new tt7(a0Var, ccwVar, continuation2, i20), this);
                    Object obj7 = V4;
                    if (V4 != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                ccw ccwVar2 = (ccw) this.l;
                Object obj8 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    c0 c0Var = (c0) this.m;
                    this.l = null;
                    this.k = 1;
                    ccwVar2.getClass();
                    Object V5 = x97.V(dm6.b, new tt7(ccwVar2, c0Var, continuation2, i10), this);
                    Object obj9 = V5;
                    if (V5 != obj8) {
                        obj9 = Unit.a;
                    }
                    if (obj9 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                ccw ccwVar3 = (ccw) this.l;
                Object obj10 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    kot kotVar = (kot) this.m;
                    String str4 = kotVar.a;
                    com.yandex.media.ynison.service.d dVar = kotVar.b;
                    this.l = null;
                    this.k = 1;
                    ccwVar3.getClass();
                    Object V6 = x97.V(dm6.b, new acw(ccwVar3, (String) obj4, dVar, str4, null), this);
                    Object obj11 = V6;
                    if (V6 != obj10) {
                        obj11 = Unit.a;
                    }
                    if (obj11 == obj10) {
                        return obj10;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                bd5 bd5Var = (bd5) this.m;
                jkw jkwVar = (jkw) this.l;
                nm6 nm6Var8 = nm6.a;
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
                String s = bd5Var.s();
                String a3 = bd5Var.a();
                String E3 = pcg.E(bd5Var);
                this.l = null;
                this.k = 1;
                Object d = jkwVar.d(s, a3, (iow) obj4, E3, this);
                return d == nm6Var8 ? nm6Var8 : d;
            case 12:
                jkw jkwVar2 = (jkw) this.l;
                nm6 nm6Var9 = nm6.a;
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
                String str5 = (String) this.m;
                wab wabVar = (wab) obj4;
                o4q o4qVar = wabVar.c;
                gxc gxcVar = wabVar.e;
                this.l = null;
                this.k = 1;
                Object h = jkwVar2.h(str5, o4qVar, gxcVar, this);
                return h == nm6Var9 ? nm6Var9 : h;
            case 13:
                u9n u9nVar = (u9n) this.m;
                akw akwVar = (akw) obj4;
                qkw qkwVar = akwVar.h;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var10 = nm6.a;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        c2 = obj;
                        return (ejw) c2;
                    }
                    if (i25 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                    return (ejw) c;
                }
                qgg.h0(obj);
                if (!Intrinsics.d(u9nVar.d, akwVar.i)) {
                    x97.y(mm6Var2, null, null, new rhw(akwVar, u9nVar, continuation2, i10), 3);
                }
                xab xabVar = u9nVar.a;
                qkwVar.getClass();
                ReentrantLock reentrantLock = qkwVar.a;
                reentrantLock.lock();
                try {
                    okw a4 = qkwVar.a(xabVar);
                    reentrantLock.unlock();
                    if (a4 instanceof mkw) {
                        return ((mkw) a4).a;
                    }
                    if (a4 instanceof nkw) {
                        ssg.a(2, akw.j, "refreshState: try to refresh sources meta", null);
                        nkw nkwVar = (nkw) a4;
                        z4q z4qVar = nkwVar.a;
                        HashMap hashMap = nkwVar.b;
                        this.l = null;
                        this.k = 1;
                        c2 = akw.c(akwVar, u9nVar, z4qVar, hashMap, this);
                        break;
                    } else {
                        if (!a4.equals(lkw.a)) {
                            b6e.s();
                            return null;
                        }
                        ssg.a(2, akw.j, "refreshState: try to refresh entity meta", null);
                        qkwVar.getClass();
                        ssg.a(2, qkw.d, "clearEntity", null);
                        ReentrantLock reentrantLock2 = qkwVar.a;
                        reentrantLock2.lock();
                        try {
                            nur nurVar = qkwVar.b;
                            nurVar.b = null;
                            ((HashMap) nurVar.c).clear();
                            reentrantLock2.unlock();
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            this.l = null;
                            this.k = 2;
                            c = akw.c(akwVar, u9nVar, null, e5bVar, this);
                            break;
                        } finally {
                        }
                    }
                    return nm6Var10;
                } finally {
                }
            case 14:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var11 = nm6.a;
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
                ArrayList H = CollectionsKt.H((List) this.m, 400);
                ArrayList arrayList2 = new ArrayList(v75.o(H, 10));
                Iterator it5 = H.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(x97.p(mm6Var3, dm6.b, null, new rhw((List) it5.next(), continuation2, (jkw) obj4, i8), 2));
                }
                this.l = null;
                this.k = 1;
                Object v = ox6.v(arrayList2, this);
                return v == nm6Var11 ? nm6Var11 : v;
            case 15:
                rjc rjcVar3 = (rjc) this.l;
                nm6 nm6Var12 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.l = rjcVar3;
                    this.k = 1;
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
                    qgg.h0(obj);
                }
                ssg.a(6, jsw.f, "transition: failed - use remote ynison state as fallback", null);
                ((jsw) this.m).e.l(null);
                this.l = null;
                this.k = 2;
                break;
            case 16:
                nm6 nm6Var13 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    nyf nyfVar = (nyf) this.l;
                    lyf lyfVar = lyf.d;
                    rhw rhwVar = new rhw((pjc) this.m, (aqi) obj4, continuation2, i3);
                    this.k = 1;
                    if (o8g.J(nyfVar, lyfVar, rhwVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                YMApplication yMApplication = (YMApplication) obj4;
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) this.m;
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var14 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.vpn.e checkVpnStatusUseCase = passportProcessGlobalComponent.getCheckVpnStatusUseCase();
                    this.l = mm6Var4;
                    this.k = 1;
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j jVar = new j(yMApplication, new b43(rre.f, i4));
                u21 u21Var = new u21(i6, passportProcessGlobalComponent.getCheckVpnStatusUseCase().l, ((com.yandex.passport.internal.common.b) passportProcessGlobalComponent.getAppBackgroundStateWrapper()).b, new hk4(i8, i3, continuation2));
                com.yandex.passport.internal.t tVar = new com.yandex.passport.internal.t((vdr) jVar.d.getValue(), 0);
                hk4 hk4Var = new hk4(i8, 12, continuation2);
                com.yandex.passport.common.mvi.c cVar = new com.yandex.passport.common.mvi.c(passportProcessGlobalComponent, yMApplication, mm6Var4);
                this.l = null;
                this.k = 2;
                Object y3 = tt0.y(cVar, new l1((Object) hk4Var, continuation2, 25), this, wg.s, new pjc[]{u21Var, tVar});
                if (y3 != nm6Var14) {
                    y3 = Unit.a;
                    break;
                }
                break;
            case 18:
                nm6 nm6Var15 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.account.d dVar2 = (com.yandex.passport.internal.account.d) this.l;
                com.yandex.passport.internal.usecase.r rVar = dVar2.j;
                x1 x1Var = x1.OTHER;
                com.yandex.passport.internal.analytics.a aVar = com.yandex.passport.internal.analytics.a.s;
                g a5 = dVar2.a.a((com.yandex.passport.common.core.b) this.m);
                k kVar = (k) obj4;
                n nVar = a5.b;
                com.yandex.passport.internal.credentials.f fVar2 = a5.c;
                final String str6 = fVar2.c;
                final String str7 = fVar2.d;
                com.yandex.passport.common.analytics.k kVar2 = a5.f;
                com.yandex.passport.internal.common.d dVar3 = (com.yandex.passport.internal.common.d) a5.h;
                final Map c3 = kVar2.c(dVar3.a(), dVar3.b());
                final String str8 = kVar.a;
                str8.getClass();
                final String str9 = kVar.b;
                str9.getClass();
                final String str10 = kVar.c;
                str10.getClass();
                final String str11 = kVar.d;
                str11.getClass();
                final String str12 = kVar.e;
                str12.getClass();
                final boolean z = kVar.f;
                final String str13 = kVar.g;
                final String str14 = kVar.h;
                final String str15 = kVar.i;
                final String str16 = kVar.j;
                final boolean z2 = kVar.k;
                str6.getClass();
                str7.getClass();
                c3.getClass();
                Object c4 = a5.c(nVar.N(new Function1() { // from class: com.yandex.passport.internal.network.requester.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj12) {
                        com.yandex.passport.common.network.p pVar = (com.yandex.passport.common.network.p) obj12;
                        pVar.getClass();
                        pVar.J("/1/external_auth_by_password_ex");
                        pVar.S("client_id", str6);
                        pVar.S("client_secret", str7);
                        pVar.P(c3);
                        pVar.S("imap_login", str9);
                        pVar.S("imap_password", str10);
                        pVar.S("imap_host", str11);
                        pVar.S("imap_port", str12);
                        pVar.S("imap_ssl", z ? "yes" : "no");
                        pVar.S("smtp_login", str13);
                        pVar.S("smtp_password", str14);
                        pVar.S("smtp_host", str15);
                        pVar.S("smtp_port", str16);
                        pVar.S("smtp_ssl", z2 ? "yes" : "no");
                        pVar.S("email", str8);
                        return Unit.a;
                    }
                }), com.yandex.passport.internal.network.client.c.a);
                c4.getClass();
                com.yandex.passport.internal.usecase.s sVar = new com.yandex.passport.internal.usecase.s((com.yandex.passport.common.core.b) this.m, 0L, (com.yandex.passport.common.account.a) c4, x1Var, aVar);
                this.k = 1;
                Object g2 = rVar.g(sVar, this);
                return g2 == nm6Var15 ? nm6Var15 : g2;
            case 19:
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) this.m;
                nm6 nm6Var16 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    u = a2.u(((i) this.l).j, lVar, lVar.d, new w1(lVar.g), lVar.b, (x0) obj4, this);
                    if (u == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                return new z7o(u);
            case 20:
                com.yandex.passport.internal.core.linkage.c cVar2 = (com.yandex.passport.internal.core.linkage.c) this.l;
                com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) this.m;
                f fVar3 = lVar2.b;
                nm6 nm6Var17 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                p0 p0Var = cVar2.b;
                String d2 = lVar2.d.d();
                String d3 = ((com.yandex.passport.internal.i) obj4).a.d.d();
                String str17 = cVar2.c.b(fVar3.a).c;
                com.yandex.passport.internal.network.mappers.b bVar = cVar2.d;
                com.yandex.passport.common.core.b bVar2 = fVar3.a;
                bVar.getClass();
                k0 k0Var = new k0(d2, d3, str17, com.yandex.passport.internal.network.mappers.b.a(bVar2), lVar2.h());
                this.k = 1;
                Object g3 = p0Var.g(k0Var, this);
                return g3 == nm6Var17 ? nm6Var17 : g3;
            case 21:
                nm6 nm6Var18 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object c5 = ((com.yandex.passport.internal.filter.l) this.l).c((ArrayList) this.m, (com.yandex.passport.internal.entities.k) obj4, this);
                    return c5 == nm6Var18 ? nm6Var18 : c5;
                }
                if (i33 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                u uVar = (u) obj4;
                d0 d0Var = uVar.d;
                s3 s3Var = (s3) this.m;
                nm6 nm6Var19 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    f L2 = b.L(s3Var.d().a);
                    String valueOf = String.valueOf(L2.b);
                    Map map = s3Var.d().d;
                    d0Var.getClass();
                    valueOf.getClass();
                    map.getClass();
                    ArrayList j3 = u75.j(new com.yandex.passport.internal.report.c(valueOf, 3));
                    d0.u(j3, map);
                    a8 a8Var = a8.d;
                    ze[] zeVarArr = (ze[]) j3.toArray(new ze[0]);
                    d0Var.n(a8Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
                    com.yandex.passport.internal.usecase.e0 e0Var = uVar.a;
                    Locale b2 = ((com.yandex.passport.internal.ui.lang.a) uVar.c).b();
                    String str18 = s3Var.d().b;
                    str18.getClass();
                    com.yandex.passport.internal.usecase.c0 c0Var2 = new com.yandex.passport.internal.usecase.c0(L2, b2, str18, s3Var.d().c, s3Var.d().d, (com.yandex.passport.common.core.c) null, 80);
                    this.l = L2;
                    this.k = 1;
                    g = e0Var.g(c0Var2, this);
                    if (g == nm6Var19) {
                        return nm6Var19;
                    }
                    fVar = L2;
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = (f) this.l;
                    qgg.h0(obj);
                    g = obj;
                }
                Object obj12 = ((z7o) g).a;
                boolean z3 = obj12 instanceof t7o;
                Object obj13 = obj12;
                if (!z3) {
                    r7o r7oVar = z7o.b;
                    String str19 = ((com.yandex.passport.common.url.b) obj12).a;
                    String valueOf2 = String.valueOf(fVar.b);
                    Map map2 = s3Var.d().d;
                    try {
                        str = Uri.parse(str19).getQueryParameter("track_id");
                    } catch (Exception unused) {
                    }
                    d0Var.getClass();
                    valueOf2.getClass();
                    map2.getClass();
                    ArrayList j4 = u75.j(new com.yandex.passport.internal.report.c(valueOf2, 3), new ff(str, 14));
                    d0.u(j4, map2);
                    b8 b8Var = b8.d;
                    ze[] zeVarArr2 = (ze[]) j4.toArray(new ze[0]);
                    d0Var.n(b8Var, (ze[]) Arrays.copyOf(zeVarArr2, zeVarArr2.length));
                    obj13 = str19;
                }
                return new z7o(obj13);
            case 23:
                f fVar4 = (f) obj4;
                com.yandex.passport.internal.methods.performer.e0 e0Var2 = (com.yandex.passport.internal.methods.performer.e0) this.m;
                com.yandex.passport.internal.database.auth_cookie.b bVar3 = e0Var2.a;
                nm6 nm6Var20 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    V2 = x97.V(((com.yandex.passport.common.coroutine.b) bVar3.b).f, new com.yandex.passport.internal.database.auth_cookie.a(bVar3, fVar4, continuation2, i11), this);
                    break;
                } else {
                    if (i35 != 1) {
                        if (i35 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = (ArrayList) this.l;
                        qgg.h0(obj);
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                        for (com.yandex.passport.internal.database.auth_cookie.e eVar : arrayList) {
                            List<String> list = eVar.b;
                            ArrayList arrayList4 = new ArrayList(v75.o(list, 10));
                            for (String str20 : list) {
                                split$default = StringsKt__StringsKt.split$default(str20, new String[]{";"}, false, i9, i5, null);
                                List list2 = split$default;
                                int i36 = i9;
                                ArrayList arrayList5 = new ArrayList(v75.o(list2, 10));
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(StringsKt.t0((String) it6.next()).toString());
                                }
                                String str21 = (String) CollectionsKt.firstOrNull(arrayList5);
                                if (str21 != null) {
                                    str20 = CollectionsKt.X(CollectionsKt.g0(t75.c(StringsKt.n0(str21, "=").concat("=")), CollectionsKt.L(arrayList5, 1)), "; ", null, null, null, 62);
                                }
                                arrayList4.add(str20);
                                i9 = i36;
                                i5 = 6;
                            }
                            com.yandex.passport.internal.database.auth_cookie.e a6 = com.yandex.passport.internal.database.auth_cookie.e.a(eVar, arrayList4);
                            arrayList3.add(new com.yandex.passport.internal.entities.c(a6.a, a6.b, a6.c));
                            i5 = 6;
                        }
                        int i37 = i9;
                        com.yandex.passport.internal.report.reporters.p pVar = e0Var2.c;
                        ArrayList arrayList6 = new ArrayList(v75.o(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(((com.yandex.passport.internal.database.auth_cookie.e) it.next()).c);
                        }
                        pVar.getClass();
                        g5 g5Var = g5.d;
                        com.yandex.passport.internal.report.c cVar3 = new com.yandex.passport.internal.report.c(Long.valueOf(fVar4.b));
                        com.yandex.passport.internal.report.f fVar5 = new com.yandex.passport.internal.report.f(arrayList6);
                        ze[] zeVarArr3 = new ze[2];
                        zeVarArr3[i37] = cVar3;
                        zeVarArr3[1] = fVar5;
                        pVar.n(g5Var, zeVarArr3);
                        return arrayList3;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj14 : (Iterable) V2) {
                    if (!StringsKt.U(((com.yandex.passport.internal.database.auth_cookie.e) obj14).c)) {
                        arrayList7.add(obj14);
                    }
                }
                this.l = arrayList7;
                this.k = 2;
                if (x97.V(((com.yandex.passport.common.coroutine.b) bVar3.b).f, new com.yandex.passport.internal.database.auth_cookie.a(bVar3, fVar4, continuation2, i9), this) != nm6Var20) {
                    arrayList = arrayList7;
                    ArrayList arrayList32 = new ArrayList(v75.o(arrayList, 10));
                    while (r2.hasNext()) {
                    }
                    int i372 = i9;
                    com.yandex.passport.internal.report.reporters.p pVar2 = e0Var2.c;
                    ArrayList arrayList62 = new ArrayList(v75.o(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    pVar2.getClass();
                    g5 g5Var2 = g5.d;
                    com.yandex.passport.internal.report.c cVar32 = new com.yandex.passport.internal.report.c(Long.valueOf(fVar4.b));
                    com.yandex.passport.internal.report.f fVar52 = new com.yandex.passport.internal.report.f(arrayList62);
                    ze[] zeVarArr32 = new ze[2];
                    zeVarArr32[i372] = cVar32;
                    zeVarArr32[1] = fVar52;
                    pVar2.n(g5Var2, zeVarArr32);
                    return arrayList32;
                }
                return nm6Var20;
            case 24:
                o0 o0Var = (o0) this.l;
                f fVar6 = (f) this.m;
                nm6 nm6Var21 = nm6.a;
                int i38 = this.k;
                if (i38 != 0) {
                    if (i38 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getToken: uid=" + fVar6, 8);
                }
                com.yandex.passport.internal.l e = o0Var.a.a().e(fVar6);
                if (e == null) {
                    throw new com.yandex.passport.api.exception.b(fVar6);
                }
                s0 s0Var = o0Var.b;
                com.yandex.passport.internal.usecase.o0 o0Var2 = new com.yandex.passport.internal.usecase.o0(e, (com.yandex.passport.internal.credentials.f) obj4, 4);
                this.k = 1;
                Object g4 = s0Var.g(o0Var2, this);
                return g4 == nm6Var21 ? nm6Var21 : g4;
            case 25:
                return k(obj);
            case 26:
                return l(obj);
            case 27:
                return n(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                m mVar = (m) this.l;
                nm6 nm6Var22 = nm6.a;
                int i39 = this.k;
                if (i39 == 0) {
                    qgg.h0(obj);
                    long intValue = ((Number) mVar.k.b(com.yandex.passport.internal.flags.o.t)).intValue();
                    this.k = 1;
                    if (y2x.o(intValue, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i39 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                m.b(mVar, (h0) this.m, (com.yandex.passport.internal.l) obj4);
                return Unit.a;
            default:
                nm6 nm6Var23 = nm6.a;
                int i40 = this.k;
                if (i40 != 0) {
                    if (i40 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.push.p pVar3 = ((m) this.l).p;
                com.yandex.passport.internal.push.c0 c0Var3 = (com.yandex.passport.internal.push.c0) this.m;
                f fVar7 = ((com.yandex.passport.internal.l) obj4).b;
                this.k = 1;
                Object a7 = pVar3.a(c0Var3, fVar7, this);
                return a7 == nm6Var23 ? nm6Var23 : a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzv(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzv(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzv(List list, Continuation continuation, jkw jkwVar) {
        super(2, continuation);
        this.j = 14;
        this.m = list;
        this.n = jkwVar;
    }
}
