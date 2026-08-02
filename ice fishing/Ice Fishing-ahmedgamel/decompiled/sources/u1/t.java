package u1;

import android.util.Log;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class t extends Exception {

    /* renamed from: y, reason: collision with root package name */
    public static final StackTraceElement[] f41170y = new StackTraceElement[0];

    /* renamed from: n, reason: collision with root package name */
    public final List f41171n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC4970e f41172u;

    /* renamed from: v, reason: collision with root package name */
    public int f41173v;

    /* renamed from: w, reason: collision with root package name */
    public Class f41174w;

    /* renamed from: x, reason: collision with root package name */
    public final String f41175x;

    public t(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof t) {
            Iterator it = ((t) th).f41171n.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void b(List list, s sVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            sVar.append("Cause (");
            int i6 = i + 1;
            sVar.append(String.valueOf(i6));
            sVar.append(" of ");
            sVar.append(String.valueOf(size));
            sVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof t) {
                ((t) th).e(sVar);
            } else {
                c(th, sVar);
            }
            i = i6;
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
            int i6 = i + 1;
            sb.append(i6);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i6;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f41171n, new s(appendable));
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f41175x);
        String str2 = "";
        if (this.f41174w != null) {
            str = ", " + this.f41174w;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f41173v;
        sb.append(i != 0 ? ", ".concat(AbstractC4404f.r(i)) : "");
        if (this.f41172u != null) {
            str2 = ", " + this.f41172u;
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

    public t(String str, List list) {
        this.f41175x = str;
        setStackTrace(f41170y);
        this.f41171n = list;
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
