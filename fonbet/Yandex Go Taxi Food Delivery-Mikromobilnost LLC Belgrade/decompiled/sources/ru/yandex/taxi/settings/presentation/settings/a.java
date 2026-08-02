package ru.yandex.taxi.settings.presentation.settings;

import android.app.NotificationChannel;
import defpackage.ad5;
import defpackage.evu0;
import defpackage.i1g0;
import defpackage.j2g0;
import defpackage.ny61;
import defpackage.o4g0;
import defpackage.pzt0;
import defpackage.q3g0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u3g0;
import defpackage.v3g0;
import defpackage.w550;
import defpackage.wh9;
import defpackage.xh9;
import defpackage.yh9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.settings.domain.b;
import ru.yandex.taxi.settings.domain.d;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public final b A;
    public final wh9 B;
    public final q3g0 C;
    public final o4g0 D;
    public final w550 E;
    public u3g0 F;
    public pzt0 G;
    public final d x;
    public final j2g0 y;
    public final i1g0 z;

    public a(d dVar, j2g0 j2g0Var, i1g0 i1g0Var, b bVar, wh9 wh9Var, q3g0 q3g0Var, o4g0 o4g0Var, w550 w550Var) {
        super(v3g0.class);
        this.x = dVar;
        this.y = j2g0Var;
        this.z = i1g0Var;
        this.A = bVar;
        this.B = wh9Var;
        this.C = q3g0Var;
        this.D = o4g0Var;
        this.E = w550Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)|15|16))|40|6|7|(0)(0)|11|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r5 = r5.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r5 = r5.a;
        r6 = new java.util.ArrayList();
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r1 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if ((r1 instanceof defpackage.y5r0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r6.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        r0.d(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0043, CancellationException -> 0x006c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x006c, all -> 0x0043, blocks: (B:10:0x0025, B:11:0x003c, B:13:0x0040, B:21:0x0033), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        PushSettingsPresenter$pushSettingsToServer$1 pushSettingsPresenter$pushSettingsToServer$1;
        int i;
        u3g0 u3g0Var;
        d dVar = aVar.x;
        if (continuationImpl instanceof PushSettingsPresenter$pushSettingsToServer$1) {
            pushSettingsPresenter$pushSettingsToServer$1 = (PushSettingsPresenter$pushSettingsToServer$1) continuationImpl;
            int i2 = pushSettingsPresenter$pushSettingsToServer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSettingsPresenter$pushSettingsToServer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSettingsPresenter$pushSettingsToServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSettingsPresenter$pushSettingsToServer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushSettingsPresenter$pushSettingsToServer$1.label = 1;
                    obj = dVar.c(pushSettingsPresenter$pushSettingsToServer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                u3g0Var = (u3g0) obj;
                if (u3g0Var != null) {
                    aVar.F = u3g0Var;
                }
                return zy11.a;
            }
        }
        pushSettingsPresenter$pushSettingsToServer$1 = new PushSettingsPresenter$pushSettingsToServer$1(aVar, continuationImpl);
        Object obj2 = pushSettingsPresenter$pushSettingsToServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsPresenter$pushSettingsToServer$1.label;
        if (i != 0) {
        }
        u3g0Var = (u3g0) obj2;
        if (u3g0Var != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null && pzt0Var.isActive()) {
            pzt0 pzt0Var2 = this.G;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            tje.N(Jg(), null, CoroutineStart.UNDISPATCHED, new PushSettingsPresenter$detachView$1(null, this), 1);
        }
        super.Cg();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        i1g0 i1g0Var = this.z;
        List<NotificationChannel> notificationChannels = i1g0Var.b.m.b.getNotificationChannels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationChannels) {
            if (((NotificationChannel) obj).getImportance() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NotificationChannel) it.next()).getId());
        }
        r0 r0Var = i1g0Var.a.a;
        List J0 = kotlin.collections.a.J0(arrayList2);
        r0Var.getClass();
        r0Var.m(null, J0);
        wh9 wh9Var = this.B;
        yh9 yh9Var = wh9Var.a;
        String str = ((xh9) yh9Var.a.getValue()).a;
        if (evu0.J(str)) {
            return;
        }
        xh9 xh9Var = new xh9(str, wh9Var.b.a.a(str));
        r0 r0Var2 = yh9Var.a;
        r0Var2.getClass();
        r0Var2.m(null, xh9Var);
    }
}
