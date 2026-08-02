package com.yandex.passport.internal.ui.sloth;

import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class u extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ StandaloneSlothComposeActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(StandaloneSlothComposeActivity standaloneSlothComposeActivity, int i) {
        super(0);
        this.r = i;
        this.s = standaloneSlothComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.getViewModelStore();
            default:
                return this.s.getDefaultViewModelCreationExtras();
        }
    }
}
