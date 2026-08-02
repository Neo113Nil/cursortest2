package com.squareup.cash.family.requestsponsorship.presenters;

import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes6.dex */
public final class SelectSponsorPresenter$getSuggestedSponsorSections$$inlined$sortedBy$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((SelectSponsorPresenter.SponsorSuggestionSectionType) ((Pair) obj).first).ordinal()), Integer.valueOf(((SelectSponsorPresenter.SponsorSuggestionSectionType) ((Pair) obj2).first).ordinal()));
    }
}
