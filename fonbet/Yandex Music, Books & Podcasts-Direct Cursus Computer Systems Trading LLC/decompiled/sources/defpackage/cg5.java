package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class cg5 implements ag5 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function2 c;

    public cg5(Function1 function1, Function1 function12, Function2 function2) {
        this.a = function1;
        this.b = function12;
        this.c = function2;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        this.b.invoke(mqsVar);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqsVar.getClass();
        this.a.invoke(mqsVar);
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        context.getClass();
        mqsVar.getClass();
        this.c.invoke(context, mqsVar);
    }
}
