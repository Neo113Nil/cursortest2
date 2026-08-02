package ru.yandex.common.model;

import android.os.AsyncTask;
import defpackage.a270;
import defpackage.k2c;
import defpackage.lvj0;
import defpackage.pi4;
import defpackage.wnh;
import java.io.IOException;
import ru.yandex.common.network.Request;
import ru.yandex.common.startup.StartupResponse;

/* loaded from: classes4.dex */
public class OneResponseAsyncTask<T extends lvj0> extends AsyncTask<Request, Integer, T> {
    public static final String TAG = "[Y:OneResponseAsyncTask]";
    final a270 listener;
    final pi4 worker;

    public OneResponseAsyncTask(pi4 pi4Var, a270 a270Var) {
        this.listener = a270Var;
        if (pi4Var == null) {
            this.worker = new wnh();
        } else {
            this.worker = pi4Var;
        }
    }

    @Override // android.os.AsyncTask
    public T doInBackground(Request... requestArr) {
        ((wnh) this.worker).getClass();
        try {
            StartupResponse a = k2c.a(requestArr[0]);
            if (a != null) {
                return a;
            }
            onStateChanged(10);
            return null;
        } catch (IOException unused) {
            onStateChanged(10);
            return null;
        } catch (Throwable unused2) {
            onStateChanged(10);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(T t) {
        if (t == null) {
            return;
        }
        int code = t.getCode();
        if (code == 304) {
            this.listener.setState(5);
            return;
        }
        if (code == 400) {
            this.listener.setState(6);
            return;
        }
        if (code == 403) {
            this.listener.setState(8);
            return;
        }
        if (code == 500) {
            this.listener.setState(7);
            return;
        }
        boolean hasError = t.hasError();
        a270 a270Var = this.listener;
        if (hasError) {
            a270Var.setState(9);
        } else {
            a270Var.setResult(t);
            this.listener.setState(4);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.listener.setState(2);
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Integer... numArr) {
        this.listener.setState(numArr[0]);
    }

    public void onStateChanged(Integer num) {
        publishProgress(num);
    }

    public OneResponseAsyncTask(a270 a270Var) {
        this(new wnh(), a270Var);
    }
}
