package app.cash.badging.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface Badger2 extends IoActivitySetupTeardown {

    /* loaded from: classes3.dex */
    public final class Badge {
        public final String externalToken;
        public final long externalVersion;

        /* renamed from: type, reason: collision with root package name */
        public final ItemType f907type;

        public Badge(String str, ItemType itemType, long j) {
            str.getClass();
            this.externalToken = str;
            this.f907type = itemType;
            this.externalVersion = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.areEqual(this.externalToken, badge.externalToken) && this.f907type == badge.f907type && this.externalVersion == badge.externalVersion;
        }

        public final int hashCode() {
            return Long.hashCode(this.externalVersion) + ((this.f907type.hashCode() + (this.externalToken.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Badge(externalToken=");
            sb.append(this.externalToken);
            sb.append(", type=");
            sb.append(this.f907type);
            sb.append(", externalVersion=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.externalVersion, ")", sb);
        }
    }

    /* loaded from: classes3.dex */
    public final class BadgingInfo {
        public final List countGroups;
        public final String externalToken;
        public final long externalVersion;
        public final boolean isBadged;
        public final ItemType itemType;

        public BadgingInfo(String str, long j, boolean z, List list, ItemType itemType) {
            str.getClass();
            list.getClass();
            this.externalToken = str;
            this.externalVersion = j;
            this.isBadged = z;
            this.countGroups = list;
            this.itemType = itemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadgingInfo)) {
                return false;
            }
            BadgingInfo badgingInfo = (BadgingInfo) obj;
            return Intrinsics.areEqual(this.externalToken, badgingInfo.externalToken) && this.externalVersion == badgingInfo.externalVersion && this.isBadged == badgingInfo.isBadged && Intrinsics.areEqual(this.countGroups, badgingInfo.countGroups) && this.itemType == badgingInfo.itemType;
        }

        public final int hashCode() {
            return this.itemType.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.externalToken.hashCode() * 31, 31, this.externalVersion), 31, this.isBadged), 31, this.countGroups);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("BadgingInfo(externalToken=", this.externalToken, ", externalVersion=", this.externalVersion);
            m.append(", isBadged=");
            m.append(this.isBadged);
            m.append(", countGroups=");
            m.append(this.countGroups);
            m.append(", itemType=");
            m.append(this.itemType);
            m.append(")");
            return m.toString();
        }
    }
}
