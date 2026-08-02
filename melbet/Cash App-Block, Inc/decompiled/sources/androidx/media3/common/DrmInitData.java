package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new AnonymousClass1(0);
    public int hashCode;
    public final int schemeDataCount;
    public final SchemeData[] schemeDatas;
    public final String schemeType;

    /* renamed from: androidx.media3.common.DrmInitData$1, reason: invalid class name */
    public final class AnonymousClass1 implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    return new DrmInitData(parcel);
                default:
                    return new SchemeData(parcel);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new DrmInitData[i];
                default:
                    return new SchemeData[i];
            }
        }
    }

    public DrmInitData(Parcel parcel) {
        this.schemeType = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        String str = Util.DEVICE_DEBUG_INFO;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = C.UUID_NIL;
        return uuid.equals(schemeData.uuid) ? uuid.equals(schemeData2.uuid) ? 0 : 1 : schemeData.uuid.compareTo(schemeData2.uuid);
    }

    public final DrmInitData copyWithSchemeType(String str) {
        return Objects.equals(this.schemeType, str) ? this : new DrmInitData(str, false, this.schemeDatas);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.schemeType, drmInitData.schemeType) && Arrays.equals(this.schemeDatas, drmInitData.schemeDatas)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new AnonymousClass1(1);
        public final byte[] data;
        public int hashCode;
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        public SchemeData(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            String readString = parcel.readString();
            String str = Util.DEVICE_DEBUG_INFO;
            this.mimeType = readString;
            this.data = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.licenseServerUrl, schemeData.licenseServerUrl) && Objects.equals(this.mimeType, schemeData.mimeType) && Objects.equals(this.uuid, schemeData.uuid) && Arrays.equals(this.data, schemeData.data);
        }

        public final int hashCode() {
            if (this.hashCode == 0) {
                int hashCode = this.uuid.hashCode() * 31;
                String str = this.licenseServerUrl;
                this.hashCode = Arrays.hashCode(this.data) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.mimeType);
            }
            return this.hashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.uuid;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.uuid = uuid;
            this.licenseServerUrl = str;
            str2.getClass();
            this.mimeType = MimeTypes.normalizeMimeType(str2);
            this.data = bArr;
        }
    }
}
