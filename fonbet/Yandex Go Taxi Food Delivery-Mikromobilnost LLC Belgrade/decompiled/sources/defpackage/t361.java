package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.widgets.common.notifications.NotificationSmallView;

/* loaded from: classes4.dex */
public final class t361 implements zo31 {
    public final NotificationSmallView a;

    public t361(NotificationSmallView notificationSmallView, TextView textView) {
        this.a = notificationSmallView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
