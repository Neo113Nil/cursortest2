package app.cash.redwood.ui;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class Size {
    public static final Companion Companion = new Companion();
    public final double height;
    public final double width;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/Size$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/Size;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Size$$serializer.INSTANCE;
        }
    }

    static {
        Dp.m1405constructorimpl(0.0d);
        Dp.m1405constructorimpl(0.0d);
    }

    public /* synthetic */ Size(int i, Dp dp, Dp dp2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, Size$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = dp.value;
        this.height = dp2.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return Dp.m1406equalsimpl0(this.width, size.width) && Dp.m1406equalsimpl0(this.height, size.height);
    }

    public final int hashCode() {
        return Double.hashCode(this.height) + (Double.hashCode(this.width) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Size(width=", Dp.m1407toStringimpl(this.width), ", height=", Dp.m1407toStringimpl(this.height), ")");
    }

    public Size(double d, double d2) {
        this.width = d;
        this.height = d2;
    }
}
