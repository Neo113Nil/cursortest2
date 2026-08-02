package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jbf extends caf {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public int r = 0;
    public float s = Float.NaN;
    public float t = 0.0f;

    public jbf() {
        this.d = new HashMap();
    }

    @Override // defpackage.caf
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.caf
    /* renamed from: b */
    public final caf clone() {
        jbf jbfVar = new jbf();
        super.c(this);
        jbfVar.e = this.e;
        jbfVar.r = this.r;
        jbfVar.s = this.s;
        jbfVar.t = this.t;
        jbfVar.q = this.q;
        jbfVar.f = this.f;
        jbfVar.g = this.g;
        jbfVar.h = this.h;
        jbfVar.k = this.k;
        jbfVar.i = this.i;
        jbfVar.j = this.j;
        jbfVar.l = this.l;
        jbfVar.m = this.m;
        jbfVar.n = this.n;
        jbfVar.o = this.o;
        jbfVar.p = this.p;
        return jbfVar;
    }

    @Override // defpackage.caf
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add(CameraProperty.ROTATION);
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.caf
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.j);
        SparseIntArray sparseIntArray = ibf.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = ibf.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (rei.k1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 12:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 18:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    } else {
                        this.r = obtainStyledAttributes.getInt(index, this.r);
                        break;
                    }
                case 20:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 21:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.t;
                    if (i2 == 5) {
                        this.t = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.t = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
            }
        }
    }

    @Override // defpackage.caf
    public final void f(HashMap hashMap) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            hashMap.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            hashMap.put(CameraProperty.ROTATION, Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(f1d.g("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00e2, code lost:
    
        if (r1.equals("rotationY") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            thu thuVar = (thu) hashMap.get(str);
            if (thuVar != null) {
                char c = 1;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals(CameraProperty.ROTATION)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                thuVar.c(this.i, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                thuVar.c(this.j, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                thuVar.c(this.n, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                thuVar.c(this.o, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                thuVar.c(this.p, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                thuVar.c(this.q, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                thuVar.c(this.l, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                thuVar.c(this.m, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                thuVar.c(this.h, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                thuVar.c(this.g, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                thuVar.c(this.k, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                thuVar.c(this.f, this.s, this.t, this.a, this.r);
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    p86 p86Var = (p86) this.d.get(str.substring(7));
                    if (p86Var != null) {
                        qhu qhuVar = (qhu) thuVar;
                        int i = this.a;
                        float f = this.s;
                        int i2 = this.r;
                        float f2 = this.t;
                        qhuVar.l.append(i, p86Var);
                        qhuVar.m.append(i, new float[]{f, f2});
                        qhuVar.b = Math.max(qhuVar.b, i2);
                    }
                }
            }
        }
    }
}
