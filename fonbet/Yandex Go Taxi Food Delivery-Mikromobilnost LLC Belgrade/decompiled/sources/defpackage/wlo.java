package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class wlo extends FilterOutputStream {
    public static final byte[] z = "Exif\u0000\u0000".getBytes(elo.d);
    public final llo a;
    public final byte[] b;
    public final ByteBuffer c;
    public int w;
    public int x;
    public int y;

    public wlo(ByteArrayOutputStream byteArrayOutputStream, llo lloVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.w = 0;
        this.a = lloVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0355, code lost:
    
        ((java.io.FilterOutputStream) r17).out.write(r18, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x035a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0353, code lost:
    
        if (r3 <= 0) goto L162;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(byte[] bArr, int i, int i2) {
        llo lloVar;
        int[] iArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.x;
            if ((i5 > 0 || this.y > 0 || this.w != 2) && i4 > 0) {
                if (i5 > 0) {
                    int min = Math.min(i4, i5);
                    i4 -= min;
                    this.x -= min;
                    i3 += min;
                }
                int i6 = this.y;
                if (i6 > 0) {
                    int min2 = Math.min(i4, i6);
                    ((FilterOutputStream) this).out.write(bArr, i3, min2);
                    i4 -= min2;
                    this.y -= min2;
                    i3 += min2;
                }
                if (i4 == 0) {
                    return;
                }
                int i7 = this.w;
                int i8 = 4;
                ByteBuffer byteBuffer = this.c;
                if (i7 == 0) {
                    int min3 = Math.min(i4, 2 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min3);
                    i3 += min3;
                    i4 -= min3;
                    if (byteBuffer.position() < 2) {
                        return;
                    }
                    byteBuffer.rewind();
                    if (byteBuffer.getShort() != -40) {
                        ny61.v("Not a valid jpeg image, cannot write exif");
                        return;
                    }
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    this.w = 1;
                    byteBuffer.rewind();
                    OutputStream outputStream = ((FilterOutputStream) this).out;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    i77 i77Var = new i77(outputStream);
                    i77Var.e((short) -31);
                    int[] iArr2 = new int[4];
                    int[] iArr3 = new int[4];
                    ylo[] yloVarArr = llo.c;
                    int i9 = 0;
                    while (true) {
                        lloVar = this.a;
                        if (i9 >= i8) {
                            break;
                        }
                        ylo yloVar = yloVarArr[i9];
                        int i10 = 0;
                        while (true) {
                            ylo[] yloVarArr2 = llo.c;
                            if (i10 < i8) {
                                lloVar.a(i10).remove(yloVar.b);
                                i10++;
                                i8 = 4;
                            }
                        }
                        i9++;
                        i8 = 4;
                    }
                    Map a = lloVar.a(1);
                    ByteOrder byteOrder2 = lloVar.b;
                    if (!a.isEmpty()) {
                        lloVar.a(0).put(llo.c[1].b, elo.a(0L, byteOrder2));
                    }
                    if (!lloVar.a(2).isEmpty()) {
                        lloVar.a(0).put(llo.c[2].b, elo.a(0L, byteOrder2));
                    }
                    if (!lloVar.a(3).isEmpty()) {
                        lloVar.a(1).put(llo.c[3].b, elo.a(0L, byteOrder2));
                    }
                    int i11 = 0;
                    while (true) {
                        ylo[] yloVarArr3 = llo.c;
                        if (i11 >= 4) {
                            break;
                        }
                        Iterator it = lloVar.a(i11).entrySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            elo eloVar = (elo) ((Map.Entry) it.next()).getValue();
                            int i13 = elo.f[eloVar.a] * eloVar.b;
                            if (i13 > 4) {
                                i12 += i13;
                            }
                        }
                        iArr3[i11] = iArr3[i11] + i12;
                        i11++;
                    }
                    int i14 = 0;
                    int i15 = 8;
                    while (true) {
                        ylo[] yloVarArr4 = llo.c;
                        if (i14 >= 4) {
                            break;
                        }
                        if (!lloVar.a(i14).isEmpty()) {
                            iArr2[i14] = i15;
                            i15 += (lloVar.a(i14).size() * 12) + 6 + iArr3[i14];
                        }
                        i14++;
                    }
                    int i16 = i15 + 8;
                    if (!lloVar.a(1).isEmpty()) {
                        lloVar.a(0).put(llo.c[1].b, elo.a(iArr2[1], byteOrder2));
                    }
                    if (lloVar.a(2).isEmpty()) {
                        iArr = iArr2;
                    } else {
                        iArr = iArr2;
                        lloVar.a(0).put(llo.c[2].b, elo.a(iArr2[2], byteOrder2));
                    }
                    if (!lloVar.a(3).isEmpty()) {
                        lloVar.a(1).put(llo.c[3].b, elo.a(iArr[3], byteOrder2));
                    }
                    i77Var.e((short) i16);
                    i77Var.write(z);
                    i77Var.e(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    i77Var.b = byteOrder2;
                    i77Var.e((short) 42);
                    i77Var.d(8);
                    int i17 = 0;
                    while (true) {
                        ylo[] yloVarArr5 = llo.c;
                        if (i17 >= 4) {
                            break;
                        }
                        if (!lloVar.a(i17).isEmpty()) {
                            i77Var.e((short) lloVar.a(i17).size());
                            int size = (lloVar.a(i17).size() * 12) + iArr[i17] + 2 + 4;
                            for (Map.Entry entry : lloVar.a(i17).entrySet()) {
                                ylo yloVar2 = (ylo) ((HashMap) ilo.f.get(i17)).get(entry.getKey());
                                d6z.v(yloVar2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                int i18 = yloVar2.a;
                                elo eloVar2 = (elo) entry.getValue();
                                int[] iArr4 = elo.f;
                                int i19 = eloVar2.a;
                                int i20 = eloVar2.b;
                                int i21 = iArr4[i19] * i20;
                                i77Var.e((short) i18);
                                i77Var.e((short) eloVar2.a);
                                i77Var.d(i20);
                                if (i21 > 4) {
                                    i77Var.d(size);
                                    size += i21;
                                } else {
                                    i77Var.write(eloVar2.c);
                                    if (i21 < 4) {
                                        for (int i22 = 4; i21 < i22; i22 = 4) {
                                            i77Var.c.write(0);
                                            i21++;
                                        }
                                    }
                                }
                            }
                            i77Var.d(0);
                            Iterator it2 = lloVar.a(i17).entrySet().iterator();
                            while (it2.hasNext()) {
                                byte[] bArr2 = ((elo) ((Map.Entry) it2.next()).getValue()).c;
                                if (bArr2.length > 4) {
                                    i77Var.write(bArr2, 0, bArr2.length);
                                }
                            }
                        }
                        i17++;
                    }
                    i77Var.b = ByteOrder.BIG_ENDIAN;
                } else if (i7 != 1) {
                    continue;
                } else {
                    int min4 = Math.min(i4, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min4);
                    i3 += min4;
                    i4 -= min4;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s = byteBuffer.getShort();
                    if (s == -31) {
                        this.x = (byteBuffer.getShort() & 65535) - 2;
                        this.w = 2;
                    } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.y = (byteBuffer.getShort() & 65535) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.w = 2;
                    }
                    byteBuffer.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
