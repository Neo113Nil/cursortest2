package com.squareup.cash.banking.presenters;

import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes5.dex */
public final class DemandDepositAccountFormatter {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new DemandDepositAccountFormatter();
        }
    }

    public static String formatAccount(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= 4 || (str.length() - 5) % 4 != 0) {
            return StringsKt___StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(4, StringsKt___StringsKt.reversed(str).toString()), " ", null, null, 0, null, null, 62)).toString();
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(str.substring(0, 2));
        createListBuilder.add(str.substring(2, 5));
        createListBuilder.addAll(StringsKt___StringsKt.chunked(4, str.substring(5)));
        return CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder), " ", null, null, 0, null, null, 62);
    }

    public static String formatRouting(String str) {
        str.getClass();
        return StringsKt___StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(3, StringsKt___StringsKt.reversed(str).toString()), " ", null, null, 0, null, null, 62)).toString();
    }
}
