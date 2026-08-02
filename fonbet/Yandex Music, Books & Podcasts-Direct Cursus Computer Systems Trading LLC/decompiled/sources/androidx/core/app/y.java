package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y {
    public final String a;
    public final CharSequence b;
    public final boolean c;
    public final List d;

    public y(NotificationChannelGroup notificationChannelGroup, List list) {
        String k = u.k(notificationChannelGroup);
        this.d = Collections.EMPTY_LIST;
        k.getClass();
        this.a = k;
        this.b = u.o(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            x.b(notificationChannelGroup);
        }
        if (i < 28) {
            this.d = a(list);
        } else {
            this.c = x.d(notificationChannelGroup);
            this.d = a(u.g(notificationChannelGroup));
        }
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.a.equals(notificationChannel.getGroup())) {
                arrayList.add(new w(notificationChannel));
            }
        }
        return arrayList;
    }
}
