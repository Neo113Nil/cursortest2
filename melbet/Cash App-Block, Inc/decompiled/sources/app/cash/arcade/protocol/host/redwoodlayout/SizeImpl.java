package app.cash.arcade.protocol.host.redwoodlayout;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.redwood.Modifier;
import app.cash.redwood.ui.Dp;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class SizeImpl implements Modifier.ScopedElement {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final double height;
    public final double width;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/redwoodlayout/SizeImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/redwoodlayout/SizeImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SizeImpl$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(19)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(20))};
    }

    public /* synthetic */ SizeImpl(int i, Dp dp, Dp dp2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, SizeImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = dp.value;
        this.height = dp2.value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SizeImpl)) {
            return false;
        }
        SizeImpl sizeImpl = (SizeImpl) obj;
        return Dp.m1406equalsimpl0(sizeImpl.width, this.width) && Dp.m1406equalsimpl0(sizeImpl.height, this.height);
    }

    public final int hashCode() {
        return Double.hashCode(this.height) + Fragment$5$$ExternalSyntheticOutline0.m(this.width, 527, 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Size(width=", Dp.m1407toStringimpl(this.width), ", height=", Dp.m1407toStringimpl(this.height), ")");
    }
}
