package ru.yandex.quasar.glagol.impl;

import android.net.nsd.NsdServiceInfo;
import androidx.annotation.NonNull;
import defpackage.i08;
import defpackage.shd;
import defpackage.v68;
import defpackage.weo;
import defpackage.zgr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.quasar.glagol.StereoPairRole;
import ru.yandex.quasar.glagol.backend.model.Device;
import ru.yandex.quasar.glagol.backend.model.GlagolConfig;
import ru.yandex.quasar.glagol.backend.model.GlagolSecurityConfig;
import ru.yandex.quasar.glagol.backend.model.QuasarNetworkInfo;

/* loaded from: classes6.dex */
public class DiscoveryResultFactory {
    private static String getAttr(@NonNull NsdServiceInfo nsdServiceInfo, @NonNull String str) {
        byte[] bArr;
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes == null || (bArr = attributes.get(str)) == null) {
            return null;
        }
        return new String(bArr);
    }

    private static String getCertificate(@NonNull Device device) {
        GlagolSecurityConfig security;
        GlagolConfig glagol = device.getGlagol();
        if (glagol == null || (security = glagol.getSecurity()) == null) {
            return null;
        }
        return security.getServerCertificate();
    }

    public static i08 getDeviceId(@NonNull NsdServiceInfo nsdServiceInfo) {
        String attr = getAttr(nsdServiceInfo, "deviceId");
        String attr2 = getAttr(nsdServiceInfo, "platform");
        if (attr == null || attr2 == null) {
            return null;
        }
        return new i08(attr, attr2);
    }

    private static String getDeviceName(@NonNull Device device) {
        Map<String, Object> config = device.getConfig();
        return (config == null || !config.containsKey("name")) ? device.getName() : (String) config.get("name");
    }

    public static v68 toDiscoveryResultItem(@NonNull NsdServiceInfo nsdServiceInfo, @NonNull Map<i08, Device> map) throws shd {
        String str;
        StereoPairRole stereoPairRole;
        i08 deviceId = getDeviceId(nsdServiceInfo);
        String str2 = null;
        if (deviceId == null) {
            return null;
        }
        Device device = map.get(deviceId);
        zgr zgrVar = StereoPairRole.Companion;
        String attr = getAttr(nsdServiceInfo, "sp");
        zgrVar.getClass();
        StereoPairRole b = zgr.b(attr);
        if (device != null) {
            str2 = getDeviceName(device);
            String certificate = getCertificate(device);
            if (b == null) {
                b = zgr.a(device);
            }
            stereoPairRole = b;
            str = certificate;
        } else {
            str = null;
            stereoPairRole = b;
        }
        if (str2 == null) {
            str2 = nsdServiceInfo.getServiceName();
        }
        return new DiscoveryResultItemImpl(nsdServiceInfo.getServiceName(), str2, deviceId.a, nsdServiceInfo.getHost().getHostAddress(), nsdServiceInfo.getPort(), deviceId.b, stereoPairRole, device != null, str);
    }

    @NonNull
    public static v68 toDiscoveryResultItemDummy(@NonNull i08 i08Var) throws shd {
        return new DiscoveryResultItemImpl("", "", i08Var.a, "inactive", 0, i08Var.b, null, false, null);
    }

    @NonNull
    public static List<v68> toServerResultItems(@NonNull Device device) {
        QuasarNetworkInfo networkInfo = device.getNetworkInfo();
        if (networkInfo == null || networkInfo.getIp().isEmpty()) {
            return new ArrayList(0);
        }
        String certificate = getCertificate(device);
        String deviceName = getDeviceName(device);
        StereoPairRole.Companion.getClass();
        StereoPairRole a = zgr.a(device);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = networkInfo.getIp().iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(new ServerResultItemImpl(deviceName, device.getId(), it.next(), networkInfo.getPort(), device.getPlatform(), a, certificate));
            } catch (Exception e) {
                weo.g.E("Glagol", String.format("Error creating DiscoveryResultItem from device %s", device), e);
            }
        }
        return arrayList;
    }
}
