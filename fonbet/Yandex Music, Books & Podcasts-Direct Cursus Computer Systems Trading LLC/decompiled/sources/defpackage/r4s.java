package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class r4s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ c5s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4s(c5s c5sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = c5sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r4s(this.k, continuation, 0);
            case 1:
                return new r4s(this.k, continuation, 1);
            default:
                return new r4s(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r4s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        c5s c5sVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                c5sVar.h.c();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                c5sVar.h.a();
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                j5s j5sVar = c5sVar.j;
                Activity activity = (Activity) CollectionsKt.Z(frc.a.c);
                Continuation continuation = null;
                hn5 hn5Var = activity != null ? (hn5) vq2.Q(activity) : null;
                if (hn5Var != null) {
                    int i2 = m5s.f;
                    x97.y(wyf.F(hn5Var.getLifecycle()), dm6.b(), null, new d7i(hn5Var, continuation, 25), 2);
                } else {
                    Context context = j5sVar.a;
                    context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
                }
                break;
        }
        return Unit.a;
    }
}
