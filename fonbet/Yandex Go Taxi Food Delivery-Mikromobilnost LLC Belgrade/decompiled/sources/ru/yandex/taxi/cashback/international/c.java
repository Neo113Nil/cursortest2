package ru.yandex.taxi.cashback.international;

import com.yandex.go.zone.repository.o;
import defpackage.cda0;
import defpackage.h8b0;
import defpackage.ny61;
import defpackage.qqy;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.cashback.l;

/* loaded from: classes9.dex */
public final class c {
    public final l a;
    public final o b;
    public final cda0 c;

    public c(l lVar, o oVar, cda0 cda0Var) {
        this.a = lVar;
        this.b = oVar;
        this.c = cda0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1 plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1) {
            plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1 = (PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1) continuationImpl;
            int i2 = plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.label = i2 - Integer.MIN_VALUE;
                obj = plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(this.b.c());
                    plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.label = 1;
                    obj = e.y(bVar, plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1);
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
                if (!((Boolean) obj).booleanValue()) {
                    ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) this.c).h();
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = h.listIterator(0);
                    while (true) {
                        qqy qqyVar = (qqy) listIterator;
                        if (!qqyVar.hasNext()) {
                            break;
                        }
                        Object next = qqyVar.next();
                        if (next instanceof h8b0) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1 = new PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1(this, continuationImpl);
        obj = plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }
}
