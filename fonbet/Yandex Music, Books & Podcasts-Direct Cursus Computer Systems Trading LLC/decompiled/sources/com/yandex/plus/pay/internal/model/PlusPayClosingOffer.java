package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
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
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0003KLJBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010*Jj\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b7\u0010!J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u00101R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bH\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bI\u0010*¨\u0006M"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/core/data/common/y;", "backgroundImage", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "titleText", "subtitleText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "assets", "", "acceptButtonText", "rejectButtonText", "footerText", "<init>", "(Lcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/common/y;", "component2", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component3", "component4", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(Lcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/common/y;", "getBackgroundImage", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitleText", "getSubtitleText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Ljava/util/List;", "getAssets", "Ljava/lang/String;", "getAcceptButtonText", "getRejectButtonText", "getFooterText", "Companion", "ClosingOfferAsset", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class PlusPayClosingOffer implements Parcelable {

    @NotNull
    private final String acceptButtonText;

    @NotNull
    private final List<ClosingOfferAsset> assets;

    @NotNull
    private final y backgroundImage;
    private final PlusPayRichText footerText;

    @NotNull
    private final PlusPayCompositeOffers.Offer offer;

    @NotNull
    private final String rejectButtonText;
    private final PlusPayRichText subtitleText;

    @NotNull
    private final PlusPayRichText titleText;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PlusPayClosingOffer> CREATOR = new Creator();

    @NotNull
    private static final arf[] $childSerializers = {null, null, null, null, btf.a(bwf.b, new g(25)), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final t9f serializer() {
            return PlusPayClosingOffer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayClosingOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayClosingOffer createFromParcel(Parcel parcel) {
            parcel.getClass();
            y yVar = (y) parcel.readParcelable(PlusPayClosingOffer.class.getClassLoader());
            Parcelable.Creator<PlusPayRichText> creator = PlusPayRichText.CREATOR;
            PlusPayRichText createFromParcel = creator.createFromParcel(parcel);
            PlusPayRichText createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            PlusPayCompositeOffers.Offer createFromParcel3 = PlusPayCompositeOffers.Offer.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = k.c(ClosingOfferAsset.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayClosingOffer(yVar, createFromParcel, createFromParcel2, createFromParcel3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PlusPayRichText.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayClosingOffer[] newArray(int i) {
            return new PlusPayClosingOffer[i];
        }
    }

    public PlusPayClosingOffer(@NotNull y yVar, @NotNull PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, @NotNull PlusPayCompositeOffers.Offer offer, @NotNull List<ClosingOfferAsset> list, @NotNull String str, @NotNull String str2, PlusPayRichText plusPayRichText3) {
        yVar.getClass();
        plusPayRichText.getClass();
        offer.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.backgroundImage = yVar;
        this.titleText = plusPayRichText;
        this.subtitleText = plusPayRichText2;
        this.offer = offer;
        this.assets = list;
        this.acceptButtonText = str;
        this.rejectButtonText = str2;
        this.footerText = plusPayRichText3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
        return new qy0(PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlusPayClosingOffer copy$default(PlusPayClosingOffer plusPayClosingOffer, y yVar, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusPayCompositeOffers.Offer offer, List list, String str, String str2, PlusPayRichText plusPayRichText3, int i, Object obj) {
        if ((i & 1) != 0) {
            yVar = plusPayClosingOffer.backgroundImage;
        }
        if ((i & 2) != 0) {
            plusPayRichText = plusPayClosingOffer.titleText;
        }
        if ((i & 4) != 0) {
            plusPayRichText2 = plusPayClosingOffer.subtitleText;
        }
        if ((i & 8) != 0) {
            offer = plusPayClosingOffer.offer;
        }
        if ((i & 16) != 0) {
            list = plusPayClosingOffer.assets;
        }
        if ((i & 32) != 0) {
            str = plusPayClosingOffer.acceptButtonText;
        }
        if ((i & 64) != 0) {
            str2 = plusPayClosingOffer.rejectButtonText;
        }
        if ((i & 128) != 0) {
            plusPayRichText3 = plusPayClosingOffer.footerText;
        }
        String str3 = str2;
        PlusPayRichText plusPayRichText4 = plusPayRichText3;
        List list2 = list;
        String str4 = str;
        return plusPayClosingOffer.copy(yVar, plusPayRichText, plusPayRichText2, offer, list2, str4, str3, plusPayRichText4);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayClosingOffer self, wq5 output, mhp serialDesc) {
        arf[] arfVarArr = $childSerializers;
        output.k(serialDesc, 0, w.a, self.backgroundImage);
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        output.k(serialDesc, 1, plusPayRichText$$serializer, self.titleText);
        output.q(serialDesc, 2, plusPayRichText$$serializer, self.subtitleText);
        output.k(serialDesc, 3, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, self.offer);
        output.k(serialDesc, 4, (t9f) arfVarArr[4].getValue(), self.assets);
        output.p(serialDesc, 5, self.acceptButtonText);
        output.p(serialDesc, 6, self.rejectButtonText);
        output.q(serialDesc, 7, plusPayRichText$$serializer, self.footerText);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final y getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PlusPayRichText getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayRichText getSubtitleText() {
        return this.subtitleText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    @NotNull
    public final List<ClosingOfferAsset> component5() {
        return this.assets;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final PlusPayRichText getFooterText() {
        return this.footerText;
    }

    @NotNull
    public final PlusPayClosingOffer copy(@NotNull y backgroundImage, @NotNull PlusPayRichText titleText, PlusPayRichText subtitleText, @NotNull PlusPayCompositeOffers.Offer offer, @NotNull List<ClosingOfferAsset> assets, @NotNull String acceptButtonText, @NotNull String rejectButtonText, PlusPayRichText footerText) {
        backgroundImage.getClass();
        titleText.getClass();
        offer.getClass();
        assets.getClass();
        acceptButtonText.getClass();
        rejectButtonText.getClass();
        return new PlusPayClosingOffer(backgroundImage, titleText, subtitleText, offer, assets, acceptButtonText, rejectButtonText, footerText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayClosingOffer)) {
            return false;
        }
        PlusPayClosingOffer plusPayClosingOffer = (PlusPayClosingOffer) other;
        return Intrinsics.d(this.backgroundImage, plusPayClosingOffer.backgroundImage) && Intrinsics.d(this.titleText, plusPayClosingOffer.titleText) && Intrinsics.d(this.subtitleText, plusPayClosingOffer.subtitleText) && Intrinsics.d(this.offer, plusPayClosingOffer.offer) && Intrinsics.d(this.assets, plusPayClosingOffer.assets) && Intrinsics.d(this.acceptButtonText, plusPayClosingOffer.acceptButtonText) && Intrinsics.d(this.rejectButtonText, plusPayClosingOffer.rejectButtonText) && Intrinsics.d(this.footerText, plusPayClosingOffer.footerText);
    }

    @NotNull
    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    @NotNull
    public final List<ClosingOfferAsset> getAssets() {
        return this.assets;
    }

    @NotNull
    public final y getBackgroundImage() {
        return this.backgroundImage;
    }

    public final PlusPayRichText getFooterText() {
        return this.footerText;
    }

    @NotNull
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    @NotNull
    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    public final PlusPayRichText getSubtitleText() {
        return this.subtitleText;
    }

    @NotNull
    public final PlusPayRichText getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        int hashCode = (this.titleText.hashCode() + (this.backgroundImage.hashCode() * 31)) * 31;
        PlusPayRichText plusPayRichText = this.subtitleText;
        int c = k5r.c(k5r.c(k5r.d((this.offer.hashCode() + ((hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode())) * 31)) * 31, 31, this.assets), 31, this.acceptButtonText), 31, this.rejectButtonText);
        PlusPayRichText plusPayRichText2 = this.footerText;
        return c + (plusPayRichText2 != null ? plusPayRichText2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlusPayClosingOffer(backgroundImage=" + this.backgroundImage + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", offer=" + this.offer + ", assets=" + this.assets + ", acceptButtonText=" + this.acceptButtonText + ", rejectButtonText=" + this.rejectButtonText + ", footerText=" + this.footerText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelable(this.backgroundImage, flags);
        this.titleText.writeToParcel(dest, flags);
        PlusPayRichText plusPayRichText = this.subtitleText;
        if (plusPayRichText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText.writeToParcel(dest, flags);
        }
        this.offer.writeToParcel(dest, flags);
        Iterator n = f1d.n(dest, this.assets);
        while (n.hasNext()) {
            ((ClosingOfferAsset) n.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.acceptButtonText);
        dest.writeString(this.rejectButtonText);
        PlusPayRichText plusPayRichText2 = this.footerText;
        if (plusPayRichText2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText2.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010 ¨\u00068"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "titleText", "Lcom/yandex/plus/core/data/common/y;", "icon", "buttonText", "buttonAdditionalText", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component2", "()Lcom/yandex/plus/core/data/common/y;", "component3", "component4", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/y;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitleText", "Lcom/yandex/plus/core/data/common/y;", "getIcon", "getButtonText", "getButtonAdditionalText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    public static final /* data */ class ClosingOfferAsset implements Parcelable {
        private final PlusPayRichText buttonAdditionalText;

        @NotNull
        private final PlusPayRichText buttonText;

        @NotNull
        private final y icon;

        @NotNull
        private final PlusPayRichText titleText;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<ClosingOfferAsset> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final t9f serializer() {
                return PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Creator implements Parcelable.Creator<ClosingOfferAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClosingOfferAsset createFromParcel(Parcel parcel) {
                parcel.getClass();
                Parcelable.Creator<PlusPayRichText> creator = PlusPayRichText.CREATOR;
                return new ClosingOfferAsset(creator.createFromParcel(parcel), (y) parcel.readParcelable(ClosingOfferAsset.class.getClassLoader()), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClosingOfferAsset[] newArray(int i) {
                return new ClosingOfferAsset[i];
            }
        }

        public /* synthetic */ ClosingOfferAsset(int i, PlusPayRichText plusPayRichText, y yVar, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3, xhp xhpVar) {
            if (15 != (i & 15)) {
                u7g.V(i, 15, PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.titleText = plusPayRichText;
            this.icon = yVar;
            this.buttonText = plusPayRichText2;
            this.buttonAdditionalText = plusPayRichText3;
        }

        public static /* synthetic */ ClosingOfferAsset copy$default(ClosingOfferAsset closingOfferAsset, PlusPayRichText plusPayRichText, y yVar, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPayRichText = closingOfferAsset.titleText;
            }
            if ((i & 2) != 0) {
                yVar = closingOfferAsset.icon;
            }
            if ((i & 4) != 0) {
                plusPayRichText2 = closingOfferAsset.buttonText;
            }
            if ((i & 8) != 0) {
                plusPayRichText3 = closingOfferAsset.buttonAdditionalText;
            }
            return closingOfferAsset.copy(plusPayRichText, yVar, plusPayRichText2, plusPayRichText3);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(ClosingOfferAsset self, wq5 output, mhp serialDesc) {
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            output.k(serialDesc, 0, plusPayRichText$$serializer, self.titleText);
            output.k(serialDesc, 1, w.a, self.icon);
            output.k(serialDesc, 2, plusPayRichText$$serializer, self.buttonText);
            output.q(serialDesc, 3, plusPayRichText$$serializer, self.buttonAdditionalText);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PlusPayRichText getTitleText() {
            return this.titleText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final y getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PlusPayRichText getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component4, reason: from getter */
        public final PlusPayRichText getButtonAdditionalText() {
            return this.buttonAdditionalText;
        }

        @NotNull
        public final ClosingOfferAsset copy(@NotNull PlusPayRichText titleText, @NotNull y icon, @NotNull PlusPayRichText buttonText, PlusPayRichText buttonAdditionalText) {
            titleText.getClass();
            icon.getClass();
            buttonText.getClass();
            return new ClosingOfferAsset(titleText, icon, buttonText, buttonAdditionalText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClosingOfferAsset)) {
                return false;
            }
            ClosingOfferAsset closingOfferAsset = (ClosingOfferAsset) other;
            return Intrinsics.d(this.titleText, closingOfferAsset.titleText) && Intrinsics.d(this.icon, closingOfferAsset.icon) && Intrinsics.d(this.buttonText, closingOfferAsset.buttonText) && Intrinsics.d(this.buttonAdditionalText, closingOfferAsset.buttonAdditionalText);
        }

        public final PlusPayRichText getButtonAdditionalText() {
            return this.buttonAdditionalText;
        }

        @NotNull
        public final PlusPayRichText getButtonText() {
            return this.buttonText;
        }

        @NotNull
        public final y getIcon() {
            return this.icon;
        }

        @NotNull
        public final PlusPayRichText getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            int hashCode = (this.buttonText.hashCode() + ((this.icon.hashCode() + (this.titleText.hashCode() * 31)) * 31)) * 31;
            PlusPayRichText plusPayRichText = this.buttonAdditionalText;
            return hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode());
        }

        @NotNull
        public String toString() {
            return "ClosingOfferAsset(titleText=" + this.titleText + ", icon=" + this.icon + ", buttonText=" + this.buttonText + ", buttonAdditionalText=" + this.buttonAdditionalText + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            this.titleText.writeToParcel(dest, flags);
            dest.writeParcelable(this.icon, flags);
            this.buttonText.writeToParcel(dest, flags);
            PlusPayRichText plusPayRichText = this.buttonAdditionalText;
            if (plusPayRichText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayRichText.writeToParcel(dest, flags);
            }
        }

        public ClosingOfferAsset(@NotNull PlusPayRichText plusPayRichText, @NotNull y yVar, @NotNull PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3) {
            plusPayRichText.getClass();
            yVar.getClass();
            plusPayRichText2.getClass();
            this.titleText = plusPayRichText;
            this.icon = yVar;
            this.buttonText = plusPayRichText2;
            this.buttonAdditionalText = plusPayRichText3;
        }
    }

    public /* synthetic */ PlusPayClosingOffer(int i, y yVar, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusPayCompositeOffers.Offer offer, List list, String str, String str2, PlusPayRichText plusPayRichText3, xhp xhpVar) {
        if (255 != (i & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i, KotlinVersion.MAX_COMPONENT_VALUE, PlusPayClosingOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.backgroundImage = yVar;
        this.titleText = plusPayRichText;
        this.subtitleText = plusPayRichText2;
        this.offer = offer;
        this.assets = list;
        this.acceptButtonText = str;
        this.rejectButtonText = str2;
        this.footerText = plusPayRichText3;
    }
}
