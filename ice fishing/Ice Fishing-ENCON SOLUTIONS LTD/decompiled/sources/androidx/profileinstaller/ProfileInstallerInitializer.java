package androidx.profileinstaller;

import F0.c;
import N.h;
import R.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import m0.j;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // R.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // R.b
    public final Object create(Context context) {
        h.a(new c(3, this, context.getApplicationContext()));
        return new j(10, false);
    }
}
