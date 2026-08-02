package ru.yandex.music.emergency;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.f0;
import com.yandex.music.shared.utils.system.a;
import defpackage.bfj;
import defpackage.btf;
import defpackage.jyr;
import defpackage.l1b;
import defpackage.pld;
import defpackage.ssg;
import defpackage.tka;
import defpackage.v7g;
import defpackage.vd;
import io.appmetrica.analytics.impl.C0574qb;
import java.io.File;
import java.io.Serializable;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class EmergencyService extends Service {
    public static final /* synthetic */ int b = 0;
    public final jyr a = btf.b(new tka(13));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        Bundle extras2;
        Serializable serializable = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getSerializable("extraFatalException");
        Throwable th = serializable instanceof Throwable ? (Throwable) serializable : null;
        Serializable serializable2 = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getSerializable("extraKeepFile");
        File file = serializable2 instanceof File ? (File) serializable2 : null;
        bfj bfjVar = bfj.d;
        f0 f0Var = new f0(this, "ru.yandex.music.notifications.other");
        f0Var.K.icon = 2131232117;
        f0Var.e = f0.c(getString(R.string.emergency_notification_title));
        f0Var.f = f0.c(getString(R.string.emergency_notification_message));
        Notification o = v7g.o(f0Var);
        o.getClass();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.a(C0574qb.g, l1b.g(this), 1, o);
                startForeground(1, o);
            } catch (ForegroundServiceStartNotAllowedException e) {
                ssg.a(7, "EmergencyHelper", "Check conditions for dataSync service types", e);
                z = false;
            }
        } else {
            startForeground(1, o);
        }
        if (!z) {
            return 2;
        }
        pld.a(new vd(21, this, file, th));
        return 2;
    }
}
