package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public abstract class ReturningZiplineFunction implements ZiplineFunction {
    public final ArgsListSerializer argsListSerializer;
    public final String id;
    public final ArgsListSerializer resultSerializer;
    public final String signature;

    public ReturningZiplineFunction(String str, String str2, List list, KSerializer kSerializer) {
        str.getClass();
        list.getClass();
        kSerializer.getClass();
        this.id = str;
        this.signature = str2;
        this.argsListSerializer = new ArgsListSerializer(list);
        this.resultSerializer = new ArgsListSerializer(kSerializer);
    }

    public abstract Object call(ZiplineService ziplineService, List list);

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
        return false;
    }

    public final String toString() {
        return this.signature;
    }
}
