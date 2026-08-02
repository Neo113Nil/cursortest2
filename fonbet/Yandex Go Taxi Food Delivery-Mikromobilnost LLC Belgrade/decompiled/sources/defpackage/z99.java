package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class z99 extends kr {
    public static final z99 INSTANCE = new z99();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new we8(20));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
