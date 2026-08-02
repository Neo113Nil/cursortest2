package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public interface tb6 {
    float a();

    default float b() {
        float x = xee.x(getContext()) - a();
        float f = 4;
        return x < f ? f : x;
    }

    Context getContext();
}
