package defpackage;

import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.offline.recommender.proto.a;
import com.yandex.pulse.metrics.o;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class z0i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0i(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                z0i z0iVar = new z0i(2, 0, continuation);
                z0iVar.k = obj;
                return z0iVar;
            case 1:
                z0i z0iVar2 = new z0i(2, 1, continuation);
                z0iVar2.k = obj;
                return z0iVar2;
            case 2:
                z0i z0iVar3 = new z0i(2, 2, continuation);
                z0iVar3.k = obj;
                return z0iVar3;
            case 3:
                z0i z0iVar4 = new z0i(2, 3, continuation);
                z0iVar4.k = obj;
                return z0iVar4;
            case 4:
                z0i z0iVar5 = new z0i(2, 4, continuation);
                z0iVar5.k = obj;
                return z0iVar5;
            case 5:
                z0i z0iVar6 = new z0i(2, 5, continuation);
                z0iVar6.k = obj;
                return z0iVar6;
            case 6:
                z0i z0iVar7 = new z0i(2, 6, continuation);
                z0iVar7.k = obj;
                return z0iVar7;
            case 7:
                z0i z0iVar8 = new z0i(2, 7, continuation);
                z0iVar8.k = obj;
                return z0iVar8;
            case 8:
                z0i z0iVar9 = new z0i(2, 8, continuation);
                z0iVar9.k = obj;
                return z0iVar9;
            case 9:
                z0i z0iVar10 = new z0i(2, 9, continuation);
                z0iVar10.k = obj;
                return z0iVar10;
            case 10:
                z0i z0iVar11 = new z0i(2, 10, continuation);
                z0iVar11.k = obj;
                return z0iVar11;
            case 11:
                z0i z0iVar12 = new z0i(2, 11, continuation);
                z0iVar12.k = obj;
                return z0iVar12;
            case 12:
                z0i z0iVar13 = new z0i(2, 12, continuation);
                z0iVar13.k = obj;
                return z0iVar13;
            case 13:
                z0i z0iVar14 = new z0i(2, 13, continuation);
                z0iVar14.k = obj;
                return z0iVar14;
            case 14:
                z0i z0iVar15 = new z0i(2, 14, continuation);
                z0iVar15.k = obj;
                return z0iVar15;
            case 15:
                z0i z0iVar16 = new z0i(2, 15, continuation);
                z0iVar16.k = obj;
                return z0iVar16;
            case 16:
                z0i z0iVar17 = new z0i(2, 16, continuation);
                z0iVar17.k = obj;
                return z0iVar17;
            case 17:
                z0i z0iVar18 = new z0i(2, 17, continuation);
                z0iVar18.k = obj;
                return z0iVar18;
            case 18:
                z0i z0iVar19 = new z0i(2, 18, continuation);
                z0iVar19.k = obj;
                return z0iVar19;
            case 19:
                z0i z0iVar20 = new z0i(2, 19, continuation);
                z0iVar20.k = obj;
                return z0iVar20;
            case 20:
                z0i z0iVar21 = new z0i(2, 20, continuation);
                z0iVar21.k = obj;
                return z0iVar21;
            case 21:
                z0i z0iVar22 = new z0i(2, 21, continuation);
                z0iVar22.k = obj;
                return z0iVar22;
            case 22:
                z0i z0iVar23 = new z0i(2, 22, continuation);
                z0iVar23.k = obj;
                return z0iVar23;
            case 23:
                z0i z0iVar24 = new z0i(2, 23, continuation);
                z0iVar24.k = obj;
                return z0iVar24;
            case 24:
                z0i z0iVar25 = new z0i(2, 24, continuation);
                z0iVar25.k = obj;
                return z0iVar25;
            case 25:
                z0i z0iVar26 = new z0i(2, 25, continuation);
                z0iVar26.k = obj;
                return z0iVar26;
            case 26:
                z0i z0iVar27 = new z0i(2, 26, continuation);
                z0iVar27.k = obj;
                return z0iVar27;
            case 27:
                z0i z0iVar28 = new z0i(2, 27, continuation);
                z0iVar28.k = obj;
                return z0iVar28;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                z0i z0iVar29 = new z0i(2, 28, continuation);
                z0iVar29.k = obj;
                return z0iVar29;
            default:
                z0i z0iVar30 = new z0i(2, 29, continuation);
                z0iVar30.k = obj;
                return z0iVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((z0i) create((oq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((z0i) create((c01) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((z0i) create((cvl) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((z0i) create((y7p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((z0i) create((cmi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((z0i) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((z0i) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((z0i) create((x66) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((z0i) create((g1k) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((z0i) create((t7q) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((z0i) create((vnl) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((z0i) create((MainDatabase) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((z0i) create((g7e) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((z0i) create((uwm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((z0i) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((z0i) create((zmn) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((z0i) create((p76) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((z0i) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((z0i) create((x66) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((z0i) create((x66) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((z0i) create((h5q) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((z0i) create((x66) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((z0i) create((x66) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((z0i) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((z0i) create((fa0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((z0i) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((z0i) create((kbq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((z0i) create((a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((z0i) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((z0i) create((j1g) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((defpackage.q7q) r0).a.b(), defpackage.h1b.e) == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [twh] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h0o g0oVar;
        boolean z = false;
        r2 = false;
        boolean z2 = false;
        r2 = false;
        boolean z3 = false;
        int i = 1;
        switch (this.j) {
            case 0:
                oq oqVar = (oq) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                oqVar.getClass();
                return new p0i(saf.H(oqVar, false), oqVar);
            case 1:
                c01 c01Var = (c01) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                c01Var.getClass();
                String w = vz1.w(c01Var.q.a);
                String str = c01Var.b;
                int i2 = c01Var.g;
                return new c1i(c01Var, new jd1(w, str, false, i2 > 0 ? new w3g(tt0.C(i2), dag.A(i2, false), false) : 0));
            case 2:
                cvl cvlVar = (cvl) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return new w1i(avf.B(cvlVar), cvlVar);
            case 3:
                y7p y7pVar = (y7p) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!(y7pVar instanceof p7p));
            case 4:
                cmi cmiVar = (cmi) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(cmiVar, yli.a) || Intrinsics.d(cmiVar, zli.a) || (cmiVar instanceof bmi)) {
                    z = true;
                } else if (!Intrinsics.d(cmiVar, ami.a)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z);
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
                return Unit.a;
            case 7:
                x66 x66Var = (x66) this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(x66Var.b != u0j.a);
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                g1k g1kVar = (g1k) this.k;
                if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                    Log.v("Paging", "Sent " + g1kVar);
                }
                return Unit.a;
            case 9:
                t7q t7qVar = (t7q) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                if (!(t7qVar instanceof q7q)) {
                    if (!Intrinsics.d(t7qVar, r7q.a)) {
                        if (!(t7qVar instanceof s7q)) {
                            b6e.s();
                            return null;
                        }
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
                break;
            case 10:
                vnl vnlVar = (vnl) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(vnlVar instanceof rnl);
            case 11:
                MainDatabase mainDatabase = (MainDatabase) this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                return zsd.b0(new o2m(bg3.v(mainDatabase.R().a, false, new String[]{"track_operation"}, new phs(25)), z ? 1 : 0));
            case 12:
                g7e g7eVar = (g7e) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ReentrantLock reentrantLock = f5m.a;
                String str2 = g7eVar.a;
                LinkedHashMap linkedHashMap = g7eVar.b;
                InputStream inputStream = g7eVar.c;
                y4m[] y4mVarArr = y4m.a;
                Pattern pattern = twh.e;
                twh C = q5g.C("application/json");
                if (inputStream != null) {
                    try {
                        byte[] N = vnj.N(inputStream);
                        inputStream.close();
                        int length = N.length;
                        cvt.c(N.length, 0, length);
                        g0oVar = new g0o(C, length, N);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            yd5.q(inputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    pn3 pn3Var = pn3.d;
                    pn3Var.getClass();
                    g0oVar = new f0o(r1, pn3Var, i);
                }
                b0o b0oVar = new b0o();
                s7e s7eVar = new s7e();
                s7eVar.h(null, str2);
                b0oVar.a = s7eVar.e();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    b0oVar.d((String) entry.getKey(), (String) entry.getValue());
                }
                b0oVar.e(ServiceCommand.TYPE_POST, g0oVar);
                d0o b = b0oVar.b();
                OkHttpClient okHttpClient = f5m.b;
                if (okHttpClient == null) {
                    ReentrantLock reentrantLock2 = f5m.a;
                    reentrantLock2.lock();
                    try {
                        okHttpClient = f5m.b;
                        if (okHttpClient == null) {
                            joj jojVar = new joj();
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            jojVar.c(30L, timeUnit);
                            jojVar.e(30L, timeUnit);
                            jojVar.g(30L);
                            jojVar.h = true;
                            jojVar.i = true;
                            OkHttpClient okHttpClient2 = new OkHttpClient(jojVar);
                            f5m.b = okHttpClient2;
                            okHttpClient = okHttpClient2;
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                l3o execute = new mkn(okHttpClient, b, false).execute();
                ovn ovnVar = a87.a;
                o3o o3oVar = execute.g;
                return new i7e(Integer.valueOf(execute.d), execute.f.o(), o3oVar != null ? o3oVar.z().E0() : null);
            case 13:
                uwm uwmVar = (uwm) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(uwmVar instanceof qwm);
            case 14:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ec7.d(lpiVar, "is_migration_done", true);
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((zmn) this.k) == zmn.a);
            case 16:
                p76 p76Var = (p76) this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(p76Var == p76.a);
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.k));
                return Unit.a;
            case 18:
                x66 x66Var2 = (x66) this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                if (x66Var2.a && x66Var2.b != u0j.a) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 19:
                x66 x66Var3 = (x66) this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(x66Var3.a || x66Var3.b == u0j.a);
            case 20:
                h5q h5qVar = (h5q) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(h5qVar == h5q.c);
            case 21:
                x66 x66Var4 = (x66) this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(x66Var4.a || x66Var4.b == u0j.a);
            case 22:
                x66 x66Var5 = (x66) this.k;
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!x66Var5.a);
            case 23:
                List list = (List) this.k;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(list != null);
            case 24:
                fa0 fa0Var = (fa0) this.k;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                fa0Var.a(0.0f);
                return Unit.a;
            case 25:
                lpi lpiVar2 = (lpi) this.k;
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                lpiVar2.e();
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((kbq) this.k) != kbq.a);
            case 27:
                a aVar = (a) this.k;
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                dks dksVar = (dks) aVar.m30toBuilder();
                o3d o3dVar = dksVar.a;
                if (o3dVar.isMutable()) {
                    xq0.x("Default instance must be immutable.");
                    return null;
                }
                dksVar.b = o3dVar.newMutableInstance();
                return dksVar.b();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                lpi lpiVar3 = (lpi) this.k;
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                lpiVar3.e();
                return Unit.a;
            default:
                j1g j1gVar = (j1g) this.k;
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(j1gVar == j1g.a);
        }
    }
}
