package t1;

import S0.e;
import android.graphics.Bitmap;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C2964aq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f40861a;

    /* renamed from: c, reason: collision with root package name */
    public final e f40863c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f40864d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f40865e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f40866f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f40867g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40868h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f40869j;

    /* renamed from: k, reason: collision with root package name */
    public int f40870k;

    /* renamed from: l, reason: collision with root package name */
    public b f40871l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f40872m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40873n;

    /* renamed from: o, reason: collision with root package name */
    public int f40874o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40875p;

    /* renamed from: q, reason: collision with root package name */
    public final int f40876q;

    /* renamed from: r, reason: collision with root package name */
    public final int f40877r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f40878s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f40862b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f40879t = Bitmap.Config.ARGB_8888;

    public d(e eVar, b bVar, ByteBuffer byteBuffer, int i) {
        this.f40863c = eVar;
        this.f40871l = new b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.f40874o = 0;
                this.f40871l = bVar;
                this.f40870k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f40864d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f40864d.order(ByteOrder.LITTLE_ENDIAN);
                this.f40873n = false;
                Iterator it = bVar.f40851e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C5031a) it.next()).f40843g == 3) {
                        this.f40873n = true;
                        break;
                    }
                }
                this.f40875p = highestOneBit;
                int i4 = bVar.f40852f;
                this.f40877r = i4 / highestOneBit;
                int i6 = bVar.f40853g;
                this.f40876q = i6 / highestOneBit;
                int i9 = i4 * i6;
                C2964aq c2964aq = (C2964aq) this.f40863c.f2909v;
                this.i = c2964aq == null ? new byte[i9] : (byte[]) c2964aq.f(i9, byte[].class);
                e eVar2 = this.f40863c;
                int i10 = this.f40877r * this.f40876q;
                C2964aq c2964aq2 = (C2964aq) eVar2.f2909v;
                this.f40869j = c2964aq2 == null ? new int[i10] : (int[]) c2964aq2.f(i10, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f40878s;
        Bitmap a9 = ((InterfaceC5183a) this.f40863c.f2908u).a(this.f40877r, this.f40876q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f40879t);
        a9.setHasAlpha(true);
        return a9;
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
            if (this.f40871l.f40849c > 0) {
                if (this.f40870k < 0) {
                }
                i = this.f40874o;
                if (i != 1 && i != 2) {
                    this.f40874o = 0;
                    if (this.f40865e == null) {
                        C2964aq c2964aq = (C2964aq) this.f40863c.f2909v;
                        this.f40865e = c2964aq == null ? new byte[p.f9259b] : (byte[]) c2964aq.f(p.f9259b, byte[].class);
                    }
                    C5031a c5031a = (C5031a) this.f40871l.f40851e.get(this.f40870k);
                    int i4 = this.f40870k - 1;
                    C5031a c5031a2 = i4 < 0 ? (C5031a) this.f40871l.f40851e.get(i4) : null;
                    iArr = c5031a.f40846k;
                    if (iArr != null) {
                        iArr = this.f40871l.f40847a;
                    }
                    this.f40861a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("d", 3)) {
                            Log.d("d", "No valid color table found for frame #" + this.f40870k);
                        }
                        this.f40874o = 1;
                        return null;
                    }
                    if (c5031a.f40842f) {
                        System.arraycopy(iArr, 0, this.f40862b, 0, iArr.length);
                        int[] iArr2 = this.f40862b;
                        this.f40861a = iArr2;
                        iArr2[c5031a.f40844h] = 0;
                        if (c5031a.f40843g == 2 && this.f40870k == 0) {
                            this.f40878s = Boolean.TRUE;
                        }
                    }
                    return d(c5031a, c5031a2);
                }
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, status=" + this.f40874o);
                }
                return null;
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, frameCount=" + this.f40871l.f40849c + ", framePointer=" + this.f40870k);
            }
            this.f40874o = 1;
            i = this.f40874o;
            if (i != 1) {
                this.f40874o = 0;
                if (this.f40865e == null) {
                }
                C5031a c5031a3 = (C5031a) this.f40871l.f40851e.get(this.f40870k);
                int i42 = this.f40870k - 1;
                if (i42 < 0) {
                }
                iArr = c5031a3.f40846k;
                if (iArr != null) {
                }
                this.f40861a = iArr;
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
            this.f40879t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r4.f40855j == r36.f40844h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(C5031a c5031a, C5031a c5031a2) {
        int[] iArr;
        byte b9;
        int i;
        int i4;
        int i6;
        int i9;
        int[] iArr2;
        int i10;
        short[] sArr;
        short s9;
        short s10;
        int i11;
        Bitmap bitmap;
        int i12;
        int i13;
        int i14;
        int[] iArr3 = this.f40869j;
        e eVar = this.f40863c;
        byte b10 = 0;
        if (c5031a2 == null) {
            Bitmap bitmap2 = this.f40872m;
            if (bitmap2 != null) {
                ((InterfaceC5183a) eVar.f2908u).b(bitmap2);
            }
            this.f40872m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c5031a2 != null && c5031a2.f40843g == 3 && this.f40872m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c5031a2 != null && (i11 = c5031a2.f40843g) > 0) {
            if (i11 == 2) {
                if (!c5031a.f40842f) {
                    b bVar = this.f40871l;
                    i12 = bVar.f40856k;
                    if (c5031a.f40846k != null) {
                    }
                    int i15 = c5031a2.f40840d;
                    int i16 = this.f40875p;
                    int i17 = i15 / i16;
                    int i18 = c5031a2.f40838b / i16;
                    int i19 = c5031a2.f40839c / i16;
                    int i20 = c5031a2.f40837a / i16;
                    int i21 = this.f40877r;
                    i13 = (i18 * i21) + i20;
                    i14 = (i17 * i21) + i13;
                    while (i13 < i14) {
                        int i22 = i13 + i19;
                        for (int i23 = i13; i23 < i22; i23++) {
                            iArr3[i23] = i12;
                        }
                        i13 += this.f40877r;
                    }
                }
                i12 = 0;
                int i152 = c5031a2.f40840d;
                int i162 = this.f40875p;
                int i172 = i152 / i162;
                int i182 = c5031a2.f40838b / i162;
                int i192 = c5031a2.f40839c / i162;
                int i202 = c5031a2.f40837a / i162;
                int i212 = this.f40877r;
                i13 = (i182 * i212) + i202;
                i14 = (i172 * i212) + i13;
                while (i13 < i14) {
                }
            } else if (i11 == 3 && (bitmap = this.f40872m) != null) {
                int i24 = this.f40877r;
                bitmap.getPixels(iArr3, 0, i24, 0, 0, i24, this.f40876q);
            }
        }
        int[] iArr4 = iArr3;
        this.f40864d.position(c5031a.f40845j);
        int i25 = c5031a.f40839c * c5031a.f40840d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i25) {
            C2964aq c2964aq = (C2964aq) eVar.f2909v;
            this.i = c2964aq == null ? new byte[i25] : (byte[]) c2964aq.f(i25, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f40866f == null) {
            this.f40866f = new short[4096];
        }
        short[] sArr2 = this.f40866f;
        if (this.f40867g == null) {
            this.f40867g = new byte[4096];
        }
        byte[] bArr3 = this.f40867g;
        if (this.f40868h == null) {
            this.f40868h = new byte[4097];
        }
        byte[] bArr4 = this.f40868h;
        int i26 = this.f40864d.get() & 255;
        int i27 = 1;
        int i28 = 1 << i26;
        int i29 = i28 + 1;
        int i30 = i28 + 2;
        int i31 = i26 + 1;
        int i32 = (1 << i31) - 1;
        int i33 = 0;
        while (i33 < i28) {
            sArr2[i33] = 0;
            bArr3[i33] = (byte) i33;
            i33++;
            i27 = i27;
        }
        int i34 = i27;
        byte[] bArr5 = this.f40865e;
        int i35 = i31;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = i30;
        int i45 = i32;
        short s11 = -1;
        while (true) {
            if (i36 >= i25) {
                iArr = iArr4;
                b9 = b10;
                break;
            }
            if (i37 == 0) {
                s9 = -1;
                int i46 = this.f40864d.get() & 255;
                if (i46 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.f40864d;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.f40865e, 0, Math.min(i46, byteBuffer.remaining()));
                }
                if (i46 <= 0) {
                    this.f40874o = 3;
                    b9 = 0;
                    break;
                }
                i37 = i46;
                i38 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                s9 = -1;
            }
            i40 += (bArr5[i38] & 255) << i39;
            i38++;
            i37--;
            int i47 = i39 + 8;
            int i48 = i44;
            int i49 = i35;
            short s12 = s11;
            int i50 = i42;
            while (true) {
                i39 = i47;
                if (i47 < i49) {
                    i35 = i49;
                    s11 = s12;
                    i42 = i50;
                    iArr4 = iArr;
                    b10 = 0;
                    i44 = i48;
                    sArr2 = sArr;
                    break;
                }
                int i51 = i40 & i45;
                i40 >>= i49;
                i39 -= i49;
                if (i51 == i28) {
                    i49 = i31;
                    i48 = i30;
                    i45 = i32;
                    i47 = i39;
                    s12 = s9;
                } else {
                    if (i51 == i29) {
                        i44 = i48;
                        i35 = i49;
                        s11 = s12;
                        i42 = i50;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b10 = 0;
                        break;
                    }
                    int i52 = i36;
                    if (s12 == s9) {
                        bArr2[i41] = bArr3[i51 == true ? 1 : 0];
                        i41++;
                        i36 = i52 + 1;
                        s12 = i51 == true ? 1 : 0;
                        i50 = s12;
                        i47 = i39;
                    } else {
                        if (i51 >= i48) {
                            bArr4[i43] = (byte) i50;
                            i43++;
                            s10 = s12;
                        } else {
                            s10 = i51 == true ? 1 : 0;
                        }
                        while (s10 >= i28) {
                            bArr4[i43] = bArr3[s10];
                            i43++;
                            s10 = sArr[s10];
                        }
                        i50 = bArr3[s10] & 255;
                        byte b11 = (byte) i50;
                        bArr2[i41] = b11;
                        while (true) {
                            i41++;
                            i52++;
                            if (i43 <= 0) {
                                break;
                            }
                            i43--;
                            bArr2[i41] = bArr4[i43];
                        }
                        if (i48 < 4096) {
                            sArr[i48] = s12;
                            bArr3[i48] = b11;
                            i48++;
                            if ((i48 & i45) == 0 && i48 < 4096) {
                                i49++;
                                i45 += i48;
                            }
                        }
                        i47 = i39;
                        i36 = i52;
                        s12 = i51 == true ? 1 : 0;
                    }
                    s9 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i41, i25, b9);
        if (c5031a.f40841e || this.f40875p != i34) {
            int[] iArr5 = this.f40869j;
            int i53 = c5031a.f40840d;
            int i54 = this.f40875p;
            int i55 = i53 / i54;
            int i56 = c5031a.f40838b / i54;
            int i57 = c5031a.f40839c / i54;
            int i58 = c5031a.f40837a / i54;
            boolean z6 = this.f40870k == 0;
            int i59 = this.f40877r;
            int i60 = this.f40876q;
            byte[] bArr6 = this.i;
            int[] iArr6 = this.f40861a;
            Boolean bool = this.f40878s;
            int i61 = 8;
            int i62 = 0;
            int i63 = 1;
            int i64 = 0;
            while (i64 < i55) {
                int[] iArr7 = iArr5;
                if (c5031a.f40841e) {
                    if (i62 >= i55) {
                        i63++;
                        if (i63 == 2) {
                            i62 = 4;
                        } else if (i63 == 3) {
                            i61 = 4;
                            i62 = 2;
                        } else if (i63 == 4) {
                            i62 = 1;
                            i61 = 2;
                        }
                    }
                    i = i62 + i61;
                } else {
                    i = i62;
                    i62 = i64;
                }
                int i65 = i62 + i56;
                int i66 = i;
                boolean z9 = i54 == 1;
                if (i65 < i60) {
                    int i67 = i65 * i59;
                    int i68 = i67 + i58;
                    boolean z10 = z9;
                    int i69 = i68 + i57;
                    int i70 = i67 + i59;
                    if (i70 < i69) {
                        i69 = i70;
                    }
                    i4 = i55;
                    int i71 = i64 * i54 * c5031a.f40839c;
                    if (z10) {
                        int i72 = i68;
                        while (i72 < i69) {
                            int i73 = i72;
                            int i74 = iArr6[bArr6[i71] & p.f9259b];
                            if (i74 != 0) {
                                iArr7[i73] = i74;
                            } else if (z6 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i71 += i54;
                            i72 = i73 + 1;
                        }
                    } else {
                        int i75 = ((i69 - i68) * i54) + i71;
                        i6 = i54;
                        int i76 = i68;
                        while (i76 < i69) {
                            int i77 = i69;
                            int i78 = c5031a.f40839c;
                            int i79 = i76;
                            int i80 = i71;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            while (true) {
                                if (i80 >= this.f40875p + i71) {
                                    i9 = i56;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i9 = i56;
                                if (i80 >= bArr7.length || i80 >= i75) {
                                    break;
                                }
                                int i86 = this.f40861a[bArr7[i80] & p.f9259b];
                                if (i86 != 0) {
                                    i81 += (i86 >> 24) & p.f9259b;
                                    i82 += (i86 >> 16) & p.f9259b;
                                    i83 += (i86 >> 8) & p.f9259b;
                                    i84 += i86 & p.f9259b;
                                    i85++;
                                }
                                i80++;
                                i56 = i9;
                            }
                            int i87 = i71 + i78;
                            int i88 = i87;
                            while (i88 < this.f40875p + i87) {
                                byte[] bArr8 = this.i;
                                int i89 = i87;
                                if (i88 >= bArr8.length || i88 >= i75) {
                                    break;
                                }
                                int i90 = this.f40861a[bArr8[i88] & p.f9259b];
                                if (i90 != 0) {
                                    i81 += (i90 >> 24) & p.f9259b;
                                    i82 += (i90 >> 16) & p.f9259b;
                                    i83 += (i90 >> 8) & p.f9259b;
                                    i84 += i90 & p.f9259b;
                                    i85++;
                                }
                                i88++;
                                i87 = i89;
                            }
                            int i91 = i85 == 0 ? 0 : ((i81 / i85) << 24) | ((i82 / i85) << 16) | ((i83 / i85) << 8) | (i84 / i85);
                            if (i91 != 0) {
                                iArr7[i79] = i91;
                            } else if (z6 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i71 += i6;
                            i76 = i79 + 1;
                            i69 = i77;
                            i56 = i9;
                        }
                        i64++;
                        iArr5 = iArr7;
                        i62 = i66;
                        i54 = i6;
                        i55 = i4;
                        i56 = i56;
                    }
                } else {
                    i4 = i55;
                }
                i6 = i54;
                i64++;
                iArr5 = iArr7;
                i62 = i66;
                i54 = i6;
                i55 = i4;
                i56 = i56;
            }
            if (this.f40878s == null) {
                this.f40878s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.f40869j;
            int i92 = c5031a.f40840d;
            int i93 = c5031a.f40838b;
            int i94 = c5031a.f40839c;
            int i95 = c5031a.f40837a;
            byte b12 = this.f40870k == 0 ? (byte) 1 : b9;
            int i96 = this.f40877r;
            byte[] bArr9 = this.i;
            int[] iArr9 = this.f40861a;
            int i97 = -1;
            for (int i98 = b9; i98 < i92; i98++) {
                int i99 = (i98 + i93) * i96;
                int i100 = i99 + i95;
                int i101 = i100 + i94;
                int i102 = i99 + i96;
                if (i102 < i101) {
                    i101 = i102;
                }
                int i103 = c5031a.f40839c * i98;
                while (i100 < i101) {
                    int[] iArr10 = iArr8;
                    int i104 = bArr9[i103];
                    int i105 = i92;
                    int i106 = i104 & p.f9259b;
                    if (i106 != i97) {
                        int i107 = iArr9[i106];
                        if (i107 != 0) {
                            iArr10[i100] = i107;
                        } else {
                            i97 = i104;
                        }
                    }
                    i103++;
                    i100++;
                    iArr8 = iArr10;
                    i92 = i105;
                }
            }
            Boolean bool2 = this.f40878s;
            this.f40878s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f40878s != null || b12 == 0 || i97 == -1));
        }
        if (this.f40873n && ((i10 = c5031a.f40843g) == 0 || i10 == 1)) {
            if (this.f40872m == null) {
                this.f40872m = a();
            }
            Bitmap bitmap3 = this.f40872m;
            int i108 = this.f40877r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i108, 0, 0, i108, this.f40876q);
        } else {
            iArr2 = iArr;
        }
        Bitmap a9 = a();
        int i109 = this.f40877r;
        a9.setPixels(iArr2, 0, i109, 0, 0, i109, this.f40876q);
        return a9;
    }
}
