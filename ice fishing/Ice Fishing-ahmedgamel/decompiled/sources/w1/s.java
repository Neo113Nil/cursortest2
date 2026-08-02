package w1;

import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class s extends Exception {

    /* renamed from: y, reason: collision with root package name */
    public static final StackTraceElement[] f41553y = new StackTraceElement[0];

    /* renamed from: n, reason: collision with root package name */
    public final List f41554n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC5066e f41555u;

    /* renamed from: v, reason: collision with root package name */
    public int f41556v;

    /* renamed from: w, reason: collision with root package name */
    public Class f41557w;

    /* renamed from: x, reason: collision with root package name */
    public final String f41558x;

    public s(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof s) {
            Iterator it = ((s) th).f41554n.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void b(List list, r rVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            rVar.append("Cause (");
            int i4 = i + 1;
            rVar.append(String.valueOf(i4));
            rVar.append(" of ");
            rVar.append(String.valueOf(size));
            rVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof s) {
                ((s) th).e(rVar);
            } else {
                c(th, rVar);
            }
            i = i4;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i4 = i + 1;
            sb.append(i4);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i4;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f41554n, new r(appendable));
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f41558x);
        String str2 = "";
        if (this.f41557w != null) {
            str = ", " + this.f41557w;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f41556v;
        sb.append(i != 0 ? ", ".concat(Wv.r(i)) : "");
        if (this.f41555u != null) {
            str2 = ", " + this.f41555u;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public s(String str, List list) {
        this.f41558x = str;
        setStackTrace(f41553y);
        this.f41554n = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
