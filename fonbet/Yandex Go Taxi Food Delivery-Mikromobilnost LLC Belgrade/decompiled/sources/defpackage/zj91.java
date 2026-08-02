package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes.dex */
public final class zj91 extends gp91 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj91(e eVar, Context context, Bundle bundle) {
        super(eVar, true);
        this.x = context;
        this.y = bundle;
        this.z = eVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(1:5)|6|7|(12:40|41|42|10|(1:39)(1:14)|15|16|17|(1:19)(1:35)|20|21|(2:23|24)(4:26|(1:33)(1:29)|30|31))|9|10|(1:12)|39|15|16|17|(0)(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r7.b(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: Exception -> 0x001c, DynamiteModule$LoadingException -> 0x004c, TRY_ENTER, TryCatch #0 {DynamiteModule$LoadingException -> 0x004c, blocks: (B:19:0x0049, B:20:0x0050, B:35:0x004e), top: B:17:0x0047, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: Exception -> 0x001c, TryCatch #2 {Exception -> 0x001c, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x001f, B:10:0x0035, B:12:0x0039, B:15:0x0042, B:19:0x0049, B:20:0x0050, B:21:0x0062, B:26:0x0069, B:30:0x0082, B:35:0x004e, B:38:0x005f, B:41:0x002c), top: B:2:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e A[Catch: Exception -> 0x001c, DynamiteModule$LoadingException -> 0x004c, TryCatch #0 {DynamiteModule$LoadingException -> 0x004c, blocks: (B:19:0x0049, B:20:0x0050, B:35:0x004e), top: B:17:0x0047, outer: #2 }] */
    @Override // defpackage.gp91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        e eVar;
        try {
            Context context = this.x;
            cvw.l(context);
            String X = kp50.X(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(X)) {
                X = kp50.X(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", X);
            zzcr zzcrVar = null;
            if (identifier != 0) {
                try {
                    valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                }
                eVar = this.z;
                boolean z = (valueOf == null && valueOf.booleanValue()) ? false : true;
                eVar.getClass();
                zzcrVar = zzcq.asInterface(gan.c(context, !z ? gan.d : gan.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                eVar.f = zzcrVar;
                if (eVar.f != null) {
                    return;
                }
                int a = gan.a(context, ModuleDescriptor.MODULE_ID);
                zzdd zzddVar = new zzdd(133005L, Math.max(a, r6), Boolean.TRUE.equals(valueOf) || gan.d(context, ModuleDescriptor.MODULE_ID, false) < a, this.y, kp50.X(context));
                zzcr zzcrVar2 = eVar.f;
                cvw.l(zzcrVar2);
                zzcrVar2.initialize(ObjectWrapper.wrap(context), zzddVar, this.a);
                return;
            }
            valueOf = null;
            eVar = this.z;
            if (valueOf == null) {
            }
            eVar.getClass();
            zzcrVar = zzcq.asInterface(gan.c(context, !z ? gan.d : gan.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            eVar.f = zzcrVar;
            if (eVar.f != null) {
            }
        } catch (Exception e) {
            this.z.b(e, true, false);
        }
    }
}
