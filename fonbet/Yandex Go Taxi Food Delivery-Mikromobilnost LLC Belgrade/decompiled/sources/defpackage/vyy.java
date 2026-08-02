package defpackage;

import java.io.PrintWriter;

/* loaded from: classes10.dex */
public final class vyy extends dy40 {
    public final t091 l;
    public pey m;
    public wyy n;

    public vyy(t091 t091Var) {
        this.l = t091Var;
        if (t091Var.a == null) {
            t091Var.a = this;
        } else {
            ny61.r("There is already a listener registered");
            throw null;
        }
    }

    @Override // androidx.lifecycle.v
    public final void h() {
        t091 t091Var = this.l;
        t091Var.b = true;
        t091Var.d = false;
        t091Var.c = false;
        t091Var.i.drainPermits();
        t091Var.b();
    }

    @Override // androidx.lifecycle.v
    public final void i() {
        this.l.b = false;
    }

    @Override // androidx.lifecycle.v
    public final void j(pq60 pq60Var) {
        super.j(pq60Var);
        this.m = null;
        this.n = null;
    }

    public final void n() {
        t091 t091Var = this.l;
        t091Var.a();
        t091Var.c = true;
        wyy wyyVar = this.n;
        if (wyyVar != null) {
            j(wyyVar);
        }
        vyy vyyVar = t091Var.a;
        if (vyyVar == null) {
            ny61.r("No listener register");
            return;
        }
        if (vyyVar != this) {
            ny61.g("Attempting to unregister the wrong listener");
            return;
        }
        t091Var.a = null;
        if (wyyVar != null) {
            boolean z = wyyVar.b;
        }
        t091Var.d = true;
        t091Var.b = false;
        t091Var.c = false;
        t091Var.e = false;
    }

    public final void o(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mArgs=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.l);
        t091 t091Var = this.l;
        String concat = str.concat("  ");
        t091Var.getClass();
        printWriter.print(concat);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(t091Var.a);
        if (t091Var.b || t091Var.e) {
            printWriter.print(concat);
            printWriter.print("mStarted=");
            printWriter.print(t091Var.b);
            printWriter.print(" mContentChanged=");
            printWriter.print(t091Var.e);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (t091Var.c || t091Var.d) {
            printWriter.print(concat);
            printWriter.print("mAbandoned=");
            printWriter.print(t091Var.c);
            printWriter.print(" mReset=");
            printWriter.println(t091Var.d);
        }
        if (t091Var.g != null) {
            printWriter.print(concat);
            printWriter.print("mTask=");
            printWriter.print(t091Var.g);
            printWriter.print(" waiting=");
            t091Var.g.getClass();
            printWriter.println(false);
        }
        if (t091Var.h != null) {
            printWriter.print(concat);
            printWriter.print("mCancellingTask=");
            printWriter.print(t091Var.h);
            printWriter.print(" waiting=");
            t091Var.h.getClass();
            printWriter.println(false);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.n);
            wyy wyyVar = this.n;
            String concat2 = str.concat("  ");
            wyyVar.getClass();
            printWriter.print(concat2);
            printWriter.print("mDeliveredData=");
            printWriter.println(wyyVar.b);
        }
        printWriter.print(str);
        printWriter.print("mData=");
        t091 t091Var2 = this.l;
        Object d = d();
        t091Var2.getClass();
        StringBuilder sb = new StringBuilder(64);
        if (d == null) {
            sb.append("null");
        } else {
            Class<?> cls = d.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        printWriter.println(sb.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(e());
    }

    public final void p() {
        pey peyVar = this.m;
        wyy wyyVar = this.n;
        if (peyVar == null || wyyVar == null) {
            return;
        }
        super.j(wyyVar);
        f(peyVar, wyyVar);
    }

    public final ryy q(pey peyVar, sl81 sl81Var) {
        t091 t091Var = this.l;
        wyy wyyVar = new wyy(t091Var, sl81Var);
        f(peyVar, wyyVar);
        pq60 pq60Var = this.n;
        if (pq60Var != null) {
            j(pq60Var);
        }
        this.m = peyVar;
        this.n = wyyVar;
        return t091Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
