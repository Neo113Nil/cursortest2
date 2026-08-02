package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ful extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jul l;
    public final /* synthetic */ cvl m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ful(jul julVar, cvl cvlVar, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = julVar;
        this.m = cvlVar;
        this.n = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ful(this.l, this.m, this.n, continuation, 0);
            default:
                return new ful(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ful) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jul julVar = this.l;
                julVar.a.a.a(Unit.a);
                StringBuilder sb = new StringBuilder("addTracksToPlaylist(): playlist: ");
                cvl cvlVar = this.m;
                sb.append(cvlVar);
                sb.append(", tracks: ");
                List list = this.n;
                sb.append(list);
                ssg.a(2, null, sb.toString(), null);
                crs crsVar = julVar.d;
                x97.y(crsVar.b, null, null, new v0r(crsVar, "AddToPlaylist_FirstTime", null, 26), 3);
                oul oulVar = julVar.b;
                boolean booleanValue = ((Boolean) julVar.e.e.getValue()).booleanValue();
                this.k = 1;
                Serializable a = oulVar.a(cvlVar, list, booleanValue, this);
                return a == nm6Var ? nm6Var : a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                StringBuilder sb2 = new StringBuilder("removeTracksFromPlaylist(): playlist: ");
                cvl cvlVar2 = this.m;
                sb2.append(cvlVar2);
                sb2.append(", tracks: ");
                List list2 = this.n;
                sb2.append(list2);
                ssg.a(2, null, sb2.toString(), null);
                oul oulVar2 = this.l.b;
                this.k = 1;
                Object c = oulVar2.c(cvlVar2, list2, this);
                return c == nm6Var2 ? nm6Var2 : c;
        }
    }
}
