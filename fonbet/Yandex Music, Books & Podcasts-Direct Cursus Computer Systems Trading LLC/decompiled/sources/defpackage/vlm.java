package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class vlm extends br2 {
    public final List c;
    public final ofb d;

    public vlm() {
        super(1);
        this.c = t75.c(PlaybackException.class);
        ufb.f0.getClass();
        this.d = new ofb(new nfb(tfb.c, true), this);
    }

    @Override // defpackage.br2, defpackage.ufb
    public final boolean b(PlaybackException playbackException) {
        if (super.b(playbackException) && !(playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl)) {
            if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder) {
                String decoderName = ((PlaybackException.ErrorInstantiatingDecoder) playbackException).getDecoderName();
                return decoderName != null && (StringsKt.M(decoderName, "hevc", true) || StringsKt.M(decoderName, "h265", true));
            }
            if (!(playbackException instanceof PlaybackException.ErrorInRenderer)) {
                return true;
            }
            Map<String, Object> details = playbackException.getDetails();
            Object orDefault = details != null ? details.getOrDefault("decoderName", null) : null;
            if (orDefault != null && (orDefault instanceof String)) {
                CharSequence charSequence = (CharSequence) orDefault;
                if (StringsKt.M(charSequence, "hevc", true) || StringsKt.M(charSequence, "h265", true)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.br2
    public final qld d() {
        return this.d;
    }

    @Override // defpackage.br2
    public final List g() {
        return this.c;
    }
}
