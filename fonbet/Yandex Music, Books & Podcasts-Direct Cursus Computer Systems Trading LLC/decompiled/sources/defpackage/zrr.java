package defpackage;

import com.yandex.music.shared.utils.TimeoutException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zrr extends aur implements ryc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Throwable l;
    public /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zrr(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.j) {
            case 0:
                long longValue = number.longValue();
                zrr zrrVar = new zrr(4, 0, (Continuation) obj4);
                zrrVar.l = th;
                zrrVar.m = longValue;
                return zrrVar.invokeSuspend(Unit.a);
            default:
                long longValue2 = number.longValue();
                zrr zrrVar2 = new zrr(4, 1, (Continuation) obj4);
                zrrVar2.l = th;
                zrrVar2.m = longValue2;
                return zrrVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Throwable th = this.l;
                long j = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    if (!(th instanceof TimeoutException)) {
                        ssg.a(6, "ChatCenter", "An error occurred while trying to update", th);
                        msa msaVar = nsa.b;
                        long M = yd5.M(1 << ((int) Math.min(j, 5L)), ssa.SECONDS);
                        this.l = null;
                        this.m = j;
                        this.k = 1;
                        if (y2x.p(M, this) == nm6Var) {
                            break;
                        }
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Throwable th2 = this.l;
                    long j2 = this.m;
                    jsg.j().h(nit.a, "Cannot check for unfinished work", th2);
                    long min = Math.min(j2 * 30000, nit.b);
                    this.k = 1;
                    if (y2x.o(min, this) == nm6Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
