package com.gamericefishpro.space.vg;

import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.oh.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum j {
    IOS_PUSH("iOSPush"),
    ANDROID_PUSH("AndroidPush"),
    FIREOS_PUSH("FireOSPush"),
    CHROME_EXTENSION("ChromeExtensionPush"),
    CHROME_PUSH("ChromePush"),
    WINDOWS_PUSH("WindowsPush"),
    SAFARI_PUSH("SafariPush"),
    SAFARI_PUSH_LEGACY("SafariLegacyPush"),
    FIREFOX_PUSH("FirefoxPush"),
    MACOS_PUSH("macOSPush"),
    EMAIL("Email"),
    HUAWEI_PUSH("HuaweiPush"),
    SMS("SMS");

    private final String value;
    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j fromDeviceType(com.gamericefishpro.space.vc.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i = i.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return j.ANDROID_PUSH;
            }
            if (i == 2) {
                return j.FIREOS_PUSH;
            }
            if (i == 3) {
                return j.HUAWEI_PUSH;
            }
            throw new k();
        }

        public final j fromString(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            for (j jVar : j.values()) {
                if (kotlin.text.d.g(jVar.getValue(), type, true)) {
                    return jVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    j(String str) {
        this.value = str;
    }

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
