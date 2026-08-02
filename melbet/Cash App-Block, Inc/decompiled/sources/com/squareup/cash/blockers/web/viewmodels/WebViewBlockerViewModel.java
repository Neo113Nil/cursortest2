package com.squareup.cash.blockers.web.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface WebViewBlockerViewModel {

    public final class ErrorUrl implements WebViewBlockerViewModel {
        public static final ErrorUrl INSTANCE = new ErrorUrl();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorUrl);
        }

        public final int hashCode() {
            return 573848212;
        }

        public final String toString() {
            return "ErrorUrl";
        }
    }

    public final class LoadUrl implements WebViewBlockerViewModel {
        public final boolean allowPopups;
        public final String callbackUrl;
        public final List cookies;
        public final WebViewBlockerFooterModel navigationFooter;
        public final WebViewBlockerHeaderModel navigationHeader;
        public final boolean showLoadingIndicator;
        public final String url;

        public LoadUrl(String str, String str2, List list, WebViewBlockerHeaderModel webViewBlockerHeaderModel, WebViewBlockerFooterModel webViewBlockerFooterModel, boolean z, boolean z2) {
            str.getClass();
            list.getClass();
            this.url = str;
            this.callbackUrl = str2;
            this.cookies = list;
            this.navigationHeader = webViewBlockerHeaderModel;
            this.navigationFooter = webViewBlockerFooterModel;
            this.showLoadingIndicator = z;
            this.allowPopups = z2;
        }

        public static LoadUrl copy$default(LoadUrl loadUrl, WebViewBlockerHeaderModel webViewBlockerHeaderModel, boolean z, int i) {
            String str = loadUrl.url;
            String str2 = loadUrl.callbackUrl;
            List list = loadUrl.cookies;
            if ((i & 8) != 0) {
                webViewBlockerHeaderModel = loadUrl.navigationHeader;
            }
            WebViewBlockerHeaderModel webViewBlockerHeaderModel2 = webViewBlockerHeaderModel;
            WebViewBlockerFooterModel webViewBlockerFooterModel = loadUrl.navigationFooter;
            if ((i & 32) != 0) {
                z = loadUrl.showLoadingIndicator;
            }
            boolean z2 = loadUrl.allowPopups;
            loadUrl.getClass();
            str.getClass();
            list.getClass();
            return new LoadUrl(str, str2, list, webViewBlockerHeaderModel2, webViewBlockerFooterModel, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadUrl)) {
                return false;
            }
            LoadUrl loadUrl = (LoadUrl) obj;
            return Intrinsics.areEqual(this.url, loadUrl.url) && Intrinsics.areEqual(this.callbackUrl, loadUrl.callbackUrl) && Intrinsics.areEqual(this.cookies, loadUrl.cookies) && Intrinsics.areEqual(this.navigationHeader, loadUrl.navigationHeader) && Intrinsics.areEqual(this.navigationFooter, loadUrl.navigationFooter) && this.showLoadingIndicator == loadUrl.showLoadingIndicator && this.allowPopups == loadUrl.allowPopups;
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.callbackUrl;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.cookies);
            WebViewBlockerHeaderModel webViewBlockerHeaderModel = this.navigationHeader;
            int hashCode2 = (m + (webViewBlockerHeaderModel == null ? 0 : webViewBlockerHeaderModel.hashCode())) * 31;
            WebViewBlockerFooterModel webViewBlockerFooterModel = this.navigationFooter;
            return Boolean.hashCode(this.allowPopups) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (webViewBlockerFooterModel != null ? webViewBlockerFooterModel.hashCode() : 0)) * 31, 31, this.showLoadingIndicator);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadUrl(url=", this.url, ", callbackUrl=", this.callbackUrl, ", cookies=");
            m.append(this.cookies);
            m.append(", navigationHeader=");
            m.append(this.navigationHeader);
            m.append(", navigationFooter=");
            m.append(this.navigationFooter);
            m.append(", showLoadingIndicator=");
            m.append(this.showLoadingIndicator);
            m.append(", allowPopups=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.allowPopups, ")");
        }
    }

    public final class Loading implements WebViewBlockerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 587220815;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
