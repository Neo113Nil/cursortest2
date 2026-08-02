package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.os.Handler;
import androidx.media3.common.AudioAttributes;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class AudioFocusRequestCompat {
    public final AudioAttributes audioAttributes;
    public final Handler focusChangeHandler;
    public final int focusGain;
    public final AudioFocusRequest frameworkAudioFocusRequest;
    public final AudioFocusManager$$ExternalSyntheticLambda1 onAudioFocusChangeListener;

    public AudioFocusRequestCompat(int i, AudioFocusManager$$ExternalSyntheticLambda1 audioFocusManager$$ExternalSyntheticLambda1, Handler handler, AudioAttributes audioAttributes, boolean z) {
        this.focusGain = i;
        this.focusChangeHandler = handler;
        this.audioAttributes = audioAttributes;
        this.onAudioFocusChangeListener = audioFocusManager$$ExternalSyntheticLambda1;
        this.frameworkAudioFocusRequest = new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes.getPlatformAudioAttributes()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(audioFocusManager$$ExternalSyntheticLambda1, handler).setAcceptsDelayedFocusGain(z).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioFocusRequestCompat) {
            AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
            if (this.focusGain == audioFocusRequestCompat.focusGain && this.onAudioFocusChangeListener == audioFocusRequestCompat.onAudioFocusChangeListener && Objects.equals(this.focusChangeHandler, audioFocusRequestCompat.focusChangeHandler) && Objects.equals(this.audioAttributes, audioFocusRequestCompat.audioAttributes)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.focusGain), this.onAudioFocusChangeListener, this.focusChangeHandler, this.audioAttributes, Boolean.FALSE);
    }
}
