package defpackage;

import android.speech.tts.TextToSpeech;
import com.yandex.mapkit.annotations.LocalizedPhrase;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class sj11 extends gf50 {
    public final TextToSpeech a;
    public float b;

    public sj11(TextToSpeech textToSpeech, float f) {
        this.a = textToSpeech;
        this.b = f;
    }

    @Override // defpackage.gf50
    public final void a(float f) {
        this.b = f;
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final double duration(LocalizedPhrase localizedPhrase) {
        return (localizedPhrase.getText().length() * 0.06d) + 0.6d;
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void reset() {
        this.a.stop();
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void say(LocalizedPhrase localizedPhrase) {
        this.a.speak(localizedPhrase.getText(), 0, wwg.g(new Pair("volume", Float.valueOf(this.b))), UUID.randomUUID().toString());
    }
}
