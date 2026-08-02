package ru.yandex.yandexmaps.multiplatform.core.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nzs;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/core/geometry/CommonSpan;", "Lru/yandex/yandexmaps/multiplatform/core/geometry/Span;", "", "latDelta", "lonDelta", "<init>", "(DD)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()D", "component2", "copy", "(DD)Lru/yandex/yandexmaps/multiplatform/core/geometry/CommonSpan;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_REQUEST_D, "getLatDelta", "getLonDelta", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class CommonSpan implements Span {
    public static final Parcelable.Creator<CommonSpan> CREATOR = new Creator();
    private final double latDelta;
    private final double lonDelta;

    public CommonSpan(double d, double d2) {
        this.latDelta = d;
        this.lonDelta = d2;
    }

    public static /* synthetic */ CommonSpan copy$default(CommonSpan commonSpan, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = commonSpan.latDelta;
        }
        if ((i & 2) != 0) {
            d2 = commonSpan.lonDelta;
        }
        return commonSpan.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatDelta() {
        return this.latDelta;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLonDelta() {
        return this.lonDelta;
    }

    public final CommonSpan copy(double latDelta, double lonDelta) {
        return new CommonSpan(latDelta, lonDelta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSpan)) {
            return false;
        }
        CommonSpan commonSpan = (CommonSpan) other;
        return Double.compare(this.latDelta, commonSpan.latDelta) == 0 && Double.compare(this.lonDelta, commonSpan.lonDelta) == 0;
    }

    @Override // ru.yandex.yandexmaps.multiplatform.core.geometry.Span
    public double getLatDelta() {
        return this.latDelta;
    }

    @Override // ru.yandex.yandexmaps.multiplatform.core.geometry.Span
    public double getLonDelta() {
        return this.lonDelta;
    }

    public int hashCode() {
        return Double.hashCode(this.lonDelta) + (Double.hashCode(this.latDelta) * 31);
    }

    public String toString() {
        double d = this.latDelta;
        return nzs.c(oyr.u(d, "CommonSpan(latDelta=", ", lonDelta="), this.lonDelta, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.latDelta);
        dest.writeDouble(this.lonDelta);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonSpan> {
        @Override // android.os.Parcelable.Creator
        public final CommonSpan createFromParcel(Parcel parcel) {
            return new CommonSpan(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonSpan[] newArray(int i) {
            return new CommonSpan[i];
        }
    }
}
