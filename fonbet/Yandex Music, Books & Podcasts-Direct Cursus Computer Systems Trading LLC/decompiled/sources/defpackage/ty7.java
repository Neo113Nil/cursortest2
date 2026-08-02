package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ty7 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        mqs mqsVar = (mqs) obj2;
        context.getClass();
        mqsVar.getClass();
        atn atnVar = new atn(context, mqsVar);
        lg3.d0("Tracks_TrackMenu_Delete");
        mqs mqsVar2 = (mqs) atnVar.b;
        Context context2 = (Context) atnVar.c;
        context2.getClass();
        mqsVar2.getClass();
        x97.y(cmd.a, dm6.a, null, new bv6(context2, mqsVar2, null, 27), 2);
        return Unit.a;
    }
}
