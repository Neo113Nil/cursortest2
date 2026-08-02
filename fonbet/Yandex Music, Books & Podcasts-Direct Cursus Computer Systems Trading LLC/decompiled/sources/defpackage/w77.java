package defpackage;

import com.yandex.plus.core.network.okhttp.call.a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class w77 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ aur m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w77(Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        switch (i) {
            case 1:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 2:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 3:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 4:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 5:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 6:
                this.m = (aur) function2;
                super(2, continuation);
                break;
            case 7:
            default:
                this.m = (aur) function2;
                break;
            case 8:
                this.m = (aur) function2;
                super(2, continuation);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                w77 w77Var = new w77((Function2) this.m, continuation, 0);
                w77Var.l = obj;
                return w77Var;
            case 1:
                w77 w77Var2 = new w77((Function2) this.m, continuation, 1);
                w77Var2.l = obj;
                return w77Var2;
            case 2:
                w77 w77Var3 = new w77((Function2) this.m, continuation, 2);
                w77Var3.l = obj;
                return w77Var3;
            case 3:
                w77 w77Var4 = new w77((Function2) this.m, continuation, 3);
                w77Var4.l = obj;
                return w77Var4;
            case 4:
                w77 w77Var5 = new w77((Function2) this.m, continuation, 4);
                w77Var5.l = obj;
                return w77Var5;
            case 5:
                w77 w77Var6 = new w77((Function2) this.m, continuation, 5);
                w77Var6.l = obj;
                return w77Var6;
            case 6:
                w77 w77Var7 = new w77((Function2) this.m, continuation, 6);
                w77Var7.l = obj;
                return w77Var7;
            case 7:
                return new w77((Function2) this.m, this.l, continuation);
            default:
                w77 w77Var8 = new w77((Function2) this.m, continuation, 8);
                w77Var8.l = obj;
                return w77Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((w77) create((n87) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((w77) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((w77) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((w77) create((a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        t7o t7oVar;
        t7o t7oVar2;
        Object obj2;
        int i = this.j;
        ?? r1 = this.m;
        switch (i) {
            case 0:
                n87 n87Var = (n87) this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (r1.invoke(n87Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    lco lcoVar = new lco((rjc) this.l, (Function2) r1, (Continuation) null);
                    this.k = 1;
                    if (gld.Q(lcoVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    this.k = 1;
                    if (r1.invoke(mm6Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        this.l = null;
                        this.k = 1;
                        obj = r1.invoke(mm6Var2, this);
                        if (obj == nm6Var4) {
                            return nm6Var4;
                        }
                    } else {
                        if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (wis e) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(e);
                    obj = t7oVar;
                    return new z7o(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th);
                    obj = t7oVar;
                    return new z7o(obj);
                }
                return new z7o(obj);
            case 4:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                try {
                    if (i6 == 0) {
                        qgg.h0(obj);
                        this.l = null;
                        this.k = 1;
                        obj = r1.invoke(mm6Var3, this);
                        if (obj == nm6Var5) {
                            return nm6Var5;
                        }
                    } else {
                        if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    obj2 = ((z7o) obj).a;
                } catch (wis e3) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar2 = new t7o(e3);
                    obj2 = t7oVar2;
                    return new z7o(obj2);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar2 = new t7o(th2);
                    obj2 = t7oVar2;
                    return new z7o(obj2);
                }
                return new z7o(obj2);
            case 5:
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object invoke = r1.invoke(mm6Var4, this);
                return invoke == nm6Var6 ? nm6Var6 : invoke;
            case 6:
                mm6 mm6Var5 = (mm6) this.l;
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object invoke2 = r1.invoke(mm6Var5, this);
                return invoke2 == nm6Var7 ? nm6Var7 : invoke2;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Object obj3 = this.l;
                this.k = 1;
                Object invoke3 = r1.invoke(obj3, this);
                return invoke3 == nm6Var8 ? nm6Var8 : invoke3;
            default:
                a aVar = (a) this.l;
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.core.network.context.a aVar2 = aVar.a;
                this.l = null;
                this.k = 1;
                Object invoke4 = r1.invoke(aVar2, this);
                return invoke4 == nm6Var9 ? nm6Var9 : invoke4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w77(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.m = (aur) function2;
        this.l = obj;
    }
}
