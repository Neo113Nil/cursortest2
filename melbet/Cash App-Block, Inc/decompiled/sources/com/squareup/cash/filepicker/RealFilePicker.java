package com.squareup.cash.filepicker;

import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.android.SimpleActivityForResultLauncher;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes6.dex */
public final class RealFilePicker extends SimpleActivityForResultLauncher {

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activity;
    }

    public RealFilePicker(ComponentActivity componentActivity, String str) {
        super(componentActivity, str);
    }

    @Override // com.squareup.util.android.SimpleActivityForResultLauncher
    public final ActivityResultContract contract(ComponentActivity componentActivity) {
        return new FilePickerActivityResultContract();
    }
}
