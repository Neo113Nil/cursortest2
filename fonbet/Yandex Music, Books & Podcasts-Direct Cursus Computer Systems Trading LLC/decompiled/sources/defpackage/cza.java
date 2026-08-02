package defpackage;

import ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider;

/* loaded from: classes3.dex */
public final class cza implements CurrentAccountInfoProvider {
    public final /* synthetic */ gza a;

    public cza(gza gzaVar) {
        this.a = gzaVar;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider
    public final vdr getPuid() {
        return this.a.c;
    }
}
