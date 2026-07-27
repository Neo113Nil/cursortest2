package W0;

import J0.s;
import S0.g;
import S0.i;
import S0.l;
import S0.p;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.e;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import u0.C5059i;
import v7.AbstractC5129j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3402a;

    static {
        String f3 = s.f("DiagnosticsWrkr");
        h.d(f3, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f3402a = f3;
    }

    public static final String a(l lVar, S0.s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g h9 = iVar.h(e.c(pVar));
            Integer valueOf = h9 != null ? Integer.valueOf(h9.f2785c) : null;
            lVar.getClass();
            C5059i a9 = C5059i.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.f2808a;
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f2797u;
            workDatabase_Impl.b();
            Cursor m4 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList2 = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    arrayList2.add(m4.isNull(0) ? null : m4.getString(0));
                }
                m4.close();
                a9.j();
                String E8 = AbstractC5129j.E(arrayList2, ",", null, null, null, 62);
                String E9 = AbstractC5129j.E(sVar.k(str2), ",", null, null, null, 62);
                StringBuilder j6 = AbstractC4404f.j("\n", str2, "\t ");
                j6.append(pVar.f2810c);
                j6.append("\t ");
                j6.append(valueOf);
                j6.append("\t ");
                switch (pVar.f2809b) {
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
                j6.append(str);
                j6.append("\t ");
                j6.append(E8);
                j6.append("\t ");
                j6.append(E9);
                j6.append('\t');
                sb.append(j6.toString());
            } catch (Throwable th) {
                m4.close();
                a9.j();
                throw th;
            }
        }
        String sb2 = sb.toString();
        h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
