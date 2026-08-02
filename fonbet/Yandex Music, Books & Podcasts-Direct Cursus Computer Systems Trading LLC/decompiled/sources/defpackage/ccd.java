package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ccd implements ServiceConnection {
    public final Context a;
    public final tt1 b;
    public xiu c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;

    public ccd(t tVar, atg atgVar) {
        String str = atgVar.d;
        String str2 = atgVar.o;
        tVar.getClass();
        str.getClass();
        Context applicationContext = tVar.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : tVar;
        this.f = SQLiteDatabase.OPEN_FULLMUTEX;
        this.g = 65537;
        this.h = str;
        this.i = 20121101;
        this.j = str2;
        this.b = new tt1(15, this);
    }

    public final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            xiu xiuVar = this.c;
            if (xiuVar != null) {
                dcd dcdVar = (dcd) xiuVar.c;
                atg atgVar = (atg) xiuVar.b;
                ccd ccdVar = dcdVar.c;
                if (ccdVar != null) {
                    ccdVar.c = null;
                }
                dcdVar.c = null;
                ctg i = dcdVar.i();
                qzc qzcVar = i.e;
                if (qzcVar != null) {
                    ((View) qzcVar.b).setVisibility(8);
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    Set<String> set = atgVar.b;
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.isEmpty())) {
                        i.k();
                        return;
                    }
                    if (stringArrayList != null && stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        ctg i2 = dcdVar.i();
                        if (string2 != null && !string2.isEmpty()) {
                            dcdVar.o(atgVar, bundle);
                            return;
                        }
                        qzc qzcVar2 = i2.e;
                        if (qzcVar2 != null) {
                            ((View) qzcVar2.b).setVisibility(0);
                        }
                        gvt.r(new g06(dcdVar, bundle, atgVar, i2), bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        dcdVar.a("new_permissions", TextUtils.join(StringUtils.COMMA, hashSet));
                    }
                    atgVar.b = hashSet;
                }
                i.k();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.f);
        obtain.arg1 = this.i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
