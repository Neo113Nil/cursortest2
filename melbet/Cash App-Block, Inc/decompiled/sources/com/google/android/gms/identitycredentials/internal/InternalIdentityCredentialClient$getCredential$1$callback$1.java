package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class InternalIdentityCredentialClient$getCredential$1$callback$1 extends zzb implements IInterface {
    public final /* synthetic */ TaskCompletionSource $completionSource;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalIdentityCredentialClient$getCredential$1$callback$1(int i, TaskCompletionSource taskCompletionSource) {
        super(2);
        this.$r8$classId = i;
        this.$completionSource = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
