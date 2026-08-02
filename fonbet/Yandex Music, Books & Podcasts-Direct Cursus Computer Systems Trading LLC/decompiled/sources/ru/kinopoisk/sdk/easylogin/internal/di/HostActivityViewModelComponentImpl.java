package ru.kinopoisk.sdk.easylogin.internal.di;

import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.MergeSubcomponent;
import defpackage.dvw;
import defpackage.f9f;
import defpackage.fvw;
import defpackage.kvw;
import defpackage.luw;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1170p;
import ru.kinopoisk.sdk.easylogin.internal.di.HostActivityComponentImpl;
import ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl;

@MergeSubcomponent(scope = InterfaceC1170p.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl;", "Lfvw;", "Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityComponentImpl$Factory;", "activityComponentFactory", "()Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityComponentImpl$Factory;", "Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl$Factory;", "fragmentViewModelComponentFactory", "()Lru/kinopoisk/sdk/easylogin/internal/di/HostFragmentViewModelComponentImpl$Factory;", "Factory", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface HostActivityViewModelComponentImpl extends fvw {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl$Factory;", "Ldvw;", "Lf9f;", "Lhn5;", "activityClass", "Landroid/os/Bundle;", "extras", "Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl;", "create", "(Lf9f;Landroid/os/Bundle;)Lru/kinopoisk/sdk/easylogin/internal/di/HostActivityViewModelComponentImpl;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface Factory extends dvw {
        @Override // defpackage.dvw
        @NotNull
        /* synthetic */ fvw create(@NotNull f9f f9fVar, Bundle bundle);

        @Override // defpackage.dvw
        @NotNull
        HostActivityViewModelComponentImpl create(@NotNull f9f activityClass, Bundle extras);
    }

    @Override // defpackage.fvw
    @NotNull
    /* synthetic */ luw activityComponentFactory();

    @Override // defpackage.fvw
    @NotNull
    HostActivityComponentImpl.Factory activityComponentFactory();

    @Override // defpackage.fvw
    @NotNull
    /* synthetic */ kvw fragmentViewModelComponentFactory();

    @Override // defpackage.fvw
    @NotNull
    HostFragmentViewModelComponentImpl.Factory fragmentViewModelComponentFactory();
}
