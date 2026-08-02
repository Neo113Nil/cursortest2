package defpackage;

import com.yandex.passport.api.g;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.k;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.credentials.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b5m extends aur implements Function2 {
    public f j;
    public z1 k;
    public oqi l;
    public g m;
    public long n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5m(g gVar, Continuation continuation) {
        super(2, continuation);
        this.t = gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        b5m b5mVar = new b5m(this.t, continuation);
        b5mVar.s = obj;
        return b5mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b5m) create((yz1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x004f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:80), block:B:46:0x004f */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0133 A[Catch: all -> 0x015f, TryCatch #2 {all -> 0x015f, blocks: (B:15:0x0137, B:12:0x0128, B:14:0x0133, B:25:0x0162, B:26:0x0169, B:6:0x0104), top: B:5:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162 A[Catch: all -> 0x015f, TRY_ENTER, TryCatch #2 {all -> 0x015f, blocks: (B:15:0x0137, B:12:0x0128, B:14:0x0133, B:25:0x0162, B:26:0x0169, B:6:0x0104), top: B:5:0x0104 }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long parseLong;
        oqi oqiVar;
        f fVar;
        int i;
        g gVar;
        z1 z1Var;
        oqi oqiVar2;
        Throwable th;
        Object obj2;
        f fVar2;
        z1 z1Var2;
        g gVar2;
        long j;
        int i2;
        int i3;
        boolean z;
        Object obj3;
        boolean booleanValue;
        oqi oqiVar3;
        yz1 yz1Var = (yz1) this.s;
        nm6 nm6Var = nm6.a;
        int i4 = this.r;
        try {
            if (i4 == 0) {
                qgg.h0(obj);
                parseLong = Long.parseLong(yz1Var.b);
                z77 z77Var = yz1Var.a;
                boolean z2 = z77Var instanceof xdb;
                h hVar = z2 ? h.c : z77Var instanceof ydb ? h.e : h.c;
                String str = "2ki1HdmQtMrWD8m4hy/fqhJR1ZTAzlUoo2dEu9SUU+1zL9QrUy47pcnLvL6ELcie";
                if (!z2 && (z77Var instanceof ydb)) {
                    str = "jE22HNiRv5rbWsO6hy3X/0pdVzdr6Kd9gzOOGv29+3Yub1E8xzcrYLgPm3WZalQD";
                }
                String str2 = "3h2+EdOU5c3XW5Tph3/cqcaVjYscnu2oLbIpqMSXdeVvXFYjTOfE8Xmjf8Wnffcy";
                if (!z2 && (z77Var instanceof ydb)) {
                    str2 = "3hu1EYKUsp/TW5Xshynb+uwwALF5y1D9aPutP+8KT7qGdUnNaBIh1U3lq7MU7885";
                }
                f fVar3 = new f(str, str2);
                hVar.getClass();
                b a = b.a(hVar.d());
                a.getClass();
                z1 z1Var3 = new z1(a, parseLong);
                Object computeIfAbsent = h5m.a.computeIfAbsent(new Long(parseLong), new so6(3, new osl(17)));
                computeIfAbsent.getClass();
                oqiVar = (oqi) computeIfAbsent;
                this.s = yz1Var;
                this.j = fVar3;
                this.k = z1Var3;
                this.l = oqiVar;
                g gVar3 = this.t;
                this.m = gVar3;
                this.n = parseLong;
                this.o = 0;
                this.r = 1;
                if (oqiVar.a(this) != nm6Var) {
                    fVar = fVar3;
                    i = 0;
                    gVar = gVar3;
                    z1Var = z1Var3;
                }
                return nm6Var;
            }
            if (i4 != 1) {
                try {
                    if (i4 == 2) {
                        int i5 = this.p;
                        int i6 = this.o;
                        j = this.n;
                        gVar2 = this.m;
                        oqi oqiVar4 = this.l;
                        z1Var2 = this.k;
                        fVar2 = this.j;
                        qgg.h0(obj);
                        obj3 = ((z7o) obj).a;
                        i2 = i6;
                        i3 = i5;
                        oqiVar = oqiVar4;
                        qgg.h0(obj3);
                        booleanValue = ((Boolean) obj3).booleanValue();
                        if (booleanValue) {
                            throw new IllegalStateException("xToken is invalid, user must login again!");
                        }
                        yz1Var.getClass();
                        z = booleanValue;
                        this.s = null;
                        this.j = null;
                        this.k = null;
                        this.l = oqiVar;
                        this.m = null;
                        this.n = j;
                        this.o = i2;
                        this.p = i3;
                        this.q = z;
                        this.r = 4;
                        obj2 = gVar2.l(z1Var2, fVar2, this);
                        if (obj2 != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i4 != 3) {
                        if (i4 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = this.l;
                        try {
                            qgg.h0(obj);
                            obj2 = ((z7o) obj).a;
                            qgg.h0(obj2);
                            String str3 = ((k) obj2).a;
                            oqiVar2.b(null);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    z = this.q;
                    i3 = this.p;
                    i2 = this.o;
                    j = this.n;
                    gVar2 = this.m;
                    oqi oqiVar5 = this.l;
                    z1Var2 = this.k;
                    fVar2 = this.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    oqiVar = oqiVar5;
                    this.s = null;
                    this.j = null;
                    this.k = null;
                    this.l = oqiVar;
                    this.m = null;
                    this.n = j;
                    this.o = i2;
                    this.p = i3;
                    this.q = z;
                    this.r = 4;
                    obj2 = gVar2.l(z1Var2, fVar2, this);
                    if (obj2 != nm6Var) {
                        oqiVar2 = oqiVar;
                        qgg.h0(obj2);
                        String str32 = ((k) obj2).a;
                        oqiVar2.b(null);
                        return str32;
                    }
                    return nm6Var;
                } catch (Throwable th3) {
                    th = th3;
                    oqiVar2 = oqiVar3;
                    oqiVar2.b(null);
                    throw th;
                }
            }
            i = this.o;
            parseLong = this.n;
            gVar = this.m;
            oqi oqiVar6 = this.l;
            z1Var = this.k;
            fVar = this.j;
            qgg.h0(obj);
            oqiVar = oqiVar6;
            this.s = yz1Var;
            this.j = fVar;
            this.k = z1Var;
            this.l = oqiVar;
            this.m = gVar;
            this.n = parseLong;
            this.o = i;
            this.p = 0;
            this.r = 2;
            Object a2 = gVar.a(z1Var, this);
            if (a2 == nm6Var) {
                return nm6Var;
            }
            i2 = i;
            i3 = 0;
            z1Var2 = z1Var;
            fVar2 = fVar;
            obj3 = a2;
            long j2 = parseLong;
            gVar2 = gVar;
            j = j2;
            qgg.h0(obj3);
            booleanValue = ((Boolean) obj3).booleanValue();
            if (booleanValue) {
            }
        } catch (Throwable th4) {
            th = th4;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
    }
}
