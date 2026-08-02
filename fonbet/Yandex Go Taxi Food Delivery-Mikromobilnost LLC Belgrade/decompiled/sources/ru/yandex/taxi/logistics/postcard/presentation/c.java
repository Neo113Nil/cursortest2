package ru.yandex.taxi.logistics.postcard.presentation;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.ife0;
import defpackage.l7;
import defpackage.ny61;
import defpackage.puh;
import defpackage.tpg;
import defpackage.tse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final g a;
    public final h3y b;
    public final ru.yandex.taxi.logistics.sdk.postcard.presentation.b c;
    public final com.yandex.go.navigation.screen.c d;
    public final tse e;
    public final Lifecycle f;

    public c(g gVar, h3y h3yVar, ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar, com.yandex.go.navigation.screen.c cVar, tse tseVar, Lifecycle lifecycle) {
        this.a = gVar;
        this.b = h3yVar;
        this.c = bVar;
        this.d = cVar;
        this.e = tseVar;
        this.f = lifecycle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b9, code lost:
    
        if (r12 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ab -> B:10:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, List list, ContinuationImpl continuationImpl) {
        PostcardController$mapCommand$1 postcardController$mapCommand$1;
        int i;
        Iterator it;
        Object obj;
        boolean z;
        cVar.getClass();
        if (continuationImpl instanceof PostcardController$mapCommand$1) {
            postcardController$mapCommand$1 = (PostcardController$mapCommand$1) continuationImpl;
            int i2 = postcardController$mapCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postcardController$mapCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = postcardController$mapCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = postcardController$mapCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof puh) {
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    if (!it.hasNext()) {
                        obj = null;
                        puh puhVar = (puh) obj;
                        if (puhVar != null) {
                            return new ife0(puhVar);
                        }
                        return null;
                    }
                    obj = it.next();
                    puh puhVar2 = (puh) obj;
                    if (puhVar2.a()) {
                        ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar = cVar.c;
                        String b = puhVar2.b();
                        postcardController$mapCommand$1.L$0 = null;
                        postcardController$mapCommand$1.L$1 = null;
                        postcardController$mapCommand$1.L$2 = it;
                        postcardController$mapCommand$1.L$3 = obj;
                        postcardController$mapCommand$1.L$4 = null;
                        postcardController$mapCommand$1.label = 1;
                        obj2 = kotlinx.coroutines.flow.e.y(new l7(17, ((tpg) bVar.c.getValue(bVar.a, ru.yandex.taxi.logistics.sdk.postcard.presentation.b.d[0])).getData(), bVar, b), postcardController$mapCommand$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = postcardController$mapCommand$1.L$3;
                    it = (Iterator) postcardController$mapCommand$1.L$2;
                    kotlin.b.b(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        z = true;
                    }
                    z = false;
                }
            }
        }
        postcardController$mapCommand$1 = new PostcardController$mapCommand$1(cVar, continuationImpl);
        Object obj22 = postcardController$mapCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = postcardController$mapCommand$1.label;
        if (i != 0) {
        }
    }
}
