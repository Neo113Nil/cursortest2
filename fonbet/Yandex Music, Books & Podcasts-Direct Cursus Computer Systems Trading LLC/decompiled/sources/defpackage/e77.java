package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.IOException;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public abstract class e77 extends TimerTask {
    public final p2f a;

    public e77(p2f p2fVar) {
        this.a = p2fVar;
    }

    public final o67 a(o67 o67Var, l67 l67Var, w67 w67Var) {
        try {
            o67Var.e(l67Var, w67Var);
            return o67Var;
        } catch (IOException unused) {
            int i = o67Var.c;
            boolean z = o67Var.b;
            int i2 = o67Var.i;
            int b = o67Var.b();
            o67Var.c = i | RemoteCameraConfig.Mic.BUFFER_SIZE;
            o67Var.a = b;
            this.a.S0(o67Var);
            o67 o67Var2 = new o67(i, i2, z);
            o67Var2.e(l67Var, w67Var);
            return o67Var2;
        }
    }

    public final o67 b(o67 o67Var, w67 w67Var, long j) {
        try {
            o67Var.f(w67Var, j);
            return o67Var;
        } catch (IOException unused) {
            int i = o67Var.c;
            boolean z = o67Var.b;
            int i2 = o67Var.i;
            int b = o67Var.b();
            o67Var.c = i | RemoteCameraConfig.Mic.BUFFER_SIZE;
            o67Var.a = b;
            this.a.S0(o67Var);
            o67 o67Var2 = new o67(i, i2, z);
            o67Var2.f(w67Var, j);
            return o67Var2;
        }
    }

    public final o67 c(o67 o67Var, w67 w67Var) {
        try {
            o67Var.g(w67Var);
            return o67Var;
        } catch (IOException unused) {
            int i = o67Var.c;
            boolean z = o67Var.b;
            int i2 = o67Var.i;
            int b = o67Var.b();
            o67Var.c = i | RemoteCameraConfig.Mic.BUFFER_SIZE;
            o67Var.a = b;
            this.a.S0(o67Var);
            o67 o67Var2 = new o67(i, i2, z);
            o67Var2.g(w67Var);
            return o67Var2;
        }
    }

    public final o67 d(o67 o67Var, q67 q67Var) {
        try {
            o67Var.h(q67Var);
            return o67Var;
        } catch (IOException unused) {
            int i = o67Var.c;
            boolean z = o67Var.b;
            int i2 = o67Var.i;
            int b = o67Var.b();
            o67Var.c = i | RemoteCameraConfig.Mic.BUFFER_SIZE;
            o67Var.a = b;
            this.a.S0(o67Var);
            o67 o67Var2 = new o67(i, i2, z);
            o67Var2.h(q67Var);
            return o67Var2;
        }
    }

    public abstract String e();

    public String toString() {
        return e();
    }
}
