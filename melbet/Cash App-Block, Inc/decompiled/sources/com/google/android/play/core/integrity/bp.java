package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c;
import com.google.android.play.integrity.internal.s;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class bp extends zzb implements IInterface {
    public final /* synthetic */ int $r8$classId;
    public final TaskCompletionSource a;
    public final /* synthetic */ bs b;
    public final /* synthetic */ bs c;
    public final s d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bp(bs bsVar, TaskCompletionSource taskCompletionSource, int i) {
        this(bsVar, taskCompletionSource, (byte) 0);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(bsVar);
                this.c = bsVar;
                this(bsVar, taskCompletionSource, (byte) 0);
                this.d = new s("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                Objects.requireNonNull(bsVar);
                this.c = bsVar;
                this.d = new s("OnRequestIntegrityTokenCallback");
                break;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean a(Parcel parcel, int i) {
        bs bsVar = this.c;
        s sVar = this.d;
        int i2 = this.$r8$classId;
        TaskCompletionSource taskCompletionSource = this.a;
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) c.a(parcel);
            c.b(parcel);
            switch (i2) {
                case 1:
                    e$com$google$android$play$core$integrity$bn(bundle);
                    sVar.d("onWarmUpExpressIntegrityToken", new Object[0]);
                    ApiException a = bsVar.f.a(bundle);
                    if (a != null) {
                        taskCompletionSource.trySetException(a);
                        return true;
                    }
                    taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
                    return true;
                default:
                    e$com$google$android$play$core$integrity$bn(bundle);
                    return true;
            }
        }
        if (i != 3) {
            bs bsVar2 = this.b;
            if (i == 4) {
                Parcelable.Creator creator2 = Bundle.CREATOR;
                c.b(parcel);
                bsVar2.a.v(taskCompletionSource);
                return true;
            }
            if (i != 5) {
                return false;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            c.b(parcel);
            bsVar2.a.v(taskCompletionSource);
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) c.a(parcel);
        c.b(parcel);
        switch (i2) {
            case 0:
                c$com$google$android$play$core$integrity$bn(bundle2);
                sVar.d("onRequestExpressIntegrityToken", new Object[0]);
                ApiException a2 = bsVar.f.a(bundle2);
                if (a2 != null) {
                    taskCompletionSource.trySetException(a2);
                    return true;
                }
                bundle2.getLong("request.token.sid");
                Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string2 = bundle2.getString("token");
                if (string2 != null) {
                    taskCompletionSource.trySetResult(new bw(string2));
                    return true;
                }
                a$$ExternalSyntheticBUOutline0.m$2("Null token");
                return true;
            default:
                c$com$google$android$play$core$integrity$bn(bundle2);
                return true;
        }
    }

    public final void c$com$google$android$play$core$integrity$bn(Bundle bundle) {
        this.b.a.v(this.a);
    }

    public final void e$com$google$android$play$core$integrity$bn(Bundle bundle) {
        this.b.a.v(this.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(bs bsVar, TaskCompletionSource taskCompletionSource, byte b) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback", 13);
        Objects.requireNonNull(bsVar);
        this.b = bsVar;
        this.a = taskCompletionSource;
    }
}
