package com.squareup.cash.core.navigationcontainer;

import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.ui.BottomSheetConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface LegacySheetConfig {

    /* loaded from: classes6.dex */
    public final class ComposeConfig implements LegacySheetConfig {
        public final UiFactory.LegacySheetComposeUi.Config config;

        public ComposeConfig(UiFactory.LegacySheetComposeUi.Config config) {
            config.getClass();
            this.config = config;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposeConfig) && Intrinsics.areEqual(this.config, ((ComposeConfig) obj).config);
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final boolean getConsumeInsetsBeforeSheet() {
            return this.config.consumeInsetsBeforeSheet;
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final Integer getInitialHeightPx() {
            this.config.getClass();
            return null;
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final UserDismissMode getUserDismissMode() {
            UiFactory.LegacySheetComposeUi.Config config = this.config;
            boolean z = config.isLocked;
            return (z || !config.outsideTapCloses) ? !z ? UserDismissMode.DragOnly : config.outsideTapCloses ? UserDismissMode.OutsideTapOnly : UserDismissMode.None : UserDismissMode.All;
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final void onSheetPositionChanged(int i) {
        }

        public final String toString() {
            return "ComposeConfig(config=" + this.config + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class ViewConfig implements LegacySheetConfig {
        public final BottomSheetConfig config;
        public final boolean outsideTapCloses;

        public ViewConfig(BottomSheetConfig bottomSheetConfig, boolean z) {
            this.config = bottomSheetConfig;
            this.outsideTapCloses = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewConfig)) {
                return false;
            }
            ViewConfig viewConfig = (ViewConfig) obj;
            return this.config.equals(viewConfig.config) && this.outsideTapCloses == viewConfig.outsideTapCloses;
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final boolean getConsumeInsetsBeforeSheet() {
            return false;
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final Integer getInitialHeightPx() {
            int initialHeight = this.config.getInitialHeight();
            Integer valueOf = Integer.valueOf(initialHeight);
            if (initialHeight == 0) {
                return null;
            }
            return valueOf;
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final UserDismissMode getUserDismissMode() {
            BottomSheetConfig bottomSheetConfig = this.config;
            boolean isLocked = bottomSheetConfig.isLocked();
            boolean z = this.outsideTapCloses;
            return (isLocked || !z) ? !bottomSheetConfig.isLocked() ? UserDismissMode.DragOnly : z ? UserDismissMode.OutsideTapOnly : UserDismissMode.None : UserDismissMode.All;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.outsideTapCloses) + (this.config.hashCode() * 31);
        }

        @Override // com.squareup.cash.core.navigationcontainer.LegacySheetConfig
        public final void onSheetPositionChanged(int i) {
            this.config.onSheetPositionChanged(i);
        }

        public final String toString() {
            return "ViewConfig(config=" + this.config + ", outsideTapCloses=" + this.outsideTapCloses + ")";
        }
    }

    boolean getConsumeInsetsBeforeSheet();

    Integer getInitialHeightPx();

    UserDismissMode getUserDismissMode();

    void onSheetPositionChanged(int i);
}
