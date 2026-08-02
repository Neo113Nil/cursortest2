package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes.dex */
public final class MapEntryLite {
    public final GrpcMethod metadata;

    public MapEntryLite(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.metadata = new GrpcMethod(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
    }
}
