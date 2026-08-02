package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.navigator.repository.SoundMode;

/* loaded from: classes12.dex */
public final class q9t0 {
    public static SoundMode a(String str) {
        return jl40.l(str, Constants.LOW) ? SoundMode.LOW : jl40.l(str, "mid") ? SoundMode.MID : SoundMode.HIGH;
    }
}
