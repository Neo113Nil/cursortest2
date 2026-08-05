package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ra {
    public static boolean Ey6iv0m0;
    public static Field I5GHvsYW;
    public static Field KlHjfFWx;
    public static final lf NCTxEWno;
    public static final lf OnDfzHZD;
    public static Class OxcuoDLp;
    public static boolean RXQxj5Oe;
    public static boolean amk52bBQ;
    public static Field lDXGDhIF;
    public static final lf ow5vqvCr;
    public static boolean sjUBp5pO;
    public static final lf wxUZMvaN;
    public static final /* synthetic */ int ygLcUYwZ = 0;
    public static final g9[] qoPGr6Ce = new g9[0];
    public static final e2 MdtA4re8 = new e2();
    public static final byte[] VgvYg0wo = {48, 49, 53, 0};
    public static final byte[] P7K7Inc8 = {48, 49, 48, 0};
    public static final byte[] b2ZJblxo = {48, 48, 57, 0};
    public static final byte[] Qr9iLBAD = {48, 48, 53, 0};
    public static final byte[] jb9XjC4I = {48, 48, 49, 0};
    public static final byte[] eVhOlqcC = {48, 48, 49, 0};
    public static final byte[] k3x7lurq = {48, 48, 50, 0};

    static {
        int i = 1;
        NCTxEWno = new lf("RESUME_TOKEN", i);
        wxUZMvaN = new lf("NO_OWNER", i);
        ow5vqvCr = new lf("NONE", i);
        OnDfzHZD = new lf("PENDING", i);
    }

    public static Drawable Ey6iv0m0(Context context, int i) {
        return e30.MdtA4re8().wxUZMvaN(context, i);
    }

    public static boolean FXJmAAN1(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static List FySoLYna(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static final String I5GHvsYW(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String KlHjfFWx(k0 k0Var, int i) {
        k0Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            String resourceName = k0Var.qoPGr6Ce.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static us Mq3SeTnW(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    us usVar = new us();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    usVar.VgvYg0wo = duplicate;
                    usVar.NCTxEWno = position;
                    int i6 = position - duplicate.getInt(position);
                    usVar.MdtA4re8 = i6;
                    usVar.wxUZMvaN = ((ByteBuffer) usVar.VgvYg0wo).getShort(i6);
                    return usVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0288, code lost:
    
        if (r7.wxUZMvaN == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r4.wxUZMvaN == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void NCTxEWno(u8 u8Var, gp gpVar, ArrayList arrayList, int i) {
        int i2;
        b4[] b4VarArr;
        int i3;
        int i4;
        e8[] e8VarArr;
        boolean z;
        t8 t8Var;
        float f;
        boolean z2;
        boolean z3;
        int i5;
        t8 t8Var2;
        gp gpVar2;
        t8 t8Var3;
        r70 r70Var;
        e8 e8Var;
        r70 r70Var2;
        t8 t8Var4;
        int i6;
        e8[] e8VarArr2;
        e8 e8Var2;
        r70 r70Var3;
        t8 t8Var5;
        t8 t8Var6;
        int i7;
        e8 e8Var3;
        e8[] e8VarArr3;
        int i8;
        e8 e8Var4;
        r70 r70Var4;
        r70 r70Var5;
        int size;
        ArrayList arrayList2;
        int i9;
        t8 t8Var7;
        int i10;
        float f2;
        int i11;
        float f3;
        t8 t8Var8;
        int i12;
        int i13;
        int i14;
        t8 t8Var9;
        e8 e8Var5;
        t8 t8Var10;
        u8 u8Var2 = u8Var;
        gp gpVar3 = gpVar;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i2 = u8Var2.ZLB5OTob;
            b4VarArr = u8Var2.tKaxLBvG;
            i3 = 0;
        } else {
            i2 = u8Var2.CIYkyd1d;
            b4VarArr = u8Var2.VZZbw3BB;
            i3 = 2;
        }
        int i15 = i2;
        b4[] b4VarArr2 = b4VarArr;
        int i16 = 0;
        while (i16 < i15) {
            b4 b4Var = b4VarArr2[i16];
            boolean z4 = b4Var.OxcuoDLp;
            t8 t8Var11 = b4Var.qoPGr6Ce;
            e8[] e8VarArr4 = t8Var11.FXJmAAN1;
            int i17 = 3;
            int i18 = 8;
            float f4 = 0.0f;
            if (z4) {
                i4 = i16;
            } else {
                int i19 = b4Var.ow5vqvCr;
                int i20 = i19 * 2;
                t8 t8Var12 = t8Var11;
                t8 t8Var13 = t8Var12;
                boolean z5 = false;
                while (!z5) {
                    b4Var.jb9XjC4I++;
                    t8[] t8VarArr = t8Var12.f7oeun2L;
                    e8[] e8VarArr5 = t8Var12.FXJmAAN1;
                    t8VarArr[i19] = null;
                    t8Var12.dHozS53r[i19] = null;
                    if (t8Var12.LvHlPNBd != i18) {
                        t8Var12.Qr9iLBAD(i19);
                        e8VarArr5[i20].wxUZMvaN();
                        int i21 = i20 + 1;
                        e8VarArr5[i21].wxUZMvaN();
                        e8VarArr5[i20].wxUZMvaN();
                        e8VarArr5[i21].wxUZMvaN();
                        if (b4Var.NCTxEWno == null) {
                            b4Var.NCTxEWno = t8Var12;
                        }
                        b4Var.wxUZMvaN = t8Var12;
                        int i22 = t8Var12.N2kLh4D5[i19];
                        if (i22 == i17) {
                            int i23 = t8Var12.Ey6iv0m0[i19];
                            if (i23 == 0 || i23 == i17 || i23 == 2) {
                                b4Var.eVhOlqcC++;
                                float f5 = t8Var12.orhfF2Ya[i19];
                                if (f5 > 0.0f) {
                                    i13 = i16;
                                    b4Var.k3x7lurq += f5;
                                } else {
                                    i13 = i16;
                                }
                                i14 = i19;
                                if (t8Var12.LvHlPNBd != 8 && i22 == 3 && (i23 == 0 || i23 == 3)) {
                                    if (f5 < 0.0f) {
                                        b4Var.ygLcUYwZ = true;
                                    } else {
                                        b4Var.lDXGDhIF = true;
                                    }
                                    ArrayList arrayList4 = b4Var.Qr9iLBAD;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        b4Var.Qr9iLBAD = arrayList4;
                                    }
                                    arrayList4.add(t8Var12);
                                }
                                if (b4Var.P7K7Inc8 == null) {
                                    b4Var.P7K7Inc8 = t8Var12;
                                }
                                t8 t8Var14 = b4Var.b2ZJblxo;
                                if (t8Var14 != null) {
                                    t8Var14.dHozS53r[i14] = t8Var12;
                                }
                                b4Var.b2ZJblxo = t8Var12;
                            } else {
                                i13 = i16;
                                i14 = i19;
                            }
                            if (i14 == 0) {
                                if (t8Var12.amk52bBQ == 0 && t8Var12.I5GHvsYW == 0) {
                                    int i24 = t8Var12.RXQxj5Oe;
                                }
                            } else if (t8Var12.KlHjfFWx == 0 && t8Var12.gjV1z5T1 == 0) {
                                int i25 = t8Var12.WYNAV5pd;
                            }
                            t8Var9 = t8Var13;
                            if (t8Var9 != t8Var12) {
                                t8Var9.f7oeun2L[i14] = t8Var12;
                            }
                            e8Var5 = e8VarArr5[i20 + 1].P7K7Inc8;
                            if (e8Var5 != null) {
                                t8Var10 = e8Var5.wxUZMvaN;
                                e8 e8Var6 = t8Var10.FXJmAAN1[i20].P7K7Inc8;
                                if (e8Var6 != null) {
                                }
                            }
                            t8Var10 = null;
                            if (t8Var10 != null) {
                                t8Var10 = t8Var12;
                                z5 = true;
                            }
                            t8Var13 = t8Var12;
                            i19 = i14;
                            i17 = 3;
                            i18 = 8;
                            t8Var12 = t8Var10;
                            i16 = i13;
                        }
                    }
                    i13 = i16;
                    i14 = i19;
                    t8Var9 = t8Var13;
                    if (t8Var9 != t8Var12) {
                    }
                    e8Var5 = e8VarArr5[i20 + 1].P7K7Inc8;
                    if (e8Var5 != null) {
                    }
                    t8Var10 = null;
                    if (t8Var10 != null) {
                    }
                    t8Var13 = t8Var12;
                    i19 = i14;
                    i17 = 3;
                    i18 = 8;
                    t8Var12 = t8Var10;
                    i16 = i13;
                }
                i4 = i16;
                int i26 = i19;
                t8 t8Var15 = b4Var.NCTxEWno;
                if (t8Var15 != null) {
                    t8Var15.FXJmAAN1[i20].wxUZMvaN();
                }
                t8 t8Var16 = b4Var.wxUZMvaN;
                if (t8Var16 != null) {
                    t8Var16.FXJmAAN1[i20 + 1].wxUZMvaN();
                }
                b4Var.MdtA4re8 = t8Var12;
                if (i26 == 0 && b4Var.OnDfzHZD) {
                    b4Var.VgvYg0wo = t8Var12;
                } else {
                    b4Var.VgvYg0wo = t8Var11;
                }
                b4Var.sjUBp5pO = b4Var.lDXGDhIF && b4Var.ygLcUYwZ;
            }
            b4Var.OxcuoDLp = true;
            if (arrayList3 == null || arrayList3.contains(t8Var11)) {
                t8 t8Var17 = b4Var.MdtA4re8;
                t8 t8Var18 = b4Var.NCTxEWno;
                t8 t8Var19 = b4Var.wxUZMvaN;
                t8 t8Var20 = b4Var.VgvYg0wo;
                float f6 = b4Var.k3x7lurq;
                int[] iArr = u8Var2.N2kLh4D5;
                e8[] e8VarArr6 = u8Var2.FXJmAAN1;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i27 = t8Var20.Wi7iiXC4;
                    boolean z7 = i27 == 0;
                    e8VarArr = e8VarArr4;
                    boolean z8 = i27 == 1;
                    z = i27 == 2;
                    t8Var = t8Var11;
                    f = f6;
                    z3 = z8;
                    z2 = z7;
                } else {
                    e8VarArr = e8VarArr4;
                    int i28 = t8Var20.QT4Tf9Dt;
                    boolean z9 = i28 == 0;
                    boolean z10 = i28 == 1;
                    z = i28 == 2;
                    t8Var = t8Var11;
                    f = f6;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    e8[] e8VarArr7 = t8Var.FXJmAAN1;
                    int[] iArr2 = t8Var.N2kLh4D5;
                    e8 e8Var7 = e8VarArr7[i3];
                    int i29 = z ? 1 : 4;
                    int wxUZMvaN2 = e8Var7.wxUZMvaN();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && t8Var.Ey6iv0m0[i] == 0;
                    e8 e8Var8 = e8Var7.P7K7Inc8;
                    if (e8Var8 != null && t8Var != t8Var11) {
                        wxUZMvaN2 = e8Var8.wxUZMvaN() + wxUZMvaN2;
                    }
                    int i30 = wxUZMvaN2;
                    if (z13 && t8Var != t8Var11 && t8Var != t8Var18) {
                        i29 = 8;
                    }
                    t8 t8Var21 = t8Var11;
                    e8 e8Var9 = e8Var7.P7K7Inc8;
                    if (e8Var9 != null) {
                        boolean z15 = z14;
                        r70 r70Var6 = e8Var7.jb9XjC4I;
                        r70 r70Var7 = e8Var9.jb9XjC4I;
                        if (t8Var == t8Var18) {
                            gpVar3.P7K7Inc8(r70Var6, r70Var7, i30, 6);
                        } else {
                            gpVar3.P7K7Inc8(r70Var6, r70Var7, i30, 8);
                        }
                        if (z15 && !z13) {
                            i29 = 5;
                        }
                        gpVar3.VgvYg0wo(e8Var7.jb9XjC4I, e8Var7.P7K7Inc8.jb9XjC4I, i30, (t8Var == t8Var18 && z13 && t8Var.N8VPGzVC[i]) ? 5 : i29);
                    }
                    if (z12) {
                        if (t8Var.LvHlPNBd == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            gpVar3.P7K7Inc8(e8VarArr7[i3 + 1].jb9XjC4I, e8VarArr7[i3].jb9XjC4I, 0, 5);
                        }
                        gpVar3.P7K7Inc8(e8VarArr7[i3].jb9XjC4I, e8VarArr6[i3].jb9XjC4I, i12, 8);
                    }
                    e8 e8Var10 = e8VarArr7[i3 + 1].P7K7Inc8;
                    if (e8Var10 != null) {
                        t8Var8 = e8Var10.wxUZMvaN;
                        e8 e8Var11 = t8Var8.FXJmAAN1[i3].P7K7Inc8;
                        if (e8Var11 != null) {
                        }
                    }
                    t8Var8 = null;
                    if (t8Var8 != null) {
                        t8Var = t8Var8;
                    } else {
                        z11 = true;
                    }
                    t8Var11 = t8Var21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (t8Var19 != null) {
                    int i31 = i3 + 1;
                    if (t8Var17.FXJmAAN1[i31].P7K7Inc8 != null) {
                        e8 e8Var12 = t8Var19.FXJmAAN1[i31];
                        if (t8Var19.N2kLh4D5[i] == 3 && t8Var19.Ey6iv0m0[i] == 0 && !z17) {
                            e8 e8Var13 = e8Var12.P7K7Inc8;
                            if (e8Var13.wxUZMvaN == u8Var2) {
                                gpVar3.VgvYg0wo(e8Var12.jb9XjC4I, e8Var13.jb9XjC4I, -e8Var12.wxUZMvaN(), 5);
                                gpVar3.b2ZJblxo(e8Var12.jb9XjC4I, t8Var17.FXJmAAN1[i31].P7K7Inc8.jb9XjC4I, -e8Var12.wxUZMvaN(), 6);
                            }
                        }
                        if (z17) {
                            e8 e8Var14 = e8Var12.P7K7Inc8;
                            if (e8Var14.wxUZMvaN == u8Var2) {
                                gpVar3.VgvYg0wo(e8Var12.jb9XjC4I, e8Var14.jb9XjC4I, -e8Var12.wxUZMvaN(), 4);
                            }
                        }
                        gpVar3.b2ZJblxo(e8Var12.jb9XjC4I, t8Var17.FXJmAAN1[i31].P7K7Inc8.jb9XjC4I, -e8Var12.wxUZMvaN(), 6);
                    }
                }
                if (z16) {
                    int i32 = i3 + 1;
                    r70 r70Var8 = e8VarArr6[i32].jb9XjC4I;
                    e8 e8Var15 = t8Var17.FXJmAAN1[i32];
                    gpVar3.P7K7Inc8(r70Var8, e8Var15.jb9XjC4I, e8Var15.wxUZMvaN(), 8);
                }
                ArrayList arrayList5 = b4Var.Qr9iLBAD;
                if (arrayList5 != null && (size = arrayList5.size()) > 1) {
                    if (b4Var.ygLcUYwZ && !b4Var.sjUBp5pO) {
                        f = b4Var.eVhOlqcC;
                    }
                    t8 t8Var22 = null;
                    float f7 = 0.0f;
                    int i33 = 0;
                    while (i33 < size) {
                        t8 t8Var23 = (t8) arrayList5.get(i33);
                        float[] fArr = t8Var23.orhfF2Ya;
                        e8[] e8VarArr8 = t8Var23.FXJmAAN1;
                        float f8 = fArr[i];
                        if (f8 < f4) {
                            if (b4Var.sjUBp5pO) {
                                arrayList2 = arrayList5;
                                i9 = size;
                                gpVar3.VgvYg0wo(e8VarArr8[i3 + 1].jb9XjC4I, e8VarArr8[i3].jb9XjC4I, 0, 4);
                                f3 = f7;
                                i10 = i15;
                                f2 = f4;
                                f7 = f3;
                                i11 = i33;
                                i33 = i11 + 1;
                                i15 = i10;
                                arrayList5 = arrayList2;
                                size = i9;
                                f4 = f2;
                            } else {
                                f8 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList5;
                        i9 = size;
                        if (f8 == f4) {
                            f3 = f7;
                            gpVar3.VgvYg0wo(e8VarArr8[i3 + 1].jb9XjC4I, e8VarArr8[i3].jb9XjC4I, 0, 8);
                            i10 = i15;
                            f2 = f4;
                            f7 = f3;
                            i11 = i33;
                            i33 = i11 + 1;
                            i15 = i10;
                            arrayList5 = arrayList2;
                            size = i9;
                            f4 = f2;
                        } else {
                            float f9 = f7;
                            if (t8Var22 != null) {
                                e8[] e8VarArr9 = t8Var22.FXJmAAN1;
                                r70 r70Var9 = e8VarArr9[i3].jb9XjC4I;
                                int i34 = i3 + 1;
                                r70 r70Var10 = e8VarArr9[i34].jb9XjC4I;
                                r70 r70Var11 = e8VarArr8[i3].jb9XjC4I;
                                r70 r70Var12 = e8VarArr8[i34].jb9XjC4I;
                                y0 ow5vqvCr2 = gpVar3.ow5vqvCr();
                                t8Var7 = t8Var23;
                                float f10 = f4;
                                ow5vqvCr2.NCTxEWno = f10;
                                f2 = f10;
                                if (f == f10 || f9 == f8) {
                                    i11 = i33;
                                    i10 = i15;
                                    ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var9, 1.0f);
                                    ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var10, -1.0f);
                                    ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var12, 1.0f);
                                    ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var11, -1.0f);
                                } else {
                                    r0 r0Var = ow5vqvCr2.wxUZMvaN;
                                    if (f9 == f2) {
                                        i11 = i33;
                                        r0Var.b2ZJblxo(r70Var9, 1.0f);
                                        ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var10, -1.0f);
                                        i10 = i15;
                                    } else {
                                        i11 = i33;
                                        i10 = i15;
                                        if (f8 == f4) {
                                            r0Var.b2ZJblxo(r70Var11, 1.0f);
                                            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var12, -1.0f);
                                        } else {
                                            float f11 = (f9 / f) / (f8 / f);
                                            r0Var.b2ZJblxo(r70Var9, 1.0f);
                                            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var10, -1.0f);
                                            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var12, f11);
                                            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var11, -f11);
                                        }
                                    }
                                }
                                gpVar3.MdtA4re8(ow5vqvCr2);
                            } else {
                                t8Var7 = t8Var23;
                                i10 = i15;
                                f2 = f4;
                                i11 = i33;
                            }
                            f7 = f8;
                            t8Var22 = t8Var7;
                            i33 = i11 + 1;
                            i15 = i10;
                            arrayList5 = arrayList2;
                            size = i9;
                            f4 = f2;
                        }
                    }
                }
                i5 = i15;
                if (t8Var18 == null || !(t8Var18 == t8Var19 || z17)) {
                    t8Var2 = t8Var19;
                    if (z2 && t8Var18 != null) {
                        int i35 = b4Var.eVhOlqcC;
                        boolean z18 = i35 > 0 && b4Var.jb9XjC4I == i35;
                        t8 t8Var24 = t8Var18;
                        t8 t8Var25 = t8Var24;
                        while (true) {
                            e8[] e8VarArr10 = t8Var25.FXJmAAN1;
                            if (t8Var24 == null) {
                                break;
                            }
                            e8[] e8VarArr11 = t8Var24.FXJmAAN1;
                            t8 t8Var26 = t8Var24.f7oeun2L[i];
                            while (true) {
                                if (t8Var26 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (t8Var26.LvHlPNBd != 8) {
                                    break;
                                } else {
                                    t8Var26 = t8Var26.f7oeun2L[i];
                                }
                            }
                            if (t8Var26 != null || t8Var24 == t8Var2) {
                                e8 e8Var16 = e8VarArr11[i3];
                                r70 r70Var13 = e8Var16.jb9XjC4I;
                                e8 e8Var17 = e8Var16.P7K7Inc8;
                                r70 r70Var14 = e8Var17 != null ? e8Var17.jb9XjC4I : null;
                                if (t8Var25 != t8Var24) {
                                    r70Var14 = e8VarArr10[i3 + 1].jb9XjC4I;
                                } else if (t8Var24 == t8Var18) {
                                    e8 e8Var18 = e8VarArr[i3].P7K7Inc8;
                                    r70Var14 = e8Var18 != null ? e8Var18.jb9XjC4I : null;
                                }
                                int wxUZMvaN3 = e8Var16.wxUZMvaN();
                                int i36 = i3 + 1;
                                int wxUZMvaN4 = e8VarArr11[i36].wxUZMvaN();
                                if (t8Var26 != null) {
                                    e8Var2 = t8Var26.FXJmAAN1[i3];
                                    e8VarArr2 = e8VarArr10;
                                    r70Var3 = e8Var2.jb9XjC4I;
                                } else {
                                    e8VarArr2 = e8VarArr10;
                                    e8Var2 = t8Var17.FXJmAAN1[i36].P7K7Inc8;
                                    r70Var3 = e8Var2 != null ? e8Var2.jb9XjC4I : null;
                                }
                                r70 r70Var15 = e8VarArr11[i36].jb9XjC4I;
                                if (e8Var2 != null) {
                                    wxUZMvaN4 += e8Var2.wxUZMvaN();
                                }
                                int wxUZMvaN5 = e8VarArr2[i36].wxUZMvaN() + wxUZMvaN3;
                                if (r70Var13 == null || r70Var14 == null || r70Var3 == null || r70Var15 == null) {
                                    t8Var5 = t8Var26;
                                    t8Var6 = t8Var25;
                                    i7 = 8;
                                } else {
                                    if (t8Var24 == t8Var18) {
                                        wxUZMvaN5 = t8Var18.FXJmAAN1[i3].wxUZMvaN();
                                    }
                                    int i37 = wxUZMvaN5;
                                    if (t8Var24 == t8Var2) {
                                        wxUZMvaN4 = t8Var2.FXJmAAN1[i36].wxUZMvaN();
                                    }
                                    t8Var5 = t8Var26;
                                    t8Var6 = t8Var25;
                                    i7 = 8;
                                    gpVar.NCTxEWno(r70Var13, r70Var14, i37, 0.5f, r70Var3, r70Var15, wxUZMvaN4, z18 ? 8 : 5);
                                }
                            } else {
                                t8Var5 = t8Var26;
                                t8Var6 = t8Var25;
                                i7 = i6;
                            }
                            if (t8Var24.LvHlPNBd != i7) {
                                t8Var6 = t8Var24;
                            }
                            t8Var24 = t8Var5;
                            t8Var25 = t8Var6;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && t8Var18 != null) {
                            int i39 = b4Var.eVhOlqcC;
                            boolean z19 = i39 > 0 && b4Var.jb9XjC4I == i39;
                            t8 t8Var27 = t8Var18;
                            t8 t8Var28 = t8Var27;
                            while (true) {
                                e8[] e8VarArr12 = t8Var27.FXJmAAN1;
                                if (t8Var28 == null) {
                                    break;
                                }
                                e8[] e8VarArr13 = t8Var28.FXJmAAN1;
                                t8 t8Var29 = t8Var28.f7oeun2L[i];
                                while (t8Var29 != null && t8Var29.LvHlPNBd == i38) {
                                    t8Var29 = t8Var29.f7oeun2L[i];
                                }
                                if (t8Var28 == t8Var18 || t8Var28 == t8Var2 || t8Var29 == null) {
                                    t8Var3 = t8Var27;
                                } else {
                                    if (t8Var29 == t8Var2) {
                                        t8Var29 = null;
                                    }
                                    e8 e8Var19 = e8VarArr13[i3];
                                    r70 r70Var16 = e8Var19.jb9XjC4I;
                                    int i40 = i3 + 1;
                                    r70 r70Var17 = e8VarArr12[i40].jb9XjC4I;
                                    int wxUZMvaN6 = e8Var19.wxUZMvaN();
                                    int wxUZMvaN7 = e8VarArr13[i40].wxUZMvaN();
                                    if (t8Var29 != null) {
                                        e8Var = t8Var29.FXJmAAN1[i3];
                                        r70Var = e8Var.jb9XjC4I;
                                        t8Var3 = t8Var27;
                                        e8 e8Var20 = e8Var.P7K7Inc8;
                                        r70Var2 = e8Var20 != null ? e8Var20.jb9XjC4I : null;
                                    } else {
                                        t8Var3 = t8Var27;
                                        e8 e8Var21 = t8Var2.FXJmAAN1[i3];
                                        r70Var = e8Var21 != null ? e8Var21.jb9XjC4I : null;
                                        r70 r70Var18 = e8VarArr13[i40].jb9XjC4I;
                                        e8Var = e8Var21;
                                        r70Var2 = r70Var18;
                                    }
                                    if (e8Var != null) {
                                        wxUZMvaN7 += e8Var.wxUZMvaN();
                                    }
                                    int wxUZMvaN8 = e8VarArr12[i40].wxUZMvaN() + wxUZMvaN6;
                                    t8 t8Var30 = t8Var29;
                                    int i41 = wxUZMvaN7;
                                    int i42 = z19 ? 8 : 4;
                                    if (r70Var16 == null || r70Var17 == null || r70Var == null || r70Var2 == null) {
                                        t8Var4 = t8Var30;
                                    } else {
                                        r70 r70Var19 = r70Var;
                                        t8Var4 = t8Var30;
                                        gpVar.NCTxEWno(r70Var16, r70Var17, wxUZMvaN8, 0.5f, r70Var19, r70Var2, i41, i42);
                                    }
                                    t8Var29 = t8Var4;
                                }
                                if (t8Var28.LvHlPNBd != 8) {
                                    t8Var3 = t8Var28;
                                }
                                t8Var28 = t8Var29;
                                i38 = 8;
                                t8Var27 = t8Var3;
                            }
                            gpVar2 = gpVar;
                            e8 e8Var22 = t8Var18.FXJmAAN1[i3];
                            e8 e8Var23 = e8VarArr[i3].P7K7Inc8;
                            int i43 = i3 + 1;
                            e8 e8Var24 = t8Var2.FXJmAAN1[i43];
                            e8 e8Var25 = t8Var17.FXJmAAN1[i43].P7K7Inc8;
                            if (e8Var23 != null) {
                                if (t8Var18 != t8Var2) {
                                    gpVar2.VgvYg0wo(e8Var22.jb9XjC4I, e8Var23.jb9XjC4I, e8Var22.wxUZMvaN(), 5);
                                } else if (e8Var25 != null) {
                                    gpVar2.NCTxEWno(e8Var22.jb9XjC4I, e8Var23.jb9XjC4I, e8Var22.wxUZMvaN(), 0.5f, e8Var24.jb9XjC4I, e8Var25.jb9XjC4I, e8Var24.wxUZMvaN(), 5);
                                }
                            }
                            if (e8Var25 != null && t8Var18 != t8Var2) {
                                gpVar2.VgvYg0wo(e8Var24.jb9XjC4I, e8Var25.jb9XjC4I, -e8Var24.wxUZMvaN(), 5);
                            }
                            if ((!z2 || z3) && t8Var18 != null && t8Var18 != t8Var2) {
                                e8[] e8VarArr14 = t8Var18.FXJmAAN1;
                                e8Var3 = e8VarArr14[i3];
                                if (t8Var2 == null) {
                                    t8Var2 = t8Var18;
                                }
                                e8VarArr3 = t8Var2.FXJmAAN1;
                                i8 = i3 + 1;
                                e8Var4 = e8VarArr3[i8];
                                e8 e8Var26 = e8Var3.P7K7Inc8;
                                r70Var4 = e8Var26 == null ? e8Var26.jb9XjC4I : null;
                                e8 e8Var27 = e8Var4.P7K7Inc8;
                                r70Var5 = e8Var27 == null ? e8Var27.jb9XjC4I : null;
                                if (t8Var17 != t8Var2) {
                                    e8 e8Var28 = t8Var17.FXJmAAN1[i8].P7K7Inc8;
                                    r70Var5 = e8Var28 != null ? e8Var28.jb9XjC4I : null;
                                }
                                if (t8Var18 == t8Var2) {
                                    e8Var4 = e8VarArr14[i8];
                                }
                                if (r70Var4 != null && r70Var5 != null) {
                                    gpVar2.NCTxEWno(e8Var3.jb9XjC4I, r70Var4, e8Var3.wxUZMvaN(), 0.5f, r70Var5, e8Var4.jb9XjC4I, e8VarArr3[i8].wxUZMvaN(), 5);
                                }
                            }
                        }
                    }
                } else {
                    e8 e8Var29 = e8VarArr[i3];
                    int i44 = i3 + 1;
                    e8 e8Var30 = t8Var17.FXJmAAN1[i44];
                    e8 e8Var31 = e8Var29.P7K7Inc8;
                    r70 r70Var20 = e8Var31 != null ? e8Var31.jb9XjC4I : null;
                    e8 e8Var32 = e8Var30.P7K7Inc8;
                    r70 r70Var21 = e8Var32 != null ? e8Var32.jb9XjC4I : null;
                    e8 e8Var33 = t8Var18.FXJmAAN1[i3];
                    if (t8Var19 != null) {
                        e8Var30 = t8Var19.FXJmAAN1[i44];
                    }
                    if (r70Var20 == null || r70Var21 == null) {
                        t8Var2 = t8Var19;
                    } else {
                        float f12 = i == 0 ? t8Var20.pP9Y2m6O : t8Var20.tef3qNMP;
                        int wxUZMvaN9 = e8Var33.wxUZMvaN();
                        int wxUZMvaN10 = e8Var30.wxUZMvaN();
                        r70 r70Var22 = e8Var33.jb9XjC4I;
                        r70 r70Var23 = e8Var30.jb9XjC4I;
                        r70 r70Var24 = r70Var20;
                        t8Var2 = t8Var19;
                        gpVar3.NCTxEWno(r70Var22, r70Var24, wxUZMvaN9, f12, r70Var21, r70Var23, wxUZMvaN10, 7);
                    }
                }
                gpVar2 = gpVar;
                if (!z2) {
                }
                e8[] e8VarArr142 = t8Var18.FXJmAAN1;
                e8Var3 = e8VarArr142[i3];
                if (t8Var2 == null) {
                }
                e8VarArr3 = t8Var2.FXJmAAN1;
                i8 = i3 + 1;
                e8Var4 = e8VarArr3[i8];
                e8 e8Var262 = e8Var3.P7K7Inc8;
                if (e8Var262 == null) {
                }
                e8 e8Var272 = e8Var4.P7K7Inc8;
                if (e8Var272 == null) {
                }
                if (t8Var17 != t8Var2) {
                }
                if (t8Var18 == t8Var2) {
                }
                if (r70Var4 != null) {
                    gpVar2.NCTxEWno(e8Var3.jb9XjC4I, r70Var4, e8Var3.wxUZMvaN(), 0.5f, r70Var5, e8Var4.jb9XjC4I, e8VarArr3[i8].wxUZMvaN(), 5);
                }
            } else {
                i5 = i15;
            }
            i16 = i4 + 1;
            u8Var2 = u8Var;
            gpVar3 = gpVar;
            arrayList3 = arrayList;
            i15 = i5;
        }
    }

    public static final Object OnDfzHZD(dl dlVar, g9 g9Var) {
        v50 v50Var = new v50(g9Var, g9Var.wxUZMvaN());
        return m50.jb9XjC4I(v50Var, v50Var, dlVar);
    }

    public static final Object OxcuoDLp(Context context, Class cls) {
        Application application;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context context2 = applicationContext;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    application = (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        application = (Application) applicationContext;
        return fn.ow5vqvCr(application, cls);
    }

    public static mp P7K7Inc8(mp mpVar) {
        mpVar.P7K7Inc8();
        mpVar.wxUZMvaN = true;
        return mpVar.MdtA4re8 > 0 ? mpVar : mp.VgvYg0wo;
    }

    public static void RXQxj5Oe(int i, j8 j8Var, t8 t8Var, boolean z) {
        e8 e8Var;
        e8 e8Var2;
        boolean z2;
        e8 e8Var3;
        e8 e8Var4;
        if (t8Var.OnDfzHZD) {
            return;
        }
        if (!(t8Var instanceof u8) && t8Var.gjV1z5T1() && b2ZJblxo(t8Var)) {
            u8.N8VPGzVC(t8Var, j8Var, new e2());
        }
        e8 b2ZJblxo2 = t8Var.b2ZJblxo(2);
        e8 b2ZJblxo3 = t8Var.b2ZJblxo(4);
        int MdtA4re82 = b2ZJblxo2.MdtA4re8();
        int MdtA4re83 = b2ZJblxo3.MdtA4re8();
        HashSet hashSet = b2ZJblxo2.qoPGr6Ce;
        if (hashSet != null && b2ZJblxo2.MdtA4re8) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e8 e8Var5 = (e8) it.next();
                t8 t8Var2 = e8Var5.wxUZMvaN;
                int i2 = i + 1;
                boolean b2ZJblxo4 = b2ZJblxo(t8Var2);
                e8 e8Var6 = t8Var2.eIA6dogk;
                e8 e8Var7 = t8Var2.VhgXwMj9;
                if (t8Var2.gjV1z5T1() && b2ZJblxo4) {
                    z2 = true;
                    u8.N8VPGzVC(t8Var2, j8Var, new e2());
                } else {
                    z2 = true;
                }
                boolean z3 = ((e8Var5 == e8Var6 && (e8Var4 = e8Var7.P7K7Inc8) != null && e8Var4.MdtA4re8) || (e8Var5 == e8Var7 && (e8Var3 = e8Var6.P7K7Inc8) != null && e8Var3.MdtA4re8)) ? z2 : false;
                int i3 = t8Var2.N2kLh4D5[0];
                if (i3 != 3 || b2ZJblxo4) {
                    if (!t8Var2.gjV1z5T1()) {
                        if (e8Var5 == e8Var6 && e8Var7.P7K7Inc8 == null) {
                            int wxUZMvaN2 = e8Var6.wxUZMvaN() + MdtA4re82;
                            t8Var2.SgZGMMPL(wxUZMvaN2, t8Var2.lDXGDhIF() + wxUZMvaN2);
                            RXQxj5Oe(i2, j8Var, t8Var2, z);
                        } else if (e8Var5 == e8Var7 && e8Var6.P7K7Inc8 == null) {
                            int wxUZMvaN3 = MdtA4re82 - e8Var7.wxUZMvaN();
                            t8Var2.SgZGMMPL(wxUZMvaN3 - t8Var2.lDXGDhIF(), wxUZMvaN3);
                            RXQxj5Oe(i2, j8Var, t8Var2, z);
                        } else if (z3 && !t8Var2.RXQxj5Oe()) {
                            aZz0PFXp(i2, j8Var, t8Var2, z);
                        }
                    }
                } else if (i3 == 3 && t8Var2.RXQxj5Oe >= 0 && t8Var2.I5GHvsYW >= 0 && (t8Var2.LvHlPNBd == 8 || (t8Var2.amk52bBQ == 0 && t8Var2.KRabZ4CU == 0.0f))) {
                    if (!t8Var2.RXQxj5Oe() && z3 && !t8Var2.RXQxj5Oe()) {
                        Xkz7p5xa(i2, t8Var, j8Var, t8Var2, z);
                    }
                }
            }
        }
        if (t8Var instanceof am) {
            return;
        }
        HashSet hashSet2 = b2ZJblxo3.qoPGr6Ce;
        if (hashSet2 != null && b2ZJblxo3.MdtA4re8) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                e8 e8Var8 = (e8) it2.next();
                t8 t8Var3 = e8Var8.wxUZMvaN;
                int i4 = i + 1;
                boolean b2ZJblxo5 = b2ZJblxo(t8Var3);
                e8 e8Var9 = t8Var3.eIA6dogk;
                e8 e8Var10 = t8Var3.VhgXwMj9;
                if (t8Var3.gjV1z5T1() && b2ZJblxo5) {
                    u8.N8VPGzVC(t8Var3, j8Var, new e2());
                }
                boolean z4 = (e8Var8 == e8Var9 && (e8Var2 = e8Var10.P7K7Inc8) != null && e8Var2.MdtA4re8) || (e8Var8 == e8Var10 && (e8Var = e8Var9.P7K7Inc8) != null && e8Var.MdtA4re8);
                int i5 = t8Var3.N2kLh4D5[0];
                if (i5 != 3 || b2ZJblxo5) {
                    if (!t8Var3.gjV1z5T1()) {
                        if (e8Var8 == e8Var9 && e8Var10.P7K7Inc8 == null) {
                            int wxUZMvaN4 = e8Var9.wxUZMvaN() + MdtA4re83;
                            t8Var3.SgZGMMPL(wxUZMvaN4, t8Var3.lDXGDhIF() + wxUZMvaN4);
                            RXQxj5Oe(i4, j8Var, t8Var3, z);
                        } else if (e8Var8 == e8Var10 && e8Var9.P7K7Inc8 == null) {
                            int wxUZMvaN5 = MdtA4re83 - e8Var10.wxUZMvaN();
                            t8Var3.SgZGMMPL(wxUZMvaN5 - t8Var3.lDXGDhIF(), wxUZMvaN5);
                            RXQxj5Oe(i4, j8Var, t8Var3, z);
                        } else if (z4 && !t8Var3.RXQxj5Oe()) {
                            aZz0PFXp(i4, j8Var, t8Var3, z);
                        }
                    }
                } else if (i5 == 3 && t8Var3.RXQxj5Oe >= 0 && t8Var3.I5GHvsYW >= 0) {
                    if (t8Var3.LvHlPNBd == 8 || (t8Var3.amk52bBQ == 0 && t8Var3.KRabZ4CU == 0.0f)) {
                        if (!t8Var3.RXQxj5Oe() && z4 && !t8Var3.RXQxj5Oe()) {
                            Xkz7p5xa(i4, t8Var, j8Var, t8Var3, z);
                        }
                    }
                }
            }
        }
        t8Var.OnDfzHZD = true;
    }

    public static TypedValue SgZGMMPL(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static xg VgvYg0wo(xg xgVar, int i) {
        v2 v2Var;
        if (i < 0 && i != -2 && i != -1) {
            m1.NCTxEWno(q70.VgvYg0wo("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            v2Var = v2.MdtA4re8;
        } else {
            v2Var = v2.NCTxEWno;
        }
        boolean z = xgVar instanceof ol;
        uf ufVar = uf.NCTxEWno;
        return z ? ((ol) xgVar).VgvYg0wo(ufVar, i, v2Var) : new n4(xgVar, ufVar, i, v2Var);
    }

    public static void VhgXwMj9(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void Xkz7p5xa(int i, t8 t8Var, j8 j8Var, t8 t8Var2, boolean z) {
        float f = t8Var2.pP9Y2m6O;
        e8 e8Var = t8Var2.eIA6dogk;
        int wxUZMvaN2 = e8Var.wxUZMvaN() + e8Var.P7K7Inc8.MdtA4re8();
        e8 e8Var2 = t8Var2.VhgXwMj9;
        int MdtA4re82 = e8Var2.P7K7Inc8.MdtA4re8() - e8Var2.wxUZMvaN();
        if (MdtA4re82 >= wxUZMvaN2) {
            int lDXGDhIF2 = t8Var2.lDXGDhIF();
            if (t8Var2.LvHlPNBd != 8) {
                int i2 = t8Var2.amk52bBQ;
                if (i2 == 2) {
                    lDXGDhIF2 = (int) (t8Var2.pP9Y2m6O * 0.5f * (t8Var instanceof u8 ? t8Var.lDXGDhIF() : t8Var.HdOGZAzC.lDXGDhIF()));
                } else if (i2 == 0) {
                    lDXGDhIF2 = MdtA4re82 - wxUZMvaN2;
                }
                lDXGDhIF2 = Math.max(t8Var2.I5GHvsYW, lDXGDhIF2);
                int i3 = t8Var2.RXQxj5Oe;
                if (i3 > 0) {
                    lDXGDhIF2 = Math.min(i3, lDXGDhIF2);
                }
            }
            int i4 = wxUZMvaN2 + ((int) ((f * ((MdtA4re82 - wxUZMvaN2) - lDXGDhIF2)) + 0.5f));
            t8Var2.SgZGMMPL(i4, lDXGDhIF2 + i4);
            RXQxj5Oe(i + 1, j8Var, t8Var2, z);
        }
    }

    public static void aZz0PFXp(int i, j8 j8Var, t8 t8Var, boolean z) {
        float f = t8Var.pP9Y2m6O;
        e8 e8Var = t8Var.eIA6dogk;
        int MdtA4re82 = e8Var.P7K7Inc8.MdtA4re8();
        e8 e8Var2 = t8Var.VhgXwMj9;
        int MdtA4re83 = e8Var2.P7K7Inc8.MdtA4re8();
        int wxUZMvaN2 = e8Var.wxUZMvaN() + MdtA4re82;
        int wxUZMvaN3 = MdtA4re83 - e8Var2.wxUZMvaN();
        if (MdtA4re82 == MdtA4re83) {
            f = 0.5f;
        } else {
            MdtA4re82 = wxUZMvaN2;
            MdtA4re83 = wxUZMvaN3;
        }
        int lDXGDhIF2 = t8Var.lDXGDhIF();
        int i2 = (MdtA4re83 - MdtA4re82) - lDXGDhIF2;
        if (MdtA4re82 > MdtA4re83) {
            i2 = (MdtA4re82 - MdtA4re83) - lDXGDhIF2;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + MdtA4re82;
        int i4 = i3 + lDXGDhIF2;
        if (MdtA4re82 > MdtA4re83) {
            i4 = i3 - lDXGDhIF2;
        }
        t8Var.SgZGMMPL(i3, i4);
        RXQxj5Oe(i + 1, j8Var, t8Var, z);
    }

    public static boolean b2ZJblxo(t8 t8Var) {
        int[] iArr = t8Var.N2kLh4D5;
        int i = iArr[0];
        int i2 = iArr[1];
        u8 u8Var = t8Var.HdOGZAzC;
        if (u8Var == null) {
            u8Var = null;
        }
        if (u8Var != null) {
            int i3 = u8Var.N2kLh4D5[0];
        }
        if (u8Var != null) {
            int i4 = u8Var.N2kLh4D5[1];
        }
        boolean z = i == 1 || t8Var.WYNAV5pd() || i == 2 || (i == 3 && t8Var.amk52bBQ == 0 && t8Var.KRabZ4CU == 0.0f && t8Var.amk52bBQ(0)) || (i == 3 && t8Var.amk52bBQ == 1 && t8Var.KlHjfFWx(0, t8Var.lDXGDhIF()));
        boolean z2 = i2 == 1 || t8Var.DK9slbsy() || i2 == 2 || (i2 == 3 && t8Var.KlHjfFWx == 0 && t8Var.KRabZ4CU == 0.0f && t8Var.amk52bBQ(1)) || (i2 == 3 && t8Var.KlHjfFWx == 1 && t8Var.KlHjfFWx(1, t8Var.jb9XjC4I()));
        return (t8Var.KRabZ4CU > 0.0f && (z || z2)) || (z && z2);
    }

    public static int eIA6dogk(Context context, int i, int i2) {
        TypedValue SgZGMMPL = SgZGMMPL(context.getTheme(), i);
        return (SgZGMMPL == null || SgZGMMPL.type != 16) ? i2 : SgZGMMPL.data;
    }

    public static List euDDoUNr(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void fVMzMhyS(int i, j8 j8Var, t8 t8Var) {
        float f = t8Var.tef3qNMP;
        e8 e8Var = t8Var.pRiPUEwG;
        int MdtA4re82 = e8Var.P7K7Inc8.MdtA4re8();
        e8 e8Var2 = t8Var.aZz0PFXp;
        int MdtA4re83 = e8Var2.P7K7Inc8.MdtA4re8();
        int wxUZMvaN2 = e8Var.wxUZMvaN() + MdtA4re82;
        int wxUZMvaN3 = MdtA4re83 - e8Var2.wxUZMvaN();
        if (MdtA4re82 == MdtA4re83) {
            f = 0.5f;
        } else {
            MdtA4re82 = wxUZMvaN2;
            MdtA4re83 = wxUZMvaN3;
        }
        int jb9XjC4I2 = t8Var.jb9XjC4I();
        int i2 = (MdtA4re83 - MdtA4re82) - jb9XjC4I2;
        if (MdtA4re82 > MdtA4re83) {
            i2 = (MdtA4re82 - MdtA4re83) - jb9XjC4I2;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = MdtA4re82 + i3;
        int i5 = i4 + jb9XjC4I2;
        if (MdtA4re82 > MdtA4re83) {
            i4 = MdtA4re82 - i3;
            i5 = i4 - jb9XjC4I2;
        }
        t8Var.ytu5o6f4(i4, i5);
        nSmgoSB5(i + 1, j8Var, t8Var);
    }

    public static final boolean gjV1z5T1(int i, pu puVar) {
        puVar.getClass();
        int i2 = pu.b2ZJblxo;
        Iterator it = l60.RXQxj5Oe(puVar, new tKaxLBvG(16)).iterator();
        while (it.hasNext()) {
            if (((pu) it.next()).MdtA4re8.qoPGr6Ce == i) {
                return true;
            }
        }
        return false;
    }

    public static void hzgxAD8d(int i, t8 t8Var, j8 j8Var, t8 t8Var2) {
        float f = t8Var2.tef3qNMP;
        e8 e8Var = t8Var2.pRiPUEwG;
        int wxUZMvaN2 = e8Var.wxUZMvaN() + e8Var.P7K7Inc8.MdtA4re8();
        e8 e8Var2 = t8Var2.aZz0PFXp;
        int MdtA4re82 = e8Var2.P7K7Inc8.MdtA4re8() - e8Var2.wxUZMvaN();
        if (MdtA4re82 >= wxUZMvaN2) {
            int jb9XjC4I2 = t8Var2.jb9XjC4I();
            if (t8Var2.LvHlPNBd != 8) {
                int i2 = t8Var2.KlHjfFWx;
                if (i2 == 2) {
                    jb9XjC4I2 = (int) (f * 0.5f * (t8Var instanceof u8 ? t8Var.jb9XjC4I() : t8Var.HdOGZAzC.jb9XjC4I()));
                } else if (i2 == 0) {
                    jb9XjC4I2 = MdtA4re82 - wxUZMvaN2;
                }
                jb9XjC4I2 = Math.max(t8Var2.gjV1z5T1, jb9XjC4I2);
                int i3 = t8Var2.WYNAV5pd;
                if (i3 > 0) {
                    jb9XjC4I2 = Math.min(i3, jb9XjC4I2);
                }
            }
            int i4 = wxUZMvaN2 + ((int) ((f * ((MdtA4re82 - wxUZMvaN2) - jb9XjC4I2)) + 0.5f));
            t8Var2.ytu5o6f4(i4, jb9XjC4I2 + i4);
            nSmgoSB5(i + 1, j8Var, t8Var2);
        }
    }

    public static void k3x7lurq(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final xg lDXGDhIF(xg xgVar) {
        return xgVar instanceof v90 ? xgVar : xgVar instanceof od ? xgVar : new od(xgVar);
    }

    public static ai lwWCatUu(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            VhgXwMj9(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), s00.NCTxEWno);
        int i4 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), s00.MdtA4re8);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        String string7 = obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            VhgXwMj9(xmlResourceParser);
                        }
                        arrayList.add(new ci(string7, i6, z, string6, i8, resourceId2));
                    } else {
                        VhgXwMj9(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new bi((ci[]) arrayList.toArray(new ci[0]));
        }
        List euDDoUNr = euDDoUNr(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), s00.wxUZMvaN);
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        i3 = integer;
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i5) {
                            VhgXwMj9(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i2 = i5;
                            try {
                                th thVar = new th(string, string2, string8, euDDoUNr, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(thVar);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i2 = i5;
                i3 = integer;
                VhgXwMj9(xmlResourceParser);
                i5 = i2;
                integer = i3;
                i = 2;
                i4 = 0;
            }
        }
        int i10 = integer;
        if (!arrayList2.isEmpty()) {
            return new di(arrayList2, i10, integer2, string5);
        }
        if (string3 == null) {
            m1.sjUBp5pO("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new th(string, string2, string3, euDDoUNr, null, null));
        if (string4 != null) {
            arrayList2.add(new th(string, string2, string4, euDDoUNr, null, null));
        }
        return new di(arrayList2, i10, integer2, string5);
    }

    public static void nSmgoSB5(int i, j8 j8Var, t8 t8Var) {
        boolean z;
        e8 e8Var;
        e8 e8Var2;
        e8 e8Var3;
        e8 e8Var4;
        if (t8Var.ygLcUYwZ) {
            return;
        }
        if (!(t8Var instanceof u8) && t8Var.gjV1z5T1() && b2ZJblxo(t8Var)) {
            u8.N8VPGzVC(t8Var, j8Var, new e2());
        }
        e8 b2ZJblxo2 = t8Var.b2ZJblxo(3);
        e8 b2ZJblxo3 = t8Var.b2ZJblxo(5);
        int MdtA4re82 = b2ZJblxo2.MdtA4re8();
        int MdtA4re83 = b2ZJblxo3.MdtA4re8();
        HashSet hashSet = b2ZJblxo2.qoPGr6Ce;
        if (hashSet != null && b2ZJblxo2.MdtA4re8) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e8 e8Var5 = (e8) it.next();
                t8 t8Var2 = e8Var5.wxUZMvaN;
                int i2 = i + 1;
                boolean b2ZJblxo4 = b2ZJblxo(t8Var2);
                e8 e8Var6 = t8Var2.pRiPUEwG;
                e8 e8Var7 = t8Var2.aZz0PFXp;
                if (t8Var2.gjV1z5T1() && b2ZJblxo4) {
                    u8.N8VPGzVC(t8Var2, j8Var, new e2());
                }
                boolean z2 = (e8Var5 == e8Var6 && (e8Var4 = e8Var7.P7K7Inc8) != null && e8Var4.MdtA4re8) || (e8Var5 == e8Var7 && (e8Var3 = e8Var6.P7K7Inc8) != null && e8Var3.MdtA4re8);
                int i3 = t8Var2.N2kLh4D5[1];
                if (i3 != 3 || b2ZJblxo4) {
                    if (!t8Var2.gjV1z5T1()) {
                        if (e8Var5 == e8Var6 && e8Var7.P7K7Inc8 == null) {
                            int wxUZMvaN2 = e8Var6.wxUZMvaN() + MdtA4re82;
                            t8Var2.ytu5o6f4(wxUZMvaN2, t8Var2.jb9XjC4I() + wxUZMvaN2);
                            nSmgoSB5(i2, j8Var, t8Var2);
                        } else if (e8Var5 == e8Var7 && e8Var6.P7K7Inc8 == null) {
                            int wxUZMvaN3 = MdtA4re82 - e8Var7.wxUZMvaN();
                            t8Var2.ytu5o6f4(wxUZMvaN3 - t8Var2.jb9XjC4I(), wxUZMvaN3);
                            nSmgoSB5(i2, j8Var, t8Var2);
                        } else if (z2 && !t8Var2.FySoLYna()) {
                            fVMzMhyS(i2, j8Var, t8Var2);
                        }
                    }
                } else if (i3 == 3 && t8Var2.WYNAV5pd >= 0 && t8Var2.gjV1z5T1 >= 0 && (t8Var2.LvHlPNBd == 8 || (t8Var2.KlHjfFWx == 0 && t8Var2.KRabZ4CU == 0.0f))) {
                    if (!t8Var2.FySoLYna() && z2 && !t8Var2.FySoLYna()) {
                        hzgxAD8d(i2, t8Var, j8Var, t8Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (t8Var instanceof am) {
            return;
        }
        HashSet hashSet2 = b2ZJblxo3.qoPGr6Ce;
        if (hashSet2 != null && b2ZJblxo3.MdtA4re8) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                e8 e8Var8 = (e8) it2.next();
                t8 t8Var3 = e8Var8.wxUZMvaN;
                int i4 = i + 1;
                boolean b2ZJblxo5 = b2ZJblxo(t8Var3);
                e8 e8Var9 = t8Var3.pRiPUEwG;
                e8 e8Var10 = t8Var3.aZz0PFXp;
                if (t8Var3.gjV1z5T1() && b2ZJblxo5) {
                    u8.N8VPGzVC(t8Var3, j8Var, new e2());
                }
                boolean z4 = (e8Var8 == e8Var9 && (e8Var2 = e8Var10.P7K7Inc8) != null && e8Var2.MdtA4re8) || (e8Var8 == e8Var10 && (e8Var = e8Var9.P7K7Inc8) != null && e8Var.MdtA4re8);
                int i5 = t8Var3.N2kLh4D5[1];
                if (i5 != 3 || b2ZJblxo5) {
                    if (!t8Var3.gjV1z5T1()) {
                        if (e8Var8 == e8Var9 && e8Var10.P7K7Inc8 == null) {
                            int wxUZMvaN4 = e8Var9.wxUZMvaN() + MdtA4re83;
                            t8Var3.ytu5o6f4(wxUZMvaN4, t8Var3.jb9XjC4I() + wxUZMvaN4);
                            nSmgoSB5(i4, j8Var, t8Var3);
                        } else if (e8Var8 == e8Var10 && e8Var9.P7K7Inc8 == null) {
                            int wxUZMvaN5 = MdtA4re83 - e8Var10.wxUZMvaN();
                            t8Var3.ytu5o6f4(wxUZMvaN5 - t8Var3.jb9XjC4I(), wxUZMvaN5);
                            nSmgoSB5(i4, j8Var, t8Var3);
                        } else if (z4 && !t8Var3.FySoLYna()) {
                            fVMzMhyS(i4, j8Var, t8Var3);
                        }
                    }
                } else if (i5 == 3 && t8Var3.WYNAV5pd >= 0 && t8Var3.gjV1z5T1 >= 0 && (t8Var3.LvHlPNBd == 8 || (t8Var3.KlHjfFWx == 0 && t8Var3.KRabZ4CU == 0.0f))) {
                    if (!t8Var3.FySoLYna() && z4 && !t8Var3.FySoLYna()) {
                        hzgxAD8d(i4, t8Var, j8Var, t8Var3);
                    }
                }
            }
        }
        e8 b2ZJblxo6 = t8Var.b2ZJblxo(6);
        if (b2ZJblxo6.qoPGr6Ce != null && b2ZJblxo6.MdtA4re8) {
            int MdtA4re84 = b2ZJblxo6.MdtA4re8();
            Iterator it3 = b2ZJblxo6.qoPGr6Ce.iterator();
            while (it3.hasNext()) {
                e8 e8Var11 = (e8) it3.next();
                t8 t8Var4 = e8Var11.wxUZMvaN;
                int i6 = i + 1;
                boolean b2ZJblxo7 = b2ZJblxo(t8Var4);
                e8 e8Var12 = t8Var4.Xkz7p5xa;
                if (t8Var4.gjV1z5T1() && b2ZJblxo7) {
                    u8.N8VPGzVC(t8Var4, j8Var, new e2());
                }
                if (t8Var4.N2kLh4D5[z3 ? 1 : 0] != 3 || b2ZJblxo7) {
                    if (!t8Var4.gjV1z5T1()) {
                        if (e8Var11 == e8Var12) {
                            int wxUZMvaN6 = e8Var11.wxUZMvaN() + MdtA4re84;
                            if (t8Var4.euDDoUNr) {
                                int i7 = wxUZMvaN6 - t8Var4.ESscZ9M1;
                                int i8 = t8Var4.bvfAo0eO + i7;
                                t8Var4.g2aRJUAd = i7;
                                t8Var4.pRiPUEwG.jb9XjC4I(i7);
                                t8Var4.aZz0PFXp.jb9XjC4I(i8);
                                e8Var12.jb9XjC4I(wxUZMvaN6);
                                z = z3 ? 1 : 0;
                                t8Var4.ow5vqvCr = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            nSmgoSB5(i6, j8Var, t8Var4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        t8Var.ygLcUYwZ = z3;
    }

    public static final void ow5vqvCr(int i) {
        if (i >= 1) {
            return;
        }
        m1.NCTxEWno(q70.VgvYg0wo("Expected positive parallelism level, but got ", i));
    }

    public static final Object pRiPUEwG(l9 l9Var, dl dlVar) {
        cg cgVar;
        l9 I5GHvsYW2;
        Thread currentThread = Thread.currentThread();
        k9 k9Var = re.MdtA4re8;
        n9 n9Var = (n9) l9Var.OnDfzHZD(k9Var);
        uf ufVar = uf.NCTxEWno;
        if (n9Var == null) {
            cgVar = kc0.qoPGr6Ce();
            I5GHvsYW2 = w30.I5GHvsYW(ufVar, l9Var.eVhOlqcC(cgVar), true);
            hb hbVar = ed.qoPGr6Ce;
            if (I5GHvsYW2 != hbVar && I5GHvsYW2.OnDfzHZD(k9Var) == null) {
                I5GHvsYW2 = I5GHvsYW2.eVhOlqcC(hbVar);
            }
        } else {
            cgVar = (cg) kc0.qoPGr6Ce.get();
            I5GHvsYW2 = w30.I5GHvsYW(ufVar, l9Var, true);
            hb hbVar2 = ed.qoPGr6Ce;
            if (I5GHvsYW2 != hbVar2 && I5GHvsYW2.OnDfzHZD(k9Var) == null) {
                I5GHvsYW2 = I5GHvsYW2.eVhOlqcC(hbVar2);
            }
        }
        j2 j2Var = new j2(I5GHvsYW2, currentThread, cgVar);
        j2Var.ESscZ9M1(w9.NCTxEWno, j2Var, dlVar);
        cg cgVar2 = j2Var.P7K7Inc8;
        if (cgVar2 != null) {
            int i = cg.b2ZJblxo;
            cgVar2.U0LaHZX7(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i7xS8jrb = cgVar2 != null ? cgVar2.i7xS8jrb() : Long.MAX_VALUE;
                if (!(j2Var.euDDoUNr() instanceof qm)) {
                    if (cgVar2 != null) {
                        int i2 = cg.b2ZJblxo;
                        cgVar2.DK9slbsy(false);
                    }
                    Object Xkz7p5xa = fn.Xkz7p5xa(j2Var.euDDoUNr());
                    c7 c7Var = Xkz7p5xa instanceof c7 ? (c7) Xkz7p5xa : null;
                    if (c7Var == null) {
                        return Xkz7p5xa;
                    }
                    throw c7Var.qoPGr6Ce;
                }
                LockSupport.parkNanos(j2Var, i7xS8jrb);
            } catch (Throwable th) {
                if (cgVar2 != null) {
                    int i3 = cg.b2ZJblxo;
                    cgVar2.DK9slbsy(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        j2Var.amk52bBQ(interruptedException);
        throw interruptedException;
    }

    public static final x90 qoPGr6Ce(Object obj) {
        if (obj == null) {
            obj = fn.OxcuoDLp;
        }
        return new x90(obj);
    }

    public static sh0 sjUBp5pO(t8 t8Var, int i, ArrayList arrayList, sh0 sh0Var) {
        int i2;
        int i3 = i == 0 ? t8Var.uQ3KJUK5 : t8Var.XrPeKzBk;
        if (i3 != -1 && (sh0Var == null || i3 != sh0Var.NCTxEWno)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                sh0 sh0Var2 = (sh0) arrayList.get(i4);
                if (sh0Var2.NCTxEWno == i3) {
                    if (sh0Var != null) {
                        sh0Var.MdtA4re8(i, sh0Var2);
                        arrayList.remove(sh0Var);
                    }
                    sh0Var = sh0Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return sh0Var;
        }
        if (sh0Var == null) {
            if (t8Var instanceof y1) {
                y1 y1Var = (y1) t8Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= y1Var.S7WAX0X5) {
                        i2 = -1;
                        break;
                    }
                    t8 t8Var2 = y1Var.SMax8wMR[i5];
                    if ((i == 0 && (i2 = t8Var2.uQ3KJUK5) != -1) || (i == 1 && (i2 = t8Var2.XrPeKzBk) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        sh0 sh0Var3 = (sh0) arrayList.get(i6);
                        if (sh0Var3.NCTxEWno == i2) {
                            sh0Var = sh0Var3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (sh0Var == null) {
                sh0Var = new sh0();
                sh0Var.qoPGr6Ce = new ArrayList();
                sh0Var.wxUZMvaN = null;
                sh0Var.VgvYg0wo = -1;
                int i7 = sh0.P7K7Inc8;
                sh0.P7K7Inc8 = i7 + 1;
                sh0Var.NCTxEWno = i7;
                sh0Var.MdtA4re8 = i;
            }
            arrayList.add(sh0Var);
        }
        ArrayList arrayList2 = sh0Var.qoPGr6Ce;
        if (arrayList2.contains(t8Var)) {
            return sh0Var;
        }
        arrayList2.add(t8Var);
        if (t8Var instanceof am) {
            am amVar = (am) t8Var;
            amVar.B1cjorwa.NCTxEWno(amVar.X1t0wlBd == 0 ? 1 : 0, sh0Var, arrayList);
        }
        int i8 = sh0Var.NCTxEWno;
        if (i == 0) {
            t8Var.uQ3KJUK5 = i8;
            t8Var.eIA6dogk.NCTxEWno(i, sh0Var, arrayList);
            t8Var.VhgXwMj9.NCTxEWno(i, sh0Var, arrayList);
        } else {
            t8Var.XrPeKzBk = i8;
            t8Var.pRiPUEwG.NCTxEWno(i, sh0Var, arrayList);
            t8Var.Xkz7p5xa.NCTxEWno(i, sh0Var, arrayList);
            t8Var.aZz0PFXp.NCTxEWno(i, sh0Var, arrayList);
        }
        t8Var.zCflySGU.NCTxEWno(i, sh0Var, arrayList);
        return sh0Var;
    }

    public static ng0 ygLcUYwZ(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (ng0) newInstance;
        } catch (IllegalAccessException e) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static boolean ytu5o6f4(Resources.Theme theme, int i, boolean z) {
        TypedValue SgZGMMPL = SgZGMMPL(theme, i);
        return (SgZGMMPL == null || SgZGMMPL.type != 18) ? z : SgZGMMPL.data != 0;
    }

    public static final String zCflySGU(g9 g9Var) {
        Object k30Var;
        if (g9Var instanceof ad) {
            return ((ad) g9Var).toString();
        }
        try {
            k30Var = g9Var + '@' + I5GHvsYW(g9Var);
        } catch (Throwable th) {
            k30Var = new k30(th);
        }
        if (l30.qoPGr6Ce(k30Var) != null) {
            k30Var = g9Var.getClass().getName() + '@' + I5GHvsYW(g9Var);
        }
        return (String) k30Var;
    }

    public abstract void DK9slbsy(VZZbw3BB vZZbw3BB);

    public abstract boolean MdtA4re8(Object obj, Object obj2);

    public abstract boolean Qr9iLBAD(WYNAV5pd wYNAV5pd, I5GHvsYW i5GHvsYW);

    public abstract void U0LaHZX7(gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12);

    public abstract void WYNAV5pd(Throwable th);

    public abstract void amk52bBQ(d70 d70Var, float f, float f2);

    public abstract boolean eVhOlqcC(WYNAV5pd wYNAV5pd, gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12);

    public abstract void i7xS8jrb(gjV1z5T1 gjv1z5t1, Thread thread);

    public abstract boolean jb9XjC4I(WYNAV5pd wYNAV5pd, Object obj, Object obj2);

    public abstract boolean wxUZMvaN(Object obj, Object obj2);
}
