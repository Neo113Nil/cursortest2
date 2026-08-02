package com.google.android.play.core.integrity;

import android.text.TextUtils;
import androidx.room.Room;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.ae;
import com.google.crypto.tink.KeysetHandle;

/* loaded from: classes.dex */
public final class be {
    public final bs a;
    public final by b;

    public be(bs bsVar, by byVar) {
        this.a = bsVar;
        this.b = byVar;
    }

    public final Task prepareIntegrityToken(k kVar) {
        if (!TextUtils.isEmpty(null)) {
            try {
                return Room.forResult(new bx(this.b, kVar.a, Long.parseLong(null)));
            } catch (NumberFormatException e) {
                return Room.forException(e);
            }
        }
        long j = kVar.a;
        Object[] objArr = {Long.valueOf(j)};
        bs bsVar = this.a;
        bsVar.b.d("warmUpIntegrityToken(%s)", objArr);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        bk bkVar = new bk(bsVar, taskCompletionSource, j, taskCompletionSource);
        ae aeVar = bsVar.a;
        aeVar.getClass();
        aeVar.c().post(new com.google.android.play.integrity.internal.w(aeVar, taskCompletionSource, taskCompletionSource, bkVar));
        return taskCompletionSource.zza.onSuccessTask(new KeysetHandle(1, this, kVar));
    }
}
