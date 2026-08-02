package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import defpackage.b3c;
import defpackage.bp6;
import defpackage.c3c;
import defpackage.drn;
import defpackage.f3c;
import defpackage.ftg;
import defpackage.j18;
import defpackage.j3c;
import defpackage.jj4;
import defpackage.klx;
import defpackage.xwi;
import defpackage.zvp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/t;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends t {
    public o a;

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            str.getClass();
            printWriter.getClass();
            if (klx.a0(str, printWriter, strArr)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // defpackage.hn5, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        o oVar = this.a;
        if (oVar != null) {
            oVar.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o ftgVar;
        c3c c3cVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!j3c.n.get()) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            synchronized (j3c.class) {
                j3c.k(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        intent.getClass();
        if ("PassThrough".equals(intent.getAction())) {
            Intent intent2 = getIntent();
            intent2.getClass();
            Bundle i = xwi.i(intent2);
            if (!bp6.a.contains(xwi.class) && i != null) {
                try {
                    String string = i.getString("error_type");
                    if (string == null) {
                        string = i.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = i.getString("error_description");
                    if (string2 == null) {
                        string2 = i.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    c3cVar = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new c3c(string2) : new f3c(string2);
                } catch (Throwable th) {
                    bp6.a(xwi.class, th);
                }
                Intent intent3 = getIntent();
                intent3.getClass();
                setResult(0, xwi.e(intent3, null, c3cVar));
                finish();
                return;
            }
            c3cVar = null;
            Intent intent32 = getIntent();
            intent32.getClass();
            setResult(0, xwi.e(intent32, null, c3cVar));
            finish();
            return;
        }
        Intent intent4 = getIntent();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        o D = supportFragmentManager.D("SingleFragment");
        o oVar = D;
        if (D == null) {
            intent4.getClass();
            if ("FacebookDialogFragment".equals(intent4.getAction())) {
                b3c b3cVar = new b3c();
                b3cVar.setRetainInstance(true);
                b3cVar.show(supportFragmentManager, "SingleFragment");
                oVar = b3cVar;
            } else if ("DeviceShareDialogFragment".equals(intent4.getAction())) {
                Log.w("com.facebook.FacebookActivity", "Please stop use Device Share Dialog, this feature has been disabled and all related classes in Facebook Android SDK will be removed from v13.0.0 release.");
                j18 j18Var = new j18();
                j18Var.setRetainInstance(true);
                Parcelable parcelableExtra = intent4.getParcelableExtra("content");
                if (parcelableExtra == null) {
                    jj4.j("null cannot be cast to non-null type com.facebook.share.model.ShareContent<*, *>");
                    return;
                } else {
                    j18Var.l = (zvp) parcelableExtra;
                    j18Var.show(supportFragmentManager, "SingleFragment");
                    oVar = j18Var;
                }
            } else {
                if ("ReferralFragment".equals(intent4.getAction())) {
                    ftgVar = new drn();
                    ftgVar.setRetainInstance(true);
                    a aVar = new a(supportFragmentManager);
                    aVar.d(R.id.com_facebook_fragment_container, ftgVar, "SingleFragment", 1);
                    aVar.j();
                } else {
                    ftgVar = new ftg();
                    ftgVar.setRetainInstance(true);
                    a aVar2 = new a(supportFragmentManager);
                    aVar2.d(R.id.com_facebook_fragment_container, ftgVar, "SingleFragment", 1);
                    aVar2.j();
                }
                oVar = ftgVar;
            }
        }
        this.a = oVar;
    }
}
