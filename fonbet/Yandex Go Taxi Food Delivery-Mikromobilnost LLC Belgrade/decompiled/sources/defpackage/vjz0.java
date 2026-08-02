package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
/* loaded from: classes6.dex */
public final class vjz0 extends ayd {
    public static final vjz0 INSTANCE = new vjz0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(5));

    @Override // defpackage.ayd
    public final Type a() {
        return Type.TO_TAXI;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        return xxdVar instanceof ujz0;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
