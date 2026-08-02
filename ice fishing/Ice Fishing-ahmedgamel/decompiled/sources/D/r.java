package D;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f384e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f385f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f386g;

    @Override // D.w
    public final void a(G g9) {
        Bitmap a9;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) g9.f335w).setBigContentTitle(this.f412b);
        IconCompat iconCompat = this.f384e;
        Context context = (Context) g9.f334v;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0287q.a(bigContentTitle, H.c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f384e;
                int i = iconCompat2.f4657a;
                if (i == -1) {
                    Object obj = iconCompat2.f4658b;
                    a9 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a9 = (Bitmap) iconCompat2.f4658b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a9 = IconCompat.a((Bitmap) iconCompat2.f4658b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a9);
            }
        }
        if (this.f386g) {
            IconCompat iconCompat3 = this.f385f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0286p.a(bigContentTitle, H.c.c(iconCompat3, context));
            }
        }
        if (this.f414d) {
            bigContentTitle.setSummaryText(this.f413c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0287q.c(bigContentTitle, false);
            AbstractC0287q.b(bigContentTitle, null);
        }
    }

    @Override // D.w
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
