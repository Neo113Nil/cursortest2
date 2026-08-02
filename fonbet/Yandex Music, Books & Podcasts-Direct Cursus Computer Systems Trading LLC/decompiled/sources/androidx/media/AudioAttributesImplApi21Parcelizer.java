package androidx.media;

import android.media.AudioAttributes;
import defpackage.x0u;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(x0u x0uVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) x0uVar.g(1, audioAttributesImplApi21.a);
        audioAttributesImplApi21.b = x0uVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, x0u x0uVar) {
        x0uVar.getClass();
        x0uVar.k(1, audioAttributesImplApi21.a);
        x0uVar.j(audioAttributesImplApi21.b, 2);
    }
}
