package defpackage;

import com.yandex.delivery.utils.dialogmanager.impl.b;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class z2s {
    public final b a;
    public final LinkedHashSet b = new LinkedHashSet();

    public z2s(b bVar) {
        this.a = bVar;
    }

    public final Object a(cb3 cb3Var, Continuation continuation) {
        if (cb3Var != null) {
            if (this.b.add(cb3Var.b())) {
                Object a = this.a.a(new qej(cb3Var.e(), cb3Var.d(), cb3Var.a(), null, null, false, cb3Var.c(), null, 184), (ContinuationImpl) continuation);
                if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return a;
                }
            }
        } else if (cb3Var != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
