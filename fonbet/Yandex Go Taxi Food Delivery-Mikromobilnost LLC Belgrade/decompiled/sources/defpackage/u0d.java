package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.b;

/* loaded from: classes.dex */
public final class u0d extends t50 {
    public final /* synthetic */ ComponentActivity h;

    public u0d(ComponentActivity componentActivity) {
        this.h = componentActivity;
    }

    @Override // defpackage.t50
    public final void b(int i, x40 x40Var, Object obj) {
        Bundle bundle;
        int i2;
        ComponentActivity componentActivity = this.h;
        w40 b = x40Var.b(componentActivity, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new t0d(this, i, b, 0));
            return;
        }
        Intent a = x40Var.a(componentActivity, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            b.J(componentActivity, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            componentActivity.startActivityForResult(a, i, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
        } catch (IntentSender.SendIntentException e) {
            e = e;
            i2 = i;
        }
        try {
            componentActivity.startIntentSenderForResult(intentSenderRequest.getIntentSender(), i2, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            new Handler(Looper.getMainLooper()).post(new t0d(this, i2, e, 1));
        }
    }
}
