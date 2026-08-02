package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.t;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class fn5 extends fi {
    public final /* synthetic */ hn5 h;

    public fn5(hn5 hn5Var) {
        this.h = hn5Var;
    }

    @Override // defpackage.fi
    public final void b(int i, uh uhVar, Object obj) {
        Bundle bundle;
        int i2;
        uhVar.getClass();
        hn5 hn5Var = this.h;
        th synchronousResult = uhVar.getSynchronousResult(hn5Var, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new e02(this, i, synchronousResult, 1));
            return;
        }
        Intent createIntent = uhVar.createIntent(hn5Var, obj);
        if (createIntent.getExtras() != null) {
            Bundle extras = createIntent.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(hn5Var.getClassLoader());
            }
        }
        if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                hn5Var.startActivityForResult(createIntent, i, bundle2);
                return;
            }
            sre sreVar = (sre) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                sreVar.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                hn5Var.startIntentSenderForResult(sreVar.a, i2, sreVar.b, sreVar.c, sreVar.d, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new e02(this, i2, e, 2));
                return;
            }
        }
        String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                xq0.x(su4.o(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        if (hn5Var instanceof t) {
            ((t) hn5Var).validateRequestPermissionsRequestCode(i);
        }
        hn5Var.requestPermissions(stringArrayExtra, i);
    }
}
