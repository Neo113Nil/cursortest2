package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.a441;
import defpackage.cr71;
import defpackage.gi81;
import defpackage.i081;
import defpackage.ix71;
import defpackage.lt71;
import defpackage.sia1;
import defpackage.vc71;
import defpackage.vr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class qc extends SuspendLambda implements wls {
    public final /* synthetic */ gi81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(gi81 gi81Var, Continuation continuation) {
        super(2, continuation);
        this.b = gi81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qc(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new qc(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vc71 vc71Var;
        ResolveInfo resolveInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        a441 a441Var = this.b.b;
        vr vrVar = (vr) a441Var.b;
        vrVar.getClass();
        if (AdvertisingIdClient.class != 0) {
            try {
                Object[] objArr = {vrVar.a};
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                ArrayList arrayList = new ArrayList();
                int length = copyOf.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = copyOf[i];
                    Class<?> cls = obj2 != null ? obj2.getClass() : null;
                    if (cls != null) {
                        arrayList.add(cls);
                    }
                }
                a = sia1.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", null, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(objArr, objArr.length));
            } catch (Throwable unused) {
            }
            if (a != null) {
                String str = (String) sia1.b(a, "getId", new Object[0]);
                Boolean bool = (Boolean) sia1.b(a, "isLimitAdTrackingEnabled", new Object[0]);
                if (bool != null && str != null) {
                    vc71Var = new vc71(str, bool.booleanValue());
                    if (vc71Var == null) {
                        return vc71Var;
                    }
                    cr71 cr71Var = (cr71) a441Var.c;
                    i081 i081Var = (i081) cr71Var.w;
                    Context context = (Context) cr71Var.x;
                    i081Var.getClass();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    ((lt71) cr71Var.b).getClass();
                    try {
                        resolveInfo = context.getPackageManager().resolveService(intent, 0);
                    } catch (Throwable unused2) {
                        resolveInfo = null;
                    }
                    if (resolveInfo == null) {
                        return null;
                    }
                    try {
                        jy0 jy0Var = new jy0();
                        if (!context.bindService(intent, jy0Var, 1)) {
                            return null;
                        }
                        ((ix71) cr71Var.c).getClass();
                        vc71 a2 = ix71.a(jy0Var);
                        context.unbindService(jy0Var);
                        return a2;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }
        }
        vc71Var = null;
        if (vc71Var == null) {
        }
    }
}
