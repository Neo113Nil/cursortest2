package com.squareup.cash.investing.backend.real.categories;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1 implements Comparator {
    public final /* synthetic */ List $mapNodes$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1(List list, int i) {
        this.$r8$classId = i;
        this.$mapNodes$inlined = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i = this.$r8$classId;
        List list = this.$mapNodes$inlined;
        switch (i) {
            case 0:
                String str = (String) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) obj3).option_token, str)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                if (((SyncInvestmentFilterGroup.CategoryMapNode) obj3) == null) {
                    str = null;
                }
                String str2 = (String) obj;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj4 = it2.next();
                        if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) obj4).option_token, str2)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                return ComparisonsKt__ComparisonsKt.compareValues(str, ((SyncInvestmentFilterGroup.CategoryMapNode) obj4) != null ? str2 : null);
            default:
                SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj2;
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj5 = it3.next();
                        if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) obj5).option_token, subfilterOption.token)) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                String str3 = ((SyncInvestmentFilterGroup.CategoryMapNode) obj5) != null ? subfilterOption.token : null;
                SyncInvestmentFilterGroup.SubfilterOption subfilterOption2 = (SyncInvestmentFilterGroup.SubfilterOption) obj;
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj6 = it4.next();
                        if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) obj6).option_token, subfilterOption2.token)) {
                        }
                    } else {
                        obj6 = null;
                    }
                }
                return ComparisonsKt__ComparisonsKt.compareValues(str3, ((SyncInvestmentFilterGroup.CategoryMapNode) obj6) != null ? subfilterOption2.token : null);
        }
    }
}
