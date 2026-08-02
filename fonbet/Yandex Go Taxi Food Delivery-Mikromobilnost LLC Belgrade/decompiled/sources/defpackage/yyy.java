package defpackage;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class yyy extends uyy {
    public final pey a;
    public final xyy b;

    public yyy(pey peyVar, qs31 qs31Var) {
        this.a = peyVar;
        bds bdsVar = xyy.w;
        this.b = (xyy) new ls31(qs31Var, xyy.w, 0).b(xyy.class);
    }

    @Override // defpackage.uyy
    public final ryy b(sl81 sl81Var) {
        xyy xyyVar = this.b;
        boolean z = xyyVar.c;
        pnt0 pnt0Var = xyyVar.b;
        if (z) {
            ny61.r("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ny61.r("initLoader must be called on the main thread");
            return null;
        }
        vyy vyyVar = (vyy) pnt0Var.b(0);
        pey peyVar = this.a;
        if (vyyVar != null) {
            return vyyVar.q(peyVar, sl81Var);
        }
        try {
            xyyVar.c = true;
            t091 l = sl81Var.l();
            if (t091.class.isMemberClass() && !Modifier.isStatic(t091.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + l);
            }
            vyy vyyVar2 = new vyy(l);
            pnt0Var.d(0, vyyVar2);
            xyyVar.c = false;
            return vyyVar2.q(peyVar, sl81Var);
        } catch (Throwable th) {
            xyyVar.c = false;
            throw th;
        }
    }

    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        pnt0 pnt0Var = this.b.b;
        if (pnt0Var.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + Extension.TAB_CHAR;
            for (int i = 0; i < pnt0Var.e(); i++) {
                vyy vyyVar = (vyy) pnt0Var.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(pnt0Var.c(i));
                printWriter.print(Extension.COLON_SPACE);
                printWriter.println(vyyVar.toString());
                vyyVar.o(str2, printWriter);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
