package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qb0 implements Iterable {
    public final Context MdtA4re8;
    public final ArrayList NCTxEWno = new ArrayList();

    public qb0(Context context) {
        this.MdtA4re8 = context;
    }

    public final void NCTxEWno() {
        ArrayList arrayList = this.NCTxEWno;
        if (arrayList.isEmpty()) {
            m1.Ey6iv0m0("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.MdtA4re8.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.NCTxEWno.iterator();
    }

    public final void qoPGr6Ce(ComponentName componentName) {
        Context context = this.MdtA4re8;
        ArrayList arrayList = this.NCTxEWno;
        int size = arrayList.size();
        try {
            for (Intent Ey6iv0m0 = le0.Ey6iv0m0(context, componentName); Ey6iv0m0 != null; Ey6iv0m0 = le0.Ey6iv0m0(context, Ey6iv0m0.getComponent())) {
                arrayList.add(size, Ey6iv0m0);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }
}
