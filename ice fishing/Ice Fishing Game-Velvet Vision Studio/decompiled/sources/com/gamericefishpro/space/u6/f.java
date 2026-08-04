package com.gamericefishpro.space.u6;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.f5.q0;
import com.gamericefishpro.space.h2.w1;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o2.v;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.p0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.w;
import com.gamericefishpro.space.t0.d2;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.t0.x1;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.t0.y1;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u1.f0;
import com.gamericefishpro.space.u1.i0;
import com.gamericefishpro.space.v.k0;
import com.gamericefishpro.space.w.m1;
import com.gamericefishpro.space.w.n1;
import com.gamericefishpro.space.w.s0;
import com.gamericefishpro.space.z4.x0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static boolean a = false;
    public static Method b;
    public static long c;
    public static Method d;
    public static com.gamericefishpro.space.u1.f e;
    public static com.gamericefishpro.space.u1.f f;

    public static final int A(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        com.gamericefishpro.space.wa.b.K(key);
        throw null;
    }

    public static final Bundle B(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        com.gamericefishpro.space.wa.b.K(key);
        throw null;
    }

    public static final ArrayList C(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.gamericefishpro.space.ei.g parcelableClass = b0.a(Bundle.class);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList arrayListB = Build.VERSION.SDK_INT >= 34 ? com.gamericefishpro.space.e4.e.b(bundle, key, d5.C(parcelableClass)) : bundle.getParcelableArrayList(key);
        if (arrayListB != null) {
            return arrayListB;
        }
        com.gamericefishpro.space.wa.b.K(key);
        throw null;
    }

    public static String D(int i) {
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "SUCCESS_CACHE";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SUCCESS";
            case 1:
            case 9:
            case RequestError.STOP_TRACKING /* 11 */:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
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

    public static final int E(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 29) {
            return com.gamericefishpro.space.h6.a.a();
        }
        try {
            if (d == null) {
                c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) d.invoke(null, Long.valueOf(c))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean G(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        return n(key, bundle) && bundle.get(key) == null;
    }

    public static final boolean H(com.gamericefishpro.space.n1.d dVar) {
        long j = dVar.e;
        return (j >>> 32) == (4294967295L & j) && j == dVar.f && j == dVar.g && j == dVar.h;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:165:0x042c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0431  */
    /* JADX WARN: Code duplicated, block: B:172:0x044d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x044f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0458  */
    /* JADX WARN: Code duplicated, block: B:181:0x0475 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0477  */
    /* JADX WARN: Code duplicated, block: B:184:0x047f  */
    /* JADX WARN: Code duplicated, block: B:187:0x048f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0492  */
    /* JADX WARN: Code duplicated, block: B:191:0x0498  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    public static final com.gamericefishpro.space.t1.b I(int i, com.gamericefishpro.space.t0.r rVar, int i2) {
        TypedValue typedValue;
        int i3;
        Object obj;
        long jB;
        int i4;
        int i5;
        byte b2;
        int i6;
        int i7;
        int i8;
        com.gamericefishpro.space.c2.c cVarB;
        int i9;
        Shader shader;
        com.gamericefishpro.space.o1.o m0Var;
        Shader shader2;
        com.gamericefishpro.space.o1.o m0Var2;
        com.gamericefishpro.space.o1.o oVar;
        int i10;
        ColorStateList colorStateListA;
        Context context = (Context) rVar.j(j0.b);
        Resources resources = (Resources) rVar.j(j0.c);
        com.gamericefishpro.space.m2.d dVar = (com.gamericefishpro.space.m2.d) rVar.j(j0.e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.a.b(i);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                w wVar = dVar.a;
                int iD = wVar.d(i);
                Object[] objArr = wVar.c;
                Object obj2 = objArr[iD];
                wVar.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.s(charSequence)) {
            rVar.a0(-1771643000);
            Object theme = context.getTheme();
            boolean zF = rVar.f(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !rVar.d(i)) && (i2 & 6) != 4) {
                i3 = 0;
            }
            int i11 = (rVar.f(theme) ? 1 : 0) | (zF ? 1 : 0) | i3;
            Object objP = rVar.P();
            if (i11 != 0 || objP == com.gamericefishpro.space.t0.n.a) {
                obj = objP;
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    Intrinsics.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    Object fVar = new com.gamericefishpro.space.o1.f(((BitmapDrawable) drawable).getBitmap());
                    rVar.k0(fVar);
                    obj = fVar;
                } catch (Exception e2) {
                    throw new com.gamericefishpro.space.bb.n("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            obj = objP;
            com.gamericefishpro.space.t1.a aVar = new com.gamericefishpro.space.t1.a((com.gamericefishpro.space.o1.f) obj);
            rVar.p(false);
            return aVar;
        }
        rVar.a0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i12 = typedValue.changingConfigurations;
        com.gamericefishpro.space.m2.c cVar = (com.gamericefishpro.space.m2.c) rVar.j(j0.d);
        com.gamericefishpro.space.m2.b bVar = new com.gamericefishpro.space.m2.b(theme2, i);
        WeakReference weakReference = (WeakReference) cVar.a.get(bVar);
        com.gamericefishpro.space.m2.a aVar2 = weakReference != null ? (com.gamericefishpro.space.m2.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            com.gamericefishpro.space.v1.a aVar3 = new com.gamericefishpro.space.v1.a(xml);
            TypedArray typedArrayF = com.gamericefishpro.space.t3.b.f(resources, theme2, attributeSetAsAttributeSet, com.gamericefishpro.space.v1.b.a);
            aVar3.b(typedArrayF.getChangingConfigurations());
            boolean z = !com.gamericefishpro.space.t3.b.c(xml, "autoMirrored") ? false : typedArrayF.getBoolean(5, false);
            aVar3.b(typedArrayF.getChangingConfigurations());
            float fA = aVar3.a(typedArrayF, "viewportWidth", 7, 0.0f);
            float fA2 = aVar3.a(typedArrayF, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayF.getDimension(3, 0.0f);
            aVar3.b(typedArrayF.getChangingConfigurations());
            float dimension2 = typedArrayF.getDimension(2, 0.0f);
            aVar3.b(typedArrayF.getChangingConfigurations());
            if (typedArrayF.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayF.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jB = com.gamericefishpro.space.o1.s.g;
                } else {
                    if (com.gamericefishpro.space.t3.b.c(xml, "tint")) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayF.getValue(1, typedValue3);
                        int i13 = typedValue3.type;
                        if (i13 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i13 < 28 || i13 > 31) {
                            Resources resources2 = typedArrayF.getResources();
                            int resourceId = typedArrayF.getResourceId(1, 0);
                            ThreadLocal threadLocal = com.gamericefishpro.space.t3.c.a;
                            try {
                                colorStateListA = com.gamericefishpro.space.t3.c.a(resources2, resources2.getXml(resourceId), theme2);
                            } catch (Exception e3) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    aVar3.b(typedArrayF.getChangingConfigurations());
                    jB = colorStateListA != null ? com.gamericefishpro.space.o1.o.b(colorStateListA.getDefaultColor()) : com.gamericefishpro.space.o1.s.g;
                }
            } else {
                jB = com.gamericefishpro.space.o1.s.g;
            }
            long j = jB;
            int i14 = typedArrayF.getInt(6, -1);
            aVar3.b(typedArrayF.getChangingConfigurations());
            if (i14 == -1) {
                i4 = 5;
            } else if (i14 == 3) {
                i4 = 3;
            } else if (i14 == 5) {
                i4 = 5;
            } else if (i14 != 9) {
                switch (i14) {
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f2 = dimension / resources.getDisplayMetrics().density;
            float f3 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayF.recycle();
            com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e(null, f2, f3, fA, fA2, j, i4, z, 1);
            int i15 = 0;
            for (int i16 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i16); i16 = 3) {
                XmlPullParser xmlPullParser = aVar3.a;
                u uVar = aVar3.c;
                int i17 = i3;
                int eventType = xmlPullParser.getEventType();
                int i18 = i12;
                if (eventType != 2) {
                    if (eventType == i16 && "group".equals(xmlPullParser.getName())) {
                        int i19 = i15 + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            ArrayList arrayList = eVar.i;
                            if (eVar.k) {
                                com.gamericefishpro.space.e2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            com.gamericefishpro.space.u1.d dVar2 = (com.gamericefishpro.space.u1.d) arrayList.remove(arrayList.size() - 1);
                            ((com.gamericefishpro.space.u1.d) arrayList.get(arrayList.size() - 1)).j.add(new f0(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j));
                        }
                        i3 = i17;
                        i15 = 0;
                        b2 = -1;
                    }
                    i5 = i15;
                    i3 = i17;
                    b2 = -1;
                    i15 = i5;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i5 = i15;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayF2 = com.gamericefishpro.space.t3.b.f(resources, theme2, attributeSetAsAttributeSet, com.gamericefishpro.space.v1.b.b);
                                    aVar3.b(typedArrayF2.getChangingConfigurations());
                                    float fA3 = aVar3.a(typedArrayF2, "rotation", 5, 0.0f);
                                    float f4 = typedArrayF2.getFloat(i17, 0.0f);
                                    aVar3.b(typedArrayF2.getChangingConfigurations());
                                    float f5 = typedArrayF2.getFloat(2, 0.0f);
                                    aVar3.b(typedArrayF2.getChangingConfigurations());
                                    float fA4 = aVar3.a(typedArrayF2, "scaleX", 3, 1.0f);
                                    float fA5 = aVar3.a(typedArrayF2, "scaleY", 4, 1.0f);
                                    float fA6 = aVar3.a(typedArrayF2, "translateX", 6, 0.0f);
                                    float fA7 = aVar3.a(typedArrayF2, "translateY", 7, 0.0f);
                                    String string = typedArrayF2.getString(0);
                                    aVar3.b(typedArrayF2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayF2.recycle();
                                    g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                                    if (eVar.k) {
                                        com.gamericefishpro.space.e2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    eVar.i.add(new com.gamericefishpro.space.u1.d(str, fA3, f4, f5, fA4, fA5, fA6, fA7, g0Var, 512));
                                    i15 = i5;
                                    i3 = 1;
                                    b2 = -1;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayF3 = com.gamericefishpro.space.t3.b.f(resources, theme2, attributeSetAsAttributeSet, com.gamericefishpro.space.v1.b.c);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = typedArrayF3.getString(0);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayF3.getString(2);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                List listC = string3 == null ? com.gamericefishpro.space.u1.g0.a : u.C(uVar, string3);
                                com.gamericefishpro.space.c2.c cVarB2 = com.gamericefishpro.space.t3.b.b(typedArrayF3, aVar3.a, theme2, "fillColor", 1);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                float fA8 = aVar3.a(typedArrayF3, "fillAlpha", 12, 1.0f);
                                int i21 = !com.gamericefishpro.space.t3.b.c(aVar3.a, "strokeLineCap") ? -1 : typedArrayF3.getInt(8, -1);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                if (i21 == 0) {
                                    i6 = 0;
                                } else if (i21 == 1) {
                                    i6 = 1;
                                } else if (i21 != 2) {
                                    i6 = 0;
                                } else {
                                    i6 = 2;
                                }
                                if (com.gamericefishpro.space.t3.b.c(aVar3.a, "strokeLineJoin")) {
                                    b2 = -1;
                                    i7 = typedArrayF3.getInt(9, -1);
                                } else {
                                    i7 = -1;
                                    b2 = -1;
                                }
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                if (i7 != 0) {
                                    if (i7 == 1) {
                                        i8 = 1;
                                    } else if (i7 == 2) {
                                        i8 = 2;
                                    }
                                    float fA9 = aVar3.a(typedArrayF3, "strokeMiterLimit", 10, 4.0f);
                                    cVarB = com.gamericefishpro.space.t3.b.b(typedArrayF3, aVar3.a, theme2, "strokeColor", 3);
                                    aVar3.b(typedArrayF3.getChangingConfigurations());
                                    float fA10 = aVar3.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = aVar3.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                    float fA12 = aVar3.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = aVar3.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                    float fA14 = aVar3.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                    if (com.gamericefishpro.space.t3.b.c(aVar3.a, "fillType")) {
                                        i9 = typedArrayF3.getInt(13, 0);
                                    } else {
                                        i9 = 0;
                                    }
                                    aVar3.b(typedArrayF3.getChangingConfigurations());
                                    typedArrayF3.recycle();
                                    shader = (Shader) cVarB2.e;
                                    if (shader == null && cVarB2.d == 0) {
                                        m0Var = null;
                                    } else if (shader != null) {
                                        m0Var = new com.gamericefishpro.space.o1.p(shader);
                                    } else {
                                        m0Var = new m0(com.gamericefishpro.space.o1.o.b(cVarB2.d));
                                    }
                                    shader2 = (Shader) cVarB.e;
                                    if (shader2 != null && cVarB.d == 0) {
                                        oVar = null;
                                    } else {
                                        if (shader2 != null) {
                                            m0Var2 = new com.gamericefishpro.space.o1.p(shader2);
                                        } else {
                                            m0Var2 = new m0(com.gamericefishpro.space.o1.o.b(cVarB.d));
                                        }
                                        oVar = m0Var2;
                                    }
                                    if (i9 == 0) {
                                        i10 = 0;
                                    } else {
                                        i10 = 1;
                                    }
                                    if (eVar.k) {
                                        com.gamericefishpro.space.e2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList2 = eVar.i;
                                    ((com.gamericefishpro.space.u1.d) arrayList2.get(arrayList2.size() - 1)).j.add(new com.gamericefishpro.space.u1.j0(str2, listC, i10, m0Var, fA8, oVar, fA10, fA11, i6, i8, fA9, fA14, fA12, fA13));
                                    i15 = i5;
                                    i3 = 1;
                                }
                                i8 = 0;
                                float fA15 = aVar3.a(typedArrayF3, "strokeMiterLimit", 10, 4.0f);
                                cVarB = com.gamericefishpro.space.t3.b.b(typedArrayF3, aVar3.a, theme2, "strokeColor", 3);
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                float fA16 = aVar3.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                float fA17 = aVar3.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                float fA18 = aVar3.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                float fA19 = aVar3.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                float fA110 = aVar3.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                if (com.gamericefishpro.space.t3.b.c(aVar3.a, "fillType")) {
                                    i9 = 0;
                                } else {
                                    i9 = typedArrayF3.getInt(13, 0);
                                }
                                aVar3.b(typedArrayF3.getChangingConfigurations());
                                typedArrayF3.recycle();
                                shader = (Shader) cVarB2.e;
                                if (shader == null) {
                                    m0Var = null;
                                } else if (shader != null) {
                                    m0Var = new com.gamericefishpro.space.o1.p(shader);
                                } else {
                                    m0Var = new m0(com.gamericefishpro.space.o1.o.b(cVarB2.d));
                                }
                                shader2 = (Shader) cVarB.e;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        m0Var2 = new com.gamericefishpro.space.o1.p(shader2);
                                    } else {
                                        m0Var2 = new m0(com.gamericefishpro.space.o1.o.b(cVarB.d));
                                    }
                                    oVar = m0Var2;
                                } else {
                                    oVar = null;
                                }
                                if (i9 == 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                if (eVar.k) {
                                    com.gamericefishpro.space.e2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ArrayList arrayList3 = eVar.i;
                                ((com.gamericefishpro.space.u1.d) arrayList3.get(arrayList3.size() - 1)).j.add(new com.gamericefishpro.space.u1.j0(str2, listC, i10, m0Var, fA8, oVar, fA16, fA17, i6, i8, fA15, fA110, fA18, fA19));
                                i15 = i5;
                                i3 = 1;
                            } else {
                                i3 = 1;
                                b2 = -1;
                                i15 = i5;
                            }
                        } else {
                            i5 = i15;
                            bVar = bVar;
                            b2 = -1;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayF4 = com.gamericefishpro.space.t3.b.f(resources, theme2, attributeSetAsAttributeSet, com.gamericefishpro.space.v1.b.d);
                                aVar3.b(typedArrayF4.getChangingConfigurations());
                                String string4 = typedArrayF4.getString(0);
                                aVar3.b(typedArrayF4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i3 = 1;
                                String string5 = typedArrayF4.getString(1);
                                aVar3.b(typedArrayF4.getChangingConfigurations());
                                List listC2 = string5 == null ? com.gamericefishpro.space.u1.g0.a : u.C(uVar, string5);
                                typedArrayF4.recycle();
                                if (eVar.k) {
                                    com.gamericefishpro.space.e2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                eVar.i.add(new com.gamericefishpro.space.u1.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listC2, 512));
                                i15 = i5 + 1;
                            } else {
                                i3 = 1;
                                i15 = i5;
                            }
                        }
                    } else {
                        i5 = i15;
                    }
                    i3 = i17;
                    b2 = -1;
                    i15 = i5;
                }
                xml.next();
                bVar = bVar;
                i12 = i18;
            }
            com.gamericefishpro.space.m2.b bVar2 = bVar;
            aVar2 = new com.gamericefishpro.space.m2.a(eVar.b(), i12 | aVar3.b);
            cVar.a.put(bVar2, new WeakReference(aVar2));
        }
        i0 i0VarD = com.gamericefishpro.space.u1.b.d(aVar2.a, rVar);
        rVar.p(false);
        return i0VarD;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x0394  */
    /* JADX WARN: Code duplicated, block: B:180:0x039c  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ba A[LOOP:5: B:188:0x03b8->B:189:0x03ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x040c  */
    /* JADX WARN: Code duplicated, block: B:206:0x01b5 A[EDGE_INSN: B:206:0x01b5->B:72:0x01b5 BREAK  A[LOOP:0: B:9:0x003d->B:70:0x0191], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x018f A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x018f: PHI (r6v12 com.gamericefishpro.space.i1.c) = (r6v11 com.gamericefishpro.space.i1.c), (r6v13 com.gamericefishpro.space.i1.c) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r21v5 com.gamericefishpro.space.q2.a) = (r21v4 com.gamericefishpro.space.q2.a), (r21v6 com.gamericefishpro.space.q2.a) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r22v5 com.gamericefishpro.space.r2.e) = (r22v4 com.gamericefishpro.space.r2.e), (r22v6 com.gamericefishpro.space.r2.e) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r23v13 com.gamericefishpro.space.i1.e) = (r23v12 com.gamericefishpro.space.i1.e), (r23v14 com.gamericefishpro.space.i1.e) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r24v6 com.gamericefishpro.space.i1.l) = (r24v5 com.gamericefishpro.space.i1.l), (r24v7 com.gamericefishpro.space.i1.l) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r26v13 com.gamericefishpro.space.o2.h) = (r26v12 com.gamericefishpro.space.o2.h), (r26v14 com.gamericefishpro.space.o2.h) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r28v7 boolean) = (r28v6 boolean), (r28v8 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0191 A[LOOP:0: B:9:0x003d->B:70:0x0191, LOOP_END] */
    public static final void J(ViewStructure viewStructure, com.gamericefishpro.space.h2.f0 f0Var, AutofillId autofillId, String str, com.gamericefishpro.space.p2.b bVar) {
        long j;
        long j2;
        char c2;
        long j3;
        com.gamericefishpro.space.q2.a aVar;
        com.gamericefishpro.space.r2.e eVar;
        com.gamericefishpro.space.i1.e eVar2;
        com.gamericefishpro.space.o2.h hVar;
        com.gamericefishpro.space.i1.c cVar;
        boolean z;
        boolean z2;
        com.gamericefishpro.space.i1.l lVar;
        Boolean bool;
        boolean z3;
        Integer num;
        boolean z4;
        List list;
        Integer numValueOf;
        boolean z5;
        boolean z6;
        boolean z7;
        String strR;
        int size;
        String strI;
        int i;
        String[] strArrA;
        String[] strArrA2;
        h0 h0Var;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        boolean z8;
        h0 h0Var2;
        com.gamericefishpro.space.q2.a aVar2;
        com.gamericefishpro.space.r2.e eVar3;
        com.gamericefishpro.space.i1.e eVar4;
        com.gamericefishpro.space.o2.h hVar2;
        boolean zBooleanValue;
        int i3;
        v vVar = com.gamericefishpro.space.o2.s.a;
        v vVar2 = com.gamericefishpro.space.o2.k.a;
        com.gamericefishpro.space.o2.l lVarX = f0Var.x();
        int i4 = 8;
        if (lVarX == null || (h0Var2 = lVarX.d) == null) {
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            aVar = null;
            eVar = null;
            eVar2 = null;
            hVar = null;
            cVar = null;
            z = true;
            z2 = false;
            lVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr3 = h0Var2.b;
            j = 128;
            Object[] objArr4 = h0Var2.c;
            long[] jArr = h0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                cVar = null;
                j2 = 255;
                z2 = false;
                aVar2 = null;
                eVar3 = null;
                eVar4 = null;
                lVar = null;
                bool = null;
                hVar2 = null;
                z3 = false;
                zBooleanValue = true;
                num = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                v vVar3 = (v) obj;
                                i3 = i4;
                                if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.r)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    cVar = (com.gamericefishpro.space.i1.c) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.a)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.q)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    lVar = (com.gamericefishpro.space.i1.l) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.s)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    eVar4 = (com.gamericefishpro.space.i1.e) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.E)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    eVar3 = (com.gamericefishpro.space.r2.e) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.k)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.M)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.I)) {
                                    z3 = true;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.n)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.x)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    hVar2 = (com.gamericefishpro.space.o2.h) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.G)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.s.H)) {
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (com.gamericefishpro.space.q2.a) obj2;
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.k.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.k.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.k.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.a(vVar3, com.gamericefishpro.space.o2.k.k)) {
                                    z2 = true;
                                }
                            } else {
                                i3 = i4;
                            }
                            j4 >>= i3;
                            i7++;
                            i4 = i3;
                        }
                        if (i6 != i4) {
                            break;
                        }
                        if (i5 != length) {
                            break;
                        }
                        i5++;
                        i4 = 8;
                    } else if (i5 != length) {
                        break;
                        break;
                    } else {
                        i5++;
                        i4 = 8;
                    }
                }
            } else {
                j2 = 255;
                c2 = 7;
                j3 = -9187201950435737472L;
                cVar = null;
                z2 = false;
                aVar2 = null;
                eVar3 = null;
                eVar4 = null;
                lVar = null;
                bool = null;
                hVar2 = null;
                z3 = false;
                zBooleanValue = true;
                num = null;
            }
            aVar = aVar2;
            eVar = eVar3;
            eVar2 = eVar4;
            hVar = hVar2;
            z = zBooleanValue;
        }
        com.gamericefishpro.space.o2.l lVarX2 = f0Var.x();
        if (lVarX2 != null && lVarX2.i && !lVarX2.v) {
            lVarX2 = lVarX2.c();
            d0 d0Var = new d0(((com.gamericefishpro.space.v0.b) f0Var.n()).d.i);
            d0Var.c(f0Var.n());
            while (d0Var.i()) {
                com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) d0Var.k(d0Var.b - 1);
                com.gamericefishpro.space.o2.l lVarX3 = f0Var2.x();
                if (lVarX3 != null && !lVarX3.i) {
                    lVarX2.f(lVarX3);
                    if (!lVarX3.v) {
                        d0Var.c(f0Var2.n());
                    }
                }
            }
        }
        if (lVarX2 == null || (h0Var = lVarX2.d) == null) {
            z4 = z;
            list = null;
        } else {
            Object[] objArr5 = h0Var.b;
            Object[] objArr6 = h0Var.c;
            long[] jArr2 = h0Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr7 = objArr5;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j5 & j2) < j) {
                                int i12 = (i9 << 3) + i11;
                                Object obj3 = objArr7[i12];
                                i2 = i11;
                                Object obj4 = objArr6[i12];
                                objArr2 = objArr6;
                                v vVar4 = (v) obj3;
                                z8 = z;
                                if (Intrinsics.a(vVar4, com.gamericefishpro.space.o2.s.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.a(vVar4, com.gamericefishpro.space.o2.s.A)) {
                                    Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                i2 = i11;
                                objArr2 = objArr6;
                                z8 = z;
                            }
                            j5 >>= 8;
                            i11 = i2 + 1;
                            objArr6 = objArr2;
                            z = z8;
                        }
                        objArr = objArr6;
                        z4 = z;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr6;
                        z4 = z;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    objArr5 = objArr7;
                    jArr2 = jArr3;
                    objArr6 = objArr;
                    z = z4;
                }
            } else {
                z4 = z;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(f0Var.e);
        if (f0Var.v() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (cVar != null) {
            numValueOf = Integer.valueOf(cVar.a);
        } else if (z2) {
            numValueOf = 1;
        } else {
            numValueOf = aVar != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (eVar != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(eVar.e));
        }
        if (eVar2 != null) {
            viewStructure.setAutofillValue(eVar2.a);
        }
        if (lVar != null && (strArrA2 = d5.A(lVar)) != null) {
            viewStructure.setAutofillHints(strArrA2);
        }
        bVar.a.m(f0Var.e, new com.gamericefishpro.space.i1.m(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(aVar == com.gamericefishpro.space.q2.a.d);
        } else if (bool != null && (hVar == null || hVar.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        com.gamericefishpro.space.i1.l.a.getClass();
        String str2 = (String) com.gamericefishpro.space.ph.v.p(d5.A(com.gamericefishpro.space.i1.k.b));
        if (lVar != null && (strArrA = d5.A(lVar)) != null) {
            z5 = true;
            boolean z9 = com.gamericefishpro.space.ph.v.n(strArrA, str2);
            if (!z3 || z9) {
                z6 = z5;
            } else {
                z6 = false;
            }
            if (!z6 || z4) {
                z7 = z5;
            } else {
                z7 = false;
            }
            viewStructure.setDataIsSensitive(z7);
            viewStructure.setVisibility(f0Var.Z.d.S0() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strI = "";
                for (i = 0; i < size; i++) {
                    com.gamericefishpro.space.r2.e eVar5 = (com.gamericefishpro.space.r2.e) list.get(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strI);
                    strI = y0.i(sb, eVar5.e, '\n');
                }
                viewStructure.setText(strI);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((com.gamericefishpro.space.v0.b) f0Var.n()).isEmpty() && hVar != null && (strR = com.gamericefishpro.space.i2.f0.r(hVar.a)) != null) {
                viewStructure.setClassName(strR);
            }
            if (z2) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z6) {
                    viewStructure.setInputType(129);
                }
            }
        }
        z5 = true;
        if (z3) {
            z6 = z5;
        } else {
            z6 = z5;
        }
        if (z6) {
            z7 = z5;
        } else {
            z7 = z5;
        }
        viewStructure.setDataIsSensitive(z7);
        viewStructure.setVisibility(f0Var.Z.d.S0() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strI = "";
            while (i < size) {
                com.gamericefishpro.space.r2.e eVar6 = (com.gamericefishpro.space.r2.e) list.get(i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strI);
                strI = y0.i(sb2, eVar6.e, '\n');
            }
            viewStructure.setText(strI);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((com.gamericefishpro.space.v0.b) f0Var.n()).isEmpty()) {
            viewStructure.setClassName(strR);
        }
        if (z2) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z6) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static final long L(long j, com.gamericefishpro.space.ni.d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        com.gamericefishpro.space.ni.d dVar = com.gamericefishpro.space.ni.d.NANOSECONDS;
        long jB = com.gamericefishpro.space.ni.e.b(4611686018426999999L, dVar, unit);
        if ((-jB) > j || j > jB) {
            return r(com.gamericefishpro.space.ji.f.d(com.gamericefishpro.space.ni.e.a(j, unit, com.gamericefishpro.space.ni.d.MILLISECONDS)));
        }
        long jB2 = com.gamericefishpro.space.ni.e.b(j, unit, dVar) << 1;
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        int i = com.gamericefishpro.space.ni.c.a;
        return jB2;
    }

    public static String M(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.g1.b, com.gamericefishpro.space.g1.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList N(d2 d2Var, int i, Integer num) {
        ?? lVar = new com.gamericefishpro.space.g1.l(d2Var);
        i = d2Var.q(i);
        com.gamericefishpro.space.t0.a aVarA = d2Var.a(i);
        while (i >= 0) {
            lVar.n(d2Var.i(i), d2Var.k(i) ? d2Var.p(d2Var.b, i) : com.gamericefishpro.space.t0.n.a, d2Var.a.i(i), num);
            if (i >= 0) {
                com.gamericefishpro.space.t0.a aVar = aVarA;
                aVarA = d2Var.a(i);
                i = d2Var.q(i);
                num = aVar;
            } else {
                num = aVarA;
            }
        }
        return (ArrayList) lVar.d;
    }

    public static int O(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static com.gamericefishpro.space.c3.d a() {
        return new com.gamericefishpro.space.c3.d(1.0f, 1.0f);
    }

    public static final void b(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(1221854765);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-1104341180);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.f(jVar, 56), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = g1.c;
            float f2 = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f2, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f2, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, com.gamericefishpro.space.o1.s.c(j, 0.5f), dVar2);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 7);
        }
    }

    public static final void c(com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        rVar2.b0(1929505860);
        if (i == 0 && rVar2.E()) {
            rVar2.V();
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            float f2 = 20;
            long j = com.gamericefishpro.space.o1.s.c;
            float f3 = 16;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f2)), a0.c(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.l7.c.b, 0.9f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278232063L), 0.7f))), 0.0f, 0.0f, 14), null, 6), 1, com.gamericefishpro.space.o1.s.c(j, 0.4f), com.gamericefishpro.space.k0.e.a(f2)), f3, 42);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarM, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(jVar, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.f(jVar, 48), com.gamericefishpro.space.k0.e.a), com.gamericefishpro.space.o1.s.c(j, 0.2f), com.gamericefishpro.space.o1.o.b);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarE, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar4);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.i.a.u(), null, g1.f(jVar, 28), com.gamericefishpro.space.l7.c.e, rVar2, 3504);
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f3), rVar2);
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode4 = Long.hashCode(rVar2.T);
            l1 l1VarL4 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(jVar, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL4, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF4, eVar4);
            r0.a("Keep fishing!", null, j, com.gamericefishpro.space.hj.c.C(17), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597830, 0, 262058);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 2), rVar);
            r0.a("Every great angler started with one catch. Complete more levels to build your legacy!", null, com.gamericefishpro.space.o1.s.c(j, 0.9f), com.gamericefishpro.space.hj.c.C(13), null, 0L, null, com.gamericefishpro.space.hj.c.C(18), 0, false, 0, 0, null, rVar, 24966, 48, 260074);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g7.a(i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x025c  */
    /* JADX WARN: Code duplicated, block: B:223:0x048e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0492  */
    /* JADX WARN: Code duplicated, block: B:227:0x049d  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:244:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:245:0x0507  */
    /* JADX WARN: Code duplicated, block: B:247:0x051d  */
    /* JADX WARN: Code duplicated, block: B:275:0x05d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:277:0x05db  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:282:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:286:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x0607 A[LOOP:11: B:284:0x05f7->B:288:0x0607, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x063b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0643  */
    /* JADX WARN: Code duplicated, block: B:296:0x0649  */
    /* JADX WARN: Code duplicated, block: B:297:0x064c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0657  */
    /* JADX WARN: Code duplicated, block: B:301:0x065e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0664 A[LOOP:13: B:304:0x0664->B:306:0x0673, LOOP_START, PHI: r11
      0x0664: PHI (r11v25 com.gamericefishpro.space.f5.x) = (r11v24 com.gamericefishpro.space.f5.x), (r11v27 com.gamericefishpro.space.f5.x) binds: [B:302:0x0660, B:306:0x0673] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0673 A[LOOP:13: B:304:0x0664->B:306:0x0673, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x0683  */
    /* JADX WARN: Code duplicated, block: B:537:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x067d A[EDGE_INSN: B:555:0x067d->B:307:0x067d BREAK  A[LOOP:13: B:304:0x0664->B:306:0x0673], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:244:0x04e5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.gamericefishpro.space.w.l1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.gamericefishpro.space.g5.p] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.gamericefishpro.space.t0.r] */
    /* JADX WARN: Type inference failed for: r13v28, types: [com.gamericefishpro.space.t0.r] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.gamericefishpro.space.w.l1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r9v36, types: [com.gamericefishpro.space.f5.x, com.gamericefishpro.space.f5.z] */
    public static final void d(final com.gamericefishpro.space.f5.d0 d0Var, final com.gamericefishpro.space.f5.z zVar, final com.gamericefishpro.space.h1.m mVar, final com.gamericefishpro.space.h1.e eVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, com.gamericefishpro.space.t0.r rVar, final int i) {
        q0 q0Var;
        com.gamericefishpro.space.i5.g gVar;
        com.gamericefishpro.space.z4.u uVar;
        v0 v0Var;
        Object wVar;
        v0 v0Var2;
        int i2;
        com.gamericefishpro.space.th.a aVar;
        ?? r10;
        com.gamericefishpro.space.g5.p pVar;
        Object obj;
        final v0 v0Var3;
        final com.gamericefishpro.space.g5.i iVar;
        Function1 function5;
        int i3;
        com.gamericefishpro.space.th.a aVar2;
        s0 s0Var;
        com.gamericefishpro.space.f5.k kVar;
        ?? r22;
        ?? r23;
        com.gamericefishpro.space.t.b0 b0Var;
        com.gamericefishpro.space.g5.i iVar2;
        int[] intArray;
        com.gamericefishpro.space.i5.g gVar2;
        String str;
        com.gamericefishpro.space.b9.b bVar;
        int[] deepLink;
        ArrayList arrayList;
        com.gamericefishpro.space.f5.z zVar2;
        int length;
        int i4;
        String strA;
        int length2;
        Bundle[] bundleArr;
        int i5;
        int i6;
        boolean z;
        com.gamericefishpro.space.b9.b bVar2;
        com.gamericefishpro.space.f5.z zVar3;
        int length3;
        int i7;
        int i8;
        Bundle bundle;
        com.gamericefishpro.space.f5.x xVarA;
        com.gamericefishpro.space.f5.z zVar4;
        com.gamericefishpro.space.i5.j jVar;
        int i9;
        int i10;
        int i11;
        Bundle bundle2;
        com.gamericefishpro.space.f5.x xVarD;
        Bundle from;
        int i12;
        com.gamericefishpro.space.f5.x xVarA2;
        com.gamericefishpro.space.f5.z zVar5;
        com.gamericefishpro.space.f5.z zVar6;
        ?? r13;
        final com.gamericefishpro.space.f5.z graph = zVar;
        rVar.b0(-1964664536);
        int i13 = (i & 6) == 0 ? (rVar.h(d0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i13 |= rVar.h(graph) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i13 |= rVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i13 |= rVar.f(eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i13 |= rVar.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i13 |= rVar.h(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i13 |= rVar.h(function3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i13 |= rVar.h(function4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i13 |= rVar.h(null) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if ((38347923 & i14) == 38347922 && rVar.E()) {
            rVar.V();
            r13 = rVar;
        } else {
            rVar.X();
            if ((i & 1) != 0 && !rVar.B()) {
                rVar.V();
            }
            rVar.q();
            com.gamericefishpro.space.z4.u uVar2 = (com.gamericefishpro.space.z4.u) rVar.j(com.gamericefishpro.space.a5.i.a);
            com.gamericefishpro.space.z4.y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar);
            if (y0VarA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            x0 viewModelStore = y0VarA.f();
            d0Var.getClass();
            com.gamericefishpro.space.i5.g gVar3 = d0Var.b;
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            gVar3.getClass();
            q0 q0Var2 = gVar3.s;
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            if (!Intrinsics.a(gVar3.o, com.gamericefishpro.space.f5.h.c(viewModelStore))) {
                if (!gVar3.f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                gVar3.o = com.gamericefishpro.space.f5.h.c(viewModelStore);
            }
            Intrinsics.checkNotNullParameter(graph, "graph");
            gVar3.getClass();
            Intrinsics.checkNotNullParameter(graph, "graph");
            LinkedHashMap linkedHashMap = gVar3.t;
            Intrinsics.checkNotNullParameter(graph, "graph");
            com.gamericefishpro.space.ph.r<com.gamericefishpro.space.f5.k> rVar2 = gVar3.f;
            if (!rVar2.isEmpty() && gVar3.i() == com.gamericefishpro.space.z4.p.d) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (Intrinsics.a(gVar3.c, graph)) {
                q0Var = q0Var2;
                gVar = gVar3;
                i14 = i14;
                uVar = uVar2;
                int iF = graph.y.b.f();
                for (int i15 = 0; i15 < iF; i15++) {
                    com.gamericefishpro.space.f5.x xVar = (com.gamericefishpro.space.f5.x) graph.y.b.g(i15);
                    com.gamericefishpro.space.f5.z zVar7 = gVar.c;
                    Intrinsics.b(zVar7);
                    int iD = zVar7.y.b.d(i15);
                    com.gamericefishpro.space.f5.z zVar8 = gVar.c;
                    Intrinsics.b(zVar8);
                    com.gamericefishpro.space.t.s0 s0Var2 = zVar8.y.b;
                    if (s0Var2.d) {
                        com.gamericefishpro.space.t.r.a(s0Var2);
                    }
                    int iA = com.gamericefishpro.space.u.a.a(s0Var2.v, iD, s0Var2.e);
                    if (iA >= 0) {
                        Object[] objArr = s0Var2.i;
                        Object obj2 = objArr[iA];
                        objArr[iA] = xVar;
                    }
                }
                for (com.gamericefishpro.space.f5.k kVar2 : rVar2) {
                    int i16 = com.gamericefishpro.space.f5.x.w;
                    p0 p0VarO = com.gamericefishpro.space.ph.d0.o(com.gamericefishpro.space.li.m.e(com.gamericefishpro.space.f5.h.b(kVar2.e)));
                    com.gamericefishpro.space.f5.x xVarA3 = gVar.c;
                    Intrinsics.b(xVarA3);
                    Iterator it = p0VarO.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((com.gamericefishpro.space.f1.f0) it).e;
                        if (listIterator.hasPrevious()) {
                            com.gamericefishpro.space.f5.x xVar2 = (com.gamericefishpro.space.f5.x) listIterator.previous();
                            if (!Intrinsics.a(xVar2, gVar.c) || !Intrinsics.a(xVarA3, graph)) {
                                if (xVarA3 instanceof com.gamericefishpro.space.f5.z) {
                                    xVarA3 = ((com.gamericefishpro.space.f5.z) xVarA3).y.a(xVar2.e.a);
                                    Intrinsics.b(xVarA3);
                                }
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(xVarA3, "<set-?>");
                    kVar2.e = xVarA3;
                }
            } else {
                com.gamericefishpro.space.f5.z zVar9 = gVar3.c;
                if (zVar9 != null) {
                    ArrayList arrayList2 = new ArrayList(gVar3.l.keySet());
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList2.get(i17);
                        int i18 = i17 + 1;
                        Integer num = (Integer) obj3;
                        Intrinsics.b(num);
                        int i19 = size;
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((com.gamericefishpro.space.f5.o) it2.next()).d = true;
                            i18 = i18;
                        }
                        int i20 = i18;
                        boolean zS = gVar3.s(iIntValue, null, com.gamericefishpro.space.f5.h.g(new com.gamericefishpro.space.f5.q(17)));
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((com.gamericefishpro.space.f5.o) it3.next()).d = false;
                            it3 = it3;
                            zS = zS;
                        }
                        if (zS) {
                            gVar3.n(iIntValue, true, false);
                        }
                        size = i19;
                        i17 = i20;
                    }
                    gVar3.n(zVar9.e.a, true, false);
                }
                gVar3.c = graph;
                q0 q0Var3 = gVar3.s;
                com.gamericefishpro.space.f5.d0 d0Var2 = gVar3.a;
                com.gamericefishpro.space.b9.b bVar3 = d0Var2.c;
                Bundle source = gVar3.d;
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState:names", "key");
                    if (source.containsKey("android-support-nav:controller:navigatorState:names")) {
                        Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState:names", "key");
                        ArrayList<String> stringArrayList = source.getStringArrayList("android-support-nav:controller:navigatorState:names");
                        if (stringArrayList == null) {
                            com.gamericefishpro.space.wa.b.K("android-support-nav:controller:navigatorState:names");
                            throw null;
                        }
                        int size2 = stringArrayList.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            String str2 = stringArrayList.get(i21);
                            i21++;
                            int i22 = size2;
                            String key = str2;
                            q0Var3.b(key);
                            Intrinsics.checkNotNullParameter(key, "key");
                            if (source.containsKey(key)) {
                                Bundle savedState = B(key, source);
                                Intrinsics.checkNotNullParameter(savedState, "savedState");
                                source = source;
                            }
                            size2 = i22;
                        }
                    }
                }
                Bundle[] bundleArr2 = gVar3.e;
                if (bundleArr2 != null) {
                    int length4 = bundleArr2.length;
                    int i23 = 0;
                    while (i23 < length4) {
                        int i24 = i23;
                        int i25 = length4;
                        com.gamericefishpro.space.f5.l lVar = new com.gamericefishpro.space.f5.l(bundleArr2[i24]);
                        com.gamericefishpro.space.r8.m mVar2 = lVar.a;
                        com.gamericefishpro.space.z4.u uVar3 = uVar2;
                        com.gamericefishpro.space.f5.x xVarD2 = gVar3.d(mVar2.a, null);
                        if (xVarD2 == null) {
                            int i26 = com.gamericefishpro.space.f5.x.w;
                            StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Restoring the Navigation back stack failed: destination ", com.gamericefishpro.space.f5.h.a(bVar3, mVar2.a), " cannot be found from the current destination ");
                            sbL.append(gVar3.g());
                            throw new IllegalStateException(sbL.toString());
                        }
                        com.gamericefishpro.space.f5.k kVarA = lVar.a(bVar3, xVarD2, gVar3.i(), gVar3.o);
                        com.gamericefishpro.space.f5.p0 navigator = q0Var3.b(xVarD2.d);
                        Object oVar = linkedHashMap.get(navigator);
                        if (oVar == null) {
                            Intrinsics.checkNotNullParameter(navigator, "navigator");
                            oVar = new com.gamericefishpro.space.f5.o(d0Var2, navigator);
                            linkedHashMap.put(navigator, oVar);
                        }
                        rVar2.addLast(kVarA);
                        ((com.gamericefishpro.space.f5.o) oVar).a(kVarA);
                        com.gamericefishpro.space.f5.z zVar10 = kVarA.e.i;
                        if (zVar10 != null) {
                            gVar3.k(kVarA, gVar3.f(zVar10.e.a));
                        }
                        i23 = i24 + 1;
                        length4 = i25;
                        uVar2 = uVar3;
                    }
                    uVar = uVar2;
                    gVar3.b.invoke();
                    gVar3.e = null;
                } else {
                    uVar = uVar2;
                }
                Collection collectionValues = com.gamericefishpro.space.ph.m0.h(q0Var3.a).values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : collectionValues) {
                    if (!((com.gamericefishpro.space.f5.p0) obj4).b) {
                        arrayList3.add(obj4);
                    }
                }
                int size3 = arrayList3.size();
                int i27 = 0;
                while (i27 < size3) {
                    Object obj5 = arrayList3.get(i27);
                    i27++;
                    com.gamericefishpro.space.f5.p0 navigator2 = (com.gamericefishpro.space.f5.p0) obj5;
                    Object oVar2 = linkedHashMap.get(navigator2);
                    if (oVar2 == null) {
                        Intrinsics.checkNotNullParameter(navigator2, "navigator");
                        oVar2 = new com.gamericefishpro.space.f5.o(d0Var2, navigator2);
                        linkedHashMap.put(navigator2, oVar2);
                    }
                    com.gamericefishpro.space.f5.o state = (com.gamericefishpro.space.f5.o) oVar2;
                    navigator2.getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    navigator2.a = state;
                    navigator2.b = true;
                    rVar2 = rVar2;
                }
                com.gamericefishpro.space.ph.r rVar3 = rVar2;
                if (gVar3.c == null || !rVar3.isEmpty()) {
                    q0Var = q0Var2;
                    gVar = gVar3;
                    gVar.b();
                } else {
                    Activity activity = d0Var2.d;
                    if (d0Var2.e || activity == null) {
                        q0Var = q0Var2;
                        gVar = gVar3;
                    } else {
                        Intent intent = activity.getIntent();
                        com.gamericefishpro.space.i5.g gVar4 = d0Var2.b;
                        if (intent == null) {
                            q0Var = q0Var2;
                            gVar2 = gVar3;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e2) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            com.gamericefishpro.space.ph.m0.c();
                            ArrayList arrayList4 = parcelableArrayList;
                            Bundle source2 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            Intrinsics.checkNotNullParameter(source2, "source");
                            Bundle from2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (from2 != null) {
                                Intrinsics.checkNotNullParameter(source2, "source");
                                Intrinsics.checkNotNullParameter(from2, "from");
                                source2.putAll(from2);
                            }
                            if (intArray == null || intArray.length == 0) {
                                ?? J = gVar4.j();
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                q0Var = q0Var2;
                                gVar2 = gVar3;
                                str = " cannot be found from the current destination ";
                                com.gamericefishpro.space.f5.w wVarF = J.f(new com.gamericefishpro.space.a8.c((Object) intent.getData(), intent.getAction(), (Object) intent.getType(), 7), J);
                                if (wVarF != null) {
                                    com.gamericefishpro.space.f5.x xVar3 = wVarF.d;
                                    com.gamericefishpro.space.ph.r rVar4 = new com.gamericefishpro.space.ph.r();
                                    com.gamericefishpro.space.f5.x xVar4 = xVar3;
                                    while (true) {
                                        w1 w1Var = xVar4.e;
                                        com.gamericefishpro.space.f5.z zVar11 = xVar4.i;
                                        bVar = bVar3;
                                        if (zVar11 == null || zVar11.y.c != w1Var.a) {
                                            rVar4.addFirst(xVar4);
                                        }
                                        if (Intrinsics.a(zVar11, null) || zVar11 == null) {
                                            break;
                                        }
                                        xVar4 = zVar11;
                                        bVar3 = bVar;
                                    }
                                    List listL = CollectionsKt.L(rVar4);
                                    ArrayList arrayList5 = new ArrayList(com.gamericefishpro.space.ph.y.j(listL, 10));
                                    Iterator it4 = listL.iterator();
                                    while (it4.hasNext()) {
                                        arrayList5.add(Integer.valueOf(((com.gamericefishpro.space.f5.x) it4.next()).e.a));
                                    }
                                    int[] iArrK = CollectionsKt.K(arrayList5);
                                    Bundle from3 = xVar3.b(wVarF.e);
                                    if (from3 != null) {
                                        Intrinsics.checkNotNullParameter(source2, "source");
                                        Intrinsics.checkNotNullParameter(from3, "from");
                                        source2.putAll(from3);
                                    }
                                    deepLink = iArrK;
                                    arrayList = null;
                                }
                                if (deepLink != null && deepLink.length != 0) {
                                    gVar4.getClass();
                                    Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                                    zVar2 = gVar4.c;
                                    length = deepLink.length;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < length) {
                                            strA = null;
                                            break;
                                        }
                                        i12 = deepLink[i4];
                                        if (i4 == 0) {
                                            zVar6 = gVar4.c;
                                            Intrinsics.b(zVar6);
                                            if (zVar6.e.a == i12) {
                                                xVarA2 = gVar4.c;
                                            } else {
                                                xVarA2 = null;
                                            }
                                        } else {
                                            Intrinsics.b(zVar2);
                                            xVarA2 = zVar2.y.a(i12);
                                        }
                                        if (xVarA2 == null) {
                                            int i28 = com.gamericefishpro.space.f5.x.w;
                                            strA = com.gamericefishpro.space.f5.h.a(gVar4.a.c, i12);
                                            break;
                                        }
                                        if (i4 == deepLink.length - 1 && (xVarA2 instanceof com.gamericefishpro.space.f5.z)) {
                                            while (true) {
                                                zVar5 = (com.gamericefishpro.space.f5.z) xVarA2;
                                                Intrinsics.b(zVar5);
                                                com.gamericefishpro.space.i5.j jVar2 = zVar5.y;
                                                if (!(jVar2.a(jVar2.c) instanceof com.gamericefishpro.space.f5.z)) {
                                                    break;
                                                } else {
                                                    xVarA2 = jVar2.a(jVar2.c);
                                                }
                                            }
                                            zVar2 = zVar5;
                                        }
                                        i4++;
                                    }
                                    if (strA != null) {
                                        String message = "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent;
                                        Intrinsics.checkNotNullParameter("NavController", "tag");
                                        Intrinsics.checkNotNullParameter(message, "message");
                                    } else {
                                        Intrinsics.checkNotNullParameter(source2, "source");
                                        Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
                                        Intrinsics.checkNotNullParameter(intent, "value");
                                        source2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        length2 = deepLink.length;
                                        bundleArr = new Bundle[length2];
                                        for (i5 = 0; i5 < length2; i5++) {
                                            com.gamericefishpro.space.ph.m0.c();
                                            Bundle source3 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                            Intrinsics.checkNotNullParameter(source3, "source");
                                            Intrinsics.checkNotNullParameter(source2, "from");
                                            source3.putAll(source2);
                                            if (arrayList == null && (from = (Bundle) arrayList.get(i5)) != null) {
                                                Intrinsics.checkNotNullParameter(from, "from");
                                                source3.putAll(from);
                                            }
                                            bundleArr[i5] = source3;
                                        }
                                        int flags = intent.getFlags();
                                        i6 = 268435456 & flags;
                                        if (i6 == 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            com.gamericefishpro.space.r3.r rVar5 = new com.gamericefishpro.space.r3.r(d0Var2.a);
                                            ComponentName component = intent.getComponent();
                                            Context context = rVar5.e;
                                            if (component == null) {
                                                component = intent.resolveActivity(context.getPackageManager());
                                            }
                                            ArrayList arrayList6 = rVar5.d;
                                            if (component != null) {
                                                int size4 = arrayList6.size();
                                                try {
                                                    for (Intent intentV = com.gamericefishpro.space.i.a.v(context, component); intentV != null; intentV = com.gamericefishpro.space.i.a.v(context, intentV.getComponent())) {
                                                        arrayList6.add(size4, intentV);
                                                    }
                                                } catch (PackageManager.NameNotFoundException e3) {
                                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                    throw new IllegalArgumentException(e3);
                                                }
                                            }
                                            arrayList6.add(intent);
                                            Intrinsics.checkNotNullExpressionValue(rVar5, "addNextIntentWithParentStack(...)");
                                            if (arrayList6.isEmpty()) {
                                                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                            }
                                            Intent[] intentArr = (Intent[]) arrayList6.toArray(new Intent[0]);
                                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                            context.startActivities(intentArr, null);
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else {
                                            if (i6 != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                if (!gVar4.f.isEmpty()) {
                                                    com.gamericefishpro.space.f5.z zVar12 = gVar4.c;
                                                    Intrinsics.b(zVar12);
                                                    gVar4.n(zVar12.e.a, true, false);
                                                }
                                                i9 = 0;
                                                while (i9 < deepLink.length) {
                                                    i10 = deepLink[i9];
                                                    i11 = i9 + 1;
                                                    bundle2 = bundleArr[i9];
                                                    xVarD = gVar4.d(i10, null);
                                                    if (xVarD == null) {
                                                        int i29 = com.gamericefishpro.space.f5.x.w;
                                                        StringBuilder sbL2 = com.gamericefishpro.space.m5.a.l("Deep Linking failed: destination ", com.gamericefishpro.space.f5.h.a(bVar, i10), str);
                                                        sbL2.append(gVar4.g());
                                                        throw new IllegalStateException(sbL2.toString());
                                                    }
                                                    gVar4.l(xVarD, bundle2, com.gamericefishpro.space.f5.h.g(new com.gamericefishpro.space.d0.q0(9, xVarD, d0Var2)));
                                                    i9 = i11;
                                                }
                                                d0Var2.e = true;
                                            } else {
                                                bVar2 = bVar;
                                                zVar3 = gVar4.c;
                                                length3 = deepLink.length;
                                                for (i7 = 0; i7 < length3; i7++) {
                                                    i8 = deepLink[i7];
                                                    bundle = bundleArr[i7];
                                                    if (i7 == 0) {
                                                        xVarA = gVar4.c;
                                                    } else {
                                                        Intrinsics.b(zVar3);
                                                        xVarA = zVar3.y.a(i8);
                                                    }
                                                    if (xVarA == null) {
                                                        int i30 = com.gamericefishpro.space.f5.x.w;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + com.gamericefishpro.space.f5.h.a(bVar2, i8) + " cannot be found in graph " + zVar3);
                                                    }
                                                    if (i7 == deepLink.length - 1) {
                                                        com.gamericefishpro.space.f5.z zVar13 = gVar4.c;
                                                        Intrinsics.b(zVar13);
                                                        gVar4.l(xVarA, bundle, new com.gamericefishpro.space.f5.g0(false, false, zVar13.e.a, true, false, 0, 0));
                                                    } else if (xVarA instanceof com.gamericefishpro.space.f5.z) {
                                                        while (true) {
                                                            zVar4 = (com.gamericefishpro.space.f5.z) xVarA;
                                                            Intrinsics.b(zVar4);
                                                            jVar = zVar4.y;
                                                            if (!(jVar.a(jVar.c) instanceof com.gamericefishpro.space.f5.z)) {
                                                                break;
                                                            } else {
                                                                xVarA = jVar.a(jVar.c);
                                                            }
                                                        }
                                                        zVar3 = zVar4;
                                                    }
                                                }
                                                d0Var2.e = true;
                                            }
                                        }
                                        graph = zVar;
                                        gVar = gVar2;
                                    }
                                }
                            } else {
                                q0Var = q0Var2;
                                gVar2 = gVar3;
                                str = " cannot be found from the current destination ";
                            }
                            bVar = bVar3;
                            arrayList = arrayList4;
                            deepLink = intArray;
                            if (deepLink != null) {
                                gVar4.getClass();
                                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                                zVar2 = gVar4.c;
                                length = deepLink.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                        strA = null;
                                        break;
                                    }
                                    i12 = deepLink[i4];
                                    if (i4 == 0) {
                                        zVar6 = gVar4.c;
                                        Intrinsics.b(zVar6);
                                        if (zVar6.e.a == i12) {
                                            xVarA2 = gVar4.c;
                                        } else {
                                            xVarA2 = null;
                                        }
                                    } else {
                                        Intrinsics.b(zVar2);
                                        xVarA2 = zVar2.y.a(i12);
                                    }
                                    if (xVarA2 == null) {
                                        int i210 = com.gamericefishpro.space.f5.x.w;
                                        strA = com.gamericefishpro.space.f5.h.a(gVar4.a.c, i12);
                                        break;
                                    } else {
                                        if (i4 == deepLink.length - 1) {
                                        }
                                        i4++;
                                    }
                                }
                                if (strA != null) {
                                    String message2 = "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent;
                                    Intrinsics.checkNotNullParameter("NavController", "tag");
                                    Intrinsics.checkNotNullParameter(message2, "message");
                                } else {
                                    Intrinsics.checkNotNullParameter(source2, "source");
                                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
                                    Intrinsics.checkNotNullParameter(intent, "value");
                                    source2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    length2 = deepLink.length;
                                    bundleArr = new Bundle[length2];
                                    while (i5 < length2) {
                                        com.gamericefishpro.space.ph.m0.c();
                                        Bundle source4 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                        Intrinsics.checkNotNullParameter(source4, "source");
                                        Intrinsics.checkNotNullParameter(source2, "from");
                                        source4.putAll(source2);
                                        if (arrayList == null) {
                                        }
                                        bundleArr[i5] = source4;
                                    }
                                    int flags2 = intent.getFlags();
                                    i6 = 268435456 & flags2;
                                    if (i6 == 0) {
                                        if (i6 != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            if (!gVar4.f.isEmpty()) {
                                                com.gamericefishpro.space.f5.z zVar14 = gVar4.c;
                                                Intrinsics.b(zVar14);
                                                gVar4.n(zVar14.e.a, true, false);
                                            }
                                            i9 = 0;
                                            while (i9 < deepLink.length) {
                                                i10 = deepLink[i9];
                                                i11 = i9 + 1;
                                                bundle2 = bundleArr[i9];
                                                xVarD = gVar4.d(i10, null);
                                                if (xVarD == null) {
                                                    int i211 = com.gamericefishpro.space.f5.x.w;
                                                    StringBuilder sbL3 = com.gamericefishpro.space.m5.a.l("Deep Linking failed: destination ", com.gamericefishpro.space.f5.h.a(bVar, i10), str);
                                                    sbL3.append(gVar4.g());
                                                    throw new IllegalStateException(sbL3.toString());
                                                }
                                                gVar4.l(xVarD, bundle2, com.gamericefishpro.space.f5.h.g(new com.gamericefishpro.space.d0.q0(9, xVarD, d0Var2)));
                                                i9 = i11;
                                            }
                                            d0Var2.e = true;
                                        } else {
                                            bVar2 = bVar;
                                            zVar3 = gVar4.c;
                                            length3 = deepLink.length;
                                            while (i7 < length3) {
                                                i8 = deepLink[i7];
                                                bundle = bundleArr[i7];
                                                if (i7 == 0) {
                                                    xVarA = gVar4.c;
                                                } else {
                                                    Intrinsics.b(zVar3);
                                                    xVarA = zVar3.y.a(i8);
                                                }
                                                if (xVarA == null) {
                                                    int i31 = com.gamericefishpro.space.f5.x.w;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + com.gamericefishpro.space.f5.h.a(bVar2, i8) + " cannot be found in graph " + zVar3);
                                                }
                                                if (i7 == deepLink.length - 1) {
                                                    com.gamericefishpro.space.f5.z zVar15 = gVar4.c;
                                                    Intrinsics.b(zVar15);
                                                    gVar4.l(xVarA, bundle, new com.gamericefishpro.space.f5.g0(false, false, zVar15.e.a, true, false, 0, 0));
                                                } else if (xVarA instanceof com.gamericefishpro.space.f5.z) {
                                                    while (true) {
                                                        zVar4 = (com.gamericefishpro.space.f5.z) xVarA;
                                                        Intrinsics.b(zVar4);
                                                        jVar = zVar4.y;
                                                        if (!(jVar.a(jVar.c) instanceof com.gamericefishpro.space.f5.z)) {
                                                            break;
                                                            break;
                                                        }
                                                        xVarA = jVar.a(jVar.c);
                                                    }
                                                    zVar3 = zVar4;
                                                }
                                            }
                                            d0Var2.e = true;
                                        }
                                    } else {
                                        if (i6 != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            if (!gVar4.f.isEmpty()) {
                                                com.gamericefishpro.space.f5.z zVar16 = gVar4.c;
                                                Intrinsics.b(zVar16);
                                                gVar4.n(zVar16.e.a, true, false);
                                            }
                                            i9 = 0;
                                            while (i9 < deepLink.length) {
                                                i10 = deepLink[i9];
                                                i11 = i9 + 1;
                                                bundle2 = bundleArr[i9];
                                                xVarD = gVar4.d(i10, null);
                                                if (xVarD == null) {
                                                    int i212 = com.gamericefishpro.space.f5.x.w;
                                                    StringBuilder sbL4 = com.gamericefishpro.space.m5.a.l("Deep Linking failed: destination ", com.gamericefishpro.space.f5.h.a(bVar, i10), str);
                                                    sbL4.append(gVar4.g());
                                                    throw new IllegalStateException(sbL4.toString());
                                                }
                                                gVar4.l(xVarD, bundle2, com.gamericefishpro.space.f5.h.g(new com.gamericefishpro.space.d0.q0(9, xVarD, d0Var2)));
                                                i9 = i11;
                                            }
                                            d0Var2.e = true;
                                        } else {
                                            bVar2 = bVar;
                                            zVar3 = gVar4.c;
                                            length3 = deepLink.length;
                                            while (i7 < length3) {
                                                i8 = deepLink[i7];
                                                bundle = bundleArr[i7];
                                                if (i7 == 0) {
                                                    xVarA = gVar4.c;
                                                } else {
                                                    Intrinsics.b(zVar3);
                                                    xVarA = zVar3.y.a(i8);
                                                }
                                                if (xVarA == null) {
                                                    int i32 = com.gamericefishpro.space.f5.x.w;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + com.gamericefishpro.space.f5.h.a(bVar2, i8) + " cannot be found in graph " + zVar3);
                                                }
                                                if (i7 == deepLink.length - 1) {
                                                    com.gamericefishpro.space.f5.z zVar17 = gVar4.c;
                                                    Intrinsics.b(zVar17);
                                                    gVar4.l(xVarA, bundle, new com.gamericefishpro.space.f5.g0(false, false, zVar17.e.a, true, false, 0, 0));
                                                } else if (xVarA instanceof com.gamericefishpro.space.f5.z) {
                                                    while (true) {
                                                        zVar4 = (com.gamericefishpro.space.f5.z) xVarA;
                                                        Intrinsics.b(zVar4);
                                                        jVar = zVar4.y;
                                                        if (!(jVar.a(jVar.c) instanceof com.gamericefishpro.space.f5.z)) {
                                                            break;
                                                            break;
                                                        }
                                                        xVarA = jVar.a(jVar.c);
                                                    }
                                                    zVar3 = zVar4;
                                                }
                                            }
                                            d0Var2.e = true;
                                        }
                                    }
                                    graph = zVar;
                                    gVar = gVar2;
                                }
                            }
                        }
                        gVar = gVar2;
                    }
                    com.gamericefishpro.space.f5.z zVar18 = gVar.c;
                    Intrinsics.b(zVar18);
                    gVar.l(zVar18, null, null);
                }
                graph = zVar;
            }
            q0 q0Var4 = q0Var;
            com.gamericefishpro.space.f5.p0 p0VarB = q0Var4.b("composable");
            com.gamericefishpro.space.g5.i iVar3 = p0VarB instanceof com.gamericefishpro.space.g5.i ? (com.gamericefishpro.space.g5.i) p0VarB : null;
            if (iVar3 == null) {
                p1 p1VarT = rVar.t();
                if (p1VarT != null) {
                    final int i33 = 2;
                    p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.g5.u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            switch (i33) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    ((Integer) obj7).getClass();
                                    com.gamericefishpro.space.u6.f.d(d0Var, graph, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj6, com.gamericefishpro.space.t0.i.D(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj7).getClass();
                                    com.gamericefishpro.space.u6.f.d(d0Var, graph, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj6, com.gamericefishpro.space.t0.i.D(i | 1));
                                    break;
                                default:
                                    ((Integer) obj7).getClass();
                                    com.gamericefishpro.space.u6.f.d(d0Var, graph, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj6, com.gamericefishpro.space.t0.i.D(i | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            ?? r14 = rVar;
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(iVar3.b().e, r14);
            Object objP = r14.P();
            Object obj6 = com.gamericefishpro.space.t0.n.a;
            if (objP == obj6) {
                objP = new com.gamericefishpro.space.t0.b1(0.0f);
                r14.k0(objP);
            }
            com.gamericefishpro.space.t0.b1 b1Var = (com.gamericefishpro.space.t0.b1) objP;
            Object objP2 = r14.P();
            if (objP2 == obj6) {
                objP2 = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
                r14.k0(objP2);
            }
            v0 v0Var4 = (v0) objP2;
            boolean z2 = ((List) v0VarL.getValue()).size() > 1;
            boolean zF = r14.f(v0VarL) | r14.h(iVar3);
            Object objP3 = r14.P();
            if (zF || objP3 == obj6) {
                v0Var = v0Var4;
                com.gamericefishpro.space.g5.i iVar4 = iVar3;
                wVar = new com.gamericefishpro.space.g5.w(iVar4, v0VarL, b1Var, v0Var, null);
                v0Var2 = v0VarL;
                iVar3 = iVar4;
                i2 = 1048576;
                r14.k0(wVar);
            } else {
                v0Var = v0Var4;
                wVar = objP3;
                i2 = 1048576;
                v0Var2 = v0VarL;
            }
            d5.g(z2, (Function2) wVar, r14, 0);
            com.gamericefishpro.space.z4.u uVar4 = uVar;
            boolean zH = r14.h(d0Var) | r14.h(uVar4);
            Object objP4 = r14.P();
            int i34 = 13;
            if (zH || objP4 == obj6) {
                objP4 = new com.gamericefishpro.space.d0.q0(i34, d0Var, uVar4);
                r14.k0(objP4);
            }
            com.gamericefishpro.space.t0.i.d(uVar4, (Function1) objP4, r14);
            com.gamericefishpro.space.e1.d dVarD = com.gamericefishpro.space.e1.k.d(r14);
            v0 v0VarL2 = com.gamericefishpro.space.t0.i.l(gVar.i, r14);
            Object objP5 = r14.P();
            if (objP5 == obj6) {
                objP5 = com.gamericefishpro.space.t0.i.p(new com.gamericefishpro.space.a3.b(8, v0VarL2));
                r14.k0(objP5);
            }
            s2 s2Var = (s2) objP5;
            com.gamericefishpro.space.f5.k kVar3 = (com.gamericefishpro.space.f5.k) CollectionsKt.C((List) s2Var.getValue());
            Object objP6 = r14.P();
            if (objP6 == obj6) {
                int i35 = com.gamericefishpro.space.t.l0.a;
                objP6 = new com.gamericefishpro.space.t.b0(6);
                r14.k0(objP6);
            }
            com.gamericefishpro.space.t.b0 b0Var2 = (com.gamericefishpro.space.t.b0) objP6;
            if (kVar3 != null) {
                r14.a0(-1797250687);
                boolean zH2 = r14.h(iVar3) | ((((i14 & 3670016) ^ 1572864) > i2 && r14.f(function3)) || (i14 & 1572864) == i2) | ((i14 & 57344) == 16384);
                Object objP7 = r14.P();
                if (zH2 || objP7 == obj6) {
                    final int i36 = 1;
                    v0Var3 = v0Var;
                    iVar = iVar3;
                    obj = new Function1() { // from class: com.gamericefishpro.space.g5.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i37 = i36;
                            v0 v0Var5 = v0Var3;
                            Function1 function6 = function1;
                            Function1 function7 = function3;
                            i iVar5 = iVar;
                            com.gamericefishpro.space.v.q qVar = (com.gamericefishpro.space.v.q) obj7;
                            switch (i37) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    com.gamericefishpro.space.f5.x xVar5 = ((com.gamericefishpro.space.f5.k) qVar.a()).e;
                                    Intrinsics.c(xVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar = (h) xVar5;
                                    if (((Boolean) iVar5.c.getValue()).booleanValue() || ((Boolean) v0Var5.getValue()).booleanValue()) {
                                        int i38 = com.gamericefishpro.space.f5.x.w;
                                        for (com.gamericefishpro.space.f5.x xVar6 : com.gamericefishpro.space.f5.h.b(hVar)) {
                                        }
                                        return (k0) function7.invoke(qVar);
                                    }
                                    int i39 = com.gamericefishpro.space.f5.x.w;
                                    for (com.gamericefishpro.space.f5.x xVar7 : com.gamericefishpro.space.f5.h.b(hVar)) {
                                    }
                                    return (k0) function6.invoke(qVar);
                                default:
                                    com.gamericefishpro.space.f5.x xVar8 = ((com.gamericefishpro.space.f5.k) qVar.c()).e;
                                    Intrinsics.c(xVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) xVar8;
                                    if (((Boolean) iVar5.c.getValue()).booleanValue() || ((Boolean) v0Var5.getValue()).booleanValue()) {
                                        int i40 = com.gamericefishpro.space.f5.x.w;
                                        for (com.gamericefishpro.space.f5.x xVar9 : com.gamericefishpro.space.f5.h.b(hVar2)) {
                                        }
                                        return (com.gamericefishpro.space.v.j0) function7.invoke(qVar);
                                    }
                                    int i41 = com.gamericefishpro.space.f5.x.w;
                                    for (com.gamericefishpro.space.f5.x xVar10 : com.gamericefishpro.space.f5.h.b(hVar2)) {
                                    }
                                    return (com.gamericefishpro.space.v.j0) function6.invoke(qVar);
                            }
                        }
                    };
                    r14.k0(obj);
                } else {
                    v0Var3 = v0Var;
                    obj = objP7;
                    iVar = iVar3;
                }
                Function1 function6 = (Function1) obj;
                boolean zH3 = r14.h(iVar) | ((((i14 & 29360128) ^ 12582912) > 8388608 && r14.f(function4)) || (i14 & 12582912) == 8388608) | ((i14 & 458752) == 131072);
                Object objP8 = r14.P();
                if (zH3 || objP8 == obj6) {
                    final int i37 = 0;
                    function5 = function6;
                    Function1 function7 = new Function1() { // from class: com.gamericefishpro.space.g5.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i38 = i37;
                            v0 v0Var5 = v0Var3;
                            Function1 function8 = function2;
                            Function1 function9 = function4;
                            i iVar5 = iVar;
                            com.gamericefishpro.space.v.q qVar = (com.gamericefishpro.space.v.q) obj7;
                            switch (i38) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    com.gamericefishpro.space.f5.x xVar5 = ((com.gamericefishpro.space.f5.k) qVar.a()).e;
                                    Intrinsics.c(xVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar = (h) xVar5;
                                    if (((Boolean) iVar5.c.getValue()).booleanValue() || ((Boolean) v0Var5.getValue()).booleanValue()) {
                                        int i39 = com.gamericefishpro.space.f5.x.w;
                                        for (com.gamericefishpro.space.f5.x xVar6 : com.gamericefishpro.space.f5.h.b(hVar)) {
                                        }
                                        return (k0) function9.invoke(qVar);
                                    }
                                    int i310 = com.gamericefishpro.space.f5.x.w;
                                    for (com.gamericefishpro.space.f5.x xVar7 : com.gamericefishpro.space.f5.h.b(hVar)) {
                                    }
                                    return (k0) function8.invoke(qVar);
                                default:
                                    com.gamericefishpro.space.f5.x xVar8 = ((com.gamericefishpro.space.f5.k) qVar.c()).e;
                                    Intrinsics.c(xVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) xVar8;
                                    if (((Boolean) iVar5.c.getValue()).booleanValue() || ((Boolean) v0Var5.getValue()).booleanValue()) {
                                        int i40 = com.gamericefishpro.space.f5.x.w;
                                        for (com.gamericefishpro.space.f5.x xVar9 : com.gamericefishpro.space.f5.h.b(hVar2)) {
                                        }
                                        return (com.gamericefishpro.space.v.j0) function9.invoke(qVar);
                                    }
                                    int i41 = com.gamericefishpro.space.f5.x.w;
                                    for (com.gamericefishpro.space.f5.x xVar10 : com.gamericefishpro.space.f5.h.b(hVar2)) {
                                    }
                                    return (com.gamericefishpro.space.v.j0) function8.invoke(qVar);
                            }
                        }
                    };
                    r14.k0(function7);
                    objP8 = function7;
                } else {
                    function5 = function6;
                }
                Function1 function8 = (Function1) objP8;
                boolean z3 = (i14 & 234881024) == 67108864;
                Object objP9 = r14.P();
                if (z3 || objP9 == obj6) {
                    objP9 = new com.gamericefishpro.space.f5.q(11);
                    r14.k0(objP9);
                }
                Function1 function9 = (Function1) objP9;
                Boolean bool = Boolean.TRUE;
                boolean zH4 = r14.h(iVar);
                Object objP10 = r14.P();
                if (zH4 || objP10 == obj6) {
                    objP10 = new com.gamericefishpro.space.d0.q0(12, s2Var, iVar);
                    r14.k0(objP10);
                }
                com.gamericefishpro.space.t0.i.d(bool, (Function1) objP10, r14);
                Object objP11 = r14.P();
                if (objP11 == obj6) {
                    objP11 = new s0(kVar3);
                    r14.k0(objP11);
                }
                s0 s0Var3 = (s0) objP11;
                com.gamericefishpro.space.r2.z zVar19 = n1.a;
                boolean zF2 = r14.f(s0Var3);
                Object objP12 = r14.P();
                if (zF2 || objP12 == obj6) {
                    com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
                    Function1 function1E = gVarE != null ? gVarE.e() : null;
                    com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
                    try {
                        com.gamericefishpro.space.w.l1 l1Var = new com.gamericefishpro.space.w.l1(s0Var3, null, "entry");
                        com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                        r14.k0(l1Var);
                        objP12 = l1Var;
                    } catch (Throwable th) {
                        com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                        throw th;
                    }
                }
                ?? r15 = (com.gamericefishpro.space.w.l1) objP12;
                if (s0Var3 != null) {
                    r14.a0(-1357607479);
                    Object value = s0Var3.i.getValue();
                    Object value2 = s0Var3.e.getValue();
                    boolean zF3 = r14.f(s0Var3);
                    Object objP13 = r14.P();
                    if (zF3 || objP13 == obj6) {
                        aVar2 = null;
                        objP13 = new com.gamericefishpro.space.db.d(s0Var3, aVar2, 16);
                        r14.k0(objP13);
                    } else {
                        aVar2 = null;
                    }
                    com.gamericefishpro.space.t0.i.f(value, value2, (Function2) objP13, r14);
                    i3 = 0;
                    r14.p(false);
                } else {
                    i3 = 0;
                    aVar2 = null;
                    r14.a0(-1357145920);
                    r15.a(s0Var3.e.getValue(), r14, 0);
                    r14.p(false);
                }
                boolean zF4 = r14.f(r15);
                Object objP14 = r14.P();
                if (zF4 || objP14 == obj6) {
                    objP14 = new m1(i3, (Object) r15);
                    r14.k0(objP14);
                }
                com.gamericefishpro.space.t0.i.d(r15, (Function1) objP14, r14);
                if (((Boolean) v0Var3.getValue()).booleanValue()) {
                    r14.a0(-1795016672);
                    Float fValueOf = Float.valueOf(b1Var.g());
                    boolean zF5 = r14.f(v0Var2) | r14.h(s0Var3);
                    Object objP15 = r14.P();
                    if (zF5 || objP15 == obj6) {
                        aVar = aVar2;
                        objP15 = new com.gamericefishpro.space.db.d(s0Var3, v0Var2, b1Var, aVar, 1);
                        r14.k0(objP15);
                    } else {
                        aVar = aVar2;
                    }
                    com.gamericefishpro.space.t0.i.e(r14, fValueOf, (Function2) objP15);
                    r14.p(false);
                    s0Var = s0Var3;
                    kVar = kVar3;
                    r23 = r15;
                } else {
                    aVar = aVar2;
                    r14.a0(-1794598265);
                    boolean zH5 = r14.h(s0Var3) | r14.h(kVar3) | r14.f(r15);
                    Object objP16 = r14.P();
                    if (zH5 || objP16 == obj6) {
                        s0Var = s0Var3;
                        ?? r24 = r15;
                        objP16 = new com.gamericefishpro.space.g5.y(s0Var, kVar3, r24, aVar, 0);
                        kVar = kVar3;
                        r14.k0(objP16);
                        r22 = r24;
                    } else {
                        s0Var = s0Var3;
                        kVar = kVar3;
                        r22 = r15;
                    }
                    com.gamericefishpro.space.t0.i.e(r14, kVar, (Function2) objP16);
                    r14.p(false);
                    r23 = r22;
                }
                boolean zH6 = r14.h(b0Var2) | r14.h(iVar) | r14.f(function5) | r14.f(function8) | r14.f(function9);
                Object objP17 = r14.P();
                if (zH6 || objP17 == obj6) {
                    com.gamericefishpro.space.g5.i iVar5 = iVar;
                    com.gamericefishpro.space.g5.s sVar = new com.gamericefishpro.space.g5.s(b0Var2, iVar5, function5, function8, function9, s2Var, v0Var3);
                    b0Var = b0Var2;
                    iVar2 = iVar5;
                    r14.k0(sVar);
                    objP17 = sVar;
                } else {
                    b0Var = b0Var2;
                    iVar2 = iVar;
                }
                Function1 function10 = (Function1) objP17;
                Object objP18 = r14.P();
                if (objP18 == obj6) {
                    objP18 = new com.gamericefishpro.space.f5.q(13);
                    r14.k0(objP18);
                }
                com.gamericefishpro.space.f5.k kVar4 = kVar;
                ?? r0 = r23;
                com.gamericefishpro.space.v.h.a(r0, mVar, function10, eVar, (Function1) objP18, com.gamericefishpro.space.b1.n.c(820763100, new com.gamericefishpro.space.g5.z(s0Var, kVar4, dVarD, v0Var3, s2Var), r14), r14, ((i14 >> 3) & 112) | 221184 | (i14 & 7168));
                Object objK = r0.a.k();
                Object value3 = r0.d.getValue();
                boolean zF6 = r14.f(r0) | r14.h(d0Var) | r14.h(kVar4) | r14.h(iVar2) | r14.h(b0Var);
                Object objP19 = r14.P();
                if (zF6 || objP19 == obj6) {
                    com.gamericefishpro.space.g5.a0 a0Var = new com.gamericefishpro.space.g5.a0(r0, d0Var, kVar4, b0Var, s2Var, iVar2, null);
                    r14.k0(a0Var);
                    objP19 = a0Var;
                }
                com.gamericefishpro.space.t0.i.f(objK, value3, (Function2) objP19, r14);
                r14.p(false);
            } else {
                q0Var4 = q0Var4;
                aVar = null;
                r14.a0(-1789446406);
                r14.p(false);
            }
            com.gamericefishpro.space.f5.p0 p0VarB2 = q0Var4.b("dialog");
            if (p0VarB2 instanceof com.gamericefishpro.space.g5.p) {
                pVar = (com.gamericefishpro.space.g5.p) p0VarB2;
            } else {
                r10 = aVar;
            }
            if (r10 == 0) {
                p1 p1VarT2 = r14.t();
                if (p1VarT2 == null) {
                    r10 = pVar;
                    return;
                }
                r10 = pVar;
                final int i38 = 0;
                p1VarT2.d = new Function2() { // from class: com.gamericefishpro.space.g5.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj7, Object obj8) {
                        switch (i38) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((Integer) obj8).getClass();
                                com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                                break;
                            case 1:
                                ((Integer) obj8).getClass();
                                com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                                break;
                            default:
                                ((Integer) obj8).getClass();
                                com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                                break;
                        }
                        return Unit.a;
                    }
                };
                return;
            }
            r10 = pVar;
            y3.b(r10, r14, 0);
            r13 = r14;
        }
        p1 p1VarT3 = r13.t();
        if (p1VarT3 != null) {
            final int i39 = 1;
            p1VarT3.d = new Function2() { // from class: com.gamericefishpro.space.g5.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    switch (i39) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            ((Integer) obj8).getClass();
                            com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                            break;
                        case 1:
                            ((Integer) obj8).getClass();
                            com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                            break;
                        default:
                            ((Integer) obj8).getClass();
                            com.gamericefishpro.space.u6.f.d(d0Var, zVar, mVar, eVar, function1, function2, function3, function4, (com.gamericefishpro.space.t0.r) obj7, com.gamericefishpro.space.t0.i.D(i | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final com.gamericefishpro.space.f5.d0 d0Var, com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.h1.e eVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, final Function1 function5, com.gamericefishpro.space.t0.r rVar, final int i) {
        Function1 function6;
        int i2;
        com.gamericefishpro.space.h1.e eVar2;
        final com.gamericefishpro.space.h1.m mVar2;
        final Function1 function7;
        final Function1 function8;
        Function1 function9;
        final Function1 function10;
        final com.gamericefishpro.space.h1.e eVar3;
        final Function1 function11;
        rVar.b0(1840250294);
        int i3 = i | (rVar.h(d0Var) ? 4 : 2) | (rVar.f("splash") ? 32 : 16) | 844852608;
        char c2 = rVar.h(function5) ? (char) 4 : (char) 2;
        if ((306783379 & i3) == 306783378 && (c2 & 3) == 2 && rVar.E()) {
            rVar.V();
            mVar2 = mVar;
            eVar3 = eVar;
            function7 = function1;
            function11 = function2;
            function8 = function3;
            function10 = function4;
        } else {
            rVar.X();
            int i4 = i & 1;
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (i4 == 0 || rVar.B()) {
                com.gamericefishpro.space.h1.e eVar4 = com.gamericefishpro.space.h1.b.d;
                Object objP = rVar.P();
                if (objP == fVar) {
                    objP = new com.gamericefishpro.space.f5.q(10);
                    rVar.k0(objP);
                }
                Function1 function12 = (Function1) objP;
                Object objP2 = rVar.P();
                if (objP2 == fVar) {
                    objP2 = new com.gamericefishpro.space.f5.q(12);
                    rVar.k0(objP2);
                }
                function6 = (Function1) objP2;
                i2 = i3 & (-264241153);
                eVar2 = eVar4;
                mVar2 = com.gamericefishpro.space.h1.j.a;
                function7 = function12;
                function8 = function7;
                function9 = function6;
            } else {
                rVar.V();
                mVar2 = mVar;
                function6 = function2;
                function8 = function3;
                function9 = function4;
                i2 = i3 & (-264241153);
                eVar2 = eVar;
                function7 = function1;
            }
            rVar.q();
            boolean z = ((i2 & 112) == 32) | ((c2 & 14) == 4);
            Object objP3 = rVar.P();
            if (z || objP3 == fVar) {
                com.gamericefishpro.space.f5.a0 a0Var = new com.gamericefishpro.space.f5.a0(d0Var.b.s);
                function5.invoke(a0Var);
                objP3 = a0Var.h();
                rVar.k0(objP3);
            }
            function10 = function9;
            eVar3 = eVar2;
            function11 = function6;
            d(d0Var, (com.gamericefishpro.space.f5.z) objP3, mVar2, eVar3, function7, function11, function8, function10, rVar, (i2 & 8078) | 100884480);
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(mVar2, eVar3, function7, function11, function8, function10, function5, i) { // from class: com.gamericefishpro.space.g5.t
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ com.gamericefishpro.space.h1.m e;
                public final /* synthetic */ com.gamericefishpro.space.h1.e i;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Function1 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(1);
                    com.gamericefishpro.space.u6.f.e(this.d, this.e, this.i, this.v, this.w, this.y, this.z, this.A, (com.gamericefishpro.space.t0.r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static final com.gamericefishpro.space.n1.d f(float f2, float f3, float f4, float f5, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new com.gamericefishpro.space.n1.d(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void g(int i, float f2, int i2, boolean z, int i3, com.gamericefishpro.space.t0.r rVar, final int i4) {
        int i5;
        final int i6;
        final boolean z2;
        final int i7;
        final float f3;
        rVar.b0(-593427073);
        if ((((rVar.d(i) ? 4 : 2) | i4) & 9363) == 9362 && rVar.E()) {
            rVar.V();
            i5 = i3;
            z2 = z;
            i7 = i2;
            f3 = f2;
            i6 = i;
        } else {
            com.gamericefishpro.space.d0.h0 h0Var = g1.c;
            i5 = i3;
            com.gamericefishpro.space.l7.h hVar = new com.gamericefishpro.space.l7.h(i, z, i2, i5, f2);
            i6 = i;
            z2 = z;
            i7 = i2;
            f3 = f2;
            com.gamericefishpro.space.d0.j.a(h0Var, null, com.gamericefishpro.space.b1.n.c(-1409797419, hVar, rVar), rVar, 3078);
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            final int i8 = i5;
            p1VarT.d = new Function2(i6, f3, i7, z2, i8, i4) { // from class: com.gamericefishpro.space.l7.f
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ int w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = i.D(28081);
                    com.gamericefishpro.space.u6.f.g(this.d, this.e, this.i, this.v, this.w, (r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static final Object[] h(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        com.gamericefishpro.space.ph.u.g(0, i, 6, objArr, objArr2);
        com.gamericefishpro.space.ph.u.d(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] i(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        com.gamericefishpro.space.ph.u.g(0, i, 6, objArr, objArr2);
        com.gamericefishpro.space.ph.u.d(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] j(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        com.gamericefishpro.space.ph.u.g(0, i, 6, objArr, objArr2);
        com.gamericefishpro.space.ph.u.d(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static void k(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.g1.b, com.gamericefishpro.space.g1.l] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.gamericefishpro.space.t0.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(h2 h2Var, Integer num, int i, Integer num2) {
        int iE;
        int iS;
        d0 d0Var;
        if (h2Var.w || h2Var.p() == 0) {
            return g0.d;
        }
        ?? lVar = new com.gamericefishpro.space.g1.l(h2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = h2Var.v;
            if (iE < 0) {
                iE = h2Var.E(h2Var.b, i);
            }
        }
        if (num == 0) {
            int iN = h2Var.i - h2Var.N(h2Var.b, h2Var.r(i));
            w wVar = h2Var.s;
            num = Integer.valueOf(iN + ((wVar == null || (d0Var = (d0) wVar.b(i)) == null) ? 0 : d0Var.b));
        }
        int iR = h2Var.r(i) * 5;
        int[] iArr = h2Var.b;
        if (iR < iArr.length) {
            iS = h2Var.s(i);
        } else {
            int iE2 = iE >= 0 ? h2Var.E(iArr, iE) : iE;
            iS = h2Var.s(iE);
            int i2 = iE;
            iE = iE2;
            i = i2;
        }
        while (i >= 0) {
            lVar.n(iS, (h2Var.b[(h2Var.r(i) * 5) + 1] & 536870912) != 0 ? h2Var.t(i) : com.gamericefishpro.space.t0.n.a, h2Var.O(i), num);
            num = h2Var.b(i);
            if (iE >= 0) {
                int iE3 = h2Var.E(h2Var.b, iE);
                iS = h2Var.s(iE);
                int i3 = iE;
                iE = iE3;
                i = i3;
            } else {
                i = iE;
            }
        }
        return (ArrayList) lVar.d;
    }

    public static final int m(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    public static final boolean n(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static final com.gamericefishpro.space.u2.e o(Context context) {
        com.gamericefishpro.space.n9.z zVar = new com.gamericefishpro.space.n9.z(28);
        context.getApplicationContext();
        return new com.gamericefishpro.space.u2.e(zVar, new com.gamericefishpro.space.u2.a(Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.u2.l.a.a(context) : 0));
    }

    public static final boolean p(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.a(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < current.length()) {
                char cCharAt = current.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != current.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return Intrinsics.a(StringsKt.D(strSubstring).toString(), str);
            }
        }
        return false;
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = com.gamericefishpro.space.d4.l0.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = com.gamericefishpro.space.d4.k0.d;
        com.gamericefishpro.space.d4.k0 k0Var = (com.gamericefishpro.space.d4.k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (k0Var == null) {
            k0Var = new com.gamericefishpro.space.d4.k0();
            k0Var.a = null;
            k0Var.b = null;
            k0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        WeakReference weakReference2 = k0Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        k0Var.c = new WeakReference(keyEvent);
        if (k0Var.b == null) {
            k0Var.b = new SparseArray();
        }
        SparseArray sparseArray = k0Var.b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
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

    public static final long r(long j) {
        long j2 = (j << 1) + 1;
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        int i = com.gamericefishpro.space.ni.c.a;
        return j2;
    }

    public static final boolean s(long j, long j2) {
        return j == j2;
    }

    public static String t(com.gamericefishpro.space.q4.f fVar) {
        StringBuilder sb = new StringBuilder(fVar.size());
        for (int i = 0; i < fVar.size(); i++) {
            byte b2 = fVar.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Integer u(d2 d2Var, com.gamericefishpro.space.t0.u uVar, int i, int i2) {
        Integer numU;
        int[] iArr = d2Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (d2Var.j(i) && d2Var.i(i) == 206 && Intrinsics.a(d2Var.p(iArr, i), com.gamericefishpro.space.t0.s.e)) {
                Object objH = d2Var.h(i, 0);
                y1 y1Var = objH instanceof y1 ? (y1) objH : null;
                x1 x1Var = y1Var != null ? y1Var.a : null;
                com.gamericefishpro.space.t0.p pVar = x1Var instanceof com.gamericefishpro.space.t0.p ? (com.gamericefishpro.space.t0.p) x1Var : null;
                if (pVar != null && pVar.d.equals(uVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (d2Var.d(i) && (numU = u(d2Var, uVar, i + 1, i3)) != null) {
                return Integer.valueOf(numU.intValue());
            }
            i = i3;
        }
    }

    public static final String v(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return com.gamericefishpro.space.mi.h.b(CollectionsKt.A(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static void w(com.gamericefishpro.space.va.b bVar) {
        if (!bVar.isDone()) {
            throw new IllegalStateException(com.gamericefishpro.space.a.a.w("Future was expected to be done: %s", bVar));
        }
        boolean z = false;
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static Drawable x(Context context, int i) {
        return com.gamericefishpro.space.n.p1.b().c(context, i);
    }

    public static Set y() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
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

    public static final com.gamericefishpro.space.u1.f z() {
        com.gamericefishpro.space.u1.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        m0 m0Var = new m0(com.gamericefishpro.space.o1.s.b);
        u uVar = new u(1);
        uVar.B(13.0f, 3.0f);
        uVar.u(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        uVar.z(1.0f, 12.0f);
        uVar.A(3.89f, 3.89f);
        uVar.A(0.07f, 0.14f);
        uVar.z(9.0f, 12.0f);
        uVar.z(6.0f, 12.0f);
        uVar.u(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        uVar.E(7.0f, 3.13f, 7.0f, 7.0f);
        uVar.E(-3.13f, 7.0f, -7.0f, 7.0f);
        uVar.u(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        uVar.A(-1.42f, 1.42f);
        uVar.t(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        uVar.u(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        uVar.E(-4.03f, -9.0f, -9.0f, -9.0f);
        uVar.s();
        uVar.B(12.0f, 8.0f);
        uVar.G(5.0f);
        uVar.A(4.28f, 2.54f);
        uVar.A(0.72f, -1.21f);
        uVar.A(-3.5f, -2.08f);
        uVar.z(13.5f, 8.0f);
        uVar.z(12.0f, 8.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public abstract void K(RecyclerView recyclerView);
}
