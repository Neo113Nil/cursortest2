package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class rtw0 extends stw0 {
    public static final rtw0 INSTANCE = new rtw0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(23));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rtw0);
    }

    public final int hashCode() {
        return -1742468021;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
