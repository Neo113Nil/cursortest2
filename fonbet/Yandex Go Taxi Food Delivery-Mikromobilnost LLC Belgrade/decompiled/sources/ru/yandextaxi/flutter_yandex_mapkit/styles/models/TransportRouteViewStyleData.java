package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Pass;
import com.yandex.mapkit.transport.masstransit.Stairs;
import com.yandex.mapkit.transport.masstransit.TransportType;
import com.yandex.mapkit.transport.masstransit.Travolator;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.ysq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u001d\u001e\u001f !\"BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData;", "fitnessPolylineStyle", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData;", "transferPolylineStyle", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData;", "transportPolylineStyle", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData;", "maneuverStyle", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData;", "routeStyle", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData;", "d", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData;", "e", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData;", "c", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData;", "FitnessPolylineStyleData", "TransferPolylineStyleData", "TransportPolylineStyleData", "YxManeuverStyleData", "YxRouteStyleData", "YxTravolator", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TransportRouteViewStyleData {

    @ysq0("fitnessPolylineStyle")
    private final FitnessPolylineStyleData fitnessPolylineStyle;

    @ysq0("maneuverStyle")
    private final YxManeuverStyleData maneuverStyle;

    @ysq0("routeStyle")
    private final YxRouteStyleData routeStyle;

    @ysq0("transferPolylineStyle")
    private final TransferPolylineStyleData transferPolylineStyle;

    @ysq0("transportPolylineStyle")
    private final TransportPolylineStyleData transportPolylineStyle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData$TransferPolylineStyle;", "styles", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "TransferPolylineStyle", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferPolylineStyleData {

        @ysq0("styles")
        private final List<TransferPolylineStyle> styles;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransferPolylineStyleData$TransferPolylineStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "condition", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "style", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransferPolylineStyle {

            @ysq0("condition")
            private final CommonCondition condition;

            @ysq0("style")
            private final RouteViewStyleData$LineStyle style;

            public TransferPolylineStyle(CommonCondition commonCondition, RouteViewStyleData$LineStyle routeViewStyleData$LineStyle) {
                this.condition = commonCondition;
                this.style = routeViewStyleData$LineStyle;
            }

            /* renamed from: a, reason: from getter */
            public final CommonCondition getCondition() {
                return this.condition;
            }

            /* renamed from: b, reason: from getter */
            public final RouteViewStyleData$LineStyle getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransferPolylineStyle)) {
                    return false;
                }
                TransferPolylineStyle transferPolylineStyle = (TransferPolylineStyle) obj;
                return jl40.l(this.condition, transferPolylineStyle.condition) && jl40.l(this.style, transferPolylineStyle.style);
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.condition.hashCode() * 31);
            }

            public final String toString() {
                return "TransferPolylineStyle(condition=" + this.condition + ", style=" + this.style + Extension.C_BRAKE;
            }
        }

        public TransferPolylineStyleData(List<TransferPolylineStyle> list) {
            this.styles = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getStyles() {
            return this.styles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransferPolylineStyleData) && jl40.l(this.styles, ((TransferPolylineStyleData) obj).styles);
        }

        public final int hashCode() {
            return this.styles.hashCode();
        }

        public final String toString() {
            return tse0.k("TransferPolylineStyleData(styles=", Extension.C_BRAKE, this.styles);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$TransportPolylineStyle;", "styles", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "TransportPolylineStyle", "Condition", "YxTransportType", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransportPolylineStyleData {

        @ysq0("styles")
        private final List<TransportPolylineStyle> styles;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$Condition;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$YxTransportType;", "transportType", "", "isGuidanceMode", "isSelected", "isNightMode", "<init>", "(Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/util/Set;", "getTransportType", "()Ljava/util/Set;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Condition {

            @ysq0("isGuidanceMode")
            private final Boolean isGuidanceMode;

            @ysq0("isNightMode")
            private final Boolean isNightMode;

            @ysq0("isSelected")
            private final Boolean isSelected;

            @ysq0("transportType")
            private final Set<YxTransportType> transportType;

            /* JADX WARN: Multi-variable type inference failed */
            public Condition(Set<? extends YxTransportType> set, Boolean bool, Boolean bool2, Boolean bool3) {
                this.transportType = set;
                this.isGuidanceMode = bool;
                this.isSelected = bool2;
                this.isNightMode = bool3;
            }

            public final boolean a(List list, boolean z, boolean z2, boolean z3) {
                Boolean bool;
                Boolean bool2;
                TransportType transportType;
                Set<YxTransportType> set = this.transportType;
                if (set != null) {
                    Set<YxTransportType> set2 = set;
                    ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                    for (YxTransportType yxTransportType : set2) {
                        yxTransportType.getClass();
                        switch (h.a[yxTransportType.ordinal()]) {
                            case 1:
                                transportType = TransportType.UNKNOWN;
                                break;
                            case 2:
                                transportType = TransportType.BUS;
                                break;
                            case 3:
                                transportType = TransportType.MINIBUS;
                                break;
                            case 4:
                                transportType = TransportType.RAILWAY;
                                break;
                            case 5:
                                transportType = TransportType.SUBURBAN;
                                break;
                            case 6:
                                transportType = TransportType.TRAMWAY;
                                break;
                            case 7:
                                transportType = TransportType.TROLLEYBUS;
                                break;
                            case 8:
                                transportType = TransportType.UNDERGROUND;
                                break;
                            case 9:
                                transportType = TransportType.WATER;
                                break;
                            default:
                                w511.b();
                                return false;
                        }
                        arrayList.add(transportType);
                    }
                    ArrayList P0 = kotlin.collections.a.P0(arrayList, list);
                    if (!P0.isEmpty()) {
                        Iterator it = P0.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            if (((TransportType) pair.getFirst()) == ((TransportType) pair.getSecond())) {
                            }
                        }
                    }
                }
                Boolean bool3 = this.isGuidanceMode;
                return (bool3 == null || bool3.booleanValue() == z) && ((bool = this.isSelected) == null || bool.booleanValue() == z2) && ((bool2 = this.isNightMode) == null || bool2.booleanValue() == z3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Condition)) {
                    return false;
                }
                Condition condition = (Condition) obj;
                return jl40.l(this.transportType, condition.transportType) && jl40.l(this.isGuidanceMode, condition.isGuidanceMode) && jl40.l(this.isSelected, condition.isSelected) && jl40.l(this.isNightMode, condition.isNightMode);
            }

            public final int hashCode() {
                Set<YxTransportType> set = this.transportType;
                int hashCode = (set == null ? 0 : set.hashCode()) * 31;
                Boolean bool = this.isGuidanceMode;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isSelected;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.isNightMode;
                return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
            }

            public final String toString() {
                return "Condition(transportType=" + this.transportType + ", isGuidanceMode=" + this.isGuidanceMode + ", isSelected=" + this.isSelected + ", isNightMode=" + this.isNightMode + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$TransportPolylineStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$Condition;", "condition", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "style", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$Condition;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$Condition;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$Condition;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransportPolylineStyle {

            @ysq0("condition")
            private final Condition condition;

            @ysq0("style")
            private final RouteViewStyleData$LineStyle style;

            public TransportPolylineStyle(Condition condition, RouteViewStyleData$LineStyle routeViewStyleData$LineStyle) {
                this.condition = condition;
                this.style = routeViewStyleData$LineStyle;
            }

            /* renamed from: a, reason: from getter */
            public final Condition getCondition() {
                return this.condition;
            }

            /* renamed from: b, reason: from getter */
            public final RouteViewStyleData$LineStyle getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransportPolylineStyle)) {
                    return false;
                }
                TransportPolylineStyle transportPolylineStyle = (TransportPolylineStyle) obj;
                return jl40.l(this.condition, transportPolylineStyle.condition) && jl40.l(this.style, transportPolylineStyle.style);
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.condition.hashCode() * 31);
            }

            public final String toString() {
                return "TransportPolylineStyle(condition=" + this.condition + ", style=" + this.style + Extension.C_BRAKE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$TransportPolylineStyleData$YxTransportType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "BUS", "MINIBUS", "RAILWAY", "SUBURBAN", "TRAM", "TROLLEYBUS", "UNDERGROUND", "WATER", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class YxTransportType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ YxTransportType[] $VALUES;

            @ysq0("bus")
            public static final YxTransportType BUS;

            @ysq0("minibus")
            public static final YxTransportType MINIBUS;

            @ysq0("railway")
            public static final YxTransportType RAILWAY;

            @ysq0("suburban")
            public static final YxTransportType SUBURBAN;

            @ysq0("tram")
            public static final YxTransportType TRAM;

            @ysq0("trolleybus")
            public static final YxTransportType TROLLEYBUS;

            @ysq0("underground")
            public static final YxTransportType UNDERGROUND;

            @ysq0("unknown")
            public static final YxTransportType UNKNOWN;

            @ysq0("water")
            public static final YxTransportType WATER;

            static {
                YxTransportType yxTransportType = new YxTransportType("UNKNOWN", 0);
                UNKNOWN = yxTransportType;
                YxTransportType yxTransportType2 = new YxTransportType("BUS", 1);
                BUS = yxTransportType2;
                YxTransportType yxTransportType3 = new YxTransportType("MINIBUS", 2);
                MINIBUS = yxTransportType3;
                YxTransportType yxTransportType4 = new YxTransportType("RAILWAY", 3);
                RAILWAY = yxTransportType4;
                YxTransportType yxTransportType5 = new YxTransportType("SUBURBAN", 4);
                SUBURBAN = yxTransportType5;
                YxTransportType yxTransportType6 = new YxTransportType("TRAM", 5);
                TRAM = yxTransportType6;
                YxTransportType yxTransportType7 = new YxTransportType("TROLLEYBUS", 6);
                TROLLEYBUS = yxTransportType7;
                YxTransportType yxTransportType8 = new YxTransportType("UNDERGROUND", 7);
                UNDERGROUND = yxTransportType8;
                YxTransportType yxTransportType9 = new YxTransportType("WATER", 8);
                WATER = yxTransportType9;
                YxTransportType[] yxTransportTypeArr = {yxTransportType, yxTransportType2, yxTransportType3, yxTransportType4, yxTransportType5, yxTransportType6, yxTransportType7, yxTransportType8, yxTransportType9};
                $VALUES = yxTransportTypeArr;
                $ENTRIES = kotlin.enums.a.a(yxTransportTypeArr);
            }

            private YxTransportType(String str, int i) {
            }

            public static YxTransportType valueOf(String str) {
                return (YxTransportType) Enum.valueOf(YxTransportType.class, str);
            }

            public static YxTransportType[] values() {
                return (YxTransportType[]) $VALUES.clone();
            }
        }

        public TransportPolylineStyleData(List<TransportPolylineStyle> list) {
            this.styles = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getStyles() {
            return this.styles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransportPolylineStyleData) && jl40.l(this.styles, ((TransportPolylineStyleData) obj).styles);
        }

        public final int hashCode() {
            return this.styles.hashCode();
        }

        public final String toString() {
            return tse0.k("TransportPolylineStyleData(styles=", Extension.C_BRAKE, this.styles);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData$ManeuverStyle;", "styles", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "ManeuverStyle", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YxManeuverStyleData {

        @ysq0("styles")
        private final List<ManeuverStyle> styles;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxManeuverStyleData$ManeuverStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "condition", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$ArrowStyle;", "style", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$ArrowStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$ArrowStyle;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$ArrowStyle;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ManeuverStyle {

            @ysq0("condition")
            private final CommonCondition condition;

            @ysq0("style")
            private final RouteViewStyleData$ArrowStyle style;

            public ManeuverStyle(CommonCondition commonCondition, RouteViewStyleData$ArrowStyle routeViewStyleData$ArrowStyle) {
                this.condition = commonCondition;
                this.style = routeViewStyleData$ArrowStyle;
            }

            /* renamed from: a, reason: from getter */
            public final CommonCondition getCondition() {
                return this.condition;
            }

            /* renamed from: b, reason: from getter */
            public final RouteViewStyleData$ArrowStyle getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ManeuverStyle)) {
                    return false;
                }
                ManeuverStyle maneuverStyle = (ManeuverStyle) obj;
                return jl40.l(this.condition, maneuverStyle.condition) && jl40.l(this.style, maneuverStyle.style);
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.condition.hashCode() * 31);
            }

            public final String toString() {
                return "ManeuverStyle(condition=" + this.condition + ", style=" + this.style + Extension.C_BRAKE;
            }
        }

        public YxManeuverStyleData(List<ManeuverStyle> list) {
            this.styles = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getStyles() {
            return this.styles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YxManeuverStyleData) && jl40.l(this.styles, ((YxManeuverStyleData) obj).styles);
        }

        public final int hashCode() {
            return this.styles.hashCode();
        }

        public final String toString() {
            return tse0.k("YxManeuverStyleData(styles=", Extension.C_BRAKE, this.styles);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData$RouteStyle;", "styles", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "RouteStyle", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YxRouteStyleData {

        @ysq0("styles")
        private final List<RouteStyle> styles;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxRouteStyleData$RouteStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "condition", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$TransportRouteStyle;", "style", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$TransportRouteStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$TransportRouteStyle;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$TransportRouteStyle;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RouteStyle {

            @ysq0("condition")
            private final CommonCondition condition;

            @ysq0("style")
            private final RouteViewStyleData$TransportRouteStyle style;

            public RouteStyle(CommonCondition commonCondition, RouteViewStyleData$TransportRouteStyle routeViewStyleData$TransportRouteStyle) {
                this.condition = commonCondition;
                this.style = routeViewStyleData$TransportRouteStyle;
            }

            /* renamed from: a, reason: from getter */
            public final CommonCondition getCondition() {
                return this.condition;
            }

            /* renamed from: b, reason: from getter */
            public final RouteViewStyleData$TransportRouteStyle getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RouteStyle)) {
                    return false;
                }
                RouteStyle routeStyle = (RouteStyle) obj;
                return jl40.l(this.condition, routeStyle.condition) && jl40.l(this.style, routeStyle.style);
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.condition.hashCode() * 31);
            }

            public final String toString() {
                return "RouteStyle(condition=" + this.condition + ", style=" + this.style + Extension.C_BRAKE;
            }
        }

        public YxRouteStyleData(List<RouteStyle> list) {
            this.styles = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getStyles() {
            return this.styles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YxRouteStyleData) && jl40.l(this.styles, ((YxRouteStyleData) obj).styles);
        }

        public final int hashCode() {
            return this.styles.hashCode();
        }

        public final String toString() {
            return tse0.k("YxRouteStyleData(styles=", Extension.C_BRAKE, this.styles);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxTravolator;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ru/yandextaxi/flutter_yandex_mapkit/styles/models/j", "UNKNOWN", "UP", "DOWN", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YxTravolator {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ YxTravolator[] $VALUES;
        public static final j Companion;

        @ysq0("down")
        public static final YxTravolator DOWN;

        @ysq0("unknown")
        public static final YxTravolator UNKNOWN;

        @ysq0("up")
        public static final YxTravolator UP;

        static {
            YxTravolator yxTravolator = new YxTravolator("UNKNOWN", 0);
            UNKNOWN = yxTravolator;
            YxTravolator yxTravolator2 = new YxTravolator("UP", 1);
            UP = yxTravolator2;
            YxTravolator yxTravolator3 = new YxTravolator("DOWN", 2);
            DOWN = yxTravolator3;
            YxTravolator[] yxTravolatorArr = {yxTravolator, yxTravolator2, yxTravolator3};
            $VALUES = yxTravolatorArr;
            $ENTRIES = kotlin.enums.a.a(yxTravolatorArr);
            Companion = new j();
        }

        private YxTravolator(String str, int i) {
        }

        public static YxTravolator valueOf(String str) {
            return (YxTravolator) Enum.valueOf(YxTravolator.class, str);
        }

        public static YxTravolator[] values() {
            return (YxTravolator[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TransportRouteViewStyleData(FitnessPolylineStyleData fitnessPolylineStyleData, TransferPolylineStyleData transferPolylineStyleData, TransportPolylineStyleData transportPolylineStyleData, YxManeuverStyleData yxManeuverStyleData, YxRouteStyleData yxRouteStyleData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fitnessPolylineStyleData, (i & 2) != 0 ? null : transferPolylineStyleData, (i & 4) != 0 ? null : transportPolylineStyleData, (i & 8) != 0 ? null : yxManeuverStyleData, (i & 16) != 0 ? null : yxRouteStyleData);
    }

    /* renamed from: a, reason: from getter */
    public final FitnessPolylineStyleData getFitnessPolylineStyle() {
        return this.fitnessPolylineStyle;
    }

    /* renamed from: b, reason: from getter */
    public final YxManeuverStyleData getManeuverStyle() {
        return this.maneuverStyle;
    }

    /* renamed from: c, reason: from getter */
    public final YxRouteStyleData getRouteStyle() {
        return this.routeStyle;
    }

    /* renamed from: d, reason: from getter */
    public final TransferPolylineStyleData getTransferPolylineStyle() {
        return this.transferPolylineStyle;
    }

    /* renamed from: e, reason: from getter */
    public final TransportPolylineStyleData getTransportPolylineStyle() {
        return this.transportPolylineStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportRouteViewStyleData)) {
            return false;
        }
        TransportRouteViewStyleData transportRouteViewStyleData = (TransportRouteViewStyleData) obj;
        return jl40.l(this.fitnessPolylineStyle, transportRouteViewStyleData.fitnessPolylineStyle) && jl40.l(this.transferPolylineStyle, transportRouteViewStyleData.transferPolylineStyle) && jl40.l(this.transportPolylineStyle, transportRouteViewStyleData.transportPolylineStyle) && jl40.l(this.maneuverStyle, transportRouteViewStyleData.maneuverStyle) && jl40.l(this.routeStyle, transportRouteViewStyleData.routeStyle);
    }

    public final int hashCode() {
        FitnessPolylineStyleData fitnessPolylineStyleData = this.fitnessPolylineStyle;
        int hashCode = (fitnessPolylineStyleData == null ? 0 : fitnessPolylineStyleData.hashCode()) * 31;
        TransferPolylineStyleData transferPolylineStyleData = this.transferPolylineStyle;
        int hashCode2 = (hashCode + (transferPolylineStyleData == null ? 0 : transferPolylineStyleData.hashCode())) * 31;
        TransportPolylineStyleData transportPolylineStyleData = this.transportPolylineStyle;
        int hashCode3 = (hashCode2 + (transportPolylineStyleData == null ? 0 : transportPolylineStyleData.hashCode())) * 31;
        YxManeuverStyleData yxManeuverStyleData = this.maneuverStyle;
        int hashCode4 = (hashCode3 + (yxManeuverStyleData == null ? 0 : yxManeuverStyleData.hashCode())) * 31;
        YxRouteStyleData yxRouteStyleData = this.routeStyle;
        return hashCode4 + (yxRouteStyleData != null ? yxRouteStyleData.hashCode() : 0);
    }

    public final String toString() {
        return "TransportRouteViewStyleData(fitnessPolylineStyle=" + this.fitnessPolylineStyle + ", transferPolylineStyle=" + this.transferPolylineStyle + ", transportPolylineStyle=" + this.transportPolylineStyle + ", maneuverStyle=" + this.maneuverStyle + ", routeStyle=" + this.routeStyle + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$FitnessPolylineStyle;", "styles", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "FitnessPolylineStyle", "Condition", "ConstructionMaskData", "YxStairs", "YxPass", "TrafficTypeID", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FitnessPolylineStyleData {

        @ysq0("styles")
        private final List<FitnessPolylineStyle> styles;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$Condition;", "", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$ConstructionMaskData;", "constructionMask", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$TrafficTypeID;", "trafficTypeID", "", "isSelected", "isNightMode", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/util/Set;", "getConstructionMask", "()Ljava/util/Set;", "getTrafficTypeID", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Condition {

            @ysq0("constructionMask")
            private final Set<ConstructionMaskData> constructionMask;

            @ysq0("isNightMode")
            private final Boolean isNightMode;

            @ysq0("isSelected")
            private final Boolean isSelected;

            @ysq0("trafficTypeID")
            private final Set<TrafficTypeID> trafficTypeID;

            /* JADX WARN: Multi-variable type inference failed */
            public Condition(Set<ConstructionMaskData> set, Set<? extends TrafficTypeID> set2, Boolean bool, Boolean bool2) {
                this.constructionMask = set;
                this.trafficTypeID = set2;
                this.isSelected = bool;
                this.isNightMode = bool2;
            }

            public final boolean a(ConstructionMask constructionMask, com.yandex.mapkit.transport.masstransit.TrafficTypeID trafficTypeID, boolean z, boolean z2) {
                boolean z3;
                boolean z4;
                Boolean bool;
                Boolean bool2;
                com.yandex.mapkit.transport.masstransit.TrafficTypeID trafficTypeID2;
                YxStairs yxStairs;
                YxPass yxPass;
                YxTravolator yxTravolator;
                YxPass yxPass2;
                YxStairs yxStairs2;
                Set<ConstructionMaskData> set = this.constructionMask;
                if (set != null) {
                    Stairs stairs = constructionMask.getStairs();
                    YxTravolator yxTravolator2 = null;
                    if (stairs != null) {
                        YxStairs.Companion.getClass();
                        int i = f.a[stairs.getDirection().ordinal()];
                        if (i == 1) {
                            yxStairs2 = YxStairs.UNKNOWN;
                        } else if (i == 2) {
                            yxStairs2 = YxStairs.UP;
                        } else {
                            if (i != 3) {
                                w511.b();
                                return false;
                            }
                            yxStairs2 = YxStairs.DOWN;
                        }
                        yxStairs = yxStairs2;
                    } else {
                        yxStairs = null;
                    }
                    Pass pass = constructionMask.getPass();
                    if (pass != null) {
                        YxPass.Companion.getClass();
                        int i2 = d.a[pass.ordinal()];
                        if (i2 == 1) {
                            yxPass2 = YxPass.UNDER;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return false;
                            }
                            yxPass2 = YxPass.OVER;
                        }
                        yxPass = yxPass2;
                    } else {
                        yxPass = null;
                    }
                    boolean crosswalk = constructionMask.getCrosswalk();
                    boolean binding = constructionMask.getBinding();
                    boolean transition = constructionMask.getTransition();
                    boolean tunnel = constructionMask.getTunnel();
                    Travolator travolator = constructionMask.getTravolator();
                    if (travolator != null) {
                        YxTravolator.Companion.getClass();
                        int i3 = i.a[travolator.ordinal()];
                        if (i3 == 1) {
                            yxTravolator = YxTravolator.UNKNOWN;
                        } else if (i3 == 2) {
                            yxTravolator = YxTravolator.UP;
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return false;
                            }
                            yxTravolator = YxTravolator.DOWN;
                        }
                        yxTravolator2 = yxTravolator;
                    }
                    z3 = set.contains(new ConstructionMaskData(yxStairs, yxPass, crosswalk, binding, transition, tunnel, yxTravolator2, constructionMask.getIndoor()));
                } else {
                    z3 = true;
                }
                if (z3) {
                    Set<TrafficTypeID> set2 = this.trafficTypeID;
                    if (set2 != null) {
                        Set<TrafficTypeID> set3 = set2;
                        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                        for (TrafficTypeID trafficTypeID3 : set3) {
                            trafficTypeID3.getClass();
                            int i4 = c.a[trafficTypeID3.ordinal()];
                            if (i4 == 1) {
                                trafficTypeID2 = com.yandex.mapkit.transport.masstransit.TrafficTypeID.OTHER;
                            } else if (i4 == 2) {
                                trafficTypeID2 = com.yandex.mapkit.transport.masstransit.TrafficTypeID.PEDESTRIAN;
                            } else if (i4 == 3) {
                                trafficTypeID2 = com.yandex.mapkit.transport.masstransit.TrafficTypeID.BICYCLE;
                            } else {
                                if (i4 != 4) {
                                    w511.b();
                                    return false;
                                }
                                trafficTypeID2 = com.yandex.mapkit.transport.masstransit.TrafficTypeID.AUTO;
                            }
                            arrayList.add(trafficTypeID2);
                        }
                        z4 = arrayList.contains(trafficTypeID);
                    } else {
                        z4 = true;
                    }
                    if (z4 && (((bool = this.isSelected) == null || bool.booleanValue() == z) && ((bool2 = this.isNightMode) == null || bool2.booleanValue() == z2))) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Condition)) {
                    return false;
                }
                Condition condition = (Condition) obj;
                return jl40.l(this.constructionMask, condition.constructionMask) && jl40.l(this.trafficTypeID, condition.trafficTypeID) && jl40.l(this.isSelected, condition.isSelected) && jl40.l(this.isNightMode, condition.isNightMode);
            }

            public final int hashCode() {
                Set<ConstructionMaskData> set = this.constructionMask;
                int hashCode = (set == null ? 0 : set.hashCode()) * 31;
                Set<TrafficTypeID> set2 = this.trafficTypeID;
                int hashCode2 = (hashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
                Boolean bool = this.isSelected;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isNightMode;
                return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
            }

            public final String toString() {
                return "Condition(constructionMask=" + this.constructionMask + ", trafficTypeID=" + this.trafficTypeID + ", isSelected=" + this.isSelected + ", isNightMode=" + this.isNightMode + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$FitnessPolylineStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$Condition;", "condition", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "style", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$Condition;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$Condition;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$Condition;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FitnessPolylineStyle {

            @ysq0("condition")
            private final Condition condition;

            @ysq0("style")
            private final RouteViewStyleData$LineStyle style;

            public FitnessPolylineStyle(Condition condition, RouteViewStyleData$LineStyle routeViewStyleData$LineStyle) {
                this.condition = condition;
                this.style = routeViewStyleData$LineStyle;
            }

            /* renamed from: a, reason: from getter */
            public final Condition getCondition() {
                return this.condition;
            }

            /* renamed from: b, reason: from getter */
            public final RouteViewStyleData$LineStyle getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FitnessPolylineStyle)) {
                    return false;
                }
                FitnessPolylineStyle fitnessPolylineStyle = (FitnessPolylineStyle) obj;
                return jl40.l(this.condition, fitnessPolylineStyle.condition) && jl40.l(this.style, fitnessPolylineStyle.style);
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.condition.hashCode() * 31);
            }

            public final String toString() {
                return "FitnessPolylineStyle(condition=" + this.condition + ", style=" + this.style + Extension.C_BRAKE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$TrafficTypeID;", "", "<init>", "(Ljava/lang/String;I)V", "OTHER", "PEDESTRIAN", "BICYCLE", "AUTO", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TrafficTypeID {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TrafficTypeID[] $VALUES;

            @ysq0("auto")
            public static final TrafficTypeID AUTO;

            @ysq0("bicycle")
            public static final TrafficTypeID BICYCLE;

            @ysq0("other")
            public static final TrafficTypeID OTHER;

            @ysq0("pedestrian")
            public static final TrafficTypeID PEDESTRIAN;

            static {
                TrafficTypeID trafficTypeID = new TrafficTypeID("OTHER", 0);
                OTHER = trafficTypeID;
                TrafficTypeID trafficTypeID2 = new TrafficTypeID("PEDESTRIAN", 1);
                PEDESTRIAN = trafficTypeID2;
                TrafficTypeID trafficTypeID3 = new TrafficTypeID("BICYCLE", 2);
                BICYCLE = trafficTypeID3;
                TrafficTypeID trafficTypeID4 = new TrafficTypeID("AUTO", 3);
                AUTO = trafficTypeID4;
                TrafficTypeID[] trafficTypeIDArr = {trafficTypeID, trafficTypeID2, trafficTypeID3, trafficTypeID4};
                $VALUES = trafficTypeIDArr;
                $ENTRIES = kotlin.enums.a.a(trafficTypeIDArr);
            }

            private TrafficTypeID(String str, int i) {
            }

            public static TrafficTypeID valueOf(String str) {
                return (TrafficTypeID) Enum.valueOf(TrafficTypeID.class, str);
            }

            public static TrafficTypeID[] values() {
                return (TrafficTypeID[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxPass;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ru/yandextaxi/flutter_yandex_mapkit/styles/models/e", "OVER", "UNDER", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class YxPass {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ YxPass[] $VALUES;
            public static final e Companion;

            @ysq0("over")
            public static final YxPass OVER;

            @ysq0("under")
            public static final YxPass UNDER;

            static {
                YxPass yxPass = new YxPass("OVER", 0);
                OVER = yxPass;
                YxPass yxPass2 = new YxPass("UNDER", 1);
                UNDER = yxPass2;
                YxPass[] yxPassArr = {yxPass, yxPass2};
                $VALUES = yxPassArr;
                $ENTRIES = kotlin.enums.a.a(yxPassArr);
                Companion = new e();
            }

            private YxPass(String str, int i) {
            }

            public static YxPass valueOf(String str) {
                return (YxPass) Enum.valueOf(YxPass.class, str);
            }

            public static YxPass[] values() {
                return (YxPass[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxStairs;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ru/yandextaxi/flutter_yandex_mapkit/styles/models/g", "UNKNOWN", "UP", "DOWN", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class YxStairs {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ YxStairs[] $VALUES;
            public static final g Companion;

            @ysq0("down")
            public static final YxStairs DOWN;

            @ysq0("unknown")
            public static final YxStairs UNKNOWN;

            @ysq0("up")
            public static final YxStairs UP;

            static {
                YxStairs yxStairs = new YxStairs("UNKNOWN", 0);
                UNKNOWN = yxStairs;
                YxStairs yxStairs2 = new YxStairs("UP", 1);
                UP = yxStairs2;
                YxStairs yxStairs3 = new YxStairs("DOWN", 2);
                DOWN = yxStairs3;
                YxStairs[] yxStairsArr = {yxStairs, yxStairs2, yxStairs3};
                $VALUES = yxStairsArr;
                $ENTRIES = kotlin.enums.a.a(yxStairsArr);
                Companion = new g();
            }

            private YxStairs(String str, int i) {
            }

            public static YxStairs valueOf(String str) {
                return (YxStairs) Enum.valueOf(YxStairs.class, str);
            }

            public static YxStairs[] values() {
                return (YxStairs[]) $VALUES.clone();
            }
        }

        public FitnessPolylineStyleData(List<FitnessPolylineStyle> list) {
            this.styles = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getStyles() {
            return this.styles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FitnessPolylineStyleData) && jl40.l(this.styles, ((FitnessPolylineStyleData) obj).styles);
        }

        public final int hashCode() {
            return this.styles.hashCode();
        }

        public final String toString() {
            return tse0.k("FitnessPolylineStyleData(styles=", Extension.C_BRAKE, this.styles);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$ConstructionMaskData;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxStairs;", "stairs", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxPass;", "pass", "", "crosswalk", "binding", "transition", "tunnel", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxTravolator;", "travolator", "indoor", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxStairs;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxPass;ZZZZLru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxTravolator;Z)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxStairs;", "getStairs", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxStairs;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxPass;", "getPass", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$FitnessPolylineStyleData$YxPass;", "Z", "getCrosswalk", "()Z", "getBinding", "getTransition", "getTunnel", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxTravolator;", "getTravolator", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/TransportRouteViewStyleData$YxTravolator;", "getIndoor", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ConstructionMaskData {

            @ysq0("binding")
            private final boolean binding;

            @ysq0("crosswalk")
            private final boolean crosswalk;

            @ysq0("indoor")
            private final boolean indoor;

            @ysq0("pass")
            private final YxPass pass;

            @ysq0("stairs")
            private final YxStairs stairs;

            @ysq0("transition")
            private final boolean transition;

            @ysq0("travolator")
            private final YxTravolator travolator;

            @ysq0("tunnel")
            private final boolean tunnel;

            public /* synthetic */ ConstructionMaskData(YxStairs yxStairs, YxPass yxPass, boolean z, boolean z2, boolean z3, boolean z4, YxTravolator yxTravolator, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(yxStairs, yxPass, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, yxTravolator, (i & 128) != 0 ? false : z5);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConstructionMaskData)) {
                    return false;
                }
                ConstructionMaskData constructionMaskData = (ConstructionMaskData) obj;
                return this.stairs == constructionMaskData.stairs && this.pass == constructionMaskData.pass && this.crosswalk == constructionMaskData.crosswalk && this.binding == constructionMaskData.binding && this.transition == constructionMaskData.transition && this.tunnel == constructionMaskData.tunnel && this.travolator == constructionMaskData.travolator && this.indoor == constructionMaskData.indoor;
            }

            public final int hashCode() {
                YxStairs yxStairs = this.stairs;
                int hashCode = (yxStairs == null ? 0 : yxStairs.hashCode()) * 31;
                YxPass yxPass = this.pass;
                int e = unr0.e(unr0.e(unr0.e(unr0.e((hashCode + (yxPass == null ? 0 : yxPass.hashCode())) * 31, 31, this.crosswalk), 31, this.binding), 31, this.transition), 31, this.tunnel);
                YxTravolator yxTravolator = this.travolator;
                return Boolean.hashCode(this.indoor) + ((e + (yxTravolator != null ? yxTravolator.hashCode() : 0)) * 31);
            }

            public final String toString() {
                YxStairs yxStairs = this.stairs;
                YxPass yxPass = this.pass;
                boolean z = this.crosswalk;
                boolean z2 = this.binding;
                boolean z3 = this.transition;
                boolean z4 = this.tunnel;
                YxTravolator yxTravolator = this.travolator;
                boolean z5 = this.indoor;
                StringBuilder sb = new StringBuilder("ConstructionMaskData(stairs=");
                sb.append(yxStairs);
                sb.append(", pass=");
                sb.append(yxPass);
                sb.append(", crosswalk=");
                nnm.v(", binding=", ", transition=", sb, z, z2);
                nnm.v(", tunnel=", ", travolator=", sb, z3, z4);
                sb.append(yxTravolator);
                sb.append(", indoor=");
                sb.append(z5);
                sb.append(Extension.C_BRAKE);
                return sb.toString();
            }

            public ConstructionMaskData(YxStairs yxStairs, YxPass yxPass, boolean z, boolean z2, boolean z3, boolean z4, YxTravolator yxTravolator, boolean z5) {
                this.stairs = yxStairs;
                this.pass = yxPass;
                this.crosswalk = z;
                this.binding = z2;
                this.transition = z3;
                this.tunnel = z4;
                this.travolator = yxTravolator;
                this.indoor = z5;
            }
        }
    }

    public TransportRouteViewStyleData(FitnessPolylineStyleData fitnessPolylineStyleData, TransferPolylineStyleData transferPolylineStyleData, TransportPolylineStyleData transportPolylineStyleData, YxManeuverStyleData yxManeuverStyleData, YxRouteStyleData yxRouteStyleData) {
        this.fitnessPolylineStyle = fitnessPolylineStyleData;
        this.transferPolylineStyle = transferPolylineStyleData;
        this.transportPolylineStyle = transportPolylineStyleData;
        this.maneuverStyle = yxManeuverStyleData;
        this.routeStyle = yxRouteStyleData;
    }

    public TransportRouteViewStyleData() {
        this(null, null, null, null, null, 31, null);
    }
}
