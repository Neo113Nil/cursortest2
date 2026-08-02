package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class yei {
    public final rei a;
    public final j4x b;
    public xei c;
    public final ArrayList d;
    public final xei e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public jzi o;
    public boolean p;
    public final rdk q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public yei(Context context, rei reiVar, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = reiVar;
        this.q = new rdk(reiVar);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            xei xeiVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                taf tafVar = new taf(context, xml);
                                if (xeiVar != null) {
                                    xeiVar.k.add(tafVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (!name.equals("Include")) {
                                break;
                            }
                            j(context, xml);
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                vhu vhuVar = new vhu(context, xml);
                                rdk rdkVar = this.q;
                                ((ArrayList) rdkVar.d).add(vhuVar);
                                rdkVar.e = null;
                                int i2 = vhuVar.b;
                                if (i2 == 4) {
                                    rdk.K(vhuVar);
                                    break;
                                } else if (i2 == 5) {
                                    rdk.K(vhuVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                xeiVar = new xei(this, context, xml);
                                boolean z = xeiVar.b;
                                arrayList.add(xeiVar);
                                if (this.c == null && !z) {
                                    this.c = xeiVar;
                                    wps wpsVar = xeiVar.l;
                                    if (wpsVar != null) {
                                        wpsVar.c(this.p);
                                    }
                                }
                                if (z) {
                                    if (xeiVar.c == -1) {
                                        this.e = xeiVar;
                                    } else {
                                        this.f.add(xeiVar);
                                    }
                                    arrayList.remove(xeiVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name.equals("OnClick") && xeiVar != null && !reiVar.isInEditMode()) {
                                xeiVar.m.add(new wei(context, xeiVar, xml));
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (xeiVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (xeiVar != null) {
                                    xeiVar.l = new wps(context, reiVar, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new j4x(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(R.id.motion_base, new f96());
        this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int c(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), ConnectableDevice.KEY_ID, context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final boolean a(int i, rei reiVar) {
        xei xeiVar;
        if (this.o != null) {
            return false;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            xei xeiVar2 = (xei) it.next();
            int i2 = xeiVar2.n;
            if (i2 != 0 && ((xeiVar = this.c) != xeiVar2 || (xeiVar.r & 2) == 0)) {
                int i3 = xeiVar2.d;
                qei qeiVar = qei.d;
                qei qeiVar2 = qei.c;
                qei qeiVar3 = qei.b;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    reiVar.setState(qeiVar);
                    reiVar.setTransition(xeiVar2);
                    if (xeiVar2.n == 4) {
                        reiVar.u(1.0f);
                        reiVar.a1 = null;
                        reiVar.setState(qeiVar3);
                        reiVar.setState(qeiVar2);
                        return true;
                    }
                    reiVar.setProgress(1.0f);
                    reiVar.w(true);
                    reiVar.setState(qeiVar3);
                    reiVar.setState(qeiVar2);
                    reiVar.setState(qeiVar);
                    reiVar.C();
                    return true;
                }
                if (i == xeiVar2.c && (i2 == 3 || i2 == 1)) {
                    reiVar.setState(qeiVar);
                    reiVar.setTransition(xeiVar2);
                    if (xeiVar2.n == 3) {
                        reiVar.u(0.0f);
                        reiVar.setState(qeiVar3);
                        reiVar.setState(qeiVar2);
                        return true;
                    }
                    reiVar.setProgress(0.0f);
                    reiVar.w(true);
                    reiVar.setState(qeiVar3);
                    reiVar.setState(qeiVar2);
                    reiVar.setState(qeiVar);
                    reiVar.C();
                    return true;
                }
            }
        }
        return false;
    }

    public final f96 b(int i) {
        int F;
        j4x j4xVar = this.b;
        if (j4xVar != null && (F = j4xVar.F(i)) != -1) {
            i = F;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return (f96) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + irf.O(this.a.getContext(), i) + " In MotionScene");
        return (f96) sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        xei xeiVar = this.c;
        int i = xeiVar.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new fei(1, jya.c(xeiVar.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(gei geiVar) {
        xei xeiVar = this.c;
        if (xeiVar != null) {
            Iterator it = xeiVar.k.iterator();
            while (it.hasNext()) {
                ((taf) it.next()).a(geiVar);
            }
        } else {
            xei xeiVar2 = this.e;
            if (xeiVar2 != null) {
                Iterator it2 = xeiVar2.k.iterator();
                while (it2.hasNext()) {
                    ((taf) it2.next()).a(geiVar);
                }
            }
        }
    }

    public final float f() {
        wps wpsVar;
        xei xeiVar = this.c;
        if (xeiVar == null || (wpsVar = xeiVar.l) == null) {
            return 0.0f;
        }
        return wpsVar.t;
    }

    public final int g() {
        xei xeiVar = this.c;
        if (xeiVar == null) {
            return -1;
        }
        return xeiVar.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        f96 f96Var = new f96();
        f96Var.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3355:
                    if (attributeName.equals(ConnectableDevice.KEY_ID)) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i2 = c(context, attributeValue);
                    break;
                case true:
                    try {
                        f96Var.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                f96Var.d = 4;
                                break;
                            case true:
                                f96Var.d = 2;
                                break;
                            case true:
                                f96Var.d = 0;
                                break;
                            case true:
                                f96Var.d = 1;
                                break;
                            case true:
                                f96Var.d = 3;
                                break;
                        }
                    }
                    break;
                case true:
                    i = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(i));
                    f96Var.a = irf.O(context, i);
                    break;
                case true:
                    f96Var.c = attributeValue.split(StringUtils.COMMA);
                    int i4 = 0;
                    while (true) {
                        String[] strArr = f96Var.c;
                        if (i4 < strArr.length) {
                            strArr[i4] = strArr[i4].trim();
                            i4++;
                        }
                    }
                    break;
            }
        }
        if (i != -1) {
            int i5 = this.a.K;
            f96Var.n(context, xmlResourceParser);
            if (i2 != -1) {
                this.i.put(i, i2);
            }
            this.g.put(i, f96Var);
        }
        return i;
    }

    public final int i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.z);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                i(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.p);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(int i, rei reiVar) {
        SparseArray sparseArray = this.g;
        f96 f96Var = (f96) sparseArray.get(i);
        String str = f96Var.a;
        HashMap hashMap = f96Var.g;
        f96Var.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            l(i2, reiVar);
            f96 f96Var2 = (f96) sparseArray.get(i2);
            if (f96Var2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + irf.O(this.a.getContext(), i2));
                return;
            }
            HashMap hashMap2 = f96Var2.g;
            f96Var.b += "/" + f96Var2.b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                a96 a96Var = (a96) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new a96());
                }
                a96 a96Var2 = (a96) hashMap.get(num);
                if (a96Var2 != null) {
                    b96 b96Var = a96Var2.e;
                    if (!b96Var.b) {
                        b96Var.a(a96Var.e);
                    }
                    d96 d96Var = a96Var2.c;
                    if (!d96Var.a) {
                        d96 d96Var2 = a96Var.c;
                        d96Var.a = d96Var2.a;
                        d96Var.b = d96Var2.b;
                        d96Var.d = d96Var2.d;
                        d96Var.e = d96Var2.e;
                        d96Var.c = d96Var2.c;
                    }
                    e96 e96Var = a96Var2.f;
                    if (!e96Var.a) {
                        e96Var.a(a96Var.f);
                    }
                    c96 c96Var = a96Var2.d;
                    if (!c96Var.a) {
                        c96Var.a(a96Var.d);
                    }
                    for (String str2 : a96Var.g.keySet()) {
                        if (!a96Var2.g.containsKey(str2)) {
                            a96Var2.g.put(str2, (p86) a96Var.g.get(str2));
                        }
                    }
                }
            }
        } else {
            f96Var.b = su4.o(new StringBuilder(), f96Var.b, "  layout");
            int childCount = reiVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = reiVar.getChildAt(i3);
                t86 t86Var = (t86) childAt.getLayoutParams();
                int id = childAt.getId();
                if (f96Var.f && id == -1) {
                    wvs.p("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new a96());
                }
                a96 a96Var3 = (a96) hashMap.get(Integer.valueOf(id));
                if (a96Var3 != null) {
                    d96 d96Var3 = a96Var3.c;
                    b96 b96Var2 = a96Var3.e;
                    e96 e96Var2 = a96Var3.f;
                    if (!b96Var2.b) {
                        a96Var3.c(id, t86Var);
                        if (childAt instanceof r86) {
                            b96Var2.j0 = ((r86) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                b96Var2.o0 = barrier.getAllowsGoneWidget();
                                b96Var2.g0 = barrier.getType();
                                b96Var2.h0 = barrier.getMargin();
                            }
                        }
                        b96Var2.b = true;
                    }
                    if (!d96Var3.a) {
                        d96Var3.b = childAt.getVisibility();
                        d96Var3.d = childAt.getAlpha();
                        d96Var3.a = true;
                    }
                    if (!e96Var2.a) {
                        e96Var2.a = true;
                        e96Var2.b = childAt.getRotation();
                        e96Var2.c = childAt.getRotationX();
                        e96Var2.d = childAt.getRotationY();
                        e96Var2.e = childAt.getScaleX();
                        e96Var2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            e96Var2.g = pivotX;
                            e96Var2.h = pivotY;
                        }
                        e96Var2.j = childAt.getTranslationX();
                        e96Var2.k = childAt.getTranslationY();
                        e96Var2.l = childAt.getTranslationZ();
                        if (e96Var2.m) {
                            e96Var2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (a96 a96Var4 : hashMap.values()) {
            if (a96Var4.h != null) {
                if (a96Var4.b == null) {
                    a96Var4.h.e(f96Var.l(a96Var4.a));
                } else {
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        a96 l = f96Var.l(((Integer) it.next()).intValue());
                        String str3 = l.e.l0;
                        if (str3 != null && a96Var4.b.matches(str3)) {
                            a96Var4.h.e(l);
                            l.g.putAll((HashMap) a96Var4.g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, int i2) {
        int i3;
        int i4;
        j4x j4xVar = this.b;
        if (j4xVar != null) {
            i3 = j4xVar.F(i);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = this.b.F(i2);
        } else {
            i3 = i;
        }
        i4 = i2;
        xei xeiVar = this.c;
        if (xeiVar != null && xeiVar.c == i2 && xeiVar.d == i) {
            return;
        }
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xei xeiVar2 = (xei) it.next();
            int i5 = xeiVar2.c;
            if ((i5 == i4 && xeiVar2.d == i3) || (i5 == i2 && xeiVar2.d == i)) {
                this.c = xeiVar2;
                wps wpsVar = xeiVar2.l;
                if (wpsVar != null) {
                    wpsVar.c(this.p);
                    return;
                }
                return;
            }
        }
        Iterator it2 = this.f.iterator();
        xei xeiVar3 = this.e;
        while (it2.hasNext()) {
            xei xeiVar4 = (xei) it2.next();
            if (xeiVar4.c == i2) {
                xeiVar3 = xeiVar4;
            }
        }
        xei xeiVar5 = new xei(this, xeiVar3);
        xeiVar5.d = i3;
        xeiVar5.c = i4;
        if (i3 != -1) {
            arrayList.add(xeiVar5);
        }
        this.c = xeiVar5;
    }

    public final boolean n() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((xei) it.next()).l != null) {
                return true;
            }
        }
        xei xeiVar = this.c;
        return (xeiVar == null || xeiVar.l == null) ? false : true;
    }
}
