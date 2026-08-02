package W0;

import J0.r;
import S0.g;
import S0.i;
import S0.l;
import S0.p;
import S0.s;
import Z2.d;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import u0.C5060i;
import v7.AbstractC5119j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3532a;

    static {
        String f2 = r.f("DiagnosticsWrkr");
        h.d(f2, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f3532a = f2;
    }

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g c9 = iVar.c(d.k(pVar));
            Integer valueOf = c9 != null ? Integer.valueOf(c9.f2914c) : null;
            lVar.getClass();
            C5060i a9 = C5060i.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.f2937a;
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f2926u;
            workDatabase_Impl.b();
            Cursor m9 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList2 = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    arrayList2.add(m9.isNull(0) ? null : m9.getString(0));
                }
                m9.close();
                a9.j();
                String C8 = AbstractC5119j.C(arrayList2, ",", null, null, null, 62);
                String C9 = AbstractC5119j.C(sVar.i(str2), ",", null, null, null, 62);
                StringBuilder l9 = Wv.l("\n", str2, "\t ");
                l9.append(pVar.f2939c);
                l9.append("\t ");
                l9.append(valueOf);
                l9.append("\t ");
                switch (pVar.f2938b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                l9.append(str);
                l9.append("\t ");
                l9.append(C8);
                l9.append("\t ");
                l9.append(C9);
                l9.append('\t');
                sb.append(l9.toString());
            } catch (Throwable th) {
                m9.close();
                a9.j();
                throw th;
            }
        }
        String sb2 = sb.toString();
        h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
