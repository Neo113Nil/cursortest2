package com.squareup.cash.db2.profile;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$btcDisplayUnits$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ProfileQueries$btcDisplayUnits$2() {
        super(1, BtcDisplayUnits.class, "<init>", "<init>(Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new BtcDisplayUnits((BitcoinDisplayUnits) obj);
    }
}
