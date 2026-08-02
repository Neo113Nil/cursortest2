package com.squareup.cash.data.profile;

import com.squareup.cash.db.profile.NotificationPreference;
import com.squareup.protos.franklin.api.UiAlias;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 extends FunctionReferenceImpl implements Function3 {
    public static final RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 INSTANCE = new RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1(3, NotificationPreference.class, "<init>", "<init>(Ljava/lang/String;ZLcom/squareup/protos/franklin/api/UiAlias$Type;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        UiAlias.Type type2 = (UiAlias.Type) obj3;
        str.getClass();
        type2.getClass();
        return new NotificationPreference(type2, str, booleanValue);
    }
}
