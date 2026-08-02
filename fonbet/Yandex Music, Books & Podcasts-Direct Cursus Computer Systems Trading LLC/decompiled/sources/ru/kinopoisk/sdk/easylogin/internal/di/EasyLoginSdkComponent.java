package ru.kinopoisk.sdk.easylogin.internal.di;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.MergeComponent;
import defpackage.dvw;
import defpackage.gvw;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies;
import ru.kinopoisk.sdk.easylogin.internal.G4;
import ru.kinopoisk.sdk.easylogin.internal.H4;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.di.HostActivityViewModelComponentImpl;

@MergeComponent(dependencies = {EasyLoginDependencies.class}, scope = J.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/EasyLoginSdkComponent;", "Lgvw;", "Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl$Factory;", "activityViewModelComponentFactory", "()Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl$Factory;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface EasyLoginSdkComponent extends gvw, G4 {
    @Override // defpackage.gvw
    @NotNull
    /* synthetic */ dvw activityViewModelComponentFactory();

    @Override // defpackage.gvw
    @NotNull
    HostActivityViewModelComponentImpl.Factory activityViewModelComponentFactory();

    @NotNull
    /* synthetic */ H4 getGoogleCastSettingProvider();
}
