package com.yandex.passport.internal.sloth.credentialmanager;

import android.os.Bundle;
import defpackage.hq0;
import defpackage.wyf;
import defpackage.x97;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class RequestCredentialManagerActivity extends hq0 {
    public static final /* synthetic */ int a = 0;

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        credentialManagerInterface.d(this);
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(credentialManagerInterface, this, (Continuation) null, 5), 3);
    }
}
