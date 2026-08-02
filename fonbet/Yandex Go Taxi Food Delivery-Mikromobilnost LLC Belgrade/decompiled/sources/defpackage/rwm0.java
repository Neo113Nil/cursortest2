package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class rwm0 extends swm0 {
    public static final rwm0 INSTANCE = new rwm0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(17));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
