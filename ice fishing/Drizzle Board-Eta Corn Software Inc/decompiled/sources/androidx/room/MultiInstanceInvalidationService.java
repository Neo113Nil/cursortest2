package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.jt;
import defpackage.kt;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int NCTxEWno;
    public final LinkedHashMap MdtA4re8 = new LinkedHashMap();
    public final kt wxUZMvaN = new kt(this);
    public final jt VgvYg0wo = new jt(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.VgvYg0wo;
    }
}
