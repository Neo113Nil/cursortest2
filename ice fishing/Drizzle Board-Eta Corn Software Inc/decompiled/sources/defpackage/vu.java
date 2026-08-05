package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vu {
    public static final ThreadLocal MdtA4re8 = new ThreadLocal();
    public final xv NCTxEWno;
    public final Context qoPGr6Ce;

    public vu(Context context, xv xvVar) {
        xvVar.getClass();
        this.qoPGr6Ce = context;
        this.NCTxEWno = xvVar;
    }

    public static tt MdtA4re8(TypedArray typedArray, Resources resources, int i) {
        ev evVar;
        boolean z;
        ev evVar2;
        ev evVar3;
        ev evVar4;
        ev evVar5;
        ev evVar6;
        boolean z2;
        Object obj;
        ev evVar7;
        Object valueOf;
        int i2;
        boolean z3;
        boolean z4 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = MdtA4re8;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        ev evVar8 = ev.MdtA4re8;
        ev evVar9 = ev.eVhOlqcC;
        ev evVar10 = ev.sjUBp5pO;
        ev evVar11 = ev.OnDfzHZD;
        ev evVar12 = ev.b2ZJblxo;
        ev evVar13 = ev.wxUZMvaN;
        ev evVar14 = ev.P7K7Inc8;
        ev evVar15 = ev.ow5vqvCr;
        ev evVar16 = ev.lDXGDhIF;
        ev evVar17 = ev.jb9XjC4I;
        ev evVar18 = ev.NCTxEWno;
        if (string != null) {
            evVar3 = evVar11;
            String resourcePackageName = resources.getResourcePackageName(i);
            z = z4;
            if ("integer".equals(string)) {
                evVar2 = evVar14;
                evVar4 = evVar18;
            } else {
                evVar2 = evVar14;
                evVar4 = "integer[]".equals(string) ? evVar13 : "List<Int>".equals(string) ? ev.VgvYg0wo : "long".equals(string) ? evVar2 : "long[]".equals(string) ? evVar12 : "List<Long>".equals(string) ? ev.Qr9iLBAD : "boolean".equals(string) ? evVar15 : "boolean[]".equals(string) ? evVar3 : "List<Boolean>".equals(string) ? ev.ygLcUYwZ : "string".equals(string) ? evVar16 : "string[]".equals(string) ? evVar10 : "List<String>".equals(string) ? ev.OxcuoDLp : "float".equals(string) ? evVar17 : "float[]".equals(string) ? evVar9 : "List<Float>".equals(string) ? ev.k3x7lurq : null;
            }
            if (evVar4 != null) {
                evVar = evVar15;
            } else if ("reference".equals(string)) {
                evVar = evVar15;
                evVar4 = evVar8;
            } else if (string.length() == 0) {
                evVar = evVar15;
                evVar4 = evVar16;
            } else {
                try {
                    String concat = (!string.startsWith(".") || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                    boolean endsWith = string.endsWith("[]");
                    if (endsWith) {
                        z3 = endsWith;
                        evVar = evVar15;
                        concat = concat.substring(0, concat.length() - 2);
                    } else {
                        evVar = evVar15;
                        z3 = endsWith;
                    }
                    Class<?> cls = Class.forName(concat);
                    ev avVar = Parcelable.class.isAssignableFrom(cls) ? z3 ? new av(cls) : new bv(cls) : (!Enum.class.isAssignableFrom(cls) || z3) ? Serializable.class.isAssignableFrom(cls) ? z3 ? new cv(cls) : new dv(cls) : null : new zu(cls);
                    if (avVar == null) {
                        throw new IllegalArgumentException(concat.concat(" is not Serializable or Parcelable.").toString());
                    }
                    evVar4 = avVar;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            evVar = evVar15;
            z = z4;
            evVar2 = evVar14;
            evVar3 = evVar11;
            evVar4 = null;
        }
        boolean z5 = true;
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            if (evVar4 == evVar8) {
                if (i3 != 0) {
                    i2 = Integer.valueOf(i3);
                    z2 = false;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String NCTxEWno = evVar4.NCTxEWno();
                        sb.append("' for ");
                        sb.append(NCTxEWno);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    z2 = false;
                    i2 = 0;
                }
                obj = i2;
                evVar8 = evVar4;
            } else {
                z2 = false;
                if (i3 == 0) {
                    if (evVar4 == evVar16) {
                        z5 = true;
                        obj = typedArray.getString(1);
                        evVar8 = evVar4;
                    } else {
                        z5 = true;
                        int i4 = typedValue.type;
                        if (i4 != 3) {
                            if (i4 == 4) {
                                evVar5 = evVar;
                                evVar8 = w30.jb9XjC4I(typedValue, evVar4, evVar17, string, "float");
                                obj = Float.valueOf(typedValue.getFloat());
                            } else if (i4 == 5) {
                                evVar5 = evVar;
                                evVar8 = w30.jb9XjC4I(typedValue, evVar4, evVar18, string, "dimension");
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            } else if (i4 == 18) {
                                evVar5 = evVar;
                                evVar8 = w30.jb9XjC4I(typedValue, evVar4, evVar5, string, "boolean");
                                obj = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i4 < 16 || i4 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                if (evVar4 == evVar17) {
                                    evVar8 = w30.jb9XjC4I(typedValue, evVar4, evVar17, string, "float");
                                    valueOf = Float.valueOf(typedValue.data);
                                } else {
                                    evVar8 = w30.jb9XjC4I(typedValue, evVar4, evVar18, string, "integer");
                                    valueOf = Integer.valueOf(typedValue.data);
                                }
                                obj = valueOf;
                            }
                            evVar6 = evVar2;
                        } else {
                            evVar5 = evVar;
                            String obj2 = typedValue.string.toString();
                            if (evVar4 == null) {
                                obj2.getClass();
                                try {
                                    evVar18.wxUZMvaN(obj2);
                                    evVar4 = evVar18;
                                } catch (IllegalArgumentException unused) {
                                    evVar6 = evVar2;
                                    try {
                                        try {
                                            try {
                                                evVar6.wxUZMvaN(obj2);
                                                evVar4 = evVar6;
                                            } catch (IllegalArgumentException unused2) {
                                                evVar5.wxUZMvaN(obj2);
                                                evVar4 = evVar5;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            evVar17.wxUZMvaN(obj2);
                                            evVar4 = evVar17;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        evVar4 = evVar16;
                                    }
                                }
                            }
                            evVar6 = evVar2;
                            evVar8 = evVar4;
                            obj = evVar8.wxUZMvaN(obj2);
                        }
                    }
                    evVar5 = evVar;
                    evVar6 = evVar2;
                } else {
                    if (evVar4 != null) {
                        StringBuilder sb2 = new StringBuilder("unsupported value '");
                        sb2.append((Object) typedValue.string);
                        String NCTxEWno2 = evVar4.NCTxEWno();
                        sb2.append("' for ");
                        sb2.append(NCTxEWno2);
                        sb2.append(". You must use a \"reference\" type to reference other resources.");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    obj = Integer.valueOf(i3);
                }
            }
            evVar5 = evVar;
            evVar6 = evVar2;
            z5 = true;
        } else {
            evVar5 = evVar;
            evVar6 = evVar2;
            z2 = false;
            evVar8 = evVar4;
            obj = null;
        }
        if (obj == null) {
            z5 = z2;
            obj = null;
        }
        if (evVar8 == null) {
            evVar8 = null;
        }
        if (evVar8 == null) {
            if (obj instanceof Integer) {
                evVar17 = evVar18;
            } else if (obj instanceof int[]) {
                evVar17 = evVar13;
            } else if (obj instanceof Long) {
                evVar17 = evVar6;
            } else if (obj instanceof long[]) {
                evVar17 = evVar12;
            } else if (!(obj instanceof Float)) {
                evVar17 = obj instanceof float[] ? evVar9 : obj instanceof Boolean ? evVar5 : obj instanceof boolean[] ? evVar3 : ((obj instanceof String) || obj == null) ? evVar16 : null;
            }
            if (evVar17 != null) {
                evVar7 = evVar17;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                evVar7 = evVar10;
            } else {
                obj.getClass();
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    componentType.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        componentType2.getClass();
                        evVar7 = new av(componentType2);
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    componentType3.getClass();
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        componentType4.getClass();
                        evVar7 = new cv(componentType4);
                    }
                }
                if (obj instanceof Parcelable) {
                    evVar7 = new bv(obj.getClass());
                } else if (obj instanceof Enum) {
                    evVar7 = new zu(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    evVar7 = new dv(obj.getClass());
                }
            }
            evVar8 = evVar7;
        }
        return new tt(evVar8, z, obj, z5);
    }

    public final ru NCTxEWno(int i) {
        int next;
        Resources resources = this.qoPGr6Ce.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
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
        asAttributeSet.getClass();
        pu qoPGr6Ce = qoPGr6Ce(resources, xml, asAttributeSet, i);
        if (qoPGr6Ce instanceof ru) {
            return (ru) qoPGr6Ce;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0141, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0290, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pu qoPGr6Ce(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        String str;
        String str2;
        Context context;
        VM67d7Sv vM67d7Sv;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        pu qoPGr6Ce = this.NCTxEWno.NCTxEWno(name).qoPGr6Ce();
        Context context2 = this.qoPGr6Ce;
        qoPGr6Ce.P7K7Inc8(context2, attributeSet);
        VM67d7Sv vM67d7Sv2 = qoPGr6Ce.MdtA4re8;
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = v00.NCTxEWno;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    obtainAttributes.getClass();
                    String string = obtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    tt MdtA4re82 = MdtA4re8(obtainAttributes, resources, i3);
                    vM67d7Sv2.getClass();
                    ((LinkedHashMap) vM67d7Sv2.VgvYg0wo).put(string, MdtA4re82);
                    obtainAttributes.recycle();
                } else {
                    String str3 = null;
                    if ("deepLink".equals(name2)) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, v00.MdtA4re8);
                        obtainAttributes2.getClass();
                        String string2 = obtainAttributes2.getString(3);
                        String string3 = obtainAttributes2.getString(i4);
                        String string4 = obtainAttributes2.getString(2);
                        if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                            break;
                        }
                        if (string2 != null) {
                            String packageName = context2.getPackageName();
                            packageName.getClass();
                            str = ja0.KlHjfFWx(string2, "${applicationId}", packageName);
                        } else {
                            str = null;
                        }
                        if (string3 == null || string3.length() == 0) {
                            str2 = null;
                        } else {
                            String packageName2 = context2.getPackageName();
                            packageName2.getClass();
                            str2 = ja0.KlHjfFWx(string3, "${applicationId}", packageName2);
                            if (str2.length() <= 0) {
                                m1.sjUBp5pO("The NavDeepLink cannot have an empty action.");
                                return null;
                            }
                        }
                        if (string4 != null) {
                            String packageName3 = context2.getPackageName();
                            packageName3.getClass();
                            str3 = ja0.KlHjfFWx(string4, "${applicationId}", packageName3);
                        }
                        mu muVar = new mu(str, str2, str3);
                        vM67d7Sv2.getClass();
                        ArrayList i7xS8jrb = le0.i7xS8jrb((LinkedHashMap) vM67d7Sv2.VgvYg0wo, new qu(muVar, 0));
                        if (!i7xS8jrb.isEmpty()) {
                            StringBuilder b2ZJblxo = q70.b2ZJblxo("Deep link ", str, " can't be used to open destination ");
                            b2ZJblxo.append((pu) vM67d7Sv2.NCTxEWno);
                            b2ZJblxo.append(".\nFollowing required arguments are missing: ");
                            b2ZJblxo.append(i7xS8jrb);
                            throw new IllegalArgumentException(b2ZJblxo.toString().toString());
                        }
                        ((ArrayList) vM67d7Sv2.MdtA4re8).add(muVar);
                        obtainAttributes2.recycle();
                    } else {
                        if ("action".equals(name2)) {
                            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, v00.qoPGr6Ce, 0, 0);
                            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                            int i5 = i4;
                            st stVar = new st(obtainStyledAttributes.getResourceId(i4, 0));
                            stVar.NCTxEWno = new xu(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                            Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                            int depth3 = xmlResourceParser.getDepth() + 1;
                            context = context2;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                vM67d7Sv = vM67d7Sv2;
                                if (next2 == i5) {
                                    i2 = depth2;
                                    break;
                                }
                                int depth4 = xmlResourceParser.getDepth();
                                i2 = depth2;
                                if (depth4 < depth3 && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth4 <= depth3) {
                                    if ("argument".equals(xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                        obtainAttributes3.getClass();
                                        String string5 = obtainAttributes3.getString(0);
                                        if (string5 == null) {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                        tt MdtA4re83 = MdtA4re8(obtainAttributes3, resources, i3);
                                        boolean z = MdtA4re83.MdtA4re8;
                                        if (z && z && (obj = MdtA4re83.wxUZMvaN) != null) {
                                            MdtA4re83.qoPGr6Ce.VgvYg0wo(VgvYg0wo, string5, obj);
                                        }
                                        obtainAttributes3.recycle();
                                    }
                                    i3 = i;
                                }
                                vM67d7Sv2 = vM67d7Sv;
                                depth2 = i2;
                                i5 = 1;
                            }
                            if (!VgvYg0wo.isEmpty()) {
                                stVar.MdtA4re8 = VgvYg0wo;
                            }
                            if (qoPGr6Ce instanceof QhQjwNAr) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + qoPGr6Ce + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            }
                            if (resourceId == 0) {
                                m1.sjUBp5pO("Cannot have an action with actionId 0");
                                return null;
                            }
                            qoPGr6Ce.P7K7Inc8.NCTxEWno(resourceId, stVar);
                            obtainStyledAttributes.recycle();
                        } else {
                            context = context2;
                            vM67d7Sv = vM67d7Sv2;
                            i2 = depth2;
                            if ("include".equals(name2) && (qoPGr6Ce instanceof ru)) {
                                TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, u00.MdtA4re8);
                                obtainAttributes4.getClass();
                                ((ru) qoPGr6Ce).b2ZJblxo(NCTxEWno(obtainAttributes4.getResourceId(0, 0)));
                                obtainAttributes4.recycle();
                            } else if (qoPGr6Ce instanceof ru) {
                                ((ru) qoPGr6Ce).b2ZJblxo(qoPGr6Ce(resources, xmlResourceParser, attributeSet, i));
                            }
                        }
                        i3 = i;
                        context2 = context;
                        vM67d7Sv2 = vM67d7Sv;
                        depth2 = i2;
                        i4 = 1;
                    }
                }
            }
        }
    }
}
