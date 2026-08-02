package com.squareup.cash.persona.backend;

import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.android.SimpleActivityForResultLauncher;
import com.withpersona.sdk2.inquiry.Inquiry;

/* loaded from: classes6.dex */
public final class PersonaActivityForResultLauncher extends SimpleActivityForResultLauncher {
    public PersonaActivityForResultLauncher(ComponentActivity componentActivity) {
        super(componentActivity, "PersonaActivityForResultLauncher");
    }

    @Override // com.squareup.util.android.SimpleActivityForResultLauncher
    public final ActivityResultContract contract(ComponentActivity componentActivity) {
        return new Inquiry.Contract(componentActivity);
    }
}
