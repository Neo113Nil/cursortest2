package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class SnackbarManager$SnackbarRecord {
    public final WeakReference callback;
    public int duration;
    public boolean paused;

    public SnackbarManager$SnackbarRecord(int i, BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        this.callback = new WeakReference(anonymousClass5);
        this.duration = i;
    }
}
