package defpackage;

import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$AchievementIconChoice;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TagChoice;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TextChoice;
import com.yandex.go.zone.dto.objects.h2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes15.dex */
public abstract class vrq {
    public static wrq a(q6c0 q6c0Var, tls tlsVar) {
        r8i0 r8i0Var;
        List list = (List) q6c0Var.b;
        List<h2> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (h2 h2Var : list2) {
            wrq wrqVar = wrq.f;
            boolean booleanValue = ((Boolean) tlsVar.invoke(h2Var)).booleanValue();
            if (h2Var instanceof FeedbackBadgeChoice$TextChoice) {
                FeedbackBadgeChoice$TextChoice feedbackBadgeChoice$TextChoice = (FeedbackBadgeChoice$TextChoice) h2Var;
                r8i0Var = new r8i0(120, feedbackBadgeChoice$TextChoice.a, feedbackBadgeChoice$TextChoice.b, null, null, null, booleanValue);
            } else if (h2Var instanceof FeedbackBadgeChoice$TagChoice) {
                FeedbackBadgeChoice$TagChoice feedbackBadgeChoice$TagChoice = (FeedbackBadgeChoice$TagChoice) h2Var;
                r8i0Var = new r8i0(112, feedbackBadgeChoice$TagChoice.a, feedbackBadgeChoice$TagChoice.b, feedbackBadgeChoice$TagChoice.c, null, null, booleanValue);
            } else {
                if (!(h2Var instanceof FeedbackBadgeChoice$AchievementIconChoice)) {
                    w511.b();
                    return null;
                }
                FeedbackBadgeChoice$AchievementIconChoice feedbackBadgeChoice$AchievementIconChoice = (FeedbackBadgeChoice$AchievementIconChoice) h2Var;
                String str = feedbackBadgeChoice$AchievementIconChoice.a;
                String str2 = feedbackBadgeChoice$AchievementIconChoice.b;
                FeedbackBadgeChoice$AchievementIconChoice.Images images = feedbackBadgeChoice$AchievementIconChoice.c;
                r8i0Var = new r8i0(96, str, str2, images.a, images.b, null, booleanValue);
            }
            arrayList.add(r8i0Var);
        }
        List<h2> list3 = list;
        int d = gw00.d(tcc.n(list3, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (h2 h2Var2 : list3) {
            Pair pair = new Pair(h2Var2.getA(), h2Var2.c());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new wrq((String) q6c0Var.w, arrayList, (List) q6c0Var.c, linkedHashMap);
    }
}
