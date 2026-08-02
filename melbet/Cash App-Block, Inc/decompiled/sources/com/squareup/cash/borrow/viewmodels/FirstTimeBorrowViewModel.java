package com.squareup.cash.borrow.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface FirstTimeBorrowViewModel {

    public final class Content implements FirstTimeBorrowViewModel {
        public final BorrowAmountPickerViewModel amountPicker;
        public final BorrowButton borrowButton;
        public final Bullets bullets;
        public final AlertDialogViewModel errorDialog;
        public final HelpAction helpAction;
        public final Image image;
        public final Notice notice;
        public final SecondaryButton secondaryButton;
        public final String subtitle;
        public final String title;

        public final class BorrowButton {
            public final String label;

            public BorrowButton(String str) {
                str.getClass();
                this.label = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowButton) && Intrinsics.areEqual(this.label, ((BorrowButton) obj).label);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BorrowButton(label=", this.label, ", isEnabled=true)");
            }
        }

        public final class BulletItem {
            public final String iconArcadeId;
            public final String text;

            public BulletItem(String str, String str2) {
                str.getClass();
                this.text = str;
                this.iconArcadeId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BulletItem)) {
                    return false;
                }
                BulletItem bulletItem = (BulletItem) obj;
                return Intrinsics.areEqual(this.text, bulletItem.text) && Intrinsics.areEqual(this.iconArcadeId, bulletItem.iconArcadeId);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.iconArcadeId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("BulletItem(text=", this.text, ", iconArcadeId=", this.iconArcadeId, ")");
            }
        }

        public final class Bullets {
            public final String buttonLabel;
            public final ArrayList items;

            public Bullets(String str, ArrayList arrayList) {
                this.items = arrayList;
                this.buttonLabel = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Bullets)) {
                    return false;
                }
                Bullets bullets = (Bullets) obj;
                return this.items.equals(bullets.items) && Intrinsics.areEqual(this.buttonLabel, bullets.buttonLabel);
            }

            public final int hashCode() {
                int hashCode = this.items.hashCode() * 31;
                String str = this.buttonLabel;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "Bullets(items=" + this.items + ", buttonLabel=" + this.buttonLabel + ")";
            }
        }

        public final class HelpAction {
            public static final HelpAction INSTANCE = new HelpAction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HelpAction);
            }

            public final int hashCode() {
                return -1345222640;
            }

            public final String toString() {
                return "HelpAction";
            }
        }

        public final class Notice {
            public final String body;
            public final String title;

            public Notice(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.body = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Notice)) {
                    return false;
                }
                Notice notice = (Notice) obj;
                return Intrinsics.areEqual(this.title, notice.title) && Intrinsics.areEqual(this.body, notice.body);
            }

            public final int hashCode() {
                return this.body.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Notice(title=", this.title, ", body=", this.body, ")");
            }
        }

        public final class SecondaryButton {
            public final String label;
            public final String submitId;

            public SecondaryButton(String str, String str2) {
                str.getClass();
                this.label = str;
                this.submitId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryButton)) {
                    return false;
                }
                SecondaryButton secondaryButton = (SecondaryButton) obj;
                return Intrinsics.areEqual(this.label, secondaryButton.label) && this.submitId.equals(secondaryButton.submitId);
            }

            public final int hashCode() {
                return this.submitId.hashCode() + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("SecondaryButton(label=", this.label, ", submitId=", this.submitId, ")");
            }
        }

        public Content(String str, String str2, Image image, BorrowButton borrowButton, SecondaryButton secondaryButton, Notice notice, Bullets bullets, HelpAction helpAction, BorrowAmountPickerViewModel borrowAmountPickerViewModel, AlertDialogViewModel alertDialogViewModel) {
            str.getClass();
            str2.getClass();
            alertDialogViewModel.getClass();
            this.title = str;
            this.subtitle = str2;
            this.image = image;
            this.borrowButton = borrowButton;
            this.secondaryButton = secondaryButton;
            this.notice = notice;
            this.bullets = bullets;
            this.helpAction = helpAction;
            this.amountPicker = borrowAmountPickerViewModel;
            this.errorDialog = alertDialogViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subtitle, content.subtitle) && Intrinsics.areEqual(this.image, content.image) && this.borrowButton.equals(content.borrowButton) && Intrinsics.areEqual(this.secondaryButton, content.secondaryButton) && Intrinsics.areEqual(this.notice, content.notice) && Intrinsics.areEqual(this.bullets, content.bullets) && Intrinsics.areEqual(this.helpAction, content.helpAction) && Intrinsics.areEqual(this.amountPicker, content.amountPicker) && Intrinsics.areEqual(this.errorDialog, content.errorDialog);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            Image image = this.image;
            int hashCode = (this.borrowButton.hashCode() + ((m + (image == null ? 0 : image.hashCode())) * 31)) * 31;
            SecondaryButton secondaryButton = this.secondaryButton;
            int hashCode2 = (hashCode + (secondaryButton == null ? 0 : secondaryButton.hashCode())) * 31;
            Notice notice = this.notice;
            int hashCode3 = (hashCode2 + (notice == null ? 0 : notice.hashCode())) * 31;
            Bullets bullets = this.bullets;
            int hashCode4 = (((hashCode3 + (bullets == null ? 0 : bullets.hashCode())) * 31) + (this.helpAction == null ? 0 : -1345222640)) * 31;
            BorrowAmountPickerViewModel borrowAmountPickerViewModel = this.amountPicker;
            return this.errorDialog.hashCode() + ((hashCode4 + (borrowAmountPickerViewModel != null ? borrowAmountPickerViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subtitle=", this.subtitle, ", image=");
            m.append(this.image);
            m.append(", borrowButton=");
            m.append(this.borrowButton);
            m.append(", secondaryButton=");
            m.append(this.secondaryButton);
            m.append(", notice=");
            m.append(this.notice);
            m.append(", bullets=");
            m.append(this.bullets);
            m.append(", helpAction=");
            m.append(this.helpAction);
            m.append(", amountPicker=");
            m.append(this.amountPicker);
            m.append(", errorDialog=");
            m.append(this.errorDialog);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements FirstTimeBorrowViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1706441016;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
