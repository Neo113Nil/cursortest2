package androidx.media;

import defpackage.x0u;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(x0u x0uVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = x0uVar.f(0, 1);
        audioAttributesImplBase.b = x0uVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = x0uVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = x0uVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, x0u x0uVar) {
        x0uVar.getClass();
        x0uVar.j(audioAttributesImplBase.a, 1);
        x0uVar.j(audioAttributesImplBase.b, 2);
        x0uVar.j(audioAttributesImplBase.c, 3);
        x0uVar.j(audioAttributesImplBase.d, 4);
    }
}
