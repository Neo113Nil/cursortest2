package x2;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import d8.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f8231e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f8232f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8233g;

    @Override // x2.k
    public final void a(s sVar) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) sVar.f1813h;
        Context context = (Context) sVar.f1812g;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f8260b);
        IconCompat iconCompat = this.f8231e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                e.a(bigContentTitle, iconCompat.e(context));
            } else if (iconCompat.c() == 1) {
                IconCompat iconCompat2 = this.f8231e;
                int i10 = iconCompat2.f618a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f619b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmap = (Bitmap) iconCompat2.f619b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.f619b;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float f10 = min;
                    float f11 = 0.5f * f10;
                    float f12 = 0.9166667f * f11;
                    float f13 = 0.010416667f * f10;
                    paint.setColor(0);
                    paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f11, f11, f12, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.f8233g) {
            IconCompat iconCompat3 = this.f8232f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                d.a(bigContentTitle, iconCompat3.e(context));
            }
        }
        if (this.f8262d) {
            bigContentTitle.setSummaryText(this.f8261c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(bigContentTitle, false);
            e.b(bigContentTitle, null);
        }
    }

    @Override // x2.k
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
