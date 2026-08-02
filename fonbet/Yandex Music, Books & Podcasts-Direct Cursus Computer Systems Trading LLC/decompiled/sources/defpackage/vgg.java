package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class vgg extends rgg {
    public final Object a;
    public final ugg b;

    public vgg(dzf dzfVar, jfu jfuVar) {
        this.a = dzfVar;
        s40 s40Var = ugg.m;
        jfuVar.getClass();
        s40Var.getClass();
        gs6 gs6Var = gs6.b;
        gs6Var.getClass();
        bjt bjtVar = new bjt(jfuVar, s40Var, gs6Var);
        lm4 a = ern.a(ugg.class);
        String f = a.f();
        if (f != null) {
            this.b = (ugg) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            xq0.x("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final void b(String str, PrintWriter printWriter) {
        ugg uggVar = this.b;
        if (uggVar.k.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            q4r q4rVar = uggVar.k;
            if (i >= q4rVar.c) {
                return;
            }
            sgg sggVar = (sgg) q4rVar.f(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(uggVar.k.d(i));
            printWriter.print(": ");
            printWriter.println(sggVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(sggVar.l);
            dzw dzwVar = sggVar.l;
            String concat = str2.concat("  ");
            dzwVar.getClass();
            printWriter.print(concat);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dzwVar.a);
            if (dzwVar.b || dzwVar.e) {
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.print(dzwVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dzwVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dzwVar.c || dzwVar.d) {
                printWriter.print(concat);
                printWriter.print("mAbandoned=");
                printWriter.print(dzwVar.c);
                printWriter.print(" mReset=");
                printWriter.println(dzwVar.d);
            }
            if (dzwVar.g != null) {
                printWriter.print(concat);
                printWriter.print("mTask=");
                printWriter.print(dzwVar.g);
                printWriter.print(" waiting=");
                dzwVar.g.getClass();
                printWriter.println(false);
            }
            if (dzwVar.h != null) {
                printWriter.print(concat);
                printWriter.print("mCancellingTask=");
                printWriter.print(dzwVar.h);
                printWriter.print(" waiting=");
                dzwVar.h.getClass();
                printWriter.println(false);
            }
            if (sggVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(sggVar.n);
                tgg tggVar = sggVar.n;
                String concat2 = str2.concat("  ");
                tggVar.getClass();
                printWriter.print(concat2);
                printWriter.print("mDeliveredData=");
                printWriter.println(tggVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            dzw dzwVar2 = sggVar.l;
            Object d = sggVar.d();
            dzwVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (d == null) {
                sb.append("null");
            } else {
                Class<?> cls = d.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(sggVar.e());
            i++;
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
