package b5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import bc.m;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import o4.o;
import pc.j;
import ud.g;
import x4.i;
import x4.l;
import x4.p;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1016a;

    static {
        String f10 = o.f("DiagnosticsWrkr");
        j.d(f10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f1016a = f10;
    }

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p pVar = (p) obj;
            x4.j h10 = g.h(pVar);
            String str2 = pVar.f8322a;
            x4.g c3 = iVar.c(h10);
            Integer valueOf = c3 != null ? Integer.valueOf(c3.f8301c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f8312h;
            b4.o a6 = b4.o.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str2 == null) {
                a6.h(1);
            } else {
                a6.c(str2, 1);
            }
            workDatabase_Impl.b();
            Cursor m10 = workDatabase_Impl.m(a6);
            try {
                ArrayList arrayList2 = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    arrayList2.add(m10.isNull(0) ? null : m10.getString(0));
                }
                m10.close();
                a6.f();
                String W = m.W(arrayList2, ",", null, null, null, 62);
                String W2 = m.W(sVar.e(str2), ",", null, null, null, 62);
                StringBuilder sb2 = new StringBuilder("\n");
                sb2.append(str2);
                sb2.append("\t ");
                sb2.append(pVar.f8324c);
                sb2.append("\t ");
                sb2.append(valueOf);
                sb2.append("\t ");
                switch (pVar.f8323b) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        str = "ENQUEUED";
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
                sb2.append(str);
                sb2.append("\t ");
                sb2.append(W);
                sb2.append("\t ");
                sb2.append(W2);
                sb2.append('\t');
                sb.append(sb2.toString());
            } catch (Throwable th) {
                m10.close();
                a6.f();
                throw th;
            }
        }
        String sb3 = sb.toString();
        j.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
