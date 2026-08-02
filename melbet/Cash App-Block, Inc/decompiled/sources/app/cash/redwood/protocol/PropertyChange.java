package app.cash.redwood.protocol;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

@SerialName("property")
@Serializable
/* loaded from: classes3.dex */
public final class PropertyChange implements Change {
    public static final Companion Companion = new Companion();
    public final int _id;
    public final int _tag;
    public final int _widgetTag;
    public final JsonElement value;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/PropertyChange$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/PropertyChange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return PropertyChange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PropertyChange(int i, int i2, int i3, int i4, JsonElement jsonElement) {
        if (5 != (i & 5)) {
            TuplesKt.throwMissingFieldException(i, 5, PropertyChange$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this._id = i2;
        if ((i & 2) == 0) {
            this._widgetTag = -1;
        } else {
            this._widgetTag = i3;
        }
        this._tag = i4;
        if ((i & 8) == 0) {
            this.value = JsonNull.INSTANCE;
        } else {
            this.value = jsonElement;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyChange)) {
            return false;
        }
        PropertyChange propertyChange = (PropertyChange) obj;
        return this._id == propertyChange._id && this._widgetTag == propertyChange._widgetTag && this._tag == propertyChange._tag && Intrinsics.areEqual(this.value, propertyChange.value);
    }

    @Override // app.cash.redwood.protocol.Change
    /* renamed from: getId-0HhLjSo */
    public final int mo1368getId0HhLjSo() {
        throw null;
    }

    public final int hashCode() {
        return this.value.hashCode() + (((((this._id * 31) + this._widgetTag) * 31) + this._tag) * 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this._id, this._widgetTag, "PropertyChange(_id=", ", _widgetTag=", ", _tag=");
        m107m.append(this._tag);
        m107m.append(", value=");
        m107m.append(this.value);
        m107m.append(")");
        return m107m.toString();
    }
}
