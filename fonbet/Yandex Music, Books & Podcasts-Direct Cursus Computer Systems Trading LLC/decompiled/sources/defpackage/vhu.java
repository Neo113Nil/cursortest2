package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class vhu {
    public int a;
    public int e;
    public final taf f;
    public final a96 g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r2.equals("CustomMethod") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vhu(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                this.g = f96.d(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", irf.M() + " unknown tag " + name);
                            StringBuilder sb = new StringBuilder();
                            sb.append(".xml:");
                            sb.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb.toString());
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                this.f = new taf(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", irf.M() + " unknown tag " + name);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(".xml:");
                            sb2.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2.toString());
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                d(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", irf.M() + " unknown tag " + name);
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(".xml:");
                            sb22.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb22.toString());
                            break;
                        case 366511058:
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                p86.d(context, xmlResourceParser, this.g.g);
                                break;
                            }
                            Log.e("ViewTransition", irf.M() + " unknown tag " + name);
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(".xml:");
                            sb222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb222.toString());
                            break;
                        default:
                            Log.e("ViewTransition", irf.M() + " unknown tag " + name);
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(".xml:");
                            sb2222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2222.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void a(rdk rdkVar, rei reiVar, int i, f96 f96Var, View... viewArr) {
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        taf tafVar = this.f;
        int i3 = 0;
        if (i2 != 2) {
            a96 a96Var = this.g;
            if (i2 == 1) {
                int[] constraintSetIds = reiVar.getConstraintSetIds();
                int i4 = 0;
                while (i4 < constraintSetIds.length) {
                    int i5 = constraintSetIds[i4];
                    if (i5 != i) {
                        yei yeiVar = reiVar.q;
                        f96 b = yeiVar == null ? null : yeiVar.b(i5);
                        int length = viewArr.length;
                        for (int i6 = i3; i6 < length; i6++) {
                            a96 l = b.l(viewArr[i6].getId());
                            if (a96Var != null) {
                                z86 z86Var = a96Var.h;
                                if (z86Var != null) {
                                    z86Var.e(l);
                                }
                                l.g.putAll(a96Var.g);
                            }
                        }
                    }
                    i4++;
                    i3 = 0;
                }
            }
            f96 f96Var2 = new f96();
            HashMap hashMap = f96Var2.g;
            hashMap.clear();
            for (Integer num : f96Var.g.keySet()) {
                a96 a96Var2 = (a96) f96Var.g.get(num);
                if (a96Var2 != null) {
                    hashMap.put(num, a96Var2.clone());
                }
            }
            for (View view : viewArr) {
                a96 l2 = f96Var2.l(view.getId());
                if (a96Var != null) {
                    z86 z86Var2 = a96Var.h;
                    if (z86Var2 != null) {
                        z86Var2.e(l2);
                    }
                    l2.g.putAll(a96Var.g);
                }
            }
            reiVar.J(i, f96Var2);
            reiVar.J(R.id.view_transition, f96Var);
            reiVar.F(R.id.view_transition);
            xei xeiVar = new xei(reiVar.q, i);
            for (View view2 : viewArr) {
                int i7 = this.h;
                if (i7 != -1) {
                    xeiVar.h = Math.max(i7, 8);
                }
                xeiVar.p = this.d;
                int i8 = this.l;
                String str = this.m;
                int i9 = this.n;
                xeiVar.e = i8;
                xeiVar.f = str;
                xeiVar.g = i9;
                int id = view2.getId();
                if (tafVar != null) {
                    ArrayList arrayList = (ArrayList) tafVar.a.get(-1);
                    taf tafVar2 = new taf();
                    tafVar2.a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        caf clone = ((caf) it.next()).clone();
                        clone.b = id;
                        tafVar2.b(clone);
                    }
                    xeiVar.k.add(tafVar2);
                }
            }
            reiVar.setTransition(xeiVar);
            xlr xlrVar = new xlr(19, this, viewArr);
            reiVar.u(1.0f);
            reiVar.a1 = xlrVar;
            return;
        }
        View view3 = viewArr[0];
        gei geiVar = new gei(view3);
        sei seiVar = geiVar.f;
        seiVar.c = 0.0f;
        seiVar.d = 0.0f;
        geiVar.H = true;
        seiVar.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        geiVar.g.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        eei eeiVar = geiVar.h;
        eeiVar.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        eeiVar.c = view3.getVisibility();
        eeiVar.e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        eeiVar.f = view3.getElevation();
        eeiVar.g = view3.getRotation();
        eeiVar.h = view3.getRotationX();
        eeiVar.a = view3.getRotationY();
        eeiVar.i = view3.getScaleX();
        eeiVar.j = view3.getScaleY();
        eeiVar.k = view3.getPivotX();
        eeiVar.l = view3.getPivotY();
        eeiVar.m = view3.getTranslationX();
        eeiVar.n = view3.getTranslationY();
        eeiVar.o = view3.getTranslationZ();
        eei eeiVar2 = geiVar.i;
        eeiVar2.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        eeiVar2.c = view3.getVisibility();
        eeiVar2.e = view3.getVisibility() == 0 ? view3.getAlpha() : 0.0f;
        eeiVar2.f = view3.getElevation();
        eeiVar2.g = view3.getRotation();
        eeiVar2.h = view3.getRotationX();
        eeiVar2.a = view3.getRotationY();
        eeiVar2.i = view3.getScaleX();
        eeiVar2.j = view3.getScaleY();
        eeiVar2.k = view3.getPivotX();
        eeiVar2.l = view3.getPivotY();
        eeiVar2.m = view3.getTranslationX();
        eeiVar2.n = view3.getTranslationY();
        eeiVar2.o = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) tafVar.a.get(-1);
        if (arrayList2 != null) {
            geiVar.w.addAll(arrayList2);
        }
        geiVar.g(System.nanoTime(), reiVar.getWidth(), reiVar.getHeight());
        int i10 = this.h;
        int i11 = this.i;
        int i12 = this.b;
        Context context = reiVar.getContext();
        int i13 = this.l;
        if (i13 == -2) {
            loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
        } else if (i13 == -1) {
            loadInterpolator = new fei(2, jya.c(this.m));
        } else if (i13 == 0) {
            loadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i13 == 1) {
            loadInterpolator = new AccelerateInterpolator();
        } else if (i13 == 2) {
            loadInterpolator = new DecelerateInterpolator();
        } else if (i13 == 4) {
            loadInterpolator = new BounceInterpolator();
        } else if (i13 == 5) {
            loadInterpolator = new OvershootInterpolator();
        } else {
            if (i13 != 6) {
                interpolator = null;
                new uhu(rdkVar, geiVar, i10, i11, i12, interpolator, this.p, this.q);
            }
            loadInterpolator = new AnticipateInterpolator();
        }
        interpolator = loadInterpolator;
        new uhu(rdkVar, geiVar, i10, i11, i12, interpolator, this.p, this.q);
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof t86) && (str = ((t86) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.y);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (rei.k1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + irf.O(this.o, this.a) + ")";
    }
}
