package com.google.android.material.button;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.view.MenuItem;
import android.widget.Button;
import androidx.media3.ui.PlayerView;

/* loaded from: classes4.dex */
public final /* synthetic */ class MaterialButtonGroup$$ExternalSyntheticLambda1 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MaterialButtonGroup$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Object obj2 = MaterialButtonGroup.OVERFLOW_BUTTON_TAG;
                ((Button) obj).performClick();
                break;
            default:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT < 34) {
                    actionIntent.send();
                    break;
                } else {
                    PlayerView.Api34.sendIntentAllowBackgroundActivityStart(actionIntent);
                    break;
                }
        }
        return true;
    }
}
