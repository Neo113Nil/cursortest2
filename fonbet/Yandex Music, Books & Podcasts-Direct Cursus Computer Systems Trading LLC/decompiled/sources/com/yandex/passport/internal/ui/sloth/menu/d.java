package com.yandex.passport.internal.ui.sloth.menu;

import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ UserMenuActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UserMenuActivity userMenuActivity, int i) {
        super(0);
        this.r = i;
        this.s = userMenuActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.getDefaultViewModelProviderFactory();
            case 1:
                return this.s.getViewModelStore();
            default:
                return this.s.getDefaultViewModelCreationExtras();
        }
    }
}
