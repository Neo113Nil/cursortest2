package i7;

import a0.b0;
import a0.p;
import ac.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v0;
import b0.t;
import bc.a0;
import bc.v;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d2.k;
import e2.s;
import f1.d0;
import f1.i0;
import f1.n;
import f1.q;
import j0.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l1.g0;
import l1.h0;
import l1.j0;
import l1.k0;
import m0.d1;
import m0.i1;
import m0.l;
import m0.r;
import m0.s2;
import m0.w2;
import m0.x1;
import m0.z;
import m0.z0;
import org.fortheloss.st.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import pc.j;
import s.u;
import s2.m;
import v.o0;
import v.x;
import v1.p0;
import x.e0;
import x1.f1;
import y1.y0;
import yc.y;
import z.c0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3219a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3220b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3221c = 0;

    public static final long A(long j3, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j3 : q.b(j3, q.d(j3) * f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final k1.b B(int i10, r rVar) {
        TypedValue typedValue;
        int i11;
        boolean z10;
        long j3;
        int i12;
        int i13;
        int eventType;
        XmlResourceParser xmlResourceParser;
        int i14;
        int i15;
        int i16;
        int i17;
        Shader shader;
        int i18;
        d0 i0Var;
        ColorStateList colorStateList;
        Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
        Resources resources = (Resources) rVar.j(AndroidCompositionLocals_androidKt.f604c);
        c2.d dVar = (c2.d) rVar.j(AndroidCompositionLocals_androidKt.f606e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f1222a.b(i10);
            i11 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                u uVar = dVar.f1222a;
                int d10 = uVar.d(i10);
                Object[] objArr = uVar.f6297c;
                Object obj = objArr[d10];
                uVar.f6296b[d10] = i10;
                objArr[d10] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (charSequence instanceof String ? ((String) charSequence).endsWith(".xml") : xc.h.v(charSequence, charSequence.length() - 4, ".xml", 0, 4, false)) {
                z10 = true;
                if (z10) {
                    rVar.X(-1771631096);
                    boolean f10 = rVar.f(context.getTheme()) | rVar.f(charSequence) | rVar.d(i10);
                    Object M = rVar.M();
                    if (f10 || M == l.f4646a) {
                        try {
                            Drawable drawable = resources.getDrawable(i10, null);
                            j.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            M = new f1.g(((BitmapDrawable) drawable).getBitmap());
                            rVar.i0(M);
                        } catch (Exception e10) {
                            throw new ac.d("Error attempting to load resource: " + ((Object) charSequence), e10);
                        }
                    }
                    k1.a aVar = new k1.a((f1.g) M);
                    rVar.q(false);
                    return aVar;
                }
                rVar.X(-1771786530);
                Resources.Theme theme = context.getTheme();
                int i19 = typedValue.changingConfigurations;
                c2.c cVar = (c2.c) rVar.j(AndroidCompositionLocals_androidKt.f605d);
                c2.b bVar = new c2.b(theme, i10);
                WeakReference weakReference = (WeakReference) cVar.f1221a.get(bVar);
                c2.a aVar2 = weakReference != null ? (c2.a) weakReference.get() : null;
                if (aVar2 == null) {
                    XmlResourceParser xml = resources.getXml(i10);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!j.a(xml.getName(), "vector")) {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    m1.a aVar3 = new m1.a(xml);
                    TypedArray e11 = z2.b.e(resources, theme, asAttributeSet, m1.b.f4856a);
                    aVar3.b(e11.getChangingConfigurations());
                    boolean z11 = !z2.b.b(xml, "autoMirrored") ? false : e11.getBoolean(5, false);
                    aVar3.b(e11.getChangingConfigurations());
                    float a6 = aVar3.a(e11, "viewportWidth", 7, 0.0f);
                    float a8 = aVar3.a(e11, "viewportHeight", 8, 0.0f);
                    if (a6 <= 0.0f) {
                        throw new XmlPullParserException(e11.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (a8 <= 0.0f) {
                        throw new XmlPullParserException(e11.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = e11.getDimension(3, 0.0f);
                    aVar3.b(e11.getChangingConfigurations());
                    float dimension2 = e11.getDimension(2, 0.0f);
                    aVar3.b(e11.getChangingConfigurations());
                    if (e11.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        e11.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            j3 = q.f2283h;
                        } else {
                            if (z2.b.b(xml, "tint")) {
                                TypedValue typedValue3 = new TypedValue();
                                e11.getValue(1, typedValue3);
                                int i20 = typedValue3.type;
                                if (i20 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i20 < 28 || i20 > 31) {
                                    Resources resources2 = e11.getResources();
                                    int resourceId = e11.getResourceId(1, 0);
                                    ThreadLocal threadLocal = z2.c.f9075a;
                                    try {
                                        colorStateList = z2.c.a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e12) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e12);
                                    }
                                } else {
                                    colorStateList = ColorStateList.valueOf(typedValue3.data);
                                }
                                aVar3.b(e11.getChangingConfigurations());
                                j3 = colorStateList == null ? d0.b(colorStateList.getDefaultColor()) : q.f2283h;
                            }
                            colorStateList = null;
                            aVar3.b(e11.getChangingConfigurations());
                            if (colorStateList == null) {
                            }
                        }
                    } else {
                        j3 = q.f2283h;
                    }
                    long j6 = j3;
                    int i21 = e11.getInt(6, -1);
                    aVar3.b(e11.getChangingConfigurations());
                    if (i21 != -1) {
                        if (i21 == 3) {
                            i12 = 3;
                        } else if (i21 != 5) {
                            if (i21 != 9) {
                                switch (i21) {
                                    case 14:
                                        i12 = 13;
                                        break;
                                    case 15:
                                        i12 = 14;
                                        break;
                                    case 16:
                                        i12 = 12;
                                        break;
                                }
                            } else {
                                i12 = 9;
                            }
                        }
                        float f11 = dimension / resources.getDisplayMetrics().density;
                        float f12 = dimension2 / resources.getDisplayMetrics().density;
                        e11.recycle();
                        l1.e eVar = new l1.e(null, f11, f12, a6, a8, j6, i12, z11, 1);
                        i13 = 0;
                        for (int i22 = 3; xml.getEventType() != i11 && (xml.getDepth() >= i11 || xml.getEventType() != i22); i22 = 3) {
                            List list = v.f1067g;
                            XmlPullParser xmlPullParser = aVar3.f4853a;
                            f8.c cVar2 = aVar3.f4855c;
                            int i23 = i11;
                            eventType = xmlPullParser.getEventType();
                            int i24 = i19;
                            if (eventType == 2) {
                                if (eventType == i22 && "group".equals(xmlPullParser.getName())) {
                                    int i25 = i13 + 1;
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        ArrayList arrayList = eVar.f3973i;
                                        if (eVar.f3975k) {
                                            u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        l1.d dVar2 = (l1.d) arrayList.remove(arrayList.size() - 1);
                                        ((l1.d) arrayList.get(arrayList.size() - 1)).f3962j.add(new g0(dVar2.f3953a, dVar2.f3954b, dVar2.f3955c, dVar2.f3956d, dVar2.f3957e, dVar2.f3958f, dVar2.f3959g, dVar2.f3960h, dVar2.f3961i, dVar2.f3962j));
                                    }
                                    xmlResourceParser = xml;
                                    i15 = i23;
                                    i13 = 0;
                                    xmlResourceParser.next();
                                    i11 = i15;
                                    i19 = i24;
                                    xml = xmlResourceParser;
                                }
                                xmlResourceParser = xml;
                                i14 = i13;
                                i15 = i23;
                            } else {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int hashCode = name.hashCode();
                                    if (hashCode != -1649314686) {
                                        xmlResourceParser = xml;
                                        if (hashCode != 3433509) {
                                            if (hashCode == 98629247 && name.equals("group")) {
                                                TypedArray e13 = z2.b.e(resources, theme, asAttributeSet, m1.b.f4857b);
                                                aVar3.b(e13.getChangingConfigurations());
                                                float a10 = aVar3.a(e13, "rotation", 5, 0.0f);
                                                float f13 = e13.getFloat(i23, 0.0f);
                                                aVar3.b(e13.getChangingConfigurations());
                                                float f14 = e13.getFloat(2, 0.0f);
                                                aVar3.b(e13.getChangingConfigurations());
                                                float a11 = aVar3.a(e13, "scaleX", 3, 1.0f);
                                                float a12 = aVar3.a(e13, "scaleY", 4, 1.0f);
                                                float a13 = aVar3.a(e13, "translateX", 6, 0.0f);
                                                float a14 = aVar3.a(e13, "translateY", 7, 0.0f);
                                                String string = e13.getString(0);
                                                aVar3.b(e13.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                e13.recycle();
                                                int i27 = h0.f4034a;
                                                if (eVar.f3975k) {
                                                    u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                eVar.f3973i.add(new l1.d(str, a10, f13, f14, a11, a12, a13, a14, list, 512));
                                                i15 = 1;
                                            }
                                            i14 = i13;
                                            i15 = i23;
                                        } else if (name.equals("path")) {
                                            TypedArray e14 = z2.b.e(resources, theme, asAttributeSet, m1.b.f4858c);
                                            aVar3.b(e14.getChangingConfigurations());
                                            if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null)) {
                                                throw new IllegalArgumentException("No path data available");
                                            }
                                            String string2 = e14.getString(0);
                                            aVar3.b(e14.getChangingConfigurations());
                                            String str2 = string2 == null ? "" : string2;
                                            String string3 = e14.getString(2);
                                            aVar3.b(e14.getChangingConfigurations());
                                            if (string3 == null) {
                                                int i28 = h0.f4034a;
                                            } else {
                                                list = f8.c.r(cVar2, string3);
                                            }
                                            List list2 = list;
                                            e3.j a15 = z2.b.a(e14, aVar3.f4853a, theme, "fillColor", 1);
                                            aVar3.b(e14.getChangingConfigurations());
                                            float a16 = aVar3.a(e14, "fillAlpha", 12, 1.0f);
                                            int i29 = !z2.b.b(aVar3.f4853a, "strokeLineCap") ? -1 : e14.getInt(8, -1);
                                            aVar3.b(e14.getChangingConfigurations());
                                            if (i29 != 0) {
                                                if (i29 != 1) {
                                                    i16 = 2;
                                                    if (i29 == 2) {
                                                        i17 = 2;
                                                    }
                                                } else {
                                                    i16 = 2;
                                                    i17 = 1;
                                                }
                                                int i30 = z2.b.b(aVar3.f4853a, "strokeLineJoin") ? -1 : e14.getInt(9, -1);
                                                aVar3.b(e14.getChangingConfigurations());
                                                int i31 = i30 == 0 ? i30 != 1 ? i16 : 1 : 0;
                                                float a17 = aVar3.a(e14, "strokeMiterLimit", 10, 1.0f);
                                                e3.j a18 = z2.b.a(e14, aVar3.f4853a, theme, "strokeColor", 3);
                                                aVar3.b(e14.getChangingConfigurations());
                                                float a19 = aVar3.a(e14, "strokeAlpha", 11, 1.0f);
                                                float a20 = aVar3.a(e14, "strokeWidth", 4, 1.0f);
                                                float a21 = aVar3.a(e14, "trimPathEnd", 6, 1.0f);
                                                float a22 = aVar3.a(e14, "trimPathOffset", 7, 0.0f);
                                                float a23 = aVar3.a(e14, "trimPathStart", 5, 0.0f);
                                                int i32 = z2.b.b(aVar3.f4853a, "fillType") ? 0 : e14.getInt(13, 0);
                                                aVar3.b(e14.getChangingConfigurations());
                                                e14.recycle();
                                                shader = (Shader) a15.f2092c;
                                                if (shader == null && a15.f2091b == 0) {
                                                    i18 = i13;
                                                    i0Var = null;
                                                } else if (shader == null) {
                                                    i0Var = new n(shader);
                                                    i18 = i13;
                                                } else {
                                                    i18 = i13;
                                                    i0Var = new i0(d0.b(a15.f2091b));
                                                }
                                                Shader shader2 = (Shader) a18.f2092c;
                                                d0 nVar = (shader2 == null && a18.f2091b == 0) ? null : shader2 != null ? new n(shader2) : new i0(d0.b(a18.f2091b));
                                                int i33 = i32 != 0 ? 0 : 1;
                                                if (eVar.f3975k) {
                                                    u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                ((l1.d) eVar.f3973i.get(r0.size() - 1)).f3962j.add(new k0(str2, list2, i33, i0Var, a16, nVar, a19, a20, i17, i31, a17, a23, a21, a22));
                                                i13 = i18;
                                                i15 = 1;
                                            } else {
                                                i16 = 2;
                                            }
                                            i17 = 0;
                                            if (z2.b.b(aVar3.f4853a, "strokeLineJoin")) {
                                            }
                                            aVar3.b(e14.getChangingConfigurations());
                                            if (i30 == 0) {
                                            }
                                            float a172 = aVar3.a(e14, "strokeMiterLimit", 10, 1.0f);
                                            e3.j a182 = z2.b.a(e14, aVar3.f4853a, theme, "strokeColor", 3);
                                            aVar3.b(e14.getChangingConfigurations());
                                            float a192 = aVar3.a(e14, "strokeAlpha", 11, 1.0f);
                                            float a202 = aVar3.a(e14, "strokeWidth", 4, 1.0f);
                                            float a212 = aVar3.a(e14, "trimPathEnd", 6, 1.0f);
                                            float a222 = aVar3.a(e14, "trimPathOffset", 7, 0.0f);
                                            float a232 = aVar3.a(e14, "trimPathStart", 5, 0.0f);
                                            if (z2.b.b(aVar3.f4853a, "fillType")) {
                                            }
                                            aVar3.b(e14.getChangingConfigurations());
                                            e14.recycle();
                                            shader = (Shader) a15.f2092c;
                                            if (shader == null) {
                                                i18 = i13;
                                                i0Var = null;
                                                Shader shader22 = (Shader) a182.f2092c;
                                                if (shader22 == null) {
                                                    if (i32 != 0) {
                                                    }
                                                    if (eVar.f3975k) {
                                                    }
                                                    ((l1.d) eVar.f3973i.get(r0.size() - 1)).f3962j.add(new k0(str2, list2, i33, i0Var, a16, nVar, a192, a202, i17, i31, a172, a232, a212, a222));
                                                    i13 = i18;
                                                    i15 = 1;
                                                }
                                                if (i32 != 0) {
                                                }
                                                if (eVar.f3975k) {
                                                }
                                                ((l1.d) eVar.f3973i.get(r0.size() - 1)).f3962j.add(new k0(str2, list2, i33, i0Var, a16, nVar, a192, a202, i17, i31, a172, a232, a212, a222));
                                                i13 = i18;
                                                i15 = 1;
                                            }
                                            if (shader == null) {
                                            }
                                            Shader shader222 = (Shader) a182.f2092c;
                                            if (shader222 == null) {
                                            }
                                            if (i32 != 0) {
                                            }
                                            if (eVar.f3975k) {
                                            }
                                            ((l1.d) eVar.f3973i.get(r0.size() - 1)).f3962j.add(new k0(str2, list2, i33, i0Var, a16, nVar, a192, a202, i17, i31, a172, a232, a212, a222));
                                            i13 = i18;
                                            i15 = 1;
                                        } else {
                                            i14 = i13;
                                            i15 = 1;
                                        }
                                    } else {
                                        xmlResourceParser = xml;
                                        i14 = i13;
                                        if (name.equals("clip-path")) {
                                            TypedArray e15 = z2.b.e(resources, theme, asAttributeSet, m1.b.f4859d);
                                            aVar3.b(e15.getChangingConfigurations());
                                            String string4 = e15.getString(0);
                                            aVar3.b(e15.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            i15 = 1;
                                            String string5 = e15.getString(1);
                                            aVar3.b(e15.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i34 = h0.f4034a;
                                            } else {
                                                list = f8.c.r(cVar2, string5);
                                            }
                                            List list3 = list;
                                            e15.recycle();
                                            if (eVar.f3975k) {
                                                u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            eVar.f3973i.add(new l1.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list3, 512));
                                            i13 = i14 + 1;
                                        } else {
                                            i15 = 1;
                                            i13 = i14;
                                        }
                                    }
                                    xmlResourceParser.next();
                                    i11 = i15;
                                    i19 = i24;
                                    xml = xmlResourceParser;
                                }
                                xmlResourceParser = xml;
                                i14 = i13;
                                i15 = i23;
                            }
                            i13 = i14;
                            xmlResourceParser.next();
                            i11 = i15;
                            i19 = i24;
                            xml = xmlResourceParser;
                        }
                        aVar2 = new c2.a(eVar.b(), i19 | aVar3.f4854b);
                        cVar.f1221a.put(bVar, new WeakReference(aVar2));
                    }
                    i12 = 5;
                    float f112 = dimension / resources.getDisplayMetrics().density;
                    float f122 = dimension2 / resources.getDisplayMetrics().density;
                    e11.recycle();
                    l1.e eVar2 = new l1.e(null, f112, f122, a6, a8, j6, i12, z11, 1);
                    i13 = 0;
                    while (xml.getEventType() != i11) {
                        List list4 = v.f1067g;
                        XmlPullParser xmlPullParser2 = aVar3.f4853a;
                        f8.c cVar22 = aVar3.f4855c;
                        int i232 = i11;
                        eventType = xmlPullParser2.getEventType();
                        int i242 = i19;
                        if (eventType == 2) {
                        }
                        i13 = i14;
                        xmlResourceParser.next();
                        i11 = i15;
                        i19 = i242;
                        xml = xmlResourceParser;
                    }
                    aVar2 = new c2.a(eVar2.b(), i19 | aVar3.f4854b);
                    cVar.f1221a.put(bVar, new WeakReference(aVar2));
                }
                j0 c3 = l1.b.c(aVar2.f1217a, rVar);
                rVar.q(false);
                return c3;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public static final Activity C(Context context) {
        j.e(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        j.d(baseContext, "getBaseContext(...)");
        return C(baseContext);
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static void E(oc.e eVar, yc.a aVar, yc.a aVar2) {
        try {
            dd.a.g(a0.w(a0.h(aVar, aVar2, eVar)), o.f277a);
        } catch (Throwable th) {
            aVar2.resumeWith(v6.a.s(th));
            throw th;
        }
    }

    public static final long F(long j3) {
        return (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [oc.a, pc.k] */
    public static final void G(e2.n nVar, int i10, d2.i iVar) {
        e2.n nVar2;
        o0.e eVar = new o0.e(new e2.n[16]);
        List i11 = nVar.i(false, false);
        while (true) {
            eVar.c(eVar.f5136i, i11);
            while (true) {
                int i12 = eVar.f5136i;
                if (i12 == 0) {
                    return;
                }
                nVar2 = (e2.n) eVar.k(i12 - 1);
                boolean e10 = e2.q.e(nVar2);
                e2.j jVar = nVar2.f1996d;
                s.g0 g0Var = jVar.f1985g;
                if (!e10 && !g0Var.c(s.f2033i)) {
                    f1 d10 = nVar2.d();
                    if (d10 == null) {
                        throw a4.d.e("Expected semantics node to have a coordinator.");
                    }
                    s2.j H = a.a.H(p0.e(d10));
                    if (H.f6391a < H.f6393c && H.f6392b < H.f6394d) {
                        Object g8 = jVar.f1985g.g(e2.i.f1963e);
                        if (g8 == null) {
                            g8 = null;
                        }
                        oc.e eVar2 = (oc.e) g8;
                        Object g10 = g0Var.g(s.f2045u);
                        e2.h hVar = (e2.h) (g10 != null ? g10 : null);
                        if (eVar2 != null && hVar != null && ((Number) hVar.f1958b.invoke()).floatValue() > 0.0f) {
                            int i13 = i10 + 1;
                            iVar.invoke(new k(nVar2, i13, H, d10));
                            G(nVar2, i13, iVar);
                        }
                    }
                }
            }
            i11 = nVar2.i(false, false);
        }
    }

    public static Object I(g7.o oVar) {
        if (oVar.i()) {
            return oVar.g();
        }
        if (oVar.f2555d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(oVar.f());
    }

    public static long a(float f10) {
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final s2.e b(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        t2.a a6 = t2.b.a(f10);
        if (a6 == null) {
            a6 = new m(f10);
        }
        return new s2.e(f11, f10, a6);
    }

    public static final void c(m5.c cVar, x xVar, y0.f fVar, oc.c cVar2, u0.d dVar, r rVar, int i10) {
        int i11;
        j.e(cVar, "navigator");
        rVar.Z(33636071);
        if ((i10 & 14) == 0) {
            i11 = (rVar.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= rVar.f(y0.k.f8442a) ? 32 : 16;
        }
        int i12 = i11 | 3072;
        if ((i10 & 57344) == 0) {
            i12 |= rVar.g(false) ? 16384 : 8192;
        }
        int i13 = i12 | 196608;
        if ((i10 & 3670016) == 0) {
            i13 |= rVar.h(dVar) ? 1048576 : 524288;
        }
        y0.f fVar2 = y0.c.f8419g;
        p5.c cVar3 = p5.c.f5526h;
        a0.d(cVar, new a0.a0(18, xVar), cVar3, dVar, rVar, (57344 & i13) | (i13 & 14) | 8 | ((i13 << 3) & 896) | (i13 & 7168) | (458752 & i13) | (i13 & 3670016));
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new p5.d(cVar, xVar, fVar2, cVar3, dVar, i10);
        }
    }

    public static final void d(m5.c cVar, y0.n nVar, x xVar, oc.g gVar, r rVar, int i10) {
        int i11;
        y0.n nVar2;
        x xVar2;
        oc.g gVar2;
        j.e(cVar, "navigator");
        rVar.Z(496259879);
        if ((i10 & 14) == 0) {
            i11 = (rVar.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 3248;
        if ((i12 & 5851) == 1170 && rVar.B()) {
            rVar.S();
            nVar2 = nVar;
            xVar2 = xVar;
            gVar2 = gVar;
        } else {
            o0 i13 = v.d.i(0.0f, 400.0f, null, 5);
            u0.d dVar = p5.b.f5525a;
            c(cVar, i13, null, null, dVar, rVar, 25096 | (i12 & 14) | (i12 & 112) | ((i12 << 9) & 3670016));
            nVar2 = y0.k.f8442a;
            xVar2 = i13;
            gVar2 = dVar;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new w(cVar, nVar2, xVar2, gVar2, i10, 2);
        }
    }

    public static final long e(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0245, code lost:
    
        if (r41.g(false) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0260, code lost:
    
        if (r41.g(true) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0341, code lost:
    
        if (r6 == r5) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0263  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(y0.n nVar, b0 b0Var, c0 c0Var, x.k kVar, boolean z10, y0.d dVar, z.g gVar, oc.c cVar, r rVar, int i10, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        boolean f10;
        Object pVar;
        b0 b0Var2;
        z0 z0Var;
        boolean z13;
        ?? r14;
        a0.j jVar;
        boolean z14;
        z0 z0Var2;
        b0 b0Var3;
        rVar.Z(620764179);
        if ((i10 & 6) == 0) {
            i12 = (rVar.f(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= rVar.f(b0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= rVar.f(c0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= rVar.g(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= rVar.g(true) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= rVar.f(kVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= rVar.g(z10) ? 1048576 : 524288;
        }
        int i13 = i12 | 12582912;
        if ((i10 & 100663296) == 0) {
            i13 |= rVar.f(dVar) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i13 |= rVar.f(gVar) ? 536870912 : 268435456;
        }
        int i14 = i11 | 54;
        if ((i11 & 384) == 0) {
            i14 |= rVar.h(cVar) ? 256 : 128;
        }
        int i15 = i14;
        if ((i13 & 306783379) == 306783378 && (i15 & 147) == 146 && rVar.B()) {
            rVar.S();
            b0Var3 = b0Var;
        } else {
            int i16 = (i13 >> 3) & 14;
            int i17 = ((i15 >> 3) & 112) | i16;
            d1 u10 = z.u(cVar, rVar);
            boolean z15 = (((i17 & 14) ^ 6) > 4 && rVar.f(b0Var)) || (i17 & 6) == 4;
            Object M = rVar.M();
            z0 z0Var3 = l.f4646a;
            if (z15 || M == z0Var3) {
                a0.c cVar2 = new a0.c();
                cVar2.f38a = new i1(Integer.MAX_VALUE);
                cVar2.f39b = new i1(Integer.MAX_VALUE);
                a0.k kVar2 = new a0.k(u10, 0);
                z0 z0Var4 = z0.f4842j;
                a5.c cVar3 = s2.f4755a;
                M = new a0.j(new m0.i0(new a0.l(new m0.i0(kVar2, z0Var4), b0Var, cVar2, 0), z0Var4), w2.class, "value", "getValue()Ljava/lang/Object;", 0, 0);
                rVar.i0(M);
            }
            a0.j jVar2 = (a0.j) M;
            int i18 = ((i13 >> 9) & 112) | i16;
            boolean z16 = ((((i18 & 112) ^ 48) > 32 && rVar.g(true)) || (i18 & 48) == 32) | ((((i18 & 14) ^ 6) > 4 && rVar.f(b0Var)) || (i18 & 6) == 4);
            Object M2 = rVar.M();
            if (z16 || M2 == z0Var3) {
                M2 = new a0.d(b0Var);
                rVar.i0(M2);
            }
            a0.d dVar2 = (a0.d) M2;
            Object M3 = rVar.M();
            if (M3 == z0Var3) {
                m0.d0 d0Var = new m0.d0(z.l(rVar));
                rVar.i0(d0Var);
                M3 = d0Var;
            }
            y yVar = ((m0.d0) M3).f4546g;
            f1.u uVar = (f1.u) rVar.j(y0.f8708g);
            boolean z17 = !((Boolean) rVar.j(y0.f8723v)).booleanValue();
            int i19 = i13 & 7168;
            int i20 = i13 >> 6;
            int i21 = i15 << 21;
            int i22 = i13;
            int i23 = (i13 & 65520) | (i20 & 458752) | (i20 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i13 & 1879048192);
            boolean z18 = ((((i23 & 896) ^ 384) > 256 && rVar.f(c0Var)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) > 32 && rVar.f(b0Var)) || (i23 & 48) == 32);
            if (((i23 & 7168) ^ 3072) <= 2048) {
            }
            if ((i23 & 3072) != 2048) {
                z11 = false;
                boolean z19 = z18 | z11;
                if (((57344 & i23) ^ 24576) <= 16384) {
                }
                if ((i23 & 24576) != 16384) {
                    z12 = false;
                    f10 = (((i23 & 29360128) ^ 12582912) <= 8388608 && rVar.f(null)) | z19 | z12 | ((((i23 & 3670016) ^ 1572864) <= 1048576 && rVar.f(dVar)) || (i23 & 1572864) == 1048576) | (((i23 & 234881024) ^ 100663296) <= 67108864 && rVar.f(null)) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && rVar.f(gVar)) || (i23 & 805306368) == 536870912) | rVar.f(uVar) | rVar.g(z17);
                    Object M4 = rVar.M();
                    if (!f10 || M4 == z0Var3) {
                        b0Var2 = b0Var;
                        z0Var = z0Var3;
                        z13 = true;
                        r14 = 0;
                        pVar = new p(b0Var2, c0Var, jVar2, gVar, z17, yVar, uVar, dVar);
                        jVar = jVar2;
                        rVar.i0(pVar);
                    } else {
                        pVar = M4;
                        z0Var = z0Var3;
                        jVar = jVar2;
                        r14 = 0;
                        z13 = true;
                        b0Var2 = b0Var;
                    }
                    oc.e eVar = (oc.e) pVar;
                    y0.n d10 = nVar.d(b0Var2.f26k).d(b0Var2.f27l);
                    e0 e0Var = e0.f7769g;
                    y0.n a6 = androidx.compose.foundation.lazy.layout.c.a(d10, jVar, dVar2, e0Var, z10);
                    int i24 = ((i22 >> 18) & 112) | i16;
                    z14 = ((((i24 & 112) ^ 48) > 32 || !rVar.d(r14)) ? r14 : z13) | (((((i24 & 14) ^ 6) > 4 || !rVar.f(b0Var2)) && (i24 & 6) != 4) ? r14 : z13);
                    Object M5 = rVar.M();
                    if (z14) {
                        z0Var2 = z0Var;
                    } else {
                        z0Var2 = z0Var;
                    }
                    M5 = new a0.e(b0Var2);
                    rVar.i0(M5);
                    a0.e eVar2 = (a0.e) M5;
                    b0.j jVar3 = b0Var2.f29n;
                    s2.l lVar = (s2.l) rVar.j(y0.f8715n);
                    int i25 = 512 | i19 | (i22 & 3670016);
                    if (z10) {
                        rVar.X(-1890632411);
                        boolean f11 = rVar.f(eVar2) | rVar.f(jVar3);
                        if ((((i25 & 7168) ^ 3072) <= 2048 || !rVar.g(r14)) && (i25 & 3072) != 2048) {
                            z13 = r14;
                        }
                        boolean f12 = f11 | z13 | rVar.f(lVar) | rVar.f(e0Var);
                        Object M6 = rVar.M();
                        if (f12 || M6 == z0Var2) {
                            M6 = new b0.m(eVar2, jVar3, lVar, e0Var);
                            rVar.i0(M6);
                        }
                        a6 = a6.d((b0.m) M6);
                        rVar.q(r14);
                    } else {
                        rVar.X(-1890658823);
                        rVar.q(r14);
                    }
                    b0Var3 = b0Var2;
                    v6.a.e(jVar, u2.b.n(a6.d(b0Var2.f28m.f557i), b0Var2, e0Var, z10, kVar, b0Var2.f21f, rVar), b0Var3.f30o, eVar, rVar, 0);
                }
                z12 = true;
                f10 = (((i23 & 29360128) ^ 12582912) <= 8388608 && rVar.f(null)) | z19 | z12 | ((((i23 & 3670016) ^ 1572864) <= 1048576 && rVar.f(dVar)) || (i23 & 1572864) == 1048576) | (((i23 & 234881024) ^ 100663296) <= 67108864 && rVar.f(null)) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && rVar.f(gVar)) || (i23 & 805306368) == 536870912) | rVar.f(uVar) | rVar.g(z17);
                Object M42 = rVar.M();
                if (f10) {
                }
                b0Var2 = b0Var;
                z0Var = z0Var3;
                z13 = true;
                r14 = 0;
                pVar = new p(b0Var2, c0Var, jVar2, gVar, z17, yVar, uVar, dVar);
                jVar = jVar2;
                rVar.i0(pVar);
                oc.e eVar3 = (oc.e) pVar;
                y0.n d102 = nVar.d(b0Var2.f26k).d(b0Var2.f27l);
                e0 e0Var2 = e0.f7769g;
                y0.n a62 = androidx.compose.foundation.lazy.layout.c.a(d102, jVar, dVar2, e0Var2, z10);
                int i242 = ((i22 >> 18) & 112) | i16;
                if (((i242 & 14) ^ 6) > 4) {
                }
                z14 = ((((i242 & 112) ^ 48) > 32 || !rVar.d(r14)) ? r14 : z13) | (((((i242 & 14) ^ 6) > 4 || !rVar.f(b0Var2)) && (i242 & 6) != 4) ? r14 : z13);
                Object M52 = rVar.M();
                if (z14) {
                }
                M52 = new a0.e(b0Var2);
                rVar.i0(M52);
                a0.e eVar22 = (a0.e) M52;
                b0.j jVar32 = b0Var2.f29n;
                s2.l lVar2 = (s2.l) rVar.j(y0.f8715n);
                int i252 = 512 | i19 | (i22 & 3670016);
                if (z10) {
                }
                b0Var3 = b0Var2;
                v6.a.e(jVar, u2.b.n(a62.d(b0Var2.f28m.f557i), b0Var2, e0Var2, z10, kVar, b0Var2.f21f, rVar), b0Var3.f30o, eVar3, rVar, 0);
            }
            z11 = true;
            boolean z192 = z18 | z11;
            if (((57344 & i23) ^ 24576) <= 16384) {
            }
            if ((i23 & 24576) != 16384) {
            }
            z12 = true;
            f10 = (((i23 & 29360128) ^ 12582912) <= 8388608 && rVar.f(null)) | z192 | z12 | ((((i23 & 3670016) ^ 1572864) <= 1048576 && rVar.f(dVar)) || (i23 & 1572864) == 1048576) | (((i23 & 234881024) ^ 100663296) <= 67108864 && rVar.f(null)) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && rVar.f(gVar)) || (i23 & 805306368) == 536870912) | rVar.f(uVar) | rVar.g(z17);
            Object M422 = rVar.M();
            if (f10) {
            }
            b0Var2 = b0Var;
            z0Var = z0Var3;
            z13 = true;
            r14 = 0;
            pVar = new p(b0Var2, c0Var, jVar2, gVar, z17, yVar, uVar, dVar);
            jVar = jVar2;
            rVar.i0(pVar);
            oc.e eVar32 = (oc.e) pVar;
            y0.n d1022 = nVar.d(b0Var2.f26k).d(b0Var2.f27l);
            e0 e0Var22 = e0.f7769g;
            y0.n a622 = androidx.compose.foundation.lazy.layout.c.a(d1022, jVar, dVar2, e0Var22, z10);
            int i2422 = ((i22 >> 18) & 112) | i16;
            if (((i2422 & 14) ^ 6) > 4) {
            }
            z14 = ((((i2422 & 112) ^ 48) > 32 || !rVar.d(r14)) ? r14 : z13) | (((((i2422 & 14) ^ 6) > 4 || !rVar.f(b0Var2)) && (i2422 & 6) != 4) ? r14 : z13);
            Object M522 = rVar.M();
            if (z14) {
            }
            M522 = new a0.e(b0Var2);
            rVar.i0(M522);
            a0.e eVar222 = (a0.e) M522;
            b0.j jVar322 = b0Var2.f29n;
            s2.l lVar22 = (s2.l) rVar.j(y0.f8715n);
            int i2522 = 512 | i19 | (i22 & 3670016);
            if (z10) {
            }
            b0Var3 = b0Var2;
            v6.a.e(jVar, u2.b.n(a622.d(b0Var2.f28m.f557i), b0Var2, e0Var22, z10, kVar, b0Var2.f21f, rVar), b0Var3.f30o, eVar32, rVar, 0);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a0.m(nVar, b0Var3, c0Var, kVar, z10, dVar, gVar, cVar, i10, i11);
        }
    }

    public static final long g(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void h(a0.i iVar, Object obj, int i10, Object obj2, r rVar, int i11) {
        int i12;
        rVar.Z(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (rVar.f(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= rVar.f(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= rVar.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= rVar.f(obj2) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            ((v0.c) obj).a(obj2, u0.e.e(980966366, new a0.h(i10, iVar, obj2), rVar), rVar, 48);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new t(iVar, obj, i10, obj2, i11);
        }
    }

    public static final int i(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    public static final boolean j(b1.e eVar, long j3) {
        if (!eVar.f8443g.f8456t) {
            return false;
        }
        x1.s sVar = x1.f.v(eVar).I.f7988c;
        if (!sVar.T.f8456t) {
            return false;
        }
        long L0 = sVar.L0(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (L0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (L0 & 4294967295L));
        long j6 = eVar.f946w;
        float f10 = ((int) (j6 >> 32)) + intBitsToFloat;
        float f11 = ((int) (j6 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f10) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f11;
    }

    public static void k(Throwable th, Throwable th2) {
        j.e(th, "<this>");
        j.e(th2, "exception");
        if (th != th2) {
            Integer num = kc.a.f3636a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = jc.a.f3548a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Object l(g7.o oVar) {
        p6.u.f("Must not be called on the main application thread");
        p6.u.e();
        p6.u.h(oVar, "Task must not be null");
        if (oVar.h()) {
            return I(oVar);
        }
        f8.c cVar = new f8.c(11);
        Executor executor = g7.i.f2539b;
        oVar.c(executor, cVar);
        oVar.b(executor, cVar);
        oVar.f2553b.b(new g7.k(executor, (g7.b) cVar));
        oVar.o();
        ((CountDownLatch) cVar.f2340h).await();
        return I(oVar);
    }

    public static Object m(g7.o oVar, long j3, TimeUnit timeUnit) {
        p6.u.f("Must not be called on the main application thread");
        p6.u.e();
        p6.u.h(oVar, "Task must not be null");
        p6.u.h(timeUnit, "TimeUnit must not be null");
        if (oVar.h()) {
            return I(oVar);
        }
        f8.c cVar = new f8.c(11);
        Executor executor = g7.i.f2539b;
        oVar.c(executor, cVar);
        oVar.b(executor, cVar);
        oVar.f2553b.b(new g7.k(executor, (g7.b) cVar));
        oVar.o();
        if (((CountDownLatch) cVar.f2340h).await(j3, timeUnit)) {
            return I(oVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static cc.c n(cc.c cVar) {
        cVar.g();
        cVar.f1306i = true;
        return cVar.f1305h > 0 ? cVar : cc.c.f1303j;
    }

    public static g7.o o(Executor executor, Callable callable) {
        p6.u.h(executor, "Executor must not be null");
        g7.o oVar = new g7.o();
        executor.execute(new dd.i(9, oVar, callable, false));
        return oVar;
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q(ad.e eVar) {
        eVar.g(null, false);
    }

    public static final ub.f r(androidx.lifecycle.y0 y0Var, r rVar) {
        ub.f fVar;
        rVar.Y(1770922558);
        if (y0Var instanceof androidx.lifecycle.k) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
            v0 d10 = ((androidx.lifecycle.k) y0Var).d();
            j.e(context, "context");
            j.e(d10, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof d.o) {
                    fVar = ub.f.d((d.o) context, d10);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    j.d(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        fVar = null;
        rVar.q(false);
        return fVar;
    }

    public static boolean s(String str, String str2) {
        j.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i11++;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring.length() - 1;
                    int i14 = 0;
                    boolean z10 = false;
                    while (i14 <= length) {
                        boolean m10 = u2.b.m(substring.charAt(!z10 ? i14 : length));
                        if (z10) {
                            if (!m10) {
                                break;
                            }
                            length--;
                        } else if (m10) {
                            i14++;
                        } else {
                            z10 = true;
                        }
                    }
                    return j.a(substring.subSequence(i14, length + 1).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean t(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = h3.w.f2829a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = h3.v.f2825d;
        h3.v vVar = (h3.v) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (vVar == null) {
            vVar = new h3.v();
            vVar.f2826a = null;
            vVar.f2827b = null;
            vVar.f2828c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, vVar);
        }
        WeakReference weakReference2 = vVar.f2828c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        vVar.f2828c = new WeakReference(keyEvent);
        if (vVar.f2827b == null) {
            vVar.f2827b = new SparseArray();
        }
        SparseArray sparseArray = vVar.f2827b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static g7.o u(Object obj) {
        g7.o oVar = new g7.o();
        oVar.l(obj);
        return oVar;
    }

    public static final long v(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static Set w() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String x(k5.a aVar) {
        String b2 = pc.t.a(aVar.getClass()).b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Default ScreenKey not found, please provide your own key");
    }

    public static String y(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 9:
            case 11:
            case 12:
            default:
                return a4.d.g("unknown status code: ", i10);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public abstract void H();
}
