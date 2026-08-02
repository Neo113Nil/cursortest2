package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.lme;
import defpackage.yj4;
import defpackage.z7l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new yj4(this, context.getApplicationContext()));
        return new z7l(1);
    }
}
