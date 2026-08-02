package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class sec {
    public final aec a;
    public final lnp b;

    public sec(aec aecVar, lnp lnpVar, CoroutineContext coroutineContext, hmp hmpVar) {
        aecVar.getClass();
        lnpVar.getClass();
        coroutineContext.getClass();
        hmpVar.getClass();
        this.a = aecVar;
        this.b = lnpVar;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        aecVar.a();
        Context applicationContext = aecVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(jnp.b);
            x97.y(gld.e(coroutineContext), null, null, new j57(this, coroutineContext, hmpVar, (Continuation) null, 27), 3);
        } else {
            Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
