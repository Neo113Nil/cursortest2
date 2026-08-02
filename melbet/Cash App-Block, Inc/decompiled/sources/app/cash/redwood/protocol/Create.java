package app.cash.redwood.protocol;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@SerialName("create")
@Serializable
/* loaded from: classes3.dex */
public final class Create implements Change {
    public static final Companion Companion = new Companion();
    public final int _id;
    public final int _tag;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/Create$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/Create;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Create$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Create(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, Create$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this._id = i2;
        this._tag = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Create)) {
            return false;
        }
        Create create = (Create) obj;
        return this._id == create._id && this._tag == create._tag;
    }

    @Override // app.cash.redwood.protocol.Change
    /* renamed from: getId-0HhLjSo */
    public final int mo1368getId0HhLjSo() {
        throw null;
    }

    public final int hashCode() {
        return (this._id * 31) + this._tag;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this._id, this._tag, "Create(_id=", ", _tag=", ")");
    }
}
