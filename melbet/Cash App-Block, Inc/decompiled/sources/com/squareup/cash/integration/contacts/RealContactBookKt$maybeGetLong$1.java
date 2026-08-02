package com.squareup.cash.integration.contacts;

import android.database.Cursor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealContactBookKt$maybeGetLong$1 extends FunctionReferenceImpl implements Function2 {
    public static final RealContactBookKt$maybeGetLong$1 INSTANCE = new RealContactBookKt$maybeGetLong$1(2, Cursor.class, "getLong", "getLong(I)J", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj;
        int intValue = ((Number) obj2).intValue();
        cursor.getClass();
        return Long.valueOf(cursor.getLong(intValue));
    }
}
