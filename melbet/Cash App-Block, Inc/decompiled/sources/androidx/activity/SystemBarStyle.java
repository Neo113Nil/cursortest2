package androidx.activity;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class SystemBarStyle {
    public final int darkScrim;
    public final Function1 detectDarkMode;
    public final int lightScrim;

    public SystemBarStyle(int i, int i2, Function1 function1) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.detectDarkMode = function1;
    }
}
