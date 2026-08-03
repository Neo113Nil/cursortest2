package e3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParserException;
import s.u;
import v.g0;
import v.w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2090a;

    /* renamed from: b, reason: collision with root package name */
    public int f2091b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2092c;

    public /* synthetic */ j(int i10, int i11, Object obj) {
        this.f2090a = i11;
        this.f2092c = obj;
        this.f2091b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new x4.s(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f8356h;
        r17 = (float[]) r0.f8357i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new e3.j(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f8356h, (float[]) r0.f8357i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f8356h;
        r21 = (float[]) r0.f8357i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new x4.s(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new x4.s(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j d(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        XmlResourceParser xml = resources.getXml(i10);
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
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b2 = z2.c.b(resources, xml, asAttributeSet, theme);
                return new j((Shader) null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray e10 = z2.b.e(resources, theme, asAttributeSet, w2.a.f7645e);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? e10.getFloat(8, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? e10.getFloat(9, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? e10.getFloat(10, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? e10.getFloat(11, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? e10.getFloat(3, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? e10.getFloat(4, 0.0f) : 0.0f;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY) != null ? e10.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? e10.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? e10.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f10 = f13;
            i11 = e10.getColor(1, 0);
        } else {
            f10 = f13;
            i11 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f11 = f14;
            i12 = e10.getInt(6, 0);
        } else {
            f11 = f14;
            i12 = 0;
        }
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? e10.getFloat(5, 0.0f) : 0.0f;
        e10.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f20 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f21 = f15;
            if (next2 == 1) {
                f12 = f16;
                break;
            }
            int depth2 = xml.getDepth();
            f12 = f16;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray e11 = z2.b.e(resources, theme, asAttributeSet, w2.a.f7646f);
                boolean hasValue = e11.hasValue(0);
                boolean hasValue2 = e11.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = e11.getColor(0, 0);
                float f22 = e11.getFloat(1, 0.0f);
                e11.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f22));
            }
            f15 = f21;
            f16 = f12;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void a(long j3) {
        if (c(j3)) {
            return;
        }
        int i10 = this.f2091b;
        long[] jArr = (long[]) this.f2092c;
        if (i10 >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            pc.j.d(jArr, "copyOf(...)");
            this.f2092c = jArr;
        }
        jArr[i10] = j3;
        if (i10 >= this.f2091b) {
            this.f2091b = i10 + 1;
        }
    }

    public g0 b(Float f10, int i10) {
        g0 g0Var = new g0(f10, w.f7003b);
        ((u) this.f2092c).h(i10, g0Var);
        return g0Var;
    }

    public boolean c(long j3) {
        int i10 = this.f2091b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((long[]) this.f2092c)[i11] == j3) {
                return true;
            }
        }
        return false;
    }

    public void e(long j3) {
        int i10 = this.f2091b;
        int i11 = 0;
        while (i11 < i10) {
            if (j3 == ((long[]) this.f2092c)[i11]) {
                int i12 = this.f2091b - 1;
                while (i11 < i12) {
                    long[] jArr = (long[]) this.f2092c;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f2091b--;
                return;
            }
            i11++;
        }
    }

    public String toString() {
        switch (this.f2090a) {
            case 4:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i10 = this.f2091b;
                sb.append(i10 != 1 ? i10 != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((v.i) this.f2092c);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public j(m6.b bVar, int i10) {
        this.f2090a = 1;
        p6.u.g(bVar);
        this.f2092c = bVar;
        this.f2091b = i10;
    }

    public j(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2090a = 6;
        this.f2092c = shader;
        this.f2091b = i10;
    }

    public j(int i10) {
        this.f2090a = i10;
        switch (i10) {
            case 3:
                break;
            case 4:
            default:
                this.f2091b = 1;
                this.f2092c = Collections.singletonList(null);
                break;
            case 5:
                this.f2091b = 300;
                u uVar = s.l.f6301a;
                this.f2092c = new u();
                break;
        }
    }

    public j(ArrayList arrayList) {
        this.f2090a = 0;
        this.f2091b = 0;
        this.f2092c = arrayList;
    }
}
