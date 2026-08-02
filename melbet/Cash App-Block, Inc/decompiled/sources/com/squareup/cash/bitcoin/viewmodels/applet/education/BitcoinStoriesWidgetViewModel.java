package com.squareup.cash.bitcoin.viewmodels.applet.education;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinStoriesWidgetViewModel extends BitcoinHomeWidgetViewModel {

    public final class Content implements BitcoinStoriesWidgetViewModel {
        public final List storyList;

        public Content(List list) {
            list.getClass();
            this.storyList = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && Intrinsics.areEqual(this.storyList, ((Content) obj).storyList);
        }

        public final int hashCode() {
            return this.storyList.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Content(storyList=", ")", this.storyList);
        }
    }

    public final class Failure implements BitcoinStoriesWidgetViewModel {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -1455299830;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Loading implements BitcoinStoriesWidgetViewModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return Integer.hashCode(4);
        }

        public final String toString() {
            return "Loading(placeholderTileCount=4)";
        }
    }
}
