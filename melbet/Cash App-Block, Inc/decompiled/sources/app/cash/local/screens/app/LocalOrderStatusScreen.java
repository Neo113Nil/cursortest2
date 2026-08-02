package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.OrderToken;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalOrderStatusScreen implements LocalScreen {
    public static final Parcelable.Creator<LocalOrderStatusScreen> CREATOR = new EndAppLock.Creator(1);
    public final boolean closeOpenTabConfirmation;
    public final boolean fromBlockers;

    /* renamed from: type, reason: collision with root package name */
    public final Type f913type;

    /* loaded from: classes3.dex */
    public abstract class Type implements Parcelable {

        public final class Preloaded extends Type {
            public static final Parcelable.Creator<Preloaded> CREATOR = new EndAppLock.Creator(2);
            public final LocalOrder order;

            public Preloaded(LocalOrder localOrder) {
                localOrder.getClass();
                this.order = localOrder;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Preloaded) && Intrinsics.areEqual(this.order, ((Preloaded) obj).order);
            }

            public final int hashCode() {
                return this.order.hashCode();
            }

            public final String toString() {
                return "Preloaded(order=██)";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.order, i);
            }
        }

        public final class Standalone extends Type {
            public static final Parcelable.Creator<Standalone> CREATOR = new EndAppLock.Creator(3);
            public final String orderToken;

            public Standalone(String str) {
                this.orderToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Standalone) && this.orderToken.equals(((Standalone) obj).orderToken);
            }

            public final int hashCode() {
                return this.orderToken.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Standalone(orderToken=", OrderToken.m1280toStringimpl(this.orderToken), ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(new OrderToken(this.orderToken), i);
            }
        }
    }

    public /* synthetic */ LocalOrderStatusScreen(Type type2, boolean z, int i) {
        this(type2, (i & 2) == 0, (i & 4) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalOrderStatusScreen)) {
            return false;
        }
        LocalOrderStatusScreen localOrderStatusScreen = (LocalOrderStatusScreen) obj;
        return Intrinsics.areEqual(this.f913type, localOrderStatusScreen.f913type) && this.fromBlockers == localOrderStatusScreen.fromBlockers && this.closeOpenTabConfirmation == localOrderStatusScreen.closeOpenTabConfirmation;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.closeOpenTabConfirmation) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f913type.hashCode() * 31, 31, this.fromBlockers);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalOrderStatusScreen(type=");
        sb.append(this.f913type);
        sb.append(", fromBlockers=");
        sb.append(this.fromBlockers);
        sb.append(", closeOpenTabConfirmation=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.closeOpenTabConfirmation, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f913type, i);
        parcel.writeInt(this.fromBlockers ? 1 : 0);
        parcel.writeInt(this.closeOpenTabConfirmation ? 1 : 0);
    }

    public LocalOrderStatusScreen(Type type2, boolean z, boolean z2) {
        type2.getClass();
        this.f913type = type2;
        this.fromBlockers = z;
        this.closeOpenTabConfirmation = z2;
    }
}
