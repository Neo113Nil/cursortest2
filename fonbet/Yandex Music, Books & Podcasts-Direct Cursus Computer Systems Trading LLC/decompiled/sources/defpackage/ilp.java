package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ilp extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Throwable m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ilp(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                ilp ilpVar = new ilp(3, 0, continuation);
                ilpVar.l = rjcVar;
                ilpVar.m = th;
                return ilpVar.invokeSuspend(Unit.a);
            default:
                ilp ilpVar2 = new ilp(3, 1, continuation);
                ilpVar2.l = rjcVar;
                ilpVar2.m = th;
                return ilpVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.m);
                    lpi a = imm.a();
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit(a, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                rjc rjcVar2 = this.l;
                Throwable th = this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ssg.a(7, "ShortcutsHelper", "init(): unable to calculate shortcuts", th);
                    c5b c5bVar = c5b.a;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar2.emit(c5bVar, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
