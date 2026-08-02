package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public class shx extends jhx {
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
    public float r = Float.NaN;
    public float s = Float.NaN;

    public shx() {
        this.d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x009c, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // defpackage.jhx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            jst0 jst0Var = (jst0) hashMap.get(str);
            if (jst0Var != null) {
                char c = 7;
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
                            if (str.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
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
                            break;
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals(CaretView.ALPHA_PROPERTY)) {
                                c = HexString.LF;
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
                                jst0Var.b(this.i, this.a);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                jst0Var.b(this.j, this.a);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                jst0Var.b(this.p, this.a);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                jst0Var.b(this.q, this.a);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                jst0Var.b(this.r, this.a);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                jst0Var.b(this.s, this.a);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                jst0Var.b(this.n, this.a);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                jst0Var.b(this.o, this.a);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                jst0Var.b(this.k, this.a);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                jst0Var.b(this.l, this.a);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                jst0Var.b(this.h, this.a);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                jst0Var.b(this.g, this.a);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                jst0Var.b(this.m, this.a);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                jst0Var.b(this.f, this.a);
                                break;
                            }
                    }
                } else {
                    c7e c7eVar = (c7e) this.d.get(str.substring(7));
                    if (c7eVar != null) {
                        ((vu31) jst0Var).f.append(this.a, c7eVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.jhx
    /* renamed from: b */
    public final jhx clone() {
        shx shxVar = new shx();
        super.c(this);
        shxVar.e = this.e;
        shxVar.f = this.f;
        shxVar.g = this.g;
        shxVar.h = this.h;
        shxVar.i = this.i;
        shxVar.j = this.j;
        shxVar.k = this.k;
        shxVar.l = this.l;
        shxVar.m = this.m;
        shxVar.n = this.n;
        shxVar.o = this.o;
        shxVar.p = this.p;
        shxVar.q = this.q;
        shxVar.r = this.r;
        shxVar.s = this.s;
        return shxVar;
    }

    @Override // defpackage.jhx
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add(CaretView.ALPHA_PROPERTY);
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.jhx
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.KeyAttribute);
        SparseIntArray sparseIntArray = rhx.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = rhx.a;
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
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
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
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
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
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = obtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 20:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
            }
        }
    }

    @Override // defpackage.jhx
    public final void f(HashMap hashMap) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put(CaretView.ALPHA_PROPERTY, Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            hashMap.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            hashMap.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(g8e.o("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h(Object obj, String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = HexString.LF;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(CaretView.ALPHA_PROPERTY)) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.s = jhx.g((Number) obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.i = jhx.g((Number) obj);
                break;
            case 3:
                this.j = jhx.g((Number) obj);
                break;
            case 4:
                this.p = jhx.g((Number) obj);
                break;
            case 5:
                this.q = jhx.g((Number) obj);
                break;
            case 6:
                this.r = jhx.g((Number) obj);
                break;
            case 7:
                this.n = jhx.g((Number) obj);
                break;
            case '\b':
                this.o = jhx.g((Number) obj);
                break;
            case '\t':
                this.k = jhx.g((Number) obj);
                break;
            case '\n':
                this.l = jhx.g((Number) obj);
                break;
            case 11:
                this.h = jhx.g((Number) obj);
                break;
            case '\f':
                this.g = jhx.g((Number) obj);
                break;
            case '\r':
                this.m = jhx.g((Number) obj);
                break;
            case 14:
                this.f = jhx.g((Number) obj);
                break;
            case 15:
                Number number = (Number) obj;
                this.e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
