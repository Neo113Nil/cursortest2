package com.google.android.play.core.integrity;

import android.util.Base64;
import androidx.room.Room;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.ae;

/* loaded from: classes.dex */
public final class ai implements IntegrityManager {
    public final ar a;

    public ai(ar arVar) {
        this.a = arVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        ar arVar = this.a;
        ae aeVar = arVar.a;
        if (aeVar == null) {
            return Room.forException(new IntegrityServiceException(-2, null));
        }
        if (com.google.android.play.integrity.internal.ai.a(arVar.d) < 82380000) {
            return Room.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            arVar.b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            aeVar.c().post(new com.google.android.play.integrity.internal.w(aeVar, taskCompletionSource, taskCompletionSource, new an(arVar, taskCompletionSource, decode, cloudProjectNumber, taskCompletionSource, integrityTokenRequest)));
            return taskCompletionSource.zza;
        } catch (IllegalArgumentException e) {
            return Room.forException(new IntegrityServiceException(-13, e));
        }
    }
}
