package gb;

import com.onesignal.inAppMessages.internal.display.impl.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
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

    public static final a Companion = new a(null);
    private final String value;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final j fromDeviceType(v8.a aVar) {
            pc.j.e(aVar, n.EVENT_TYPE_KEY);
            int i10 = i.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i10 == 1) {
                return j.ANDROID_PUSH;
            }
            if (i10 == 2) {
                return j.FIREOS_PUSH;
            }
            if (i10 == 3) {
                return j.HUAWEI_PUSH;
            }
            throw new ac.d();
        }

        public final j fromString(String str) {
            pc.j.e(str, n.EVENT_TYPE_KEY);
            for (j jVar : j.values()) {
                if (xc.h.o(jVar.getValue(), str)) {
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

    public final String getValue() {
        return this.value;
    }
}
