package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.api.r;

/* loaded from: classes.dex */
public final class scs extends x40 {
    public final /* synthetic */ int a;

    public /* synthetic */ scs(int i) {
        this.a = i;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent fillInIntent = intentSenderRequest.getFillInIntent();
                if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        yi6 yi6Var = new yi6(intentSenderRequest.getIntentSender());
                        yi6Var.v(null);
                        yi6Var.w(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask());
                        intentSenderRequest = yi6Var.c();
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (FragmentManager.O(2)) {
                    intent.toString();
                }
                return intent;
            default:
                b64.D(obj);
                throw null;
        }
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                return new ActivityResult(i, intent);
            default:
                return r.d(i, intent);
        }
    }
}
