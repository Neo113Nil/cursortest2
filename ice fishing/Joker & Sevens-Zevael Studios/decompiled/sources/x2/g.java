package x2;

import android.app.Notification;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8234e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8235f;

    public g(int i10) {
        this.f8234e = i10;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f8235f = new ArrayList();
                break;
        }
    }

    @Override // x2.k
    public final void a(s sVar) {
        switch (this.f8234e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) sVar.f1813h).setBigContentTitle(this.f8260b).bigText((CharSequence) this.f8235f);
                if (this.f8262d) {
                    bigText.setSummaryText(this.f8261c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) sVar.f1813h).setBigContentTitle(this.f8260b);
                if (this.f8262d) {
                    bigContentTitle.setSummaryText(this.f8261c);
                }
                ArrayList arrayList = (ArrayList) this.f8235f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // x2.k
    public final String b() {
        switch (this.f8234e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
