package androidx.media;

import defpackage.x0u;
import defpackage.z0u;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(x0u x0uVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        z0u z0uVar = audioAttributesCompat.a;
        if (x0uVar.e(1)) {
            z0uVar = x0uVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) z0uVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, x0u x0uVar) {
        x0uVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        x0uVar.i(1);
        x0uVar.l(audioAttributesImpl);
    }
}
