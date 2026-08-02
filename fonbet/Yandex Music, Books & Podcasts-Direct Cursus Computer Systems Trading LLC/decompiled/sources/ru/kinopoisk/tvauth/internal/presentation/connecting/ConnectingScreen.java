package ru.kinopoisk.tvauth.internal.presentation.connecting;

import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cxb;
import defpackage.iuc;
import defpackage.otc;
import defpackage.uuw;
import kotlin.Metadata;
import kotlin.Pair;
import ru.kinopoisk.sdk.easylogin.internal.Q1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/tvauth/internal/presentation/connecting/ConnectingScreen;", "Liuc;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ConnectingScreen implements iuc {
    public final Q1 a;

    public ConnectingScreen(Q1 q1) {
        this.a = q1;
    }

    @Override // defpackage.iuc
    public final o a(otc otcVar) {
        otcVar.getClass();
        uuw uuwVar = new uuw();
        uuwVar.setArguments(cxb.K(new Pair("args", this.a)));
        return uuwVar;
    }
}
