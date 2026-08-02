package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.a;
import defpackage.a271;
import defpackage.aj31;
import defpackage.dq71;
import defpackage.mdh;
import defpackage.nm81;
import defpackage.ny61;
import defpackage.rr41;
import defpackage.s421;
import defpackage.sjh;
import defpackage.sp81;
import defpackage.tje;
import defpackage.to71;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xs81;
import defpackage.z581;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes7.dex */
public final class j72 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ to71 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ a271 e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(to71 to71Var, Context context, a271 a271Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.c = to71Var;
        this.d = context;
        this.e = a271Var;
        this.f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j72(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((j72) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sp81 sp81Var;
        MediatedAdapterInfo a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        to71 to71Var = this.c;
        Context context = this.d;
        ArrayList<zp1> arrayList = this.f;
        this.b = 1;
        to71Var.getClass();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        nm81 nm81Var = new nm81();
        for (zp1 zp1Var : arrayList) {
            s421 s421Var = to71Var.a;
            a i2 = ((rr41) s421Var.c).i(context, zp1Var, a.class);
            if (i2 != null) {
                ((xs81) s421Var.x).getClass();
                sp81Var = new sp81(i2);
            } else {
                sp81Var = null;
            }
            if (i2 == null) {
                countDownLatch.countDown();
            } else {
                aj31 aj31Var = (aj31) s421Var.w;
                aj31Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("failure_reason", "Can't create bidder token loader.");
                linkedHashMap.put(ACSPConstants.STATUS, "error");
                if (sp81Var != null) {
                    linkedHashMap.putAll(dq71.a(sp81Var));
                }
                ((z581) aj31Var.b).a(context, hm2.h, zp1Var, (sp81Var == null || (a = sp81Var.a()) == null) ? null : a.getNetworkName(), linkedHashMap);
                countDownLatch.countDown();
            }
        }
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new k72(to71Var, countDownLatch, arrayList2, nm81Var, null), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
