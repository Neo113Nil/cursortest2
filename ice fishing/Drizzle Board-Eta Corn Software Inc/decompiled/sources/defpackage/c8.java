package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c8 implements f40, ot {
    public final ot MdtA4re8;
    public final f40 NCTxEWno;
    public final b8 P7K7Inc8;
    public Throwable VgvYg0wo;
    public l9 wxUZMvaN;

    public c8(f40 f40Var) {
        qt qtVar = new qt();
        f40Var.getClass();
        this.NCTxEWno = f40Var;
        this.MdtA4re8 = qtVar;
        this.P7K7Inc8 = new b8(this);
    }

    @Override // defpackage.f40
    public final h40 Ey6iv0m0(String str) {
        str.getClass();
        b8 b8Var = this.P7K7Inc8;
        if (b8Var == null) {
            return this.NCTxEWno.Ey6iv0m0(str);
        }
        Object Qr9iLBAD = b8Var.Qr9iLBAD(str);
        Qr9iLBAD.getClass();
        return new a8((h40) Qr9iLBAD);
    }

    @Override // defpackage.ot
    public final Object P7K7Inc8(h9 h9Var) {
        return this.MdtA4re8.P7K7Inc8(h9Var);
    }

    public final void Qr9iLBAD(StringBuilder sb) {
        Iterable iterable;
        int i;
        if (this.wxUZMvaN == null && this.VgvYg0wo == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            l9 l9Var = this.wxUZMvaN;
            if (l9Var != null) {
                sb.append("\t\tCoroutine: " + l9Var);
                sb.append('\n');
            }
            Throwable th = this.VgvYg0wo;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                List DK9slbsy = ba0.DK9slbsy(stringWriter2);
                int size = DK9slbsy.size() - 1;
                if (size <= 0) {
                    iterable = wf.NCTxEWno;
                } else if (size == 1) {
                    iterable = ra.FySoLYna(x5.LvHlPNBd(DK9slbsy));
                } else {
                    ArrayList arrayList = new ArrayList(size);
                    if (DK9slbsy instanceof RandomAccess) {
                        int size2 = DK9slbsy.size();
                        for (int i2 = 1; i2 < size2; i2++) {
                            arrayList.add(DK9slbsy.get(i2));
                        }
                    } else {
                        ListIterator listIterator = DK9slbsy.listIterator(1);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    iterable = arrayList;
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.P7K7Inc8 != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            b8 b8Var = this.P7K7Inc8;
            synchronized (((re) b8Var.b2ZJblxo)) {
                i = b8Var.MdtA4re8;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.ot
    public final void VgvYg0wo(Object obj) {
        this.MdtA4re8.VgvYg0wo(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b8 b8Var = this.P7K7Inc8;
        if (b8Var != null) {
            b8Var.OnDfzHZD(-1);
        }
        this.NCTxEWno.close();
    }

    @Override // defpackage.f40
    public final boolean ow5vqvCr() {
        return this.NCTxEWno.ow5vqvCr();
    }

    public final String toString() {
        return this.NCTxEWno.toString();
    }
}
