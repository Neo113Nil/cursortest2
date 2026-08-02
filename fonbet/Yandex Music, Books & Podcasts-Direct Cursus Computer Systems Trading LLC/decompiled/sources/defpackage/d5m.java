package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d5m extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ osl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5m(Context context, osl oslVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = context;
        this.m = oslVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                d5m d5mVar = new d5m(this.l, this.m, continuation, 0);
                d5mVar.k = obj;
                return d5mVar;
            default:
                d5m d5mVar2 = new d5m(this.l, this.m, continuation, 1);
                d5mVar2.k = obj;
                return d5mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((d5m) create(null, (Continuation) obj2)).invokeSuspend(Unit.a);
                throw null;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((d5m) create(null, (Continuation) obj2)).invokeSuspend(Unit.a);
                throw null;
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                if (this.k != null) {
                    throw new ClassCastException();
                }
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ConcurrentHashMap concurrentHashMap = g5m.a;
                throw null;
            default:
                if (this.k != null) {
                    throw new ClassCastException();
                }
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ConcurrentHashMap concurrentHashMap2 = g5m.a;
                throw null;
        }
    }
}
