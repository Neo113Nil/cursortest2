package com.gamericefishpro.space.tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.v.n0;
import com.gamericefishpro.space.v.q0;
import com.gamericefishpro.space.w.q1;
import com.gamericefishpro.space.w.s1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements com.gamericefishpro.space.u8.v, com.gamericefishpro.space.c6.b, com.gamericefishpro.space.d6.h, com.gamericefishpro.space.v8.b, com.gamericefishpro.space.v8.c, com.gamericefishpro.space.e4.q, s1, com.gamericefishpro.space.y9.b, OnCompleteListener {
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ u(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList C(com.gamericefishpro.space.tb.u r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.tb.u.C(com.gamericefishpro.space.tb.u, java.lang.String):java.util.ArrayList");
    }

    public void A(float f, float f2) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.u(f, f2));
    }

    public void B(float f, float f2) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.n(f, f2));
    }

    public void D(float f, float f2, float f3, float f4) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.p(f, f2, f3, f4));
    }

    public void E(float f, float f2, float f3, float f4) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.x(f, f2, f3, f4));
    }

    public void F(float f) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.a0(f));
    }

    public void G(float f) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.z(f));
    }

    @Override // com.gamericefishpro.space.w.s1, com.gamericefishpro.space.w.p1
    public boolean a() {
        ((com.gamericefishpro.space.u6.n) this.e).getClass();
        return false;
    }

    @Override // com.gamericefishpro.space.w.p1
    public long b(com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.e).b(oVar, oVar2, oVar3);
    }

    @Override // com.gamericefishpro.space.e4.q
    public boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.e;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        Field field = l0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.gamericefishpro.space.c6.b
    public com.gamericefishpro.space.c6.a e(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new com.gamericefishpro.space.v5.a(((com.gamericefishpro.space.d6.f) this.e).L());
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o f(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.e).f(j, oVar, oVar2, oVar3);
    }

    @Override // com.gamericefishpro.space.v8.b
    public void h() {
        ((com.gamericefishpro.space.t8.f) this.e).onConnected(null);
    }

    @Override // com.gamericefishpro.space.u8.v
    public void i() {
        com.gamericefishpro.space.u8.x xVar = (com.gamericefishpro.space.u8.x) this.e;
        Iterator it = xVar.i.values().iterator();
        while (it.hasNext()) {
            ((com.gamericefishpro.space.t8.a) it.next()).l();
        }
        xVar.p.p = Collections.EMPTY_SET;
    }

    @Override // com.gamericefishpro.space.d6.h
    public void j(com.gamericefishpro.space.d6.g statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        com.gamericefishpro.space.v5.e eVar = (com.gamericefishpro.space.v5.e) this.e;
        int length = eVar.v.length;
        for (int i = 1; i < length; i++) {
            int i2 = eVar.v[i];
            if (i2 == 1) {
                statement.a(i, eVar.w[i]);
            } else if (i2 == 2) {
                statement.k(eVar.y[i], i);
            } else if (i2 == 3) {
                String str = eVar.z[i];
                Intrinsics.b(str);
                statement.i(i, str);
            } else if (i2 == 4) {
                byte[] bArr = eVar.A[i];
                Intrinsics.b(bArr);
                statement.G(i, bArr);
            } else if (i2 == 5) {
                statement.p(i);
            }
        }
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o k(com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.e).k(oVar, oVar2, oVar3);
    }

    @Override // com.gamericefishpro.space.d6.h
    public String l() {
        return ((com.gamericefishpro.space.v5.e) this.e).e;
    }

    @Override // com.gamericefishpro.space.u8.v
    public void n() {
        com.gamericefishpro.space.u8.x xVar = (com.gamericefishpro.space.u8.x) this.e;
        xVar.d.lock();
        try {
            xVar.n = new com.gamericefishpro.space.u8.r(xVar, xVar.k, xVar.l, xVar.g, xVar.m, xVar.d, xVar.f);
            xVar.n.i();
            xVar.e.signalAll();
        } finally {
            xVar.d.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        com.gamericefishpro.space.pi.h hVar = (com.gamericefishpro.space.pi.h) this.e;
        Exception exception = task.getException();
        if (exception != null) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith(com.gamericefishpro.space.wa.b.q(exception));
        } else if (task.i()) {
            hVar.i(null);
        } else {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith(task.getResult());
        }
    }

    @Override // com.gamericefishpro.space.v8.c
    public void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        ((com.gamericefishpro.space.t8.g) this.e).onConnectionFailed(bVar);
    }

    @Override // com.gamericefishpro.space.v8.b
    public void onConnectionSuspended(int i) {
        ((com.gamericefishpro.space.t8.f) this.e).onConnectionSuspended(i);
    }

    @Override // com.gamericefishpro.space.u8.v
    public boolean q() {
        return true;
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o r(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.u6.n) this.e).r(j, oVar, oVar2, oVar3);
    }

    public void s() {
        ((ArrayList) this.e).add(com.gamericefishpro.space.u1.j.c);
    }

    public void t(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.k(f, f2, f3, f4, f5, f6));
    }

    public void u(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.s(f, f2, f3, f4, f5, f6));
    }

    public com.gamericefishpro.space.w.v v(int i) {
        switch (this.d) {
            case 18:
                return ((com.gamericefishpro.space.w.w[]) this.e)[i];
            case 19:
                return (com.gamericefishpro.space.w.w) this.e;
            default:
                return (com.gamericefishpro.space.w.v) this.e;
        }
    }

    public s2 w() {
        com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
        if (kVarA.b() == 1) {
            return new com.gamericefishpro.space.y2.k(true);
        }
        f1 f1VarV = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
        kVarA.g(new com.gamericefishpro.space.y2.g(f1VarV, this));
        return f1VarV;
    }

    public void x(float f) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.l(f));
    }

    public void y(float f) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.t(f));
    }

    public void z(float f, float f2) {
        ((ArrayList) this.e).add(new com.gamericefishpro.space.u1.m(f, f2));
    }

    public /* synthetic */ u(int i, boolean z) {
        this.d = i;
    }

    public u(com.gamericefishpro.space.x7.e onUrlChanged, com.gamericefishpro.space.q0.n onPageFinished) {
        this.d = 24;
        Intrinsics.checkNotNullParameter(onUrlChanged, "onUrlChanged");
        Intrinsics.checkNotNullParameter(onPageFinished, "onPageFinished");
        this.e = onUrlChanged;
    }

    public u(int i) {
        Object a0Var;
        this.d = i;
        switch (i) {
            case 3:
                if (Build.VERSION.SDK_INT >= 28) {
                    a0Var = new com.gamericefishpro.space.n9.z(29);
                } else {
                    a0Var = new com.gamericefishpro.space.n9.a0(29);
                }
                this.e = a0Var;
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.e = Collections.synchronizedMap(new com.gamericefishpro.space.t.e(0));
                break;
            default:
                this.e = new ArrayList(32);
                break;
        }
    }

    public u(com.gamericefishpro.space.d6.f openHelper) {
        this.d = 13;
        Intrinsics.checkNotNullParameter(openHelper, "openHelper");
        this.e = openHelper;
    }

    public u(com.gamericefishpro.space.c3.c cVar) {
        this.d = 12;
        float f = q0.a;
        com.gamericefishpro.space.r4.d dVar = new com.gamericefishpro.space.r4.d();
        dVar.a = f;
        float fB = cVar.b();
        float f2 = n0.a;
        dVar.b = fB * 386.0878f * 160.0f * 0.84f;
        this.e = dVar;
    }

    public u(Context context) {
        boolean zIsEmpty;
        this.d = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.e = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    @Override // com.gamericefishpro.space.u8.v
    public void d(Bundle bundle) {
    }

    @Override // com.gamericefishpro.space.u8.v
    public void g(int i) {
    }

    public u(TextView textView) {
        this.d = 6;
        this.e = new com.gamericefishpro.space.u4.i(textView);
    }

    public u(EditText editText) {
        this.d = 5;
        this.e = new com.gamericefishpro.space.u6.l(editText, 14);
    }

    public u(float f, float f2, com.gamericefishpro.space.w.o oVar) {
        u uVar;
        this.d = 21;
        int i = q1.a;
        if (oVar != null) {
            uVar = new u(oVar, f, f2);
        } else {
            uVar = new u(f, f2);
        }
        this.e = new com.gamericefishpro.space.u6.n(uVar);
    }

    public u(com.gamericefishpro.space.w.o oVar, float f, float f2) {
        this.d = 18;
        int iB = oVar.b();
        com.gamericefishpro.space.w.w[] wVarArr = new com.gamericefishpro.space.w.w[iB];
        for (int i = 0; i < iB; i++) {
            wVarArr[i] = new com.gamericefishpro.space.w.w(f, f2, oVar.a(i));
        }
        this.e = wVarArr;
    }

    public u(float f, float f2) {
        this.d = 19;
        this.e = new com.gamericefishpro.space.w.w(f, f2, 0.01f);
    }

    @Override // com.gamericefishpro.space.u8.v
    public void p(com.gamericefishpro.space.s8.b bVar, com.gamericefishpro.space.t8.c cVar, boolean z) {
    }
}
