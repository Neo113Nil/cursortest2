package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.room.Room;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzx implements Continuation, SuccessContinuation {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ zzx zza$1 = new zzx(1);
    public static final /* synthetic */ zzx zza$2 = new zzx(2);
    public static final /* synthetic */ zzx zza = new zzx(0);

    public /* synthetic */ zzx(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.$r8$classId) {
            case 1:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = Rpc.zza;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Room.forResult(null);
        }
        return Room.forResult(bundle);
    }
}
