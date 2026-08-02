package androidx.core.app;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class j extends AsyncTask {
    public final /* synthetic */ y0 a;

    public j(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        m mVar;
        o oVar;
        while (true) {
            y0 y0Var = this.a;
            try {
                oVar = y0Var.a;
            } catch (Exception e) {
                y0Var.f.d(com.yandex.passport.internal.analytics.m.j, e);
            }
            if (oVar != null) {
                mVar = oVar.b();
            } else {
                synchronized (y0Var.e) {
                    try {
                        if (y0Var.e.size() > 0) {
                            mVar = (m) y0Var.e.remove(0);
                        } else {
                            mVar = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (mVar != null) {
                mVar = new x0(y0Var, mVar);
            }
            if (mVar == null) {
                return null;
            }
            this.a.e(mVar.getIntent());
            mVar.g();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.f();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.f();
    }
}
