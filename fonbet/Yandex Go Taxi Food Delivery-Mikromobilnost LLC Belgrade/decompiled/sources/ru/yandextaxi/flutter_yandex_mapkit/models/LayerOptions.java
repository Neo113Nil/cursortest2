package ru.yandextaxi.flutter_yandex_mapkit.models;

import defpackage.d390;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w511;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/LayerOptions;", "", "", "animateOnActivation", "cacheable", "nightModeAvailable", "Lru/yandextaxi/flutter_yandex_mapkit/models/OverzoomMode;", "overzoomMode", "<init>", "(ZZZLru/yandextaxi/flutter_yandex_mapkit/models/OverzoomMode;)V", "Z", "getAnimateOnActivation", "()Z", "getCacheable", "getNightModeAvailable", "Lru/yandextaxi/flutter_yandex_mapkit/models/OverzoomMode;", "getOverzoomMode", "()Lru/yandextaxi/flutter_yandex_mapkit/models/OverzoomMode;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LayerOptions {

    @ysq0("animateOnActivation")
    private final boolean animateOnActivation;

    @ysq0("cacheable")
    private final boolean cacheable;

    @ysq0("nightModeAvailable")
    private final boolean nightModeAvailable;

    @ysq0("overzoomMode")
    private final OverzoomMode overzoomMode;

    public LayerOptions(boolean z, boolean z2, boolean z3, OverzoomMode overzoomMode) {
        this.animateOnActivation = z;
        this.cacheable = z2;
        this.nightModeAvailable = z3;
        this.overzoomMode = overzoomMode;
    }

    public final com.yandex.mapkit.layers.LayerOptions a() {
        com.yandex.mapkit.layers.OverzoomMode overzoomMode;
        com.yandex.mapkit.layers.LayerOptions layerOptions = new com.yandex.mapkit.layers.LayerOptions();
        layerOptions.setAnimateOnActivation(this.animateOnActivation);
        layerOptions.setCacheable(this.cacheable);
        layerOptions.setNightModeAvailable(this.nightModeAvailable);
        OverzoomMode overzoomMode2 = this.overzoomMode;
        overzoomMode2.getClass();
        int i = d390.a[overzoomMode2.ordinal()];
        if (i == 1) {
            overzoomMode = com.yandex.mapkit.layers.OverzoomMode.DISABLED;
        } else if (i == 2) {
            overzoomMode = com.yandex.mapkit.layers.OverzoomMode.ENABLED;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            overzoomMode = com.yandex.mapkit.layers.OverzoomMode.WITH_PREFETCH;
        }
        layerOptions.setOverzoomMode(overzoomMode);
        return layerOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayerOptions)) {
            return false;
        }
        LayerOptions layerOptions = (LayerOptions) obj;
        return this.animateOnActivation == layerOptions.animateOnActivation && this.cacheable == layerOptions.cacheable && this.nightModeAvailable == layerOptions.nightModeAvailable && this.overzoomMode == layerOptions.overzoomMode;
    }

    public final int hashCode() {
        return this.overzoomMode.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.animateOnActivation) * 31, 31, this.cacheable), 31, this.nightModeAvailable);
    }

    public final String toString() {
        boolean z = this.animateOnActivation;
        boolean z2 = this.cacheable;
        boolean z3 = this.nightModeAvailable;
        OverzoomMode overzoomMode = this.overzoomMode;
        StringBuilder u = qv10.u("LayerOptions(animateOnActivation=", ", cacheable=", ", nightModeAvailable=", z, z2);
        u.append(z3);
        u.append(", overzoomMode=");
        u.append(overzoomMode);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
