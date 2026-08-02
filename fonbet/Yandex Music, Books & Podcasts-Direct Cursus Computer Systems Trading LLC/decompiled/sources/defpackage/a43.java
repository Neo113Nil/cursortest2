package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class a43 extends aur implements Function2 {
    public qqi j;
    public lu2 k;
    public c43 l;
    public int m;
    public final /* synthetic */ c43 n;
    public final /* synthetic */ lu2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a43(c43 c43Var, lu2 lu2Var, Continuation continuation) {
        super(2, continuation);
        this.n = c43Var;
        this.o = lu2Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a43(this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a43) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        c43 c43Var;
        qqi qqiVar;
        lu2 lu2Var;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        if (i == 0) {
            qgg.h0(obj);
            c43 c43Var2 = this.n;
            qqi qqiVar2 = c43Var2.d;
            this.j = qqiVar2;
            lu2 lu2Var2 = this.o;
            this.k = lu2Var2;
            this.l = c43Var2;
            this.m = 1;
            if (qqiVar2.a(this) == nm6Var) {
                return nm6Var;
            }
            c43Var = c43Var2;
            qqiVar = qqiVar2;
            lu2Var = lu2Var2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c43Var = this.l;
            lu2Var = this.k;
            qqiVar = this.j;
            qgg.h0(obj);
        }
        try {
            Timber.INSTANCE.tag("YP:BlckBaseUrlsManager").d("addToBlackList url=" + lu2Var, new Object[0]);
            c43Var.c.add(lu2Var);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
    }
}
