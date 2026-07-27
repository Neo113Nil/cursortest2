package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes4.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> messageType);
}
