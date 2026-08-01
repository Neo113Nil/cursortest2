package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestServer extends WinterFlowPackageConsumer {
    public boolean WinterFlowArrayNetwork;
    public IconCompat WinterFlowCacheManagerAgent;
    public IconCompat WinterFlowHookDataSource;

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowCacheManagerAgent(WinterFlowStackProvider winterFlowStackProvider) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
        Context context = (Context) winterFlowStackProvider.WinterFlowVariableVersionControl;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.WinterFlowHookDataSource;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                WinterFlowConfigurationAgent.WinterFlowRouterStructure(bigContentTitle, WinterFlowCloudStack.WinterFlowProxyStructure(iconCompat, context));
            } else if (iconCompat.WinterFlowCacheManagerAgent() == 1) {
                IconCompat iconCompat2 = this.WinterFlowHookDataSource;
                int i = iconCompat2.WinterFlowRouterStructure;
                if (i == -1) {
                    Object obj = iconCompat2.WinterFlowHookDataSource;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat2.WinterFlowHookDataSource;
                } else {
                    if (i != 5) {
                        WinterFlowCompilerMechanism.WinterFlowRouterRouter(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.WinterFlowHookDataSource;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float f = min;
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
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f2, f2, f3, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.WinterFlowArrayNetwork) {
            IconCompat iconCompat3 = this.WinterFlowCacheManagerAgent;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(WinterFlowCloudStack.WinterFlowProxyStructure(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            WinterFlowConfigurationAgent.WinterFlowCacheManagerAgent(bigContentTitle, false);
            WinterFlowConfigurationAgent.WinterFlowHookDataSource(bigContentTitle, null);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final String WinterFlowRouterRouter() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
