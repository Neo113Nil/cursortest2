package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.yandex.images.ImageManager$From;
import com.yandex.images.SourcePolicy;
import com.yandex.images.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public final class v06 implements Runnable {
    public static final AtomicInteger I = new AtomicInteger();
    public static final int[] J = {1000, 2700, 8150};
    public static final int K = 3;
    public static final fg1 L = new fg1(4);
    public int A;
    public ffv B;
    public int D;
    public ImageManager$From E;
    public Uri F;
    public mav G;
    public final a a;
    public final w3i b;
    public final xn50 c;
    public final zn50 w;
    public final String x;
    public final ArrayList y;
    public ht10 z;
    public int H = 0;
    public final int C = I.incrementAndGet();

    public v06(a aVar, w3i w3iVar, bl7 bl7Var, zn50 zn50Var) {
        this.a = aVar;
        this.b = w3iVar;
        ArrayList arrayList = new ArrayList(3);
        this.y = arrayList;
        arrayList.add(bl7Var);
        this.x = bl7Var.d;
        xn50 xn50Var = bl7Var.b;
        this.c = xn50Var;
        this.D = xn50Var.c;
        this.w = zn50Var;
        this.A = zn50Var.b();
    }

    public static void d(xn50 xn50Var) {
        String xn50Var2 = xn50Var.toString();
        StringBuilder sb = (StringBuilder) L.get();
        sb.ensureCapacity(xn50Var2.length() + 12);
        sb.replace(12, sb.length(), xn50Var2);
        Thread.currentThread().setName(sb.toString());
    }

    public final ht10 a(ht10 ht10Var) {
        xn50 xn50Var = this.c;
        ow01 ow01Var = xn50Var.m;
        if (ow01Var != null) {
            Bitmap bitmap = (Bitmap) ht10Var.b;
            byte[] bArr = (byte[]) ht10Var.c;
            if ((bitmap != null || bArr != null) && this.E == ImageManager$From.NETWORK) {
                if (bArr != null) {
                    bitmap = xn50Var.g ? d5b1.f(xn50Var.i, xn50Var.j, bArr) : d5b1.g(bArr, null);
                }
                z83.d(bitmap, "bitmap must not be null if bytes are");
                Bitmap A = ow01Var.A(bitmap);
                if (A != bitmap && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                return new ht10(A, (byte[]) null);
            }
        }
        return ht10Var;
    }

    public final ht10 b() {
        xn50 xn50Var = this.c;
        int i = xn50Var.h;
        ljt0 ljt0Var = SourcePolicy.Companion;
        ljt0Var.getClass();
        boolean z = (i & SourcePolicy.SKIP_DISK_CACHE.index) != 0;
        w3i w3iVar = this.b;
        ad7 d = w3iVar.d(xn50Var, z);
        z83.d(xn50Var, null);
        File g = w3iVar.g(xn50Var);
        this.F = g == null ? null : w3iVar.h(g);
        if (d != null) {
            this.E = d.d;
            return new ht10(d.a, (byte[]) null);
        }
        int i2 = xn50Var.h;
        ljt0Var.getClass();
        if ((i2 & SourcePolicy.OFFLINE.index) != 0) {
            return null;
        }
        this.E = ImageManager$From.NETWORK;
        return this.w.c(xn50Var);
    }

    public final boolean c() {
        ffv ffvVar = this.B;
        return ffvVar != null && ffvVar.isCancelled();
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        try {
            try {
                d(this.c);
                ht10 a = a(b());
                this.z = a;
                if (a != null) {
                    if (!(((Bitmap) a.b) == null && ((byte[]) a.c) == null)) {
                        Handler handler = aVar.f;
                        handler.sendMessage(handler.obtainMessage(6, this));
                    }
                }
                Handler handler2 = aVar.f;
                handler2.sendMessage(handler2.obtainMessage(8, this));
            } catch (IOException e) {
                this.G = mav.a(e);
                int i = this.H;
                if (i < K) {
                    int i2 = J[i];
                    Handler handler3 = aVar.f;
                    handler3.sendMessageDelayed(handler3.obtainMessage(7, this), i2);
                    this.H++;
                } else {
                    Handler handler4 = aVar.f;
                    handler4.sendMessage(handler4.obtainMessage(8, this));
                }
            } catch (Exception e2) {
                this.G = mav.a(e2);
                Handler handler5 = aVar.f;
                handler5.sendMessage(handler5.obtainMessage(8, this));
            }
        } finally {
            Thread.currentThread().setName("bitmapHunterIdle");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapHunter{mNetImage = [");
        sb.append(this.c);
        sb.append("], mKey=[");
        sb.append(this.x);
        sb.append("], mSequence=[");
        sb.append(this.C);
        sb.append("], mPriority=[");
        sb.append(this.D);
        sb.append("], mRetryCount=[");
        return oyr.m(this.A, "]}", sb);
    }
}
