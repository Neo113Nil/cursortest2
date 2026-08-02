package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public class Region implements Parcelable, Serializable {
    private static final String TAG = "Region";
    protected final BeaconParser mBeaconParser;
    protected final String mBluetoothAddress;
    protected final List<Identifier> mIdentifiers;
    protected final String mUniqueId;
    private static final Pattern MAC_PATTERN = Pattern.compile("^[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}$");
    public static final Parcelable.Creator<Region> CREATOR = new Parcelable.Creator<Region>() { // from class: org.altbeacon.beacon.Region.1
        @Override // android.os.Parcelable.Creator
        public Region createFromParcel(Parcel parcel) {
            return new Region(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Region[] newArray(int i) {
            return new Region[i];
        }
    };

    public Region(Parcel parcel) {
        BeaconParser beaconParser;
        this.mUniqueId = parcel.readString();
        this.mBluetoothAddress = parcel.readString();
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString == null) {
                this.mIdentifiers.add(null);
            } else {
                this.mIdentifiers.add(Identifier.b(readString));
            }
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            this.mBeaconParser = null;
            return;
        }
        Pattern pattern = BeaconParser.a;
        String[] split = readString2.split("~");
        if (split.length != 2) {
            beaconParser = new BeaconParser();
            beaconParser.p(readString2);
        } else {
            String str = split[0];
            String str2 = split[1];
            BeaconParser beaconParser2 = new BeaconParser(str);
            beaconParser2.p(str2);
            beaconParser = beaconParser2;
        }
        this.mBeaconParser = beaconParser;
    }

    private void validateMac(String str) throws IllegalArgumentException {
        if (str == null || MAC_PATTERN.matcher(str).matches()) {
            return;
        }
        ny61.g(oyr.p("Invalid mac address: '", str, "' Must be 6 hex bytes separated by colons."));
    }

    @Deprecated
    public Region clone() {
        return new Region(this.mUniqueId, this.mIdentifiers, this.mBluetoothAddress);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return ((Region) obj).mUniqueId.equals(this.mUniqueId);
        }
        return false;
    }

    public String getBluetoothAddress() {
        return this.mBluetoothAddress;
    }

    public Identifier getId1() {
        return getIdentifier(0);
    }

    public Identifier getId2() {
        return getIdentifier(1);
    }

    public Identifier getId3() {
        return getIdentifier(2);
    }

    public Identifier getIdentifier(int i) {
        if (this.mIdentifiers.size() > i) {
            return this.mIdentifiers.get(i);
        }
        return null;
    }

    public List<Identifier> getIdentifiers() {
        return new ArrayList(this.mIdentifiers);
    }

    public String getUniqueId() {
        return this.mUniqueId;
    }

    public boolean hasSameIdentifiers(Region region) {
        if (region.mIdentifiers.size() != this.mIdentifiers.size()) {
            return false;
        }
        for (int i = 0; i < region.mIdentifiers.size(); i++) {
            if (region.getIdentifier(i) == null && getIdentifier(i) != null) {
                return false;
            }
            if (region.getIdentifier(i) != null && getIdentifier(i) == null) {
                return false;
            }
            if ((region.getIdentifier(i) != null || getIdentifier(i) != null) && !region.getIdentifier(i).equals(getIdentifier(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.mUniqueId.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean matchesBeacon(Beacon beacon) {
        String str;
        BeaconParser beaconParser = this.mBeaconParser;
        if (beaconParser != null && (str = beaconParser.mIdentifier) != null && !str.equals(beacon.getParserIdentifier())) {
            return false;
        }
        int size = this.mIdentifiers.size();
        while (true) {
            size--;
            if (size < 0) {
                String str2 = this.mBluetoothAddress;
                return str2 == null || str2.equalsIgnoreCase(beacon.mBluetoothAddress);
            }
            Identifier identifier = this.mIdentifiers.get(size);
            Identifier identifier2 = size < beacon.mIdentifiers.size() ? beacon.getIdentifier(size) : null;
            if ((identifier2 != null || identifier == null) && (identifier2 == null || identifier == null || identifier.equals(identifier2))) {
            }
        }
    }

    public String toString() {
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
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUniqueId);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mIdentifiers.size());
        for (Identifier identifier : this.mIdentifiers) {
            if (identifier != null) {
                parcel.writeString(identifier.toString());
            } else {
                parcel.writeString(null);
            }
        }
        BeaconParser beaconParser = this.mBeaconParser;
        if (beaconParser != null) {
            parcel.writeString(beaconParser.toString());
        } else {
            parcel.writeString(null);
        }
    }

    public Region(String str, List<Identifier> list) {
        this(str, list, null);
    }

    public Region(String str, List<Identifier> list, String str2) {
        validateMac(str2);
        this.mIdentifiers = new ArrayList(list);
        this.mUniqueId = str;
        this.mBluetoothAddress = str2;
        this.mBeaconParser = null;
        if (str != null) {
            return;
        }
        ny61.t("uniqueId may not be null");
        throw null;
    }

    public Region(String str, BeaconParser beaconParser, List<Identifier> list, String str2, int i) {
        validateMac(str2);
        if (list == null) {
            this.mIdentifiers = new ArrayList();
        } else {
            this.mIdentifiers = new ArrayList(list);
        }
        this.mUniqueId = str;
        this.mBluetoothAddress = str2;
        this.mBeaconParser = beaconParser;
        if (str != null) {
            return;
        }
        ny61.t("uniqueId may not be null");
        throw null;
    }

    public Region(String str, BeaconParser beaconParser, Identifier identifier, Identifier identifier2, Identifier identifier3) {
        this(str, beaconParser, new ArrayList(3), (String) null, 3);
        this.mIdentifiers.add(identifier);
        this.mIdentifiers.add(identifier2);
        this.mIdentifiers.add(identifier3);
    }

    public Region(String str, String str2) {
        validateMac(str2);
        this.mBluetoothAddress = str2;
        this.mUniqueId = str;
        this.mIdentifiers = new ArrayList();
        this.mBeaconParser = null;
        if (str != null) {
            return;
        }
        ny61.t("uniqueId may not be null");
        throw null;
    }

    public Region(String str, Identifier identifier, Identifier identifier2, Identifier identifier3) {
        ArrayList arrayList = new ArrayList(3);
        this.mIdentifiers = arrayList;
        arrayList.add(identifier);
        arrayList.add(identifier2);
        arrayList.add(identifier3);
        this.mUniqueId = str;
        this.mBluetoothAddress = null;
        this.mBeaconParser = null;
        if (str != null) {
            return;
        }
        ny61.t("uniqueId may not be null");
        throw null;
    }
}
