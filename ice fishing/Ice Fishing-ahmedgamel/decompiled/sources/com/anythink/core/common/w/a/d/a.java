package com.anythink.core.common.w.a.d;

import android.text.TextUtils;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public static String a(String str, ak akVar) {
        List<String> list;
        if (akVar == null) {
            return "";
        }
        List<String> a9 = akVar.a();
        Map<String, List<String>> c9 = akVar.c();
        if (a9 != null && !a9.isEmpty()) {
            for (String str2 : a9) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    if (c9 != null && !c9.isEmpty() && (list = c9.get(str2)) != null && !list.isEmpty()) {
                        for (int i = 0; i < list.size(); i++) {
                            String str3 = list.get(i);
                            if (str.contains(str3)) {
                                return AbstractC4404f.g(str2, "&&", str3);
                            }
                        }
                    }
                    return str2;
                }
            }
        }
        return "";
    }

    private static ak a(al alVar, ai aiVar) {
        Map<Integer, ak> e9;
        if (alVar == null || aiVar == null || (e9 = aiVar.e()) == null) {
            return null;
        }
        return e9.get(Integer.valueOf(alVar.c()));
    }
}
