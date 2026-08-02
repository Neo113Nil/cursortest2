package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class xtg extends ztg {
    public static final xtg INSTANCE = new xtg();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(17));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
