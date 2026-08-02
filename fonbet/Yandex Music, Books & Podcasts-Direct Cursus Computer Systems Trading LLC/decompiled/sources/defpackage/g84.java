package defpackage;

import android.content.SharedPreferences;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import com.yandex.passport.internal.report.diary.q0;
import com.yandex.passport.internal.usecase.g1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g84 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g84(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.k = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g84((h84) this.l, this.k, continuation, 0);
            case 1:
                return new g84((zfd) this.l, this.k, continuation, 1);
            case 2:
                return new g84((a7q) this.l, this.k, continuation, 2);
            case 3:
                return new g84((a6u) this.l, this.k, continuation, 3);
            case 4:
                return new g84((nmw) this.l, this.k, continuation, 4);
            case 5:
                return new g84((q0) this.l, this.k, continuation, 5);
            default:
                return new g84((g1) this.l, this.k, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g84) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        long j = this.k;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                m64 m64Var = ((h84) obj2).e;
                xun xunVar = m64Var.e;
                if (xunVar != null && m64Var.h != j) {
                    m64Var.g = false;
                    m64Var.h = j;
                    xunVar.q(new rrh(j));
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                zfd zfdVar = (zfd) obj2;
                zfdVar.i = true;
                long j2 = this.k;
                zfdVar.h = j2;
                x97.y(zfdVar.c, null, null, new mj0(zfdVar, j2, (Continuation) null, 2), 3);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar = (a7q) obj2;
                a7qVar.s.a = true;
                ssg.a(3, "SharedPlayerImpl", dfi.e(j, "seekTo(", ")"), null);
                a7qVar.a.s(j);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                gbw gbwVar = ((a6u) obj2).d;
                if (gbwVar != null) {
                    gbwVar.s(j);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                nmw nmwVar = (nmw) obj2;
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    nmwVar.y().d(j);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                PassportDatabase_Impl passportDatabase_Impl = ((q0) obj2).a.a;
                up6.F(passportDatabase_Impl, false, true, new fn1(j, 19));
                up6.F(passportDatabase_Impl, false, true, new fn1(j, 20));
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                SharedPreferences sharedPreferences = ((g1) obj2).e;
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_version", j);
                edit.commit();
                break;
        }
        return Unit.a;
    }
}
