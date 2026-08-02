package androidx.compose.foundation.text.input.internal;

import defpackage.axf;
import defpackage.ch0;
import defpackage.qbs;
import defpackage.yci;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(yci yciVar, ch0 ch0Var, axf axfVar, qbs qbsVar) {
        return yciVar.f(new LegacyAdaptingPlatformTextInputModifier(ch0Var, axfVar, qbsVar));
    }
}
