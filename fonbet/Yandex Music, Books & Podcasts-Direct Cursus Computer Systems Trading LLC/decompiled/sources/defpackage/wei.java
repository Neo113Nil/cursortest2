package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;

/* loaded from: classes.dex */
public final class wei implements View.OnClickListener {
    public final xei a;
    public final int b;
    public final int c;

    public wei(Context context, xei xeiVar, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        this.c = 17;
        this.a = xeiVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 0) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
    public final void a(rei reiVar, int i, xei xeiVar) {
        int i2 = this.b;
        rei reiVar2 = reiVar;
        if (i2 != -1) {
            reiVar2 = reiVar.findViewById(i2);
        }
        if (reiVar2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = xeiVar.d;
        int i4 = xeiVar.c;
        if (i3 == -1) {
            reiVar2.setOnClickListener(this);
            return;
        }
        int i5 = this.c;
        int i6 = i5 & 1;
        boolean z = false;
        boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z = true;
        }
        if (z2 || z) {
            reiVar2.setOnClickListener(this);
        }
    }

    public final void b(rei reiVar) {
        int i = this.b;
        if (i == -1) {
            return;
        }
        View findViewById = reiVar.findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        xei xeiVar = this.a;
        yei yeiVar = xeiVar.j;
        rei reiVar = yeiVar.a;
        if (reiVar.z) {
            if (xeiVar.d == -1) {
                int currentState = reiVar.getCurrentState();
                if (currentState == -1) {
                    reiVar.I(xeiVar.c);
                    return;
                }
                xei xeiVar2 = new xei(yeiVar, xeiVar);
                xeiVar2.d = currentState;
                xeiVar2.c = xeiVar.c;
                reiVar.setTransition(xeiVar2);
                reiVar.u(1.0f);
                reiVar.a1 = null;
                return;
            }
            xei xeiVar3 = yeiVar.c;
            int i = this.c;
            int i2 = i & 1;
            boolean z = false;
            boolean z2 = true;
            boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
            int i3 = i & 16;
            if (i3 == 0 && (i & 4096) == 0) {
                z2 = false;
            }
            if (z3 && z2) {
                if (xeiVar3 != xeiVar) {
                    reiVar.setTransition(xeiVar);
                }
                if (reiVar.getCurrentState() != reiVar.getEndState() && reiVar.getProgress() <= 0.5f) {
                    z2 = false;
                }
                if (xeiVar != xeiVar3) {
                    int i4 = xeiVar.c;
                    int i5 = xeiVar.d;
                    int i6 = reiVar.v;
                    if (i5 == -1) {
                        if (i6 == i4) {
                            return;
                        }
                    } else if (i6 != i5 && i6 != i4) {
                        return;
                    }
                }
                if (!z && i2 != 0) {
                    reiVar.setTransition(xeiVar);
                    reiVar.u(1.0f);
                    reiVar.a1 = null;
                    return;
                }
                if (!z2 && i3 != 0) {
                    reiVar.setTransition(xeiVar);
                    reiVar.u(0.0f);
                    return;
                } else if (!z && (i & 256) != 0) {
                    reiVar.setTransition(xeiVar);
                    reiVar.setProgress(1.0f);
                    return;
                } else {
                    if (z2 || (i & 4096) == 0) {
                    }
                    reiVar.setTransition(xeiVar);
                    reiVar.setProgress(0.0f);
                    return;
                }
            }
            z = z3;
            if (xeiVar != xeiVar3) {
            }
            if (!z) {
            }
            if (!z2) {
            }
            if (!z) {
            }
            if (z2) {
            }
        }
    }
}
