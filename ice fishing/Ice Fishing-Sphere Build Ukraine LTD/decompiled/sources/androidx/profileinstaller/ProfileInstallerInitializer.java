package androidx.profileinstaller;

import E.a;
import J.g;
import J.j;
import M.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // M.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // M.b
    public final Object b(Context context) {
        j.a(new g(0, this, context.getApplicationContext()));
        return new a(5);
    }
}
