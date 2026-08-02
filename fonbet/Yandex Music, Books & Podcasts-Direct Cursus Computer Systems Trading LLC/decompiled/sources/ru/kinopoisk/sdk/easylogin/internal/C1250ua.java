package ru.kinopoisk.sdk.easylogin.internal;

import com.squareup.anvil.annotations.ContributesMultibinding;
import defpackage.vbt;
import defpackage.yh2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.tvauth.detected.navigation.TvDetectedFragmentScreen;

@ContributesMultibinding(scope = J.class)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ua, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1250ua implements D3 {

    @NotNull
    public static final C1250ua a = new C1250ua();

    @Override // ru.kinopoisk.sdk.easylogin.internal.D3
    public final void a(@NotNull E3 e3) {
        e3.getClass();
        e3.a.put(vbt.class, new yh2(3));
    }

    public static final InterfaceC1274w8 a(vbt vbtVar) {
        vbtVar.getClass();
        return new TvDetectedFragmentScreen(vbtVar.a, vbtVar.b);
    }
}
