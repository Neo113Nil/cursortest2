package com.squareup.cash.plaid.real;

import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.android.SimpleActivityForResultLauncher;

/* loaded from: classes.dex */
public final class RealPlaidLinkActivityLauncher extends SimpleActivityForResultLauncher {
    @Override // com.squareup.util.android.SimpleActivityForResultLauncher
    public final ActivityResultContract contract(ComponentActivity componentActivity) {
        return new PlaidActivityResultContract();
    }
}
