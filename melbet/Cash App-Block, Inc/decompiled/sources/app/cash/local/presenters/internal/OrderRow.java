package app.cash.local.presenters.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.order.RowIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OrderRow {
    public final LocalMoney amount;
    public final boolean boldTreatment;
    public final List dependencies;
    public final String displayName;
    public final String displayValueIfZero;
    public final String identifier;
    public final Orientation orientation;
    public final Visibility visibility;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Orientation {
        public static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation CREDIT;
        public static final Orientation DEBIT;

        static {
            Orientation orientation = new Orientation("DEBIT", 0);
            DEBIT = orientation;
            Orientation orientation2 = new Orientation("CREDIT", 1);
            CREDIT = orientation2;
            $VALUES = new Orientation[]{orientation, orientation2};
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Visibility {
        public static final /* synthetic */ Visibility[] $VALUES;
        public static final Visibility HIDDEN;
        public static final Visibility HIDDEN_IF_ZERO;
        public static final Visibility VISIBLE;

        static {
            Visibility visibility = new Visibility("VISIBLE", 0);
            VISIBLE = visibility;
            Visibility visibility2 = new Visibility("HIDDEN_IF_ZERO", 1);
            HIDDEN_IF_ZERO = visibility2;
            Visibility visibility3 = new Visibility("HIDDEN", 2);
            HIDDEN = visibility3;
            $VALUES = new Visibility[]{visibility, visibility2, visibility3};
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }
    }

    public OrderRow(String str, Visibility visibility, String str2, String str3, LocalMoney localMoney, Orientation orientation, List list, boolean z) {
        str.getClass();
        this.identifier = str;
        this.visibility = visibility;
        this.displayName = str2;
        this.displayValueIfZero = str3;
        this.amount = localMoney;
        this.orientation = orientation;
        this.dependencies = list;
        this.boldTreatment = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderRow)) {
            return false;
        }
        OrderRow orderRow = (OrderRow) obj;
        return Intrinsics.areEqual(this.identifier, orderRow.identifier) && this.visibility == orderRow.visibility && Intrinsics.areEqual(this.displayName, orderRow.displayName) && Intrinsics.areEqual(this.displayValueIfZero, orderRow.displayValueIfZero) && this.amount.equals(orderRow.amount) && this.orientation == orderRow.orientation && this.dependencies.equals(orderRow.dependencies) && this.boldTreatment == orderRow.boldTreatment;
    }

    public final int hashCode() {
        int hashCode = (this.visibility.hashCode() + (this.identifier.hashCode() * 31)) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayValueIfZero;
        return Boolean.hashCode(this.boldTreatment) + Recorder$$ExternalSyntheticOutline2.m((this.orientation.hashCode() + ((this.amount.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.dependencies);
    }

    public final String toString() {
        String m1286toStringimpl = RowIdentifier.m1286toStringimpl(this.identifier);
        StringBuilder sb = new StringBuilder("OrderRow(identifier=");
        sb.append(m1286toStringimpl);
        sb.append(", visibility=");
        sb.append(this.visibility);
        sb.append(", displayName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.displayName, ", displayValueIfZero=", this.displayValueIfZero, ", amount=");
        sb.append(this.amount);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", dependencies=");
        sb.append(this.dependencies);
        sb.append(", boldTreatment=");
        sb.append(this.boldTreatment);
        sb.append(")");
        return sb.toString();
    }
}
