package com.squareup.cash.family.requestsponsorship.presenters;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public abstract class RequestSponsorshipFeatureError implements FeatureError {
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Family.INSTANCE);
}
