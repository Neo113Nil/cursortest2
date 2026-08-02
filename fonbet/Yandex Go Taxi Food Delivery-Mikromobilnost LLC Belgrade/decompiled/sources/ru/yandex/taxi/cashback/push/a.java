package ru.yandex.taxi.cashback.push;

import com.yandex.go.payments.paymentlist.data.c;
import defpackage.cda0;
import defpackage.h9y0;
import defpackage.i5p;
import defpackage.jbh;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xww0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;

/* loaded from: classes5.dex */
public final class a implements xww0 {
    public final wnt a;
    public final rqo b;
    public final cda0 c;
    public final h9y0 d;

    public a(wnt wntVar, rqo rqoVar, cda0 cda0Var, h9y0 h9y0Var) {
        this.a = wntVar;
        this.b = rqoVar;
        this.c = cda0Var;
        this.d = h9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        WalletBalanceUpdatePushHandler$handle$1 walletBalanceUpdatePushHandler$handle$1;
        int i;
        Object obj;
        i5p i5pVar;
        if (continuationImpl instanceof WalletBalanceUpdatePushHandler$handle$1) {
            walletBalanceUpdatePushHandler$handle$1 = (WalletBalanceUpdatePushHandler$handle$1) continuationImpl;
            int i2 = walletBalanceUpdatePushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletBalanceUpdatePushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walletBalanceUpdatePushHandler$handle$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walletBalanceUpdatePushHandler$handle$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj2);
                    wnt wntVar = this.a;
                    String str = (String) map.get("extra");
                    KSerializer serializer = i5p.Companion.serializer();
                    if (str != null && str.length() != 0) {
                        try {
                            obj = ((xnt) wntVar).c(str, serializer);
                        } catch (SerializationException e) {
                            jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str}, 1)));
                        }
                        i5pVar = (i5p) obj;
                        if (i5pVar == null && i5pVar.k) {
                            walletBalanceUpdatePushHandler$handle$1.L$0 = null;
                            walletBalanceUpdatePushHandler$handle$1.L$1 = null;
                            walletBalanceUpdatePushHandler$handle$1.label = 1;
                            if (c(walletBalanceUpdatePushHandler$handle$1) == obj3) {
                                return obj3;
                            }
                        } else {
                            z = false;
                        }
                    }
                    obj = null;
                    i5pVar = (i5p) obj;
                    if (i5pVar == null) {
                    }
                    z = false;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return Boolean.valueOf(z);
            }
        }
        walletBalanceUpdatePushHandler$handle$1 = new WalletBalanceUpdatePushHandler$handle$1(this, continuationImpl);
        Object obj22 = walletBalanceUpdatePushHandler$handle$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walletBalanceUpdatePushHandler$handle$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WalletBalanceUpdatePushHandler$updateWalletBalance$1 walletBalanceUpdatePushHandler$updateWalletBalance$1;
        int i;
        boolean z;
        if (continuationImpl instanceof WalletBalanceUpdatePushHandler$updateWalletBalance$1) {
            walletBalanceUpdatePushHandler$updateWalletBalance$1 = (WalletBalanceUpdatePushHandler$updateWalletBalance$1) continuationImpl;
            int i2 = walletBalanceUpdatePushHandler$updateWalletBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletBalanceUpdatePushHandler$updateWalletBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walletBalanceUpdatePushHandler$updateWalletBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walletBalanceUpdatePushHandler$updateWalletBalance$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 e = ((jbh) this.b).e(PlusSdkWidgetExperiment.e);
                    walletBalanceUpdatePushHandler$updateWalletBalance$1.label = 1;
                    obj = e.b(walletBalanceUpdatePushHandler$updateWalletBalance$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                z = ((PlusSdkWidgetExperiment) obj).b;
                zy11 zy11Var = zy11.a;
                if (z) {
                    ((c) this.c).p();
                    return zy11Var;
                }
                this.d.a.g(zy11Var);
                return zy11Var;
            }
        }
        walletBalanceUpdatePushHandler$updateWalletBalance$1 = new WalletBalanceUpdatePushHandler$updateWalletBalance$1(this, continuationImpl);
        Object obj2 = walletBalanceUpdatePushHandler$updateWalletBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walletBalanceUpdatePushHandler$updateWalletBalance$1.label;
        if (i != 0) {
        }
        z = ((PlusSdkWidgetExperiment) obj2).b;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }
}
