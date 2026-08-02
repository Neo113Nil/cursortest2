package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.l;

/* loaded from: classes.dex */
public interface wt10 extends zt10 {
    int getSerializedSize();

    tt10 newBuilderForType();

    tt10 toBuilder();

    ByteString toByteString();

    void writeTo(l lVar);
}
