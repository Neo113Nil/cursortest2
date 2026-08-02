package defpackage;

import com.yandex.messaging.input.voice.record.SpeechKitVoiceRecordPlugin;
import com.yandex.messaging.input.voice.record.api.VoiceRecordController;

/* loaded from: classes15.dex */
public final class q320 extends r320 {
    public static final q320 a = new q320();

    public static final g0c d() {
        return qoi0.a(SpeechKitVoiceRecordPlugin.class);
    }

    @Override // defpackage.r320
    public final g0c a() {
        return qoi0.a(VoiceRecordController.class);
    }

    @Override // defpackage.r320
    public final sls b() {
        return new g320(8);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q320);
    }

    public final int hashCode() {
        return 1273020874;
    }

    public final String toString() {
        return "VoiceRecordSpeechKit";
    }
}
