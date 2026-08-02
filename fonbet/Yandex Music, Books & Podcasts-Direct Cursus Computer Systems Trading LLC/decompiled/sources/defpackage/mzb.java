package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.media3.session.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class mzb {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final i a;

    public mzb(Context context, i8l i8lVar, PendingIntent pendingIntent, yde ydeVar, yde ydeVar2, yde ydeVar3, cr crVar, Bundle bundle, Bundle bundle2, yfh yfhVar) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            hashMap.put("", this);
        }
        this.a = new i(this, context, i8lVar, pendingIntent, ydeVar, ydeVar2, ydeVar3, crVar, bundle, bundle2, yfhVar);
    }

    public final i8l a() {
        return this.a.t.a;
    }
}
