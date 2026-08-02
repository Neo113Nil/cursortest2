package defpackage;

import android.content.Context;
import ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider;
import ru.kinopoisk.sdk.easylogin.api.CustomTvAuthConfig;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsFactory;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider;
import ru.kinopoisk.sdk.easylogin.api.UserCodeVerifier;

/* loaded from: classes3.dex */
public final class gza implements EasyLoginDependencies {
    public final Context a;
    public final o b;
    public final fkn c;
    public final jyr d = btf.b(new ita(3, this));
    public final fza e = new fza(this);
    public final cza f = new cza(this);
    public final jyr g = btf.b(new tka(10));
    public final qbt h = new qbt();
    public final eza i = new eza();

    public gza(Context context, o oVar, frt frtVar) {
        this.a = context;
        this.b = oVar;
        this.c = lg3.u0(new ub7(5, frtVar.g(), this), cmd.a, 0L);
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final EasyLoginAnalyticsFactory getAnalyticsFactory() {
        return (EasyLoginAnalyticsFactory) this.d.getValue();
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final CustomTvAuthConfig getConfig() {
        Boolean bool = Boolean.TRUE;
        return new CustomTvAuthConfig(null, null, null, null, null, null, null, null, bool, null, null, null, null, null, null, null, null, bool, 130815, null);
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final Context getContext() {
        return this.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final CurrentAccountInfoProvider getCurrentAccountInfoProvider() {
        return this.f;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final EasyLoginApi.Language getForcedLanguage() {
        return (EasyLoginApi.Language) this.g.getValue();
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final nbt getResProvider() {
        return this.h;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final EasyLoginThemeProvider getThemeProvider() {
        return this.i;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies
    public final UserCodeVerifier getUserCodeVerifier() {
        return this.e;
    }
}
