package ru.kinopoisk.sdk.easylogin.internal;

import com.squareup.anvil.annotations.ContributesMultibinding;
import defpackage.xbt;
import defpackage.yh2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.tvauth.discovery.navigation.TvDiscoveryDialogFragmentScreen;

@ContributesMultibinding(scope = J.class)
/* loaded from: classes5.dex */
public final class Na implements D3 {

    @NotNull
    public static final Na a = new Na();

    @Override // ru.kinopoisk.sdk.easylogin.internal.D3
    public final void a(@NotNull E3 e3) {
        e3.getClass();
        e3.a.put(xbt.class, new yh2(1));
    }

    public static final InterfaceC1274w8 a(xbt xbtVar) {
        xbtVar.getClass();
        return new TvDiscoveryDialogFragmentScreen(xbtVar.getC(), xbtVar.getD());
    }
}
