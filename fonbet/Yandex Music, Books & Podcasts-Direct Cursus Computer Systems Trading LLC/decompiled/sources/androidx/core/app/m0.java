package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m0 extends n0 {
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final z0 d;
    public Boolean e;

    public m0(z0 z0Var) {
        if (TextUtils.isEmpty(z0Var.a)) {
            xq0.x("User's name must not be empty.");
            throw null;
        }
        this.d = z0Var;
    }

    @Override // androidx.core.app.n0
    public final void a(Bundle bundle) {
        super.a(bundle);
        z0 z0Var = this.d;
        bundle.putCharSequence("android.selfDisplayName", z0Var.a);
        bundle.putBundle("android.messagingStyleUser", z0Var.a());
        bundle.putCharSequence("android.hiddenConversationTitle", null);
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", l0.a(arrayList));
        }
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", l0.a(arrayList2));
        }
        Boolean bool = this.e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.n0
    public final void b(p0 p0Var) {
        Boolean bool;
        Notification.MessagingStyle b;
        f0 f0Var = (f0) this.a;
        boolean z = false;
        if ((f0Var == null || f0Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.e != null) && (bool = this.e) != null) {
            z = bool.booleanValue();
        }
        this.e = Boolean.valueOf(z);
        int i = Build.VERSION.SDK_INT;
        z0 z0Var = this.d;
        if (i >= 28) {
            z0Var.getClass();
            b = i0.a(x.f(z0Var));
        } else {
            b = g0.b(z0Var.a);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            g0.a(b, ((l0) it.next()).b());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                h0.a(b, ((l0) it2.next()).b());
            }
        }
        if (this.e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            g0.c(b, null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            i0.b(b, this.e.booleanValue());
        }
        b.setBuilder(p0Var.b);
    }

    @Override // androidx.core.app.n0
    public final String i() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
