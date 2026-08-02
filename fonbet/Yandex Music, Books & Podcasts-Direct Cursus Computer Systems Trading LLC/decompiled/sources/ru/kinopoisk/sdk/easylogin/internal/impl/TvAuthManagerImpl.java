package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import defpackage.fs;
import defpackage.pjc;
import defpackage.vdr;
import defpackage.ydr;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.H9;
import ru.kinopoisk.sdk.easylogin.internal.J;

@ContributesBinding(scope = J.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/TvAuthManagerImpl;", "Lru/kinopoisk/sdk/easylogin/internal/H9;", "<init>", "()V", "Lpjc;", "Lru/kinopoisk/sdk/easylogin/internal/H9$a;", "getStartTvAuthFlow", "()Lpjc;", "", "onRemindMeLater", "onDecline", "onAccept", "onConnected", "Lvdr;", "", "showProfileEntryPointFlow", "Lvdr;", "getShowProfileEntryPointFlow", "()Lvdr;", "showMovieCardEntryPointFlow", "getShowMovieCardEntryPointFlow", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class TvAuthManagerImpl implements H9 {

    @NotNull
    public static final TvAuthManagerImpl INSTANCE = new TvAuthManagerImpl();

    @NotNull
    private static final vdr showMovieCardEntryPointFlow;

    @NotNull
    private static final vdr showProfileEntryPointFlow;

    static {
        Boolean bool = Boolean.FALSE;
        showProfileEntryPointFlow = ydr.a(bool);
        showMovieCardEntryPointFlow = ydr.a(bool);
    }

    private TvAuthManagerImpl() {
    }

    @NotNull
    public vdr getShowMovieCardEntryPointFlow() {
        return showMovieCardEntryPointFlow;
    }

    @NotNull
    public vdr getShowProfileEntryPointFlow() {
        return showProfileEntryPointFlow;
    }

    @NotNull
    public pjc getStartTvAuthFlow() {
        return new fs(15, H9.a.C0027a.a);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.H9
    public void onAccept() {
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.H9
    public void onConnected() {
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.H9
    public void onDecline() {
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.H9
    public void onRemindMeLater() {
    }
}
