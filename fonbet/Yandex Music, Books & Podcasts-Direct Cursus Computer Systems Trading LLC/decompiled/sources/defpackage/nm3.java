package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nm3 implements o2o {
    public static final qee f = new qee(16);
    public static final bnd g = new bnd(11);
    public final Context a;
    public final ArrayList b;
    public final jtc e;
    public final qee d = f;
    public final bnd c = g;

    public nm3(Context context, ArrayList arrayList, r33 r33Var, z98 z98Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new jtc(r33Var, z98Var);
    }

    public static int d(wcd wcdVar, int i, int i2) {
        int min = Math.min(wcdVar.g / i2, wcdVar.f / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder l = dfi.l("Downsampling GIF, sampleSize: ", max, i, ", target dimens: [", "x");
            l.append(i2);
            l.append("], actual dimens: [");
            l.append(wcdVar.f);
            l.append("x");
            l.append(wcdVar.g);
            l.append("]");
            Log.v("BufferGifDecoder", l.toString());
        }
        return max;
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        return !((Boolean) pwjVar.c(ycd.b)).booleanValue() && lxe.u(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.o2o
    public final defpackage.k2o b(java.lang.Object r8, int r9, int r10, defpackage.pwj r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            bnd r8 = r7.c
            monitor-enter(r8)
            java.lang.Object r0 = r8.b     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            xcd r0 = (defpackage.xcd) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            xcd r0 = new xcd     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            wcd r0 = new wcd     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.c = r0     // Catch: java.lang.Throwable -> L56
            r5.d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            qcd r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            bnd r9 = r1.c
            r9.t(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            bnd r9 = r1.c
            r9.t(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm3.b(java.lang.Object, int, int, pwj):k2o");
    }

    public final qcd c(ByteBuffer byteBuffer, int i, int i2, xcd xcdVar, pwj pwjVar) {
        StringBuilder sb;
        int i3 = esg.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            wcd b = xcdVar.b();
            if (b.c > 0 && b.b == 0) {
                Bitmap.Config config = pwjVar.c(ycd.a) == vf7.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d = d(b, i, i2);
                qee qeeVar = this.d;
                jtc jtcVar = this.e;
                qeeVar.getClass();
                abr abrVar = new abr(jtcVar, b, byteBuffer, d);
                abrVar.c(config);
                abrVar.k = (abrVar.k + 1) % abrVar.l.c;
                Bitmap b2 = abrVar.b();
                if (b2 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(esg.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                qcd qcdVar = new qcd(new pcd(new ol0(2, new vcd(a.a(this.a), abrVar, i, i2, b2))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + esg.a(elapsedRealtimeNanos));
                }
                return qcdVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(esg.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }
}
