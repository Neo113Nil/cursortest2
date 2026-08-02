package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public final class UnknownFieldSetLiteSchema extends UnknownFieldSchema {
    @Override // androidx.glance.appwidget.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite getBuilderFromMessage(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.DEFAULT_INSTANCE) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite(0, new int[8], new Object[8], true);
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }
}
