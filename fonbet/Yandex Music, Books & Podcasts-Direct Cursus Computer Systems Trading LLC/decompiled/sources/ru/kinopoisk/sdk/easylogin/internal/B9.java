package ru.kinopoisk.sdk.easylogin.internal;

import com.squareup.anvil.annotations.ContributesMultibinding;
import defpackage.mbt;
import defpackage.yh2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.tvauth.discovery.navigation.TvAuthDialogFragmentScreen;

@ContributesMultibinding(scope = J.class)
/* loaded from: classes5.dex */
public final class B9 implements D3 {

    @NotNull
    public static final B9 a = new B9();

    @Override // ru.kinopoisk.sdk.easylogin.internal.D3
    public final void a(@NotNull E3 e3) {
        e3.getClass();
        e3.a.put(mbt.class, new yh2(0));
    }

    public static final InterfaceC1274w8 a(mbt mbtVar) {
        mbtVar.getClass();
        return new TvAuthDialogFragmentScreen(mbtVar.getC(), mbtVar.getD());
    }
}
