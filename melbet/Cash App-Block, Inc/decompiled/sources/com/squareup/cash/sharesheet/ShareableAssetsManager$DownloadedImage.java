package com.squareup.cash.sharesheet;

import android.net.Uri;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShareableAssetsManager$DownloadedImage {

    /* loaded from: classes8.dex */
    public final class Failure extends ShareableAssetsManager$DownloadedImage {
        public final String failureMessage;
        public final String url;

        public Failure(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.url = str;
            this.failureMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.url, failure.url) && Intrinsics.areEqual(this.failureMessage, failure.failureMessage);
        }

        public final int hashCode() {
            return this.failureMessage.hashCode() + (this.url.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Failure(url=", this.url, ", failureMessage=", this.failureMessage, ")");
        }
    }

    /* loaded from: classes8.dex */
    public final class Success extends ShareableAssetsManager$DownloadedImage {
        public final Uri url;

        public Success(Uri uri) {
            uri.getClass();
            this.url = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.url, ((Success) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return "Success(url=" + this.url + ")";
        }
    }
}
