package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
/* loaded from: classes6.dex */
public final class s121 extends ayd {
    public static final s121 INSTANCE = new s121();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(26));

    @Override // defpackage.ayd
    public final Type a() {
        return Type.UNKNOWN;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s121);
    }

    public final int hashCode() {
        return -1211676204;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnknownCondition";
    }
}
