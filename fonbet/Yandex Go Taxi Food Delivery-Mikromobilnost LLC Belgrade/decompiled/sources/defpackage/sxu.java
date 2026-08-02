package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class sxu extends uxu {
    public static final sxu INSTANCE = new sxu();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(7));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
