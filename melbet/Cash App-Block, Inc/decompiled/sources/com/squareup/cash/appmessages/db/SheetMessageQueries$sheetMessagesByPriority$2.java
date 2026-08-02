package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class SheetMessageQueries$sheetMessagesByPriority$2 extends FunctionReferenceImpl implements Function8 {
    public static final SheetMessageQueries$sheetMessagesByPriority$2 INSTANCE = new SheetMessageQueries$sheetMessagesByPriority$2(8, SheetMessage.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;ZLcom/squareup/protos/cash/messagingplatformcommon/app/HalfSheetMessage;Ljava/time/Instant;Ljava/lang/String;ILjava/time/Instant;)V", 0);

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        String str = (String) obj;
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj4;
        Instant instant = (Instant) obj5;
        str.getClass();
        halfSheetMessage.getClass();
        instant.getClass();
        return new SheetMessage(str, (String) obj2, ((Boolean) obj3).booleanValue(), halfSheetMessage, instant, (String) obj6, ((Number) obj7).intValue(), (Instant) serializable);
    }
}
