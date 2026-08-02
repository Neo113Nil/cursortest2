package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
/* loaded from: classes6.dex */
public final class r02 extends ayd {
    public static final r02 INSTANCE = new r02();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(9));

    @Override // defpackage.ayd
    public final Type a() {
        return Type.ALWAYS_TRUE;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        return false;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
