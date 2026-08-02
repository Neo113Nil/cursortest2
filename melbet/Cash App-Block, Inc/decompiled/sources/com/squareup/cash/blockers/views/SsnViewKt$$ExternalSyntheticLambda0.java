package com.squareup.cash.blockers.views;

import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.bitcoin.views.applet.graph.BitcoinGraphWidgetKt;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 3:
                Set set = AutofillWebField.cardFields;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AutofillWebField) it.next()).value);
                }
                break;
            case 4:
                Set set2 = AutofillWebField.addressFields;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AutofillWebField) it2.next()).value);
                }
                break;
            case 12:
                ArrayList arrayList3 = BitcoinGraphWidgetKt.POINTS;
                break;
            case 17:
                Clock systemDefaultZone = Clock.systemDefaultZone();
                systemDefaultZone.getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
