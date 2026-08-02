package defpackage;

import com.yandex.go.superapp.impl.signals.EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class zfn {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
