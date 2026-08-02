package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AtProtobuf$ProtobufImpl implements Protobuf {
    public final int tag;

    public AtProtobuf$ProtobufImpl(int i) {
        this.tag = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        Protobuf protobuf = (Protobuf) obj;
        return this.tag == protobuf.tag() && Protobuf.IntEncoding.DEFAULT.equals(protobuf.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.tag ^ 14552422) + (Protobuf.IntEncoding.DEFAULT.hashCode() ^ 2041407134);
    }

    @Override // com.google.firebase.encoders.proto.Protobuf
    public final Protobuf.IntEncoding intEncoding() {
        return Protobuf.IntEncoding.DEFAULT;
    }

    @Override // com.google.firebase.encoders.proto.Protobuf
    public final int tag() {
        return this.tag;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.tag + "intEncoding=" + Protobuf.IntEncoding.DEFAULT + ')';
    }
}
