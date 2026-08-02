package com.squareup.cash.blockers.web.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class WebBlockerBridgeEvent {

    public final class LaunchNewWindow extends WebBlockerBridgeEvent {
        public final String url;

        public LaunchNewWindow(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchNewWindow) && Intrinsics.areEqual(this.url, ((LaunchNewWindow) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LaunchNewWindow(url=", this.url, ")");
        }
    }

    public final class NavigationStateUpdated extends WebBlockerBridgeEvent {
        public final boolean canGoBack;
        public final boolean canGoForward;

        public NavigationStateUpdated(boolean z, boolean z2) {
            this.canGoBack = z;
            this.canGoForward = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigationStateUpdated)) {
                return false;
            }
            NavigationStateUpdated navigationStateUpdated = (NavigationStateUpdated) obj;
            return this.canGoBack == navigationStateUpdated.canGoBack && this.canGoForward == navigationStateUpdated.canGoForward;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.canGoForward) + (Boolean.hashCode(this.canGoBack) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("NavigationStateUpdated(canGoBack=", ", canGoForward=", ")", this.canGoBack, this.canGoForward);
        }
    }

    public final class ProgressUpdated extends WebBlockerBridgeEvent {
        public final int progress;

        public ProgressUpdated(int i) {
            this.progress = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressUpdated) && this.progress == ((ProgressUpdated) obj).progress;
        }

        public final int hashCode() {
            return Integer.hashCode(this.progress);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.progress, "ProgressUpdated(progress=", ")");
        }
    }

    public final class TitleUpdated extends WebBlockerBridgeEvent {
        public final String title;

        public TitleUpdated(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleUpdated) && Intrinsics.areEqual(this.title, ((TitleUpdated) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleUpdated(title=", this.title, ")");
        }
    }

    public final class UrlLoading extends WebBlockerBridgeEvent {
        public final String url;

        public UrlLoading(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlLoading) && Intrinsics.areEqual(this.url, ((UrlLoading) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlLoading(url=", this.url, ")");
        }
    }
}
