package H1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.Wv;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import u1.EnumC5062a;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class b implements u1.j {

    /* renamed from: f, reason: collision with root package name */
    public static final c4.e f1189f = new c4.e();

    /* renamed from: g, reason: collision with root package name */
    public static final a f1190g = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1191a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1192b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1193c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.e f1194d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.e f1195e;

    public b(Context context, ArrayList arrayList, InterfaceC5183a interfaceC5183a, C2964aq c2964aq) {
        c4.e eVar = f1189f;
        this.f1191a = context.getApplicationContext();
        this.f1192b = arrayList;
        this.f1194d = eVar;
        this.f1195e = new S0.e(2, interfaceC5183a, c2964aq);
        this.f1193c = f1190g;
    }

    public static int d(t1.b bVar, int i, int i4) {
        int min = Math.min(bVar.f40853g / i4, bVar.f40852f / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder j6 = Wv.j(max, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            j6.append(i4);
            j6.append("], actual dimens: [");
            j6.append(bVar.f40852f);
            j6.append("x");
            j6.append(bVar.f40853g);
            j6.append("]");
            Log.v("BufferGifDecoder", j6.toString());
        }
        return max;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // u1.j
    public final w1.w a(java.lang.Object r8, int r9, int r10, u1.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            H1.a r8 = r7.f1193c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f1188a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            t1.c r0 = (t1.c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            t1.c r0 = new t1.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f40858b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f40857a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            t1.b r0 = new t1.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f40859c = r0     // Catch: java.lang.Throwable -> L54
            r5.f40860d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f40858b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f40858b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            F1.b r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            H1.a r9 = r1.f1193c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            H1.a r9 = r1.f1193c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.b.a(java.lang.Object, int, int, u1.h):w1.w");
    }

    @Override // u1.j
    public final boolean b(Object obj, u1.h hVar) {
        return !((Boolean) hVar.c(i.f1232b)).booleanValue() && t8.g.l(this.f1192b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final F1.b c(ByteBuffer byteBuffer, int i, int i4, t1.c cVar, u1.h hVar) {
        StringBuilder sb;
        int i6 = P1.j.f2365b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            t1.b b9 = cVar.b();
            if (b9.f40849c > 0 && b9.f40848b == 0) {
                Bitmap.Config config = hVar.c(i.f1231a) == EnumC5062a.f41001u ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d9 = d(b9, i, i4);
                c4.e eVar = this.f1194d;
                S0.e eVar2 = this.f1195e;
                eVar.getClass();
                t1.d dVar = new t1.d(eVar2, b9, byteBuffer, d9);
                dVar.c(config);
                dVar.f40870k = (dVar.f40870k + 1) % dVar.f40871l.f40849c;
                Bitmap b10 = dVar.b();
                if (b10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(P1.j.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                F1.b bVar = new F1.b(new c(new E0.e(1, new h(com.bumptech.glide.c.a(this.f1191a), dVar, i, i4, b10))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + P1.j.a(elapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(P1.j.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + P1.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
