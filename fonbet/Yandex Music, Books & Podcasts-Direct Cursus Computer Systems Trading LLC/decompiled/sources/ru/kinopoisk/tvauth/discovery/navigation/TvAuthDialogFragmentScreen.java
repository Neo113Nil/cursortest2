package ru.kinopoisk.tvauth.discovery.navigation;

import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cxb;
import defpackage.iuc;
import defpackage.mbt;
import defpackage.otc;
import kotlin.Metadata;
import kotlin.Pair;
import ru.kinopoisk.sdk.easylogin.internal.C1166o9;
import ru.kinopoisk.sdk.easylogin.internal.C1180p9;
import ru.kinopoisk.sdk.easylogin.internal.V9;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/kinopoisk/tvauth/discovery/navigation/TvAuthDialogFragmentScreen;", "Lmbt;", "Liuc;", "android_easylogin_tvauthdiscovery_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class TvAuthDialogFragmentScreen extends mbt implements iuc {
    public final boolean c;
    public final boolean d;

    public TvAuthDialogFragmentScreen(boolean z, boolean z2) {
        super(z, z2);
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.iuc
    public final o a(otc otcVar) {
        otcVar.getClass();
        C1166o9 c1166o9 = new C1166o9(this.c);
        if (this.d) {
            V9.f.getClass();
            V9 v9 = new V9();
            v9.setArguments(cxb.K(new Pair("args", c1166o9)));
            return v9;
        }
        C1180p9.f.getClass();
        C1180p9 c1180p9 = new C1180p9();
        c1180p9.setArguments(cxb.K(new Pair("args", c1166o9)));
        return c1180p9;
    }

    @Override // defpackage.mbt
    /* renamed from: c, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // defpackage.mbt
    /* renamed from: d, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // defpackage.iuc
    public final boolean a() {
        return false;
    }
}
