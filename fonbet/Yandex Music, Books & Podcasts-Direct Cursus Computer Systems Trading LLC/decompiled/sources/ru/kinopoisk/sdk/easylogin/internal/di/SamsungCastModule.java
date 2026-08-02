package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesTo;
import defpackage.msa;
import defpackage.nsa;
import defpackage.ssa;
import defpackage.yd5;
import kotlin.Metadata;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C0983b8;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import ru.kinopoisk.sdk.easylogin.internal.C1261v8;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.J8;
import ru.kinopoisk.sdk.easylogin.internal.K8;
import ru.kinopoisk.sdk.easylogin.internal.O6;
import ru.kinopoisk.sdk.easylogin.internal.O8;
import ru.kinopoisk.sdk.easylogin.internal.Q;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/SamsungCastModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/kinopoisk/sdk/easylogin/internal/Q;", "authTokenProvides", "Lru/kinopoisk/sdk/easylogin/internal/O6;", "networkStateProvider", "Lru/kinopoisk/sdk/easylogin/internal/F0;", "castSessionLogger", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "dispatchersProvider", "Lru/kinopoisk/sdk/easylogin/internal/z0;", "provideCastDevicesManager", "(Landroid/content/Context;Lru/kinopoisk/sdk/easylogin/internal/Q;Lru/kinopoisk/sdk/easylogin/internal/O6;Lru/kinopoisk/sdk/easylogin/internal/F0;Lru/kinopoisk/sdk/easylogin/internal/Q2;)Lru/kinopoisk/sdk/easylogin/internal/z0;", "Lru/kinopoisk/sdk/easylogin/internal/v8;", "provideSamsungTvInteractorFactory", "(Landroid/content/Context;Lru/kinopoisk/sdk/easylogin/internal/Q2;)Lru/kinopoisk/sdk/easylogin/internal/v8;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@ContributesTo(scope = J.class)
/* loaded from: classes5.dex */
public final class SamsungCastModule {

    @NotNull
    public static final SamsungCastModule INSTANCE = new SamsungCastModule();

    private SamsungCastModule() {
    }

    @CastTypeKey(InterfaceC1305z0.c.SamsungCast)
    @NotNull
    public final InterfaceC1305z0 provideCastDevicesManager(@NotNull Context context, @NotNull Q authTokenProvides, @NotNull O6 networkStateProvider, @NotNull F0 castSessionLogger, @NotNull Q2 dispatchersProvider) {
        context.getClass();
        authTokenProvides.getClass();
        networkStateProvider.getClass();
        castSessionLogger.getClass();
        dispatchersProvider.getClass();
        a a = dispatchersProvider.a();
        context.getClass();
        authTokenProvides.getClass();
        networkStateProvider.getClass();
        castSessionLogger.getClass();
        a.getClass();
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.SECONDS;
        J8 j8 = new J8(yd5.M(2, ssaVar), yd5.M(2, ssaVar), null);
        return new C0983b8(new K8(context, new O8(), j8, castSessionLogger), castSessionLogger, j8, new C1198r0(authTokenProvides, networkStateProvider), a);
    }

    @NotNull
    public final C1261v8 provideSamsungTvInteractorFactory(@NotNull Context context, @NotNull Q2 dispatchersProvider) {
        context.getClass();
        dispatchersProvider.getClass();
        return new C1261v8(context, dispatchersProvider);
    }
}
