package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes15.dex */
public final class szt0 {
    public int[] a;
    public ByteBuffer c;
    public byte[] d;
    public short[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int[] i;
    public int j;
    public final vgt k;
    public Bitmap l;
    public Bitmap m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public szt0(vgt vgtVar) {
        this.k = vgtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r4.j == r35.h) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap a(rgt rgtVar, rgt rgtVar2) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr2;
        int i6;
        short[] sArr;
        short s;
        short s2;
        int i7;
        Bitmap bitmap;
        int i8;
        int i9;
        int i10;
        int[] iArr3 = this.i;
        byte b2 = 0;
        if (rgtVar2 == null) {
            this.l = null;
            Arrays.fill(iArr3, 0);
        }
        if (rgtVar2 != null && rgtVar2.g == 3 && this.l == null) {
            Arrays.fill(iArr3, 0);
        }
        if (rgtVar2 != null && (i7 = rgtVar2.g) > 0) {
            if (i7 == 2) {
                if (!rgtVar.f) {
                    vgt vgtVar = this.k;
                    i8 = vgtVar.k;
                    if (rgtVar.k != null) {
                    }
                    int i11 = rgtVar2.d;
                    int i12 = this.p;
                    int i13 = i11 / i12;
                    int i14 = rgtVar2.b / i12;
                    int i15 = rgtVar2.c / i12;
                    int i16 = rgtVar2.a / i12;
                    int i17 = this.r;
                    i9 = (i14 * i17) + i16;
                    i10 = (i13 * i17) + i9;
                    while (i9 < i10) {
                        int i18 = i9 + i15;
                        for (int i19 = i9; i19 < i18; i19++) {
                            iArr3[i19] = i8;
                        }
                        i9 += this.r;
                    }
                }
                i8 = 0;
                int i112 = rgtVar2.d;
                int i122 = this.p;
                int i132 = i112 / i122;
                int i142 = rgtVar2.b / i122;
                int i152 = rgtVar2.c / i122;
                int i162 = rgtVar2.a / i122;
                int i172 = this.r;
                i9 = (i142 * i172) + i162;
                i10 = (i132 * i172) + i9;
                while (i9 < i10) {
                }
            } else if (i7 == 3 && (bitmap = this.l) != null) {
                int i20 = this.r;
                bitmap.getPixels(iArr3, 0, i20, 0, 0, i20, this.q);
            }
        }
        int[] iArr4 = iArr3;
        this.c.position(rgtVar.j);
        int i21 = rgtVar.c * rgtVar.d;
        byte[] bArr = this.h;
        if (bArr == null || bArr.length < i21) {
            this.h = new byte[i21];
        }
        byte[] bArr2 = this.h;
        if (this.e == null) {
            this.e = new short[4096];
        }
        short[] sArr2 = this.e;
        if (this.f == null) {
            this.f = new byte[4096];
        }
        byte[] bArr3 = this.f;
        if (this.g == null) {
            this.g = new byte[Constants.INTENT_ADDRESS_ID];
        }
        byte[] bArr4 = this.g;
        int i22 = this.c.get() & 255;
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
        byte[] bArr5 = this.d;
        int i31 = i27;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = i26;
        int i41 = i28;
        short s3 = -1;
        while (true) {
            if (i32 >= i21) {
                iArr = iArr4;
                b = b2;
                break;
            }
            if (i33 == 0) {
                s = -1;
                int i42 = this.c.get() & 255;
                if (i42 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.c;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.d, 0, Math.min(i42, byteBuffer.remaining()));
                }
                if (i42 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i33 = i42;
                i34 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                s = -1;
            }
            i36 += (bArr5[i34] & 255) << i35;
            i34++;
            i33--;
            int i43 = i35 + 8;
            int i44 = i40;
            int i45 = i31;
            short s4 = s3;
            int i46 = i38;
            while (true) {
                i35 = i43;
                if (i43 < i45) {
                    i31 = i45;
                    s3 = s4;
                    i38 = i46;
                    iArr4 = iArr;
                    b2 = 0;
                    i40 = i44;
                    sArr2 = sArr;
                    break;
                }
                int i47 = i36 & i41;
                i36 >>= i45;
                i35 -= i45;
                if (i47 == i24) {
                    i45 = i27;
                    i44 = i26;
                    i41 = i28;
                    i43 = i35;
                    s4 = s;
                } else {
                    if (i47 == i25) {
                        i40 = i44;
                        i31 = i45;
                        s3 = s4;
                        i38 = i46;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b2 = 0;
                        break;
                    }
                    int i48 = i32;
                    if (s4 == s) {
                        bArr2[i37] = bArr3[i47 == true ? 1 : 0];
                        i37++;
                        i32 = i48 + 1;
                        s4 = i47 == true ? 1 : 0;
                        i46 = s4;
                        i43 = i35;
                    } else {
                        if (i47 >= i44) {
                            bArr4[i39] = (byte) i46;
                            i39++;
                            s2 = s4;
                        } else {
                            s2 = i47 == true ? 1 : 0;
                        }
                        while (s2 >= i24) {
                            bArr4[i39] = bArr3[s2];
                            i39++;
                            s2 = sArr[s2];
                        }
                        i46 = bArr3[s2] & 255;
                        byte b3 = (byte) i46;
                        bArr2[i37] = b3;
                        while (true) {
                            i37++;
                            i48++;
                            if (i39 <= 0) {
                                break;
                            }
                            i39--;
                            bArr2[i37] = bArr4[i39];
                        }
                        if (i44 < 4096) {
                            sArr[i44] = s4;
                            bArr3[i44] = b3;
                            i44++;
                            if ((i44 & i41) == 0 && i44 < 4096) {
                                i45++;
                                i41 += i44;
                            }
                        }
                        i43 = i35;
                        i32 = i48;
                        s4 = i47 == true ? 1 : 0;
                    }
                    s = -1;
                }
            }
        }
        Arrays.fill(bArr2, i37, i21, b);
        if (rgtVar.e || this.p != i30) {
            int[] iArr5 = this.i;
            int i49 = rgtVar.d;
            int i50 = this.p;
            int i51 = i49 / i50;
            int i52 = rgtVar.b / i50;
            int i53 = rgtVar.c / i50;
            int i54 = rgtVar.a / i50;
            boolean z = this.j == 0;
            int i55 = this.r;
            int i56 = this.q;
            byte[] bArr6 = this.h;
            int[] iArr6 = this.a;
            Boolean bool = this.s;
            int i57 = 8;
            int i58 = 0;
            int i59 = 1;
            int i60 = 0;
            while (i60 < i51) {
                int[] iArr7 = iArr5;
                if (rgtVar.e) {
                    if (i58 >= i51) {
                        i59++;
                        if (i59 == 2) {
                            i58 = 4;
                        } else if (i59 == 3) {
                            i57 = 4;
                            i58 = 2;
                        } else if (i59 == 4) {
                            i58 = 1;
                            i57 = 2;
                        }
                    }
                    i = i58 + i57;
                } else {
                    i = i58;
                    i58 = i60;
                }
                int i61 = i58 + i52;
                int i62 = i;
                boolean z2 = i50 == 1;
                if (i61 < i56) {
                    int i63 = i61 * i55;
                    boolean z3 = z2;
                    int i64 = i63 + i54;
                    i2 = i51;
                    int i65 = i64 + i53;
                    int i66 = i63 + i55;
                    if (i66 < i65) {
                        i65 = i66;
                    }
                    i4 = i52;
                    int i67 = i60 * i50 * rgtVar.c;
                    if (z3) {
                        while (i64 < i65) {
                            int i68 = iArr6[bArr6[i67] & 255];
                            if (i68 != 0) {
                                iArr7[i64] = i68;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i67 += i50;
                            i64++;
                        }
                    } else {
                        int d = g8e.d(i65, i64, i50, i67);
                        while (i64 < i65) {
                            int i69 = i64;
                            int i70 = rgtVar.c;
                            int i71 = i65;
                            int i72 = i67;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            while (true) {
                                if (i72 >= this.p + i67) {
                                    i5 = i50;
                                    break;
                                }
                                byte[] bArr7 = this.h;
                                i5 = i50;
                                if (i72 >= bArr7.length || i72 >= d) {
                                    break;
                                }
                                int i78 = this.a[bArr7[i72] & 255];
                                if (i78 != 0) {
                                    i73 += (i78 >> 24) & 255;
                                    i74 += (i78 >> 16) & 255;
                                    i75 += (i78 >> 8) & 255;
                                    i76 += i78 & 255;
                                    i77++;
                                }
                                i72++;
                                i50 = i5;
                            }
                            int i79 = i67 + i70;
                            int i80 = i79;
                            while (i80 < this.p + i79) {
                                byte[] bArr8 = this.h;
                                int i81 = i79;
                                if (i80 >= bArr8.length || i80 >= d) {
                                    break;
                                }
                                int i82 = this.a[bArr8[i80] & 255];
                                if (i82 != 0) {
                                    i73 += (i82 >> 24) & 255;
                                    i74 += (i82 >> 16) & 255;
                                    i75 += (i82 >> 8) & 255;
                                    i76 += i82 & 255;
                                    i77++;
                                }
                                i80++;
                                i79 = i81;
                            }
                            int i83 = i77 == 0 ? 0 : ((i73 / i77) << 24) | ((i74 / i77) << 16) | ((i75 / i77) << 8) | (i76 / i77);
                            if (i83 != 0) {
                                iArr7[i69] = i83;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i67 += i5;
                            i64 = i69 + 1;
                            i65 = i71;
                            i50 = i5;
                        }
                    }
                    i3 = i50;
                } else {
                    i2 = i51;
                    i3 = i50;
                    i4 = i52;
                }
                i60++;
                iArr5 = iArr7;
                i58 = i62;
                i51 = i2;
                i52 = i4;
                i50 = i3;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.i;
            int i84 = rgtVar.d;
            int i85 = rgtVar.b;
            int i86 = rgtVar.c;
            int i87 = rgtVar.a;
            byte b4 = this.j == 0 ? (byte) 1 : b;
            int i88 = this.r;
            byte[] bArr9 = this.h;
            int[] iArr9 = this.a;
            int i89 = -1;
            for (int i90 = b; i90 < i84; i90++) {
                int i91 = (i90 + i85) * i88;
                int i92 = i91 + i87;
                int i93 = i92 + i86;
                int i94 = i91 + i88;
                if (i94 < i93) {
                    i93 = i94;
                }
                int i95 = rgtVar.c * i90;
                while (i92 < i93) {
                    int[] iArr10 = iArr8;
                    int i96 = bArr9[i95];
                    int i97 = i84;
                    int i98 = i96 & 255;
                    if (i98 != i89) {
                        int i99 = iArr9[i98];
                        if (i99 != 0) {
                            iArr10[i92] = i99;
                        } else {
                            i89 = i96;
                        }
                    }
                    i95++;
                    i92++;
                    iArr8 = iArr10;
                    i84 = i97;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b4 == 0 || i89 == -1));
        }
        if (this.n && ((i6 = rgtVar.g) == 0 || i6 == 1)) {
            if (this.l == null) {
                Boolean bool3 = this.s;
                Bitmap createBitmap = Bitmap.createBitmap(this.r, this.q, (bool3 == null || bool3.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
                createBitmap.setHasAlpha(true);
                this.l = createBitmap;
            }
            Bitmap bitmap2 = this.l;
            int i100 = this.r;
            iArr2 = iArr;
            bitmap2.setPixels(iArr2, 0, i100, 0, 0, i100, this.q);
        } else {
            iArr2 = iArr;
        }
        if (this.m == null) {
            Boolean bool4 = this.s;
            Bitmap createBitmap2 = Bitmap.createBitmap(this.r, this.q, (bool4 == null || bool4.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
            createBitmap2.setHasAlpha(true);
            this.m = createBitmap2;
        }
        Bitmap bitmap3 = this.m;
        int i101 = this.r;
        bitmap3.setPixels(iArr2, 0, i101, 0, 0, i101, this.q);
        return this.m;
    }
}
