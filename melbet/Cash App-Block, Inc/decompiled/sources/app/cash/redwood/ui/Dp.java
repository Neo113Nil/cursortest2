package app.cash.redwood.ui;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class Dp {
    public static final Companion Companion = new Companion();
    public final double value;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/Dp$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/Dp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Dp$$serializer.INSTANCE;
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m1405constructorimpl(double d) {
        if (d >= 0.0d) {
            return;
        }
        throw new IllegalArgumentException(("value must be non-negative: " + d).toString());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1406equalsimpl0(double d, double d2) {
        return Double.compare(d, d2) == 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1407toStringimpl(double d) {
        return d + ".dp";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Dp) {
            return Double.compare(this.value, ((Dp) obj).value) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.value);
    }

    public final String toString() {
        return m1407toStringimpl(this.value);
    }
}
