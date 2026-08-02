package com.squareup.cash.crypto.backend.capability;

import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class RealBitcoinActivityProvider$hasBitcoinActivity$3 extends AdaptedFunctionReference implements Function3 {
    public static final RealBitcoinActivityProvider$hasBitcoinActivity$3 INSTANCE = new RealBitcoinActivityProvider$hasBitcoinActivity$3(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Boolean bool2 = (Boolean) obj2;
        bool2.booleanValue();
        return new Pair(bool, bool2);
    }
}
