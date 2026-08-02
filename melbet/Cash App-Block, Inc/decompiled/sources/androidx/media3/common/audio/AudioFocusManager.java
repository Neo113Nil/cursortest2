package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import com.google.android.gms.internal.fido.zzfz;
import com.google.common.base.Supplier;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public final class AudioFocusManager {
    public AudioAttributes audioAttributes;
    public AudioFocusRequestCompat audioFocusRequest;
    public final Supplier audioManager;
    public final Handler eventHandler;
    public int focusGainToRequest;
    public ExoPlayerImplInternal playerControl;
    public float volumeMultiplier = 1.0f;
    public int audioFocusState = 0;

    public AudioFocusManager(Context context, Looper looper, ExoPlayerImplInternal exoPlayerImplInternal) {
        this.audioManager = Strings.memoize(new ExoPlayer$Builder$$ExternalSyntheticLambda0(context, 1));
        this.playerControl = exoPlayerImplInternal;
        this.eventHandler = new Handler(looper);
    }

    public final void abandonAudioFocusIfHeld() {
        int i = this.audioFocusState;
        if (i == 1 || i == 0 || this.audioFocusRequest == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.audioManager.get();
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest.frameworkAudioFocusRequest;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void setAudioFocusState(int i) {
        if (this.audioFocusState == i) {
            return;
        }
        this.audioFocusState = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier == f) {
            return;
        }
        this.volumeMultiplier = f;
        ExoPlayerImplInternal exoPlayerImplInternal = this.playerControl;
        if (exoPlayerImplInternal != null) {
            exoPlayerImplInternal.handler.sendEmptyMessage(34);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.media3.common.audio.AudioFocusManager$$ExternalSyntheticLambda1] */
    public final int updateAudioFocus(int i, boolean z) {
        int i2;
        zzfz zzfzVar;
        if (i == 1 || (i2 = this.focusGainToRequest) != 1) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        int i3 = this.audioFocusState;
        if (z) {
            if (i3 != 2) {
                AudioFocusRequestCompat audioFocusRequestCompat = this.audioFocusRequest;
                if (audioFocusRequestCompat == null) {
                    if (audioFocusRequestCompat == null) {
                        zzfzVar = new zzfz();
                        zzfzVar.zza = AudioAttributes.DEFAULT;
                        zzfzVar.zzb = i2;
                    } else {
                        zzfz zzfzVar2 = new zzfz();
                        zzfzVar2.zzb = audioFocusRequestCompat.focusGain;
                        zzfzVar2.zza = audioFocusRequestCompat.audioAttributes;
                        zzfzVar = zzfzVar2;
                    }
                    AudioAttributes audioAttributes = this.audioAttributes;
                    audioAttributes.getClass();
                    zzfzVar.zza = audioAttributes;
                    zzfzVar.zzc = true;
                    ?? r6 = new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.common.audio.AudioFocusManager$$ExternalSyntheticLambda1
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            AudioFocusManager audioFocusManager = AudioFocusManager.this;
                            audioFocusManager.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2) {
                                    audioFocusManager.setAudioFocusState(4);
                                    return;
                                }
                                ExoPlayerImplInternal exoPlayerImplInternal = audioFocusManager.playerControl;
                                if (exoPlayerImplInternal != null) {
                                    exoPlayerImplInternal.handler.obtainMessage(33, 0, 0).sendToTarget();
                                }
                                audioFocusManager.setAudioFocusState(3);
                                return;
                            }
                            if (i4 == -1) {
                                ExoPlayerImplInternal exoPlayerImplInternal2 = audioFocusManager.playerControl;
                                if (exoPlayerImplInternal2 != null) {
                                    exoPlayerImplInternal2.handler.obtainMessage(33, -1, 0).sendToTarget();
                                }
                                audioFocusManager.abandonAudioFocusIfHeld();
                                audioFocusManager.setAudioFocusState(1);
                                return;
                            }
                            if (i4 != 1) {
                                Fragment$5$$ExternalSyntheticOutline0.m(i4, "Unknown focus change type: ", "AudioFocusManager");
                                return;
                            }
                            audioFocusManager.setAudioFocusState(2);
                            ExoPlayerImplInternal exoPlayerImplInternal3 = audioFocusManager.playerControl;
                            if (exoPlayerImplInternal3 != null) {
                                exoPlayerImplInternal3.handler.obtainMessage(33, 1, 0).sendToTarget();
                            }
                        }
                    };
                    Handler handler = this.eventHandler;
                    handler.getClass();
                    this.audioFocusRequest = new AudioFocusRequestCompat(zzfzVar.zzb, r6, handler, (AudioAttributes) zzfzVar.zza, zzfzVar.zzc);
                }
                AudioManager audioManager = (AudioManager) this.audioManager.get();
                AudioFocusRequest audioFocusRequest = this.audioFocusRequest.frameworkAudioFocusRequest;
                audioFocusRequest.getClass();
                int requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                if (requestAudioFocus == 1 || requestAudioFocus == 2) {
                    setAudioFocusState(2);
                    return 1;
                }
                setAudioFocusState(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
