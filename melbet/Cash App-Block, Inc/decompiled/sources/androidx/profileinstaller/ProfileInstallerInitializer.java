package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import androidx.startup.Initializer;
import com.google.android.gms.dynamite.zzf;
import java.util.Collections;
import java.util.List;
import papa.Choreographers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements Initializer {
    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new Choreographers$$ExternalSyntheticLambda3(this, context.getApplicationContext()));
        return new zzf(7);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
