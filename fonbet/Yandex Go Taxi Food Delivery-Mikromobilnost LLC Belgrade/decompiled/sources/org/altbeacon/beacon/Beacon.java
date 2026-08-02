package org.altbeacon.beacon;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ki5;
import defpackage.li5;
import defpackage.n;
import defpackage.uj;
import defpackage.vl60;
import defpackage.xgz;
import defpackage.y1k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class Beacon implements Parcelable, Serializable {
    private static final String TAG = "Beacon";
    protected static y1k sDistanceCalculator;
    protected int mBeaconTypeCode;
    protected String mBluetoothAddress;
    protected String mBluetoothName;
    protected List<Long> mDataFields;
    protected Double mDistance;
    protected List<Long> mExtraDataFields;
    protected long mFirstCycleDetectionTimestamp;
    protected List<Identifier> mIdentifiers;
    protected long mLastCycleDetectionTimestamp;
    protected byte[] mLastPacketRawBytes;
    protected int mManufacturer;
    protected boolean mMultiFrameBeacon;
    private int mPacketCount;
    protected String mParserIdentifier;
    protected int mRssi;
    private int mRssiMeasurementCount;
    private Double mRunningAverageRssi;
    protected int mServiceUuid;
    protected byte[] mServiceUuid128Bit;
    protected int mTxPower;
    private static final List<Long> UNMODIFIABLE_LIST_OF_LONG = Collections.unmodifiableList(new ArrayList());
    private static final List<Identifier> UNMODIFIABLE_LIST_OF_IDENTIFIER = Collections.unmodifiableList(new ArrayList());
    protected static boolean sHardwareEqualityEnforced = false;
    protected static ki5 beaconDataFactory = new vl60();

    @Deprecated
    public static final Parcelable.Creator<Beacon> CREATOR = new Parcelable.Creator<Beacon>() { // from class: org.altbeacon.beacon.Beacon.1
        @Override // android.os.Parcelable.Creator
        public Beacon createFromParcel(Parcel parcel) {
            return new Beacon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Beacon[] newArray(int i) {
            return new Beacon[i];
        }
    };

    @Deprecated
    public Beacon(Parcel parcel) {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0L;
        this.mLastCycleDetectionTimestamp = 0L;
        this.mLastPacketRawBytes = new byte[0];
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.mIdentifiers.add(Identifier.b(parcel.readString()));
        }
        this.mDistance = Double.valueOf(parcel.readDouble());
        this.mRssi = parcel.readInt();
        this.mTxPower = parcel.readInt();
        this.mBluetoothAddress = parcel.readString();
        this.mBeaconTypeCode = parcel.readInt();
        this.mServiceUuid = parcel.readInt();
        if (parcel.readBoolean()) {
            this.mServiceUuid128Bit = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                this.mServiceUuid128Bit[i2] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        this.mDataFields = new ArrayList(readInt2);
        for (int i3 = 0; i3 < readInt2; i3++) {
            this.mDataFields.add(Long.valueOf(parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        this.mExtraDataFields = new ArrayList(readInt3);
        for (int i4 = 0; i4 < readInt3; i4++) {
            this.mExtraDataFields.add(Long.valueOf(parcel.readLong()));
        }
        this.mManufacturer = parcel.readInt();
        this.mBluetoothName = parcel.readString();
        this.mParserIdentifier = parcel.readString();
        this.mMultiFrameBeacon = parcel.readByte() != 0;
        this.mRunningAverageRssi = (Double) parcel.readValue(null);
        this.mRssiMeasurementCount = parcel.readInt();
        this.mPacketCount = parcel.readInt();
        this.mFirstCycleDetectionTimestamp = parcel.readLong();
        this.mLastCycleDetectionTimestamp = parcel.readLong();
        int i5 = xgz.a;
        byte[] bArr = new byte[62];
        try {
            parcel.readByteArray(bArr);
        } catch (RuntimeException unused) {
            for (int i6 = 0; i6 < 62; i6++) {
                try {
                    byte readByte = parcel.readByte();
                    bArr[readByte] = readByte;
                } catch (RuntimeException unused2) {
                }
            }
        }
        this.mLastPacketRawBytes = bArr;
    }

    public static Double calculateDistance(int i, double d) {
        getDistanceCalculator();
        return Double.valueOf(-1.0d);
    }

    public static y1k getDistanceCalculator() {
        return null;
    }

    @Deprecated
    public static boolean getHardwareEqualityEnforced() {
        return sHardwareEqualityEnforced;
    }

    public static void setDistanceCalculator(y1k y1kVar) {
    }

    public static void setDistanceCalculatorInternal(y1k y1kVar) {
    }

    @Deprecated
    public static void setHardwareEqualityEnforced(boolean z) {
        sHardwareEqualityEnforced = z;
    }

    private StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder();
        Iterator<Identifier> it = this.mIdentifiers.iterator();
        int i = 1;
        while (it.hasNext()) {
            Identifier next = it.next();
            if (i > 1) {
                sb.append(" ");
            }
            n.A(sb, "id", i, Extension.COLON_SPACE);
            sb.append(next == null ? "null" : next.toString());
            i++;
        }
        if (this.mParserIdentifier != null) {
            sb.append(" type " + this.mParserIdentifier);
        }
        return sb;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Beacon)) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        if (!this.mIdentifiers.equals(beacon.mIdentifiers)) {
            return false;
        }
        if (sHardwareEqualityEnforced) {
            return getBluetoothAddress().equals(beacon.getBluetoothAddress());
        }
        return true;
    }

    public int getBeaconTypeCode() {
        return this.mBeaconTypeCode;
    }

    public String getBluetoothAddress() {
        return this.mBluetoothAddress;
    }

    public String getBluetoothName() {
        return this.mBluetoothName;
    }

    public List<Long> getDataFields() {
        boolean isInstance = this.mDataFields.getClass().isInstance(UNMODIFIABLE_LIST_OF_LONG);
        List<Long> list = this.mDataFields;
        return isInstance ? list : Collections.unmodifiableList(list);
    }

    public double getDistance() {
        if (this.mDistance == null) {
            double d = this.mRssi;
            Double d2 = this.mRunningAverageRssi;
            if (d2 != null) {
                d = d2.doubleValue();
            }
            this.mDistance = calculateDistance(this.mTxPower, d);
        }
        return this.mDistance.doubleValue();
    }

    public List<Long> getExtraDataFields() {
        boolean isInstance = this.mExtraDataFields.getClass().isInstance(UNMODIFIABLE_LIST_OF_LONG);
        List<Long> list = this.mExtraDataFields;
        return isInstance ? list : Collections.unmodifiableList(list);
    }

    public long getFirstCycleDetectionTimestamp() {
        return this.mFirstCycleDetectionTimestamp;
    }

    public Identifier getId1() {
        return this.mIdentifiers.get(0);
    }

    public Identifier getId2() {
        return this.mIdentifiers.get(1);
    }

    public Identifier getId3() {
        return this.mIdentifiers.get(2);
    }

    public Identifier getIdentifier(int i) {
        return this.mIdentifiers.get(i);
    }

    public List<Identifier> getIdentifiers() {
        boolean isInstance = this.mIdentifiers.getClass().isInstance(UNMODIFIABLE_LIST_OF_IDENTIFIER);
        List<Identifier> list = this.mIdentifiers;
        return isInstance ? list : Collections.unmodifiableList(list);
    }

    public long getLastCycleDetectionTimestamp() {
        return this.mLastCycleDetectionTimestamp;
    }

    public byte[] getLastPacketRawBytes() {
        return this.mLastPacketRawBytes;
    }

    public int getManufacturer() {
        return this.mManufacturer;
    }

    public int getMeasurementCount() {
        return this.mRssiMeasurementCount;
    }

    public int getPacketCount() {
        return this.mPacketCount;
    }

    public String getParserIdentifier() {
        return this.mParserIdentifier;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public double getRunningAverageRssi() {
        Double d = this.mRunningAverageRssi;
        return d != null ? d.doubleValue() : this.mRssi;
    }

    public int getServiceUuid() {
        return this.mServiceUuid;
    }

    public byte[] getServiceUuid128Bit() {
        return this.mServiceUuid128Bit;
    }

    public int getTxPower() {
        return this.mTxPower;
    }

    public int hashCode() {
        StringBuilder stringBuilder = toStringBuilder();
        if (sHardwareEqualityEnforced) {
            stringBuilder.append(this.mBluetoothAddress);
        }
        return stringBuilder.toString().hashCode();
    }

    public boolean isExtraBeaconData() {
        return this.mIdentifiers.size() == 0 && this.mDataFields.size() != 0;
    }

    public boolean isMultiFrameBeacon() {
        return this.mMultiFrameBeacon;
    }

    public void requestData(li5 li5Var) {
        ((vl60) beaconDataFactory).getClass();
        new Handler().post(new uj(27));
    }

    public void setExtraDataFields(List<Long> list) {
        this.mExtraDataFields = list;
    }

    public void setFirstCycleDetectionTimestamp(long j) {
        this.mFirstCycleDetectionTimestamp = j;
    }

    public void setLastCycleDetectionTimestamp(long j) {
        this.mLastCycleDetectionTimestamp = j;
    }

    public void setLastPacketRawBytes(byte[] bArr) {
        this.mLastPacketRawBytes = bArr;
    }

    public void setPacketCount(int i) {
        this.mPacketCount = i;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setRssiMeasurementCount(int i) {
        this.mRssiMeasurementCount = i;
    }

    public void setRunningAverageRssi(double d) {
        this.mRunningAverageRssi = Double.valueOf(d);
        this.mDistance = null;
    }

    public String toString() {
        return toStringBuilder().toString();
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mIdentifiers.size());
        Iterator<Identifier> it = this.mIdentifiers.iterator();
        while (it.hasNext()) {
            Identifier next = it.next();
            parcel.writeString(next == null ? null : next.toString());
        }
        parcel.writeDouble(getDistance());
        parcel.writeInt(this.mRssi);
        parcel.writeInt(this.mTxPower);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mBeaconTypeCode);
        parcel.writeInt(this.mServiceUuid);
        parcel.writeBoolean(this.mServiceUuid128Bit.length != 0);
        if (this.mServiceUuid128Bit.length != 0) {
            for (int i2 = 0; i2 < 16; i2++) {
                parcel.writeByte(this.mServiceUuid128Bit[i2]);
            }
        }
        parcel.writeInt(this.mDataFields.size());
        Iterator<Long> it2 = this.mDataFields.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
        parcel.writeInt(this.mExtraDataFields.size());
        Iterator<Long> it3 = this.mExtraDataFields.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(it3.next().longValue());
        }
        parcel.writeInt(this.mManufacturer);
        parcel.writeString(this.mBluetoothName);
        parcel.writeString(this.mParserIdentifier);
        parcel.writeByte(this.mMultiFrameBeacon ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.mRunningAverageRssi);
        parcel.writeInt(this.mRssiMeasurementCount);
        parcel.writeInt(this.mPacketCount);
        parcel.writeLong(this.mFirstCycleDetectionTimestamp);
        parcel.writeLong(this.mLastCycleDetectionTimestamp);
        byte[] bArr = this.mLastPacketRawBytes;
        int length = bArr.length;
        if (length > 62) {
            length = 62;
        }
        parcel.writeByteArray(bArr, 0, length);
        while (length < 62) {
            parcel.writeByte((byte) 0);
            length++;
        }
    }

    @Deprecated
    public double getRunningAverageRssi(double d) {
        this.mRunningAverageRssi = Double.valueOf(d);
        return d;
    }

    public Beacon(Beacon beacon) {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0L;
        this.mLastCycleDetectionTimestamp = 0L;
        this.mLastPacketRawBytes = new byte[0];
        this.mIdentifiers = new ArrayList(beacon.mIdentifiers);
        this.mDataFields = new ArrayList(beacon.mDataFields);
        this.mExtraDataFields = new ArrayList(beacon.mExtraDataFields);
        this.mDistance = beacon.mDistance;
        this.mRunningAverageRssi = beacon.mRunningAverageRssi;
        this.mPacketCount = beacon.mPacketCount;
        this.mRssiMeasurementCount = beacon.mRssiMeasurementCount;
        this.mRssi = beacon.mRssi;
        this.mTxPower = beacon.mTxPower;
        this.mBluetoothAddress = beacon.mBluetoothAddress;
        this.mBeaconTypeCode = beacon.getBeaconTypeCode();
        this.mServiceUuid = beacon.getServiceUuid();
        this.mServiceUuid128Bit = beacon.getServiceUuid128Bit();
        this.mBluetoothName = beacon.mBluetoothName;
        this.mParserIdentifier = beacon.mParserIdentifier;
        this.mMultiFrameBeacon = beacon.mMultiFrameBeacon;
        this.mManufacturer = beacon.mManufacturer;
        this.mFirstCycleDetectionTimestamp = beacon.mFirstCycleDetectionTimestamp;
        this.mLastCycleDetectionTimestamp = beacon.mLastCycleDetectionTimestamp;
        this.mLastPacketRawBytes = beacon.mLastPacketRawBytes;
    }

    public Beacon() {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0L;
        this.mLastCycleDetectionTimestamp = 0L;
        this.mLastPacketRawBytes = new byte[0];
        this.mIdentifiers = new ArrayList(1);
        this.mDataFields = new ArrayList(1);
        this.mExtraDataFields = new ArrayList(1);
    }
}
