package b0;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import v.e1;
import y1.a1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements m0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f872b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f871a = i10;
        this.f872b = obj;
    }

    @Override // m0.k0
    public final void a() {
        Object parcelable;
        Integer num;
        switch (this.f871a) {
            case 0:
                ((r) this.f872b).f879d = null;
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((d0) this.f872b).f815c = null;
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                z zVar = (z) this.f872b;
                int g8 = zVar.f935d.g();
                for (int i10 = 0; i10 < g8; i10++) {
                    zVar.b();
                }
                return;
            case 3:
                g.c cVar = ((e.a) this.f872b).f1895a;
                if (cVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                d.n nVar = cVar.f2404d;
                String str = cVar.f2405e;
                Bundle bundle = nVar.f1508g;
                LinkedHashMap linkedHashMap = nVar.f1507f;
                pc.j.e(str, "key");
                if (!nVar.f1505d.contains(str) && (num = (Integer) nVar.f1503b.remove(str)) != null) {
                    nVar.f1502a.remove(num);
                }
                nVar.f1506e.remove(str);
                if (linkedHashMap.containsKey(str)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                    linkedHashMap.remove(str);
                }
                if (bundle.containsKey(str)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = d.k.b(str, bundle);
                    } else {
                        parcelable = bundle.getParcelable(str);
                        if (!g.a.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((g.a) parcelable));
                    bundle.remove(str);
                }
                if (nVar.f1504c.get(str) != null) {
                    throw new ClassCastException();
                }
                return;
            case 4:
                Iterator it = ((e.g) this.f872b).f1532b.iterator();
                while (it.hasNext()) {
                    ((d.d) it.next()).cancel();
                }
                return;
            case 5:
                ((e1) this.f872b).i();
                return;
            default:
                ((a1) this.f872b).f8467h.invoke();
                return;
        }
    }
}
