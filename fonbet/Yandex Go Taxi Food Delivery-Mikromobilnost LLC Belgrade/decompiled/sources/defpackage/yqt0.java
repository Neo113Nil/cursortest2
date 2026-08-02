package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class yqt0 extends drt0 {
    public static final yqt0 INSTANCE = new yqt0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(8));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
