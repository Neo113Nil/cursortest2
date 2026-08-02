package com.squareup.cash.integration.contacts;

import android.database.Cursor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class RealContactBookKt$maybeGetString$1 extends FunctionReferenceImpl implements Function2 {
    public static final RealContactBookKt$maybeGetString$1 INSTANCE = new RealContactBookKt$maybeGetString$1(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj;
        int intValue = ((Number) obj2).intValue();
        cursor.getClass();
        return cursor.getString(intValue);
    }
}
