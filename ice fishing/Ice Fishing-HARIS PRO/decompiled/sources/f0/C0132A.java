package f0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import g0.AbstractC0156a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132A {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f2850c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2852b;

    public C0132A(Context context, O o2) {
        D1.i.e(o2, "navigatorProvider");
        this.f2851a = context;
        this.f2852b = o2;
    }

    public static C0140e c(TypedArray typedArray, Resources resources, int i) {
        boolean z2;
        String str;
        L l2;
        L l3;
        L l4;
        L l5;
        Object obj;
        L l6;
        L j;
        boolean z3 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f2850c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        L l7 = L.f2879c;
        L l8 = L.j;
        L l9 = L.f2889p;
        L l10 = L.f2886m;
        L l11 = L.f2882g;
        L l12 = L.f2880d;
        L l13 = L.f2881f;
        L l14 = L.f2888o;
        L l15 = L.f2885l;
        L l16 = L.i;
        L l17 = L.f2878b;
        if (string != null) {
            l2 = l12;
            String resourcePackageName = resources.getResourcePackageName(i);
            if ("integer".equals(string)) {
                z2 = z3;
                str = "boolean";
                l3 = l13;
                l4 = l17;
            } else {
                z2 = z3;
                if ("integer[]".equals(string)) {
                    str = "boolean";
                    l3 = l13;
                    l4 = l2;
                } else {
                    if ("List<Int>".equals(string)) {
                        l4 = L.e;
                    } else if ("long".equals(string)) {
                        str = "boolean";
                        l4 = l13;
                        l3 = l4;
                    } else if ("long[]".equals(string)) {
                        str = "boolean";
                        l3 = l13;
                        l4 = l11;
                    } else if ("List<Long>".equals(string)) {
                        l4 = L.f2883h;
                    } else if ("boolean".equals(string)) {
                        str = "boolean";
                        l3 = l13;
                        l4 = l15;
                    } else if ("boolean[]".equals(string)) {
                        str = "boolean";
                        l3 = l13;
                        l4 = l10;
                    } else if ("List<Boolean>".equals(string)) {
                        l4 = L.f2887n;
                    } else {
                        if (!"string".equals(string)) {
                            if ("string[]".equals(string)) {
                                str = "boolean";
                                l3 = l13;
                                l4 = l9;
                            } else if ("List<String>".equals(string)) {
                                l4 = L.f2890q;
                            } else if ("float".equals(string)) {
                                l4 = l16;
                            } else if ("float[]".equals(string)) {
                                str = "boolean";
                                l3 = l13;
                                l4 = l8;
                            } else if ("List<Float>".equals(string)) {
                                l4 = L.f2884k;
                            } else if ("reference".equals(string)) {
                                str = "boolean";
                                l4 = l7;
                                l3 = l13;
                            } else if (string.length() != 0) {
                                try {
                                    String concat = (!string.startsWith(".") || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                                    boolean endsWith = string.endsWith("[]");
                                    if (endsWith) {
                                        l3 = l13;
                                        str = "boolean";
                                        concat = concat.substring(0, concat.length() - 2);
                                        D1.i.d(concat, "substring(...)");
                                    } else {
                                        str = "boolean";
                                        l3 = l13;
                                    }
                                    Class<?> cls = Class.forName(concat);
                                    if (Parcelable.class.isAssignableFrom(cls)) {
                                        j = endsWith ? new H(cls) : new I(cls);
                                    } else {
                                        j = (!Enum.class.isAssignableFrom(cls) || endsWith) ? Serializable.class.isAssignableFrom(cls) ? endsWith ? new J(cls) : new K(cls) : null : new G(cls);
                                    }
                                    if (j == null) {
                                        throw new IllegalArgumentException((concat + " is not Serializable or Parcelable.").toString());
                                    }
                                    l4 = j;
                                } catch (ClassNotFoundException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        str = "boolean";
                        l3 = l13;
                        l4 = l14;
                    }
                    str = "boolean";
                    l3 = l13;
                }
            }
        } else {
            z2 = z3;
            str = "boolean";
            l2 = l12;
            l3 = l13;
            l4 = null;
        }
        boolean z4 = true;
        if (typedArray.getValue(1, typedValue)) {
            if (l4 == l7) {
                int i2 = typedValue.resourceId;
                if (i2 == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + l4.b() + ". Must be a reference to a resource.");
                    }
                    i2 = 0;
                }
                obj = Integer.valueOf(i2);
                l7 = l4;
            } else {
                int i3 = typedValue.resourceId;
                if (i3 == 0) {
                    if (l4 == l14) {
                        z4 = true;
                        obj = typedArray.getString(1);
                        l7 = l4;
                    } else {
                        z4 = true;
                        int i4 = typedValue.type;
                        if (i4 == 3) {
                            String obj2 = typedValue.string.toString();
                            if (l4 == null) {
                                D1.i.e(obj2, "value");
                                try {
                                    l17.d(obj2);
                                    l4 = l17;
                                } catch (IllegalArgumentException unused) {
                                    l5 = l3;
                                    try {
                                        try {
                                            try {
                                                l5.d(obj2);
                                                l4 = l5;
                                            } catch (IllegalArgumentException unused2) {
                                                l16.d(obj2);
                                                l4 = l16;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            l4 = l14;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        l15.d(obj2);
                                        l4 = l15;
                                    }
                                }
                            }
                            l5 = l3;
                            l7 = l4;
                            obj = l7.d(obj2);
                        } else if (i4 == 4) {
                            l7 = R.j.l(typedValue, l4, l16, string, "float");
                            obj = Float.valueOf(typedValue.getFloat());
                        } else if (i4 == 5) {
                            l7 = R.j.l(typedValue, l4, l17, string, "dimension");
                            obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                        } else if (i4 == 18) {
                            l7 = R.j.l(typedValue, l4, l15, string, str);
                            obj = Boolean.valueOf(typedValue.data != 0);
                        } else {
                            if (i4 < 16 || i4 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            }
                            if (l4 == l16) {
                                l7 = R.j.l(typedValue, l4, l16, string, "float");
                                obj = Float.valueOf(typedValue.data);
                            } else {
                                l7 = R.j.l(typedValue, l4, l17, string, "integer");
                                obj = Integer.valueOf(typedValue.data);
                            }
                        }
                    }
                    l5 = l3;
                } else {
                    if (l4 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + l4.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i3);
                }
            }
            l5 = l3;
            z4 = true;
        } else {
            l5 = l3;
            l7 = l4;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z4 = false;
        }
        L l18 = l7 != null ? l7 : null;
        if (l18 != null) {
            l6 = l18;
        } else if (obj instanceof Integer) {
            l6 = l17;
        } else if (obj instanceof int[]) {
            l6 = l2;
        } else if (obj instanceof Long) {
            l6 = l5;
        } else if (obj instanceof long[]) {
            l6 = l11;
        } else if (obj instanceof Float) {
            l6 = l16;
        } else if (obj instanceof float[]) {
            l6 = l8;
        } else if (obj instanceof Boolean) {
            l6 = l15;
        } else if (obj instanceof boolean[]) {
            l6 = l10;
        } else if ((obj instanceof String) || obj == null) {
            l6 = l14;
        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
            l6 = l9;
        } else {
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                D1.i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    D1.i.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    l6 = new H(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                D1.i.b(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    D1.i.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    l6 = new J(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                l6 = new I(obj.getClass());
            } else if (obj instanceof Enum) {
                l6 = new G(obj.getClass());
            } else {
                if (!(obj instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                l6 = new K(obj.getClass());
            }
        }
        return new C0140e(l6, z2, obj, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0140, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x028e, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        String str;
        String str2;
        C0132A c0132a;
        int depth2;
        Object obj;
        C0132A c0132a2 = this;
        int i2 = i;
        String name = xmlResourceParser.getName();
        D1.i.d(name, "parser.name");
        w a2 = c0132a2.f2852b.b(name).a();
        Context context = c0132a2.f2851a;
        a2.e(context, attributeSet);
        int i3 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = AbstractC0156a.f3058b;
                LinkedHashMap linkedHashMap = a2.f2993g;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    D1.i.d(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = obtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    linkedHashMap.put(string, c(obtainAttributes, resources, i2));
                    obtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, AbstractC0156a.f3059c);
                    D1.i.d(obtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(1);
                    String string4 = obtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    String str3 = null;
                    if (string2 != null) {
                        String packageName = context.getPackageName();
                        D1.i.d(packageName, "context.packageName");
                        str = K1.l.f0(string2, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        str2 = null;
                    } else {
                        String packageName2 = context.getPackageName();
                        D1.i.d(packageName2, "context.packageName");
                        str2 = K1.l.f0(string3, "${applicationId}", packageName2);
                        if (str2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context.getPackageName();
                        D1.i.d(packageName3, "context.packageName");
                        str3 = K1.l.f0(string4, "${applicationId}", packageName3);
                    }
                    s sVar = new s(str, str2, str3);
                    ArrayList S2 = R.j.S(linkedHashMap, new v(sVar, 0));
                    if (!S2.isEmpty()) {
                        throw new IllegalArgumentException(("Deep link " + str + " can't be used to open destination " + a2 + ".\nFollowing required arguments are missing: " + S2).toString());
                    }
                    a2.e.add(sVar);
                    obtainAttributes2.recycle();
                } else if ("action".equals(name2)) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0156a.f3057a, 0, 0);
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    C0139d c0139d = new C0139d(obtainStyledAttributes.getResourceId(1, 0));
                    c0139d.f2913b = new C0134C(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                    Bundle bundle = new Bundle();
                    Context context2 = context;
                    int i4 = 1;
                    int depth4 = xmlResourceParser.getDepth() + 1;
                    int i5 = depth3;
                    while (true) {
                        int next2 = xmlResourceParser.next();
                        if (next2 == i4 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth4) {
                            if ("argument".equals(xmlResourceParser.getName())) {
                                TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                D1.i.d(obtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                String string5 = obtainAttributes3.getString(0);
                                if (string5 == null) {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                                C0140e c2 = c(obtainAttributes3, resources, i2);
                                boolean z2 = c2.f2917c;
                                if (z2 && z2 && (obj = c2.f2918d) != null) {
                                    c2.f2915a.e(bundle, string5, obj);
                                }
                                obtainAttributes3.recycle();
                            }
                            i4 = 1;
                            i2 = i;
                        } else {
                            i4 = 1;
                        }
                    }
                    if (!bundle.isEmpty()) {
                        c0139d.f2914c = bundle;
                    }
                    if (a2 instanceof C0136a) {
                        throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a2 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                    }
                    if (resourceId == 0) {
                        throw new IllegalArgumentException("Cannot have an action with actionId 0");
                    }
                    a2.f2992f.d(resourceId, c0139d);
                    obtainStyledAttributes.recycle();
                    i3 = 1;
                    c0132a2 = this;
                    i2 = i;
                    depth3 = i5;
                    context = context2;
                } else {
                    Context context3 = context;
                    int i6 = depth3;
                    if ("include".equals(name2) && (a2 instanceof y)) {
                        TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, P.f2898c);
                        D1.i.d(obtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        c0132a = this;
                        ((y) a2).f(c0132a.b(obtainAttributes4.getResourceId(0, 0)));
                        obtainAttributes4.recycle();
                    } else {
                        c0132a = this;
                        if (a2 instanceof y) {
                            ((y) a2).f(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i2 = i;
                    c0132a2 = c0132a;
                    depth3 = i6;
                    context = context3;
                }
                i3 = 1;
            }
        }
    }

    public final y b(int i) {
        int next;
        Resources resources = this.f2851a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        D1.i.d(xml, "res.getXml(graphResId)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        D1.i.d(asAttributeSet, "attrs");
        w a2 = a(resources, xml, asAttributeSet, i);
        if (a2 instanceof y) {
            return (y) a2;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
