package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import androidx.media3.session.i;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes5.dex */
public class x0 implements u97, b97, n7a, oc5, i6s, kzc, wpd, uno {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public x0(IntRange intRange, vut vutVar) {
        this.a = 22;
        x0 G = vutVar.G();
        int i = intRange.a;
        if (i < 0) {
            vme.c("negative nearestRange.first");
        }
        int min = Math.min(intRange.b, G.b - 1);
        if (min < i) {
            cpi cpiVar = uhj.a;
            cpiVar.getClass();
            this.c = cpiVar;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        cpi cpiVar2 = new cpi(i2);
        q30 q30Var = new q30(i, min, cpiVar2, this);
        eqi eqiVar = (eqi) G.c;
        if (i < 0 || i >= G.b) {
            StringBuilder q = k5r.q(i, "Index ", ", size ");
            q.append(G.b);
            vme.e(q.toString());
        }
        if (min < 0 || min >= G.b) {
            StringBuilder q2 = k5r.q(min, "Index ", ", size ");
            q2.append(G.b);
            vme.e(q2.toString());
        }
        if (min < i) {
            vme.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int j = xp3.j(i, eqiVar);
        int i3 = ((dxe) eqiVar.a[j]).a;
        while (i3 <= min) {
            dxe dxeVar = (dxe) eqiVar.a[j];
            q30Var.invoke(dxeVar);
            i3 += dxeVar.b;
            j++;
        }
        this.c = cpiVar2;
    }

    public static void I(x0 x0Var, int i, int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = (long[]) x0Var.c;
        int i7 = x0Var.b;
        int i8 = i7 + 3;
        x0Var.b = i8;
        int length = jArr.length;
        if (length <= i8) {
            int max = Math.max(length * 2, i8);
            x0Var.c = Arrays.copyOf(jArr, max);
            x0Var.d = Arrays.copyOf((long[]) x0Var.d, max);
        }
        long[] jArr2 = (long[]) x0Var.c;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i5 & 4294967295L) | (i4 << 32);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d9, code lost:
    
        if (r9.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r0 = new defpackage.xr3(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f4, code lost:
    
        if (r10 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f7, code lost:
    
        if (r10 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ff, code lost:
    
        if (r13 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0201, code lost:
    
        if (r13 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0203, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0218, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r24, r25, r16, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025b, code lost:
    
        return new defpackage.x0(r12, (java.lang.Object) null, 0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0212, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021c, code lost:
    
        r12 = new android.graphics.SweepGradient(r8, r12, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022b, code lost:
    
        if (r23 <= 0.0f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022d, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0235, code lost:
    
        if (r13 == 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0237, code lost:
    
        if (r13 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0239, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024e, code lost:
    
        r12 = new android.graphics.RadialGradient(r8, r12, r23, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0248, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024b, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0263, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e6, code lost:
    
        if (r19 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        r0 = new defpackage.xr3(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ee, code lost:
    
        r0 = new defpackage.xr3(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e1, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x0 w(int i, Resources.Theme theme, Resources resources) {
        int next;
        float f;
        int i2;
        float f2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i3 = 3;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b = o95.b(resources, xml, asAttributeSet, theme);
                return new x0(obj, b, b.getDefaultColor(), i3);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray I = pcg.I(resources, theme, asAttributeSet, een.d);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? I.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? I.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? I.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? I.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? I.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? I.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? I.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? I.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? I.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? I.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f3;
            i2 = I.getInt(6, 0);
        } else {
            f = f3;
            i2 = 0;
        }
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? I.getFloat(5, 0.0f) : 0.0f;
        I.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f11 = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray I2 = pcg.I(resources, theme, asAttributeSet, een.e);
                boolean hasValue = I2.hasValue(0);
                boolean hasValue2 = I2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = I2.getColor(0, 0);
                float f12 = I2.getFloat(1, 0.0f);
                I2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f4 = f11;
            f5 = f2;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public int A(Object obj) {
        cpi cpiVar = (cpi) this.c;
        int d = cpiVar.d(obj);
        if (d >= 0) {
            return cpiVar.c[d];
        }
        return -1;
    }

    @Override // defpackage.uno
    public long B() {
        u();
        di3 di3Var = (di3) this.d;
        return di3Var.a[this.b + 1];
    }

    public Object C(int i) {
        Object[] objArr = (Object[]) this.d;
        int i2 = i - this.b;
        if (i2 < 0 || i2 > xz0.D(objArr)) {
            return null;
        }
        return objArr[i2];
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        ((Function2) this.d).invoke(Integer.valueOf(this.b), oqVar);
    }

    public String E() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof mhp) {
                mhp mhpVar = (mhp) obj;
                boolean d = Intrinsics.d(mhpVar.a(), emr.c);
                int[] iArr = (int[]) this.d;
                if (!d) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(mhpVar.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != ofc.g) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public djo F(int i, String str, Map map, Uri uri) {
        rio rioVar = (rio) this.d;
        String str2 = rioVar.c;
        int i2 = this.b;
        this.b = i2 + 1;
        z6n z6nVar = new z6n(str2, str, i2);
        if (rioVar.n != null) {
            vq1.B(rioVar.j);
            try {
                z6nVar.a("Authorization", rioVar.n.w(rioVar.j, uri, i));
            } catch (r7k e) {
                rio.a(rioVar, new pg5(e));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            z6nVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new djo(uri, i, new sio(z6nVar), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x0049, B:13:0x006b, B:15:0x0071, B:17:0x0079, B:19:0x0088, B:20:0x008b), top: B:11:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable G(cg6 cg6Var) {
        ihc ihcVar;
        int i;
        x0 x0Var;
        qqi qqiVar;
        try {
            if (cg6Var instanceof ihc) {
                ihcVar = (ihc) cg6Var;
                int i2 = ihcVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ihcVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = ihcVar.l;
                    nm6 nm6Var = nm6.a;
                    i = ihcVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = (qqi) this.d;
                        ihcVar.j = this;
                        ihcVar.k = qqiVar2;
                        ihcVar.n = 1;
                        if (qqiVar2.a(ihcVar) == nm6Var) {
                            return nm6Var;
                        }
                        x0Var = this;
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = ihcVar.k;
                        x0Var = ihcVar.j;
                        qgg.h0(obj);
                    }
                    List b = ((khc) x0Var.c).b();
                    int size = (x0Var.b - b.size()) + 1;
                    List list = b;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList.add(new IndexedValue(i3 + size, (g1k) obj2));
                        i3 = i4;
                    }
                    qqiVar.b(null);
                    return arrayList;
                }
            }
            List b2 = ((khc) x0Var.c).b();
            int size2 = (x0Var.b - b2.size()) + 1;
            List list2 = b2;
            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
            int i32 = 0;
            while (r2.hasNext()) {
            }
            qqiVar.b(null);
            return arrayList2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        ihcVar = new ihc(this, cg6Var);
        Object obj3 = ihcVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ihcVar.n;
        if (i != 0) {
        }
    }

    public d0 H(int i) {
        z0 B;
        byte[][] bArr = (byte[][]) this.d;
        int i2 = this.b;
        r5g r5gVar = (r5g) this.c;
        if (r5gVar instanceof nie) {
            nie nieVar = (nie) r5gVar;
            nieVar.f = false;
            nieVar.b();
        }
        int D = i0.D(i, r5gVar);
        int i3 = 4;
        int o = i0.o(r5gVar, i2, D == 3 || D == 4 || D == 16 || D == 17 || D == 8);
        if (o < 0) {
            if ((i & 32) == 0) {
                kac.f("indefinite-length primitive encoding encountered");
                return null;
            }
            x0 x0Var = new x0(new nie(i2, r5gVar), i2, bArr, 0);
            int i4 = i & 192;
            if (i4 != 0) {
                return 64 == i4 ? new bi2(64, D, x0Var) : new li2(i4, D, x0Var);
            }
            if (D == 3) {
                return new di2(x0Var);
            }
            if (D == 4) {
                return new gi2(x0Var);
            }
            if (D == 8) {
                return new ii2(x0Var);
            }
            if (D == 16) {
                ii2 ii2Var = new ii2(0);
                ii2Var.b = x0Var;
                return ii2Var;
            }
            if (D != 17) {
                wb8.i(Integer.toHexString(D), "unknown BER object encountered: 0x");
                return null;
            }
            ii2 ii2Var2 = new ii2(1);
            ii2Var2.b = x0Var;
            return ii2Var2;
        }
        uu7 uu7Var = new uu7(r5gVar, o, i2);
        if ((i & 224) == 0) {
            if (D == 3) {
                return new c67(uu7Var);
            }
            if (D == 4) {
                gi2 gi2Var = new gi2();
                gi2Var.b = uu7Var;
                return gi2Var;
            }
            if (D == 8) {
                throw new g0("externals must use constructed encoding (see X.690 8.18)");
            }
            if (D == 16) {
                throw new g0("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (D == 17) {
                throw new g0("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return i0.b(D, uu7Var, bArr);
            } catch (IllegalArgumentException e) {
                throw new g0("corrupted stream detected", e);
            }
        }
        x0 x0Var2 = new x0(uu7Var, uu7Var.b, bArr, 0);
        int i5 = i & 192;
        if (i5 != 0) {
            boolean z = (i & 32) != 0;
            if (64 != i5) {
                return new g67(i5, D, z, x0Var2);
            }
            if (z) {
                B = z0.B(i5, D, x0Var2.X());
            } else {
                B = new ki2(i3, i5, D, new a07(uu7Var.b()), 2);
                if (i5 == 64) {
                    B = new a67(B);
                }
            }
            return (a67) B;
        }
        if (D == 3) {
            return new di2(x0Var2);
        }
        if (D == 4) {
            return new gi2(x0Var2);
        }
        if (D == 8) {
            return new ii2(x0Var2);
        }
        if (D == 16) {
            ii2 ii2Var3 = new ii2(3);
            ii2Var3.b = x0Var2;
            return ii2Var3;
        }
        if (D != 17) {
            wb8.i(Integer.toHexString(D), "unknown DL object encountered: 0x");
            return null;
        }
        ii2 ii2Var4 = new ii2(4);
        ii2Var4.b = x0Var2;
        return ii2Var4;
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        ((Function2) this.c).invoke(Integer.valueOf(this.b), oqVar);
    }

    public boolean K() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void L(cfg cfgVar, int i, int i2, dsc dscVar, int i3, Object obj, long j, long j2) {
        x(new yvh(this, cfgVar, new boh(i, i2, dscVar, i3, obj, dvt.m0(j), dvt.m0(j2)), 1));
    }

    public void M(cfg cfgVar, int i) {
        N(cfgVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void N(cfg cfgVar, int i, int i2, dsc dscVar, int i3, Object obj, long j, long j2) {
        x(new yvh(this, cfgVar, new boh(i, i2, dscVar, i3, obj, dvt.m0(j), dvt.m0(j2)), 0));
    }

    public void O(cfg cfgVar, int i, int i2, dsc dscVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        x(new fj7(this, cfgVar, new boh(i, i2, dscVar, i3, obj, dvt.m0(j), dvt.m0(j2)), iOException, z));
    }

    public void P(cfg cfgVar, int i, IOException iOException, boolean z) {
        O(cfgVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        om3 om3Var2 = (om3) this.d;
        do {
            om3Var.g(om3Var2, Math.min(om3Var.c, this.b - om3Var2.c));
            if (this.b > om3Var2.c) {
                return;
            }
            u97 u97Var = (u97) this.c;
            this.c = null;
            u97Var.Q(aa7Var, om3Var2);
        } while (((u97) this.c) != null);
    }

    public void R(cfg cfgVar, int i, int i2, dsc dscVar, int i3, Object obj, long j, long j2, int i4) {
        x(new sj7(this, cfgVar, new boh(i, i2, dscVar, i3, obj, dvt.m0(j), dvt.m0(j2)), i4));
    }

    public z0 S(int i, int i2) {
        int i3;
        ki2 ki2Var;
        e0 X = X();
        int i4 = X.c;
        int i5 = 0;
        if (i4 == 1) {
            i3 = i;
            ki2Var = new ki2(3, i3, i2, X.g(0), 0);
        } else {
            hi2 hi2Var = ei2.a;
            i3 = i;
            ki2Var = new ki2(4, i, i2, i4 < 1 ? ei2.a : new hi2(X), 0);
        }
        return i3 != 64 ? ki2Var : new ai2(ki2Var, i5);
    }

    public void T(String str) {
        int i = this.b;
        if (i > 1) {
            g0c g0cVar = (g0c) this.d;
            String str2 = (String) this.c;
            String o = ouj.o(ouj.o(k5r.i(i, "Был сделан повторный запрос в дайхард: количество попыток - "), ", результат - ", str), ", request = ", str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put(ServiceCommand.TYPE_REQ, new jkr(str2));
            linkedHashMap.put("attempts", new oqe(i, false));
            linkedHashMap.put(CameraService.RESULT, new jkr(str));
            vtm k = su4.k(o, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(k, "event_name", "retry_diehard_request", "retry_diehard_request", k);
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(j);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0120, code lost:
    
        r0 = defpackage.ptw.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0123, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0126, code lost:
    
        r0 = r0[r18];
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0167, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0064, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object U(StringReader stringReader) {
        int i;
        char c;
        int i2;
        int read;
        int i3;
        ez6 ez6Var;
        ez6 ez6Var2;
        Object obj;
        int i4;
        String str;
        int i5;
        ptw ptwVar = (ptw) this.c;
        ptwVar.a = stringReader;
        int i6 = 0;
        ptwVar.j = false;
        ptwVar.g = 0;
        ptwVar.h = 0;
        ptwVar.e = 0;
        ptwVar.f = 0;
        ptwVar.i = 0;
        ptwVar.c = 0;
        this.d = null;
        this.b = 0;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        while (true) {
            StringBuffer stringBuffer = ptwVar.k;
            int i7 = ptwVar.h;
            char[] cArr = ptwVar.d;
            char[] cArr2 = ptw.m;
            int[] iArr = ptw.p;
            int[] iArr2 = ptw.o;
            int[] iArr3 = ptw.r;
            while (true) {
                int i8 = ptwVar.e;
                ptwVar.i = (i8 - ptwVar.g) + ptwVar.i;
                ptwVar.g = i8;
                ptwVar.f = i8;
                ptwVar.b = ptw.l[ptwVar.c];
                char c2 = 65535;
                int i9 = i8;
                int i10 = -1;
                while (true) {
                    if (i8 < i7) {
                        int i11 = i8 + 1;
                        c = cArr[i8];
                        i3 = i11;
                    } else if (ptwVar.j) {
                        i = i6;
                    } else {
                        ptwVar.f = i8;
                        ptwVar.e = i9;
                        int i12 = ptwVar.g;
                        if (i12 > 0) {
                            char[] cArr3 = ptwVar.d;
                            System.arraycopy(cArr3, i12, cArr3, i6, ptwVar.h - i12);
                            int i13 = ptwVar.h;
                            int i14 = ptwVar.g;
                            ptwVar.h = i13 - i14;
                            ptwVar.f -= i14;
                            ptwVar.e -= i14;
                            ptwVar.g = i6;
                        }
                        int i15 = ptwVar.f;
                        char[] cArr4 = ptwVar.d;
                        if (i15 >= cArr4.length) {
                            char[] cArr5 = new char[i15 * 2];
                            System.arraycopy(cArr4, i6, cArr5, i6, cArr4.length);
                            ptwVar.d = cArr5;
                        }
                        StringReader stringReader2 = ptwVar.a;
                        char[] cArr6 = ptwVar.d;
                        int i16 = ptwVar.h;
                        int read2 = stringReader2.read(cArr6, i16, cArr6.length - i16);
                        if (read2 > 0) {
                            ptwVar.h += read2;
                        } else if (read2 != 0 || (read = ptwVar.a.read()) == c2) {
                            i2 = 1;
                            int i17 = ptwVar.f;
                            i9 = ptwVar.e;
                            cArr = ptwVar.d;
                            int i18 = ptwVar.h;
                            if (i2 == 0) {
                                i = i6;
                                i7 = i18;
                            } else {
                                i3 = i17 + 1;
                                c = cArr[i17];
                                i7 = i18;
                            }
                        } else {
                            char[] cArr7 = ptwVar.d;
                            int i19 = ptwVar.h;
                            ptwVar.h = i19 + 1;
                            cArr7[i19] = (char) read;
                        }
                        i2 = i6;
                        int i172 = ptwVar.f;
                        i9 = ptwVar.e;
                        cArr = ptwVar.d;
                        int i182 = ptwVar.h;
                        if (i2 == 0) {
                        }
                    }
                    i = i6;
                    int i20 = iArr[iArr2[ptwVar.b] + cArr2[c]];
                    if (i20 != c2) {
                        ptwVar.b = i20;
                        int i21 = iArr3[i20];
                        if ((i21 & 1) == 1) {
                            i9 = i3;
                            i10 = i20;
                            if ((i21 & 8) == 8) {
                            }
                        }
                        c2 = 65535;
                        i8 = i3;
                        i6 = i;
                    }
                }
                ptwVar.e = i9;
                if (i10 >= 0) {
                    i10 = ptw.n[i10];
                }
                switch (i10) {
                    case 1:
                        throw new f7k(ptwVar.i, 0, new Character(ptwVar.d[ptwVar.g]));
                    case 2:
                        ez6Var = new ez6(i, Long.valueOf(ptwVar.a()));
                        break;
                    case 3:
                    case 26:
                    case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    case 29:
                    case 30:
                    case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    case 35:
                    case 38:
                    case 40:
                    case 42:
                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                        i5 = i;
                        i6 = i5;
                    case 4:
                        i5 = 0;
                        stringBuffer.delete(0, stringBuffer.length());
                        ptwVar.c = 2;
                        i6 = i5;
                    case 5:
                        ez6Var2 = new ez6(1, null);
                        break;
                    case 6:
                        ez6Var2 = new ez6(2, null);
                        break;
                    case 7:
                        ez6Var2 = new ez6(3, null);
                        break;
                    case 8:
                        ez6Var2 = new ez6(4, null);
                        break;
                    case 9:
                        ez6Var2 = new ez6(5, null);
                        break;
                    case 10:
                        ez6Var2 = new ez6(6, null);
                        break;
                    case 11:
                        stringBuffer.append(ptwVar.a());
                        i5 = 0;
                        i6 = i5;
                    case 12:
                        stringBuffer.append('\\');
                        i5 = 0;
                        i6 = i5;
                    case 13:
                        int i22 = i;
                        ptwVar.c = i22;
                        ez6Var = new ez6(i22, stringBuffer.toString());
                        break;
                    case 14:
                        stringBuffer.append('\"');
                        i5 = 0;
                        i6 = i5;
                    case 15:
                        stringBuffer.append('/');
                        i5 = 0;
                        i6 = i5;
                    case 16:
                        stringBuffer.append('\b');
                        i5 = 0;
                        i6 = i5;
                    case 17:
                        stringBuffer.append('\f');
                        i5 = 0;
                        i6 = i5;
                    case 18:
                        stringBuffer.append('\n');
                        i5 = 0;
                        i6 = i5;
                    case 19:
                        stringBuffer.append('\r');
                        i5 = 0;
                        i6 = i5;
                    case 20:
                        stringBuffer.append('\t');
                        i5 = 0;
                        i6 = i5;
                    case 21:
                        ez6Var = new ez6(i, Double.valueOf(ptwVar.a()));
                        break;
                    case 22:
                        ez6Var2 = new ez6(i, null);
                        break;
                    case 23:
                        ez6Var = new ez6(i, Boolean.valueOf(ptwVar.a()));
                        break;
                    case 24:
                        try {
                            stringBuffer.append((char) Integer.parseInt(ptwVar.a().substring(2), 16));
                            i5 = i;
                            i6 = i5;
                        } catch (Exception e) {
                            throw new f7k(ptwVar.i, 2, e);
                        }
                    case 25:
                    case 27:
                    case 32:
                    case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 39:
                    case 41:
                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                        i5 = 0;
                        i6 = i5;
                    default:
                        if (c == 65535 && ptwVar.g == ptwVar.f) {
                            ptwVar.j = true;
                            ez6Var = null;
                            break;
                        }
                        break;
                }
            }
            this.d = ez6Var;
            if (ez6Var == null) {
                obj = null;
                i4 = -1;
                this.d = new ez6(-1, null);
            } else {
                obj = null;
                i4 = -1;
            }
            int i23 = this.b;
            if (i23 == i4) {
                throw new f7k(ptwVar.i, 1, (ez6) this.d);
            }
            if (i23 == 0) {
                int i24 = ((ez6) this.d).b;
                if (i24 == 0) {
                    this.b = 1;
                    linkedList.addFirst(new Integer(1));
                    linkedList2.addFirst(((ez6) this.d).c);
                } else if (i24 == 1) {
                    this.b = 2;
                    linkedList.addFirst(new Integer(2));
                    linkedList2.addFirst(new HashMap());
                } else if (i24 != 3) {
                    this.b = -1;
                } else {
                    this.b = 3;
                    linkedList.addFirst(new Integer(3));
                    linkedList2.addFirst(new ArrayList());
                }
            } else {
                if (i23 == 1) {
                    if (((ez6) this.d).b == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new f7k(ptwVar.i, 1, (ez6) this.d);
                }
                if (i23 == 2) {
                    ez6 ez6Var3 = (ez6) this.d;
                    int i25 = ez6Var3.b;
                    if (i25 == 0) {
                        Object obj2 = ez6Var3.c;
                        if (obj2 instanceof String) {
                            linkedList2.addFirst((String) obj2);
                            this.b = 4;
                            linkedList.addFirst(new Integer(4));
                        } else {
                            this.b = -1;
                        }
                    } else if (i25 != 2) {
                        if (i25 != 5) {
                            this.b = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.b = linkedList.size() == 0 ? -1 : ((Integer) linkedList.getFirst()).intValue();
                    } else {
                        this.b = 1;
                    }
                } else if (i23 == 3) {
                    int i26 = ((ez6) this.d).b;
                    if (i26 == 0) {
                        ((List) linkedList2.getFirst()).add(((ez6) this.d).c);
                    } else if (i26 == 1) {
                        List list = (List) linkedList2.getFirst();
                        HashMap hashMap = new HashMap();
                        list.add(hashMap);
                        this.b = 2;
                        linkedList.addFirst(new Integer(2));
                        linkedList2.addFirst(hashMap);
                    } else if (i26 == 3) {
                        List list2 = (List) linkedList2.getFirst();
                        ArrayList arrayList = new ArrayList();
                        list2.add(arrayList);
                        this.b = 3;
                        linkedList.addFirst(new Integer(3));
                        linkedList2.addFirst(arrayList);
                    } else if (i26 != 4) {
                        if (i26 != 5) {
                            this.b = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.b = linkedList.size() == 0 ? -1 : ((Integer) linkedList.getFirst()).intValue();
                    } else {
                        this.b = 1;
                    }
                } else if (i23 == 4) {
                    int i27 = ((ez6) this.d).b;
                    if (i27 == 0) {
                        linkedList.removeFirst();
                        ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), ((ez6) this.d).c);
                        this.b = linkedList.size() == 0 ? -1 : ((Integer) linkedList.getFirst()).intValue();
                    } else if (i27 == 1) {
                        linkedList.removeFirst();
                        String str2 = (String) linkedList2.removeFirst();
                        Map map = (Map) linkedList2.getFirst();
                        HashMap hashMap2 = new HashMap();
                        map.put(str2, hashMap2);
                        this.b = 2;
                        linkedList.addFirst(new Integer(2));
                        linkedList2.addFirst(hashMap2);
                    } else if (i27 == 3) {
                        linkedList.removeFirst();
                        String str3 = (String) linkedList2.removeFirst();
                        Map map2 = (Map) linkedList2.getFirst();
                        ArrayList arrayList2 = new ArrayList();
                        map2.put(str3, arrayList2);
                        this.b = 3;
                        linkedList.addFirst(new Integer(3));
                        linkedList2.addFirst(arrayList2);
                    } else if (i27 != 6) {
                        this.b = -1;
                    }
                }
            }
            if (this.b == -1) {
                throw new f7k(ptwVar.i, 1, (ez6) this.d);
            }
            if (((ez6) this.d).b == -1) {
                throw new f7k(ptwVar.i, 1, (ez6) this.d);
            }
            i6 = 0;
        }
        throw new Error(str);
    }

    public x0 V(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, pde.e(objArr.length, i));
        }
        hld.v(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public void W(int i, u97 u97Var) {
        this.b = i;
        this.c = u97Var;
        ((om3) this.d).n();
    }

    public e0 X() {
        r5g r5gVar = (r5g) this.c;
        int read = r5gVar.read();
        if (read < 0) {
            return new e0(0);
        }
        e0 e0Var = new e0(0, (byte) 0);
        do {
            d0 H = H(read);
            if (H instanceof xge) {
                e0Var.e(((xge) H).m());
            } else {
                e0Var.e(H.n());
            }
            read = r5gVar.read();
        } while (read >= 0);
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Y(IndexedValue indexedValue, cg6 cg6Var) {
        jhc jhcVar;
        int i;
        qqi qqiVar;
        x0 x0Var;
        try {
            if (cg6Var instanceof jhc) {
                jhcVar = (jhc) cg6Var;
                int i2 = jhcVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jhcVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = jhcVar.m;
                    nm6 nm6Var = nm6.a;
                    i = jhcVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.d;
                        jhcVar.j = this;
                        jhcVar.k = indexedValue;
                        jhcVar.l = qqiVar;
                        jhcVar.o = 1;
                        if (qqiVar.a(jhcVar) == nm6Var) {
                            return nm6Var;
                        }
                        x0Var = this;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = jhcVar.l;
                        IndexedValue indexedValue2 = jhcVar.k;
                        x0Var = jhcVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        indexedValue = indexedValue2;
                    }
                    x0Var.b = indexedValue.a;
                    ((khc) x0Var.c).a((g1k) indexedValue.b);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            x0Var.b = indexedValue.a;
            ((khc) x0Var.c).a((g1k) indexedValue.b);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        jhcVar = new jhc(this, cg6Var);
        Object obj2 = jhcVar.m;
        nm6 nm6Var2 = nm6.a;
        i = jhcVar.o;
        if (i != 0) {
        }
    }

    public void Z(String[] strArr, ukk ukkVar) {
        int i;
        strArr.getClass();
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.c;
        if (strArr.length != 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && oVar.requireActivity().checkSelfPermission(str) != 0) {
                    i = this.b;
                    this.b = i + 1;
                    oVar.requestPermissions(strArr, i);
                    break;
                }
            }
        }
        i = -1;
        if (i == -1) {
            ukkVar.i(xz0.X(strArr));
        } else {
            ((SparseArray) this.d).put(i, new vkk(ukkVar));
        }
    }

    @Override // defpackage.b97
    public void a(mvt mvtVar) {
        bz2 bz2Var = (bz2) this.d;
        bz2Var.getClass();
        bz2Var.c = mvtVar;
    }

    public void a0() {
        int i = this.b * 2;
        this.c = Arrays.copyOf((Object[]) this.c, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        uz0.h(0, 0, 14, (int[]) this.d, iArr);
        this.d = iArr;
    }

    @Override // defpackage.b97
    public void b() {
        ((bz2) this.d).getClass();
    }

    public void b0() {
        vq1.B((djo) this.c);
        zde zdeVar = ((djo) this.c).c.a;
        HashMap hashMap = new HashMap();
        for (String str : zdeVar.d.keySet()) {
            if (!str.equals("CSeq") && !str.equals(HttpMessage.USER_AGENT) && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) ild.x(zdeVar.d(str)));
            }
        }
        djo djoVar = (djo) this.c;
        c0(F(djoVar.b, ((rio) this.d).k, hashMap, djoVar.a));
    }

    @Override // defpackage.b97
    public void c(boolean z) {
        ((bz2) this.d).b = z;
    }

    public void c0(djo djoVar) {
        String b = djoVar.c.b("CSeq");
        b.getClass();
        int parseInt = Integer.parseInt(b);
        rio rioVar = (rio) this.d;
        SparseArray sparseArray = rioVar.f;
        vq1.A(sparseArray.get(parseInt) == null);
        sparseArray.append(parseInt, djoVar);
        rioVar.i.b(cjo.g(djoVar));
        this.c = djoVar;
    }

    @Override // defpackage.b97
    public c97 d(ogg oggVar, d97 d97Var, kkp kkpVar, int i, int[] iArr, zsb zsbVar, int i2, long j, boolean z, ArrayList arrayList, pcl pclVar, t6t t6tVar, ndl ndlVar) {
        db7 a = ((va7) this.c).a();
        if (t6tVar != null) {
            a.q(t6tVar);
        }
        return new wk7((bz2) this.d, oggVar, d97Var, kkpVar, i, iArr, zsbVar, i2, a, j, this.b, z, arrayList, pclVar);
    }

    public void d0() {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.c;
        if (u()) {
            return;
        }
        while (this.b < atomicIntegerArray.length() && atomicIntegerArray.get(this.b) == 0) {
            this.b++;
        }
    }

    @Override // defpackage.oc5
    public void e(x1u x1uVar) {
        x1uVar.getClass();
        ((Function1) this.d).invoke(x1uVar);
    }

    public void e0(int i, long j, long j2) {
        boh bohVar = new boh(1, i, null, 3, null, dvt.m0(j), dvt.m0(j2));
        uvh uvhVar = (uvh) this.c;
        uvhVar.getClass();
        x(new u13(13, this, uvhVar, bohVar));
    }

    public void f0(int i, ryc rycVar) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                rycVar.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    @Override // defpackage.uno
    public boolean g() {
        u();
        return true;
    }

    @Override // defpackage.uno
    public int getCount() {
        u();
        return ((AtomicIntegerArray) this.c).get(this.b);
    }

    @Override // defpackage.oc5
    public void i(x1u x1uVar) {
        x1uVar.getClass();
        ((Function2) this.c).invoke(x1uVar, Integer.valueOf(this.b));
    }

    @Override // defpackage.i6s
    public void j(Drawable drawable) {
        xqn xqnVar = (xqn) this.c;
        r2f r2fVar = (r2f) xqnVar.a;
        Continuation continuation = null;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        ltm ltmVar = (ltm) this.d;
        xqnVar.a = x97.y(ltmVar, null, null, new rs(ltmVar, drawable, this.b, continuation, 5), 3);
    }

    @Override // defpackage.oc5
    public void k(x1u x1uVar, boolean z) {
        x1uVar.getClass();
    }

    @Override // defpackage.b97
    public dsc l(dsc dscVar) {
        bz2 bz2Var = (bz2) this.d;
        if (!bz2Var.b || !((mvt) bz2Var.c).d(dscVar)) {
            return dscVar;
        }
        bsc a = dscVar.a();
        String str = dscVar.k;
        a.m = l5i.p("application/x-media3-cues");
        a.I = ((mvt) bz2Var.c).l(dscVar);
        StringBuilder sb = new StringBuilder();
        sb.append(dscVar.n);
        sb.append(str != null ? StringUtil.SPACE.concat(str) : "");
        a.j = sb.toString();
        a.r = Long.MAX_VALUE;
        return new dsc(a);
    }

    @Override // defpackage.n7a
    public void m(u51 u51Var) {
        a8a a8aVar = (a8a) this.c;
        int i = this.b;
        m7a m7aVar = (m7a) this.d;
        a8aVar.getClass();
        m7aVar.getClass();
        rmb.j(a8aVar.a, wjb.ArtistScreen, vnj.j(m7aVar, i, 0), null, 12);
        oa1 oa1Var = a8aVar.b;
        u51 u51Var2 = m7aVar.c;
        int i2 = ArtistScreenActivity.w0;
        Activity activity = oa1Var.a;
        activity.startActivity(l48.p(activity, u51Var2, null, null, 24));
    }

    public void n(int i, itf itfVar) {
        if (i < 0) {
            vme.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        dxe dxeVar = new dxe(this.b, i, itfVar);
        this.b += i;
        ((eqi) this.c).d(dxeVar);
    }

    @Override // defpackage.uno
    public void next() {
        u();
        this.b++;
        d0();
    }

    public ce2 o() {
        if ("".isEmpty()) {
            return new ce2((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        xq0.q("Missing required properties:".concat(""));
        return null;
    }

    @Override // defpackage.kzc
    public void onSuccess(Object obj) {
        i iVar = ((sth) this.d).h;
        Handler handler = iVar.l;
        wrh wrhVar = (wrh) this.c;
        dvt.c0(handler, new juc(iVar, wrhVar, new kv0(this, this.b, (List) obj, wrhVar)));
    }

    public cee r() {
        aee aeeVar = (aee) this.d;
        if (aeeVar != null) {
            throw aeeVar.a();
        }
        vsn g = vsn.g(this.b, (Object[]) this.c, this);
        aee aeeVar2 = (aee) this.d;
        if (aeeVar2 == null) {
            return g;
        }
        throw aeeVar2.a();
    }

    @Override // defpackage.uno
    public int s() {
        u();
        return this.b;
    }

    @Override // defpackage.uno
    public int t() {
        u();
        di3 di3Var = (di3) this.d;
        return di3Var.a[this.b];
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return E();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uno
    public boolean u() {
        return this.b >= ((AtomicIntegerArray) this.c).length();
    }

    @Override // defpackage.n7a
    public void v(m7a m7aVar) {
        m7aVar.getClass();
        a8a a8aVar = (a8a) this.c;
        int i = this.b;
        a8aVar.getClass();
        rmb rmbVar = a8aVar.a;
        String str = m7aVar.a;
        rmb.k(rmbVar, str, vnj.j(m7aVar, i, 0), null, 4);
        oa1 oa1Var = a8aVar.b;
        jyr jyrVar = y7a.a;
        y7a.a(oa1Var.a, str, false);
    }

    public void x(ua6 ua6Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            awh awhVar = (awh) it.next();
            dvt.c0(awhVar.a, new zvh(0, ua6Var, awhVar.b));
        }
    }

    public void y(int i, dsc dscVar, int i2, Object obj, long j) {
        x(new suh(3, this, new boh(1, i, dscVar, i2, obj, dvt.m0(j), -9223372036854775807L)));
    }

    public dxe z(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder q = k5r.q(i, "Index ", ", size ");
            q.append(this.b);
            vme.e(q.toString());
        }
        dxe dxeVar = (dxe) this.d;
        if (dxeVar != null) {
            int i2 = dxeVar.a;
            if (i < dxeVar.b + i2 && i2 <= i) {
                return dxeVar;
            }
        }
        eqi eqiVar = (eqi) this.c;
        dxe dxeVar2 = (dxe) eqiVar.a[xp3.j(i, eqiVar)];
        this.d = dxeVar2;
        return dxeVar2;
    }

    @Override // defpackage.i6s
    public void f(Drawable drawable) {
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
    }

    @Override // defpackage.i6s
    public void p(Drawable drawable) {
    }

    public /* synthetic */ x0(int i, Object obj, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = serializable;
    }

    public /* synthetic */ x0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ x0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public x0(AtomicIntegerArray atomicIntegerArray, di3 di3Var) {
        this.a = 29;
        atomicIntegerArray.getClass();
        di3Var.getClass();
        this.c = atomicIntegerArray;
        this.d = di3Var;
        atomicIntegerArray.length();
        d0();
    }

    public x0(androidx.fragment.app.o oVar) {
        this.a = 24;
        oVar.getClass();
        this.c = oVar;
        this.d = new SparseArray();
    }

    public x0(int i, byte b) {
        this.a = i;
        switch (i) {
            case 9:
                this.c = new khc();
                this.d = rqi.a();
                this.b = -1;
                break;
            case 20:
                this.c = new eqi(new dxe[16]);
                break;
            default:
                this.d = new om3();
                break;
        }
    }

    public x0(String str, g0c g0cVar) {
        this.a = 6;
        g0cVar.getClass();
        this.c = str;
        this.d = g0cVar;
    }

    public /* synthetic */ x0(char c, int i) {
        this.a = i;
    }

    public x0(int i, int[] iArr, String str) {
        this.a = 23;
        iArr.getClass();
        this.b = i;
        this.c = iArr;
        this.d = str;
    }

    public x0(ArrayList arrayList, qdc qdcVar) {
        this.a = 13;
        this.c = qdcVar;
        y7g.Y(false, qdcVar);
        this.d = new ArrayList(arrayList);
    }

    public x0(va7 va7Var) {
        this.a = 5;
        this.d = new bz2(2);
        this.c = va7Var;
        this.b = 1;
    }

    public x0(CopyOnWriteArrayList copyOnWriteArrayList, int i, uvh uvhVar) {
        this.a = 19;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = uvhVar;
    }

    public x0(rio rioVar) {
        this.a = 27;
        this.d = rioVar;
    }

    public x0(aeu aeuVar) {
        this.a = 2;
        this.c = aeuVar;
    }

    public x0(int i) {
        this.a = 11;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public x0(u76 u76Var) {
        this.a = 8;
        this.d = irf.U(150, new xzi(this));
        this.c = u76Var;
    }

    public x0(sth sthVar, wrh wrhVar, int i) {
        this.a = 18;
        this.d = sthVar;
        this.c = wrhVar;
        this.b = i;
    }
}
