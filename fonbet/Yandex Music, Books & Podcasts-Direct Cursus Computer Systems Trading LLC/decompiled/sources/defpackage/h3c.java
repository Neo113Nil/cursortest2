package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ h3c(Context context, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                if (!bp6.a.contains(this)) {
                    try {
                        HashSet hashSet = j3c.a;
                        context.getClass();
                        j3c.a(context, str);
                        break;
                    } catch (Throwable th) {
                        bp6.a(this, th);
                        return;
                    }
                }
                break;
            default:
                Set set = bp6.a;
                if (!set.contains(this)) {
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String concat = str.concat("pingForOnDevice");
                        if (sharedPreferences.getLong(concat, 0L) == 0) {
                            Boolean bool = ovn.a;
                            if (!set.contains(ovn.class)) {
                                try {
                                    ovn.b.Q(str, c5b.a, 1);
                                } catch (Throwable th2) {
                                    bp6.a(ovn.class, th2);
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(concat, System.currentTimeMillis());
                            edit.apply();
                            break;
                        }
                    } catch (Throwable th3) {
                        bp6.a(this, th3);
                    }
                }
                break;
        }
    }
}
