package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineService;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public abstract class SuspendingZiplineFunction implements ZiplineFunction {
    public final ArgsListSerializer argsListSerializer;
    public final String id;
    public final ArgsListSerializer resultOrCallbackSerializer;
    public final String signature;
    public final KSerializer suspendCallbackSerializer;

    public SuspendingZiplineFunction(String str, String str2, List list, KSerializer kSerializer, KSerializer kSerializer2) {
        str.getClass();
        list.getClass();
        kSerializer.getClass();
        kSerializer2.getClass();
        this.id = str;
        this.signature = str2;
        this.suspendCallbackSerializer = kSerializer2;
        this.argsListSerializer = new ArgsListSerializer(list);
        this.resultOrCallbackSerializer = new ArgsListSerializer(kSerializer);
    }

    public abstract Object callSuspending(ZiplineService ziplineService, List list, zzmo zzmoVar);

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
        return true;
    }

    public final String toString() {
        return this.signature;
    }
}
