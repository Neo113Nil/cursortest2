package ru.kinopoisk.sdk.easylogin.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public interface G0 {
    void onAvailableDevicesError(@NotNull Throwable th, @NotNull InterfaceC1305z0.c cVar, @NotNull String str);

    void onDeviceConnected(@NotNull InterfaceC1305z0.c cVar, @NotNull String str);

    void onDeviceDisconnected(@NotNull InterfaceC1305z0.c cVar, @NotNull String str);

    void onDeviceError(@NotNull Throwable th, @NotNull InterfaceC1305z0.c cVar, @NotNull String str);

    void onDevicesFound(@NotNull List<InterfaceC1305z0.a> list);
}
