package ru.yandex.taxi.map_common.map;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.jxi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/map_common/map/TaxiMapView$onAttachedToWindow$1", "Landroid/content/ComponentCallbacks2;", "", "level", "Lzy11;", "onTrimMemory", "(I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxiMapView$onAttachedToWindow$1 implements ComponentCallbacks2 {
    final /* synthetic */ TaxiMapView this$0;

    public TaxiMapView$onAttachedToWindow$1(TaxiMapView taxiMapView) {
        this.this$0 = taxiMapView;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
    }

    @Override // android.content.ComponentCallbacks
    @jxi
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        if (level >= 10) {
            this.this$0.getMapWindow().getMap().getDebug().forceMemoryWarning();
        }
    }
}
