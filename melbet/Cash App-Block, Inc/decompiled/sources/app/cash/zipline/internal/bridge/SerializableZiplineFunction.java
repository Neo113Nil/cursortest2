package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineFunction;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class SerializableZiplineFunction implements ZiplineFunction {
    public static final Companion Companion = new Companion();
    public final String id;
    public final boolean isSuspending;
    public final String signature;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/zipline/internal/bridge/SerializableZiplineFunction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/zipline/internal/bridge/SerializableZiplineFunction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SerializableZiplineFunction$$serializer.INSTANCE;
        }
    }

    public SerializableZiplineFunction(ZiplineFunction ziplineFunction) {
        ziplineFunction.getClass();
        String id = ziplineFunction.getId();
        String signature = ziplineFunction.getSignature();
        boolean isSuspending = ziplineFunction.isSuspending();
        id.getClass();
        signature.getClass();
        this.id = id;
        this.signature = signature;
        this.isSuspending = isSuspending;
    }

    @Override // app.cash.zipline.ZiplineFunction
    public final String getId() {
        return this.id;
    }

    @Override // app.cash.zipline.ZiplineFunction
    public final String getSignature() {
        return this.signature;
    }

    @Override // app.cash.zipline.ZiplineFunction
    public final boolean isSuspending() {
        return this.isSuspending;
    }

    public /* synthetic */ SerializableZiplineFunction(String str, String str2, int i, boolean z) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, SerializableZiplineFunction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.signature = str2;
        this.isSuspending = z;
    }
}
