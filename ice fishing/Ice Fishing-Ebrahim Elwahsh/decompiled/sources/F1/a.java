package F1;

import L2.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.EnumC4988a;
import s1.j;
import t0.AbstractC5051n;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final i f951f = new i(3);

    /* renamed from: g, reason: collision with root package name */
    public static final I0.j f952g = new I0.j(4);

    /* renamed from: a, reason: collision with root package name */
    public final Context f953a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f954b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.j f955c;

    /* renamed from: d, reason: collision with root package name */
    public final i f956d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.e f957e;

    public a(Context context, ArrayList arrayList, InterfaceC5117a interfaceC5117a, C3112dq c3112dq) {
        i iVar = f951f;
        this.f953a = context.getApplicationContext();
        this.f954b = arrayList;
        this.f956d = iVar;
        this.f957e = new S0.e(2, interfaceC5117a, c3112dq);
        this.f955c = f952g;
    }

    public static int d(r1.b bVar, int i, int i4) {
        int min = Math.min(bVar.f40251g / i4, bVar.f40250f / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder h9 = AbstractC5051n.h(max, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            h9.append(i4);
            h9.append("], actual dimens: [");
            h9.append(bVar.f40250f);
            h9.append("x");
            h9.append(bVar.f40251g);
            h9.append("]");
            Log.v("BufferGifDecoder", h9.toString());
        }
        return max;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // s1.j
    public final u1.x a(java.lang.Object r8, int r9, int r10, s1.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            I0.j r8 = r7.f955c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f1233u     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            r1.c r0 = (r1.c) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            r1.c r0 = new r1.c     // Catch: java.lang.Throwable -> L19
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
            r5.f40256b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.f40255a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            r1.b r0 = new r1.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.f40257c = r0     // Catch: java.lang.Throwable -> L56
            r5.f40258d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.f40256b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.f40256b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            D1.b r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            I0.j r9 = r1.f955c
            r9.x(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            I0.j r9 = r1.f955c
            r9.x(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: F1.a.a(java.lang.Object, int, int, s1.h):u1.x");
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        return !((Boolean) hVar.c(g.f992b)).booleanValue() && S0.f.l(this.f954b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final D1.b c(ByteBuffer byteBuffer, int i, int i4, r1.c cVar, s1.h hVar) {
        StringBuilder sb;
        int i9 = N1.j.f1965b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            r1.b b9 = cVar.b();
            if (b9.f40247c > 0 && b9.f40246b == 0) {
                Bitmap.Config config = hVar.c(g.f991a) == EnumC4988a.f40416u ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d2 = d(b9, i, i4);
                i iVar = this.f956d;
                S0.e eVar = this.f957e;
                iVar.getClass();
                r1.d dVar = new r1.d(eVar, b9, byteBuffer, d2);
                dVar.c(config);
                dVar.f40268k = (dVar.f40268k + 1) % dVar.f40269l.f40247c;
                Bitmap b10 = dVar.b();
                if (b10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(N1.j.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                D1.b bVar = new D1.b(new b(new E0.e(1, new f(com.bumptech.glide.c.a(this.f953a), dVar, i, i4, b10))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + N1.j.a(elapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(N1.j.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + N1.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
