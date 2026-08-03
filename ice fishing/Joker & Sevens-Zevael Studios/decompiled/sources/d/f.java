package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.q0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1489h;

    public /* synthetic */ f(MainActivity mainActivity, int i10) {
        this.f1488g = i10;
        this.f1489h = mainActivity;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f1488g) {
            case 0:
                this.f1489h.reportFullyDrawn();
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                MainActivity mainActivity = this.f1489h;
                return new p(mainActivity.f1515l, new f(mainActivity, 0));
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                MainActivity mainActivity2 = this.f1489h;
                return new q0(mainActivity2.getApplication(), mainActivity2, mainActivity2.getIntent() != null ? mainActivity2.getIntent().getExtras() : null);
            default:
                MainActivity mainActivity3 = this.f1489h;
                y yVar = new y(new e(mainActivity3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (pc.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity3.f1510g.a(new g(yVar, mainActivity3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a1.d(3, mainActivity3, yVar));
                    }
                }
                return yVar;
        }
    }
}
