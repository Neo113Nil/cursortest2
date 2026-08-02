package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class InvisibleActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ToggleableKt.launchTrampolineAction(this, getIntent());
    }
}
