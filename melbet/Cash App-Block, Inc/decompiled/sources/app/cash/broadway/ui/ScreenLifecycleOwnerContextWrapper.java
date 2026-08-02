package app.cash.broadway.ui;

import android.content.ContextWrapper;
import com.google.android.gms.tasks.zzr;

/* loaded from: classes.dex */
public final class ScreenLifecycleOwnerContextWrapper extends ContextWrapper {
    public final zzr uiLifecycle;

    public ScreenLifecycleOwnerContextWrapper(ContextWrapper contextWrapper, zzr zzrVar) {
        super(contextWrapper);
        this.uiLifecycle = zzrVar;
    }
}
