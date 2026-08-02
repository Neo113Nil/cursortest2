package defpackage;

import com.yandex.mapkit.annotations.LocalizedPhrase;
import com.yandex.mapkit.annotations.Speaker;
import com.yandex.mapkit.annotations.SpeakerPhraseToken;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class wnt0 implements Speaker {
    public final /* synthetic */ pmj a;

    public wnt0(pmj pmjVar) {
        this.a = pmjVar;
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final double duration(LocalizedPhrase localizedPhrase) {
        String obj = rsq0.e(localizedPhrase).toString();
        aot0 aot0Var = this.a.d;
        if (!aot0Var.a()) {
            gw00.e(new Pair("phrase", obj));
            if (!gv00.b) {
                return 1.0d;
            }
            gv00.c.contains("speaker.not_initialized_durations");
            return 1.0d;
        }
        znt0 znt0Var = (znt0) aot0Var.a;
        double d = 0.0d;
        for (SpeakerPhraseToken speakerPhraseToken : localizedPhrase.getTokens()) {
            Double d2 = (Double) znt0Var.a.get(speakerPhraseToken);
            if (d2 == null) {
                b.i(new Pair(AuthSdkActivity.RESPONSE_TYPE_TOKEN, speakerPhraseToken.name().toLowerCase(Locale.ROOT)), new Pair("phrase", obj), new Pair("sum", String.valueOf(d)));
                if (gv00.b) {
                    gv00.c.contains("speaker.not_implemented_duration");
                }
                d += 0.0d;
            } else {
                d = d2.doubleValue() + d;
            }
        }
        return d;
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void reset() {
        yeo yeoVar;
        pmj pmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "reset"));
            if ((e instanceof zy11) || (yeoVar = pmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = pmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(pmjVar.getClass().getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void say(LocalizedPhrase localizedPhrase) {
        this.a.c(new gas0(21, localizedPhrase));
    }
}
