package com.yandex.passport.internal.report.reporters;

import android.app.ApplicationExitInfo;
import com.yandex.passport.internal.report.n7;
import defpackage.b6;
import defpackage.kac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.D.getValue(aVar, com.yandex.passport.internal.features.a.J[27])).booleanValue();
    }

    public final void u(String str, List list) {
        Object obj;
        Object obj2;
        String str2;
        str.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            String processName = kac.b(obj2).getProcessName();
            processName.getClass();
            if (StringsKt.M(processName, str, false)) {
                break;
            }
        }
        ApplicationExitInfo b = kac.b(obj2);
        if (b == null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String processName2 = kac.b(next).getProcessName();
                processName2.getClass();
                if (!StringsKt.N(processName2, ':')) {
                    obj = next;
                    break;
                }
            }
            b = kac.b(obj);
        }
        if (b != null) {
            b.getTimestamp();
            b6 b6Var = n7.d;
            ArrayList arrayList = new ArrayList();
            switch (b.getReason()) {
                case 1:
                    str2 = "EXIT_SELF";
                    break;
                case 2:
                    str2 = "SIGNALED";
                    break;
                case 3:
                    str2 = "LOW_MEMORY";
                    break;
                case 4:
                    str2 = "APP CRASH(EXCEPTION)";
                    break;
                case 5:
                    str2 = "APP CRASH(NATIVE)";
                    break;
                case 6:
                    str2 = "ANR";
                    break;
                case 7:
                    str2 = "INITIALIZATION FAILURE";
                    break;
                case 8:
                    str2 = "PERMISSION CHANGE";
                    break;
                case 9:
                    str2 = "EXCESSIVE RESOURCE USAGE";
                    break;
                case 10:
                    str2 = "USER REQUESTED";
                    break;
                case 11:
                    str2 = "USER STOPPED";
                    break;
                case 12:
                    str2 = "DEPENDENCY DIED";
                    break;
                case 13:
                    str2 = "OTHER KILLS BY SYSTEM";
                    break;
                case 14:
                    str2 = "FREEZER";
                    break;
                case 15:
                    str2 = "STATE CHANGE";
                    break;
                case 16:
                    str2 = "PACKAGE UPDATED";
                    break;
                default:
                    str2 = "UNKNOWN";
                    break;
            }
            arrayList.add(new com.yandex.passport.internal.report.f(str2, 5, false));
            String description = b.getDescription();
            if (description != null) {
                arrayList.add(new com.yandex.passport.internal.report.f(description, 4, false));
            }
            arrayList.add(new com.yandex.passport.internal.report.f(b.getTimestamp()));
            m(b6Var, arrayList);
        }
    }
}
