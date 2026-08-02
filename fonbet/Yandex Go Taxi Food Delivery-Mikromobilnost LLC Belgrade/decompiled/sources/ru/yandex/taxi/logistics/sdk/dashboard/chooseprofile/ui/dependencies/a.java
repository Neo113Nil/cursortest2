package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;

/* loaded from: classes5.dex */
public final class a {
    public final c a;
    public final tpr b;

    public a(c cVar) {
        this.a = cVar;
        this.b = cVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ClientIdProviderImpl$updateCorpData$1 clientIdProviderImpl$updateCorpData$1;
        int i;
        if (continuationImpl instanceof ClientIdProviderImpl$updateCorpData$1) {
            clientIdProviderImpl$updateCorpData$1 = (ClientIdProviderImpl$updateCorpData$1) continuationImpl;
            int i2 = clientIdProviderImpl$updateCorpData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clientIdProviderImpl$updateCorpData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clientIdProviderImpl$updateCorpData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clientIdProviderImpl$updateCorpData$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                    } else if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                c cVar = this.a;
                clientIdProviderImpl$updateCorpData$1.L$0 = null;
                clientIdProviderImpl$updateCorpData$1.L$1 = null;
                if (str != null) {
                    clientIdProviderImpl$updateCorpData$1.I$0 = 0;
                    clientIdProviderImpl$updateCorpData$1.label = 1;
                    return cVar.c(str, clientIdProviderImpl$updateCorpData$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                clientIdProviderImpl$updateCorpData$1.label = 2;
                if (cVar.a(clientIdProviderImpl$updateCorpData$1) == coroutineSingletons) {
                }
            }
        }
        clientIdProviderImpl$updateCorpData$1 = new ClientIdProviderImpl$updateCorpData$1(this, continuationImpl);
        Object obj2 = clientIdProviderImpl$updateCorpData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clientIdProviderImpl$updateCorpData$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
