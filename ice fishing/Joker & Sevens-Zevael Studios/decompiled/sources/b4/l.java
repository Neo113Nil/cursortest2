package b4;

import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f997a;

    public l(int i10) {
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f997a = new LinkedHashMap(0, 0.75f, true);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f997a = new LinkedHashMap((int) ((8 / 0.75f) + 1.0f));
                break;
            default:
                this.f997a = new LinkedHashMap();
                break;
        }
    }

    public void a(c4.a... aVarArr) {
        pc.j.e(aVarArr, "migrations");
        for (c4.a aVar : aVarArr) {
            int i10 = aVar.f1223a;
            int i11 = aVar.f1224b;
            Integer valueOf = Integer.valueOf(i10);
            LinkedHashMap linkedHashMap = this.f997a;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }
    }
}
