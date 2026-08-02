package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class un5 extends mjm0 {
    public static final un5 INSTANCE = new un5();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new q03(25));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
