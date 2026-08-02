package D1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f517a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Lock f518b;

    static {
        new Paint(7);
        f518b = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new A();
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f518b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f517a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(InterfaceC5183a interfaceC5183a, Bitmap bitmap, int i, int i4) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i4) {
            float min = Math.min(i / bitmap.getWidth(), i4 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                Bitmap d9 = interfaceC5183a.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                d9.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i + "x" + i4);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + d9.getWidth() + "x" + d9.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(min);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                a(bitmap, d9, matrix);
                return d9;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }
}
