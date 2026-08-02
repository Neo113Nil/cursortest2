package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class znt extends kr {
    public static final znt INSTANCE = new znt();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(5));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
