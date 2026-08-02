package com.yandex.passport.internal.ui.sloth.menu;

/* loaded from: classes4.dex */
public final class n implements com.yandex.passport.sloth.dependencies.f {
    public final com.yandex.passport.internal.sloth.performers.usermenu.b a;
    public final com.yandex.passport.internal.sloth.performers.usermenu.b b;

    public n(com.yandex.passport.internal.sloth.performers.usermenu.b bVar, com.yandex.passport.internal.sloth.performers.usermenu.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // com.yandex.passport.sloth.dependencies.f
    public final com.yandex.passport.sloth.command.t a(com.yandex.passport.common.web.a aVar) {
        int ordinal = aVar.ordinal();
        com.yandex.passport.internal.sloth.performers.usermenu.b bVar = ordinal != 24 ? ordinal != 31 ? null : this.b : this.a;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
