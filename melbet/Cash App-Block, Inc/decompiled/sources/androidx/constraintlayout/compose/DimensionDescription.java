package androidx.constraintlayout.compose;

import androidx.camera.video.Recorder;

/* loaded from: classes3.dex */
public final class DimensionDescription {
    public final Recorder.AnonymousClass3 valueSymbol;
    public final Recorder.AnonymousClass3 min = new Recorder.AnonymousClass3((String) null, "min");
    public final Recorder.AnonymousClass3 max = new Recorder.AnonymousClass3((String) null, "max");

    public DimensionDescription(String str) {
        this.valueSymbol = new Recorder.AnonymousClass3(str, "base");
    }
}
