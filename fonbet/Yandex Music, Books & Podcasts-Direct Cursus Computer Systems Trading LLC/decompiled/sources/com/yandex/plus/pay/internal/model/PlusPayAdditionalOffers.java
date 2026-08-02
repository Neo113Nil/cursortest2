package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.di.g;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.mhp;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.wq5;
import defpackage.xhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010*¨\u0006>"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "Landroid/os/Parcelable;", "", "eventSessionId", "title", "", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "offers", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "passedUpsaleSteps", "Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "offerSwitchToggle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventSessionId", "getTitle", "Ljava/util/List;", "getOffers", "getPassedUpsaleSteps", "Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "getOfferSwitchToggle", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class PlusPayAdditionalOffers implements Parcelable {

    @NotNull
    private static final arf[] $childSerializers;

    @NotNull
    private final String eventSessionId;
    private final PlusPayOfferSwitchToggle offerSwitchToggle;

    @NotNull
    private final List<PlusPayAdditionalOffer> offers;

    @NotNull
    private final List<PlusPayUpsaleStep> passedUpsaleSteps;

    @NotNull
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PlusPayAdditionalOffers> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final t9f serializer() {
            return PlusPayAdditionalOffers$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayAdditionalOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAdditionalOffers createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = k.c(PlusPayAdditionalOffer.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i2 != readInt2) {
                i2 = k.c(PlusPayUpsaleStep.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new PlusPayAdditionalOffers(readString, readString2, arrayList, arrayList2, parcel.readInt() == 0 ? null : PlusPayOfferSwitchToggle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAdditionalOffers[] newArray(int i) {
            return new PlusPayAdditionalOffers[i];
        }
    }

    static {
        bwf bwfVar = bwf.b;
        $childSerializers = new arf[]{null, null, btf.a(bwfVar, new g(23)), btf.a(bwfVar, new g(24)), null};
    }

    public /* synthetic */ PlusPayAdditionalOffers(int i, String str, String str2, List list, List list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle, xhp xhpVar) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, PlusPayAdditionalOffers$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventSessionId = str;
        this.title = str2;
        this.offers = list;
        this.passedUpsaleSteps = list2;
        this.offerSwitchToggle = plusPayOfferSwitchToggle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
        return new qy0(PlusPayAdditionalOffer$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _childSerializers$_anonymous_$0() {
        return new qy0(PlusPayUpsaleStep.INSTANCE.serializer(), 0);
    }

    public static /* synthetic */ PlusPayAdditionalOffers copy$default(PlusPayAdditionalOffers plusPayAdditionalOffers, String str, String str2, List list, List list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayAdditionalOffers.eventSessionId;
        }
        if ((i & 2) != 0) {
            str2 = plusPayAdditionalOffers.title;
        }
        if ((i & 4) != 0) {
            list = plusPayAdditionalOffers.offers;
        }
        if ((i & 8) != 0) {
            list2 = plusPayAdditionalOffers.passedUpsaleSteps;
        }
        if ((i & 16) != 0) {
            plusPayOfferSwitchToggle = plusPayAdditionalOffers.offerSwitchToggle;
        }
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle2 = plusPayOfferSwitchToggle;
        List list3 = list;
        return plusPayAdditionalOffers.copy(str, str2, list3, list2, plusPayOfferSwitchToggle2);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayAdditionalOffers self, wq5 output, mhp serialDesc) {
        arf[] arfVarArr = $childSerializers;
        output.p(serialDesc, 0, self.eventSessionId);
        output.p(serialDesc, 1, self.title);
        output.k(serialDesc, 2, (t9f) arfVarArr[2].getValue(), self.offers);
        output.k(serialDesc, 3, (t9f) arfVarArr[3].getValue(), self.passedUpsaleSteps);
        output.q(serialDesc, 4, PlusPayOfferSwitchToggle$$serializer.INSTANCE, self.offerSwitchToggle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventSessionId() {
        return this.eventSessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PlusPayAdditionalOffer> component3() {
        return this.offers;
    }

    @NotNull
    public final List<PlusPayUpsaleStep> component4() {
        return this.passedUpsaleSteps;
    }

    /* renamed from: component5, reason: from getter */
    public final PlusPayOfferSwitchToggle getOfferSwitchToggle() {
        return this.offerSwitchToggle;
    }

    @NotNull
    public final PlusPayAdditionalOffers copy(@NotNull String eventSessionId, @NotNull String title, @NotNull List<PlusPayAdditionalOffer> offers, @NotNull List<? extends PlusPayUpsaleStep> passedUpsaleSteps, PlusPayOfferSwitchToggle offerSwitchToggle) {
        eventSessionId.getClass();
        title.getClass();
        offers.getClass();
        passedUpsaleSteps.getClass();
        return new PlusPayAdditionalOffers(eventSessionId, title, offers, passedUpsaleSteps, offerSwitchToggle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayAdditionalOffers)) {
            return false;
        }
        PlusPayAdditionalOffers plusPayAdditionalOffers = (PlusPayAdditionalOffers) other;
        return Intrinsics.d(this.eventSessionId, plusPayAdditionalOffers.eventSessionId) && Intrinsics.d(this.title, plusPayAdditionalOffers.title) && Intrinsics.d(this.offers, plusPayAdditionalOffers.offers) && Intrinsics.d(this.passedUpsaleSteps, plusPayAdditionalOffers.passedUpsaleSteps) && Intrinsics.d(this.offerSwitchToggle, plusPayAdditionalOffers.offerSwitchToggle);
    }

    @NotNull
    public final String getEventSessionId() {
        return this.eventSessionId;
    }

    public final PlusPayOfferSwitchToggle getOfferSwitchToggle() {
        return this.offerSwitchToggle;
    }

    @NotNull
    public final List<PlusPayAdditionalOffer> getOffers() {
        return this.offers;
    }

    @NotNull
    public final List<PlusPayUpsaleStep> getPassedUpsaleSteps() {
        return this.passedUpsaleSteps;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int d = k5r.d(k5r.d(k5r.c(this.eventSessionId.hashCode() * 31, 31, this.title), 31, this.offers), 31, this.passedUpsaleSteps);
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = this.offerSwitchToggle;
        return d + (plusPayOfferSwitchToggle == null ? 0 : plusPayOfferSwitchToggle.hashCode());
    }

    @NotNull
    public String toString() {
        return "PlusPayAdditionalOffers(eventSessionId=" + this.eventSessionId + ", title=" + this.title + ", offers=" + this.offers + ", passedUpsaleSteps=" + this.passedUpsaleSteps + ", offerSwitchToggle=" + this.offerSwitchToggle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventSessionId);
        dest.writeString(this.title);
        Iterator n = f1d.n(dest, this.offers);
        while (n.hasNext()) {
            ((PlusPayAdditionalOffer) n.next()).writeToParcel(dest, flags);
        }
        Iterator n2 = f1d.n(dest, this.passedUpsaleSteps);
        while (n2.hasNext()) {
            ((PlusPayUpsaleStep) n2.next()).writeToParcel(dest, flags);
        }
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = this.offerSwitchToggle;
        if (plusPayOfferSwitchToggle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayOfferSwitchToggle.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayAdditionalOffers(@NotNull String str, @NotNull String str2, @NotNull List<PlusPayAdditionalOffer> list, @NotNull List<? extends PlusPayUpsaleStep> list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.eventSessionId = str;
        this.title = str2;
        this.offers = list;
        this.passedUpsaleSteps = list2;
        this.offerSwitchToggle = plusPayOfferSwitchToggle;
    }
}
