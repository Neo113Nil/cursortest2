package ru.yandex.taxi.settings.account;

import com.yandex.go.account.upgrade.f;
import defpackage.j20;
import defpackage.jm;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes10.dex */
public final class c {
    public final j20 a;
    public final jm b;

    public c(j20 j20Var, jm jmVar) {
        this.a = j20Var;
        this.b = jmVar;
    }

    public final m0 a() {
        return new m0(((f) this.b).a(), ((com.yandex.go.user_profile.settings.profile.data.b) this.a).a(), new UpgradeAccountMenuItemUiStateRepository$uiStateFlow$1(3, null));
    }
}
