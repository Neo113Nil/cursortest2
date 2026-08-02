package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes10.dex */
public final class tzt0 implements lgt {
    public int[] a;
    public final u1n c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public wgt l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public tzt0(u1n u1nVar, wgt wgtVar, ByteBuffer byteBuffer, int i) {
        this.c = u1nVar;
        this.l = new wgt();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = wgtVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = wgtVar.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((sgt) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = wgtVar.f;
                this.r = i2 / highestOneBit;
                int i3 = wgtVar.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                g63 g63Var = (g63) this.c.c;
                this.i = g63Var == null ? new byte[i4] : (byte[]) ((izz) g63Var).c(i4, byte[].class);
                u1n u1nVar2 = this.c;
                int i5 = this.r * this.q;
                g63 g63Var2 = (g63) u1nVar2.c;
                this.j = g63Var2 == null ? new int[i5] : (int[]) ((izz) g63Var2).c(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap d = ((b16) this.c.b).d(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        d.setHasAlpha(true);
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0047, B:19:0x003d, B:20:0x0049, B:22:0x005a, B:23:0x0066, B:26:0x006f, B:28:0x0073, B:32:0x007c, B:34:0x0080, B:36:0x0092, B:38:0x0096, B:39:0x009a, B:42:0x006b, B:44:0x00a0, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0047, B:19:0x003d, B:20:0x0049, B:22:0x005a, B:23:0x0066, B:26:0x006f, B:28:0x0073, B:32:0x007c, B:34:0x0080, B:36:0x0092, B:38:0x0096, B:39:0x009a, B:42:0x006b, B:44:0x00a0, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0047, B:19:0x003d, B:20:0x0049, B:22:0x005a, B:23:0x0066, B:26:0x006f, B:28:0x0073, B:32:0x007c, B:34:0x0080, B:36:0x0092, B:38:0x0096, B:39:0x009a, B:42:0x006b, B:44:0x00a0, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0047, B:19:0x003d, B:20:0x0049, B:22:0x005a, B:23:0x0066, B:26:0x006f, B:28:0x0073, B:32:0x007c, B:34:0x0080, B:36:0x0092, B:38:0x0096, B:39:0x009a, B:42:0x006b, B:44:0x00a0, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0047, B:19:0x003d, B:20:0x0049, B:22:0x005a, B:23:0x0066, B:26:0x006f, B:28:0x0073, B:32:0x007c, B:34:0x0080, B:36:0x0092, B:38:0x0096, B:39:0x009a, B:42:0x006b, B:44:0x00a0, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
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
                        g63 g63Var = (g63) this.c.c;
                        this.e = g63Var == null ? new byte[255] : (byte[]) ((izz) g63Var).c(255, byte[].class);
                    }
                    sgt sgtVar = (sgt) this.l.e.get(this.k);
                    int i2 = this.k - 1;
                    sgt sgtVar2 = i2 < 0 ? (sgt) this.l.e.get(i2) : null;
                    iArr = sgtVar.k;
                    if (iArr != null) {
                        iArr = this.l.a;
                    }
                    this.a = iArr;
                    if (iArr != null) {
                        Log.isLoggable("tzt0", 3);
                        this.o = 1;
                        return null;
                    }
                    if (sgtVar.f) {
                        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                        int[] iArr2 = this.b;
                        this.a = iArr2;
                        iArr2[sgtVar.h] = 0;
                        if (sgtVar.g == 2 && this.k == 0) {
                            this.s = Boolean.TRUE;
                        }
                    }
                    return c(sgtVar, sgtVar2);
                }
                Log.isLoggable("tzt0", 3);
                return null;
            }
            if (Log.isLoggable("tzt0", 3)) {
                int i3 = this.l.c;
            }
            this.o = 1;
            i = this.o;
            if (i != 1) {
                this.o = 0;
                if (this.e == null) {
                }
                sgt sgtVar3 = (sgt) this.l.e.get(this.k);
                int i22 = this.k - 1;
                if (i22 < 0) {
                }
                iArr = sgtVar3.k;
                if (iArr != null) {
                }
                this.a = iArr;
                if (iArr != null) {
                }
            }
            Log.isLoggable("tzt0", 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r7.j == r37.h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[LOOP:2: B:52:0x00e2->B:53:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(sgt sgtVar, sgt sgtVar2) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        short[] sArr;
        byte[] bArr2;
        short s;
        int i12;
        int i13;
        int i14;
        int i15;
        u1n u1nVar = this.c;
        byte b = 0;
        int[] iArr3 = this.j;
        if (sgtVar2 == null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                ((b16) u1nVar.b).c(bitmap);
            }
            this.m = null;
            Arrays.fill(iArr3, 0);
        }
        if (sgtVar2 != null && sgtVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr3, 0);
        }
        int i16 = this.r;
        int i17 = this.p;
        if (sgtVar2 != null && (i12 = sgtVar2.g) > 0) {
            if (i12 == 2) {
                if (!sgtVar.f) {
                    wgt wgtVar = this.l;
                    i13 = wgtVar.k;
                    if (sgtVar.k != null) {
                    }
                    int i18 = sgtVar2.d / i17;
                    int i19 = sgtVar2.b / i17;
                    int i20 = sgtVar2.c / i17;
                    i14 = (i19 * i16) + (sgtVar2.a / i17);
                    i15 = (i18 * i16) + i14;
                    while (i14 < i15) {
                        int i21 = i14 + i20;
                        for (int i22 = i14; i22 < i21; i22++) {
                            iArr3[i22] = i13;
                        }
                        i14 += i16;
                    }
                }
                i13 = 0;
                int i182 = sgtVar2.d / i17;
                int i192 = sgtVar2.b / i17;
                int i202 = sgtVar2.c / i17;
                i14 = (i192 * i16) + (sgtVar2.a / i17);
                i15 = (i182 * i16) + i14;
                while (i14 < i15) {
                }
            } else if (i12 == 3) {
                Bitmap bitmap2 = this.m;
                if (bitmap2 != null) {
                    int i23 = this.q;
                    int i24 = this.r;
                    bitmap2.getPixels(iArr3, 0, i24, 0, 0, i24, i23);
                }
                this.d.position(sgtVar.j);
                i = sgtVar.c * sgtVar.d;
                bArr = this.i;
                if (bArr != null || bArr.length < i) {
                    g63 g63Var = (g63) u1nVar.c;
                    this.i = g63Var != null ? new byte[i] : (byte[]) ((izz) g63Var).c(i, byte[].class);
                }
                byte[] bArr3 = this.i;
                if (this.f == null) {
                    this.f = new short[4096];
                }
                short[] sArr2 = this.f;
                if (this.g == null) {
                    this.g = new byte[4096];
                }
                byte[] bArr4 = this.g;
                if (this.h == null) {
                    this.h = new byte[Constants.INTENT_ADDRESS_ID];
                }
                byte[] bArr5 = this.h;
                int i25 = this.d.get() & 255;
                i2 = 1 << i25;
                int i26 = i2 + 1;
                int i27 = i2 + 2;
                int i28 = i25 + 1;
                int i29 = (1 << i28) - 1;
                for (i3 = 0; i3 < i2; i3++) {
                    sArr2[i3] = 0;
                    bArr4[i3] = (byte) i3;
                }
                byte[] bArr6 = this.e;
                i4 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = i28;
                int i38 = i27;
                int i39 = i29;
                short s2 = -1;
                short s3 = -1;
                while (true) {
                    if (i4 < i) {
                        iArr = iArr3;
                        break;
                    }
                    if (i30 == 0) {
                        int i40 = this.d.get() & 255;
                        if (i40 <= 0) {
                            i30 = i40;
                            iArr = iArr3;
                            sArr = sArr2;
                            bArr2 = bArr6;
                        } else {
                            iArr = iArr3;
                            ByteBuffer byteBuffer = this.d;
                            sArr = sArr2;
                            bArr2 = bArr6;
                            i30 = i40;
                            byteBuffer.get(this.e, 0, Math.min(i40, byteBuffer.remaining()));
                        }
                        if (i30 <= 0) {
                            this.o = 3;
                            b = 0;
                            break;
                        }
                        i31 = 0;
                    } else {
                        iArr = iArr3;
                        sArr = sArr2;
                        bArr2 = bArr6;
                    }
                    i33 += (bArr2[i31] & 255) << i32;
                    i31++;
                    i30--;
                    short s4 = s3;
                    int i41 = i32 + 8;
                    int i42 = i38;
                    int i43 = i37;
                    byte[] bArr7 = bArr4;
                    int i44 = i35;
                    while (true) {
                        i32 = i41;
                        if (i41 < i43) {
                            i35 = i44;
                            bArr4 = bArr7;
                            i37 = i43;
                            iArr3 = iArr;
                            bArr6 = bArr2;
                            s2 = -1;
                            s3 = s4;
                            i38 = i42;
                            sArr2 = sArr;
                            break;
                        }
                        int i45 = i33 & i39;
                        i33 >>= i43;
                        i32 -= i43;
                        if (i45 == i2) {
                            i43 = i28;
                            i42 = i27;
                            i39 = i29;
                            s4 = s2;
                            i41 = i32;
                        } else {
                            if (i45 == i26) {
                                i38 = i42;
                                i37 = i43;
                                i35 = i44;
                                bArr4 = bArr7;
                                iArr3 = iArr;
                                sArr2 = sArr;
                                bArr6 = bArr2;
                                s3 = s4;
                                break;
                            }
                            int i46 = i43;
                            if (s4 == s2) {
                                bArr3[i34] = bArr7[i45 == true ? 1 : 0];
                                i34++;
                                i4++;
                                s4 = i45 == true ? 1 : 0;
                                i44 = s4;
                                i41 = i32;
                                i43 = i46;
                            } else {
                                if (i45 >= i42) {
                                    bArr5[i36] = (byte) i44;
                                    i36++;
                                    s = s4;
                                } else {
                                    s = i45 == true ? 1 : 0;
                                }
                                while (s >= i2) {
                                    bArr5[i36] = bArr7[s];
                                    i36++;
                                    s = sArr[s];
                                }
                                i44 = bArr7[s] & 255;
                                byte b2 = (byte) i44;
                                bArr3[i34] = b2;
                                while (true) {
                                    i34++;
                                    i4++;
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    i36--;
                                    bArr3[i34] = bArr5[i36];
                                }
                                int i47 = i2;
                                if (i42 < 4096) {
                                    sArr[i42] = s4;
                                    bArr7[i42] = b2;
                                    i42++;
                                    if ((i42 & i39) == 0 && i42 < 4096) {
                                        i43 = i46 + 1;
                                        i39 += i42;
                                        s4 = i45 == true ? 1 : 0;
                                        i41 = i32;
                                        i2 = i47;
                                    }
                                }
                                i43 = i46;
                                s4 = i45 == true ? 1 : 0;
                                i41 = i32;
                                i2 = i47;
                            }
                            s2 = -1;
                        }
                    }
                    b = 0;
                }
                Arrays.fill(bArr3, i34, i, b);
                z = sgtVar.e;
                int[] iArr4 = this.j;
                if (z && i17 == 1) {
                    int i48 = sgtVar.d;
                    int i49 = sgtVar.b;
                    int i50 = sgtVar.c;
                    int i51 = sgtVar.a;
                    byte b3 = this.k == 0 ? (byte) 1 : b;
                    byte[] bArr8 = this.i;
                    int[] iArr5 = this.a;
                    int i52 = -1;
                    for (int i53 = b; i53 < i48; i53++) {
                        int i54 = (i53 + i49) * i16;
                        int i55 = i54 + i51;
                        int i56 = i55 + i50;
                        int i57 = i54 + i16;
                        if (i57 < i56) {
                            i56 = i57;
                        }
                        int i58 = sgtVar.c * i53;
                        while (i55 < i56) {
                            int i59 = i48;
                            int i60 = bArr8[i58];
                            int[] iArr6 = iArr4;
                            int i61 = i60 & 255;
                            if (i61 != i52) {
                                int i62 = iArr5[i61];
                                if (i62 != 0) {
                                    iArr6[i55] = i62;
                                } else {
                                    i52 = i60;
                                }
                            }
                            i58++;
                            i55++;
                            i48 = i59;
                            iArr4 = iArr6;
                        }
                    }
                    Boolean bool = this.s;
                    this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || !(this.s != null || b3 == 0 || i52 == -1));
                } else {
                    i5 = sgtVar.d / i17;
                    int i63 = sgtVar.b / i17;
                    int i64 = sgtVar.c / i17;
                    int i65 = sgtVar.a / i17;
                    boolean z2 = this.k != 0;
                    byte[] bArr9 = this.i;
                    int[] iArr7 = this.a;
                    Boolean bool2 = this.s;
                    int i66 = 8;
                    i6 = 0;
                    int i67 = 0;
                    int i68 = 1;
                    while (i6 < i5) {
                        int i69 = i63;
                        if (sgtVar.e) {
                            if (i67 >= i5) {
                                i68++;
                                if (i68 == 2) {
                                    i67 = 4;
                                } else if (i68 == 3) {
                                    i66 = 4;
                                    i67 = 2;
                                } else if (i68 == 4) {
                                    i67 = 1;
                                    i66 = 2;
                                }
                            }
                            i7 = i67 + i66;
                        } else {
                            i7 = i67;
                            i67 = i6;
                        }
                        int i70 = i67 + i69;
                        int i71 = i5;
                        boolean z3 = i17 == 1;
                        if (i70 < this.q) {
                            int i72 = i70 * i16;
                            int i73 = i72 + i65;
                            i8 = i7;
                            int i74 = i73 + i64;
                            int i75 = i72 + i16;
                            if (i75 < i74) {
                                i74 = i75;
                            }
                            i9 = i64;
                            int i76 = i6 * i17 * sgtVar.c;
                            if (z3) {
                                while (i73 < i74) {
                                    int i77 = iArr7[bArr9[i76] & 255];
                                    if (i77 != 0) {
                                        iArr4[i73] = i77;
                                    } else if (z2 && bool2 == null) {
                                        bool2 = Boolean.TRUE;
                                    }
                                    i76 += i17;
                                    i73++;
                                }
                            } else {
                                int d = g8e.d(i74, i73, i17, i76);
                                while (i73 < i74) {
                                    int i78 = i73;
                                    int i79 = sgtVar.c;
                                    int i80 = i74;
                                    int i81 = i76;
                                    int i82 = 0;
                                    int i83 = 0;
                                    int i84 = 0;
                                    int i85 = 0;
                                    int i86 = 0;
                                    while (true) {
                                        if (i81 >= i76 + i17) {
                                            i10 = i65;
                                            break;
                                        }
                                        byte[] bArr10 = this.i;
                                        i10 = i65;
                                        if (i81 >= bArr10.length || i81 >= d) {
                                            break;
                                        }
                                        int i87 = this.a[bArr10[i81] & 255];
                                        if (i87 != 0) {
                                            i82 += (i87 >> 24) & 255;
                                            i83 += (i87 >> 16) & 255;
                                            i84 += (i87 >> 8) & 255;
                                            i85 += i87 & 255;
                                            i86++;
                                        }
                                        i81++;
                                        i65 = i10;
                                    }
                                    int i88 = i76 + i79;
                                    int i89 = i88;
                                    while (i89 < i88 + i17) {
                                        byte[] bArr11 = this.i;
                                        int i90 = i88;
                                        if (i89 >= bArr11.length || i89 >= d) {
                                            break;
                                        }
                                        int i91 = this.a[bArr11[i89] & 255];
                                        if (i91 != 0) {
                                            i82 += (i91 >> 24) & 255;
                                            i83 += (i91 >> 16) & 255;
                                            i84 += (i91 >> 8) & 255;
                                            i85 += i91 & 255;
                                            i86++;
                                        }
                                        i89++;
                                        i88 = i90;
                                    }
                                    int i92 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                                    if (i92 != 0) {
                                        iArr4[i78] = i92;
                                    } else if (z2 && bool2 == null) {
                                        bool2 = Boolean.TRUE;
                                    }
                                    i76 += i17;
                                    i73 = i78 + 1;
                                    i74 = i80;
                                    i65 = i10;
                                }
                            }
                        } else {
                            i8 = i7;
                            i9 = i64;
                        }
                        i6++;
                        i63 = i69;
                        i5 = i71;
                        i67 = i8;
                        i64 = i9;
                        i65 = i65;
                    }
                    if (this.s == null) {
                        this.s = Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
                    }
                }
                if (this.n || !((i11 = sgtVar.g) == 0 || i11 == 1)) {
                    iArr2 = iArr;
                } else {
                    if (this.m == null) {
                        this.m = a();
                    }
                    Bitmap bitmap3 = this.m;
                    int i93 = this.q;
                    int i94 = this.r;
                    iArr2 = iArr;
                    bitmap3.setPixels(iArr2, 0, i94, 0, 0, i94, i93);
                }
                Bitmap a = a();
                int i95 = this.q;
                int i96 = this.r;
                a.setPixels(iArr2, 0, i96, 0, 0, i96, i95);
                return a;
            }
        }
        this.d.position(sgtVar.j);
        i = sgtVar.c * sgtVar.d;
        bArr = this.i;
        if (bArr != null) {
        }
        g63 g63Var2 = (g63) u1nVar.c;
        this.i = g63Var2 != null ? new byte[i] : (byte[]) ((izz) g63Var2).c(i, byte[].class);
        byte[] bArr32 = this.i;
        if (this.f == null) {
        }
        short[] sArr22 = this.f;
        if (this.g == null) {
        }
        byte[] bArr42 = this.g;
        if (this.h == null) {
        }
        byte[] bArr52 = this.h;
        int i252 = this.d.get() & 255;
        i2 = 1 << i252;
        int i262 = i2 + 1;
        int i272 = i2 + 2;
        int i282 = i252 + 1;
        int i292 = (1 << i282) - 1;
        while (i3 < i2) {
        }
        byte[] bArr62 = this.e;
        i4 = 0;
        int i302 = 0;
        int i312 = 0;
        int i322 = 0;
        int i332 = 0;
        int i342 = 0;
        int i352 = 0;
        int i362 = 0;
        int i372 = i282;
        int i382 = i272;
        int i392 = i292;
        short s22 = -1;
        short s32 = -1;
        while (true) {
            if (i4 < i) {
            }
            b = 0;
        }
        Arrays.fill(bArr32, i342, i, b);
        z = sgtVar.e;
        int[] iArr42 = this.j;
        if (z) {
        }
        i5 = sgtVar.d / i17;
        int i632 = sgtVar.b / i17;
        int i642 = sgtVar.c / i17;
        int i652 = sgtVar.a / i17;
        if (this.k != 0) {
        }
        byte[] bArr92 = this.i;
        int[] iArr72 = this.a;
        Boolean bool22 = this.s;
        int i662 = 8;
        i6 = 0;
        int i672 = 0;
        int i682 = 1;
        while (i6 < i5) {
        }
        if (this.s == null) {
        }
        if (this.n) {
        }
        iArr2 = iArr;
        Bitmap a2 = a();
        int i952 = this.q;
        int i962 = this.r;
        a2.setPixels(iArr2, 0, i962, 0, 0, i962, i952);
        return a2;
    }
}
