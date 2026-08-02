package defpackage;

import androidx.compose.foundation.gestures.h;

/* loaded from: classes10.dex */
public final class zjh implements iip0 {
    public final /* synthetic */ h a;

    public zjh(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.iip0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        h hVar = this.a;
        float floatValue = ((Number) hVar.a.invoke(Float.valueOf(f))).floatValue();
        hVar.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        hVar.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
