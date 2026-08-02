package app.cash.redwood.protocol;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.b$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class Event {
    public final int _id;
    public final int _tag;
    public final List args;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(5))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/Event$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/Event;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Event$$serializer.INSTANCE;
        }
    }

    public Event(int i, int i2, int i3, List list) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, Event$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this._id = i2;
        this._tag = i3;
        if ((i & 4) == 0) {
            this.args = EmptyList.INSTANCE;
        } else {
            this.args = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return this._id == event._id && this._tag == event._tag && Intrinsics.areEqual(this.args, event.args);
    }

    public final int hashCode() {
        return this.args.hashCode() + (((this._id * 31) + this._tag) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m107m(this._id, this._tag, "Event(_id=", ", _tag=", ", args="), this.args, ")");
    }

    public Event(int i, int i2, List list) {
        this._id = i;
        this._tag = i2;
        this.args = list;
    }
}
