package com.anythink.core.common.v;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.bz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ak {
    public static boolean a(List<bv> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = list.get(i);
                if (bvVar != null && bvVar.an()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(bv bvVar) {
        return bvVar.g() == 66;
    }

    public static long c(bv bvVar) {
        if (bvVar == null) {
            return 0L;
        }
        return (bvVar.g() == 39 && bvVar.bc()) ? bvVar.be() : bvVar.v();
    }

    public static boolean a(bv bvVar) {
        return bvVar.g() == 15 && !bvVar.o();
    }

    public static List<bz.a> a(String str, bv bvVar) {
        bw a9;
        if (bvVar == null || (a9 = com.anythink.core.common.a.a().a(str, bvVar)) == null) {
            return null;
        }
        List<bz.a> f3 = a9.a((com.anythink.core.common.h.ad) null).f();
        com.anythink.core.common.h.ad a10 = com.anythink.core.b.f.a().a(str, bvVar);
        if (a10 != null && !a10.a()) {
            if (f3 == null) {
                f3 = new ArrayList<>();
            }
            f3.add(new bz.a(bvVar, a10));
        }
        return f3;
    }

    public static String a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        String internalNetworkPlacementId;
        String str;
        if (aTBaseAdAdapter != null) {
            try {
                internalNetworkPlacementId = aTBaseAdAdapter.getInternalNetworkPlacementId();
            } catch (Throwable unused) {
            }
        } else {
            internalNetworkPlacementId = "";
        }
        if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
            return internalNetworkPlacementId;
        }
        if (bvVar == null) {
            str = "";
        } else {
            str = bvVar.Y();
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }
}
