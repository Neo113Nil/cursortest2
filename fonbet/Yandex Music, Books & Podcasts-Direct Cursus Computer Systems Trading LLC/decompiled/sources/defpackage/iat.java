package defpackage;

import android.database.SQLException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iat extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mat m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iat(mat matVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = matVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                iat iatVar = new iat(this.m, continuation, 0);
                iatVar.l = obj;
                return iatVar;
            default:
                iat iatVar2 = new iat(this.m, continuation, 1);
                iatVar2.l = obj;
                return iatVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((iat) create((t9k) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((iat) create((r6t) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        r6t r6tVar;
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
                t9k t9kVar = (t9k) this.l;
                this.k = 1;
                Object a = mat.a(this.m, t9kVar, this);
                return a == nm6Var ? nm6Var : a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        r6tVar = (r6t) this.l;
                        this.l = r6tVar;
                        this.k = 1;
                        obj = r6tVar.c(this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                qgg.h0(obj);
                                return (Set) obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r6tVar = (r6t) this.l;
                        qgg.h0(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return q5b.a;
                    }
                    q6t q6tVar = q6t.b;
                    iat iatVar = new iat(this.m, null, 0);
                    this.l = null;
                    this.k = 2;
                    obj = r6tVar.a(q6tVar, iatVar, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                    return (Set) obj;
                } catch (SQLException unused) {
                    return q5b.a;
                }
        }
    }
}
