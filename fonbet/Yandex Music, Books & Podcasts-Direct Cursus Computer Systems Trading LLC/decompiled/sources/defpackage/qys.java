package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class qys extends aur implements Function1 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ List l;
    public Iterator m;
    public int n;
    public int o;
    public final /* synthetic */ ueo p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qys(MainDatabase mainDatabase, Continuation continuation, List list, mys mysVar) {
        super(1, continuation);
        this.p = mainDatabase;
        this.l = list;
        this.q = mysVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qys((MainDatabase) this.p, continuation, this.l, (mys) this.q);
            default:
                return new qys(this.p, continuation, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((qys) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        int i2;
        UserDatabase userDatabase;
        Iterator it2;
        int i3;
        int i4;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    i = 0;
                    it = CollectionsKt.H(this.l, 950).iterator();
                    i2 = 0;
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i = this.o;
                    i2 = this.n;
                    it = this.m;
                    qgg.h0(obj);
                }
                while (it.hasNext()) {
                    List list = (List) it.next();
                    mys mysVar = (mys) this.q;
                    this.m = it;
                    this.n = i2;
                    this.o = i;
                    this.k = 1;
                    if (mysVar.a(list, this) == nm6Var) {
                        break;
                    }
                }
                break;
            default:
                Object obj2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    userDatabase = (UserDatabase) this.p;
                    it2 = CollectionsKt.H(this.l, 950).iterator();
                    i3 = 0;
                    i4 = 0;
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i3 = this.o;
                    i4 = this.n;
                    it2 = this.m;
                    userDatabase = (UserDatabase) this.q;
                    qgg.h0(obj);
                }
                while (it2.hasNext()) {
                    List list2 = (List) it2.next();
                    lou C = userDatabase.C();
                    this.q = userDatabase;
                    this.m = it2;
                    this.n = i4;
                    this.o = i3;
                    this.k = 1;
                    C.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM wave_feedback WHERE id IN (");
                    swf.x(list2.size(), sb);
                    sb.append(")");
                    Object G = up6.G(C.a, false, true, new i20(sb.toString(), list2, 12), this);
                    if (G != nm6.a) {
                        G = Unit.a;
                    }
                    if (G == obj2) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qys(ueo ueoVar, Continuation continuation, List list) {
        super(1, continuation);
        this.p = ueoVar;
        this.l = list;
    }
}
