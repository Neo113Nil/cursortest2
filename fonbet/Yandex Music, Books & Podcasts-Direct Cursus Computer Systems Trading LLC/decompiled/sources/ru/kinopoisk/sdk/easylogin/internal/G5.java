package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.discovery.DiscoveryManagerListener;
import com.connectsdk.service.command.ServiceCommandError;
import defpackage.c5b;
import defpackage.ltm;
import defpackage.oc4;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class G5 {

    @NotNull
    public final N5 a;

    public static final class a implements DiscoveryManagerListener {

        @NotNull
        public final ltm a;

        public a(@NotNull ltm ltmVar) {
            ltmVar.getClass();
            this.a = ltmVar;
        }

        public static List a(DiscoveryManager discoveryManager) {
            Map<String, ConnectableDevice> allDevices;
            Collection<ConnectableDevice> values;
            List w0 = (discoveryManager == null || (allDevices = discoveryManager.getAllDevices()) == null || (values = allDevices.values()) == null) ? null : CollectionsKt.w0(values);
            return w0 == null ? c5b.a : w0;
        }

        @Override // com.connectsdk.discovery.DiscoveryManagerListener
        public final void onDeviceAdded(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice) {
            ((oc4) this.a).c(a(discoveryManager));
        }

        @Override // com.connectsdk.discovery.DiscoveryManagerListener
        public final void onDeviceRemoved(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice) {
            ((oc4) this.a).c(a(discoveryManager));
        }

        @Override // com.connectsdk.discovery.DiscoveryManagerListener
        public final void onDeviceUpdated(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice) {
            ((oc4) this.a).c(a(discoveryManager));
        }

        @Override // com.connectsdk.discovery.DiscoveryManagerListener
        public final void onDiscoveryFailed(DiscoveryManager discoveryManager, ServiceCommandError serviceCommandError) {
            ((oc4) this.a).c(a(discoveryManager));
        }
    }

    public G5(@NotNull N5 n5) {
        n5.getClass();
        this.a = n5;
    }
}
