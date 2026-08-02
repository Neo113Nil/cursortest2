package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.ConfigurationType;

@gsq0
/* loaded from: classes6.dex */
public final class s0e extends t0e {
    public static final s0e INSTANCE = new s0e();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(29));

    @Override // defpackage.t0e
    public final ConfigurationType a() {
        return ConfigurationType.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
