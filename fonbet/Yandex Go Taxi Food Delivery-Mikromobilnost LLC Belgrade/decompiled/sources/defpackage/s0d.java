package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface s0d extends Executor {
    void activityDestroyed();

    void viewCreated(View view);
}
