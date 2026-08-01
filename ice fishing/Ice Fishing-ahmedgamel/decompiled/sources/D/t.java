package D;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492e;

    /* renamed from: f, reason: collision with root package name */
    public Object f493f;

    public t(int i) {
        this.f492e = i;
        switch (i) {
            case 1:
                this.f493f = new ArrayList();
                break;
        }
    }

    @Override // D.x
    public final void a(H h9) {
        switch (this.f492e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) h9.f438w).setBigContentTitle(this.f517b).bigText((CharSequence) this.f493f);
                if (this.f519d) {
                    bigText.setSummaryText(this.f518c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) h9.f438w).setBigContentTitle(this.f517b);
                if (this.f519d) {
                    bigContentTitle.setSummaryText(this.f518c);
                }
                Iterator it = ((ArrayList) this.f493f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // D.x
    public final String b() {
        switch (this.f492e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
