package com.gamericefishpro.space.r3;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // com.gamericefishpro.space.r3.k
    public final void a(com.gamericefishpro.space.u6.n nVar) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) nVar.e;
        Context context = (Context) nVar.d;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                e.a(bigContentTitle, iconCompat.e(context));
            } else if (iconCompat.c() == 1) {
                IconCompat iconCompat2 = this.e;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float f = iMin;
                    float f2 = 0.5f * f;
                    float f3 = 0.9166667f * f2;
                    float f4 = 0.010416667f * f;
                    paint.setColor(0);
                    paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                    canvas.drawCircle(f2, f2, f3, paint);
                    paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f2, f2, f3, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f2, f2, f3, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                d.a(bigContentTitle, iconCompat3.e(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(bigContentTitle, false);
            e.b(bigContentTitle, null);
        }
    }

    @Override // com.gamericefishpro.space.r3.k
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
