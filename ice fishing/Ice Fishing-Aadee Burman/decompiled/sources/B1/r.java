package B1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f155a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final N1.h f156b = new N1.h(new x(0));

    public static boolean a(BitmapFactory.Options options) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT != 34) {
            return false;
        }
        Bitmap.Config config2 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        if (config2 != config) {
            return false;
        }
        return ((Boolean) f156b.get()).booleanValue();
    }

    public static C0262d b(InterfaceC5104a interfaceC5104a, Drawable drawable, int i, int i6) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z3 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i6 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i6 = current.getIntrinsicHeight();
                    }
                    Lock lock = C.f104b;
                    lock.lock();
                    Bitmap n9 = interfaceC5104a.n(i, i6, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(n9);
                        current.setBounds(0, 0, i, i6);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = n9;
                        z3 = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z3 = true;
        }
        if (!z3) {
            interfaceC5104a = f155a;
        }
        return C0262d.b(bitmap, interfaceC5104a);
    }

    public static Bitmap c(InputStream inputStream, BitmapFactory.Options options, Z2.e eVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !a(options) || !d(eVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        Bitmap.Config config5 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        N1.g.a("", config5 == config);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream == null) {
                if (decodeStream != null) {
                    decodeStream.recycle();
                }
                config4 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config4;
                return null;
            }
            try {
                Bitmap e9 = e(decodeStream);
                decodeStream.recycle();
                config3 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config3;
                return e9;
            } catch (Throwable th) {
                th = th;
                bitmap = decodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                config2 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean d(Z2.e eVar) {
        try {
            boolean z3 = eVar.z();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return z3;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + z3);
            return z3;
        } catch (IOException e9) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e9);
            return false;
        }
    }

    public static Bitmap e(Bitmap bitmap) {
        Gainmap gainmap;
        Bitmap.Config config;
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        float[] ratioMin;
        float[] ratioMax;
        float[] gamma;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            gainmapContents = gainmap.getGainmapContents();
            Bitmap.Config config2 = gainmapContents.getConfig();
            Bitmap.Config config3 = Bitmap.Config.ALPHA_8;
            if (config2 == config3) {
                ColorMatrixColorFilter colorMatrixColorFilter = w.f160a;
                gainmapContents2 = gainmap.getGainmapContents();
                if (gainmapContents2.getConfig() == config3) {
                    N1.g.a("", gainmapContents2.getConfig() == config3);
                    Bitmap createBitmap = Bitmap.createBitmap(gainmapContents2.getWidth(), gainmapContents2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(w.f160a);
                    canvas.drawBitmap(gainmapContents2, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap t6 = v.t(createBitmap);
                    ratioMin = gainmap.getRatioMin();
                    t6.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    ratioMax = gainmap.getRatioMax();
                    t6.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    gamma = gainmap.getGamma();
                    t6.setGamma(gamma[0], gamma[1], gamma[2]);
                    epsilonSdr = gainmap.getEpsilonSdr();
                    t6.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    epsilonHdr = gainmap.getEpsilonHdr();
                    t6.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                    t6.setDisplayRatioForFullHdr(displayRatioForFullHdr);
                    minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                    t6.setMinDisplayRatioForHdrTransition(minDisplayRatioForHdrTransition);
                    gainmap = t6;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        config = Bitmap.Config.HARDWARE;
        return bitmap.copy(config, false);
    }
}
