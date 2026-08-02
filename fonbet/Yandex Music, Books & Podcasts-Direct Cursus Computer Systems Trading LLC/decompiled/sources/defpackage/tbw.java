package defpackage;

import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class tbw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ccw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbw(ccw ccwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ccwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                tbw tbwVar = new tbw(this.l, continuation, 0);
                tbwVar.k = obj;
                return tbwVar;
            case 1:
                tbw tbwVar2 = new tbw(this.l, continuation, 1);
                tbwVar2.k = obj;
                return tbwVar2;
            default:
                tbw tbwVar3 = new tbw(this.l, continuation, 2);
                tbwVar3.k = obj;
                return tbwVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((tbw) create((e0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.j;
        ccw ccwVar = this.l;
        switch (i) {
            case 0:
                sqd sqdVar = (sqd) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ccwVar.f.set(sqdVar);
                break;
            case 1:
                e0 e0Var = (e0) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (((Boolean) ((dfw) ccwVar.a.c).invoke()).booleanValue()) {
                    e0Var.getClass();
                    StringBuilder sb = new StringBuilder("->>> Response\n");
                    rse m = e0Var.m();
                    m.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m) {
                        a aVar = (a) obj2;
                        aVar.getClass();
                        if (!aVar.l()) {
                            arrayList.add(obj2);
                        }
                    }
                    sb.append("devices Online = ".concat(CollectionsKt.X(arrayList, null, null, null, san.n, 31)));
                    sb.append('\n');
                    sb.append("active = " + uwf.p(e0Var));
                    sb.append('\n');
                    a0 n = e0Var.n();
                    n.getClass();
                    sb.append(qee.l(n));
                    sb.append('\n');
                    ssg.a(2, "YnisonLogger", sb.toString(), null);
                }
                break;
            default:
                e0 e0Var2 = (e0) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                String str2 = ccw.l;
                mdw d = ccwVar.d();
                d.getClass();
                e0Var2.getClass();
                dlr j = e0Var2.q() ? e0Var2.j() : null;
                if (j == null || (str = j.g()) == null) {
                    str = d.f;
                }
                d.f = str;
                if (!v7g.B(e0Var2)) {
                    d.e(new nsw("YNISON_STATE_ERROR", d.b(null)));
                }
                break;
        }
        return Unit.a;
    }
}
