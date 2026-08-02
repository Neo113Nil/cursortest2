package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class xhm {
    public final nim a;
    public final jgv b;

    public xhm(nim nimVar, jgv jgvVar) {
        this.a = nimVar;
        this.b = jgvVar;
    }

    public static LinkedHashMap a(qim qimVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Driver.ProfileFact profileFact : qimVar.c) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str = profileFact.a;
            String str2 = profileFact.b;
            if (str.length() > 0) {
                linkedHashMap2.put("title", profileFact.a);
            }
            if (str2.length() > 0) {
                linkedHashMap2.put("subtitle", str2);
            }
            linkedHashMap2.put("is_top_value", Boolean.valueOf(profileFact.c));
            arrayList.add(linkedHashMap2);
        }
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("profile_facts", arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Driver.FeedbackBadges feedbackBadges : qimVar.e) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            String str3 = feedbackBadges.a;
            String str4 = feedbackBadges.d;
            String str5 = feedbackBadges.b;
            String str6 = feedbackBadges.c;
            if (str3.length() > 0) {
                linkedHashMap3.put("name", feedbackBadges.a);
            }
            if (str6.length() > 0) {
                linkedHashMap3.put("count", str6);
            }
            if (str5.length() > 0) {
                linkedHashMap3.put("label", str5);
            }
            if (str4.length() > 0) {
                linkedHashMap3.put("image_tag", str4);
            }
            arrayList2.add(linkedHashMap3);
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put("feedback_badges", arrayList2);
        }
        return linkedHashMap;
    }

    public final void b(o2y0 o2y0Var) {
        DriveState driveState = o2y0Var.b().h.b;
        if (driveState == o2y0Var.b().l.E) {
            return;
        }
        qim a = rim.a(o2y0Var.b());
        nim nimVar = this.a;
        String str = a.g;
        if (str.length() <= 0) {
            str = null;
        }
        nimVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("status_title", str);
        }
        nimVar.a.a("DriverInfo.ButtonVisible", hashMap, 1, new HashMap());
        TaxiOrder b = o2y0Var.b();
        b.getClass();
        synchronized (b) {
            TaxiOrderLocalData taxiOrderLocalData = b.l;
            taxiOrderLocalData.getClass();
            b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, driveState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1073741825, 16777215);
        }
    }

    public final void c(qim qimVar) {
        Boolean valueOf = Boolean.valueOf(qimVar.o);
        LinkedHashMap a = a(qimVar);
        Boolean valueOf2 = Boolean.valueOf(this.b.b(qimVar.h));
        String str = qimVar.g;
        if (str.length() <= 0) {
            str = null;
        }
        nim nimVar = this.a;
        nimVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("details_unavailable", valueOf);
        hashMap.put("driver_stat", a);
        hashMap.put("is_profile_photo", valueOf2);
        if (str != null) {
            hashMap.put("status_title", str);
        }
        nimVar.a.a("DriverInfo.DidTapButton", hashMap, 1, new HashMap());
    }
}
