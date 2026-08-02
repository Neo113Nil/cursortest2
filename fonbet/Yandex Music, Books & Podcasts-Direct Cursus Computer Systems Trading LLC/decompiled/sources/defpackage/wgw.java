package defpackage;

import com.yandex.plus.home.ybsdk.a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class wgw extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgw(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                wgw wgwVar = new wgw(this.m, continuation);
                wgwVar.l = obj;
                return wgwVar;
            default:
                wgw wgwVar2 = new wgw(null, this.m, continuation);
                wgwVar2.l = obj;
                return wgwVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((wgw) create((ccw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((wgw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t7o t7oVar;
        switch (this.j) {
            case 0:
                ccw ccwVar = (ccw) this.l;
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    ccwVar.getClass();
                    Object V = x97.V(dm6.b, new b51(ccwVar, this.m, (Continuation) null), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    throw null;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                } catch (wis e) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e);
                    obj = t7oVar;
                    if (z7o.a(obj) != null) {
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    obj = t7oVar;
                    if (z7o.a(obj) != null) {
                    }
                }
                if (z7o.a(obj) != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    throw null;
                }
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgw(String str, Continuation continuation) {
        super(2, continuation);
        this.m = str;
    }
}
