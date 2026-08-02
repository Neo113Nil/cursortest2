package ru.kinopoisk.tvauth.detected.navigation;

import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cxb;
import defpackage.iuc;
import defpackage.otc;
import kotlin.Metadata;
import kotlin.Pair;
import ru.kinopoisk.sdk.easylogin.internal.B2;
import ru.kinopoisk.sdk.easylogin.internal.C1055ga;
import ru.kinopoisk.sdk.easylogin.internal.C1276wa;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/tvauth/detected/navigation/TvDetectedFragmentScreen;", "Liuc;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class TvDetectedFragmentScreen implements iuc {
    public final B2 a;
    public final boolean b;

    public TvDetectedFragmentScreen(B2 b2, boolean z) {
        this.a = b2;
        this.b = z;
    }

    @Override // defpackage.iuc
    public final o a(otc otcVar) {
        otcVar.getClass();
        o c1276wa = this.b ? new C1276wa() : new C1055ga();
        c1276wa.setArguments(cxb.K(new Pair("args", this.a)));
        return c1276wa;
    }
}
