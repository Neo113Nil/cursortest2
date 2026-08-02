package defpackage;

import com.yandex.go.navigator.domain.v;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.runtime.model.ModelProvider;

/* loaded from: classes3.dex */
public final class zr21 implements UserPlacemarkStyleProvider {
    public final oc50 a;
    public final v b;
    public final yr21 c;

    public zr21(oc50 oc50Var, v vVar, yr21 yr21Var) {
        this.a = oc50Var;
        this.b = vVar;
        this.c = yr21Var;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider
    public final void provideStyle(float f, boolean z, NavigationLayerMode navigationLayerMode, PlacemarkStyle placemarkStyle) {
        if (!this.a.a() && !this.b.a()) {
            placemarkStyle.setMinZoomVisible(Float.valueOf(200.0f));
            return;
        }
        placemarkStyle.setMinZoomVisible(null);
        yr21 yr21Var = this.c;
        ModelProvider modelProvider = (ModelProvider) yr21Var.f.getValue();
        if (modelProvider == null) {
            modelProvider = (ModelProvider) yr21Var.h.getValue();
        }
        ModelStyle modelStyle = new ModelStyle(80.0f, ModelStyle.UnitType.NORMALIZED, ModelStyle.RenderMode.USER_MODEL, null);
        placemarkStyle.setArrowModel();
        placemarkStyle.setModel(modelProvider, modelStyle);
    }
}
