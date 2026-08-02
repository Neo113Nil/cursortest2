package com.squareup.cash.integration.contacts;

import android.database.Cursor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class RealContactBookKt$maybeGetInt$1 extends FunctionReferenceImpl implements Function2 {
    public static final RealContactBookKt$maybeGetInt$1 INSTANCE = new RealContactBookKt$maybeGetInt$1(2, Cursor.class, "getInt", "getInt(I)I", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj;
        int intValue = ((Number) obj2).intValue();
        cursor.getClass();
        return Integer.valueOf(cursor.getInt(intValue));
    }
}
