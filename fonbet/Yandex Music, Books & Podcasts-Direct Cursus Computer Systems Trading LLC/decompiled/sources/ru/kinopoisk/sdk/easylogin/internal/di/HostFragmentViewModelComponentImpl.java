package ru.kinopoisk.sdk.easylogin.internal.di;

import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.MergeSubcomponent;
import defpackage.f9f;
import defpackage.ivw;
import defpackage.kvw;
import defpackage.lvw;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.B2;
import ru.kinopoisk.sdk.easylogin.internal.C1078i5;
import ru.kinopoisk.sdk.easylogin.internal.I9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta;
import ru.kinopoisk.sdk.easylogin.internal.R3;
import ru.kinopoisk.sdk.easylogin.internal.T7;
import ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl;

@MergeSubcomponent(scope = R3.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl;", "Llvw;", "Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentComponentImpl$Factory;", "fragmentComponentFactory", "()Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentComponentImpl$Factory;", "Factory", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface HostFragmentViewModelComponentImpl extends lvw, InterfaceC1236ta {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl$Factory;", "Lkvw;", "Lf9f;", "Landroidx/fragment/app/o;", "fragmentClass", "Landroid/os/Bundle;", "arguments", "Lru/kinopoisk/sdk/easylogin/internal/R3;", "parentFragmentViewModelComponent", "Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl;", "create", "(Lf9f;Landroid/os/Bundle;Lru/kinopoisk/sdk/easylogin/internal/R3;)Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface Factory extends kvw {
        @Override // defpackage.kvw
        @NotNull
        /* synthetic */ lvw create(@NotNull f9f f9fVar, Bundle bundle, R3 r3);

        @Override // defpackage.kvw
        @NotNull
        HostFragmentViewModelComponentImpl create(@NotNull f9f fragmentClass, Bundle arguments, R3 parentFragmentViewModelComponent);
    }

    @NotNull
    /* synthetic */ B2 detectedScreenArgs();

    @Override // defpackage.lvw
    @NotNull
    /* synthetic */ ivw fragmentComponentFactory();

    @Override // defpackage.lvw
    @NotNull
    HostFragmentComponentImpl.Factory fragmentComponentFactory();

    @NotNull
    /* synthetic */ T7 fragmentRouter();

    @NotNull
    /* synthetic */ C1078i5 isAuthFlowSuccessfulHolder();

    @NotNull
    /* synthetic */ I9 tvAuthScenarioManager();
}
