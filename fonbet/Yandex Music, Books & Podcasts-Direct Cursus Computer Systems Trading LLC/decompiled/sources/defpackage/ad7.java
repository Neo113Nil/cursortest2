package defpackage;

import androidx.core.app.q;
import java.util.ArrayList;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class ad7 implements qve, cve {
    public final qve[] a;
    public final cve[] b;
    public final int c;
    public final int d;

    public ad7(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = arrayList.get(i);
            if (obj instanceof ad7) {
                qve[] qveVarArr = ((ad7) obj).a;
                if (qveVarArr != null) {
                    for (qve qveVar : qveVarArr) {
                        arrayList2.add(qveVar);
                    }
                }
            } else {
                arrayList2.add(obj);
            }
            Object obj2 = arrayList.get(i + 1);
            if (obj2 instanceof ad7) {
                cve[] cveVarArr = ((ad7) obj2).b;
                if (cveVarArr != null) {
                    for (cve cveVar : cveVarArr) {
                        arrayList3.add(cveVar);
                    }
                }
            } else {
                arrayList3.add(obj2);
            }
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList2.size();
            this.a = new qve[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                qve qveVar2 = (qve) arrayList2.get(i3);
                i2 += qveVar2.d();
                this.a[i3] = qveVar2;
            }
            this.c = i2;
        }
        if (arrayList3.contains(null) || arrayList3.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList3.size();
        this.b = new cve[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            cve cveVar2 = (cve) arrayList3.get(i5);
            i4 += cveVar2.a();
            this.b[i5] = cveVar2;
        }
        this.d = i4;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.d;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        cve[] cveVarArr = this.b;
        if (cveVarArr == null) {
            q.i();
            return 0;
        }
        int length = cveVarArr.length;
        for (int i2 = 0; i2 < length && i >= 0; i2++) {
            i = cveVarArr[i2].b(pd7Var, charSequence, i);
        }
        return i;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        qve[] qveVarArr = this.a;
        if (qveVarArr == null) {
            q.i();
            return;
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (qve qveVar : qveVarArr) {
            qveVar.c(sb, j, rk4Var, i, dateTimeZone, locale2);
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return this.c;
    }
}
