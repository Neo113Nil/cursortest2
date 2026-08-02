package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.connectsdk.service.DeviceService;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class nzw {
    public static final t7e a = new t7e("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(DeviceService.KEY_CONFIG, signInConfiguration);
        intent.putExtra(DeviceService.KEY_CONFIG, bundle);
        return intent;
    }

    public static void b(Context context) {
        ozw.F(context).G();
        Set set = tmd.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((tmd) it.next()).e();
        }
        synchronized (umd.r) {
            try {
                umd umdVar = umd.s;
                if (umdVar != null) {
                    umdVar.i.incrementAndGet();
                    fsn fsnVar = umdVar.n;
                    fsnVar.sendMessageAtFrontOfQueue(fsnVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
