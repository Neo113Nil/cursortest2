package app.cash.redwood.protocol;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.b$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class SnapshotChangeList {
    public final List changes;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(7))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/SnapshotChangeList$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/SnapshotChangeList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SnapshotChangeList$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SnapshotChangeList) {
            return Intrinsics.areEqual(this.changes, ((SnapshotChangeList) obj).changes);
        }
        return false;
    }

    public final int hashCode() {
        return this.changes.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SnapshotChangeList(changes=", ")", this.changes);
    }
}
