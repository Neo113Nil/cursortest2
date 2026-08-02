package com.squareup.cash.arcade.components.input;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;

/* loaded from: classes5.dex */
public final class DropdownState {
    public final ParcelableSnapshotMutableState expanded$delegate;

    public final class Saver implements androidx.compose.runtime.saveable.Saver {
        public static final Saver INSTANCE = new Saver();

        @Override // androidx.compose.runtime.saveable.Saver
        /* renamed from: restore */
        public final Object mo380restore(Object obj) {
            return new DropdownState(((Boolean) obj).booleanValue());
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object save(SaveableHolder saveableHolder, Object obj) {
            DropdownState dropdownState = (DropdownState) obj;
            saveableHolder.getClass();
            dropdownState.getClass();
            Boolean bool = (Boolean) dropdownState.expanded$delegate.getValue();
            bool.booleanValue();
            return bool;
        }
    }

    public DropdownState(boolean z) {
        this.expanded$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
    }
}
