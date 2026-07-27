package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import kotlin.text.CatchingFishMoshiFluxMoshi;
import kotlin.text.CatchingFishMotionLayoutFAB;
import kotlin.text.CatchingFishToolbarAdMob;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements CatchingFishToolbarAdMob {
    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final List CatchingFishParcelableFAB() {
        return Collections.EMPTY_LIST;
    }

    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final Object CatchingFishSnackbar(Context context) {
        Choreographer.getInstance().postFrameCallback(new CatchingFishMotionLayoutFAB(this, context.getApplicationContext()));
        return new CatchingFishMoshiFluxMoshi(25);
    }
}
