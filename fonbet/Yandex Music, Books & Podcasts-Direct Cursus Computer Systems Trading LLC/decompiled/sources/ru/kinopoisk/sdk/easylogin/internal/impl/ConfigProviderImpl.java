package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import defpackage.eno;
import defpackage.pjc;
import defpackage.vdr;
import defpackage.ydr;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.api.CustomTvAuthConfig;
import ru.kinopoisk.sdk.easylogin.api.CustomTvAuthConfigKt;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies;
import ru.kinopoisk.sdk.easylogin.internal.C0967a6;
import ru.kinopoisk.sdk.easylogin.internal.C1041fa;
import ru.kinopoisk.sdk.easylogin.internal.C1248u8;
import ru.kinopoisk.sdk.easylogin.internal.C1301y9;
import ru.kinopoisk.sdk.easylogin.internal.D1;
import ru.kinopoisk.sdk.easylogin.internal.F1;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.K1;
import ru.kinopoisk.sdk.easylogin.internal.M1;

@ContributesBinding(scope = J.class)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000e\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/ConfigProviderImpl;", "Lru/kinopoisk/sdk/easylogin/internal/F1;", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;", "dependencies", "<init>", "(Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;)V", "T", "Lru/kinopoisk/sdk/easylogin/internal/D1;", "descriptor", "getDescriptorValue", "(Lru/kinopoisk/sdk/easylogin/internal/D1;)Ljava/lang/Object;", "Lru/kinopoisk/sdk/easylogin/internal/K1;", "getValue", "(Lru/kinopoisk/sdk/easylogin/internal/D1;)Lru/kinopoisk/sdk/easylogin/internal/K1;", "Lpjc;", "getValueFlow", "(Lru/kinopoisk/sdk/easylogin/internal/D1;)Lpjc;", "", "update", "()V", "Lru/kinopoisk/sdk/easylogin/api/EasyLoginDependencies;", "Lvdr;", "Lru/kinopoisk/sdk/easylogin/internal/F1$a;", "getStateFlow", "()Lvdr;", "stateFlow", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ConfigProviderImpl implements F1 {

    @NotNull
    private final EasyLoginDependencies dependencies;

    public ConfigProviderImpl(@NotNull EasyLoginDependencies easyLoginDependencies) {
        easyLoginDependencies.getClass();
        this.dependencies = easyLoginDependencies;
    }

    private final <T> T getDescriptorValue(D1<T> descriptor) {
        T t;
        if (descriptor instanceof C1301y9) {
            CustomTvAuthConfig config = this.dependencies.getConfig();
            if (config == null || (t = (T) CustomTvAuthConfigKt.mapToTvAuthConfigModel(config)) == null) {
                t = (T) C1301y9.b;
            }
        } else {
            t = descriptor instanceof C1041fa ? (T) Boolean.FALSE : descriptor instanceof C0967a6 ? (T) C0967a6.b : descriptor instanceof C1248u8 ? (T) C1248u8.b : null;
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.F1
    @NotNull
    public vdr getStateFlow() {
        return ydr.a(F1.a.Snapshot);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.F1
    @NotNull
    public <T> K1<T> getValue(@NotNull D1<T> descriptor) {
        descriptor.getClass();
        Object descriptorValue = getDescriptorValue(descriptor);
        if (descriptorValue == null) {
            throw new IllegalStateException(descriptor.toString().toString());
        }
        M1.a.getClass();
        return new K1<>(descriptorValue, M1.a.b);
    }

    @NotNull
    public <T> pjc getValueFlow(@NotNull D1<T> descriptor) {
        descriptor.getClass();
        return new eno(new ConfigProviderImpl$getValueFlow$1(this, descriptor, null));
    }

    public void update() {
    }
}
