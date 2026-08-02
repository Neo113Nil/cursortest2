package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import defpackage.c5p;
import defpackage.coo;
import defpackage.eo0;
import defpackage.g3a;
import defpackage.gao;
import defpackage.h8s;
import defpackage.hbd;
import defpackage.i6c;
import defpackage.ild;
import defpackage.j0n;
import defpackage.j66;
import defpackage.j8s;
import defpackage.kpm;
import defpackage.lno;
import defpackage.mzw;
import defpackage.nmd;
import defpackage.onx;
import defpackage.os6;
import defpackage.oxd;
import defpackage.po0;
import defpackage.q5i;
import defpackage.rwd;
import defpackage.ry2;
import defpackage.sy2;
import defpackage.ty2;
import defpackage.uy2;
import defpackage.vs6;
import defpackage.vtm;
import defpackage.vy2;
import defpackage.w8c;
import defpackage.y1g;
import defpackage.zpj;
import defpackage.zyw;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        os6 os6Var = vs6.a;
        os6.b(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            os6 os6Var = vs6.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        if (stringExtra != null) {
            onx onxVar = null;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        vy2 vy2Var = (vy2) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (vy2Var != null) {
                            zyw z = ild.z(this);
                            new ry2(false, null, null, true, null, null, false);
                            ry2 ry2Var = vy2Var.b;
                            y1g.G(ry2Var);
                            uy2 uy2Var = vy2Var.a;
                            y1g.G(uy2Var);
                            ty2 ty2Var = vy2Var.f;
                            y1g.G(ty2Var);
                            sy2 sy2Var = vy2Var.g;
                            y1g.G(sy2Var);
                            vy2 vy2Var2 = new vy2(uy2Var, ry2Var, z.k, vy2Var.d, vy2Var.e, ty2Var, sy2Var, vy2Var.h);
                            q5i a = h8s.a();
                            a.d = new i6c[]{new i6c("auth_api_credentials_begin_sign_in", 8L)};
                            a.c = new vtm(z, vy2Var2);
                            a.a = false;
                            a.b = 1553;
                            onxVar = z.c(0, a.c());
                            g3a g3aVar = new g3a(23, new oxd(this, intExtra, 0));
                            onxVar.getClass();
                            lno lnoVar = j8s.a;
                            onxVar.d(lnoVar, g3aVar);
                            final int i = 3;
                            onxVar.c(lnoVar, new zpj(this) { // from class: nxd
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.zpj
                                public final void d(Exception exc) {
                                    String str;
                                    String str2;
                                    int i2 = i;
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i2) {
                                        case 0:
                                            int i3 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            resultReceiver2.getClass();
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i4 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            resultReceiver3.getClass();
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            resultReceiver4.getClass();
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            resultReceiver5.getClass();
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (onxVar == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        j0n j0nVar = (j0n) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (j0nVar != null) {
                            po0 po0Var = w8c.k;
                            rwd rwdVar = new rwd(13);
                            Looper mainLooper = getMainLooper();
                            y1g.H(mainLooper, "Looper must not be null.");
                            w8c w8cVar = new w8c(this, this, po0Var, eo0.M, new nmd(rwdVar, mainLooper));
                            q5i a2 = h8s.a();
                            a2.c = new kpm(25, w8cVar, j0nVar);
                            a2.b = 5407;
                            onxVar = w8cVar.c(0, a2.c());
                            g3a g3aVar2 = new g3a(20, new oxd(this, intExtra2, 2));
                            onxVar.getClass();
                            lno lnoVar2 = j8s.a;
                            onxVar.d(lnoVar2, g3aVar2);
                            final int i2 = 0;
                            onxVar.c(lnoVar2, new zpj(this) { // from class: nxd
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.zpj
                                public final void d(Exception exc) {
                                    String str;
                                    String str2;
                                    int i22 = i2;
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i22) {
                                        case 0:
                                            int i3 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            resultReceiver2.getClass();
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i4 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            resultReceiver3.getClass();
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            resultReceiver4.getClass();
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            resultReceiver5.getClass();
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (onxVar == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        coo cooVar = (coo) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (cooVar != null) {
                            zyw zywVar = new zyw(this, new mzw());
                            coo cooVar2 = new coo(cooVar.a, zywVar.k, cooVar.c);
                            q5i a3 = h8s.a();
                            a3.d = new i6c[]{j66.j};
                            a3.c = new c5p(zywVar, cooVar2, 18);
                            a3.a = false;
                            a3.b = 1536;
                            onxVar = zywVar.c(0, a3.c());
                            g3a g3aVar3 = new g3a(21, new oxd(this, intExtra3, 1));
                            onxVar.getClass();
                            lno lnoVar3 = j8s.a;
                            onxVar.d(lnoVar3, g3aVar3);
                            final int i3 = 1;
                            onxVar.c(lnoVar3, new zpj(this) { // from class: nxd
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.zpj
                                public final void d(Exception exc) {
                                    String str;
                                    String str2;
                                    int i22 = i3;
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i22) {
                                        case 0:
                                            int i32 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            resultReceiver2.getClass();
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i4 = HiddenActivity.c;
                                            str = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            resultReceiver3.getClass();
                                            hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            resultReceiver4.getClass();
                                            hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            str2 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            resultReceiver5.getClass();
                                            hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (onxVar == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        hbd hbdVar = (hbd) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (hbdVar != null) {
                            zyw z2 = ild.z(this);
                            String str = hbdVar.a;
                            y1g.G(str);
                            String str2 = hbdVar.d;
                            hbd hbdVar2 = new hbd(hbdVar.f, str, hbdVar.b, z2.k, str2, hbdVar.e);
                            q5i a4 = h8s.a();
                            a4.d = new i6c[]{j66.k};
                            gao gaoVar = new gao();
                            gaoVar.a = hbdVar2;
                            a4.c = gaoVar;
                            a4.b = 1555;
                            onxVar = z2.c(0, a4.c());
                            g3a g3aVar4 = new g3a(22, new oxd(this, intExtra4, 3));
                            onxVar.getClass();
                            lno lnoVar4 = j8s.a;
                            onxVar.d(lnoVar4, g3aVar4);
                            final int i4 = 2;
                            onxVar.c(lnoVar4, new zpj(this) { // from class: nxd
                                public final /* synthetic */ HiddenActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.zpj
                                public final void d(Exception exc) {
                                    String str3;
                                    String str22;
                                    int i22 = i4;
                                    HiddenActivity hiddenActivity = this.b;
                                    switch (i22) {
                                        case 0:
                                            int i32 = HiddenActivity.c;
                                            str3 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.a;
                                            resultReceiver2.getClass();
                                            hiddenActivity.a(resultReceiver2, str3, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        case 1:
                                            int i42 = HiddenActivity.c;
                                            str3 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity.a;
                                            resultReceiver3.getClass();
                                            hiddenActivity.a(resultReceiver3, str3, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                        case 2:
                                            int i5 = HiddenActivity.c;
                                            str22 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = hiddenActivity.a;
                                            resultReceiver4.getClass();
                                            hiddenActivity.a(resultReceiver4, str22, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            int i6 = HiddenActivity.c;
                                            str22 = ((exc instanceof qo0) && vs6.b.contains(Integer.valueOf(((qo0) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = hiddenActivity.a;
                                            resultReceiver5.getClass();
                                            hiddenActivity.a(resultReceiver5, str22, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (onxVar == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
