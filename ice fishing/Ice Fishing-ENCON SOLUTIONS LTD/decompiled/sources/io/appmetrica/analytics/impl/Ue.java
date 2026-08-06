package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ue implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5164b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5165c;

    public Ue(Context context, String str, String str2) {
        this.f5163a = context;
        this.f5164b = str;
        this.f5165c = str2;
    }

    public final Ue a(Context context, String str, String str2) {
        return new Ue(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ue)) {
            return false;
        }
        Ue ue = (Ue) obj;
        return kotlin.jvm.internal.i.a(this.f5163a, ue.f5163a) && kotlin.jvm.internal.i.a(this.f5164b, ue.f5164b) && kotlin.jvm.internal.i.a(this.f5165c, ue.f5165c);
    }

    public final int hashCode() {
        return this.f5165c.hashCode() + C1.a.e(this.f5164b, this.f5163a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f5163a + ", prefName=" + this.f5164b + ", prefValueName=" + this.f5165c + ')';
    }

    public static Ue a(Ue ue, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = ue.f5163a;
        }
        if ((i2 & 2) != 0) {
            str = ue.f5164b;
        }
        if ((i2 & 4) != 0) {
            str2 = ue.f5165c;
        }
        ue.getClass();
        return new Ue(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final String a() {
        String string = this.f5163a.getSharedPreferences(this.f5164b, 0).getString(this.f5165c, "");
        return string == null ? "" : string;
    }
}
