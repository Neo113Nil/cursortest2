package defpackage;

import com.yandex.go.splash.data.dto.SplashScreenType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class srt0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SplashScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
