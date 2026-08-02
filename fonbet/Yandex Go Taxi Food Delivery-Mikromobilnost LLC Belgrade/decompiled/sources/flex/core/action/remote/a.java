package flex.core.action.remote;

import defpackage.cnr0;
import defpackage.dez;
import defpackage.dw;
import defpackage.ewj0;
import defpackage.g8e;
import defpackage.hx;
import defpackage.i3y;
import defpackage.kr;
import defpackage.kui0;
import defpackage.m631;
import defpackage.n6u;
import defpackage.nrq;
import defpackage.nui0;
import defpackage.ny61;
import defpackage.pxl;
import defpackage.rzo;
import defpackage.s7s0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tse;
import defpackage.unr0;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wu;
import defpackage.xfz;
import defpackage.xv;
import defpackage.ywl;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.Collections;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class a implements dw, dez {
    public final xv a;
    public final tse b;
    public final zjr c = new zjr(xfz.b(a.class.getSimpleName()));

    public a(xv xvVar, tse tseVar) {
        this.a = xvVar;
        this.b = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, kui0 kui0Var, n6u n6uVar, ContinuationImpl continuationImpl) {
        RemoteActionHandler$handleRemoteAction$1 remoteActionHandler$handleRemoteAction$1;
        int i;
        nui0 nui0Var;
        StackTraceElement stackTraceElement;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof RemoteActionHandler$handleRemoteAction$1) {
            remoteActionHandler$handleRemoteAction$1 = (RemoteActionHandler$handleRemoteAction$1) continuationImpl;
            int i2 = remoteActionHandler$handleRemoteAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteActionHandler$handleRemoteAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteActionHandler$handleRemoteAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteActionHandler$handleRemoteAction$1.label;
                if (i != 0) {
                    b.b(obj);
                    xv xvVar = (xv) s8o.W(aVar, aVar.a);
                    hx hxVar = kui0Var.a;
                    ywl ywlVar = n6uVar.a;
                    remoteActionHandler$handleRemoteAction$1.L$0 = kui0Var;
                    remoteActionHandler$handleRemoteAction$1.L$1 = n6uVar;
                    remoteActionHandler$handleRemoteAction$1.label = 1;
                    obj = ((flex.core.action.remote.executor.a) xvVar).b(hxVar, ywlVar, remoteActionHandler$handleRemoteAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n6uVar = (n6u) remoteActionHandler$handleRemoteAction$1.L$1;
                    kui0Var = (kui0) remoteActionHandler$handleRemoteAction$1.L$0;
                    b.b(obj);
                }
                nui0Var = (nui0) obj;
                if (!(nui0Var instanceof nrq)) {
                    cnr0 cnr0Var = n6uVar.b.a;
                    nrq nrqVar = (nrq) nui0Var;
                    cnr0 cnr0Var2 = nrqVar.c;
                    String str2 = kui0Var.a.a;
                    cnr0 cnr0Var3 = cnr0.b;
                    cnr0 f = vez0.f(Collections.singletonList(new m631(g8e.z("documentQueryPath", str2))));
                    if (cnr0Var2 != null) {
                        cnr0Var = cnr0Var.a(cnr0Var2);
                    }
                    rzo.p((wu) s8o.W(aVar, n6uVar.c), nrqVar.a, new pxl(cnr0Var.a(f)));
                } else {
                    if (!(nui0Var instanceof ewj0)) {
                        w511.b();
                        return null;
                    }
                    rzo.p((wu) s8o.W(aVar, n6uVar.c), kui0Var.b, n6uVar.b);
                    zjr zjrVar = aVar.c;
                    i3y a = xfz.a(xfz.d(((ewj0) nui0Var).a.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                    s7s0 s7s0Var = zjrVar.c.a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    tjr tjrVar = tjr.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        Integer num = new Integer(stackTraceElement.getLineNumber());
                        Integer num2 = num.intValue() > 0 ? num : null;
                        if (num2 == null || (str = num2.toString()) == null) {
                            str = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str);
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, "Got failed response while dispatching remote action", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                }
                return zy11.a;
            }
        }
        remoteActionHandler$handleRemoteAction$1 = new RemoteActionHandler$handleRemoteAction$1(aVar, continuationImpl);
        Object obj2 = remoteActionHandler$handleRemoteAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteActionHandler$handleRemoteAction$1.label;
        if (i != 0) {
        }
        nui0Var = (nui0) obj2;
        if (!(nui0Var instanceof nrq)) {
        }
        return zy11.a;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.b, null, null, new RemoteActionHandler$handle$1(this, (kui0) krVar, n6uVar, null), 3);
    }
}
