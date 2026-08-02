package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class txb0 extends xxb0 {
    public static final txb0 INSTANCE = new txb0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(10));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
