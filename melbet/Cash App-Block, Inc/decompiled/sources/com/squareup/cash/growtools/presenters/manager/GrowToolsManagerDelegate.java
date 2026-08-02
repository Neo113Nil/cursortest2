package com.squareup.cash.growtools.presenters.manager;

import androidx.compose.runtime.Composer;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public interface GrowToolsManagerDelegate {
    GrowToolsManagerViewModel models(Flow flow, Composer composer, int i);
}
