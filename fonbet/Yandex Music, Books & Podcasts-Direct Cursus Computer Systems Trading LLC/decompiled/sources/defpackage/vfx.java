package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class vfx {
    public final yee a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();
    public l83 e = null;

    public vfx(yee yeeVar, IntentFilter intentFilter, Context context) {
        this.a = yeeVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        l83 l83Var;
        HashSet hashSet = this.d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.e == null) {
            l83 l83Var2 = new l83(26, this);
            this.e = l83Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(l83Var2, intentFilter, 2);
            } else {
                context.registerReceiver(l83Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (l83Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(l83Var);
        this.e = null;
    }
}
