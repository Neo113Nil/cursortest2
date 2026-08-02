package yads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import defpackage.ba71;

/* loaded from: classes7.dex */
public final class af0 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ ba71 a;

    public af0(ba71 ba71Var) {
        this.a = ba71Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.h();
    }
}
