package com.google.firebase.installations;

import com.google.android.gms.common.internal.zzae;
import com.google.firebase.FirebaseException;

/* loaded from: classes.dex */
public final class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        zzae.checkNotEmpty(str, "Detail message must not be empty");
    }
}
