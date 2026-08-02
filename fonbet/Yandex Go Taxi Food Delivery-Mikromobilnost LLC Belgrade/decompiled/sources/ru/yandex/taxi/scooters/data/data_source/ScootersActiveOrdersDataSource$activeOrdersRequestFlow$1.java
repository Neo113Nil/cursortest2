package ru.yandex.taxi.scooters.data.data_source;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rhf;
import defpackage.sqm0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lsqm0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.data_source.ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1", f = "ScootersActiveOrdersDataSource.kt", l = {28, 29, 31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1 scootersActiveOrdersDataSource$activeOrdersRequestFlow$1 = new ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1(this.this$0, continuation);
        scootersActiveOrdersDataSource$activeOrdersRequestFlow$1.L$0 = obj;
        return scootersActiveOrdersDataSource$activeOrdersRequestFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r0.emit(r9, r8) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r9 == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rhf rhfVar;
        sqm0 sqm0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.b;
            this.L$0 = vprVar;
            this.label = 1;
            obj = bVar.b(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i == 2) {
                rhfVar = (rhf) this.L$1;
                kotlin.b.b(obj);
                sqm0 sqm0Var2 = (sqm0) obj;
                this.this$0.d.a(sqm0Var2);
                h hVar = this.this$0.c;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = sqm0Var2;
                this.label = 3;
                if (hVar.d(rhfVar, this) != coroutineSingletons) {
                    sqm0Var = sqm0Var2;
                    Result result = new Result(sqm0Var);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            sqm0Var = (sqm0) this.L$2;
            kotlin.b.b(obj);
            Result result2 = new Result(sqm0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
        }
        rhfVar = (rhf) obj;
        ru.yandex.taxi.scooters.data.mapper.a aVar = this.this$0.a;
        this.L$0 = vprVar;
        this.L$1 = rhfVar;
        this.label = 2;
        obj = aVar.a(rhfVar, this);
    }
}
