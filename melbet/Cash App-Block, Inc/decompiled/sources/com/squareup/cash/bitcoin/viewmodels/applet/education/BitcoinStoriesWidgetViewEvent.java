package com.squareup.cash.bitcoin.viewmodels.applet.education;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinStoriesWidgetViewEvent extends BitcoinHomeViewEvent {

    public final class OnRefresh implements BitcoinStoriesWidgetViewEvent {
        public static final OnRefresh INSTANCE = new OnRefresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnRefresh);
        }

        public final int hashCode() {
            return 1221886893;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    /* loaded from: classes4.dex */
    public final class OnStoryClicked implements BitcoinStoriesWidgetViewEvent {
        public final BitcoinStoryViewModel storyViewModel;

        public OnStoryClicked(BitcoinStoryViewModel bitcoinStoryViewModel) {
            bitcoinStoryViewModel.getClass();
            this.storyViewModel = bitcoinStoryViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStoryClicked) && Intrinsics.areEqual(this.storyViewModel, ((OnStoryClicked) obj).storyViewModel);
        }

        public final int hashCode() {
            return this.storyViewModel.hashCode();
        }

        public final String toString() {
            return "OnStoryClicked(storyViewModel=" + this.storyViewModel + ")";
        }
    }
}
