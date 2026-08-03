package e3;

import androidx.work.impl.foreground.SystemForegroundService;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.List;
import m.s;
import o6.b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2061g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2062h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2063i;

    public /* synthetic */ a(int i10, int i11, Object obj) {
        this.f2061g = i11;
        this.f2063i = obj;
        this.f2062h = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2061g) {
            case 0:
                s sVar = (s) ((f8.c) this.f2063i).f2340h;
                if (sVar != null) {
                    sVar.getClass();
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((b0) this.f2063i).f(this.f2062h);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ArrayList arrayList = (ArrayList) this.f2063i;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f2062h == 1) {
                    while (i10 < size) {
                        o2.g gVar = (o2.g) arrayList.get(i10);
                        gVar.f5175a.setValue(Boolean.TRUE);
                        gVar.f5176b.f4957h = new o2.k(true);
                        i10++;
                    }
                    break;
                } else {
                    while (i10 < size) {
                        ((o2.g) arrayList.get(i10)).f5176b.f4957h = o2.j.f5179a;
                        i10++;
                    }
                    break;
                }
            default:
                ((SystemForegroundService) this.f2063i).f785k.cancel(this.f2062h);
                break;
        }
    }

    public a(List list, int i10, Throwable th) {
        this.f2061g = 2;
        a.a.m(list, "initCallbacks cannot be null");
        this.f2063i = new ArrayList(list);
        this.f2062h = i10;
    }
}
