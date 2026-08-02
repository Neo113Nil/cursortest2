package D;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287q {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
        bigPictureStyle.showBigPictureWhenCollapsed(z6);
    }
}
