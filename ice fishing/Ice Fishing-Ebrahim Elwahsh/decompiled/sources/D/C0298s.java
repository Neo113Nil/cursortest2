package D;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298s extends x {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f544e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f545f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f546g;

    @Override // D.x
    public final void a(H h9) {
        Bitmap a9;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) h9.f493w).setBigContentTitle(this.f572b);
        IconCompat iconCompat = this.f544e;
        Context context = (Context) h9.f492v;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                r.a(bigContentTitle, H.c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f544e;
                int i = iconCompat2.f4804a;
                if (i == -1) {
                    Object obj = iconCompat2.f4805b;
                    a9 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a9 = (Bitmap) iconCompat2.f4805b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a9 = IconCompat.a((Bitmap) iconCompat2.f4805b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a9);
            }
        }
        if (this.f546g) {
            IconCompat iconCompat3 = this.f545f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0297q.a(bigContentTitle, H.c.c(iconCompat3, context));
            }
        }
        if (this.f574d) {
            bigContentTitle.setSummaryText(this.f573c);
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
