package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.report.we;
import defpackage.hq0;
import defpackage.wyf;
import defpackage.x97;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class SaveCredentialManagerActivity extends hq0 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Object obj;
        Bundle extras;
        super.onCreate(bundle);
        d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        credentialManagerInterface.d(this);
        Intent intent = getIntent();
        Continuation continuation = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("username_key");
            String string2 = extras.getString("password_key");
            String string3 = extras.getString("response_key");
            boolean z = extras.getBoolean("is_from_dialog_key");
            if (string3 != null) {
                obj = new b(string3, z);
            } else if (string != null && string2 != null) {
                obj = new a(string, string2, z);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new we(!(obj instanceof a) ? (a) obj : null, this, credentialManagerInterface, continuation, 2), 3);
        }
        obj = null;
        x97.y(wyf.F(getLifecycle()), null, null, new we(!(obj instanceof a) ? (a) obj : null, this, credentialManagerInterface, continuation, 2), 3);
    }
}
