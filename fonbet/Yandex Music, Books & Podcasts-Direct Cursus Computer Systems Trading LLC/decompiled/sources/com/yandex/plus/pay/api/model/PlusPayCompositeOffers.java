package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.repository.api.model.webconfig.q;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.ern;
import defpackage.eta;
import defpackage.f1d;
import defpackage.f9f;
import defpackage.j66;
import defpackage.k5r;
import defpackage.mhp;
import defpackage.qdb;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tyo;
import defpackage.u7g;
import defpackage.udb;
import defpackage.vhp;
import defpackage.vz1;
import defpackage.wq5;
import defpackage.wsd;
import defpackage.xhp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers;", "Landroid/os/Parcelable;", "sessionId", "", "offersBatchId", "offers", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getOffersBatchId", "getOffers", "()Ljava/util/List;", "getTarget", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Offer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class PlusPayCompositeOffers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlusPayCompositeOffers> CREATOR = new Creator();

    @NotNull
    private final List<Offer> offers;

    @NotNull
    private final String offersBatchId;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String target;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayCompositeOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOffers createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = k.c(Offer.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayCompositeOffers(readString, readString2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOffers[] newArray(int i) {
            return new PlusPayCompositeOffers[i];
        }
    }

    public PlusPayCompositeOffers(@NotNull String str, @NotNull String str2, @NotNull List<Offer> list, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.sessionId = str;
        this.offersBatchId = str2;
        this.offers = list;
        this.target = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusPayCompositeOffers copy$default(PlusPayCompositeOffers plusPayCompositeOffers, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayCompositeOffers.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = plusPayCompositeOffers.offersBatchId;
        }
        if ((i & 4) != 0) {
            list = plusPayCompositeOffers.offers;
        }
        if ((i & 8) != 0) {
            str3 = plusPayCompositeOffers.target;
        }
        return plusPayCompositeOffers.copy(str, str2, list, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    @NotNull
    public final List<Offer> component3() {
        return this.offers;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final PlusPayCompositeOffers copy(@NotNull String sessionId, @NotNull String offersBatchId, @NotNull List<Offer> offers, @NotNull String target) {
        sessionId.getClass();
        offersBatchId.getClass();
        offers.getClass();
        target.getClass();
        return new PlusPayCompositeOffers(sessionId, offersBatchId, offers, target);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayCompositeOffers)) {
            return false;
        }
        PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) other;
        return Intrinsics.d(this.sessionId, plusPayCompositeOffers.sessionId) && Intrinsics.d(this.offersBatchId, plusPayCompositeOffers.offersBatchId) && Intrinsics.d(this.offers, plusPayCompositeOffers.offers) && Intrinsics.d(this.target, plusPayCompositeOffers.target);
    }

    @NotNull
    public final List<Offer> getOffers() {
        return this.offers;
    }

    @NotNull
    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return this.target.hashCode() + k5r.d(k5r.c(this.sessionId.hashCode() * 31, 31, this.offersBatchId), 31, this.offers);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayCompositeOffers(sessionId=");
        sb.append(this.sessionId);
        sb.append(", offersBatchId=");
        sb.append(this.offersBatchId);
        sb.append(", offers=");
        sb.append(this.offers);
        sb.append(", target=");
        return dfi.i(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.sessionId);
        dest.writeString(this.offersBatchId);
        Iterator n = f1d.n(dest, this.offers);
        while (n.hasNext()) {
            ((Offer) n.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.target);
    }

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 [2\u00020\u0001:\n\\]^_`abcd[Bs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0091\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0090\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010'J\u0010\u0010<\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b<\u0010\u001fJ\u001a\u0010?\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010H\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bM\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010,R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bT\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\b\u0011\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00105R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bX\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u00108¨\u0006e"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "Landroid/os/Parcelable;", "", "positionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "structureType", "activeTariffId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "tariffOffer", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "optionOffers", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "legalInfo", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "invoices", "", "isUpsale", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "assets", "canAttemptSilentPurchase", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "meta", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;Lxhp;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "component3", "component4", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "component5", "()Ljava/util/List;", "component6", "()Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "component7", "component8", "()Z", "component9", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "component10", "component11", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lwq5;Lmhp;)V", "write$Self", "Ljava/lang/String;", "getPositionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "getStructureType", "getActiveTariffId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "getTariffOffer", "Ljava/util/List;", "getOptionOffers", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "getLegalInfo", "getInvoices", "Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "getAssets", "getCanAttemptSilentPurchase", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "getMeta", "Companion", "StructureType", "Tariff", "Option", "Invoice", "Plan", "Vendor", "Assets", "Meta", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    public static final /* data */ class Offer implements Parcelable {

        @NotNull
        private static final arf[] $childSerializers;
        private final String activeTariffId;

        @NotNull
        private final Assets assets;
        private final boolean canAttemptSilentPurchase;

        @NotNull
        private final List<Invoice> invoices;
        private final boolean isUpsale;
        private final PlusPayLegalInfo legalInfo;

        @NotNull
        private final Meta meta;

        @NotNull
        private final List<Option> optionOffers;

        @NotNull
        private final String positionId;

        @NotNull
        private final StructureType structureType;
        private final Tariff tariffOffer;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final t9f serializer() {
                return PlusPayCompositeOffers$Offer$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Creator implements Parcelable.Creator<Offer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Offer createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                String readString = parcel.readString();
                StructureType createFromParcel = StructureType.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                Tariff createFromParcel2 = parcel.readInt() == 0 ? null : Tariff.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = k.c(Option.CREATOR, parcel, arrayList, i, 1);
                }
                PlusPayLegalInfo createFromParcel3 = parcel.readInt() != 0 ? PlusPayLegalInfo.CREATOR.createFromParcel(parcel) : null;
                int readInt2 = parcel.readInt();
                boolean z2 = false;
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = k.c(Invoice.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                Assets createFromParcel4 = Assets.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Offer(readString, createFromParcel, readString2, createFromParcel2, arrayList, createFromParcel3, arrayList2, z2, createFromParcel4, z, Meta.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Offer[] newArray(int i) {
                return new Offer[i];
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;Lwq5;Lmhp;)V", "Companion", "Intro", "IntroUntil", "Trial", "TrialUntil", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static abstract class Plan implements Parcelable {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final arf $cachedSerializer$delegate = btf.a(bwf.b, new q(19));

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ t9f get$cachedSerializer() {
                    return (t9f) Plan.$cachedSerializer$delegate.getValue();
                }

                @NotNull
                public final t9f serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Plan(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _init_$_anonymous_() {
                return new tyo("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Plan", ern.a(Plan.class), new f9f[]{ern.a(Intro.class), ern.a(IntroUntil.class), ern.a(Trial.class), ern.a(TrialUntil.class)}, new t9f[]{PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE}, new Annotation[0]);
            }

            private Plan() {
            }

            public /* synthetic */ Plan(int i, xhp xhpVar) {
            }

            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006*"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "period", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            @vhp
            public static final /* data */ class Trial extends Plan {

                @NotNull
                private final String period;

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                public static final Parcelable.Creator<Trial> CREATOR = new Creator();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final t9f serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Creator implements Parcelable.Creator<Trial> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Trial createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new Trial(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Trial[] newArray(int i) {
                        return new Trial[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Trial(int i, String str, xhp xhpVar) {
                    super(i, xhpVar);
                    if (1 != (i & 1)) {
                        u7g.V(i, 1, PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.period = str;
                }

                public static /* synthetic */ Trial copy$default(Trial trial, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = trial.period;
                    }
                    return trial.copy(str);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(Trial self, wq5 output, mhp serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.p(serialDesc, 0, self.period);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getPeriod() {
                    return this.period;
                }

                @NotNull
                public final Trial copy(@NotNull String period) {
                    period.getClass();
                    return new Trial(period);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Trial) && Intrinsics.d(this.period, ((Trial) other).period);
                }

                @NotNull
                public final String getPeriod() {
                    return this.period;
                }

                public int hashCode() {
                    return this.period.hashCode();
                }

                @NotNull
                public String toString() {
                    return dfi.i(new StringBuilder("Trial(period="), this.period, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    dest.getClass();
                    dest.writeString(this.period);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Trial(@NotNull String str) {
                    super(null);
                    str.getClass();
                    this.period = str;
                }
            }

            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "until", "<init>", "(J)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(IJLxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "copy", "(J)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUntil", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            @vhp
            public static final /* data */ class TrialUntil extends Plan {
                private final long until;

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                public static final Parcelable.Creator<TrialUntil> CREATOR = new Creator();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final t9f serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Creator implements Parcelable.Creator<TrialUntil> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final TrialUntil createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new TrialUntil(parcel.readLong());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final TrialUntil[] newArray(int i) {
                        return new TrialUntil[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ TrialUntil(int i, long j, xhp xhpVar) {
                    super(i, xhpVar);
                    if (1 != (i & 1)) {
                        u7g.V(i, 1, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.until = j;
                }

                public static /* synthetic */ TrialUntil copy$default(TrialUntil trialUntil, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = trialUntil.until;
                    }
                    return trialUntil.copy(j);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(TrialUntil self, wq5 output, mhp serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.g(serialDesc, 0, self.until);
                }

                /* renamed from: component1, reason: from getter */
                public final long getUntil() {
                    return this.until;
                }

                @NotNull
                public final TrialUntil copy(long until) {
                    return new TrialUntil(until);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TrialUntil) && this.until == ((TrialUntil) other).until;
                }

                public final long getUntil() {
                    return this.until;
                }

                public int hashCode() {
                    return Long.hashCode(this.until);
                }

                @NotNull
                public String toString() {
                    return eta.g(new StringBuilder("TrialUntil(until="), this.until, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    dest.getClass();
                    dest.writeLong(this.until);
                }

                public TrialUntil(long j) {
                    super(null);
                    this.until = j;
                }
            }

            @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "until", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;J)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayPrice;JLxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()J", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;J)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "J", "getUntil", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            @vhp
            public static final /* data */ class IntroUntil extends Plan {

                @NotNull
                private final PlusPayPrice price;
                private final long until;

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                public static final Parcelable.Creator<IntroUntil> CREATOR = new Creator();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final t9f serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Creator implements Parcelable.Creator<IntroUntil> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntroUntil createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new IntroUntil((PlusPayPrice) parcel.readParcelable(IntroUntil.class.getClassLoader()), parcel.readLong());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntroUntil[] newArray(int i) {
                        return new IntroUntil[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ IntroUntil(int i, PlusPayPrice plusPayPrice, long j, xhp xhpVar) {
                    super(i, xhpVar);
                    if (3 != (i & 3)) {
                        u7g.V(i, 3, PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.price = plusPayPrice;
                    this.until = j;
                }

                public static /* synthetic */ IntroUntil copy$default(IntroUntil introUntil, PlusPayPrice plusPayPrice, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        plusPayPrice = introUntil.price;
                    }
                    if ((i & 2) != 0) {
                        j = introUntil.until;
                    }
                    return introUntil.copy(plusPayPrice, j);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(IntroUntil self, wq5 output, mhp serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.k(serialDesc, 0, PlusPayPrice$$serializer.INSTANCE, self.price);
                    output.g(serialDesc, 1, self.until);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                /* renamed from: component2, reason: from getter */
                public final long getUntil() {
                    return this.until;
                }

                @NotNull
                public final IntroUntil copy(@NotNull PlusPayPrice price, long until) {
                    price.getClass();
                    return new IntroUntil(price, until);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof IntroUntil)) {
                        return false;
                    }
                    IntroUntil introUntil = (IntroUntil) other;
                    return Intrinsics.d(this.price, introUntil.price) && this.until == introUntil.until;
                }

                @NotNull
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                public final long getUntil() {
                    return this.until;
                }

                public int hashCode() {
                    return Long.hashCode(this.until) + (this.price.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("IntroUntil(price=");
                    sb.append(this.price);
                    sb.append(", until=");
                    return eta.g(sb, this.until, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    dest.getClass();
                    dest.writeParcelable(this.price, flags);
                    dest.writeLong(this.until);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IntroUntil(@NotNull PlusPayPrice plusPayPrice, long j) {
                    super(null);
                    plusPayPrice.getClass();
                    this.price = plusPayPrice;
                    this.until = j;
                }
            }

            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0018¨\u00064"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "period", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "repetitionCount", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;I)V", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ILxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component3", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;I)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "I", "getRepetitionCount", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            @vhp
            public static final /* data */ class Intro extends Plan {

                @NotNull
                private final String period;

                @NotNull
                private final PlusPayPrice price;
                private final int repetitionCount;

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                public static final Parcelable.Creator<Intro> CREATOR = new Creator();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final t9f serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public static final class Creator implements Parcelable.Creator<Intro> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Intro createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new Intro(parcel.readString(), (PlusPayPrice) parcel.readParcelable(Intro.class.getClassLoader()), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Intro[] newArray(int i) {
                        return new Intro[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Intro(int i, String str, PlusPayPrice plusPayPrice, int i2, xhp xhpVar) {
                    super(i, xhpVar);
                    if (7 != (i & 7)) {
                        u7g.V(i, 7, PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.period = str;
                    this.price = plusPayPrice;
                    this.repetitionCount = i2;
                }

                public static /* synthetic */ Intro copy$default(Intro intro, String str, PlusPayPrice plusPayPrice, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = intro.period;
                    }
                    if ((i2 & 2) != 0) {
                        plusPayPrice = intro.price;
                    }
                    if ((i2 & 4) != 0) {
                        i = intro.repetitionCount;
                    }
                    return intro.copy(str, plusPayPrice, i);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(Intro self, wq5 output, mhp serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.p(serialDesc, 0, self.period);
                    output.k(serialDesc, 1, PlusPayPrice$$serializer.INSTANCE, self.price);
                    output.A(2, self.repetitionCount, serialDesc);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getPeriod() {
                    return this.period;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                /* renamed from: component3, reason: from getter */
                public final int getRepetitionCount() {
                    return this.repetitionCount;
                }

                @NotNull
                public final Intro copy(@NotNull String period, @NotNull PlusPayPrice price, int repetitionCount) {
                    period.getClass();
                    price.getClass();
                    return new Intro(period, price, repetitionCount);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Intro)) {
                        return false;
                    }
                    Intro intro = (Intro) other;
                    return Intrinsics.d(this.period, intro.period) && Intrinsics.d(this.price, intro.price) && this.repetitionCount == intro.repetitionCount;
                }

                @NotNull
                public final String getPeriod() {
                    return this.period;
                }

                @NotNull
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                public final int getRepetitionCount() {
                    return this.repetitionCount;
                }

                public int hashCode() {
                    return Integer.hashCode(this.repetitionCount) + ((this.price.hashCode() + (this.period.hashCode() * 31)) * 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("Intro(period=");
                    sb.append(this.period);
                    sb.append(", price=");
                    sb.append(this.price);
                    sb.append(", repetitionCount=");
                    return vz1.r(sb, this.repetitionCount, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    dest.getClass();
                    dest.writeString(this.period);
                    dest.writeParcelable(this.price, flags);
                    dest.writeInt(this.repetitionCount);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Intro(@NotNull String str, @NotNull PlusPayPrice plusPayPrice, int i) {
                    super(null);
                    str.getClass();
                    plusPayPrice.getClass();
                    this.period = str;
                    this.price = plusPayPrice;
                    this.repetitionCount = i;
                }
            }

            public static final /* synthetic */ void write$Self(Plan self, wq5 output, mhp serialDesc) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TARIFF", "OPTION", "COMPOSITE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class StructureType implements Parcelable {
            private static final /* synthetic */ qdb $ENTRIES;
            private static final /* synthetic */ StructureType[] $VALUES;

            @NotNull
            public static final Parcelable.Creator<StructureType> CREATOR;
            public static final StructureType TARIFF = new StructureType("TARIFF", 0);
            public static final StructureType OPTION = new StructureType("OPTION", 1);
            public static final StructureType COMPOSITE = new StructureType("COMPOSITE", 2);

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<StructureType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StructureType createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return StructureType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StructureType[] newArray(int i) {
                    return new StructureType[i];
                }
            }

            private static final /* synthetic */ StructureType[] $values() {
                return new StructureType[]{TARIFF, OPTION, COMPOSITE};
            }

            static {
                StructureType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = j66.Q($values);
                CREATOR = new Creator();
            }

            private StructureType(String str, int i) {
            }

            @NotNull
            public static qdb getEntries() {
                return $ENTRIES;
            }

            public static StructureType valueOf(String str) {
                return (StructureType) Enum.valueOf(StructureType.class, str);
            }

            public static StructureType[] values() {
                return (StructureType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PLAY", "NATIVE", "UNKNOWN", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Vendor implements Parcelable {
            private static final /* synthetic */ qdb $ENTRIES;
            private static final /* synthetic */ Vendor[] $VALUES;

            @NotNull
            public static final Parcelable.Creator<Vendor> CREATOR;
            public static final Vendor GOOGLE_PLAY = new Vendor("GOOGLE_PLAY", 0);
            public static final Vendor NATIVE = new Vendor("NATIVE", 1);
            public static final Vendor UNKNOWN = new Vendor("UNKNOWN", 2);

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Vendor> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Vendor createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return Vendor.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Vendor[] newArray(int i) {
                    return new Vendor[i];
                }
            }

            private static final /* synthetic */ Vendor[] $values() {
                return new Vendor[]{GOOGLE_PLAY, NATIVE, UNKNOWN};
            }

            static {
                Vendor[] $values = $values();
                $VALUES = $values;
                $ENTRIES = j66.Q($values);
                CREATOR = new Creator();
            }

            private Vendor(String str, int i) {
            }

            @NotNull
            public static qdb getEntries() {
                return $ENTRIES;
            }

            public static Vendor valueOf(String str) {
                return (Vendor) Enum.valueOf(Vendor.class, str);
            }

            public static Vendor[] values() {
                return (Vendor[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(name());
            }
        }

        static {
            bwf bwfVar = bwf.b;
            $childSerializers = new arf[]{null, btf.a(bwfVar, new q(13)), null, null, btf.a(bwfVar, new q(14)), null, btf.a(bwfVar, new q(15)), null, null, null, null};
        }

        public Offer(@NotNull String str, @NotNull StructureType structureType, String str2, Tariff tariff, @NotNull List<Option> list, PlusPayLegalInfo plusPayLegalInfo, @NotNull List<Invoice> list2, boolean z, @NotNull Assets assets, boolean z2, @NotNull Meta meta) {
            str.getClass();
            structureType.getClass();
            list.getClass();
            list2.getClass();
            assets.getClass();
            meta.getClass();
            this.positionId = str;
            this.structureType = structureType;
            this.activeTariffId = str2;
            this.tariffOffer = tariff;
            this.optionOffers = list;
            this.legalInfo = plusPayLegalInfo;
            this.invoices = list2;
            this.isUpsale = z;
            this.assets = assets;
            this.canAttemptSilentPurchase = z2;
            this.meta = meta;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t9f _childSerializers$_anonymous_() {
            StructureType[] values = StructureType.values();
            values.getClass();
            return new udb("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.StructureType", values);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ t9f _childSerializers$_anonymous_$0() {
            return new qy0(PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ t9f _childSerializers$_anonymous_$1() {
            return new qy0(PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE, 0);
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, StructureType structureType, String str2, Tariff tariff, List list, PlusPayLegalInfo plusPayLegalInfo, List list2, boolean z, Assets assets, boolean z2, Meta meta, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offer.positionId;
            }
            if ((i & 2) != 0) {
                structureType = offer.structureType;
            }
            if ((i & 4) != 0) {
                str2 = offer.activeTariffId;
            }
            if ((i & 8) != 0) {
                tariff = offer.tariffOffer;
            }
            if ((i & 16) != 0) {
                list = offer.optionOffers;
            }
            if ((i & 32) != 0) {
                plusPayLegalInfo = offer.legalInfo;
            }
            if ((i & 64) != 0) {
                list2 = offer.invoices;
            }
            if ((i & 128) != 0) {
                z = offer.isUpsale;
            }
            if ((i & 256) != 0) {
                assets = offer.assets;
            }
            if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                z2 = offer.canAttemptSilentPurchase;
            }
            if ((i & 1024) != 0) {
                meta = offer.meta;
            }
            boolean z3 = z2;
            Meta meta2 = meta;
            boolean z4 = z;
            Assets assets2 = assets;
            PlusPayLegalInfo plusPayLegalInfo2 = plusPayLegalInfo;
            List list3 = list2;
            List list4 = list;
            String str3 = str2;
            return offer.copy(str, structureType, str3, tariff, list4, plusPayLegalInfo2, list3, z4, assets2, z3, meta2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(Offer self, wq5 output, mhp serialDesc) {
            arf[] arfVarArr = $childSerializers;
            output.p(serialDesc, 0, self.positionId);
            output.k(serialDesc, 1, (t9f) arfVarArr[1].getValue(), self.structureType);
            output.q(serialDesc, 2, tkr.a, self.activeTariffId);
            output.q(serialDesc, 3, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, self.tariffOffer);
            output.k(serialDesc, 4, (t9f) arfVarArr[4].getValue(), self.optionOffers);
            output.q(serialDesc, 5, PlusPayLegalInfo$$serializer.INSTANCE, self.legalInfo);
            output.k(serialDesc, 6, (t9f) arfVarArr[6].getValue(), self.invoices);
            output.j(serialDesc, 7, self.isUpsale);
            output.k(serialDesc, 8, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, self.assets);
            output.j(serialDesc, 9, self.canAttemptSilentPurchase);
            output.k(serialDesc, 10, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE, self.meta);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPositionId() {
            return this.positionId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getCanAttemptSilentPurchase() {
            return this.canAttemptSilentPurchase;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final Meta getMeta() {
            return this.meta;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StructureType getStructureType() {
            return this.structureType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getActiveTariffId() {
            return this.activeTariffId;
        }

        /* renamed from: component4, reason: from getter */
        public final Tariff getTariffOffer() {
            return this.tariffOffer;
        }

        @NotNull
        public final List<Option> component5() {
            return this.optionOffers;
        }

        /* renamed from: component6, reason: from getter */
        public final PlusPayLegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        @NotNull
        public final List<Invoice> component7() {
            return this.invoices;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsUpsale() {
            return this.isUpsale;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final Assets getAssets() {
            return this.assets;
        }

        @NotNull
        public final Offer copy(@NotNull String positionId, @NotNull StructureType structureType, String activeTariffId, Tariff tariffOffer, @NotNull List<Option> optionOffers, PlusPayLegalInfo legalInfo, @NotNull List<Invoice> invoices, boolean isUpsale, @NotNull Assets assets, boolean canAttemptSilentPurchase, @NotNull Meta meta) {
            positionId.getClass();
            structureType.getClass();
            optionOffers.getClass();
            invoices.getClass();
            assets.getClass();
            meta.getClass();
            return new Offer(positionId, structureType, activeTariffId, tariffOffer, optionOffers, legalInfo, invoices, isUpsale, assets, canAttemptSilentPurchase, meta);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return Intrinsics.d(this.positionId, offer.positionId) && this.structureType == offer.structureType && Intrinsics.d(this.activeTariffId, offer.activeTariffId) && Intrinsics.d(this.tariffOffer, offer.tariffOffer) && Intrinsics.d(this.optionOffers, offer.optionOffers) && Intrinsics.d(this.legalInfo, offer.legalInfo) && Intrinsics.d(this.invoices, offer.invoices) && this.isUpsale == offer.isUpsale && Intrinsics.d(this.assets, offer.assets) && this.canAttemptSilentPurchase == offer.canAttemptSilentPurchase && Intrinsics.d(this.meta, offer.meta);
        }

        public final String getActiveTariffId() {
            return this.activeTariffId;
        }

        @NotNull
        public final Assets getAssets() {
            return this.assets;
        }

        public final boolean getCanAttemptSilentPurchase() {
            return this.canAttemptSilentPurchase;
        }

        @NotNull
        public final List<Invoice> getInvoices() {
            return this.invoices;
        }

        public final PlusPayLegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        @NotNull
        public final Meta getMeta() {
            return this.meta;
        }

        @NotNull
        public final List<Option> getOptionOffers() {
            return this.optionOffers;
        }

        @NotNull
        public final String getPositionId() {
            return this.positionId;
        }

        @NotNull
        public final StructureType getStructureType() {
            return this.structureType;
        }

        public final Tariff getTariffOffer() {
            return this.tariffOffer;
        }

        public int hashCode() {
            int hashCode = (this.structureType.hashCode() + (this.positionId.hashCode() * 31)) * 31;
            String str = this.activeTariffId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Tariff tariff = this.tariffOffer;
            int d = k5r.d((hashCode2 + (tariff == null ? 0 : tariff.hashCode())) * 31, 31, this.optionOffers);
            PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
            return this.meta.hashCode() + k5r.e((this.assets.hashCode() + k5r.e(k5r.d((d + (plusPayLegalInfo != null ? plusPayLegalInfo.hashCode() : 0)) * 31, 31, this.invoices), 31, this.isUpsale)) * 31, 31, this.canAttemptSilentPurchase);
        }

        public final boolean isUpsale() {
            return this.isUpsale;
        }

        @NotNull
        public String toString() {
            return "Offer(positionId=" + this.positionId + ", structureType=" + this.structureType + ", activeTariffId=" + this.activeTariffId + ", tariffOffer=" + this.tariffOffer + ", optionOffers=" + this.optionOffers + ", legalInfo=" + this.legalInfo + ", invoices=" + this.invoices + ", isUpsale=" + this.isUpsale + ", assets=" + this.assets + ", canAttemptSilentPurchase=" + this.canAttemptSilentPurchase + ", meta=" + this.meta + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.positionId);
            this.structureType.writeToParcel(dest, flags);
            dest.writeString(this.activeTariffId);
            Tariff tariff = this.tariffOffer;
            if (tariff == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                tariff.writeToParcel(dest, flags);
            }
            Iterator n = f1d.n(dest, this.optionOffers);
            while (n.hasNext()) {
                ((Option) n.next()).writeToParcel(dest, flags);
            }
            PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
            if (plusPayLegalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayLegalInfo.writeToParcel(dest, flags);
            }
            Iterator n2 = f1d.n(dest, this.invoices);
            while (n2.hasNext()) {
                ((Invoice) n2.next()).writeToParcel(dest, flags);
            }
            dest.writeInt(this.isUpsale ? 1 : 0);
            this.assets.writeToParcel(dest, flags);
            dest.writeInt(this.canAttemptSilentPurchase ? 1 : 0);
            this.meta.writeToParcel(dest, flags);
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "Landroid/os/Parcelable;", "", "timestamp", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "<init>", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(IJLcom/yandex/plus/pay/api/model/PlusPayPrice;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "copy", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Invoice implements Parcelable {

            @NotNull
            private final PlusPayPrice price;
            private final long timestamp;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Invoice> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Invoice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Invoice createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Invoice(parcel.readLong(), (PlusPayPrice) parcel.readParcelable(Invoice.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Invoice[] newArray(int i) {
                    return new Invoice[i];
                }
            }

            public /* synthetic */ Invoice(int i, long j, PlusPayPrice plusPayPrice, xhp xhpVar) {
                if (3 != (i & 3)) {
                    u7g.V(i, 3, PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.timestamp = j;
                this.price = plusPayPrice;
            }

            public static /* synthetic */ Invoice copy$default(Invoice invoice, long j, PlusPayPrice plusPayPrice, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = invoice.timestamp;
                }
                if ((i & 2) != 0) {
                    plusPayPrice = invoice.price;
                }
                return invoice.copy(j, plusPayPrice);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Invoice self, wq5 output, mhp serialDesc) {
                output.g(serialDesc, 0, self.timestamp);
                output.k(serialDesc, 1, PlusPayPrice$$serializer.INSTANCE, self.price);
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            @NotNull
            public final Invoice copy(long timestamp, @NotNull PlusPayPrice price) {
                price.getClass();
                return new Invoice(timestamp, price);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Invoice)) {
                    return false;
                }
                Invoice invoice = (Invoice) other;
                return this.timestamp == invoice.timestamp && Intrinsics.d(this.price, invoice.price);
            }

            @NotNull
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return this.price.hashCode() + (Long.hashCode(this.timestamp) * 31);
            }

            @NotNull
            public String toString() {
                return "Invoice(timestamp=" + this.timestamp + ", price=" + this.price + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeLong(this.timestamp);
                dest.writeParcelable(this.price, flags);
            }

            public Invoice(long j, @NotNull PlusPayPrice plusPayPrice) {
                plusPayPrice.getClass();
                this.timestamp = j;
                this.price = plusPayPrice;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "Landroid/os/Parcelable;", "", "buttonText", "buttonTextWithDetails", "subscriptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getButtonText", "getButtonTextWithDetails", "getSubscriptionName", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Assets implements Parcelable {

            @NotNull
            private final String buttonText;

            @NotNull
            private final String buttonTextWithDetails;

            @NotNull
            private final String subscriptionName;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Assets> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Assets> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Assets createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Assets(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Assets[] newArray(int i) {
                    return new Assets[i];
                }
            }

            public /* synthetic */ Assets(int i, String str, String str2, String str3, xhp xhpVar) {
                if (7 != (i & 7)) {
                    u7g.V(i, 7, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.buttonText = str;
                this.buttonTextWithDetails = str2;
                this.subscriptionName = str3;
            }

            public static /* synthetic */ Assets copy$default(Assets assets, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = assets.buttonText;
                }
                if ((i & 2) != 0) {
                    str2 = assets.buttonTextWithDetails;
                }
                if ((i & 4) != 0) {
                    str3 = assets.subscriptionName;
                }
                return assets.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Assets self, wq5 output, mhp serialDesc) {
                output.p(serialDesc, 0, self.buttonText);
                output.p(serialDesc, 1, self.buttonTextWithDetails);
                output.p(serialDesc, 2, self.subscriptionName);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getButtonText() {
                return this.buttonText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getButtonTextWithDetails() {
                return this.buttonTextWithDetails;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getSubscriptionName() {
                return this.subscriptionName;
            }

            @NotNull
            public final Assets copy(@NotNull String buttonText, @NotNull String buttonTextWithDetails, @NotNull String subscriptionName) {
                buttonText.getClass();
                buttonTextWithDetails.getClass();
                subscriptionName.getClass();
                return new Assets(buttonText, buttonTextWithDetails, subscriptionName);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Assets)) {
                    return false;
                }
                Assets assets = (Assets) other;
                return Intrinsics.d(this.buttonText, assets.buttonText) && Intrinsics.d(this.buttonTextWithDetails, assets.buttonTextWithDetails) && Intrinsics.d(this.subscriptionName, assets.subscriptionName);
            }

            @NotNull
            public final String getButtonText() {
                return this.buttonText;
            }

            @NotNull
            public final String getButtonTextWithDetails() {
                return this.buttonTextWithDetails;
            }

            @NotNull
            public final String getSubscriptionName() {
                return this.subscriptionName;
            }

            public int hashCode() {
                return this.subscriptionName.hashCode() + k5r.c(this.buttonText.hashCode() * 31, 31, this.buttonTextWithDetails);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Assets(buttonText=");
                sb.append(this.buttonText);
                sb.append(", buttonTextWithDetails=");
                sb.append(this.buttonTextWithDetails);
                sb.append(", subscriptionName=");
                return dfi.i(sb, this.subscriptionName, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.buttonText);
                dest.writeString(this.buttonTextWithDetails);
                dest.writeString(this.subscriptionName);
            }

            public Assets(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                dfi.s(str, str2, str3);
                this.buttonText = str;
                this.buttonTextWithDetails = str2;
                this.subscriptionName = str3;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "Landroid/os/Parcelable;", "", "sessionId", "productTarget", "offersBatchId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getProductTarget", "getOffersBatchId", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Meta implements Parcelable {

            @NotNull
            private final String offersBatchId;

            @NotNull
            private final String productTarget;

            @NotNull
            private final String sessionId;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Meta> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Meta> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Meta createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Meta(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Meta[] newArray(int i) {
                    return new Meta[i];
                }
            }

            public /* synthetic */ Meta(int i, String str, String str2, String str3, xhp xhpVar) {
                if (7 != (i & 7)) {
                    u7g.V(i, 7, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.sessionId = str;
                this.productTarget = str2;
                this.offersBatchId = str3;
            }

            public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = meta.sessionId;
                }
                if ((i & 2) != 0) {
                    str2 = meta.productTarget;
                }
                if ((i & 4) != 0) {
                    str3 = meta.offersBatchId;
                }
                return meta.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Meta self, wq5 output, mhp serialDesc) {
                output.p(serialDesc, 0, self.sessionId);
                output.p(serialDesc, 1, self.productTarget);
                output.p(serialDesc, 2, self.offersBatchId);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getSessionId() {
                return this.sessionId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getProductTarget() {
                return this.productTarget;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            @NotNull
            public final Meta copy(@NotNull String sessionId, @NotNull String productTarget, @NotNull String offersBatchId) {
                sessionId.getClass();
                productTarget.getClass();
                offersBatchId.getClass();
                return new Meta(sessionId, productTarget, offersBatchId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Meta)) {
                    return false;
                }
                Meta meta = (Meta) other;
                return Intrinsics.d(this.sessionId, meta.sessionId) && Intrinsics.d(this.productTarget, meta.productTarget) && Intrinsics.d(this.offersBatchId, meta.offersBatchId);
            }

            @NotNull
            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            @NotNull
            public final String getProductTarget() {
                return this.productTarget;
            }

            @NotNull
            public final String getSessionId() {
                return this.sessionId;
            }

            public int hashCode() {
                return this.offersBatchId.hashCode() + k5r.c(this.sessionId.hashCode() * 31, 31, this.productTarget);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Meta(sessionId=");
                sb.append(this.sessionId);
                sb.append(", productTarget=");
                sb.append(this.productTarget);
                sb.append(", offersBatchId=");
                return dfi.i(sb, this.offersBatchId, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.sessionId);
                dest.writeString(this.productTarget);
                dest.writeString(this.offersBatchId);
            }

            public Meta(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                dfi.s(str, str2, str3);
                this.sessionId = str;
                this.productTarget = str2;
                this.offersBatchId = str3;
            }
        }

        public /* synthetic */ Offer(int i, String str, StructureType structureType, String str2, Tariff tariff, List list, PlusPayLegalInfo plusPayLegalInfo, List list2, boolean z, Assets assets, boolean z2, Meta meta, xhp xhpVar) {
            if (2047 != (i & 2047)) {
                u7g.V(i, 2047, PlusPayCompositeOffers$Offer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.positionId = str;
            this.structureType = structureType;
            this.activeTariffId = str2;
            this.tariffOffer = tariff;
            this.optionOffers = list;
            this.legalInfo = plusPayLegalInfo;
            this.invoices = list2;
            this.isUpsale = z;
            this.assets = assets;
            this.canAttemptSilentPurchase = z2;
            this.meta = meta;
        }

        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB{\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b5\u0010\u001bJ\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010B\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bH\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010/R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u00101¨\u0006U"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "Landroid/os/Parcelable;", "", ConnectableDevice.KEY_ID, "name", "title", DeviceService.KEY_DESC, "text", "additionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "plans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "vendor", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;Lxhp;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;Lwq5;Lmhp;)V", "write$Self", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Option implements Parcelable {

            @NotNull
            private static final arf[] $childSerializers;
            private final String additionalText;

            @NotNull
            private final String commonPeriod;

            @NotNull
            private final PlusPayPrice commonPrice;
            private final String description;

            @NotNull
            private final String id;

            @NotNull
            private final String name;
            private final Map<String, String> payload;

            @NotNull
            private final List<Plan> plans;
            private final String text;

            @NotNull
            private final String title;

            @NotNull
            private final Vendor vendor;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Option> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Option> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Option createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    PlusPayPrice plusPayPrice = (PlusPayPrice) parcel.readParcelable(Option.class.getClassLoader());
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    for (int i2 = 0; i2 != readInt; i2++) {
                        arrayList.add(parcel.readParcelable(Option.class.getClassLoader()));
                    }
                    Vendor createFromParcel = Vendor.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                        while (i != readInt2) {
                            i = k.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Option(readString, readString2, readString3, readString4, readString5, readString6, plusPayPrice, readString7, arrayList, createFromParcel, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Option[] newArray(int i) {
                    return new Option[i];
                }
            }

            static {
                bwf bwfVar = bwf.b;
                $childSerializers = new arf[]{null, null, null, null, null, null, null, null, btf.a(bwfVar, new q(16)), btf.a(bwfVar, new q(17)), btf.a(bwfVar, new q(18))};
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Option(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, @NotNull PlusPayPrice plusPayPrice, @NotNull String str7, @NotNull List<? extends Plan> list, @NotNull Vendor vendor, Map<String, String> map) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                plusPayPrice.getClass();
                str7.getClass();
                list.getClass();
                vendor.getClass();
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
                return new qy0(Plan.INSTANCE.serializer(), 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final t9f _childSerializers$_anonymous_$0() {
                Vendor[] values = Vendor.values();
                values.getClass();
                return new udb("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Vendor", values);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _childSerializers$_anonymous_$1() {
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            }

            public static /* synthetic */ Option copy$default(Option option, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = option.id;
                }
                if ((i & 2) != 0) {
                    str2 = option.name;
                }
                if ((i & 4) != 0) {
                    str3 = option.title;
                }
                if ((i & 8) != 0) {
                    str4 = option.description;
                }
                if ((i & 16) != 0) {
                    str5 = option.text;
                }
                if ((i & 32) != 0) {
                    str6 = option.additionalText;
                }
                if ((i & 64) != 0) {
                    plusPayPrice = option.commonPrice;
                }
                if ((i & 128) != 0) {
                    str7 = option.commonPeriod;
                }
                if ((i & 256) != 0) {
                    list = option.plans;
                }
                if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    vendor = option.vendor;
                }
                if ((i & 1024) != 0) {
                    map = option.payload;
                }
                Vendor vendor2 = vendor;
                Map map2 = map;
                String str8 = str7;
                List list2 = list;
                String str9 = str6;
                PlusPayPrice plusPayPrice2 = plusPayPrice;
                String str10 = str5;
                String str11 = str3;
                return option.copy(str, str2, str11, str4, str10, str9, plusPayPrice2, str8, list2, vendor2, map2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Option self, wq5 output, mhp serialDesc) {
                arf[] arfVarArr = $childSerializers;
                output.p(serialDesc, 0, self.id);
                output.p(serialDesc, 1, self.name);
                output.p(serialDesc, 2, self.title);
                tkr tkrVar = tkr.a;
                output.q(serialDesc, 3, tkrVar, self.description);
                output.q(serialDesc, 4, tkrVar, self.text);
                output.q(serialDesc, 5, tkrVar, self.additionalText);
                output.k(serialDesc, 6, PlusPayPrice$$serializer.INSTANCE, self.commonPrice);
                output.p(serialDesc, 7, self.commonPeriod);
                output.k(serialDesc, 8, (t9f) arfVarArr[8].getValue(), self.plans);
                output.k(serialDesc, 9, (t9f) arfVarArr[9].getValue(), self.vendor);
                output.q(serialDesc, 10, (t9f) arfVarArr[10].getValue(), self.payload);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Vendor getVendor() {
                return this.vendor;
            }

            public final Map<String, String> component11() {
                return this.payload;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component5, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component6, reason: from getter */
            public final String getAdditionalText() {
                return this.additionalText;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            @NotNull
            public final List<Plan> component9() {
                return this.plans;
            }

            @NotNull
            public final Option copy(@NotNull String id, @NotNull String name, @NotNull String title, String description, String text, String additionalText, @NotNull PlusPayPrice commonPrice, @NotNull String commonPeriod, @NotNull List<? extends Plan> plans, @NotNull Vendor vendor, Map<String, String> payload) {
                id.getClass();
                name.getClass();
                title.getClass();
                commonPrice.getClass();
                commonPeriod.getClass();
                plans.getClass();
                vendor.getClass();
                return new Option(id, name, title, description, text, additionalText, commonPrice, commonPeriod, plans, vendor, payload);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return Intrinsics.d(this.id, option.id) && Intrinsics.d(this.name, option.name) && Intrinsics.d(this.title, option.title) && Intrinsics.d(this.description, option.description) && Intrinsics.d(this.text, option.text) && Intrinsics.d(this.additionalText, option.additionalText) && Intrinsics.d(this.commonPrice, option.commonPrice) && Intrinsics.d(this.commonPeriod, option.commonPeriod) && Intrinsics.d(this.plans, option.plans) && this.vendor == option.vendor && Intrinsics.d(this.payload, option.payload);
            }

            public final String getAdditionalText() {
                return this.additionalText;
            }

            @NotNull
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            @NotNull
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public final Map<String, String> getPayload() {
                return this.payload;
            }

            @NotNull
            public final List<Plan> getPlans() {
                return this.plans;
            }

            public final String getText() {
                return this.text;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final Vendor getVendor() {
                return this.vendor;
            }

            public int hashCode() {
                int c = k5r.c(k5r.c(this.id.hashCode() * 31, 31, this.name), 31, this.title);
                String str = this.description;
                int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.text;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.additionalText;
                int hashCode3 = (this.vendor.hashCode() + k5r.d(k5r.c((this.commonPrice.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.commonPeriod), 31, this.plans)) * 31;
                Map<String, String> map = this.payload;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Option(id=");
                sb.append(this.id);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", additionalText=");
                sb.append(this.additionalText);
                sb.append(", commonPrice=");
                sb.append(this.commonPrice);
                sb.append(", commonPeriod=");
                sb.append(this.commonPeriod);
                sb.append(", plans=");
                sb.append(this.plans);
                sb.append(", vendor=");
                sb.append(this.vendor);
                sb.append(", payload=");
                return k5r.p(sb, this.payload, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.id);
                dest.writeString(this.name);
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.text);
                dest.writeString(this.additionalText);
                dest.writeParcelable(this.commonPrice, flags);
                dest.writeString(this.commonPeriod);
                Iterator n = f1d.n(dest, this.plans);
                while (n.hasNext()) {
                    dest.writeParcelable((Parcelable) n.next(), flags);
                }
                this.vendor.writeToParcel(dest, flags);
                Map<String, String> map = this.payload;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
            }

            public /* synthetic */ Option(int i, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, xhp xhpVar) {
                if (2047 != (i & 2047)) {
                    u7g.V(i, 2047, PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }
        }

        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB{\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b5\u0010\u001bJ\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010B\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bH\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010/R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u00101¨\u0006U"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "Landroid/os/Parcelable;", "", ConnectableDevice.KEY_ID, "name", "title", DeviceService.KEY_DESC, "text", "additionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "plans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "vendor", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;Lxhp;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Lwq5;Lmhp;)V", "write$Self", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Tariff implements Parcelable {

            @NotNull
            private static final arf[] $childSerializers;
            private final String additionalText;

            @NotNull
            private final String commonPeriod;

            @NotNull
            private final PlusPayPrice commonPrice;
            private final String description;

            @NotNull
            private final String id;

            @NotNull
            private final String name;
            private final Map<String, String> payload;

            @NotNull
            private final List<Plan> plans;
            private final String text;

            @NotNull
            private final String title;

            @NotNull
            private final Vendor vendor;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Tariff> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Tariff> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tariff createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    PlusPayPrice plusPayPrice = (PlusPayPrice) parcel.readParcelable(Tariff.class.getClassLoader());
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    for (int i2 = 0; i2 != readInt; i2++) {
                        arrayList.add(parcel.readParcelable(Tariff.class.getClassLoader()));
                    }
                    Vendor createFromParcel = Vendor.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                        while (i != readInt2) {
                            i = k.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Tariff(readString, readString2, readString3, readString4, readString5, readString6, plusPayPrice, readString7, arrayList, createFromParcel, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tariff[] newArray(int i) {
                    return new Tariff[i];
                }
            }

            static {
                bwf bwfVar = bwf.b;
                $childSerializers = new arf[]{null, null, null, null, null, null, null, null, btf.a(bwfVar, new q(20)), btf.a(bwfVar, new q(21)), btf.a(bwfVar, new q(22))};
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Tariff(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, @NotNull PlusPayPrice plusPayPrice, @NotNull String str7, @NotNull List<? extends Plan> list, @NotNull Vendor vendor, Map<String, String> map) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                plusPayPrice.getClass();
                str7.getClass();
                list.getClass();
                vendor.getClass();
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
                return new qy0(Plan.INSTANCE.serializer(), 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final t9f _childSerializers$_anonymous_$0() {
                Vendor[] values = Vendor.values();
                values.getClass();
                return new udb("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Vendor", values);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _childSerializers$_anonymous_$1() {
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            }

            public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tariff.id;
                }
                if ((i & 2) != 0) {
                    str2 = tariff.name;
                }
                if ((i & 4) != 0) {
                    str3 = tariff.title;
                }
                if ((i & 8) != 0) {
                    str4 = tariff.description;
                }
                if ((i & 16) != 0) {
                    str5 = tariff.text;
                }
                if ((i & 32) != 0) {
                    str6 = tariff.additionalText;
                }
                if ((i & 64) != 0) {
                    plusPayPrice = tariff.commonPrice;
                }
                if ((i & 128) != 0) {
                    str7 = tariff.commonPeriod;
                }
                if ((i & 256) != 0) {
                    list = tariff.plans;
                }
                if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    vendor = tariff.vendor;
                }
                if ((i & 1024) != 0) {
                    map = tariff.payload;
                }
                Vendor vendor2 = vendor;
                Map map2 = map;
                String str8 = str7;
                List list2 = list;
                String str9 = str6;
                PlusPayPrice plusPayPrice2 = plusPayPrice;
                String str10 = str5;
                String str11 = str3;
                return tariff.copy(str, str2, str11, str4, str10, str9, plusPayPrice2, str8, list2, vendor2, map2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Tariff self, wq5 output, mhp serialDesc) {
                arf[] arfVarArr = $childSerializers;
                output.p(serialDesc, 0, self.id);
                output.p(serialDesc, 1, self.name);
                output.p(serialDesc, 2, self.title);
                tkr tkrVar = tkr.a;
                output.q(serialDesc, 3, tkrVar, self.description);
                output.q(serialDesc, 4, tkrVar, self.text);
                output.q(serialDesc, 5, tkrVar, self.additionalText);
                output.k(serialDesc, 6, PlusPayPrice$$serializer.INSTANCE, self.commonPrice);
                output.p(serialDesc, 7, self.commonPeriod);
                output.k(serialDesc, 8, (t9f) arfVarArr[8].getValue(), self.plans);
                output.k(serialDesc, 9, (t9f) arfVarArr[9].getValue(), self.vendor);
                output.q(serialDesc, 10, (t9f) arfVarArr[10].getValue(), self.payload);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Vendor getVendor() {
                return this.vendor;
            }

            public final Map<String, String> component11() {
                return this.payload;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component5, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component6, reason: from getter */
            public final String getAdditionalText() {
                return this.additionalText;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            @NotNull
            public final List<Plan> component9() {
                return this.plans;
            }

            @NotNull
            public final Tariff copy(@NotNull String id, @NotNull String name, @NotNull String title, String description, String text, String additionalText, @NotNull PlusPayPrice commonPrice, @NotNull String commonPeriod, @NotNull List<? extends Plan> plans, @NotNull Vendor vendor, Map<String, String> payload) {
                id.getClass();
                name.getClass();
                title.getClass();
                commonPrice.getClass();
                commonPeriod.getClass();
                plans.getClass();
                vendor.getClass();
                return new Tariff(id, name, title, description, text, additionalText, commonPrice, commonPeriod, plans, vendor, payload);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tariff)) {
                    return false;
                }
                Tariff tariff = (Tariff) other;
                return Intrinsics.d(this.id, tariff.id) && Intrinsics.d(this.name, tariff.name) && Intrinsics.d(this.title, tariff.title) && Intrinsics.d(this.description, tariff.description) && Intrinsics.d(this.text, tariff.text) && Intrinsics.d(this.additionalText, tariff.additionalText) && Intrinsics.d(this.commonPrice, tariff.commonPrice) && Intrinsics.d(this.commonPeriod, tariff.commonPeriod) && Intrinsics.d(this.plans, tariff.plans) && this.vendor == tariff.vendor && Intrinsics.d(this.payload, tariff.payload);
            }

            public final String getAdditionalText() {
                return this.additionalText;
            }

            @NotNull
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            @NotNull
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public final Map<String, String> getPayload() {
                return this.payload;
            }

            @NotNull
            public final List<Plan> getPlans() {
                return this.plans;
            }

            public final String getText() {
                return this.text;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final Vendor getVendor() {
                return this.vendor;
            }

            public int hashCode() {
                int c = k5r.c(k5r.c(this.id.hashCode() * 31, 31, this.name), 31, this.title);
                String str = this.description;
                int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.text;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.additionalText;
                int hashCode3 = (this.vendor.hashCode() + k5r.d(k5r.c((this.commonPrice.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.commonPeriod), 31, this.plans)) * 31;
                Map<String, String> map = this.payload;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Tariff(id=");
                sb.append(this.id);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", additionalText=");
                sb.append(this.additionalText);
                sb.append(", commonPrice=");
                sb.append(this.commonPrice);
                sb.append(", commonPeriod=");
                sb.append(this.commonPeriod);
                sb.append(", plans=");
                sb.append(this.plans);
                sb.append(", vendor=");
                sb.append(this.vendor);
                sb.append(", payload=");
                return k5r.p(sb, this.payload, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.id);
                dest.writeString(this.name);
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.text);
                dest.writeString(this.additionalText);
                dest.writeParcelable(this.commonPrice, flags);
                dest.writeString(this.commonPeriod);
                Iterator n = f1d.n(dest, this.plans);
                while (n.hasNext()) {
                    dest.writeParcelable((Parcelable) n.next(), flags);
                }
                this.vendor.writeToParcel(dest, flags);
                Map<String, String> map = this.payload;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
            }

            public /* synthetic */ Tariff(int i, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, xhp xhpVar) {
                if (2047 != (i & 2047)) {
                    u7g.V(i, 2047, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }
        }
    }
}
