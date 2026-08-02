package com.squareup.cash.sharesheet;

import android.net.Uri;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShareTarget {

    public final class CopyToClipboard implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String title;

        public final class Content {
            public final String cashtagUrl;

            public Content(String str) {
                str.getClass();
                this.cashtagUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.cashtagUrl, ((Content) obj).cashtagUrl);
            }

            public final int hashCode() {
                return this.cashtagUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(cashtagUrl=", this.cashtagUrl, ")");
            }
        }

        public CopyToClipboard(String str, Content content) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.id = Id.COPY_TO_CLIPBOARD_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CopyToClipboard)) {
                return false;
            }
            CopyToClipboard copyToClipboard = (CopyToClipboard) obj;
            return Intrinsics.areEqual(this.title, copyToClipboard.title) && this.content.equals(copyToClipboard.content);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.content.cashtagUrl.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "CopyToClipboard(title=" + this.title + ", content=" + this.content + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Id {
        public static final /* synthetic */ Id[] $VALUES;
        public static final Id COPY_TO_CLIPBOARD_TARGET_ID;
        public static final Id INSTAGRAM_TARGET_ID;
        public static final Id MORE_TARGET_ID;
        public static final Id SAVE_TO_PHOTOS_TARGET_ID;
        public static final Id SMS_TARGET_ID;
        public static final Id X_TARGET_ID;

        static {
            Id id = new Id("X_TARGET_ID", 0);
            X_TARGET_ID = id;
            Id id2 = new Id("INSTAGRAM_TARGET_ID", 1);
            INSTAGRAM_TARGET_ID = id2;
            Id id3 = new Id("SMS_TARGET_ID", 2);
            SMS_TARGET_ID = id3;
            Id id4 = new Id("COPY_TO_CLIPBOARD_TARGET_ID", 3);
            COPY_TO_CLIPBOARD_TARGET_ID = id4;
            Id id5 = new Id("SAVE_TO_PHOTOS_TARGET_ID", 4);
            SAVE_TO_PHOTOS_TARGET_ID = id5;
            Id id6 = new Id("MORE_TARGET_ID", 5);
            MORE_TARGET_ID = id6;
            $VALUES = new Id[]{id, id2, id3, id4, id5, id6};
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }
    }

    public final class Instagram implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String title;

        public final class Content {
            public final Uri imageUri;

            public Content(Uri uri) {
                this.imageUri = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.imageUri, ((Content) obj).imageUri);
            }

            public final int hashCode() {
                Uri uri = this.imageUri;
                if (uri == null) {
                    return 0;
                }
                return uri.hashCode();
            }

            public final String toString() {
                return "Content(imageUri=" + this.imageUri + ")";
            }
        }

        public Instagram(String str, Content content) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.id = Id.INSTAGRAM_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Instagram)) {
                return false;
            }
            Instagram instagram = (Instagram) obj;
            return Intrinsics.areEqual(this.title, instagram.title) && this.content.equals(instagram.content);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.content.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Instagram(title=" + this.title + ", content=" + this.content + ")";
        }
    }

    public final class More implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String title;

        public final class Content {
            public final String cashtagUrl;

            public Content(String str) {
                str.getClass();
                this.cashtagUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.cashtagUrl, ((Content) obj).cashtagUrl);
            }

            public final int hashCode() {
                return this.cashtagUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(cashtagUrl=", this.cashtagUrl, ")");
            }
        }

        public More(String str, Content content) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.id = Id.MORE_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof More)) {
                return false;
            }
            More more = (More) obj;
            return Intrinsics.areEqual(this.title, more.title) && this.content.equals(more.content);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.content.cashtagUrl.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "More(title=" + this.title + ", content=" + this.content + ")";
        }
    }

    public final class SaveToPhotos implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String title;

        public final class Content {
            public final Uri imageUrl;

            public Content(Uri uri) {
                this.imageUrl = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.imageUrl, ((Content) obj).imageUrl);
            }

            public final int hashCode() {
                Uri uri = this.imageUrl;
                if (uri == null) {
                    return 0;
                }
                return uri.hashCode();
            }

            public final String toString() {
                return "Content(imageUrl=" + this.imageUrl + ")";
            }
        }

        public SaveToPhotos(String str, Content content) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.id = Id.SAVE_TO_PHOTOS_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveToPhotos)) {
                return false;
            }
            SaveToPhotos saveToPhotos = (SaveToPhotos) obj;
            return Intrinsics.areEqual(this.title, saveToPhotos.title) && this.content.equals(saveToPhotos.content);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.content.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "SaveToPhotos(title=" + this.title + ", content=" + this.content + ")";
        }
    }

    public final class Sms implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String smsPackage;
        public final String title;

        public final class Content {
            public final String cashtagUrl;

            public Content(String str) {
                str.getClass();
                this.cashtagUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.cashtagUrl, ((Content) obj).cashtagUrl);
            }

            public final int hashCode() {
                return this.cashtagUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(cashtagUrl=", this.cashtagUrl, ")");
            }
        }

        public Sms(String str, Content content, String str2) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.smsPackage = str2;
            this.id = Id.SMS_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sms)) {
                return false;
            }
            Sms sms = (Sms) obj;
            return Intrinsics.areEqual(this.title, sms.title) && this.content.equals(sms.content) && this.smsPackage.equals(sms.smsPackage);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.smsPackage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.content.cashtagUrl);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Sms(title=");
            sb.append(this.title);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", smsPackage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.smsPackage, ")");
        }
    }

    public final class XApp implements ShareTarget {
        public final Content content;
        public final Id id;
        public final String title;

        public final class Content {
            public final String cashtagUrl;

            public Content(String str) {
                str.getClass();
                this.cashtagUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.areEqual(this.cashtagUrl, ((Content) obj).cashtagUrl);
            }

            public final int hashCode() {
                return this.cashtagUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(cashtagUrl=", this.cashtagUrl, ")");
            }
        }

        public XApp(String str, Content content) {
            str.getClass();
            this.title = str;
            this.content = content;
            this.id = Id.X_TARGET_ID;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof XApp)) {
                return false;
            }
            XApp xApp = (XApp) obj;
            return Intrinsics.areEqual(this.title, xApp.title) && this.content.equals(xApp.content);
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final Id getId() {
            return this.id;
        }

        @Override // com.squareup.cash.sharesheet.ShareTarget
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.content.cashtagUrl.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "XApp(title=" + this.title + ", content=" + this.content + ")";
        }
    }

    Id getId();

    String getTitle();
}
