package defpackage;

import android.os.Looper;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ohu implements View.OnAttachStateChangeListener {
    public final View a;
    public mhu b;
    public rar c;
    public nhu d;
    public boolean e;

    public ohu(View view) {
        this.a = view;
    }

    public final synchronized void c() {
        try {
            rar rarVar = this.c;
            Continuation continuation = null;
            if (rarVar != null) {
                rarVar.g(null);
            }
            cmd cmdVar = cmd.a;
            dq7 dq7Var = ca8.a;
            this.c = x97.y(cmdVar, j5h.a.g, null, new pjt(this, continuation, 4), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized mhu d(ou7 ou7Var) {
        mhu mhuVar = this.b;
        if (mhuVar != null && Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()) && this.e) {
            this.e = false;
            mhuVar.b = ou7Var;
            return mhuVar;
        }
        rar rarVar = this.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.c = null;
        mhu mhuVar2 = new mhu(this.a, ou7Var);
        this.b = mhuVar2;
        return mhuVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        nhu nhuVar = this.d;
        if (nhuVar == null) {
            return;
        }
        this.e = true;
        nhuVar.a.d(nhuVar.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        nhu nhuVar = this.d;
        if (nhuVar != null) {
            nyf nyfVar = nhuVar.d;
            nhuVar.e.g(null);
            lhu lhuVar = nhuVar.c;
            if (lhuVar instanceof czf) {
                nyfVar.d((czf) lhuVar);
            }
            nyfVar.d(nhuVar);
        }
    }
}
