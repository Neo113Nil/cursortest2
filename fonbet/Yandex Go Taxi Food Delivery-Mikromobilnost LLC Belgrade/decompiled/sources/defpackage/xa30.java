package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.e;
import com.adjust.sdk.Constants;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class xa30 {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final c j;
    public final ArrayList k;
    public d l;
    public final ArrayList m;
    public final int n;
    public boolean o;
    public int p;
    public final int q;
    public final int r;

    public xa30(c cVar, Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.r = 0;
        int i = cVar.k;
        SparseArray sparseArray = cVar.h;
        this.h = i;
        this.q = cVar.l;
        this.j = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.Transition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == z3i0.Transition_constraintSetEnd) {
                this.c = obtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    e eVar = new e();
                    eVar.q(this.c, context);
                    sparseArray.append(this.c, eVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.c = cVar.k(this.c, context);
                }
            } else if (index == z3i0.Transition_constraintSetStart) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                if ("layout".equals(resourceTypeName2)) {
                    e eVar2 = new e();
                    eVar2.q(this.d, context);
                    sparseArray.append(this.d, eVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.d = cVar.k(this.d, context);
                }
            } else if (index == z3i0.Transition_motionInterpolator) {
                int i3 = obtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.e = -2;
                    }
                } else if (i3 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.g = obtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    }
                } else {
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                }
            } else if (index == z3i0.Transition_duration) {
                int i4 = obtainStyledAttributes.getInt(index, this.h);
                this.h = i4;
                if (i4 < 8) {
                    this.h = 8;
                }
            } else if (index == z3i0.Transition_staggered) {
                this.i = obtainStyledAttributes.getFloat(index, this.i);
            } else if (index == z3i0.Transition_autoTransition) {
                this.n = obtainStyledAttributes.getInteger(index, this.n);
            } else if (index == z3i0.Transition_android_id) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == z3i0.Transition_transitionDisable) {
                this.o = obtainStyledAttributes.getBoolean(index, this.o);
            } else if (index == z3i0.Transition_pathMotionArc) {
                this.p = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == z3i0.Transition_layoutDuringTransition) {
                this.q = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == z3i0.Transition_transitionFlags) {
                this.r = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.d == -1) {
            this.b = true;
        }
        obtainStyledAttributes.recycle();
    }

    public xa30(c cVar, int i, int i2) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.a = -1;
        this.j = cVar;
        this.d = i;
        this.c = i2;
        this.h = cVar.k;
        this.q = cVar.l;
    }

    public xa30(c cVar, xa30 xa30Var) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.j = cVar;
        this.h = cVar.k;
        if (xa30Var != null) {
            this.p = xa30Var.p;
            this.e = xa30Var.e;
            this.f = xa30Var.f;
            this.g = xa30Var.g;
            this.h = xa30Var.h;
            this.k = xa30Var.k;
            this.i = xa30Var.i;
            this.q = xa30Var.q;
        }
    }
}
