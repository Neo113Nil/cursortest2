package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mobile.drive.account_manager.DrivePassportEnvironment;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes6.dex */
public abstract class tm91 {
    public static mgv a;

    public static final DrivePassportEnvironment a(KPassportEnvironment kPassportEnvironment) {
        int i = gfm.a[kPassportEnvironment.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return DrivePassportEnvironment.Production;
        }
        if (i == 4 || i == 5) {
            return DrivePassportEnvironment.Testing;
        }
        w511.b();
        return null;
    }

    public static final f530 b(f530 f530Var, tls tlsVar) {
        return f530Var.k(new c070(tlsVar));
    }

    public static final bl00 c(PinV1Component pinV1Component, z0c0 z0c0Var, boolean z, Pin$State pin$State, Drawable drawable, CharSequence charSequence) {
        pinV1Component.setPinV1Style(z0c0Var);
        pinV1Component.setIdleStateDrawable(drawable);
        pinV1Component.setState(pin$State, false);
        pinV1Component.setAnchored(z, false);
        pinV1Component.setPinText(charSequence);
        xw31.r(pinV1Component);
        Rect pinFullVisibleBounds = pinV1Component.getPinFullVisibleBounds();
        PointF targetOffsetPoint = pinV1Component.getTargetOffsetPoint();
        PointF pointF = new PointF(targetOffsetPoint.x, targetOffsetPoint.y);
        float f = -(pointF.y + pinFullVisibleBounds.top);
        float f2 = -(pointF.x + pinFullVisibleBounds.left);
        Canvas canvas = new Canvas();
        pointF.set(0.5f, (pointF.y + f) / pinFullVisibleBounds.height());
        IconStyle iconStyle = new IconStyle(pointF, null, null, null, null, null, null);
        Bitmap createBitmap = Bitmap.createBitmap(pinFullVisibleBounds.width(), pinFullVisibleBounds.height(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        canvas.translate(f2, f);
        pinV1Component.draw(canvas);
        canvas.setBitmap(null);
        return new bl00(ImageProvider.fromBitmap(createBitmap), iconStyle);
    }
}
