package com.squareup.cash.clientsync.readers;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1;
import androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1;
import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public abstract class SyncValueSpec {
    public final Object valueName;
    public final Object valueType;

    public SyncValueSpec(final NavigationEventInfo navigationEventInfo) {
        this.valueName = new OnBackPressedCallback() { // from class: androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackCancelled() {
                SyncValueSpec.this.onBackCancelled();
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackPressed() {
                SyncValueSpec.this.onBackCompleted();
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackProgressed(BackEventCompat backEventCompat) {
                SyncValueSpec.this.onBackProgressed(backEventCompat);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackStarted(BackEventCompat backEventCompat) {
                SyncValueSpec.this.onBackStarted();
            }
        };
        this.valueType = new NavigationEventHandler(navigationEventInfo) { // from class: androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1
            @Override // androidx.navigationevent.NavigationEventHandler
            public final void onBackCancelled() {
                SyncValueSpec.this.onBackCancelled();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public final void onBackCompleted() {
                SyncValueSpec.this.onBackCompleted();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public final void onBackProgressed(NavigationEvent navigationEvent) {
                SyncValueSpec.this.onBackProgressed(new BackEventCompat(navigationEvent));
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public final void onBackStarted(NavigationEvent navigationEvent) {
                navigationEvent.getClass();
                SyncValueSpec.this.onBackStarted();
            }
        };
    }

    public abstract Object getPayload(Object obj);

    public boolean isBackEnabled() {
        return ((BackHandlerCompat$onBackPressedCallback$1) this.valueName).isEnabled() && ((BackHandlerCompat$navigationEventHandler$1) this.valueType).isBackEnabled;
    }

    public void onBackCancelled() {
    }

    public abstract void onBackCompleted();

    public void onBackProgressed(BackEventCompat backEventCompat) {
    }

    public void onBackStarted() {
    }

    public SyncValueSpec(String str, SyncValueType syncValueType) {
        this.valueName = str;
        this.valueType = syncValueType;
    }

    public SyncValueSpec(String str, String str2, int i) {
        str2 = (i & 4) != 0 ? str : str2;
        this.valueName = str;
        this.valueType = str2;
    }
}
