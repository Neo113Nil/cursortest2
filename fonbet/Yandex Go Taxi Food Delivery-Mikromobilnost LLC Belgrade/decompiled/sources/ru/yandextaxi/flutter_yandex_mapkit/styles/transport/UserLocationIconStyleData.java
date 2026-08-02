package ru.yandextaxi.flutter_yandex_mapkit.styles.transport;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.PlacemarkStyleData;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/transport/UserLocationIconStyleData;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;", "pinStyle", "arrowStyle", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;", "b", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;", "a", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserLocationIconStyleData {

    @ysq0("arrowStyle")
    private final PlacemarkStyleData arrowStyle;

    @ysq0("pinStyle")
    private final PlacemarkStyleData pinStyle;

    public UserLocationIconStyleData(PlacemarkStyleData placemarkStyleData, PlacemarkStyleData placemarkStyleData2) {
        this.pinStyle = placemarkStyleData;
        this.arrowStyle = placemarkStyleData2;
    }

    /* renamed from: a, reason: from getter */
    public final PlacemarkStyleData getArrowStyle() {
        return this.arrowStyle;
    }

    /* renamed from: b, reason: from getter */
    public final PlacemarkStyleData getPinStyle() {
        return this.pinStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLocationIconStyleData)) {
            return false;
        }
        UserLocationIconStyleData userLocationIconStyleData = (UserLocationIconStyleData) obj;
        return jl40.l(this.pinStyle, userLocationIconStyleData.pinStyle) && jl40.l(this.arrowStyle, userLocationIconStyleData.arrowStyle);
    }

    public final int hashCode() {
        return this.arrowStyle.hashCode() + (this.pinStyle.hashCode() * 31);
    }

    public final String toString() {
        return "UserLocationIconStyleData(pinStyle=" + this.pinStyle + ", arrowStyle=" + this.arrowStyle + Extension.C_BRAKE;
    }
}
