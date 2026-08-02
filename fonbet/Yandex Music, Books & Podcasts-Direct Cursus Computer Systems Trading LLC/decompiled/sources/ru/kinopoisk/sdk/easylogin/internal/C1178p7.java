package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdServiceInfo;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.e5b;
import defpackage.tah;
import defpackage.u75;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1233t7;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.p7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1178p7 {

    @NotNull
    public static final List<String> a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/p7$a;", "", "", "DEVICE_ID", "Ljava/lang/String;", "DEVICE_MODEL", "DEVICE_NAME", "DEVICE_OS", "DEVICE_OS_VERSION", "DEVICE_VENDOR", "FEATURES", "", "PAIRING_ATTRIBUTES", "Ljava/util/List;", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.p7$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        a = u75.h("deviceId", "name", CommonUrlParts.MODEL, "vendor", "os", "osversion", "features");
    }

    @NotNull
    public static C1164o7 a(@NotNull NsdServiceInfo nsdServiceInfo) {
        List split$default;
        nsdServiceInfo.getClass();
        String a2 = a(nsdServiceInfo, "deviceId");
        if (a2 == null) {
            xq0.x("Required `deviceId` was null.");
            return null;
        }
        String a3 = a(nsdServiceInfo, "name");
        String str = a3 == null ? "" : a3;
        String a4 = a(nsdServiceInfo, "vendor");
        if (a4 == null) {
            xq0.x("Required `vendor` was null.");
            return null;
        }
        String a5 = a(nsdServiceInfo, CommonUrlParts.MODEL);
        if (a5 == null) {
            xq0.x("Required `model` was null.");
            return null;
        }
        String a6 = a(nsdServiceInfo, "os");
        if (a6 == null) {
            xq0.x("Required `os` was null.");
            return null;
        }
        InterfaceC1233t7 interfaceC1233t7 = InterfaceC1233t7.a.a;
        if (!kotlin.text.c.n("AndroidTv", a6, true)) {
            interfaceC1233t7 = InterfaceC1233t7.b.a;
            if (!kotlin.text.c.n("AppleTv", a6, true)) {
                interfaceC1233t7 = new InterfaceC1233t7.c(a6);
            }
        }
        String a7 = a(nsdServiceInfo, "osversion");
        if (a7 == null) {
            xq0.x("Required `osversion` was null.");
            return null;
        }
        String a8 = a(nsdServiceInfo, "features");
        if (a8 == null) {
            a8 = "";
        }
        split$default = StringsKt__StringsKt.split$default(a8, new String[]{StringUtils.COMMA}, false, 0, 6, null);
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes == null) {
            attributes = e5b.a;
            attributes.getClass();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, byte[]> entry : attributes.entrySet()) {
            if (!a.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            byte[] bArr = (byte[]) entry2.getValue();
            linkedHashMap2.put(key, bArr != null ? new String(bArr, Charsets.UTF_8) : "");
        }
        return new C1164o7(a2, str, a4, a5, interfaceC1233t7, a7, split$default, linkedHashMap2);
    }

    public static String a(NsdServiceInfo nsdServiceInfo, String str) {
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes == null) {
            attributes = e5b.a;
            attributes.getClass();
        }
        byte[] bArr = attributes.get(str);
        if (bArr != null) {
            return new String(bArr, Charsets.UTF_8);
        }
        return null;
    }
}
