package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import defpackage.ot0;

/* loaded from: classes.dex */
public final class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ot0.M(this, getIntent());
        finish();
    }
}
