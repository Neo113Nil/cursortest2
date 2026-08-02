package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.styling.ArrowStyle;
import defpackage.dob1;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"ru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$ArrowStyle", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;", "outlineWidth", "length", "triangleHeight", "", "fillColor", "outlineColor", "", "minZoomVisible", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;", "getOutlineWidth", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/ProportionFunction;", "getLength", "getTriangleHeight", "Ljava/lang/String;", "getFillColor", "()Ljava/lang/String;", "getOutlineColor", "Ljava/lang/Float;", "getMinZoomVisible", "()Ljava/lang/Float;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RouteViewStyleData$ArrowStyle {

    @ysq0("fillColor")
    private final String fillColor;

    @ysq0("length")
    private final ProportionFunction length;

    @ysq0("minZoomVisible")
    private final Float minZoomVisible;

    @ysq0("outlineColor")
    private final String outlineColor;

    @ysq0("outlineWidth")
    private final ProportionFunction outlineWidth;

    @ysq0("triangleHeight")
    private final ProportionFunction triangleHeight;

    public RouteViewStyleData$ArrowStyle(ProportionFunction proportionFunction, ProportionFunction proportionFunction2, ProportionFunction proportionFunction3, String str, String str2, Float f) {
        this.outlineWidth = proportionFunction;
        this.length = proportionFunction2;
        this.triangleHeight = proportionFunction3;
        this.fillColor = str;
        this.outlineColor = str2;
        this.minZoomVisible = f;
    }

    public final void a(ArrowStyle arrowStyle) {
        com.yandex.mapkit.styling.ProportionFunction a;
        com.yandex.mapkit.styling.ProportionFunction a2;
        com.yandex.mapkit.styling.ProportionFunction a3;
        ProportionFunction proportionFunction = this.outlineWidth;
        if (proportionFunction != null && (a3 = proportionFunction.a()) != null) {
            arrowStyle.setOutlineWidth(a3);
        }
        ProportionFunction proportionFunction2 = this.length;
        if (proportionFunction2 != null && (a2 = proportionFunction2.a()) != null) {
            arrowStyle.setLength(a2);
        }
        ProportionFunction proportionFunction3 = this.triangleHeight;
        if (proportionFunction3 != null && (a = proportionFunction3.a()) != null) {
            arrowStyle.setTriangleHeight(a);
        }
        String str = this.fillColor;
        if (str != null) {
            arrowStyle.setFillColor(dob1.b(str));
        }
        String str2 = this.outlineColor;
        if (str2 != null) {
            arrowStyle.setOutlineColor(dob1.b(str2));
        }
        Float f = this.minZoomVisible;
        if (f != null) {
            arrowStyle.setMinZoomVisible(Float.valueOf(f.floatValue()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteViewStyleData$ArrowStyle)) {
            return false;
        }
        RouteViewStyleData$ArrowStyle routeViewStyleData$ArrowStyle = (RouteViewStyleData$ArrowStyle) obj;
        return jl40.l(this.outlineWidth, routeViewStyleData$ArrowStyle.outlineWidth) && jl40.l(this.length, routeViewStyleData$ArrowStyle.length) && jl40.l(this.triangleHeight, routeViewStyleData$ArrowStyle.triangleHeight) && jl40.l(this.fillColor, routeViewStyleData$ArrowStyle.fillColor) && jl40.l(this.outlineColor, routeViewStyleData$ArrowStyle.outlineColor) && jl40.l(this.minZoomVisible, routeViewStyleData$ArrowStyle.minZoomVisible);
    }

    public final int hashCode() {
        ProportionFunction proportionFunction = this.outlineWidth;
        int hashCode = (proportionFunction == null ? 0 : proportionFunction.hashCode()) * 31;
        ProportionFunction proportionFunction2 = this.length;
        int hashCode2 = (hashCode + (proportionFunction2 == null ? 0 : proportionFunction2.hashCode())) * 31;
        ProportionFunction proportionFunction3 = this.triangleHeight;
        int hashCode3 = (hashCode2 + (proportionFunction3 == null ? 0 : proportionFunction3.hashCode())) * 31;
        String str = this.fillColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.outlineColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.minZoomVisible;
        return hashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "ArrowStyle(outlineWidth=" + this.outlineWidth + ", length=" + this.length + ", triangleHeight=" + this.triangleHeight + ", fillColor=" + this.fillColor + ", outlineColor=" + this.outlineColor + ", minZoomVisible=" + this.minZoomVisible + Extension.C_BRAKE;
    }
}
