package com.squareup.cash.observability.backend.real;

import app.cash.cdp.persistence.api.Event;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class WeakThrowableScribe$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                pair.getClass();
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                Timber.Forest forest = Timber.Forest;
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("sectionName: ", str, " key: ", str2, " overwrote old: ");
                m.append(obj2);
                m.append(" with new: ");
                m.append(obj3);
                forest.e(m.toString(), new Object[0]);
                break;
        }
        return new Event((String) obj, ((Long) obj2).longValue(), (byte[]) obj3);
    }
}
