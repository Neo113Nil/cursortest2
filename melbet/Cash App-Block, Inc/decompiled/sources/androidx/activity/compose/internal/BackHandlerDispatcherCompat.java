package androidx.activity.compose.internal;

import androidx.activity.OnBackPressedDispatcher;
import androidx.navigationevent.NavigationEventDispatcher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public final class BackHandlerDispatcherCompat {
    public final NavigationEventDispatcher navigationEventDispatcher;
    public final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public BackHandlerDispatcherCompat(NavigationEventDispatcher navigationEventDispatcher, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.navigationEventDispatcher = navigationEventDispatcher;
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        if ((navigationEventDispatcher == null ? onBackPressedDispatcher : navigationEventDispatcher) != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void addHandler(SyncValueSpec syncValueSpec) {
        NavigationEventDispatcher navigationEventDispatcher = this.navigationEventDispatcher;
        if (navigationEventDispatcher != null) {
            NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, (BackHandlerCompat$navigationEventHandler$1) syncValueSpec.valueType);
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.addCallback((BackHandlerCompat$onBackPressedCallback$1) syncValueSpec.valueName);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Unreachable");
        }
    }

    public final void removeHandler(SyncValueSpec syncValueSpec) {
        if (this.navigationEventDispatcher != null) {
            ((BackHandlerCompat$navigationEventHandler$1) syncValueSpec.valueType).remove();
        } else if (this.onBackPressedDispatcher != null) {
            ((BackHandlerCompat$onBackPressedCallback$1) syncValueSpec.valueName).remove();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Unreachable");
        }
    }
}
