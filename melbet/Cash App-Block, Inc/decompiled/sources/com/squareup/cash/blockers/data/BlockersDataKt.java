package com.squareup.cash.blockers.data;

import androidx.compose.ui.platform.AccessibilityIterators$LineTextSegmentIterator;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.onboarding.util.RealAliasRegistrarKt$WhenMappings;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.protos.franklin.common.SignalsContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class BlockersDataKt {
    public static final AliasRegistrar$Result.NotSuccessful.Status access$toStatus(RegisterEmailResponse.Status status) {
        switch (status == null ? -1 : RealAliasRegistrarKt$WhenMappings.$EnumSwitchMapping$1[status.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unsupported RegisterEmailResponse.Status ");
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 4:
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            case 5:
                return AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
            case 6:
                return AliasRegistrar$Result.NotSuccessful.Status.TOO_MANY_REQUESTS;
            case 7:
                return AliasRegistrar$Result.NotSuccessful.Status.DUPLICATE_ALIAS;
        }
    }

    public static AccessibilityIterators$LineTextSegmentIterator getInstance() {
        if (AccessibilityIterators$LineTextSegmentIterator.lineInstance == null) {
            AccessibilityIterators$LineTextSegmentIterator.lineInstance = new AccessibilityIterators$LineTextSegmentIterator(4, false);
        }
        AccessibilityIterators$LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator = AccessibilityIterators$LineTextSegmentIterator.lineInstance;
        accessibilityIterators$LineTextSegmentIterator.getClass();
        return accessibilityIterators$LineTextSegmentIterator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if ((r5 != null ? r5.booleanValue() : false) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SignalsContext plus(SignalsContext signalsContext, SignalsContext signalsContext2) {
        boolean z;
        Boolean bool;
        signalsContext.getClass();
        ArrayList plus = CollectionsKt.plus((Iterable) signalsContext2.touch_events, (Collection) signalsContext.touch_events);
        Boolean bool2 = signalsContext.phoneCallActive;
        boolean z2 = false;
        if (!(bool2 != null ? bool2.booleanValue() : false)) {
            Boolean bool3 = signalsContext2.phoneCallActive;
            if (!(bool3 != null ? bool3.booleanValue() : false)) {
                z = false;
                Boolean valueOf = Boolean.valueOf(z);
                bool = signalsContext.screenCaptured;
                if (!(bool == null ? bool.booleanValue() : false)) {
                    Boolean bool4 = signalsContext2.screenCaptured;
                }
                z2 = true;
                return new SignalsContext(plus, valueOf, Boolean.valueOf(z2), 8);
            }
        }
        z = true;
        Boolean valueOf2 = Boolean.valueOf(z);
        bool = signalsContext.screenCaptured;
        if (!(bool == null ? bool.booleanValue() : false)) {
        }
        z2 = true;
        return new SignalsContext(plus, valueOf2, Boolean.valueOf(z2), 8);
    }

    public static final AliasRegistrar$Result.NotSuccessful.Status access$toStatus(RegisterSmsResponse.Status status) {
        switch (status == null ? -1 : RealAliasRegistrarKt$WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case -1:
            case 1:
            case 2:
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unsupported RegisterSmsResponse.Status ");
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            case 4:
                return AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
            case 5:
                return AliasRegistrar$Result.NotSuccessful.Status.TOO_MANY_REQUESTS;
            case 6:
                return AliasRegistrar$Result.NotSuccessful.Status.DUPLICATE_ALIAS;
        }
    }
}
