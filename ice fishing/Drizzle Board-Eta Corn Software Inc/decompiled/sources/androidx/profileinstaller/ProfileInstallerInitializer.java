package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.brU71aZT;
import defpackage.k00;
import defpackage.um;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements um {
    @Override // defpackage.um
    public final Object NCTxEWno(Context context) {
        Choreographer.getInstance().postFrameCallback(new brU71aZT(this, context.getApplicationContext()));
        return new k00(0);
    }

    @Override // defpackage.um
    public final List qoPGr6Ce() {
        return Collections.EMPTY_LIST;
    }
}
