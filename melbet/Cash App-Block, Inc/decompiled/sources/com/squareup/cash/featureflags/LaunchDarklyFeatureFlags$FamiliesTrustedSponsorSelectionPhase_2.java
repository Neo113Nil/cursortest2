package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$FamiliesTrustedSponsorSelectionPhase_2 extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$FamiliesTrustedSponsorSelectionPhase_2 INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("", "");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("mom, dad, mommy, mama, momma, mother, mami, daddy, pops, father, madre, mum, papa, papi, mummy, padre", "mom, dad, mommy, mama, momma, mother, mami, daddy, pops, father, madre, mum, papa, papi, mummy, padre"), new FeatureFlag$StringFeatureFlag$Value("", "")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$FamiliesTrustedSponsorSelectionPhase_2("cashclient/families_trusted_sponsor_selection_phase_2", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
