package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import com.gamericefishpro.space.g6.b;
import com.gamericefishpro.space.n9.y;
import com.gamericefishpro.space.p5.e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // com.gamericefishpro.space.g6.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gamericefishpro.space.g6.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new e(this, context.getApplicationContext()));
        return new y(21);
    }
}
