package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class x121 extends rjx0 {
    public static final x121 INSTANCE = new x121();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(27));

    @Override // defpackage.rjx0
    /* renamed from: a */
    public final boolean getC() {
        return true;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
