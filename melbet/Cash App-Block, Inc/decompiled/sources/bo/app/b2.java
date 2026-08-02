package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class b2 {
    public final EnumSet a(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            ref$ObjectRef.element = brazeConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(0, ref$ObjectRef), 6, (Object) null);
        }
        Object obj = ref$ObjectRef.element;
        obj.getClass();
        return (EnumSet) obj;
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef) {
        return Boxes$$ExternalSyntheticOutline1.m("Using location providers: ", ref$ObjectRef.element);
    }
}
