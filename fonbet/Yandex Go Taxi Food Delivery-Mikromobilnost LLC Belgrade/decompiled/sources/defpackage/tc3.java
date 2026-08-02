package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class tc3 extends uc3 {
    public static final tc3 INSTANCE = new tc3();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new q03(5));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
