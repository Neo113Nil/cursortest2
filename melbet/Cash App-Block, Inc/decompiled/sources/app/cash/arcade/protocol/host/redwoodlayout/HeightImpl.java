package app.cash.arcade.protocol.host.redwoodlayout;

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
public final class HeightImpl implements Modifier.ScopedElement {
    public final double height;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(15))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/redwoodlayout/HeightImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/redwoodlayout/HeightImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return HeightImpl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeightImpl(int i, Dp dp) {
        if (1 == (i & 1)) {
            this.height = dp.value;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, HeightImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HeightImpl) && Dp.m1406equalsimpl0(((HeightImpl) obj).height, this.height);
    }

    public final int hashCode() {
        return Double.hashCode(this.height) + 527;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Height(height=", Dp.m1407toStringimpl(this.height), ")");
    }
}
