package m;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4452g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4453h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4454i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4455j;

    public /* synthetic */ t(int i10, int i11, Object obj, Object obj2) {
        this.f4452g = i11;
        this.f4454i = obj;
        this.f4455j = obj2;
        this.f4453h = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4452g) {
            case 0:
                ((TextView) this.f4454i).setTypeface((Typeface) this.f4455j, this.f4453h);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((r4.i) this.f4454i).a(this.f4453h, (Intent) this.f4455j);
                break;
            default:
                ((SystemForegroundService) this.f4455j).f785k.notify(this.f4453h, (Notification) this.f4454i);
                break;
        }
    }

    public t(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f4452g = 2;
        this.f4455j = systemForegroundService;
        this.f4453h = i10;
        this.f4454i = notification;
    }
}
