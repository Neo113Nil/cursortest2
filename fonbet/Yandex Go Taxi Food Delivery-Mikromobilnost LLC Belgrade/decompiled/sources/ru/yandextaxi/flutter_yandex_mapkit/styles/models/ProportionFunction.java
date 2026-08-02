package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.styling.ConstantFunctionPoints;
import com.yandex.mapkit.styling.LinearTiltFunctionPoints;
import com.yandex.mapkit.styling.LinearZoomFunctionPoints;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.tcc;
import defpackage.w511;
import defpackage.ysq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction$Type;", "type", "", "constValue", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", CRLDistributionPointsExtension.POINTS, "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction$Type;Ljava/lang/Float;Ljava/util/List;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction$Type;", "getType", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction$Type;", "Ljava/lang/Float;", "getConstValue", "()Ljava/lang/Float;", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "Type", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProportionFunction {

    @ysq0("constValue")
    private final Float constValue;

    @ysq0(CRLDistributionPointsExtension.POINTS)
    private final List<PointF> points;

    @ysq0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction$Type;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CONSTANT", "ZOOM", "TILT", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @ysq0("constant")
        public static final Type CONSTANT;

        @ysq0("default")
        public static final Type DEFAULT;

        @ysq0("tilt")
        public static final Type TILT;

        @ysq0("zoom")
        public static final Type ZOOM;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("CONSTANT", 1);
            CONSTANT = type2;
            Type type3 = new Type("ZOOM", 2);
            ZOOM = type3;
            Type type4 = new Type("TILT", 3);
            TILT = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ProportionFunction(Type type, Float f, List<PointF> list) {
        this.type = type;
        this.constValue = f;
        this.points = list;
    }

    public final com.yandex.mapkit.styling.ProportionFunction a() {
        int i = b.a[this.type.ordinal()];
        if (i == 1) {
            return com.yandex.mapkit.styling.ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(this.constValue.floatValue()));
        }
        if (i == 2) {
            List<PointF> list = this.points;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PointF) it.next()).a());
            }
            return com.yandex.mapkit.styling.ProportionFunction.fromZoomFunction(new LinearZoomFunctionPoints(arrayList));
        }
        if (i != 3) {
            if (i == 4) {
                return null;
            }
            w511.b();
            return null;
        }
        List<PointF> list2 = this.points;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PointF) it2.next()).a());
        }
        return com.yandex.mapkit.styling.ProportionFunction.fromTiltFunction(new LinearTiltFunctionPoints(arrayList2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProportionFunction)) {
            return false;
        }
        ProportionFunction proportionFunction = (ProportionFunction) obj;
        return this.type == proportionFunction.type && jl40.l(this.constValue, proportionFunction.constValue) && jl40.l(this.points, proportionFunction.points);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Float f = this.constValue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        List<PointF> list = this.points;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Type type = this.type;
        Float f = this.constValue;
        List<PointF> list = this.points;
        StringBuilder sb = new StringBuilder("ProportionFunction(type=");
        sb.append(type);
        sb.append(", constValue=");
        sb.append(f);
        sb.append(", points=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
