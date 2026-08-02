package defpackage;

import android.util.Log;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class zlp {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final aec a;
    public final iec b;
    public final lnp c;
    public final eib d;
    public final CoroutineContext e;

    public zlp(aec aecVar, iec iecVar, lnp lnpVar, eib eibVar, CoroutineContext coroutineContext) {
        aecVar.getClass();
        iecVar.getClass();
        lnpVar.getClass();
        eibVar.getClass();
        coroutineContext.getClass();
        this.a = aecVar;
        this.b = iecVar;
        this.c = lnpVar;
        this.d = eibVar;
        this.e = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zlp zlpVar, cg6 cg6Var) {
        ylp ylpVar;
        int i;
        boolean z;
        Boolean a;
        if (cg6Var instanceof ylp) {
            ylpVar = (ylp) cg6Var;
            int i2 = ylpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ylpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ylpVar.k;
                nm6 nm6Var = nm6.a;
                i = ylpVar.m;
                z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    lnp lnpVar = zlpVar.c;
                    ylpVar.j = zlpVar;
                    ylpVar.m = 1;
                    if (lnpVar.b(ylpVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zlpVar = ylpVar.j;
                    qgg.h0(obj);
                }
                lnp lnpVar2 = zlpVar.c;
                a = lnpVar2.a.a();
                if (a == null) {
                    z = a.booleanValue();
                } else {
                    Boolean a2 = lnpVar2.b.a();
                    if (a2 != null) {
                        z = a2.booleanValue();
                    }
                }
                if (z) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f <= zlpVar.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        ylpVar = new ylp(zlpVar, cg6Var);
        Object obj2 = ylpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ylpVar.m;
        z = true;
        if (i != 0) {
        }
        lnp lnpVar22 = zlpVar.c;
        a = lnpVar22.a.a();
        if (a == null) {
        }
        if (z) {
        }
    }
}
