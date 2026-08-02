package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class ysi0 extends kr {
    public static final ysi0 INSTANCE = new ysi0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(1));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
