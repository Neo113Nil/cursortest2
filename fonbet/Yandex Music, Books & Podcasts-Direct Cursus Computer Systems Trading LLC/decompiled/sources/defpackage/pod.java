package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class pod extends AsyncTask {
    public Exception a;
    public final qod b;

    public pod(qod qodVar) {
        this.b = qodVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = bp6.a;
        if (!set.contains(this)) {
            try {
                Void[] voidArr = (Void[]) objArr;
                if (!set.contains(this)) {
                    try {
                        voidArr.getClass();
                        try {
                            qod qodVar = this.b;
                            qodVar.getClass();
                            String str = ood.j;
                            return h1b.H(qodVar);
                        } catch (Exception e) {
                            this.a = e;
                        }
                    } catch (Throwable th) {
                        bp6.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                bp6.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            List list = (List) obj;
            if (set.contains(this)) {
                return;
            }
            try {
                list.getClass();
                super.onPostExecute(list);
                Exception exc = this.a;
                if (exc != null) {
                    String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    HashSet hashSet = j3c.a;
                }
            } catch (Throwable th) {
                bp6.a(this, th);
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        qod qodVar = this.b;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            HashSet hashSet = j3c.a;
            if (qodVar.a == null) {
                qodVar.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.b + "}";
    }
}
