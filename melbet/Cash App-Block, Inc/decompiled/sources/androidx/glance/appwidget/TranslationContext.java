package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.unit.DpSize;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TranslationContext {
    public final ComponentName actionBroadcastReceiver;
    public final Integer actionTargetId;
    public final int appWidgetId;
    public final boolean canUseSelectableGroup;
    public final Context context;
    public final AtomicBoolean isBackgroundSpecified;
    public final boolean isLazyCollectionDescendant;
    public final boolean isRtl;
    public final int itemPosition;
    public final AtomicInteger lastViewId;
    public final int layoutCollectionViewId;
    public final LayoutConfiguration layoutConfiguration;
    public final long layoutSize;
    public final InsertedViewInfo parentContext;

    public TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName) {
        this.context = context;
        this.appWidgetId = i;
        this.isRtl = z;
        this.layoutConfiguration = layoutConfiguration;
        this.itemPosition = i2;
        this.isLazyCollectionDescendant = z2;
        this.lastViewId = atomicInteger;
        this.parentContext = insertedViewInfo;
        this.isBackgroundSpecified = atomicBoolean;
        this.layoutSize = j;
        this.layoutCollectionViewId = i3;
        this.canUseSelectableGroup = z3;
        this.actionTargetId = num;
        this.actionBroadcastReceiver = componentName;
    }

    /* renamed from: copy-tbIExKY$default, reason: not valid java name */
    public static TranslationContext m1120copytbIExKY$default(TranslationContext translationContext, int i, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new TranslationContext(translationContext.context, translationContext.appWidgetId, translationContext.isRtl, translationContext.layoutConfiguration, (i2 & 16) != 0 ? translationContext.itemPosition : i, (i2 & 32) != 0 ? translationContext.isLazyCollectionDescendant : true, (i2 & 64) != 0 ? translationContext.lastViewId : atomicInteger, (i2 & 128) != 0 ? translationContext.parentContext : insertedViewInfo, (i2 & 256) != 0 ? translationContext.isBackgroundSpecified : atomicBoolean, (i2 & 512) != 0 ? translationContext.layoutSize : j, (i2 & 1024) != 0 ? translationContext.layoutCollectionViewId : 0, (i2 & 4096) != 0 ? translationContext.canUseSelectableGroup : true, (i2 & PKIFailureInfo.certRevoked) != 0 ? translationContext.actionTargetId : num, translationContext.actionBroadcastReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TranslationContext) {
            TranslationContext translationContext = (TranslationContext) obj;
            if (this.context.equals(translationContext.context) && this.appWidgetId == translationContext.appWidgetId && this.isRtl == translationContext.isRtl && this.layoutConfiguration == translationContext.layoutConfiguration && this.itemPosition == translationContext.itemPosition && this.isLazyCollectionDescendant == translationContext.isLazyCollectionDescendant && Intrinsics.areEqual(this.lastViewId, translationContext.lastViewId) && Intrinsics.areEqual(this.parentContext, translationContext.parentContext) && Intrinsics.areEqual(this.isBackgroundSpecified, translationContext.isBackgroundSpecified) && DpSize.m1042equalsimpl0(this.layoutSize, translationContext.layoutSize) && this.layoutCollectionViewId == translationContext.layoutCollectionViewId && this.canUseSelectableGroup == translationContext.canUseSelectableGroup && Intrinsics.areEqual(this.actionTargetId, translationContext.actionTargetId) && Intrinsics.areEqual(this.actionBroadcastReceiver, translationContext.actionBroadcastReceiver)) {
                return true;
            }
        }
        return false;
    }

    public final TranslationContext forChild(InsertedViewInfo insertedViewInfo, int i) {
        return m1120copytbIExKY$default(this, i, null, insertedViewInfo, null, 0L, null, 32623);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(-1, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.layoutCollectionViewId, Recorder$$ExternalSyntheticOutline2.m((this.isBackgroundSpecified.hashCode() + ((this.parentContext.hashCode() + ((this.lastViewId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemPosition, (this.layoutConfiguration.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appWidgetId, this.context.hashCode() * 31, 31), 31, this.isRtl)) * 31, 31), 31, this.isLazyCollectionDescendant)) * 31)) * 31)) * 31, 31, this.layoutSize), 31), 31), 31, this.canUseSelectableGroup);
        Integer num = this.actionTargetId;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.actionBroadcastReceiver;
        return hashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.context + ", appWidgetId=" + this.appWidgetId + ", isRtl=" + this.isRtl + ", layoutConfiguration=" + this.layoutConfiguration + ", itemPosition=" + this.itemPosition + ", isLazyCollectionDescendant=" + this.isLazyCollectionDescendant + ", lastViewId=" + this.lastViewId + ", parentContext=" + this.parentContext + ", isBackgroundSpecified=" + this.isBackgroundSpecified + ", layoutSize=" + ((Object) DpSize.m1045toStringimpl(this.layoutSize)) + ", layoutCollectionViewId=" + this.layoutCollectionViewId + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.canUseSelectableGroup + ", actionTargetId=" + this.actionTargetId + ", actionBroadcastReceiver=" + this.actionBroadcastReceiver + ')';
    }
}
