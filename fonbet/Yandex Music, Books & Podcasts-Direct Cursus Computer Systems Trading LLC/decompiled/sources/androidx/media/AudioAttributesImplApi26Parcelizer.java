package androidx.media;

import android.media.AudioAttributes;
import defpackage.x0u;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(x0u x0uVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) x0uVar.g(1, audioAttributesImplApi26.a);
        audioAttributesImplApi26.b = x0uVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, x0u x0uVar) {
        x0uVar.getClass();
        x0uVar.k(1, audioAttributesImplApi26.a);
        x0uVar.j(audioAttributesImplApi26.b, 2);
    }
}
