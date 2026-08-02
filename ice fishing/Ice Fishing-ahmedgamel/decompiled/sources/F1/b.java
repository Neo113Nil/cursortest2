package F1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.EnumC4966a;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class b implements s1.j {

    /* renamed from: f, reason: collision with root package name */
    public static final E3.e f904f = new E3.e();

    /* renamed from: g, reason: collision with root package name */
    public static final a f905g = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f906a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f907b;

    /* renamed from: c, reason: collision with root package name */
    public final a f908c;

    /* renamed from: d, reason: collision with root package name */
    public final E3.e f909d;

    /* renamed from: e, reason: collision with root package name */
    public final C2991bm f910e;

    public b(Context context, ArrayList arrayList, InterfaceC5104a interfaceC5104a, C2941aq c2941aq) {
        E3.e eVar = f904f;
        this.f906a = context.getApplicationContext();
        this.f907b = arrayList;
        this.f909d = eVar;
        this.f910e = new C2991bm(1, interfaceC5104a, c2941aq);
        this.f908c = f905g;
    }

    public static int d(r1.b bVar, int i, int i6) {
        int min = Math.min(bVar.f40349g / i6, bVar.f40348f / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder h9 = AbstractC4404f.h(max, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            h9.append(i6);
            h9.append("], actual dimens: [");
            h9.append(bVar.f40348f);
            h9.append("x");
            h9.append(bVar.f40349g);
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
            F1.a r8 = r7.f908c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f903u     // Catch: java.lang.Throwable -> L56
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
            r5.f40354b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.f40353a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            r1.b r0 = new r1.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.f40355c = r0     // Catch: java.lang.Throwable -> L56
            r5.f40356d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.f40354b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.f40354b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            D1.b r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            F1.a r9 = r1.f908c
            r9.u(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            F1.a r9 = r1.f908c
            r9.u(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: F1.b.a(java.lang.Object, int, int, s1.h):u1.x");
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        return !((Boolean) hVar.c(i.f947b)).booleanValue() && com.bumptech.glide.e.f(this.f907b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final D1.b c(ByteBuffer byteBuffer, int i, int i6, r1.c cVar, s1.h hVar) {
        StringBuilder sb;
        int i9 = N1.j.f1921b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            r1.b b9 = cVar.b();
            if (b9.f40345c > 0 && b9.f40344b == 0) {
                Bitmap.Config config = hVar.c(i.f946a) == EnumC4966a.f40447u ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d2 = d(b9, i, i6);
                E3.e eVar = this.f909d;
                C2991bm c2991bm = this.f910e;
                eVar.getClass();
                r1.d dVar = new r1.d(c2991bm, b9, byteBuffer, d2);
                dVar.c(config);
                dVar.f40366k = (dVar.f40366k + 1) % dVar.f40367l.f40345c;
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
                D1.b bVar = new D1.b(new c(new E0.e(1, new h(com.bumptech.glide.c.a(this.f906a), dVar, i, i6, b10))), 1);
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
