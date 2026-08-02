package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.oo31;
import java.util.UUID;
import org.webrtc.Logging;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        ny61.f("Expected condition to be true");
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !r4.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i) {
        Logging.d(TAG, "enable(audioSession=" + i + Extension.C_BRAKE);
        boolean z = false;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        boolean isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String str = BackendConfig.Restrictions.DISABLED;
        if (isAcousticEchoCancelerSupported) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z2 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                String str2 = enabled ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED;
                String str3 = this.aec.getEnabled() ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED;
                StringBuilder l = oo31.l("AcousticEchoCanceler: was ", str2, ", enable: ", ", is now: ", z2);
                l.append(str3);
                Logging.d(TAG, l.toString());
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 == null) {
                Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = create2.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z = true;
            }
            if (this.ns.setEnabled(z) != 0) {
                Logging.e(TAG, "Failed to set the NoiseSuppressor state");
            }
            String str4 = enabled2 ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED;
            if (this.ns.getEnabled()) {
                str = BackendConfig.Restrictions.ENABLED;
            }
            StringBuilder l2 = oo31.l("NoiseSuppressor: was ", str4, ", enable: ", ", is now: ", z);
            l2.append(str);
            Logging.d(TAG, l2.toString());
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.d(TAG, "setAEC(" + z + Extension.C_BRAKE);
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.d(TAG, "setNS(" + z + Extension.C_BRAKE);
        if (!isNoiseSuppressorSupported()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }

    public boolean toggleNS(boolean z) {
        if (this.ns == null) {
            Logging.e(TAG, "Attempting to enable or disable nonexistent NoiseSuppressor.");
            return false;
        }
        Logging.d(TAG, "toggleNS(" + z + Extension.C_BRAKE);
        return this.ns.setEnabled(z) == 0;
    }
}
