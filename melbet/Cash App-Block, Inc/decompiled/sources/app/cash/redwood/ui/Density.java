package app.cash.redwood.ui;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class Density {
    public static final Companion Companion = new Companion();
    public final double rawDensity;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/Density$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/Density;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Density$$serializer.INSTANCE;
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m1399constructorimpl(double d) {
        if (d > 0.0d) {
            return;
        }
        throw new IllegalArgumentException(("rawDensity must be positive: " + d).toString());
    }

    /* renamed from: toDp-Ht7-4L4, reason: not valid java name */
    public static final double m1400toDpHt74L4(int i, double d) {
        double d2 = (i / 1.1d) / d;
        Dp.m1405constructorimpl(d2);
        return d2;
    }

    /* renamed from: toPx-mnpKzHI, reason: not valid java name */
    public static final double m1401toPxmnpKzHI(double d, double d2) {
        return d2 * 1.1d * d;
    }

    /* renamed from: toPxInt-mnpKzHI, reason: not valid java name */
    public static final int m1402toPxIntmnpKzHI(double d, double d2) {
        return MathKt__MathJVMKt.roundToInt(m1401toPxmnpKzHI(d, d2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Density) {
            return Double.compare(this.rawDensity, ((Density) obj).rawDensity) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.rawDensity);
    }

    public final String toString() {
        return "Density(rawDensity=" + this.rawDensity + ")";
    }
}
