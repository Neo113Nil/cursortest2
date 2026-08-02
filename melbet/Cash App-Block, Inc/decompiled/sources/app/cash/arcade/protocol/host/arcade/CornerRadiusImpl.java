package app.cash.arcade.protocol.host.arcade;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.redwood.Modifier;
import app.cash.redwood.ui.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public final class CornerRadiusImpl implements Modifier.UnscopedElement {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final double bottomLeft;
    public final double bottomRight;
    public final double topLeft;
    public final double topRight;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/arcade/CornerRadiusImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/arcade/CornerRadiusImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return CornerRadiusImpl$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(8)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(9)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(10)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(11))};
    }

    public /* synthetic */ CornerRadiusImpl(int i, Dp dp, Dp dp2, Dp dp3, Dp dp4) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, CornerRadiusImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bottomLeft = dp.value;
        this.bottomRight = dp2.value;
        this.topLeft = dp3.value;
        this.topRight = dp4.value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CornerRadiusImpl)) {
            return false;
        }
        CornerRadiusImpl cornerRadiusImpl = (CornerRadiusImpl) obj;
        return Dp.m1406equalsimpl0(cornerRadiusImpl.bottomLeft, this.bottomLeft) && Dp.m1406equalsimpl0(cornerRadiusImpl.bottomRight, this.bottomRight) && Dp.m1406equalsimpl0(cornerRadiusImpl.topLeft, this.topLeft) && Dp.m1406equalsimpl0(cornerRadiusImpl.topRight, this.topRight);
    }

    public final int hashCode() {
        return Double.hashCode(this.topRight) + Fragment$5$$ExternalSyntheticOutline0.m(this.topLeft, Fragment$5$$ExternalSyntheticOutline0.m(this.bottomRight, Fragment$5$$ExternalSyntheticOutline0.m(this.bottomLeft, 527, 31), 31), 31);
    }

    public final String toString() {
        String m1407toStringimpl = Dp.m1407toStringimpl(this.bottomLeft);
        String m1407toStringimpl2 = Dp.m1407toStringimpl(this.bottomRight);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CornerRadius(bottomLeft=", m1407toStringimpl, ", bottomRight=", m1407toStringimpl2, ", topLeft="), Dp.m1407toStringimpl(this.topLeft), ", topRight=", Dp.m1407toStringimpl(this.topRight), ")");
    }
}
