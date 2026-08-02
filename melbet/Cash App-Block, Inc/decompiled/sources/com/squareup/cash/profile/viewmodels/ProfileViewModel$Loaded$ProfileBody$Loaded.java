package com.squareup.cash.profile.viewmodels;

import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileViewModel$Loaded$ProfileBody$Loaded extends NotificationCompat {
    public final Debug genericProfileElements;

    public ProfileViewModel$Loaded$ProfileBody$Loaded(Debug debug) {
        debug.getClass();
        this.genericProfileElements = debug;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileViewModel$Loaded$ProfileBody$Loaded) && Intrinsics.areEqual(this.genericProfileElements, ((ProfileViewModel$Loaded$ProfileBody$Loaded) obj).genericProfileElements);
    }

    public final int hashCode() {
        return this.genericProfileElements.hashCode();
    }

    public final String toString() {
        return "Loaded(genericProfileElements=" + this.genericProfileElements + ")";
    }
}
