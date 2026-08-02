package com.squareup.cash.cameralauncher;

import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.android.SimpleActivityForResultLauncher;

/* loaded from: classes4.dex */
public final class RealCameraLauncher extends SimpleActivityForResultLauncher {
    @Override // com.squareup.util.android.SimpleActivityForResultLauncher
    public final ActivityResultContract contract(ComponentActivity componentActivity) {
        return new CameraCapturerActivityResultContract();
    }
}
