package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import com.connectsdk.device.ConnectableDevice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cqh {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public cqh(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str == null) {
            jj4.j("id must not be null");
            throw null;
        }
        bundle.putString(ConnectableDevice.KEY_ID, str);
        if (str2 != null) {
            bundle.putString("name", str2);
        } else {
            jj4.j("name must not be null");
            throw null;
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            xq0.x("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = this.c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final dqh b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new dqh(bundle);
    }

    public cqh(dqh dqhVar) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(dqhVar.a);
        this.b = dqhVar.c();
        this.c = dqhVar.b();
        this.d = dqhVar.a();
    }
}
