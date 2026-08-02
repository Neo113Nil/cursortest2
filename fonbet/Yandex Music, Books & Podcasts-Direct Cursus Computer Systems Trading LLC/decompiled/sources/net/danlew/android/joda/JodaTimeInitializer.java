package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import defpackage.b3o;
import defpackage.jis;
import defpackage.kac;
import defpackage.lme;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;

/* loaded from: classes5.dex */
public class JodaTimeInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        try {
            b3o b3oVar = new b3o(context);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
            }
            DateTimeZone.u(b3oVar);
            DateTimeZone.b.set(b3oVar);
            context.getApplicationContext().registerReceiver(new jis(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e) {
            kac.k("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e);
            return null;
        }
    }
}
