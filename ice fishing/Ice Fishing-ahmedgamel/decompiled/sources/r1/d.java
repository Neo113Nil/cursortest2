package r1;

import android.graphics.Bitmap;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.gms.internal.ads.C2991bm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f40357a;

    /* renamed from: c, reason: collision with root package name */
    public final C2991bm f40359c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f40360d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f40361e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f40362f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f40363g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40364h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f40365j;

    /* renamed from: k, reason: collision with root package name */
    public int f40366k;

    /* renamed from: l, reason: collision with root package name */
    public b f40367l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f40368m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40369n;

    /* renamed from: o, reason: collision with root package name */
    public int f40370o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40371p;

    /* renamed from: q, reason: collision with root package name */
    public final int f40372q;

    /* renamed from: r, reason: collision with root package name */
    public final int f40373r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f40374s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f40358b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f40375t = Bitmap.Config.ARGB_8888;

    public d(C2991bm c2991bm, b bVar, ByteBuffer byteBuffer, int i) {
        this.f40359c = c2991bm;
        this.f40367l = new b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.f40370o = 0;
                this.f40367l = bVar;
                this.f40366k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f40360d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f40360d.order(ByteOrder.LITTLE_ENDIAN);
                this.f40369n = false;
                Iterator it = bVar.f40347e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C4947a) it.next()).f40339g == 3) {
                        this.f40369n = true;
                        break;
                    }
                }
                this.f40371p = highestOneBit;
                int i6 = bVar.f40348f;
                this.f40373r = i6 / highestOneBit;
                int i9 = bVar.f40349g;
                this.f40372q = i9 / highestOneBit;
                int i10 = i6 * i9;
                C2941aq c2941aq = (C2941aq) this.f40359c.f29324v;
                this.i = c2941aq == null ? new byte[i10] : (byte[]) c2941aq.f(i10, byte[].class);
                C2991bm c2991bm2 = this.f40359c;
                int i11 = this.f40373r * this.f40372q;
                C2941aq c2941aq2 = (C2941aq) c2991bm2.f29324v;
                this.f40365j = c2941aq2 == null ? new int[i11] : (int[]) c2941aq2.f(i11, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f40374s;
        Bitmap c9 = ((InterfaceC5104a) this.f40359c.f29323u).c(this.f40373r, this.f40372q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f40375t);
        c9.setHasAlpha(true);
        return c9;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap b() {
        int i;
        int[] iArr;
        try {
            if (this.f40367l.f40345c > 0) {
                if (this.f40366k < 0) {
                }
                i = this.f40370o;
                if (i != 1 && i != 2) {
                    this.f40370o = 0;
                    if (this.f40361e == null) {
                        C2941aq c2941aq = (C2941aq) this.f40359c.f29324v;
                        this.f40361e = c2941aq == null ? new byte[p.f8473b] : (byte[]) c2941aq.f(p.f8473b, byte[].class);
                    }
                    C4947a c4947a = (C4947a) this.f40367l.f40347e.get(this.f40366k);
                    int i6 = this.f40366k - 1;
                    C4947a c4947a2 = i6 < 0 ? (C4947a) this.f40367l.f40347e.get(i6) : null;
                    iArr = c4947a.f40342k;
                    if (iArr != null) {
                        iArr = this.f40367l.f40343a;
                    }
                    this.f40357a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("d", 3)) {
                            Log.d("d", "No valid color table found for frame #" + this.f40366k);
                        }
                        this.f40370o = 1;
                        return null;
                    }
                    if (c4947a.f40338f) {
                        System.arraycopy(iArr, 0, this.f40358b, 0, iArr.length);
                        int[] iArr2 = this.f40358b;
                        this.f40357a = iArr2;
                        iArr2[c4947a.f40340h] = 0;
                        if (c4947a.f40339g == 2 && this.f40366k == 0) {
                            this.f40374s = Boolean.TRUE;
                        }
                    }
                    return d(c4947a, c4947a2);
                }
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, status=" + this.f40370o);
                }
                return null;
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, frameCount=" + this.f40367l.f40345c + ", framePointer=" + this.f40366k);
            }
            this.f40370o = 1;
            i = this.f40370o;
            if (i != 1) {
                this.f40370o = 0;
                if (this.f40361e == null) {
                }
                C4947a c4947a3 = (C4947a) this.f40367l.f40347e.get(this.f40366k);
                int i62 = this.f40366k - 1;
                if (i62 < 0) {
                }
                iArr = c4947a3.f40342k;
                if (iArr != null) {
                }
                this.f40357a = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("d", 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f40375t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r4.f40351j == r36.f40340h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(C4947a c4947a, C4947a c4947a2) {
        int[] iArr;
        byte b9;
        int i;
        int i6;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        short[] sArr;
        short s9;
        short s10;
        int i12;
        Bitmap bitmap;
        int i13;
        int i14;
        int i15;
        int[] iArr3 = this.f40365j;
        C2991bm c2991bm = this.f40359c;
        byte b10 = 0;
        if (c4947a2 == null) {
            Bitmap bitmap2 = this.f40368m;
            if (bitmap2 != null) {
                ((InterfaceC5104a) c2991bm.f29323u).d(bitmap2);
            }
            this.f40368m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c4947a2 != null && c4947a2.f40339g == 3 && this.f40368m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c4947a2 != null && (i12 = c4947a2.f40339g) > 0) {
            if (i12 == 2) {
                if (!c4947a.f40338f) {
                    b bVar = this.f40367l;
                    i13 = bVar.f40352k;
                    if (c4947a.f40342k != null) {
                    }
                    int i16 = c4947a2.f40336d;
                    int i17 = this.f40371p;
                    int i18 = i16 / i17;
                    int i19 = c4947a2.f40334b / i17;
                    int i20 = c4947a2.f40335c / i17;
                    int i21 = c4947a2.f40333a / i17;
                    int i22 = this.f40373r;
                    i14 = (i19 * i22) + i21;
                    i15 = (i18 * i22) + i14;
                    while (i14 < i15) {
                        int i23 = i14 + i20;
                        for (int i24 = i14; i24 < i23; i24++) {
                            iArr3[i24] = i13;
                        }
                        i14 += this.f40373r;
                    }
                }
                i13 = 0;
                int i162 = c4947a2.f40336d;
                int i172 = this.f40371p;
                int i182 = i162 / i172;
                int i192 = c4947a2.f40334b / i172;
                int i202 = c4947a2.f40335c / i172;
                int i212 = c4947a2.f40333a / i172;
                int i222 = this.f40373r;
                i14 = (i192 * i222) + i212;
                i15 = (i182 * i222) + i14;
                while (i14 < i15) {
                }
            } else if (i12 == 3 && (bitmap = this.f40368m) != null) {
                int i25 = this.f40373r;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, this.f40372q);
            }
        }
        int[] iArr4 = iArr3;
        this.f40360d.position(c4947a.f40341j);
        int i26 = c4947a.f40335c * c4947a.f40336d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i26) {
            C2941aq c2941aq = (C2941aq) c2991bm.f29324v;
            this.i = c2941aq == null ? new byte[i26] : (byte[]) c2941aq.f(i26, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f40362f == null) {
            this.f40362f = new short[4096];
        }
        short[] sArr2 = this.f40362f;
        if (this.f40363g == null) {
            this.f40363g = new byte[4096];
        }
        byte[] bArr3 = this.f40363g;
        if (this.f40364h == null) {
            this.f40364h = new byte[4097];
        }
        byte[] bArr4 = this.f40364h;
        int i27 = this.f40360d.get() & 255;
        int i28 = 1;
        int i29 = 1 << i27;
        int i30 = i29 + 1;
        int i31 = i29 + 2;
        int i32 = i27 + 1;
        int i33 = (1 << i32) - 1;
        int i34 = 0;
        while (i34 < i29) {
            sArr2[i34] = 0;
            bArr3[i34] = (byte) i34;
            i34++;
            i28 = i28;
        }
        int i35 = i28;
        byte[] bArr5 = this.f40361e;
        int i36 = i32;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = i31;
        int i46 = i33;
        short s11 = -1;
        while (true) {
            if (i37 >= i26) {
                iArr = iArr4;
                b9 = b10;
                break;
            }
            if (i38 == 0) {
                s9 = -1;
                int i47 = this.f40360d.get() & 255;
                if (i47 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.f40360d;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.f40361e, 0, Math.min(i47, byteBuffer.remaining()));
                }
                if (i47 <= 0) {
                    this.f40370o = 3;
                    b9 = 0;
                    break;
                }
                i38 = i47;
                i39 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                s9 = -1;
            }
            i41 += (bArr5[i39] & 255) << i40;
            i39++;
            i38--;
            int i48 = i40 + 8;
            int i49 = i45;
            int i50 = i36;
            short s12 = s11;
            int i51 = i43;
            while (true) {
                i40 = i48;
                if (i48 < i50) {
                    i36 = i50;
                    s11 = s12;
                    i43 = i51;
                    iArr4 = iArr;
                    b10 = 0;
                    i45 = i49;
                    sArr2 = sArr;
                    break;
                }
                int i52 = i41 & i46;
                i41 >>= i50;
                i40 -= i50;
                if (i52 == i29) {
                    i50 = i32;
                    i49 = i31;
                    i46 = i33;
                    i48 = i40;
                    s12 = s9;
                } else {
                    if (i52 == i30) {
                        i45 = i49;
                        i36 = i50;
                        s11 = s12;
                        i43 = i51;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b10 = 0;
                        break;
                    }
                    int i53 = i37;
                    if (s12 == s9) {
                        bArr2[i42] = bArr3[i52 == true ? 1 : 0];
                        i42++;
                        i37 = i53 + 1;
                        s12 = i52 == true ? 1 : 0;
                        i51 = s12;
                        i48 = i40;
                    } else {
                        if (i52 >= i49) {
                            bArr4[i44] = (byte) i51;
                            i44++;
                            s10 = s12;
                        } else {
                            s10 = i52 == true ? 1 : 0;
                        }
                        while (s10 >= i29) {
                            bArr4[i44] = bArr3[s10];
                            i44++;
                            s10 = sArr[s10];
                        }
                        i51 = bArr3[s10] & 255;
                        byte b11 = (byte) i51;
                        bArr2[i42] = b11;
                        while (true) {
                            i42++;
                            i53++;
                            if (i44 <= 0) {
                                break;
                            }
                            i44--;
                            bArr2[i42] = bArr4[i44];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = s12;
                            bArr3[i49] = b11;
                            i49++;
                            if ((i49 & i46) == 0 && i49 < 4096) {
                                i50++;
                                i46 += i49;
                            }
                        }
                        i48 = i40;
                        i37 = i53;
                        s12 = i52 == true ? 1 : 0;
                    }
                    s9 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i42, i26, b9);
        if (c4947a.f40337e || this.f40371p != i35) {
            int[] iArr5 = this.f40365j;
            int i54 = c4947a.f40336d;
            int i55 = this.f40371p;
            int i56 = i54 / i55;
            int i57 = c4947a.f40334b / i55;
            int i58 = c4947a.f40335c / i55;
            int i59 = c4947a.f40333a / i55;
            boolean z3 = this.f40366k == 0;
            int i60 = this.f40373r;
            int i61 = this.f40372q;
            byte[] bArr6 = this.i;
            int[] iArr6 = this.f40357a;
            Boolean bool = this.f40374s;
            int i62 = 8;
            int i63 = 0;
            int i64 = 1;
            int i65 = 0;
            while (i65 < i56) {
                int[] iArr7 = iArr5;
                if (c4947a.f40337e) {
                    if (i63 >= i56) {
                        i64++;
                        if (i64 == 2) {
                            i63 = 4;
                        } else if (i64 == 3) {
                            i62 = 4;
                            i63 = 2;
                        } else if (i64 == 4) {
                            i63 = 1;
                            i62 = 2;
                        }
                    }
                    i = i63 + i62;
                } else {
                    i = i63;
                    i63 = i65;
                }
                int i66 = i63 + i57;
                int i67 = i;
                boolean z6 = i55 == 1;
                if (i66 < i61) {
                    int i68 = i66 * i60;
                    int i69 = i68 + i59;
                    boolean z9 = z6;
                    int i70 = i69 + i58;
                    int i71 = i68 + i60;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    i6 = i56;
                    int i72 = i65 * i55 * c4947a.f40335c;
                    if (z9) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr6[bArr6[i72] & p.f8473b];
                            if (i75 != 0) {
                                iArr7[i74] = i75;
                            } else if (z3 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i55;
                            i73 = i74 + 1;
                        }
                    } else {
                        int i76 = ((i70 - i69) * i55) + i72;
                        i9 = i55;
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = c4947a.f40335c;
                            int i80 = i77;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= this.f40371p + i72) {
                                    i10 = i57;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i10 = i57;
                                if (i81 >= bArr7.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.f40357a[bArr7[i81] & p.f8473b];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & p.f8473b;
                                    i83 += (i87 >> 16) & p.f8473b;
                                    i84 += (i87 >> 8) & p.f8473b;
                                    i85 += i87 & p.f8473b;
                                    i86++;
                                }
                                i81++;
                                i57 = i10;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.f40371p + i88) {
                                byte[] bArr8 = this.i;
                                int i90 = i88;
                                if (i89 >= bArr8.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.f40357a[bArr8[i89] & p.f8473b];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & p.f8473b;
                                    i83 += (i91 >> 16) & p.f8473b;
                                    i84 += (i91 >> 8) & p.f8473b;
                                    i85 += i91 & p.f8473b;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                            }
                            int i92 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i92 != 0) {
                                iArr7[i80] = i92;
                            } else if (z3 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i9;
                            i77 = i80 + 1;
                            i70 = i78;
                            i57 = i10;
                        }
                        i65++;
                        iArr5 = iArr7;
                        i63 = i67;
                        i55 = i9;
                        i56 = i6;
                        i57 = i57;
                    }
                } else {
                    i6 = i56;
                }
                i9 = i55;
                i65++;
                iArr5 = iArr7;
                i63 = i67;
                i55 = i9;
                i56 = i6;
                i57 = i57;
            }
            if (this.f40374s == null) {
                this.f40374s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.f40365j;
            int i93 = c4947a.f40336d;
            int i94 = c4947a.f40334b;
            int i95 = c4947a.f40335c;
            int i96 = c4947a.f40333a;
            byte b12 = this.f40366k == 0 ? (byte) 1 : b9;
            int i97 = this.f40373r;
            byte[] bArr9 = this.i;
            int[] iArr9 = this.f40357a;
            int i98 = -1;
            for (int i99 = b9; i99 < i93; i99++) {
                int i100 = (i99 + i94) * i97;
                int i101 = i100 + i96;
                int i102 = i101 + i95;
                int i103 = i100 + i97;
                if (i103 < i102) {
                    i102 = i103;
                }
                int i104 = c4947a.f40335c * i99;
                while (i101 < i102) {
                    int[] iArr10 = iArr8;
                    int i105 = bArr9[i104];
                    int i106 = i93;
                    int i107 = i105 & p.f8473b;
                    if (i107 != i98) {
                        int i108 = iArr9[i107];
                        if (i108 != 0) {
                            iArr10[i101] = i108;
                        } else {
                            i98 = i105;
                        }
                    }
                    i104++;
                    i101++;
                    iArr8 = iArr10;
                    i93 = i106;
                }
            }
            Boolean bool2 = this.f40374s;
            this.f40374s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f40374s != null || b12 == 0 || i98 == -1));
        }
        if (this.f40369n && ((i11 = c4947a.f40339g) == 0 || i11 == 1)) {
            if (this.f40368m == null) {
                this.f40368m = a();
            }
            Bitmap bitmap3 = this.f40368m;
            int i109 = this.f40373r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i109, 0, 0, i109, this.f40372q);
        } else {
            iArr2 = iArr;
        }
        Bitmap a9 = a();
        int i110 = this.f40373r;
        a9.setPixels(iArr2, 0, i110, 0, 0, i110, this.f40372q);
        return a9;
    }
}
