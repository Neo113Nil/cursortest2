package ru.yandex.taxi.masstransit.geopayment.network;

import defpackage.ah40;
import defpackage.bk40;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.network.g;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/MtVehiclesResponse;", "", "Companion", "bk40", "BLEItem", "ak40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MtVehiclesResponse {
    public static final bk40 Companion = new bk40();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(6))};
    public static final MtVehiclesResponse c = new MtVehiclesResponse(0);
    public final List a;

    public /* synthetic */ MtVehiclesResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MtVehiclesResponse) && jl40.l(this.a, ((MtVehiclesResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtVehiclesResponse(bleItems=", Extension.C_BRAKE, this.a);
    }

    public MtVehiclesResponse() {
        this(0);
    }

    public MtVehiclesResponse(List list) {
        this.a = list;
    }

    public /* synthetic */ MtVehiclesResponse(int i) {
        this(EmptyList.a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/MtVehiclesResponse$BLEItem;", "", "Companion", "TransportType", "ru/yandex/taxi/masstransit/geopayment/network/h", "ru/yandex/taxi/masstransit/geopayment/network/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BLEItem {
        public static final i Companion = new i();
        public static final i3y[] g = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(7)), null, null, null};
        public final String a;
        public final d b;
        public final TransportType c;
        public final String d;
        public final g.a e;
        public final Object f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/MtVehiclesResponse$BLEItem$TransportType;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/network/j", "Bus", "Trolley", "Tram", "Water", "Electrobus", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class TransportType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TransportType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final TransportType Bus;
            public static final j Companion;
            public static final TransportType Electrobus;
            public static final TransportType Tram;
            public static final TransportType Trolley;
            public static final TransportType Water;

            static {
                TransportType transportType = new TransportType("Bus", 0);
                Bus = transportType;
                TransportType transportType2 = new TransportType("Trolley", 1);
                Trolley = transportType2;
                TransportType transportType3 = new TransportType("Tram", 2);
                Tram = transportType3;
                TransportType transportType4 = new TransportType("Water", 3);
                Water = transportType4;
                TransportType transportType5 = new TransportType("Electrobus", 4);
                Electrobus = transportType5;
                TransportType[] transportTypeArr = {transportType, transportType2, transportType3, transportType4, transportType5};
                $VALUES = transportTypeArr;
                $ENTRIES = kotlin.enums.a.a(transportTypeArr);
                Companion = new j();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(8));
            }

            public static TransportType valueOf(String str) {
                return (TransportType) Enum.valueOf(TransportType.class, str);
            }

            public static TransportType[] values() {
                return (TransportType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ BLEItem(int i, String str, d dVar, TransportType transportType, String str2, g.a aVar, Object obj) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = new d(0);
            } else {
                this.b = dVar;
            }
            if ((i & 4) == 0) {
                this.c = TransportType.Bus;
            } else {
                this.c = transportType;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = aVar;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = obj;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BLEItem)) {
                return false;
            }
            BLEItem bLEItem = (BLEItem) obj;
            return jl40.l(this.a, bLEItem.a) && jl40.l(this.b, bLEItem.b) && this.c == bLEItem.c && jl40.l(this.d, bLEItem.d) && jl40.l(this.e, bLEItem.e) && jl40.l(this.f, bLEItem.f);
        }

        public final int hashCode() {
            int b = unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            g.a aVar = this.e;
            int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Object obj = this.f;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "BLEItem(id=" + this.a + ", cardItem=" + this.b + ", transportType=" + this.c + ", vehicleKey=" + this.d + ", ble=" + this.e + ", metaCheckoutInfo=" + this.f + Extension.C_BRAKE;
        }

        public BLEItem() {
            d dVar = new d(0);
            TransportType transportType = TransportType.Bus;
            this.a = "";
            this.b = dVar;
            this.c = transportType;
            this.d = "";
            this.e = null;
            this.f = null;
        }
    }
}
