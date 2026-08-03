package ae;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import b0.n0;
import bc.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import h3.q;
import h3.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.k0;
import m0.l1;
import pc.j;
import v.c0;
import v.e0;
import v.e1;
import v.x0;
import v.y0;
import y1.g0;
import y1.h0;
import z.p0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f351c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f349a = i10;
        this.f350b = obj;
        this.f351c = obj2;
    }

    @Override // m0.k0
    public final void a() {
        int i10 = this.f349a;
        int i11 = 0;
        Object obj = this.f351c;
        Object obj2 = this.f350b;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                SharedPreferences sharedPreferences = context.getSharedPreferences("overthink", 0);
                j.b(sharedPreferences);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("soundless", false);
                edit.apply();
                try {
                    context.unbindService((e) obj);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((n0) obj2).f862i.add(obj);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                m5.c cVar = (m5.c) obj2;
                t tVar = cVar.f4881d;
                List b2 = cVar.b();
                ArrayList arrayList = new ArrayList(o.O(b2));
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k5.a) it.next()).getKey());
                }
                if (n5.d.f5063a.contains((l5.b) ((l1) tVar.f1817b).getValue())) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (!arrayList.contains(((k5.a) obj3).getKey())) {
                            arrayList2.add(obj3);
                        }
                    }
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        cVar.a((k5.a) obj4);
                    }
                    tVar.getClass();
                    ((l1) tVar.f1817b).setValue(l5.b.f4162j);
                    break;
                }
                break;
            case 3:
                ((e0) obj2).f6819a.j((c0) obj);
                break;
            case 4:
                ((e1) obj2).f6832j.remove((e1) obj);
                break;
            case 5:
                e1 e1Var = (e1) obj2;
                x0 x0Var = (x0) ((y0) obj).f7018b.getValue();
                if (x0Var != null) {
                    e1Var.f6831i.remove(x0Var.f7013g);
                    break;
                }
                break;
            case 6:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((g0) obj);
                break;
            case 7:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((h0) obj);
                break;
            default:
                p0 p0Var = (p0) obj2;
                View view = (View) obj;
                int i12 = p0Var.f9022s - 1;
                p0Var.f9022s = i12;
                if (i12 == 0) {
                    Field field = w.f2829a;
                    q.g(view, null);
                    w.c(view, null);
                    view.removeOnAttachStateChangeListener(p0Var.f9023t);
                    break;
                }
                break;
        }
    }
}
