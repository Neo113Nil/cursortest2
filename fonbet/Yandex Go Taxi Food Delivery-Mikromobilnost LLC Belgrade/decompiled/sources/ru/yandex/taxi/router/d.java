package ru.yandex.taxi.router;

import com.yandex.go.proxyprovision.j;
import defpackage.b670;
import defpackage.ck7;
import defpackage.dl40;
import defpackage.evu0;
import defpackage.fkv;
import defpackage.gcn;
import defpackage.gkv;
import defpackage.hkv;
import defpackage.mf1;
import defpackage.ny61;
import defpackage.s2p;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class d {
    public final tse a;
    public final j b;
    public final s2p c;
    public final dl40 d = new dl40(1000L);

    public d(tse tseVar, j jVar, s2p s2pVar) {
        this.a = tseVar;
        this.b = jVar;
        this.c = s2pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, b670 b670Var, gcn gcnVar, ContinuationImpl continuationImpl) {
        InAppCallsEatsKitDelegate$openInAppCallsInternal$1 inAppCallsEatsKitDelegate$openInAppCallsInternal$1;
        int i;
        boolean booleanValue;
        s2p s2pVar = dVar.c;
        if (continuationImpl instanceof InAppCallsEatsKitDelegate$openInAppCallsInternal$1) {
            inAppCallsEatsKitDelegate$openInAppCallsInternal$1 = (InAppCallsEatsKitDelegate$openInAppCallsInternal$1) continuationImpl;
            int i2 = inAppCallsEatsKitDelegate$openInAppCallsInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsEatsKitDelegate$openInAppCallsInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsEatsKitDelegate$openInAppCallsInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsEatsKitDelegate$openInAppCallsInternal$1.label;
                fkv fkvVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = dVar.b;
                    inAppCallsEatsKitDelegate$openInAppCallsInternal$1.L$0 = b670Var;
                    inAppCallsEatsKitDelegate$openInAppCallsInternal$1.L$1 = gcnVar;
                    inAppCallsEatsKitDelegate$openInAppCallsInternal$1.label = 1;
                    obj = jVar.a(inAppCallsEatsKitDelegate$openInAppCallsInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gcnVar = (gcn) inAppCallsEatsKitDelegate$openInAppCallsInternal$1.L$1;
                    b670Var = (b670) inAppCallsEatsKitDelegate$openInAppCallsInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (!booleanValue) {
                    String str = b670Var.b;
                    if (str == null || evu0.J(str)) {
                        gcnVar.a(new ck7(Boolean.FALSE, null));
                        return zy11Var;
                    }
                    s2pVar.c(str);
                    gcnVar.a(new ck7(Boolean.TRUE, null));
                    return zy11Var;
                }
                String str2 = b670Var.a;
                if (str2 != null && !evu0.J(str2)) {
                    String str3 = b670Var.c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    fkvVar = new fkv(str2, str3, b670Var.d);
                }
                gkv gkvVar = new gkv(b670Var.e, b670Var.f, b670Var.g);
                String str4 = b670Var.b;
                s2pVar.j(new hkv(fkvVar, gkvVar, str4 == null ? "" : str4, new mf1((byte) 0, 12, "")), str4, gcnVar);
                return zy11Var;
            }
        }
        inAppCallsEatsKitDelegate$openInAppCallsInternal$1 = new InAppCallsEatsKitDelegate$openInAppCallsInternal$1(dVar, continuationImpl);
        Object obj2 = inAppCallsEatsKitDelegate$openInAppCallsInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsEatsKitDelegate$openInAppCallsInternal$1.label;
        fkv fkvVar2 = null;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (!booleanValue) {
        }
    }

    public final void b(b670 b670Var, gcn gcnVar) {
        dl40 dl40Var = this.d;
        if (dl40Var.satisfiesClickDelay()) {
            dl40Var.updateLastClickOnItemTimestamp();
            tje.N(this.a, null, null, new InAppCallsEatsKitDelegate$openInAppCalls$1(this, b670Var, gcnVar, null), 3);
        }
    }
}
