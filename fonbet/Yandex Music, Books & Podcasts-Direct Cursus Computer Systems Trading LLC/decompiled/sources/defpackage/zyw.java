package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class zyw extends omd {
    public static final po0 l = new po0("Auth.Api.Identity.CredentialSaving.API", new bww(5), new go0());
    public static final po0 m = new po0("Auth.Api.Identity.SignIn.API", new bww(6), new go0());
    public final String k;

    public zyw(Activity activity, rzw rzwVar) {
        super(activity, activity, m, rzwVar, nmd.c);
        this.k = bzw.a();
    }

    public static String d(Intent intent) {
        Status status = Status.g;
        if (intent == null) {
            throw new qo0(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : asq.A(byteArrayExtra, creator));
        if (status2 == null) {
            throw new qo0(Status.i);
        }
        if (!status2.d()) {
            throw new qo0(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new qo0(status);
    }

    public static sfq f(Intent intent) {
        Status status = Status.g;
        if (intent == null) {
            throw new qo0(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : asq.A(byteArrayExtra, creator));
        if (status2 == null) {
            throw new qo0(Status.i);
        }
        if (!status2.d()) {
            throw new qo0(status2);
        }
        Parcelable.Creator<sfq> creator2 = sfq.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        sfq sfqVar = (sfq) (byteArrayExtra2 != null ? asq.A(byteArrayExtra2, creator2) : null);
        if (sfqVar != null) {
            return sfqVar;
        }
        throw new qo0(status);
    }

    public onx e(rad radVar) {
        q5i a = h8s.a();
        a.d = new i6c[]{j66.l};
        a.c = new nur(11, this, radVar);
        a.b = 1653;
        return c(0, a.c());
    }

    public zyw(HiddenActivity hiddenActivity, mzw mzwVar) {
        super(hiddenActivity, hiddenActivity, l, mzwVar, nmd.c);
        this.k = bzw.a();
    }

    public zyw(Context context, rzw rzwVar) {
        super(context, null, m, rzwVar, nmd.c);
        this.k = bzw.a();
    }
}
