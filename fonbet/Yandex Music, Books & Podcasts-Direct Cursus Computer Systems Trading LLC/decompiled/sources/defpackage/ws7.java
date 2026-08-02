package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class ws7 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ ct7 a;

    public ws7(ct7 ct7Var) {
        this.a = ct7Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zwj zwjVar = ct7.j;
        this.a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zwj zwjVar = ct7.j;
        this.a.e();
    }
}
