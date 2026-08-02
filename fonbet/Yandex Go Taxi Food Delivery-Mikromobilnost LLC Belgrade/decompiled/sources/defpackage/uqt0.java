package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class uqt0 extends drt0 {
    public static final uqt0 INSTANCE = new uqt0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(7));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
