package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class n8 {
    public final Context a;
    public final p9 b;
    public final Lazy c;
    public final Lazy d;

    public n8(Context context, p9 p9Var) {
        context.getClass();
        p9Var.getClass();
        this.a = context;
        this.b = p9Var;
        this.c = LazyKt.lazy(new n8$$ExternalSyntheticLambda1(3));
        this.d = LazyKt.lazy(new n8$$ExternalSyntheticLambda1(4));
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Automatically obtained Firebase Cloud Messaging push token: ", str);
    }

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String j() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Failed to get push token via instance id";
    }

    public final void a(String str) {
        str.getClass();
        try {
            if (((Boolean) this.d.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 20));
            } else if (((Boolean) this.c.getValue()).booleanValue()) {
                c(str);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(0), 4, (Object) null);
        }
    }

    public final void c(String str) {
        n8 n8Var;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 27), 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(5), 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!((Boolean) invokeMethodQuietly.first).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(6), 7, (Object) null);
                return;
            }
            Object obj = invokeMethodQuietly.second;
            if (obj == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(7), 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(obj.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(8), 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> invokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(obj, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!((Boolean) invokeMethodQuietly2.first).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(29), 7, (Object) null);
                return;
            }
            Object obj2 = invokeMethodQuietly2.second;
            if (obj2 instanceof String) {
                n8Var = this;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) n8Var, priority, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda2(obj2, 2), 6, (Object) null);
                    ((tc) n8Var.b).a((String) obj2);
                } catch (Exception e) {
                    e = e;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(1), 4, (Object) null);
                }
            }
        } catch (Exception e2) {
            e = e2;
            n8Var = this;
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Registering for Firebase Cloud Messaging token using sender id: ", str);
    }

    public static final void a(n8 n8Var, Task task) {
        task.getClass();
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(task, 15), 6, (Object) null);
            return;
        }
        String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n8Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 26), 6, (Object) null);
        ((tc) n8Var.b).a(str);
    }

    public static final String a(Task task) {
        return Boxes$$ExternalSyntheticOutline1.m(task.getException(), "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception ");
    }

    public final boolean a() {
        if (com.braze.support.g.b(this.a)) {
            return ((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(2), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return Boxes$$ExternalSyntheticOutline1.m("Automatically obtained Firebase Cloud Messaging token: ", obj);
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }
}
