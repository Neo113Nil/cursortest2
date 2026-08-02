package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite {
    protected int memoizedHashCode;

    public abstract int getSerializedSize(Schema schema);

    public abstract void writeTo(CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder);
}
