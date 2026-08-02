package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class o67 extends m67 {
    public final HashMap h;
    public final int i;
    public final n67 j;
    public final n67 k;
    public final n67 l;
    public final n67 m;
    public InetSocketAddress n;

    public o67(int i, int i2, boolean z) {
        super(i, 0, z);
        this.h = new HashMap();
        this.i = i2 > 0 ? i2 : 1460;
        this.j = new n67(i2, this, 0);
        this.k = new n67(i2, this, 0);
        this.l = new n67(i2, this, 0);
        this.m = new n67(i2, this, 0);
    }

    public final void e(l67 l67Var, w67 w67Var) {
        if (l67Var != null) {
            w67Var.getClass();
            try {
                Iterator it = l67Var.a().iterator();
                while (it.hasNext()) {
                    w67 w67Var2 = (w67) it.next();
                    if (w67Var.equals(w67Var2) && w67Var2.h > w67Var.h / 2) {
                        return;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                w67.k.log(Level.WARNING, "suppressedBy() message " + l67Var + " exception ", (Throwable) e);
            }
        }
        f(w67Var, 0L);
    }

    public final void f(w67 w67Var, long j) {
        if (w67Var != null) {
            if (j == 0 || !w67Var.h(j)) {
                n67 n67Var = new n67(RemoteCameraConfig.Mic.BUFFER_SIZE, this, 0);
                n67Var.o(w67Var, j);
                byte[] byteArray = n67Var.toByteArray();
                n67Var.close();
                if (byteArray.length >= i()) {
                    kac.f("message full");
                } else {
                    this.e.add(w67Var);
                    this.k.write(byteArray, 0, byteArray.length);
                }
            }
        }
    }

    public final void g(w67 w67Var) {
        n67 n67Var = new n67(RemoteCameraConfig.Mic.BUFFER_SIZE, this, 0);
        n67Var.o(w67Var, 0L);
        byte[] byteArray = n67Var.toByteArray();
        n67Var.close();
        if (byteArray.length >= i()) {
            kac.f("message full");
        } else {
            this.f.add(w67Var);
            this.l.write(byteArray, 0, byteArray.length);
        }
    }

    public final void h(q67 q67Var) {
        n67 n67Var = new n67(RemoteCameraConfig.Mic.BUFFER_SIZE, this, 0);
        n67Var.g(q67Var.c());
        n67Var.z(q67Var.e().a);
        n67Var.z(q67Var.d().a);
        byte[] byteArray = n67Var.toByteArray();
        n67Var.close();
        if (byteArray.length >= i()) {
            kac.f("message full");
        } else {
            this.d.add(q67Var);
            this.j.write(byteArray, 0, byteArray.length);
        }
    }

    public final int i() {
        return ((((this.i - 12) - this.j.size()) - this.k.size()) - this.l.size()) - this.m.size();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(b()));
        if (this.c != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(this.c));
            if ((this.c & SQLiteDatabase.OPEN_NOMUTEX) == 32768) {
                stringBuffer.append(":r");
            }
            if ((this.c & 1024) != 0) {
                stringBuffer.append(":aa");
            }
            if ((this.c & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                stringBuffer.append(":tc");
            }
        }
        List<q67> list = this.d;
        if (list.size() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(list.size());
        }
        List<w67> list2 = this.e;
        if (list2.size() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(list2.size());
        }
        List<w67> list3 = this.f;
        if (list3.size() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(list3.size());
        }
        List<w67> list4 = this.g;
        if (list4.size() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(list4.size());
        }
        if (list.size() > 0) {
            stringBuffer.append("\nquestions:");
            for (q67 q67Var : list) {
                stringBuffer.append("\n\t");
                stringBuffer.append(q67Var);
            }
        }
        if (list2.size() > 0) {
            stringBuffer.append("\nanswers:");
            for (w67 w67Var : list2) {
                stringBuffer.append("\n\t");
                stringBuffer.append(w67Var);
            }
        }
        if (list3.size() > 0) {
            stringBuffer.append("\nauthorities:");
            for (w67 w67Var2 : list3) {
                stringBuffer.append("\n\t");
                stringBuffer.append(w67Var2);
            }
        }
        if (list4.size() > 0) {
            stringBuffer.append("\nadditionals:");
            for (w67 w67Var3 : list4) {
                stringBuffer.append("\n\t");
                stringBuffer.append(w67Var3);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.h);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public o67(int i) {
        this(i, 1460, true);
    }
}
