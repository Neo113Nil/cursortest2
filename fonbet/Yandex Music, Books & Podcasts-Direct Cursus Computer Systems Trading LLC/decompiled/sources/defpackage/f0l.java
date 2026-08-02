package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class f0l extends aur implements Function1 {
    public final /* synthetic */ String j;
    public final /* synthetic */ a6l k;
    public final /* synthetic */ kcr l;
    public final /* synthetic */ Boolean m;
    public final /* synthetic */ m3q n;
    public final /* synthetic */ ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0l(String str, a6l a6lVar, kcr kcrVar, Boolean bool, m3q m3qVar, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.j = str;
        this.k = a6lVar;
        this.l = kcrVar;
        this.m = bool;
        this.n = m3qVar;
        this.o = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new f0l(this.j, this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f0l) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        a6l a6lVar = this.k;
        v80 v80Var = new v80(this.j, a6lVar.a, a6lVar.b);
        ezu ezuVar = new ezu(this.l, this.m);
        return new jzu(this.o, new b6v(this.n), v80Var, ezuVar);
    }
}
