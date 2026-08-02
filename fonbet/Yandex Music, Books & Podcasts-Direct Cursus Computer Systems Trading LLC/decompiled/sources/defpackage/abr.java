package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class abr {
    public int[] a;
    public final jtc c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public wcd l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public abr(jtc jtcVar, wcd wcdVar, ByteBuffer byteBuffer, int i) {
        this.c = jtcVar;
        this.l = new wcd();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = wcdVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = wcdVar.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((scd) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = wcdVar.f;
                this.r = i2 / highestOneBit;
                int i3 = wcdVar.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                z98 z98Var = (z98) this.c.b;
                this.i = z98Var == null ? new byte[i4] : (byte[]) z98Var.f(i4, byte[].class);
                jtc jtcVar2 = this.c;
                int i5 = this.r * this.q;
                z98 z98Var2 = (z98) jtcVar2.b;
                this.j = z98Var2 == null ? new int[i5] : (int[]) z98Var2.f(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap n = ((r33) this.c.a).n(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        n.setHasAlpha(true);
        return n;
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
            if (this.l.c > 0) {
                if (this.k < 0) {
                }
                i = this.o;
                if (i != 1 && i != 2) {
                    this.o = 0;
                    if (this.e == null) {
                        z98 z98Var = (z98) this.c.b;
                        this.e = z98Var == null ? new byte[KotlinVersion.MAX_COMPONENT_VALUE] : (byte[]) z98Var.f(KotlinVersion.MAX_COMPONENT_VALUE, byte[].class);
                    }
                    scd scdVar = (scd) this.l.e.get(this.k);
                    int i2 = this.k - 1;
                    scd scdVar2 = i2 < 0 ? (scd) this.l.e.get(i2) : null;
                    iArr = scdVar.k;
                    if (iArr != null) {
                        iArr = this.l.a;
                    }
                    this.a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("abr", 3)) {
                            Log.d("abr", "No valid color table found for frame #" + this.k);
                        }
                        this.o = 1;
                        return null;
                    }
                    if (scdVar.f) {
                        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                        int[] iArr2 = this.b;
                        this.a = iArr2;
                        iArr2[scdVar.h] = 0;
                        if (scdVar.g == 2 && this.k == 0) {
                            this.s = Boolean.TRUE;
                        }
                    }
                    return d(scdVar, scdVar2);
                }
                if (Log.isLoggable("abr", 3)) {
                    Log.d("abr", "Unable to decode frame, status=" + this.o);
                }
                return null;
            }
            if (Log.isLoggable("abr", 3)) {
                Log.d("abr", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);
            }
            this.o = 1;
            i = this.o;
            if (i != 1) {
                this.o = 0;
                if (this.e == null) {
                }
                scd scdVar3 = (scd) this.l.e.get(this.k);
                int i22 = this.k - 1;
                if (i22 < 0) {
                }
                iArr = scdVar3.k;
                if (iArr != null) {
                }
                this.a = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("abr", 3)) {
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
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r5.j == r36.h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(scd scdVar, scd scdVar2) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        short[] sArr;
        short s;
        short s2;
        int i6;
        Bitmap bitmap;
        int i7;
        int i8;
        int i9;
        jtc jtcVar = this.c;
        byte b2 = 0;
        int[] iArr3 = this.j;
        if (scdVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((r33) jtcVar.a).o(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr3, 0);
        }
        if (scdVar2 != null && scdVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (scdVar2 != null && (i6 = scdVar2.g) > 0) {
            if (i6 == 2) {
                if (!scdVar.f) {
                    wcd wcdVar = this.l;
                    i7 = wcdVar.k;
                    if (scdVar.k != null) {
                    }
                    int i10 = scdVar2.d;
                    int i11 = this.p;
                    int i12 = i10 / i11;
                    int i13 = scdVar2.b / i11;
                    int i14 = scdVar2.c / i11;
                    int i15 = scdVar2.a / i11;
                    int i16 = this.r;
                    i8 = (i13 * i16) + i15;
                    i9 = (i12 * i16) + i8;
                    while (i8 < i9) {
                        int i17 = i8 + i14;
                        for (int i18 = i8; i18 < i17; i18++) {
                            iArr3[i18] = i7;
                        }
                        i8 += this.r;
                    }
                }
                i7 = 0;
                int i102 = scdVar2.d;
                int i112 = this.p;
                int i122 = i102 / i112;
                int i132 = scdVar2.b / i112;
                int i142 = scdVar2.c / i112;
                int i152 = scdVar2.a / i112;
                int i162 = this.r;
                i8 = (i132 * i162) + i152;
                i9 = (i122 * i162) + i8;
                while (i8 < i9) {
                }
            } else if (i6 == 3 && (bitmap = this.m) != null) {
                int i19 = this.q;
                int i20 = this.r;
                bitmap.getPixels(iArr3, 0, i20, 0, 0, i20, i19);
            }
        }
        this.d.position(scdVar.j);
        int i21 = scdVar.c * scdVar.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i21) {
            z98 z98Var = (z98) jtcVar.b;
            this.i = z98Var == null ? new byte[i21] : (byte[]) z98Var.f(i21, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr2 = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i22 = this.d.get() & 255;
        int i23 = 1;
        int i24 = 1 << i22;
        int i25 = i24 + 1;
        int i26 = i24 + 2;
        int i27 = i22 + 1;
        int i28 = (1 << i27) - 1;
        int i29 = 0;
        while (i29 < i24) {
            sArr2[i29] = 0;
            bArr3[i29] = (byte) i29;
            i29++;
            i23 = i23;
        }
        int i30 = i23;
        byte[] bArr5 = this.e;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = i27;
        int i40 = i26;
        int i41 = i28;
        short s3 = -1;
        while (true) {
            if (i31 >= i21) {
                iArr = iArr3;
                b = b2;
                break;
            }
            if (i32 == 0) {
                s = -1;
                int i42 = this.d.get() & 255;
                if (i42 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.e, 0, Math.min(i42, byteBuffer.remaining()));
                }
                if (i42 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i32 = i42;
                i33 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                s = -1;
            }
            i35 += (bArr5[i33] & 255) << i34;
            i33++;
            i32--;
            int i43 = i34 + 8;
            int i44 = i40;
            int i45 = i39;
            short s4 = s3;
            int i46 = i37;
            while (true) {
                i34 = i43;
                if (i43 < i45) {
                    s3 = s4;
                    i37 = i46;
                    i39 = i45;
                    iArr3 = iArr;
                    b2 = 0;
                    i40 = i44;
                    sArr2 = sArr;
                    break;
                }
                int i47 = i35 & i41;
                i35 >>= i45;
                i34 -= i45;
                if (i47 == i24) {
                    i45 = i27;
                    i44 = i26;
                    i41 = i28;
                    i43 = i34;
                    s4 = s;
                } else {
                    if (i47 == i25) {
                        i40 = i44;
                        i39 = i45;
                        s3 = s4;
                        i37 = i46;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b2 = 0;
                        break;
                    }
                    int i48 = i45;
                    if (s4 == s) {
                        bArr2[i36] = bArr3[i47 == true ? 1 : 0];
                        i36++;
                        i31++;
                        s4 = i47 == true ? 1 : 0;
                        i46 = s4;
                        i43 = i34;
                        i45 = i48;
                    } else {
                        if (i47 >= i44) {
                            bArr4[i38] = (byte) i46;
                            i38++;
                            s2 = s4;
                        } else {
                            s2 = i47 == true ? 1 : 0;
                        }
                        while (s2 >= i24) {
                            bArr4[i38] = bArr3[s2];
                            i38++;
                            s2 = sArr[s2];
                        }
                        i46 = bArr3[s2] & 255;
                        byte b3 = (byte) i46;
                        bArr2[i36] = b3;
                        while (true) {
                            i36++;
                            i31++;
                            if (i38 <= 0) {
                                break;
                            }
                            i38--;
                            bArr2[i36] = bArr4[i38];
                        }
                        if (i44 < 4096) {
                            sArr[i44] = s4;
                            bArr3[i44] = b3;
                            i44++;
                            if ((i44 & i41) == 0 && i44 < 4096) {
                                i45 = i48 + 1;
                                i41 += i44;
                                i43 = i34;
                                s4 = i47 == true ? 1 : 0;
                            }
                        }
                        i45 = i48;
                        i43 = i34;
                        s4 = i47 == true ? 1 : 0;
                    }
                    s = -1;
                }
            }
        }
        Arrays.fill(bArr2, i36, i21, b);
        if (scdVar.e || this.p != i30) {
            int i49 = scdVar.d;
            int i50 = this.p;
            int i51 = i49 / i50;
            int i52 = scdVar.b / i50;
            int i53 = scdVar.c / i50;
            int i54 = scdVar.a / i50;
            boolean z = this.k == 0;
            byte[] bArr6 = this.i;
            int[] iArr4 = this.a;
            Boolean bool = this.s;
            int i55 = 8;
            int i56 = 0;
            int i57 = 1;
            int i58 = 0;
            while (i58 < i51) {
                if (scdVar.e) {
                    if (i56 >= i51) {
                        i57++;
                        if (i57 == 2) {
                            i56 = 4;
                        } else if (i57 == 3) {
                            i55 = 4;
                            i56 = 2;
                        } else if (i57 == 4) {
                            i56 = 1;
                            i55 = 2;
                        }
                    }
                    i = i56 + i55;
                } else {
                    i = i56;
                    i56 = i58;
                }
                int i59 = i56 + i52;
                int i60 = i51;
                boolean z2 = i50 == 1;
                if (i59 < this.q) {
                    int i61 = this.r;
                    int i62 = i59 * i61;
                    int i63 = i62 + i54;
                    int i64 = i63 + i53;
                    int i65 = i62 + i61;
                    if (i65 < i64) {
                        i64 = i65;
                    }
                    i2 = i50;
                    int i66 = i58 * i50 * scdVar.c;
                    int[] iArr5 = this.j;
                    if (z2) {
                        int i67 = i63;
                        while (i67 < i64) {
                            int i68 = i67;
                            int i69 = iArr4[bArr6[i66] & KotlinVersion.MAX_COMPONENT_VALUE];
                            if (i69 != 0) {
                                iArr5[i68] = i69;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i66 += i2;
                            i67 = i68 + 1;
                        }
                    } else {
                        int i70 = ((i64 - i63) * i2) + i66;
                        i3 = i52;
                        int i71 = i63;
                        while (i71 < i64) {
                            int i72 = i64;
                            int i73 = scdVar.c;
                            int i74 = i71;
                            int i75 = i66;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= this.p + i66) {
                                    i4 = i53;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i4 = i53;
                                if (i75 >= bArr7.length || i75 >= i70) {
                                    break;
                                }
                                int i81 = this.a[bArr7[i75] & KotlinVersion.MAX_COMPONENT_VALUE];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i77 += (i81 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i78 += (i81 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i79 += i81 & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i80++;
                                }
                                i75++;
                                i53 = i4;
                            }
                            int i82 = i66 + i73;
                            int i83 = i82;
                            while (i83 < this.p + i82) {
                                byte[] bArr8 = this.i;
                                int i84 = i82;
                                if (i83 >= bArr8.length || i83 >= i70) {
                                    break;
                                }
                                int i85 = this.a[bArr8[i83] & KotlinVersion.MAX_COMPONENT_VALUE];
                                if (i85 != 0) {
                                    i76 += (i85 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i77 += (i85 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i78 += (i85 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i79 += i85 & KotlinVersion.MAX_COMPONENT_VALUE;
                                    i80++;
                                }
                                i83++;
                                i82 = i84;
                            }
                            int i86 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i86 != 0) {
                                iArr5[i74] = i86;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i66 += i2;
                            i71 = i74 + 1;
                            i64 = i72;
                            i53 = i4;
                        }
                        i58++;
                        i56 = i;
                        i51 = i60;
                        i52 = i3;
                        i50 = i2;
                        i53 = i53;
                    }
                } else {
                    i2 = i50;
                }
                i3 = i52;
                i58++;
                i56 = i;
                i51 = i60;
                i52 = i3;
                i50 = i2;
                i53 = i53;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i87 = scdVar.d;
            int i88 = scdVar.b;
            int i89 = scdVar.c;
            int i90 = scdVar.a;
            byte b4 = this.k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.i;
            int[] iArr6 = this.a;
            int i91 = -1;
            for (int i92 = b; i92 < i87; i92++) {
                int i93 = this.r;
                int i94 = (i92 + i88) * i93;
                int i95 = i94 + i90;
                int i96 = i95 + i89;
                int i97 = i94 + i93;
                if (i97 < i96) {
                    i96 = i97;
                }
                int i98 = scdVar.c * i92;
                while (i95 < i96) {
                    int i99 = bArr9[i98];
                    int i100 = i99 & KotlinVersion.MAX_COMPONENT_VALUE;
                    if (i100 != i91) {
                        int i101 = iArr6[i100];
                        if (i101 != 0) {
                            this.j[i95] = i101;
                        } else {
                            i91 = i99;
                        }
                    }
                    i98++;
                    i95++;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b4 == 0 || i91 == -1));
        }
        if (this.n && ((i5 = scdVar.g) == 0 || i5 == 1)) {
            if (this.m == null) {
                this.m = a();
            }
            Bitmap bitmap3 = this.m;
            int i103 = this.q;
            int i104 = this.r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i104, 0, 0, i104, i103);
        } else {
            iArr2 = iArr;
        }
        Bitmap a = a();
        int i105 = this.q;
        int i106 = this.r;
        a.setPixels(iArr2, 0, i106, 0, 0, i106, i105);
        return a;
    }
}
