package com.squareup.cash.money.viewmodels.api;

import androidx.compose.runtime.Composer;
import com.squareup.cash.money.core.ids.ItemId;

/* loaded from: classes6.dex */
public interface Item {
    void UI(Composer composer, int i);

    ItemId getId();
}
