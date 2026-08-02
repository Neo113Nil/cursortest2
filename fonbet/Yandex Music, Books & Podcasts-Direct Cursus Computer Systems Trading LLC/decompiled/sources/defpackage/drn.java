package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.facebook.CustomTabMainActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.math.BigInteger;
import java.util.Random;

@Deprecated
/* loaded from: classes.dex */
public class drn extends o {
    public sfm g;

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        t l;
        super.onActivityResult(i, i2, intent);
        sfm sfmVar = this.g;
        sfmVar.getClass();
        boolean z = true;
        if (i != 1) {
            return;
        }
        if (intent != null) {
            int i3 = CustomTabMainActivity.c;
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                if (stringExtra.startsWith(ox6.H("fb" + j3c.c() + "://authorize"))) {
                    Bundle J = gvt.J(Uri.parse(stringExtra).getQuery());
                    if (((String) sfmVar.c) != null) {
                        z = ((String) sfmVar.c).equals(J.getString("state"));
                        sfmVar.c = null;
                    }
                    if (z) {
                        intent.putExtras(J);
                    } else {
                        intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                        i2 = 0;
                    }
                }
            }
        }
        drn drnVar = (drn) sfmVar.a;
        if (!drnVar.isAdded() || (l = drnVar.l()) == null) {
            return;
        }
        l.setResult(i2, intent);
        l.finish();
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sfm sfmVar = new sfm();
        sfmVar.a = this;
        this.g = sfmVar;
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        t l;
        super.onResume();
        sfm sfmVar = this.g;
        drn drnVar = (drn) sfmVar.a;
        if (drnVar.l() != null && drnVar.l().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            if (((String) sfmVar.b) == null) {
                sfmVar.b = ox6.F();
            }
            if (((String) sfmVar.b) != null) {
                Bundle bundle = new Bundle();
                String bigInteger = new BigInteger(100, new Random()).toString(32);
                bigInteger.getClass();
                sfmVar.c = bigInteger;
                bundle.putString("redirect_uri", ox6.H("fb" + j3c.c() + "://authorize"));
                bundle.putString(CommonUrlParts.APP_ID, j3c.c());
                bundle.putString("state", (String) sfmVar.c);
                if (j3c.k) {
                    kx6.b(ix6.g(bundle, "share_referral"));
                }
                Intent intent = new Intent(drnVar.l(), (Class<?>) CustomTabMainActivity.class);
                int i = CustomTabMainActivity.c;
                intent.putExtra("CustomTabMainActivity.extra_action", "share_referral");
                intent.putExtra("CustomTabMainActivity.extra_params", bundle);
                if (((String) sfmVar.b) == null) {
                    sfmVar.b = ox6.F();
                }
                intent.putExtra("CustomTabMainActivity.extra_chromePackage", (String) sfmVar.b);
                drnVar.startActivityForResult(intent, 1);
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
        drn drnVar2 = (drn) sfmVar.a;
        if (!drnVar2.isAdded() || (l = drnVar2.l()) == null) {
            return;
        }
        l.setResult(0, intent2);
        l.finish();
    }
}
