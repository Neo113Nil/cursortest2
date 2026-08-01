package D;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299s extends x {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f489e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f490f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f491g;

    @Override // D.x
    public final void a(H h9) {
        Bitmap a9;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) h9.f438w).setBigContentTitle(this.f517b);
        IconCompat iconCompat = this.f489e;
        Context context = (Context) h9.f437v;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                r.a(bigContentTitle, H.c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f489e;
                int i = iconCompat2.f4689a;
                if (i == -1) {
                    Object obj = iconCompat2.f4690b;
                    a9 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a9 = (Bitmap) iconCompat2.f4690b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a9 = IconCompat.a((Bitmap) iconCompat2.f4690b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a9);
            }
        }
        if (this.f491g) {
            IconCompat iconCompat3 = this.f490f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0298q.a(bigContentTitle, H.c.c(iconCompat3, context));
            }
        }
        if (this.f519d) {
            bigContentTitle.setSummaryText(this.f518c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            r.c(bigContentTitle, false);
            r.b(bigContentTitle, null);
        }
    }

    @Override // D.x
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
