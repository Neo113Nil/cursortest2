package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes4.dex */
public final class v2q0 extends w2q0 {
    public static final v2q0 INSTANCE = new v2q0("update", 0);
    public static final /* synthetic */ i3y c = a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(4));

    public final KSerializer serializer() {
        return (KSerializer) c.getValue();
    }
}
