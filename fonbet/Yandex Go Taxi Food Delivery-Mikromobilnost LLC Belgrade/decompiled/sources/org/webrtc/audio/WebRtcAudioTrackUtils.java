package org.webrtc.audio;

import android.media.AudioTrack;
import com.cloudwebrtc.webrtc.record.AudioTrackInterceptor;
import java.lang.reflect.Field;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes4.dex */
public abstract class WebRtcAudioTrackUtils {
    private static final String TAG = "WebRtcAudioTrackUtils";

    public static void attachOutputCallback(JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule javaAudioDeviceModule) throws NoSuchFieldException, IllegalAccessException, NullPointerException {
        Field declaredField = javaAudioDeviceModule.getClass().getDeclaredField("audioOutput");
        declaredField.setAccessible(true);
        WebRtcAudioTrack webRtcAudioTrack = (WebRtcAudioTrack) declaredField.get(javaAudioDeviceModule);
        Field declaredField2 = webRtcAudioTrack.getClass().getDeclaredField("audioTrack");
        declaredField2.setAccessible(true);
        declaredField2.set(webRtcAudioTrack, new AudioTrackInterceptor((AudioTrack) declaredField2.get(webRtcAudioTrack), samplesReadyCallback));
    }

    public static void detachOutputCallback(JavaAudioDeviceModule javaAudioDeviceModule) {
        try {
            Field declaredField = javaAudioDeviceModule.getClass().getDeclaredField("audioOutput");
            declaredField.setAccessible(true);
            WebRtcAudioTrack webRtcAudioTrack = (WebRtcAudioTrack) declaredField.get(javaAudioDeviceModule);
            Field declaredField2 = webRtcAudioTrack.getClass().getDeclaredField("audioTrack");
            declaredField2.setAccessible(true);
            AudioTrack audioTrack = (AudioTrack) declaredField2.get(webRtcAudioTrack);
            if (audioTrack instanceof AudioTrackInterceptor) {
                declaredField2.set(webRtcAudioTrack, ((AudioTrackInterceptor) audioTrack).originalTrack);
            }
        } catch (Exception unused) {
        }
    }
}
