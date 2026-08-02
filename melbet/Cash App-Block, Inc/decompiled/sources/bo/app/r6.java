package bo.app;

import com.braze.support.BrazeLogger;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class r6 implements s9 {
    public final r7 a;
    public final e2 b;

    public r6(r7 r7Var, e2 e2Var) {
        r7Var.getClass();
        e2Var.getClass();
        this.a = r7Var;
        this.b = e2Var;
        new ArrayList();
    }

    @Override // bo.app.s9
    public final void a(id idVar, dd ddVar) {
        idVar.getClass();
        ddVar.getClass();
        d9 d9Var = idVar.a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(d9Var, 18), 7, (Object) null);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        nb nbVar = new nb(d9Var, new n9(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, emptyMap, 4), this.b);
        r7 r7Var = this.a;
        d9Var.a(r7Var, r7Var, nbVar);
        d9Var.b(this.a);
        ddVar.a(nbVar);
        this.a.b(new s5(d9Var), s5.class);
    }

    public static final String a(d9 d9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(d9Var.hashCode(), "Short circuiting execution of network request (", ") and immediately marking it as succeeded.");
    }
}
