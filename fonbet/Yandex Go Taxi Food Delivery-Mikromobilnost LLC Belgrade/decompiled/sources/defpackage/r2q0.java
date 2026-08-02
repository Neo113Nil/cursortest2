package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class r2q0 extends w2q0 {
    public static final r2q0 INSTANCE = new r2q0("reload", 0);
    public static final /* synthetic */ i3y c = a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(11));

    public final KSerializer serializer() {
        return (KSerializer) c.getValue();
    }
}
