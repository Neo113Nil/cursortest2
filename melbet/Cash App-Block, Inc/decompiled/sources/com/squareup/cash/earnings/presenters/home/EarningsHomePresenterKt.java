package com.squareup.cash.earnings.presenters.home;

import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class EarningsHomePresenterKt {
    public static final Regex SPACE_BEFORE_DAY_PERIOD_REGEX = new Regex("\\p{Zs}+(?=[ap]m$)");
}
