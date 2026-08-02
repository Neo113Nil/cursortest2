package defpackage;

import android.os.Parcelable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class xx extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ ay k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx(Continuation continuation, ay ayVar, String str, int i) {
        super(2, continuation);
        this.j = i;
        this.k = ayVar;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xx(continuation, this.k, this.l, 0);
            default:
                return new xx(continuation, this.k, this.l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((xx) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mt mtVar;
        int i = this.j;
        String str = this.l;
        ay ayVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                oq a = ayVar.b.a(str);
                if (a == null) {
                    return null;
                }
                Parcelable.Creator<oq> creator = oq.CREATOR;
                if (cxb.Y(a.a)) {
                    return null;
                }
                return a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                aoi aoiVar = ayVar.b;
                oq a2 = aoiVar.a(str);
                if (a2 == null) {
                    mtVar = new mt(oq.J, c5b.a, null, null);
                } else {
                    g51 g51Var = aoiVar.c;
                    g51Var.getClass();
                    mtVar = new mt(a2, (List) x97.D(g.a, new f51(g51Var, str, null)), null, null);
                }
                Parcelable.Creator<oq> creator2 = oq.CREATOR;
                oq oqVar = mtVar.a;
                oqVar.getClass();
                if (cxb.Y(oqVar.a)) {
                    return null;
                }
                return mtVar;
        }
    }
}
