package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.ae;
import com.google.android.play.integrity.internal.c;
import com.google.android.play.integrity.internal.s;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class aq extends zzb {
    public final /* synthetic */ ar a;
    public final s b;
    public final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ar arVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback", 13);
        Objects.requireNonNull(arVar);
        this.a = arVar;
        this.b = new s("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean a(Parcel parcel, int i) {
        IntegrityServiceException integrityServiceException;
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) c.a(parcel);
        c.b(parcel);
        ar arVar = this.a;
        ae aeVar = arVar.a;
        TaskCompletionSource taskCompletionSource = this.c;
        aeVar.v(taskCompletionSource);
        this.b.d("onRequestIntegrityToken", new Object[0]);
        arVar.f.getClass();
        int i2 = bundle.getInt(BreadcrumbHelper.Category.ERROR);
        if (i2 == 0) {
            integrityServiceException = null;
        } else {
            bundle.getBoolean("is.error.remediable");
            integrityServiceException = new IntegrityServiceException(i2, null);
        }
        if (integrityServiceException != null) {
            taskCompletionSource.trySetException(integrityServiceException);
            return true;
        }
        String string2 = bundle.getString("token");
        if (string2 == null) {
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, null));
            return true;
        }
        bundle.getLong("request.token.sid");
        Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
        taskCompletionSource.trySetResult(new av(string2));
        return true;
    }
}
