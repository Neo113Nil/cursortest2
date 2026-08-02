package androidx.glance.appwidget.action;

import android.content.Intent;
import androidx.glance.action.Action;
import androidx.glance.action.MutableActionParameters;

/* loaded from: classes3.dex */
public final class StartActivityIntentAction implements Action {
    public final Intent intent;
    public final MutableActionParameters parameters;

    public StartActivityIntentAction(Intent intent, MutableActionParameters mutableActionParameters) {
        this.intent = intent;
        this.parameters = mutableActionParameters;
    }
}
