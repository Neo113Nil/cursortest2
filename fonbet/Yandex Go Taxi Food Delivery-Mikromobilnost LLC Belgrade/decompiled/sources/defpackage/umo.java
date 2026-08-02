package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class umo extends kr {
    public static final umo INSTANCE = new umo();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new cao(19));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
