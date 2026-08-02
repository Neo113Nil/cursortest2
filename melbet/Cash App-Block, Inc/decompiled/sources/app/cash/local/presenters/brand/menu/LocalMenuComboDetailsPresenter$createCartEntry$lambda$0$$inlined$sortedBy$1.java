package app.cash.local.presenters.brand.menu;

import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import java.util.Comparator;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes3.dex */
public final class LocalMenuComboDetailsPresenter$createCartEntry$lambda$0$$inlined$sortedBy$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LocalMenuComboDetailsViewModel.SectionIndex) ((Map.Entry) obj).getKey()).value), Integer.valueOf(((LocalMenuComboDetailsViewModel.SectionIndex) ((Map.Entry) obj2).getKey()).value));
    }
}
