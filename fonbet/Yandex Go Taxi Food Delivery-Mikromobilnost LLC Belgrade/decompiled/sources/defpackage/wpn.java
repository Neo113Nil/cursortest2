package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class wpn extends xpn {
    public static final wpn INSTANCE = new wpn();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(29));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
