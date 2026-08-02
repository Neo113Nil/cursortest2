package org.altbeacon.beacon;

import defpackage.scc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lorg/altbeacon/beacon/BeaconRegion;", "Lorg/altbeacon/beacon/Region;", "uniqueId", "", "beaconParser", "Lorg/altbeacon/beacon/BeaconParser;", "id1", "id2", "id3", "(Ljava/lang/String;Lorg/altbeacon/beacon/BeaconParser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "macAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "identifiers", "", "Lorg/altbeacon/beacon/Identifier;", "bluetoothAddress", "(Ljava/lang/String;Lorg/altbeacon/beacon/BeaconParser;Ljava/util/List;Ljava/lang/String;)V", "android-beacon-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BeaconRegion extends Region {
    public BeaconRegion(String str, BeaconParser beaconParser, String str2, String str3, String str4) {
        this(str, beaconParser, scc.g(Identifier.b(str2), Identifier.b(str3), Identifier.b(str4)), null);
    }

    public BeaconRegion(String str, BeaconParser beaconParser, List<? extends Identifier> list, String str2) {
        super(str, beaconParser, (List<Identifier>) list, str2, 3);
    }

    public BeaconRegion(String str, String str2) {
        this(str, null, new ArrayList(), str2);
    }
}
