package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class tr9 extends yr9 {
    public static final tr9 INSTANCE = new tr9();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tr9);
    }

    public final int hashCode() {
        return -155920976;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Close";
    }
}
