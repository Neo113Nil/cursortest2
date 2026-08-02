package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public class whx extends jhx {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    public whx() {
        this.d = new HashMap();
    }

    @Override // defpackage.jhx
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jhx
    /* renamed from: b */
    public final jhx clone() {
        whx whxVar = new whx();
        super.c(this);
        whxVar.e = this.e;
        whxVar.f = this.f;
        whxVar.g = this.g;
        whxVar.h = this.h;
        whxVar.i = this.i;
        whxVar.j = this.j;
        whxVar.k = this.k;
        whxVar.l = this.l;
        whxVar.m = this.m;
        whxVar.n = this.n;
        whxVar.o = this.o;
        whxVar.p = this.p;
        whxVar.q = this.q;
        whxVar.r = this.r;
        whxVar.s = this.s;
        whxVar.t = this.t;
        whxVar.u = this.u;
        whxVar.v = this.v;
        whxVar.w = this.w;
        return whxVar;
    }

    @Override // defpackage.jhx
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add(CaretView.ALPHA_PROPERTY);
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.KeyCycle);
        SparseIntArray sparseIntArray = vhx.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = vhx.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = obtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    } else {
                        this.f = obtainStyledAttributes.getInt(index, this.f);
                        break;
                    }
                case 6:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.i;
                    if (i2 == 5) {
                        this.i = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.i = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
                case 8:
                    this.l = obtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 12:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = obtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 18:
                    this.v = obtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = obtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 21:
                    this.j = obtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        if (r1.equals("scaleY") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(HashMap hashMap) {
        ws31 ws31Var;
        float f;
        ws31 ws31Var2;
        for (String str : hashMap.keySet()) {
            char c = 7;
            if (str.startsWith("CUSTOM")) {
                c7e c7eVar = (c7e) this.d.get(str.substring(7));
                if (c7eVar != null && c7eVar.c == ConstraintAttribute$AttributeType.FLOAT_TYPE && (ws31Var = (ws31) hashMap.get(str)) != null) {
                    int i = this.a;
                    int i2 = this.f;
                    String str2 = this.g;
                    int i3 = this.l;
                    ws31Var.f.add(new xhx(this.h, this.i, this.j, c7eVar.b(), i));
                    if (i3 != -1) {
                        ws31Var.e = i3;
                    }
                    ws31Var.c = i2;
                    ws31Var.c(c7eVar);
                    ws31Var.d = str2;
                }
            } else {
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
                    case -40300674:
                        if (str.equals("rotation")) {
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
                        if (str.equals(CaretView.ALPHA_PROPERTY)) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
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
                        f = this.q;
                        break;
                    case 1:
                        f = this.r;
                        break;
                    case 2:
                        f = this.u;
                        break;
                    case 3:
                        f = this.v;
                        break;
                    case 4:
                        f = this.w;
                        break;
                    case 5:
                        f = this.k;
                        break;
                    case 6:
                        f = this.s;
                        break;
                    case 7:
                        f = this.t;
                        break;
                    case '\b':
                        f = this.o;
                        break;
                    case '\t':
                        f = this.n;
                        break;
                    case '\n':
                        f = this.p;
                        break;
                    case 11:
                        f = this.m;
                        break;
                    case '\f':
                        f = this.i;
                        break;
                    case '\r':
                        f = this.j;
                        break;
                    default:
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (ws31Var2 = (ws31) hashMap.get(str)) != null) {
                    int i4 = this.a;
                    int i5 = this.f;
                    String str3 = this.g;
                    int i6 = this.l;
                    ws31Var2.f.add(new xhx(this.h, this.i, this.j, f2, i4));
                    if (i6 != -1) {
                        ws31Var2.e = i6;
                    }
                    ws31Var2.c = i5;
                    ws31Var2.d = str3;
                }
            }
        }
    }
}
