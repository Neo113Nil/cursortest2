package vb;

import android.app.Application;
import androidx.lifecycle.x0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import org.fortheloss.st.MainActivity;
import pc.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements xb.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7305g;

    /* renamed from: h, reason: collision with root package name */
    public final MainActivity f7306h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7307i;

    /* renamed from: j, reason: collision with root package name */
    public final xb.b f7308j;

    /* renamed from: k, reason: collision with root package name */
    public volatile xb.a f7309k;

    public b(MainActivity mainActivity, int i10) {
        this.f7305g = i10;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f7307i = new Object();
                this.f7306h = mainActivity;
                this.f7308j = mainActivity;
                break;
            default:
                this.f7307i = new Object();
                this.f7306h = mainActivity;
                this.f7308j = new b(mainActivity, 1);
                break;
        }
    }

    public static x0 b(MainActivity mainActivity, MainActivity mainActivity2) {
        return new x0(mainActivity.g(), new ub.c(1, mainActivity2), mainActivity.e());
    }

    public hd.c a() {
        String str;
        MainActivity mainActivity = this.f7306h;
        if (mainActivity.getApplication() instanceof xb.b) {
            hd.e eVar = (hd.e) ((a) v6.a.E((b) this.f7308j, a.class));
            return new hd.c(eVar.f2882a, eVar.f2883b);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // xb.b
    public final Object c() {
        switch (this.f7305g) {
            case 0:
                if (((hd.c) this.f7309k) == null) {
                    synchronized (this.f7307i) {
                        try {
                            if (((hd.c) this.f7309k) == null) {
                                this.f7309k = a();
                            }
                        } finally {
                        }
                    }
                }
                return (hd.c) this.f7309k;
            default:
                if (((hd.e) this.f7309k) == null) {
                    synchronized (this.f7307i) {
                        try {
                            if (((hd.e) this.f7309k) == null) {
                                this.f7309k = ((d) b(this.f7306h, (MainActivity) this.f7308j).b(t.a(d.class))).f7310b;
                            }
                        } finally {
                        }
                    }
                }
                return (hd.e) this.f7309k;
        }
    }
}
