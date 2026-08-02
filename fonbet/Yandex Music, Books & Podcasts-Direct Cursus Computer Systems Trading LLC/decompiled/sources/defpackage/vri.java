package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class vri implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ vri(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                new lum(context).Q(this.b);
                break;
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                new lum(context2).Q(this.b);
                break;
        }
        return Unit.a;
    }
}
