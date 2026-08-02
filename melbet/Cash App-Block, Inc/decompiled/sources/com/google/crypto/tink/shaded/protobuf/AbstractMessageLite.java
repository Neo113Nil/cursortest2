package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite implements MessageLiteOrBuilder {
    protected int memoizedHashCode;

    public abstract int getSerializedSize(Schema schema);

    public final String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract GeneratedMessageLite.Builder newBuilderForType();

    public final byte[] toByteArray() {
        try {
            int serializedSize = ((GeneratedMessageLite) this).getSerializedSize(null);
            byte[] bArr = new byte[serializedSize];
            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = new CodedOutputStream$ArrayEncoder(bArr, serializedSize);
            writeTo(codedOutputStream$ArrayEncoder);
            if (serializedSize - codedOutputStream$ArrayEncoder.position == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(getSerializingExceptionMessage("byte array"), (Throwable) e);
            return null;
        }
    }

    public final ByteString.LiteralByteString toByteString() {
        try {
            int serializedSize = ((GeneratedMessageLite) this).getSerializedSize(null);
            ByteString.LiteralByteString literalByteString = ByteString.EMPTY;
            byte[] bArr = new byte[serializedSize];
            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = new CodedOutputStream$ArrayEncoder(bArr, serializedSize);
            writeTo(codedOutputStream$ArrayEncoder);
            if (codedOutputStream$ArrayEncoder.limit - codedOutputStream$ArrayEncoder.position == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(getSerializingExceptionMessage("ByteString"), (Throwable) e);
            return null;
        }
    }

    public abstract void writeTo(CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder);
}
