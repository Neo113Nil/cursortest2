package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class xww implements mxw, rmd {
    public final Lock a;
    public final Condition h;
    public final Context i;
    public final qmd j;
    public final sww k;
    public final Map l;
    public final HashMap m = new HashMap();
    public final rn5 n;
    public final Map o;
    public final i4w p;
    public volatile vww q;
    public int r;
    public final uww s;
    public final gxw t;

    public xww(Context context, uww uwwVar, Lock lock, Looper looper, qmd qmdVar, xy0 xy0Var, rn5 rn5Var, xy0 xy0Var2, i4w i4wVar, ArrayList arrayList, gxw gxwVar) {
        this.i = context;
        this.a = lock;
        this.j = qmdVar;
        this.l = xy0Var;
        this.n = rn5Var;
        this.o = xy0Var2;
        this.p = i4wVar;
        this.s = uwwVar;
        this.t = gxwVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wyw) arrayList.get(i)).i = this;
        }
        this.k = new sww(this, looper, 1);
        this.h = lock.newCondition();
        this.q = new vtm(this);
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        this.a.lock();
        try {
            this.q.b(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.mxw
    public final void a() {
        this.q.j();
    }

    @Override // defpackage.mxw
    public final boolean b(dzw dzwVar) {
        return false;
    }

    @Override // defpackage.mxw
    public final void d() {
        if (this.q.o()) {
            this.m.clear();
        }
    }

    @Override // defpackage.mxw
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.q);
        for (po0 po0Var : this.o.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) po0Var.c).println(StringUtils.PROCESS_POSTFIX_DELIMITER);
            fo0 fo0Var = (fo0) this.l.get(po0Var.b);
            y1g.G(fo0Var);
            fo0Var.i(str.concat("  "), printWriter);
        }
    }

    @Override // defpackage.mxw
    public final gr2 f(gr2 gr2Var) {
        gr2Var.k();
        return this.q.l(gr2Var);
    }

    @Override // defpackage.mxw
    public final boolean g() {
        return this.q instanceof hww;
    }

    public final void h() {
        this.a.lock();
        try {
            this.q = new vtm(this);
            this.q.h();
            this.h.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
        this.a.lock();
        try {
            this.q.n(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.mxw
    public final void c() {
    }
}
