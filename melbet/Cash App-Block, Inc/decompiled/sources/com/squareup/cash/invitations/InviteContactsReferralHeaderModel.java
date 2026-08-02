package com.squareup.cash.invitations;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface InviteContactsReferralHeaderModel {

    public final class Default implements InviteContactsReferralHeaderModel {
        public static final Default INSTANCE = new Default();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 1661721488;
        }

        public final String toString() {
            return "Default";
        }
    }

    public final class Remote implements InviteContactsReferralHeaderModel {
        public final Image image;
        public final int imageHeight;
        public final int imageWidth;

        public Remote(Image image, int i, int i2) {
            this.image = image;
            this.imageWidth = i;
            this.imageHeight = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return this.image.equals(remote.image) && this.imageWidth == remote.imageWidth && this.imageHeight == remote.imageHeight;
        }

        public final int hashCode() {
            return Integer.hashCode(this.imageHeight) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageWidth, this.image.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Remote(image=");
            sb.append(this.image);
            sb.append(", imageWidth=");
            sb.append(this.imageWidth);
            sb.append(", imageHeight=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageHeight, ")", sb);
        }
    }
}
