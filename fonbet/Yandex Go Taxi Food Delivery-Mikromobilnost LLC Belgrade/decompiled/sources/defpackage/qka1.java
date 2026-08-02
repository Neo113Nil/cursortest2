package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes.dex */
public final class qka1 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final zzdd d;
    public final boolean e;
    public final Long f;
    public final String g;

    public qka1(Context context, zzdd zzddVar, Long l) {
        this.e = true;
        cvw.l(context);
        Context applicationContext = context.getApplicationContext();
        cvw.l(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (zzddVar != null) {
            this.d = zzddVar;
            this.e = zzddVar.zzc;
            this.c = zzddVar.zzb;
            this.g = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
