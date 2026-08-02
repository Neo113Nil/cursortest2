package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.yandex.passport.api.w1;
import com.yandex.passport.common.core.g;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.social.NativeSocialHelper;
import com.yandex.passport.internal.ui.social.authenticators.f;
import com.yandex.passport.internal.z;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public abstract class mbo {
    public boolean a;
    public Object b;
    public Object c;
    public final Object d;

    public mbo(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = ((UUID) this.b).toString();
        uuid.getClass();
        this.c = new t4w(uuid, (c4w) null, cls.getName(), (String) null, (q97) null, (q97) null, 0L, 0L, 0L, (fa6) null, 0, (bk2) null, 0L, 0L, 0L, 0L, false, (nxj) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.d = vop.d(cls.getName());
    }

    public p4w a() {
        List split$default;
        p4w b = b();
        fa6 fa6Var = ((t4w) this.c).j;
        boolean z = !fa6Var.i.isEmpty() || fa6Var.e || fa6Var.c || fa6Var.d;
        t4w t4wVar = (t4w) this.c;
        if (t4wVar.q) {
            if (z) {
                xq0.x("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (t4wVar.g > 0) {
                xq0.x("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = t4wVar.x;
        if (str == null) {
            split$default = StringsKt__StringsKt.split$default(t4wVar.c, new String[]{"."}, false, 0, 6, null);
            String str2 = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.Y(split$default);
            if (str2.length() > 127) {
                str2 = mlr.K(127, str2);
            }
            t4wVar.x = str2;
        } else if (str.length() > 127) {
            ((t4w) this.c).x = mlr.K(127, str);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        t4w t4wVar2 = (t4w) this.c;
        t4wVar2.getClass();
        this.c = new t4w(uuid, t4wVar2.b, t4wVar2.c, t4wVar2.d, new q97(t4wVar2.e), new q97(t4wVar2.f), t4wVar2.g, t4wVar2.h, t4wVar2.i, new fa6(t4wVar2.j), t4wVar2.k, t4wVar2.l, t4wVar2.m, t4wVar2.n, t4wVar2.o, t4wVar2.p, t4wVar2.q, t4wVar2.r, t4wVar2.s, t4wVar2.u, t4wVar2.v, t4wVar2.w, t4wVar2.x, t4wVar2.y, 524288);
        return b;
    }

    public abstract p4w b();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f c() {
        String str;
        String str2;
        a0 a0Var = (a0) this.b;
        if (this.a) {
            l lVar = (l) this.d;
            Intent intent = null;
            if (lVar != null) {
                g gVar = lVar.e;
                if (gVar.h == 12) {
                    str = gVar.v;
                    Context context = (Context) this.c;
                    xy0 xy0Var = NativeSocialHelper.a;
                    w1 w1Var = a0Var.a;
                    z zVar = a0Var.b;
                    str2 = (String) xy0Var.get(w1Var);
                    if (str2 != null) {
                        Intent intent2 = new Intent(str2);
                        intent2.setPackage(context.getPackageName());
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 196608);
                        if (!queryIntentActivities.isEmpty()) {
                            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            intent2.putExtra("account-name", str);
                            intent = intent2;
                        }
                    }
                    if (intent != null) {
                        int ordinal = zVar.ordinal();
                        if (ordinal == 0) {
                            return h(intent);
                        }
                        if (ordinal == 1) {
                            return f(intent);
                        }
                        rj7.n(zVar, " not supported", "Native auth for type ");
                        return null;
                    }
                }
            }
            str = null;
            Context context2 = (Context) this.c;
            xy0 xy0Var2 = NativeSocialHelper.a;
            w1 w1Var2 = a0Var.a;
            z zVar2 = a0Var.b;
            str2 = (String) xy0Var2.get(w1Var2);
            if (str2 != null) {
            }
            if (intent != null) {
            }
        }
        z zVar3 = a0Var.b;
        boolean z = a0Var.d;
        int ordinal2 = zVar3.ordinal();
        if (ordinal2 == 0) {
            return z ? e() : j();
        }
        if (ordinal2 == 1) {
            return z ? d() : i();
        }
        if (ordinal2 == 2) {
            return g();
        }
        b6e.s();
        return null;
    }

    public abstract f d();

    public abstract f e();

    public abstract f f(Intent intent);

    public abstract f g();

    public abstract f h(Intent intent);

    public abstract f i();

    public abstract f j();

    public abstract mbo k();

    public mbo l(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((t4w) this.c).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((t4w) this.c).g) {
            return k();
        }
        xq0.x("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    public mbo(a0 a0Var, Context context, boolean z, l lVar) {
        a0Var.getClass();
        context.getClass();
        this.b = a0Var;
        this.c = context;
        this.a = z;
        this.d = lVar;
    }

    public mbo(lbo lboVar, Function1 function1, boolean z, Function1 function12) {
        this.b = lboVar;
        this.c = function1;
        this.a = z;
        this.d = function12;
    }

    public /* synthetic */ mbo(lbo lboVar, Function1 function1, int i) {
        this(lboVar, function1, (i & 4) == 0, san.c);
    }
}
