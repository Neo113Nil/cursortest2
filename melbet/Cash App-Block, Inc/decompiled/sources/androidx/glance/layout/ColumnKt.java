package androidx.glance.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.backend.api.SupportPhoneScreen;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ColumnKt {
    /* renamed from: Column-K4GKKTE, reason: not valid java name */
    public static final void m1126ColumnK4GKKTE(GlanceModifier glanceModifier, int i, int i2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i3) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1883910253);
        if ((((gapComposer.changed(glanceModifier) ? 4 : 2) | i3 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128)) & 1171) == 1170 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            ColumnKt$Column$1 columnKt$Column$1 = ColumnKt$Column$1.INSTANCE;
            gapComposer.startReplaceableGroup(578571862);
            gapComposer.startReplaceableGroup(-548224868);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(columnKt$Column$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, glanceModifier, BoxKt$Box$2$1.INSTANCE$2);
            Updater.m576setimpl(gapComposer, new Alignment.Horizontal(i2), BoxKt$Box$2$1.INSTANCE$3);
            Updater.m576setimpl(gapComposer, new Alignment.Vertical(i), BoxKt$Box$2$1.INSTANCE$4);
            composableLambdaImpl.invoke(ColumnScopeImplInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ColumnKt$Column$4(glanceModifier, i, i2, composableLambdaImpl, i3);
        }
    }

    public static final CustomerSupportContactStart.ChannelAvailability getChannelAvailability(SupportPhoneStatus supportPhoneStatus) {
        supportPhoneStatus.getClass();
        Boolean valueOf = supportPhoneStatus instanceof SupportPhoneStatus.Idle ? Boolean.valueOf(((SupportPhoneStatus.Idle) supportPhoneStatus).availability.isAvailable) : supportPhoneStatus instanceof SupportPhoneStatus.Active ? Boolean.valueOf(((SupportPhoneStatus.Active) supportPhoneStatus).availability.isAvailable) : null;
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            return CustomerSupportContactStart.ChannelAvailability.ONLINE;
        }
        if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            return CustomerSupportContactStart.ChannelAvailability.OFFLINE;
        }
        if (valueOf == null) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final CustomerSupportContactStart.ChannelStatus getChannelStatus(SupportPhoneStatus supportPhoneStatus) {
        supportPhoneStatus.getClass();
        if (!(supportPhoneStatus instanceof SupportPhoneStatus.Active)) {
            if (supportPhoneStatus instanceof SupportPhoneStatus.Idle) {
                return CustomerSupportContactStart.ChannelStatus.IDLE;
            }
            if (!Intrinsics.areEqual(supportPhoneStatus, SupportPhoneStatus.Error.INSTANCE) && !(supportPhoneStatus instanceof SupportPhoneStatus.FeatureDisabled) && !Intrinsics.areEqual(supportPhoneStatus, SupportPhoneStatus.Undetermined.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
            return null;
        }
        int ordinal = ((SupportPhoneStatus.Active) supportPhoneStatus).status.ordinal();
        if (ordinal == 0) {
            return CustomerSupportContactStart.ChannelStatus.IN_QUEUE;
        }
        if (ordinal == 1) {
            return CustomerSupportContactStart.ChannelStatus.MISSED;
        }
        if (ordinal == 2) {
            return CustomerSupportContactStart.ChannelStatus.COMPLETED;
        }
        if (ordinal == 3) {
            return CustomerSupportContactStart.ChannelStatus.CANCELED;
        }
        if (ordinal == 4) {
            return CustomerSupportContactStart.ChannelStatus.FAILED_TO_QUEUE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.UpdateOffers.deepLinkSpecs;
    }

    public static final SupportPhoneScreen getNextScreenOnSelected(SupportPhoneStatus supportPhoneStatus) {
        supportPhoneStatus.getClass();
        if (supportPhoneStatus instanceof SupportPhoneStatus.Idle) {
            return SupportPhoneScreen.REQUEST_PHONE_SUPPORT;
        }
        if (!(supportPhoneStatus instanceof SupportPhoneStatus.Active)) {
            if ((supportPhoneStatus instanceof SupportPhoneStatus.Error) || (supportPhoneStatus instanceof SupportPhoneStatus.FeatureDisabled) || (supportPhoneStatus instanceof SupportPhoneStatus.Undetermined)) {
                return SupportPhoneScreen.ERROR;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal = ((SupportPhoneStatus.Active) supportPhoneStatus).status.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                return SupportPhoneScreen.REQUEST_PHONE_SUPPORT;
            }
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return SupportPhoneScreen.PHONE_STATUS;
    }
}
