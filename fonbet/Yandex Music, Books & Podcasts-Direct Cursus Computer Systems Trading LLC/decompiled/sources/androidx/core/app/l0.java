package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l0 {
    public final CharSequence a;
    public final long b;
    public final z0 c;
    public final Bundle d = new Bundle();

    public l0(CharSequence charSequence, long j, z0 z0Var) {
        this.a = charSequence;
        this.b = j;
        this.c = z0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l0 l0Var = (l0) arrayList.get(i);
            z0 z0Var = l0Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = l0Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", l0Var.b);
            if (z0Var != null) {
                bundle.putCharSequence("sender", z0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", k0.a(x.f(z0Var)));
                } else {
                    bundle.putBundle("person", z0Var.a());
                }
            }
            Bundle bundle2 = l0Var.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        z0 z0Var = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            return k0.b(charSequence, j, z0Var != null ? x.f(z0Var) : null);
        }
        return j0.a(charSequence, j, z0Var != null ? z0Var.a : null);
    }
}
