package kotlin.text;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class CatchingFishWidgetFlux extends CatchingFishManifestKtor {
    public IconCompat CatchingFishCoroutine;
    public boolean CatchingFishReduxKtor;
    public IconCompat CatchingFishSnackbar;

    @Override // kotlin.text.CatchingFishManifestKtor
    public final String CatchingFishCoroutine() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // kotlin.text.CatchingFishManifestKtor
    public final void CatchingFishParcelableFAB(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        Bitmap CatchingFishParcelableFAB;
        Notification.Builder builder = (Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        Context context = (Context) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.CatchingFishSnackbar;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                CatchingFishContextEspresso.CatchingFishParcelableFAB(bigContentTitle, iconCompat.CatchingFishWorkManager(context));
            } else if (iconCompat.CatchingFishReduxKtor() == 1) {
                IconCompat iconCompat2 = this.CatchingFishSnackbar;
                int i = iconCompat2.CatchingFishParcelableFAB;
                if (i == -1) {
                    Object obj = iconCompat2.CatchingFishSnackbar;
                    CatchingFishParcelableFAB = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    CatchingFishParcelableFAB = (Bitmap) iconCompat2.CatchingFishSnackbar;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    CatchingFishParcelableFAB = IconCompat.CatchingFishParcelableFAB((Bitmap) iconCompat2.CatchingFishSnackbar, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(CatchingFishParcelableFAB);
            }
        }
        if (this.CatchingFishReduxKtor) {
            IconCompat iconCompat3 = this.CatchingFishCoroutine;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.CatchingFishWorkManager(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            CatchingFishContextEspresso.CatchingFishCoroutine(bigContentTitle, false);
            CatchingFishContextEspresso.CatchingFishSnackbar(bigContentTitle, null);
        }
    }
}
