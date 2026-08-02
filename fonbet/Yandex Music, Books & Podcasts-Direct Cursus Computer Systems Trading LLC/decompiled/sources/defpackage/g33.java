package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g33 implements dg7 {
    public final tce a;
    public final rwj b;
    public final bgp c;
    public final ipb d;

    public g33(tce tceVar, rwj rwjVar, bgp bgpVar, ipb ipbVar) {
        this.a = tceVar;
        this.b = rwjVar;
        this.c = bgpVar;
        this.d = ipbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0051, code lost:
    
        if (defpackage.lpb.a.contains(r9) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zf7 b(g33 g33Var, BitmapFactory.Options options) {
        xob xobVar;
        Exception exc;
        Context context;
        int i;
        boolean z;
        int min;
        double max;
        Bitmap createBitmap;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        ColorSpace colorSpace;
        int i2;
        rwj rwjVar = g33Var.b;
        tce tceVar = g33Var.a;
        d33 d33Var = new d33(tceVar.o());
        ikn iknVar = new ikn(d33Var);
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new fi3(iknVar.peek(), i3), null, options);
        Exception exc2 = (Exception) d33Var.c;
        if (exc2 != null) {
            throw exc2;
        }
        options.inJustDecodeBounds = false;
        Paint paint = kpb.a;
        String str = options.outMimeType;
        ipb ipbVar = g33Var.d;
        Set set = lpb.a;
        int ordinal = ipbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
            } else if (str != null) {
            }
            epb epbVar = new epb(new sm3(new fi3(iknVar.peek(), i3)));
            int c = epbVar.c();
            boolean z2 = c == 2 || c == 7 || c == 4 || c == 5;
            switch (epbVar.c()) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            xobVar = new xob(i2, z2);
            int i4 = xobVar.b;
            boolean z3 = xobVar.a;
            exc = (Exception) d33Var.c;
            if (exc == null) {
                throw exc;
            }
            options.inMutable = false;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 26 && (colorSpace = rwjVar.c) != null) {
                options.inPreferredColorSpace = colorSpace;
            }
            boolean z4 = rwjVar.h;
            Context context2 = rwjVar.a;
            lmq lmqVar = rwjVar.d;
            options.inPremultiplied = z4;
            Bitmap.Config config4 = rwjVar.b;
            if ((z3 || i4 > 0) && (config4 == null || fx1.j(config4))) {
                config4 = Bitmap.Config.ARGB_8888;
            }
            if (rwjVar.g && config4 == Bitmap.Config.ARGB_8888 && Intrinsics.d(options.outMimeType, "image/jpeg")) {
                config4 = Bitmap.Config.RGB_565;
            }
            if (i5 >= 26) {
                config = options.outConfig;
                config2 = Bitmap.Config.RGBA_F16;
                if (config == config2) {
                    config3 = Bitmap.Config.HARDWARE;
                    if (config4 != config3) {
                        config4 = config2;
                    }
                }
            }
            options.inPreferredConfig = config4;
            vnj g = tceVar.g();
            if ((g instanceof x2o) && Intrinsics.d(lmqVar, lmq.c)) {
                options.inSampleSize = 1;
                options.inScaled = true;
                options.inDensity = ((x2o) g).l;
                options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
                i = 1;
                context = context2;
                z = false;
            } else {
                int i6 = options.outWidth;
                if (i6 > 0) {
                    int i7 = options.outHeight;
                    if (i7 <= 0) {
                        i = 1;
                        context = context2;
                    } else {
                        int i8 = (i4 == 90 || i4 == 270) ? i7 : i6;
                        if (i4 != 90 && i4 != 270) {
                            i6 = i7;
                        }
                        nso nsoVar = rwjVar.e;
                        lmq lmqVar2 = lmq.c;
                        int e = Intrinsics.d(lmqVar, lmqVar2) ? i8 : k.e(lmqVar.a, nsoVar);
                        int e2 = Intrinsics.d(lmqVar, lmqVar2) ? i6 : k.e(lmqVar.b, nsoVar);
                        int highestOneBit = Integer.highestOneBit(i8 / e);
                        int highestOneBit2 = Integer.highestOneBit(i6 / e2);
                        int ordinal2 = nsoVar.ordinal();
                        if (ordinal2 == 0) {
                            min = Math.min(highestOneBit, highestOneBit2);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            min = Math.max(highestOneBit, highestOneBit2);
                        }
                        if (min < 1) {
                            min = 1;
                        }
                        options.inSampleSize = min;
                        double d = min;
                        context = context2;
                        double d2 = e / (i8 / d);
                        double d3 = e2 / (i6 / d);
                        int ordinal3 = nsoVar.ordinal();
                        if (ordinal3 == 0) {
                            max = Math.max(d2, d3);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            max = Math.min(d2, d3);
                        }
                        if (rwjVar.f && max > 1.0d) {
                            max = 1.0d;
                        }
                        boolean z5 = max == 1.0d;
                        options.inScaled = !z5;
                        if (!z5) {
                            if (max > 1.0d) {
                                options.inDensity = eeh.a(Integer.MAX_VALUE / max);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = eeh.a(Integer.MAX_VALUE * max);
                            }
                        }
                        z = false;
                        i = 1;
                    }
                } else {
                    context = context2;
                    i = 1;
                }
                options.inSampleSize = i;
                z = false;
                options.inScaled = false;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(new fi3(iknVar, i), null, options);
                iknVar.close();
                Exception exc3 = (Exception) d33Var.c;
                if (exc3 != null) {
                    throw exc3;
                }
                if (decodeStream == null) {
                    xq0.q("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    return null;
                }
                decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                if (z3 || i4 > 0) {
                    Matrix matrix = new Matrix();
                    float width = decodeStream.getWidth() / 2.0f;
                    float height = decodeStream.getHeight() / 2.0f;
                    if (z3) {
                        matrix.postScale(-1.0f, 1.0f, width, height);
                    }
                    if (i4 > 0) {
                        matrix.postRotate(i4, width, height);
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                    matrix.mapRect(rectF);
                    float f = rectF.left;
                    if (f != 0.0f || rectF.top != 0.0f) {
                        matrix.postTranslate(-f, -rectF.top);
                    }
                    if (i4 == 90 || i4 == 270) {
                        int height2 = decodeStream.getHeight();
                        int width2 = decodeStream.getWidth();
                        Bitmap.Config config5 = decodeStream.getConfig();
                        if (config5 == null) {
                            config5 = Bitmap.Config.ARGB_8888;
                        }
                        createBitmap = Bitmap.createBitmap(height2, width2, config5);
                    } else {
                        int width3 = decodeStream.getWidth();
                        int height3 = decodeStream.getHeight();
                        Bitmap.Config config6 = decodeStream.getConfig();
                        if (config6 == null) {
                            config6 = Bitmap.Config.ARGB_8888;
                        }
                        createBitmap = Bitmap.createBitmap(width3, height3, config6);
                    }
                    new Canvas(createBitmap).drawBitmap(decodeStream, matrix, kpb.a);
                    decodeStream.recycle();
                    decodeStream = createBitmap;
                }
                return new zf7(new BitmapDrawable(context.getResources(), decodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z);
            } finally {
            }
        }
        xobVar = xob.c;
        int i42 = xobVar.b;
        boolean z32 = xobVar.a;
        exc = (Exception) d33Var.c;
        if (exc == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.dg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        f33 f33Var;
        nm6 nm6Var;
        int i;
        bgp bgpVar;
        g33 g33Var;
        bgp bgpVar2;
        Throwable th;
        Object S;
        try {
            if (continuation instanceof f33) {
                f33Var = (f33) continuation;
                int i2 = f33Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    f33Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = f33Var.l;
                    nm6Var = nm6.a;
                    i = f33Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        f33Var.j = this;
                        bgpVar = this.c;
                        f33Var.k = bgpVar;
                        f33Var.n = 1;
                        if (bgpVar.c(f33Var) != nm6Var) {
                            g33Var = this;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bgpVar2 = (bgp) f33Var.j;
                        try {
                            qgg.h0(obj);
                            zf7 zf7Var = (zf7) obj;
                            bgpVar2.e();
                            return zf7Var;
                        } catch (Throwable th2) {
                            th = th2;
                            bgpVar2.e();
                            throw th;
                        }
                    }
                    bgp bgpVar3 = f33Var.k;
                    g33Var = (g33) f33Var.j;
                    qgg.h0(obj);
                    bgpVar = bgpVar3;
                    k5 k5Var = new k5(15, g33Var);
                    f33Var.j = bgpVar;
                    f33Var.k = null;
                    f33Var.n = 2;
                    S = sk3.S(g.a, k5Var, f33Var);
                    if (S != nm6Var) {
                        bgpVar2 = bgpVar;
                        obj = S;
                        zf7 zf7Var2 = (zf7) obj;
                        bgpVar2.e();
                        return zf7Var2;
                    }
                    return nm6Var;
                }
            }
            k5 k5Var2 = new k5(15, g33Var);
            f33Var.j = bgpVar;
            f33Var.k = null;
            f33Var.n = 2;
            S = sk3.S(g.a, k5Var2, f33Var);
            if (S != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            bgpVar2 = bgpVar;
            th = th3;
            bgpVar2.e();
            throw th;
        }
        f33Var = new f33(this, (cg6) continuation);
        Object obj2 = f33Var.l;
        nm6Var = nm6.a;
        i = f33Var.n;
        if (i != 0) {
        }
    }
}
