package com.datadog.android.rum.internal.metric.interactiontonextview;

import com.datadog.android.rum.model.ActionEvent;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes4.dex */
public final class ActionTypeInteractionValidator {
    public static final Set ALLOWED_TYPES = ArraysKt___ArraysKt.toSet(new ActionEvent.ActionEventActionType[]{ActionEvent.ActionEventActionType.TAP, ActionEvent.ActionEventActionType.SWIPE, ActionEvent.ActionEventActionType.CLICK, ActionEvent.ActionEventActionType.BACK});
}
