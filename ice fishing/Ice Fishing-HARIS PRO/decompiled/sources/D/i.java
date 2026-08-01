package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f122a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f123b;

    public i(Context context) {
        this.f123b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f123b;
        ArrayList arrayList = this.f122a;
        int size = arrayList.size();
        try {
            for (Intent a2 = e.a(context, componentName); a2 != null; a2 = e.a(context, a2.getComponent())) {
                arrayList.add(size, a2);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f122a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f123b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f122a.iterator();
    }
}
