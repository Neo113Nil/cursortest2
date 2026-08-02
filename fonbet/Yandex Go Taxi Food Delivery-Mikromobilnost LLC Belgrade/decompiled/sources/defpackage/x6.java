package defpackage;

import android.util.Log;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class x6 implements gq60 {
    public final Object a;
    public final CopyOnWriteArrayList b;
    public List c;
    public Throwable d;
    public boolean e;

    public x6(List list) {
        this.a = new Object();
        this.b = new CopyOnWriteArrayList();
        this.d = null;
        this.e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new yq7(scc.i((String) it.next()), null));
        }
        this.c = arrayList;
    }

    @Override // defpackage.gq60
    public final void a(dq60 dq60Var) {
        w6 w6Var;
        dq60Var.getClass();
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                w6Var = null;
                break;
            } else {
                w6Var = (w6) it.next();
                if (w6Var.b.equals(dq60Var)) {
                    break;
                }
            }
        }
        if (w6Var != null) {
            this.b.remove(w6Var);
        }
        synchronized (this.a) {
            try {
                if (this.e && this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.e = false;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gq60
    public final void b(Executor executor, dq60 dq60Var) {
        List unmodifiableList;
        Throwable th;
        executor.getClass();
        dq60Var.getClass();
        this.b.add(new w6(executor, dq60Var));
        synchronized (this.a) {
            try {
                if (!this.e && !this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.e = true;
                    d();
                }
                unmodifiableList = Collections.unmodifiableList(this.c);
                th = this.d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new d1(1, th, new w6(executor, dq60Var), unmodifiableList));
    }

    public abstract void d();

    public abstract void e();

    public final void f(ArrayList arrayList, CameraUnavailableException cameraUnavailableException) {
        boolean z;
        List unmodifiableList;
        Throwable th;
        synchronized (this.a) {
            try {
                if (cameraUnavailableException != null) {
                    if (this.d != null) {
                        if (!this.c.isEmpty()) {
                        }
                        this.d = cameraUnavailableException;
                        this.c = Collections.EMPTY_LIST;
                    }
                    z = true;
                    this.d = cameraUnavailableException;
                    this.c = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    z = (this.d == null && this.c.equals(arrayList)) ? false : true;
                    this.d = null;
                    this.c = arrayList;
                }
                unmodifiableList = Collections.unmodifiableList(this.c);
                th = this.d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            this.b.size();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                w6 w6Var = (w6) it.next();
                w6Var.a.execute(new d1(1, th, w6Var, unmodifiableList));
            }
        }
    }

    public x6() {
        this(Collections.EMPTY_LIST);
    }
}
