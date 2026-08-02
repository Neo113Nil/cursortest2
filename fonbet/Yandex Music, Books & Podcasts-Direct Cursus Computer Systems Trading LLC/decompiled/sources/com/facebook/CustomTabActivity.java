package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import defpackage.l83;
import defpackage.phg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {
    public l83 a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            Intent intent3 = getIntent();
            intent3.getClass();
            intent2.putExtra("CustomTabMainActivity.extra_url", intent3.getDataString());
            phg.a(this).c(intent2);
            l83 l83Var = new l83(7, this);
            phg.a(this).b(l83Var, new IntentFilter("CustomTabActivity.action_destroy"));
            this.a = l83Var;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction("CustomTabActivity.action_customTabRedirect");
        Intent intent2 = getIntent();
        intent2.getClass();
        intent.putExtra("CustomTabMainActivity.extra_url", intent2.getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l83 l83Var = this.a;
        if (l83Var != null) {
            phg.a(this).d(l83Var);
        }
        super.onDestroy();
    }
}
