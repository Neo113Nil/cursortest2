package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class k5u extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5u(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                k5u k5uVar = new k5u(2, 0, continuation);
                k5uVar.l = obj;
                return k5uVar;
            case 1:
                k5u k5uVar2 = new k5u(2, 1, continuation);
                k5uVar2.l = obj;
                return k5uVar2;
            case 2:
                k5u k5uVar3 = new k5u(2, 2, continuation);
                k5uVar3.l = obj;
                return k5uVar3;
            case 3:
                k5u k5uVar4 = new k5u(2, 3, continuation);
                k5uVar4.l = obj;
                return k5uVar4;
            case 4:
                k5u k5uVar5 = new k5u(2, 4, continuation);
                k5uVar5.l = obj;
                return k5uVar5;
            default:
                k5u k5uVar6 = new k5u(2, 5, continuation);
                k5uVar6.l = obj;
                return k5uVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((k5u) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((k5u) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((k5u) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((k5u) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((k5u) create((jcw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((k5u) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit(null, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                jtm jtmVar = (jtm) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = jtmVar;
                    this.k = 1;
                    if (y2x.o(1000L, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                jtmVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 2:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    uht.c.getClass();
                    uht uhtVar = uht.d;
                    this.l = null;
                    this.k = 1;
                    if (rjcVar2.emit(uhtVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                rjc rjcVar3 = (rjc) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    Boolean bool = Boolean.TRUE;
                    this.l = null;
                    this.k = 1;
                    if (rjcVar3.emit(bool, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                jcw jcwVar = (jcw) this.l;
                Object obj2 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return jcwVar;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = jcwVar;
                this.k = 1;
                Object o = y2x.o(jcwVar.e - SystemClock.elapsedRealtime(), this);
                if (o != obj2) {
                    o = Unit.a;
                }
                return o == obj2 ? obj2 : jcwVar;
            default:
                rjc rjcVar4 = (rjc) this.l;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Boolean bool2 = Boolean.FALSE;
                    this.l = null;
                    this.k = 1;
                    if (rjcVar4.emit(bool2, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
