package io.appmetrica.analytics.accessibilitysystemwrapper.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final ContentResolver b;

    public a(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityProperties a() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.accessibilitysystemwrapper.impl.a.a():io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityProperties");
    }

    public final Boolean a(String str) {
        try {
            int i = Settings.Secure.getInt(this.b, str);
            if (i == 0) {
                return Boolean.FALSE;
            }
            if (i != 1) {
                return null;
            }
            return Boolean.TRUE;
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }
}
