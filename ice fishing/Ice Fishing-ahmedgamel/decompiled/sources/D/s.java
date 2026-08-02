package D;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f387e;

    /* renamed from: f, reason: collision with root package name */
    public Object f388f;

    public s(int i) {
        this.f387e = i;
        switch (i) {
            case 1:
                this.f388f = new ArrayList();
                break;
        }
    }

    @Override // D.w
    public final void a(G g9) {
        switch (this.f387e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) g9.f335w).setBigContentTitle(this.f412b).bigText((CharSequence) this.f388f);
                if (this.f414d) {
                    bigText.setSummaryText(this.f413c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) g9.f335w).setBigContentTitle(this.f412b);
                if (this.f414d) {
                    bigContentTitle.setSummaryText(this.f413c);
                }
                Iterator it = ((ArrayList) this.f388f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // D.w
    public final String b() {
        switch (this.f387e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
