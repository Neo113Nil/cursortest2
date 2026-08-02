package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.div.state.db.StateEntry;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.transportnavigation.DrawableUtils;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ssr;
import defpackage.tcc;
import defpackage.wbm;
import defpackage.ysq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;", "day", "night", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;", "getDay", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;", "getNight", "Style", "Model", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RequestPointStyleData {

    @ysq0("day")
    private final Style day;

    @ysq0("night")
    private final Style night;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;", "", "", StateEntry.COLUMN_PATH, "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", "anchor", "<init>", "(Ljava/lang/String;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model {

        @ysq0("anchor")
        private final PointF anchor;

        @ysq0(StateEntry.COLUMN_PATH)
        private final String path;

        public Model(String str, PointF pointF) {
            this.path = str;
            this.anchor = pointF;
        }

        /* renamed from: a, reason: from getter */
        public final PointF getAnchor() {
            return this.anchor;
        }

        /* renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return jl40.l(this.path, model.path) && jl40.l(this.anchor, model.anchor);
        }

        public final int hashCode() {
            int hashCode = this.path.hashCode() * 31;
            PointF pointF = this.anchor;
            return hashCode + (pointF == null ? 0 : pointF.hashCode());
        }

        public final String toString() {
            return "Model(path=" + this.path + ", anchor=" + this.anchor + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Style;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;", "startPoint", "finishPoint", "viaPoint", "", "scale", "selectedScale", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", "scaleFunction", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;FLjava/lang/Float;Ljava/util/List;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;", "getStartPoint", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RequestPointStyleData$Model;", "getFinishPoint", "getViaPoint", "F", "getScale", "()F", "Ljava/lang/Float;", "getSelectedScale", "()Ljava/lang/Float;", "Ljava/util/List;", "getScaleFunction", "()Ljava/util/List;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Style {

        @ysq0("finishPoint")
        private final Model finishPoint;

        @ysq0("scale")
        private final float scale;

        @ysq0("scaleFunction")
        private final List<PointF> scaleFunction;

        @ysq0("selectedScale")
        private final Float selectedScale;

        @ysq0("startPoint")
        private final Model startPoint;

        @ysq0("viaPoint")
        private final Model viaPoint;

        public Style(Model model, Model model2, Model model3, float f, Float f2, List<PointF> list) {
            this.startPoint = model;
            this.finishPoint = model2;
            this.viaPoint = model3;
            this.scale = f;
            this.selectedScale = f2;
            this.scaleFunction = list;
        }

        public final void a(ssr ssrVar, int i, int i2, float f, boolean z, PlacemarkStyle placemarkStyle) {
            Float f2;
            Model model = i == 0 ? this.startPoint : i == i2 + (-1) ? this.finishPoint : this.viaPoint;
            placemarkStyle.setImage(new wbm(model.getPath(), ((!z || (f2 = this.selectedScale) == null) ? this.scale : f2.floatValue()) * f, ssrVar, DrawableUtils.INSTANCE));
            PointF anchor = model.getAnchor();
            if (anchor != null) {
                placemarkStyle.setIconAnchor(anchor.a());
            }
            List<PointF> list = this.scaleFunction;
            if (list != null) {
                List<PointF> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PointF) it.next()).a());
                }
                placemarkStyle.setScaleFunction(arrayList);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return jl40.l(this.startPoint, style.startPoint) && jl40.l(this.finishPoint, style.finishPoint) && jl40.l(this.viaPoint, style.viaPoint) && Float.compare(this.scale, style.scale) == 0 && jl40.l(this.selectedScale, style.selectedScale) && jl40.l(this.scaleFunction, style.scaleFunction);
        }

        public final int hashCode() {
            int c = g8e.c(this.scale, (this.viaPoint.hashCode() + ((this.finishPoint.hashCode() + (this.startPoint.hashCode() * 31)) * 31)) * 31, 31);
            Float f = this.selectedScale;
            int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
            List<PointF> list = this.scaleFunction;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "Style(startPoint=" + this.startPoint + ", finishPoint=" + this.finishPoint + ", viaPoint=" + this.viaPoint + ", scale=" + this.scale + ", selectedScale=" + this.selectedScale + ", scaleFunction=" + this.scaleFunction + Extension.C_BRAKE;
        }
    }

    public RequestPointStyleData(Style style, Style style2) {
        this.day = style;
        this.night = style2;
    }

    public final void a(ssr ssrVar, int i, int i2, float f, boolean z, boolean z2, PlacemarkStyle placemarkStyle) {
        (z2 ? this.night : this.day).a(ssrVar, i, i2, f, z, placemarkStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPointStyleData)) {
            return false;
        }
        RequestPointStyleData requestPointStyleData = (RequestPointStyleData) obj;
        return jl40.l(this.day, requestPointStyleData.day) && jl40.l(this.night, requestPointStyleData.night);
    }

    public final int hashCode() {
        return this.night.hashCode() + (this.day.hashCode() * 31);
    }

    public final String toString() {
        return "RequestPointStyleData(day=" + this.day + ", night=" + this.night + Extension.C_BRAKE;
    }
}
