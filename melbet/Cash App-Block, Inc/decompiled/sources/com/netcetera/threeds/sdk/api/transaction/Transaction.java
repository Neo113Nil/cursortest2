package com.netcetera.threeds.sdk.api.transaction;

import android.app.Activity;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.api.ui.ProgressView;

/* loaded from: classes5.dex */
public interface Transaction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BridgingMessageExtensionVersion {
        private final String value;
        public static final BridgingMessageExtensionVersion V10 = new BridgingMessageExtensionVersion("V10", 0, "1.0");
        public static final BridgingMessageExtensionVersion V20 = new BridgingMessageExtensionVersion("V20", 1, "2.0");
        private static final /* synthetic */ BridgingMessageExtensionVersion[] $VALUES = $values();
        private static int get;
        private static int ThreeDS2ServiceInstance = (get + 81) % 128;

        private static /* synthetic */ BridgingMessageExtensionVersion[] $values() {
            BridgingMessageExtensionVersion[] bridgingMessageExtensionVersionArr;
            int i = ThreeDS2ServiceInstance + 67;
            int i2 = i % 128;
            get = i2;
            if (i % 2 != 0) {
                bridgingMessageExtensionVersionArr = new BridgingMessageExtensionVersion[3];
                bridgingMessageExtensionVersionArr[0] = V10;
                bridgingMessageExtensionVersionArr[0] = V20;
            } else {
                bridgingMessageExtensionVersionArr = new BridgingMessageExtensionVersion[]{V10, V20};
            }
            int i3 = i2 + 63;
            ThreeDS2ServiceInstance = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 97 / 0;
            }
            return bridgingMessageExtensionVersionArr;
        }

        private BridgingMessageExtensionVersion(String str, int i, String str2) {
            this.value = str2;
        }

        public static BridgingMessageExtensionVersion valueOf(String str) {
            int i = get + 13;
            ThreeDS2ServiceInstance = i % 128;
            int i2 = i % 2;
            BridgingMessageExtensionVersion bridgingMessageExtensionVersion = (BridgingMessageExtensionVersion) Enum.valueOf(BridgingMessageExtensionVersion.class, str);
            if (i2 == 0) {
                int i3 = 6 / 0;
            }
            get = (ThreeDS2ServiceInstance + 99) % 128;
            return bridgingMessageExtensionVersion;
        }

        public static BridgingMessageExtensionVersion[] values() {
            int i = ThreeDS2ServiceInstance + 11;
            get = i % 128;
            if (i % 2 == 0) {
                return (BridgingMessageExtensionVersion[]) $VALUES.clone();
            }
            $VALUES.clone();
            throw null;
        }

        public String getValue() {
            int i = ThreeDS2ServiceInstance;
            String str = this.value;
            int i2 = i + 51;
            get = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    void close();

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i);

    AuthenticationRequestParameters getAuthenticationRequestParameters();

    ProgressView getProgressView(Activity activity);

    void useBridgingExtension(BridgingMessageExtensionVersion bridgingMessageExtensionVersion);
}
