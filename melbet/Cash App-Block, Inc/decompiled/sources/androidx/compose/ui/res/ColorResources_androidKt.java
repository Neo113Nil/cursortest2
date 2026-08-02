package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.core.content.res.ResourcesCompat;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewEvent;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.presenters.AllocationGroupWithPercentage;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ColorResources_androidKt {
    public static final void FeatureRestrictionBanner(KybEligibilityWarning.BannerDetail bannerDetail, Function1 function1, Function2 function2, Modifier modifier, boolean z, Composer composer, int i) {
        boolean z2;
        Modifier modifier2;
        Function2 function22;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1396634892);
        int i2 = (gapComposer.changedInstance(bannerDetail) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function2) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            String str = bannerDetail.title;
            str.getClass();
            String str2 = bannerDetail.subtitle_with_markdown;
            if (str2 == null) {
                str2 = bannerDetail.subtitle;
            }
            KybEligibilityWarning.Action action = bannerDetail.action;
            String str3 = action != null ? action.title : null;
            str3.getClass();
            boolean changedInstance = gapComposer.changedInstance(bannerDetail) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FeatureRestrictionBannerKt$$ExternalSyntheticLambda2(function1, bannerDetail, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VisibleKt.BannerCard(str, str3, (Function0) rememberedValue, modifier, str2, function2, z, gapComposer, (i2 & 7168) | ((i2 << 9) & 458752) | ((i2 << 6) & 3670016));
            modifier2 = modifier;
            function22 = function2;
            z2 = z;
        } else {
            z2 = z;
            modifier2 = modifier;
            function22 = function2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(bannerDetail, function1, function22, modifier2, z2, i);
        }
    }

    public static final void FeatureRestrictionCallbackBanner(final UiCallbackModel uiCallbackModel, final Modifier modifier, final boolean z, final boolean z2, Composer composer, final int i, final int i2) {
        uiCallbackModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1379136229);
        int i3 = (gapComposer.changed(uiCallbackModel) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            if (i5 != 0) {
                z = true;
            }
            if (i6 != 0) {
                z2 = false;
            }
            uiCallbackModel.Show(Expect_jvmKt.rememberComposableLambda(-549308530, new Function4() { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i7;
                    GapComposer gapComposer2;
                    boolean z3;
                    KybRestrictionBannerViewModel kybRestrictionBannerViewModel = (KybRestrictionBannerViewModel) obj;
                    final Function1 function1 = (Function1) obj2;
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    function1.getClass();
                    if ((intValue & 6) == 0) {
                        i7 = (((GapComposer) composer2).changed(kybRestrictionBannerViewModel) ? 4 : 2) | intValue;
                    } else {
                        i7 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i7 |= ((GapComposer) composer2).changedInstance(function1) ? 32 : 16;
                    }
                    final int i8 = 0;
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (!gapComposer3.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                        gapComposer3.skipToGroupEnd();
                    } else if (kybRestrictionBannerViewModel != null) {
                        final KybEligibilityWarning.BannerDetail bannerDetail = kybRestrictionBannerViewModel.bannerDetail;
                        gapComposer3.startReplaceGroup(-624931087);
                        int i9 = i7 & 112;
                        boolean changedInstance = (i9 == 32) | gapComposer3.changedInstance(bannerDetail);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new FeatureRestrictionBannerKt$$ExternalSyntheticLambda2(function1, bannerDetail, 0);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        Modifier onVisible$default = VisibleKt.onVisible$default(Modifier.Companion.$$INSTANCE, (Function0) rememberedValue);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, onVisible$default);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer3.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        boolean z4 = z2;
                        Modifier modifier2 = modifier;
                        if (z4) {
                            gapComposer3.startReplaceGroup(-814066718);
                            Icons icons = Icons.AlertOutline24;
                            String str = bannerDetail.title;
                            str.getClass();
                            String str2 = bannerDetail.subtitle;
                            KybEligibilityWarning.Action action = bannerDetail.action;
                            String str3 = action != null ? action.title : null;
                            boolean changedInstance2 = (i9 == 32) | gapComposer3.changedInstance(bannerDetail);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new Function2() { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionBannerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        int i10 = i8;
                                        KybEligibilityWarning.BannerDetail bannerDetail2 = bannerDetail;
                                        Function1 function12 = function1;
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        switch (i10) {
                                            case 0:
                                                str4.getClass();
                                                str5.getClass();
                                                function12.invoke(new KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent(str4, str5, bannerDetail2));
                                                break;
                                            default:
                                                str4.getClass();
                                                str5.getClass();
                                                function12.invoke(new KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent(str4, str5, bannerDetail2));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            Function2 function2 = (Function2) rememberedValue2;
                            boolean changedInstance3 = (i9 == 32) | ((i7 & 14) == 4) | gapComposer3.changedInstance(bannerDetail);
                            Object rememberedValue3 = gapComposer3.rememberedValue();
                            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, kybRestrictionBannerViewModel, bannerDetail, false, 17);
                                gapComposer3.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                                rememberedValue3 = copyCodeKt$$ExternalSyntheticLambda4;
                            }
                            VisibleKt.ArcadeBannerCardStandard(icons, str, modifier2, str2, function2, str3, (Function0) rememberedValue3, gapComposer3, 6, 0);
                            gapComposer2 = gapComposer3;
                            gapComposer2.end(false);
                            z3 = true;
                        } else {
                            gapComposer2 = gapComposer3;
                            gapComposer2.startReplaceGroup(-813338838);
                            boolean changedInstance4 = (i9 == 32) | gapComposer2.changedInstance(bannerDetail);
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda1(4, (Object) bannerDetail, function1);
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            }
                            Function1 function12 = (Function1) rememberedValue4;
                            boolean changedInstance5 = (i9 == 32) | gapComposer2.changedInstance(bannerDetail);
                            Object rememberedValue5 = gapComposer2.rememberedValue();
                            if (changedInstance5 || rememberedValue5 == neverEqualPolicy) {
                                z3 = true;
                                final char c = 1 == true ? 1 : 0;
                                rememberedValue5 = new Function2() { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionBannerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        int i10 = c;
                                        KybEligibilityWarning.BannerDetail bannerDetail2 = bannerDetail;
                                        Function1 function122 = function1;
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        switch (i10) {
                                            case 0:
                                                str4.getClass();
                                                str5.getClass();
                                                function122.invoke(new KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent(str4, str5, bannerDetail2));
                                                break;
                                            default:
                                                str4.getClass();
                                                str5.getClass();
                                                function122.invoke(new KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent(str4, str5, bannerDetail2));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer2.updateRememberedValue(rememberedValue5);
                            } else {
                                z3 = true;
                            }
                            ColorResources_androidKt.FeatureRestrictionBanner(bannerDetail, function12, (Function2) rememberedValue5, modifier2, z, gapComposer2, 0);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(z3);
                        gapComposer2.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-623513612);
                        gapComposer3.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i3 << 3) & 112) | 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final boolean z3 = z;
        final boolean z4 = z2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ColorResources_androidKt.FeatureRestrictionCallbackBanner(UiCallbackModel.this, modifier2, z3, z4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long colorResource(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        return ColorKt.Color(ResourcesCompat.getColor((Resources) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResources), i, ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getTheme()));
    }

    public static ArrayList group(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            arrayList.add(new Pair(Integer.valueOf(i), (MultipleAllocationBlocker.Allocation) obj));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(((MultipleAllocationBlocker.Allocation) ((Pair) next).second).destination.destination.getClass());
            Object obj2 = linkedHashMap.get(orCreateKotlinClass);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(orCreateKotlinClass, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            List<Pair> list3 = (List) entry.getValue();
            list3.getClass();
            int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
            for (Pair pair : list3) {
                arrayList3.add(pair.first);
                arrayList4.add(pair.second);
            }
            arrayList2.add(new AllocationGroupWithPercentage(kClass, arrayList4, arrayList3));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0007, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AllocationGroupWithPercentage selectedGroup(ArrayList arrayList) {
        boolean z = false;
        Object obj = null;
        for (Object obj2 : arrayList) {
            List list = ((AllocationGroupWithPercentage) obj2).allocations;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MultipleAllocationBlocker.Allocation) it.next()).editability instanceof MultipleAllocationBlocker.Allocation.Editable) {
                        if (z) {
                            a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                            return null;
                        }
                        z = true;
                        obj = obj2;
                    }
                }
            }
        }
        if (z) {
            return (AllocationGroupWithPercentage) obj;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }
}
