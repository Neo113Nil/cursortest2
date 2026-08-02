package androidx.compose.runtime.saveable;

import com.squareup.wire.GrpcMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface SaveableStateRegistry {
    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map performSave();

    GrpcMethod registerProvider(String str, Function0 function0);
}
