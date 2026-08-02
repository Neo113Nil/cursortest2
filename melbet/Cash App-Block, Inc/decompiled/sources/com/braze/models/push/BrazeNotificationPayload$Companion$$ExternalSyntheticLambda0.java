package com.braze.models.push;

import android.os.Bundle;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Bundle f$1;

    public /* synthetic */ BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(int i, Bundle bundle, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String parseObjectAsInteger$lambda$1;
        String parseStringAsLong$lambda$1;
        String parseStringAsColorInt$lambda$1;
        String parseLong$lambda$0;
        String parseString$lambda$0;
        String parseStringAsBoolean$lambda$1;
        String parseNonBlankString$lambda$0;
        String parseStringAsInteger$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                parseObjectAsInteger$lambda$1 = BrazeNotificationPayload.Companion.parseObjectAsInteger$lambda$1(this.f$0, this.f$1);
                return parseObjectAsInteger$lambda$1;
            case 1:
                parseStringAsLong$lambda$1 = BrazeNotificationPayload.Companion.parseStringAsLong$lambda$1(this.f$0, this.f$1);
                return parseStringAsLong$lambda$1;
            case 2:
                parseStringAsColorInt$lambda$1 = BrazeNotificationPayload.Companion.parseStringAsColorInt$lambda$1(this.f$0, this.f$1);
                return parseStringAsColorInt$lambda$1;
            case 3:
                parseLong$lambda$0 = BrazeNotificationPayload.Companion.parseLong$lambda$0(this.f$0, this.f$1);
                return parseLong$lambda$0;
            case 4:
                parseString$lambda$0 = BrazeNotificationPayload.Companion.parseString$lambda$0(this.f$0, this.f$1);
                return parseString$lambda$0;
            case 5:
                parseStringAsBoolean$lambda$1 = BrazeNotificationPayload.Companion.parseStringAsBoolean$lambda$1(this.f$0, this.f$1);
                return parseStringAsBoolean$lambda$1;
            case 6:
                parseNonBlankString$lambda$0 = BrazeNotificationPayload.Companion.parseNonBlankString$lambda$0(this.f$0, this.f$1);
                return parseNonBlankString$lambda$0;
            default:
                parseStringAsInteger$lambda$1 = BrazeNotificationPayload.Companion.parseStringAsInteger$lambda$1(this.f$0, this.f$1);
                return parseStringAsInteger$lambda$1;
        }
    }
}
