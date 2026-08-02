package app.cash.cdp.integration;

import android.os.Build;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class CdpAppModule$Companion$ProvideOperatingSystemInfoProviderMetroFactory implements Factory {
    public static final CdpAppModule$Companion$ProvideOperatingSystemInfoProviderMetroFactory INSTANCE = new CdpAppModule$Companion$ProvideOperatingSystemInfoProviderMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        str.getClass();
        return new AndroidOperatingSystemInfoProvider();
    }
}
