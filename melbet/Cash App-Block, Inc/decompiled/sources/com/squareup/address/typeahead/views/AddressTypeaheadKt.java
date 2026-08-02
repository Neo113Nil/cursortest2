package com.squareup.address.typeahead.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.widget.ImageViewCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.braze.Braze$$ExternalSyntheticLambda132;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.common.countries.Country;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AddressTypeaheadKt {
    public static final StaticProvidableCompositionLocal LocalAddressSearcher = new StaticProvidableCompositionLocal(new MotionKt$$ExternalSyntheticLambda0(4));
    public static final List addressResults = CollectionsKt__CollectionsKt.listOf((Object[]) new PreviewSearchResult[]{new PreviewSearchResult("1455 Market St", "San Francisco, CA, USA"), new PreviewSearchResult("119 King St", "Kitchener, ON, CA")});

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Country.values().length];
            try {
                iArr[Country.CA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Country.GB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Country.IE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressTypeahead(AddressTypeaheadState addressTypeaheadState, Modifier modifier, String str, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        Modifier modifier3;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        AddressModel condensed;
        AddressModel.Expanded.Field shown;
        AddressModel.Expanded.Field shown2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        AddressModel.Expanded.Field field;
        AddressModel.Expanded.Field shown3;
        int ordinal;
        String str4;
        AddressModel.Expanded.Field shown4;
        AddressModel expanded;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        Object rememberedValue2;
        addressTypeaheadState.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = addressTypeaheadState.searchResults$delegate;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-775371670);
        int i5 = i | (gapComposer.changed(addressTypeaheadState) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= gapComposer.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i5 | MLKEMEngine.KyberPolyBytes;
                str2 = str;
            } else {
                str2 = str;
                i4 = i5 | (gapComposer.changed(str2) ? 256 : 128);
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                str3 = str2;
            } else {
                Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                String str5 = i3 != 0 ? null : str2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
                if (Intrinsics.areEqual((AddressTypeaheadState.SearcherState) addressTypeaheadState.searcherState$delegate.getValue(), AddressTypeaheadState.SearcherState.Initializing.INSTANCE)) {
                    condensed = AddressModel.Initializing.INSTANCE;
                } else if (addressTypeaheadState.showingExpandedModel()) {
                    int i7 = addressTypeaheadState.postalCodeHintOrLabelResId;
                    LocationType locationType = addressTypeaheadState.locationType;
                    Country country = addressTypeaheadState.countryCode;
                    Country country2 = Country.MX;
                    boolean z = country == country2;
                    boolean access$getUsesAddressLine1Field = AddressTypeaheadStateKt.access$getUsesAddressLine1Field(locationType);
                    AddressModel.Expanded.Field field2 = AddressModel.Expanded.Field.Hidden.INSTANCE;
                    AddressModel.Expanded.Field shown5 = access$getUsesAddressLine1Field ? new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getStreetAddressLine1(), null, null, 6) : field2;
                    int ordinal2 = locationType.ordinal();
                    if (ordinal2 == 0) {
                        shown = new AddressModel.Expanded.Field.Shown((String) addressTypeaheadState.streetAddressLine2$delegate.getValue(), null, null, 6);
                    } else {
                        if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        shown = field2;
                    }
                    int ordinal3 = locationType.ordinal();
                    if (ordinal3 == 0) {
                        shown2 = new AddressModel.Expanded.Field.Shown((String) addressTypeaheadState.city$delegate.getValue(), null, null, 6);
                    } else {
                        if (ordinal3 != 1 && ordinal3 != 2 && ordinal3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        shown2 = field2;
                    }
                    int ordinal4 = locationType.ordinal();
                    if (ordinal4 == 0) {
                        int i8 = AddressTypeaheadState.WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
                        if (i8 == 1) {
                            parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                            field = shown2;
                            shown3 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getState(), (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(R.string.at_state_hint_au)), null, 4);
                        } else if (i8 == 2) {
                            parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                            field = shown2;
                            shown3 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getState(), (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(R.string.at_state_hint_ca)), null, 4);
                        } else if (i8 != 3) {
                            if (i8 != 4) {
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                                field = shown2;
                                shown3 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getState(), (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(R.string.at_state_hint_us)), null, 4);
                            } else {
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                                field = shown2;
                                shown3 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getState(), (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(R.string.at_state_hint_ie)), null, 4);
                            }
                        }
                        ordinal = locationType.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                shown4 = field2;
                                str4 = null;
                                if (locationType == LocationType.Address && country == country2) {
                                    field2 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.country, str4, str4, 6);
                                }
                                AddressModel.Expanded.Field field3 = shown;
                                AddressModel.Expanded.Field field4 = field;
                                AddressModel.Expanded.Field field5 = field2;
                                AddressModel.Expanded.Field field6 = shown5;
                                expanded = new AddressModel.Expanded(z, field6, field3, field4, shown3, shown4, field5, (List) parcelableSnapshotMutableState.getValue());
                                rememberedValue = gapComposer.rememberedValue();
                                neverEqualPolicy = Composer.Companion.Empty;
                                if (rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(15);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                Function1 function1 = (Function1) rememberedValue;
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(16);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                AnimatedContentKt.AnimatedContent(expanded, fillMaxWidth, function1, null, "AddressTypeahead", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(582926040, new LocalViewFactory$$ExternalSyntheticLambda4(12, addressTypeaheadState, str5), gapComposer), gapComposer, 1794432, 8);
                                modifier3 = modifier4;
                                str3 = str5;
                            } else if (ordinal != 2 && ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                        }
                        if (locationType != LocationType.Postal) {
                            str4 = null;
                            shown4 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getPostalCode(), null, (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(i7)), 2);
                        } else {
                            str4 = null;
                            shown4 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.getPostalCode(), (String) addressTypeaheadState.getGetString$views().invoke(Integer.valueOf(i7)), null, 4);
                        }
                        if (locationType == LocationType.Address) {
                            field2 = new AddressModel.Expanded.Field.Shown(addressTypeaheadState.country, str4, str4, 6);
                        }
                        AddressModel.Expanded.Field field32 = shown;
                        AddressModel.Expanded.Field field42 = field;
                        AddressModel.Expanded.Field field52 = field2;
                        AddressModel.Expanded.Field field62 = shown5;
                        expanded = new AddressModel.Expanded(z, field62, field32, field42, shown3, shown4, field52, (List) parcelableSnapshotMutableState.getValue());
                        rememberedValue = gapComposer.rememberedValue();
                        neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                        }
                        Function1 function12 = (Function1) rememberedValue;
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                        }
                        AnimatedContentKt.AnimatedContent(expanded, fillMaxWidth, function12, null, "AddressTypeahead", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(582926040, new LocalViewFactory$$ExternalSyntheticLambda4(12, addressTypeaheadState, str5), gapComposer), gapComposer, 1794432, 8);
                        modifier3 = modifier4;
                        str3 = str5;
                    } else if (ordinal4 != 1 && ordinal4 != 2 && ordinal4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                    field = shown2;
                    shown3 = field2;
                    ordinal = locationType.ordinal();
                    if (ordinal != 0) {
                    }
                    if (locationType != LocationType.Postal) {
                    }
                    if (locationType == LocationType.Address) {
                    }
                    AddressModel.Expanded.Field field322 = shown;
                    AddressModel.Expanded.Field field422 = field;
                    AddressModel.Expanded.Field field522 = field2;
                    AddressModel.Expanded.Field field622 = shown5;
                    expanded = new AddressModel.Expanded(z, field622, field322, field422, shown3, shown4, field522, (List) parcelableSnapshotMutableState.getValue());
                    rememberedValue = gapComposer.rememberedValue();
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                    }
                    Function1 function122 = (Function1) rememberedValue;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                    }
                    AnimatedContentKt.AnimatedContent(expanded, fillMaxWidth, function122, null, "AddressTypeahead", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(582926040, new LocalViewFactory$$ExternalSyntheticLambda4(12, addressTypeaheadState, str5), gapComposer), gapComposer, 1794432, 8);
                    modifier3 = modifier4;
                    str3 = str5;
                } else {
                    condensed = new AddressModel.Condensed((String) addressTypeaheadState.searchInput$delegate.getValue(), (List) parcelableSnapshotMutableState2.getValue());
                }
                expanded = condensed;
                rememberedValue = gapComposer.rememberedValue();
                neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                }
                Function1 function1222 = (Function1) rememberedValue;
                rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                }
                AnimatedContentKt.AnimatedContent(expanded, fillMaxWidth, function1222, null, "AddressTypeahead", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(582926040, new LocalViewFactory$$ExternalSyntheticLambda4(12, addressTypeaheadState, str5), gapComposer), gapComposer, 1794432, 8);
                modifier3 = modifier4;
                str3 = str5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(addressTypeaheadState, modifier3, str3, i, i2, 7);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void Condensed(AddressModel.Condensed condensed, AddressTypeaheadState addressTypeaheadState, String str, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        String str2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2039378891);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(condensed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(addressTypeaheadState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str3 = condensed.searchInput;
            List list = condensed.results;
            if (str == null) {
                str2 = re$$ExternalSyntheticOutline0.m(gapComposer2, 1574510869, R.string.at_hint, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(1574510435);
                gapComposer2.end(false);
                str2 = str;
            }
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, 3, true, 116);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer2.changedInstance(coroutineScope);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AddressTypeaheadKt$$ExternalSyntheticLambda5(addressTypeaheadState, coroutineScope, 1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            int i4 = i3 >> 3;
            InputFieldKt.InputField(str3, (Function1) rememberedValue2, companion, (InputState) null, (Function2) null, (Function2) null, (Function2) null, (Function3) null, str2, keyboardOptions, (KeyboardActions) null, (VisualTransformation) null, gapComposer2, i4 & 896, 0, 3320);
            gapComposer = gapComposer2;
            if (list == null && addressTypeaheadState.resultSuggestions.isEmpty()) {
                gapComposer.startReplaceGroup(1565585549);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1565495215);
                SearchResults(addressTypeaheadState, list == null ? addressTypeaheadState.resultSuggestions : list, gapComposer, i4 & 14);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(condensed, addressTypeaheadState, str, modifier2, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x02da, code lost:
    
        if (r9 == r3) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Expanded(AddressModel.Expanded expanded, AddressTypeaheadState addressTypeaheadState, Modifier modifier, Composer composer, int i) {
        int i2;
        AddressTypeaheadState addressTypeaheadState2;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        Applier applier;
        int i3;
        int i4;
        Arrangement$Vertical arrangement$Vertical;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z;
        AddressModel.Expanded.Field field;
        AddressModel.Expanded.Field.Shown shown;
        NeverEqualPolicy neverEqualPolicy;
        boolean z2;
        boolean z3;
        List list;
        AddressModel.Expanded.Field field2;
        AddressModel.Expanded.Field field3;
        AddressModel.Expanded.Field field4;
        AddressModel.Expanded.Field field5;
        AddressModel.Expanded.Field field6;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        ?? r0;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        AddressModel.Expanded.Field.Shown shown2;
        NeverEqualPolicy neverEqualPolicy2;
        GapComposer gapComposer4;
        AddressModel.Expanded.Field.Shown shown3;
        NeverEqualPolicy neverEqualPolicy3;
        int i5;
        GapComposer gapComposer5;
        boolean z4;
        boolean z5;
        AddressTypeaheadState addressTypeaheadState3;
        boolean z6;
        GapComposer gapComposer6;
        int i6;
        NeverEqualPolicy neverEqualPolicy4;
        String str;
        Modifier modifier4;
        int i7;
        boolean z7;
        String str2;
        GapComposer gapComposer7 = (GapComposer) composer;
        gapComposer7.startRestartGroup(566453540);
        Applier applier2 = gapComposer7.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer7.changedInstance(expanded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer7.changed(addressTypeaheadState) ? 32 : 16;
        }
        int i8 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer7.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            AddressModel.Expanded.Field field7 = expanded.addressLine1;
            AddressModel.Expanded.Field field8 = expanded.country;
            boolean z8 = expanded.postalCodeBeforeState;
            List list2 = expanded.results;
            AddressModel.Expanded.Field field9 = expanded.city;
            AddressModel.Expanded.Field field10 = expanded.state;
            AddressModel.Expanded.Field field11 = expanded.postalCode;
            AddressModel.Expanded.Field field12 = expanded.addressLine2;
            if (field7 instanceof AddressModel.Expanded.Field.Shown) {
                createListBuilder.add(field7);
            }
            boolean z9 = field12 instanceof AddressModel.Expanded.Field.Shown;
            if (z9) {
                createListBuilder.add(field12);
            }
            boolean z10 = field9 instanceof AddressModel.Expanded.Field.Shown;
            if (z10) {
                createListBuilder.add(field9);
            }
            if (z8) {
                if (field11 instanceof AddressModel.Expanded.Field.Shown) {
                    createListBuilder.add(field11);
                }
                if (field10 instanceof AddressModel.Expanded.Field.Shown) {
                    createListBuilder.add(field10);
                }
            } else {
                if (field10 instanceof AddressModel.Expanded.Field.Shown) {
                    createListBuilder.add(field10);
                }
                if (field11 instanceof AddressModel.Expanded.Field.Shown) {
                    createListBuilder.add(field11);
                }
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            AddressModel.Expanded.Field.Shown shown4 = (AddressModel.Expanded.Field.Shown) CollectionsKt.lastOrNull((List) build);
            AddressModel.Expanded.Field.Shown shown5 = (AddressModel.Expanded.Field.Shown) CollectionsKt.firstOrNull((List) build);
            if (shown5 == null) {
                shown5 = null;
            }
            boolean isBlank = (shown5 == null || (str2 = shown5.input) == null) ? false : StringsKt.isBlank(str2);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (isBlank) {
                gapComposer7.startReplaceGroup(291737128);
                modifier3 = FocusTraversalKt.focusRequester(companion2, DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer7));
                gapComposer7.end(false);
            } else {
                gapComposer7.startReplaceGroup(291826656);
                gapComposer7.end(false);
                modifier3 = companion2;
            }
            if (list2 == null) {
                gapComposer7.startReplaceGroup(291925794);
                ((DefaultSizes) gapComposer7.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                applier = applier2;
                i3 = i8;
                arrangement$Vertical = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                i4 = 0;
                gapComposer7.end(false);
            } else {
                applier = applier2;
                i3 = i8;
                i4 = 0;
                gapComposer7.startReplaceGroup(291990429);
                gapComposer7.end(false);
                arrangement$Vertical = SpacerKt.Top;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Vertical, Alignment.Companion.Start, gapComposer7, i4);
            int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, modifier3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer7.startReusableNode();
            if (gapComposer7.inserting) {
                gapComposer7.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer7.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer7, materializeModifier, composeUiNode$Companion$SetModifier$18);
            boolean z11 = field7 instanceof AddressModel.Expanded.Field.Shown;
            NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
            if (z11) {
                gapComposer7.startReplaceGroup(-1670380309);
                Object rememberedValue = gapComposer7.rememberedValue();
                if (rememberedValue == neverEqualPolicy5) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer7);
                    gapComposer7.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                boolean z12 = addressTypeaheadState.autofill;
                ContentType.Companion.getClass();
                Modifier autofillIfEnabled = setAutofillIfEnabled(z12, ContentType.Companion.AddressStreet);
                String str3 = ((AddressModel.Expanded.Field.Shown) field7).input;
                if (Intrinsics.areEqual(shown4, field7)) {
                    modifier4 = autofillIfEnabled;
                    i7 = 7;
                } else {
                    modifier4 = autofillIfEnabled;
                    i7 = 6;
                }
                z3 = z8;
                z = z9;
                field = field7;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, i7, true, 116);
                boolean changedInstance = ((i3 & 112) == 32) | gapComposer7.changedInstance(coroutineScope);
                Object rememberedValue2 = gapComposer7.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy5) {
                    z7 = false;
                    rememberedValue2 = new AddressTypeaheadKt$$ExternalSyntheticLambda5(addressTypeaheadState, coroutineScope, 0);
                    gapComposer7.updateRememberedValue(rememberedValue2);
                } else {
                    z7 = false;
                }
                z2 = z10;
                list = list2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                boolean z13 = z7;
                field3 = field10;
                field6 = field12;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                field5 = field8;
                shown = shown4;
                neverEqualPolicy = neverEqualPolicy5;
                field2 = field9;
                field4 = field11;
                InputFieldKt.InputField(str3, (Function1) rememberedValue2, modifier4, (InputState) null, AddressTypeaheadStateKt.lambda$1928970838, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, (KeyboardActions) null, (VisualTransformation) null, gapComposer7, 24576, 0, 3560);
                GapComposer gapComposer8 = gapComposer7;
                gapComposer8.end(z13);
                r0 = z13;
                gapComposer2 = gapComposer8;
            } else {
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                z = z9;
                field = field7;
                shown = shown4;
                neverEqualPolicy = neverEqualPolicy5;
                z2 = z10;
                z3 = z8;
                list = list2;
                field2 = field9;
                field3 = field10;
                field4 = field11;
                field5 = field8;
                field6 = field12;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                r0 = 0;
                gapComposer7.startReplaceGroup(-1669768152);
                gapComposer7.end(false);
                gapComposer2 = gapComposer7;
            }
            if (list == null) {
                AddressModel.Expanded.Field.Shown shown6 = z11 ? (AddressModel.Expanded.Field.Shown) field : null;
                if (shown6 == null || (str = shown6.input) == null || !StringsKt.isBlank(str) || addressTypeaheadState.resultSuggestions.isEmpty()) {
                    gapComposer2.startReplaceGroup(-1669451270);
                    if (z) {
                        gapComposer2.startReplaceGroup(-1669450464);
                        boolean z14 = addressTypeaheadState.autofill;
                        ContentType.Companion.getClass();
                        Modifier autofillIfEnabled2 = setAutofillIfEnabled(z14, ContentType.Companion.AddressAuxiliaryDetails);
                        AddressModel.Expanded.Field field13 = field6;
                        String str4 = ((AddressModel.Expanded.Field.Shown) field13).input;
                        String stringResource = Room.stringResource(gapComposer2, R.string.at_street_address_hint_line_2);
                        AddressModel.Expanded.Field.Shown shown7 = shown;
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(r0, Intrinsics.areEqual(shown7, field13) ? 7 : 6, true, 116);
                        boolean z15 = (i3 & 112) == 32 ? true : r0;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (z15) {
                            neverEqualPolicy4 = neverEqualPolicy;
                        } else {
                            neverEqualPolicy4 = neverEqualPolicy;
                        }
                        rememberedValue3 = new AddressTypeaheadKt$$ExternalSyntheticLambda6(addressTypeaheadState, r0);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                        Composer composer2 = gapComposer2;
                        shown2 = shown7;
                        neverEqualPolicy2 = neverEqualPolicy4;
                        InputFieldKt.InputField(str4, (Function1) rememberedValue3, autofillIfEnabled2, (InputState) null, AddressTypeaheadStateKt.f97lambda$1340009615, (Function2) null, (Function2) null, (Function3) null, stringResource, keyboardOptions2, (KeyboardActions) null, (VisualTransformation) null, composer2, 24576, 0, 3304);
                        GapComposer gapComposer9 = composer2;
                        gapComposer9.end(r0);
                        gapComposer4 = gapComposer9;
                    } else {
                        shown2 = shown;
                        neverEqualPolicy2 = neverEqualPolicy;
                        gapComposer2.startReplaceGroup(-1668758296);
                        gapComposer2.end(r0);
                        gapComposer4 = gapComposer2;
                    }
                    if (z2) {
                        gapComposer4.startReplaceGroup(-1668697567);
                        boolean z16 = addressTypeaheadState.autofill;
                        ContentType.Companion.getClass();
                        Modifier autofillIfEnabled3 = setAutofillIfEnabled(z16, ContentType.Companion.AddressLocality);
                        AddressModel.Expanded.Field field14 = field2;
                        String str5 = ((AddressModel.Expanded.Field.Shown) field14).input;
                        AddressModel.Expanded.Field.Shown shown8 = shown2;
                        KeyboardOptions keyboardOptions3 = new KeyboardOptions(r0, Intrinsics.areEqual(shown8, field14) ? 7 : 6, true, 116);
                        boolean z17 = (i3 & 112) == 32 ? true : r0;
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy2;
                        if (z17 || rememberedValue4 == neverEqualPolicy6) {
                            i6 = 3;
                            rememberedValue4 = new AddressTypeaheadKt$$ExternalSyntheticLambda6(addressTypeaheadState, 3);
                            gapComposer4.updateRememberedValue(rememberedValue4);
                        } else {
                            i6 = 3;
                        }
                        Composer composer3 = gapComposer4;
                        i5 = i6;
                        shown3 = shown8;
                        neverEqualPolicy3 = neverEqualPolicy6;
                        InputFieldKt.InputField(str5, (Function1) rememberedValue4, autofillIfEnabled3, (InputState) null, AddressTypeaheadStateKt.lambda$870265128, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions3, (KeyboardActions) null, (VisualTransformation) null, composer3, 24576, 0, 3560);
                        GapComposer gapComposer10 = composer3;
                        gapComposer10.end(r0);
                        gapComposer5 = gapComposer10;
                    } else {
                        shown3 = shown2;
                        neverEqualPolicy3 = neverEqualPolicy2;
                        i5 = 3;
                        gapComposer4.startReplaceGroup(-1668129368);
                        gapComposer4.end(r0);
                        gapComposer5 = gapComposer4;
                    }
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(i5)), Alignment.Companion.Top, gapComposer5, r0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier.Companion companion3 = companion;
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, companion3);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (z3) {
                        gapComposer5.startReplaceGroup(-69594462);
                        AddressModel.Expanded.Field.Shown shown9 = shown3;
                        int i9 = i3 << 3;
                        int i10 = 6 | (i9 & 112) | (i9 & 896);
                        z4 = r0;
                        z5 = true;
                        PostalCodeField(expanded, addressTypeaheadState, null, Intrinsics.areEqual(shown9, field4), gapComposer5, i10);
                        StateField(expanded, addressTypeaheadState, null, Intrinsics.areEqual(shown9, field3), gapComposer5, i10);
                        gapComposer5.end(z4);
                        addressTypeaheadState3 = addressTypeaheadState;
                    } else {
                        z4 = r0;
                        z5 = true;
                        AddressModel.Expanded.Field.Shown shown10 = shown3;
                        gapComposer5.startReplaceGroup(-69422846);
                        int i11 = i3 << 3;
                        int i12 = 6 | (i11 & 112) | (i11 & 896);
                        StateField(expanded, addressTypeaheadState, null, Intrinsics.areEqual(shown10, field3), gapComposer5, i12);
                        PostalCodeField(expanded, addressTypeaheadState, null, Intrinsics.areEqual(shown10, field4), gapComposer5, i12);
                        addressTypeaheadState3 = addressTypeaheadState;
                        gapComposer5.end(z4);
                    }
                    gapComposer5.end(z5);
                    AddressModel.Expanded.Field field15 = field5;
                    if (field15 instanceof AddressModel.Expanded.Field.Shown) {
                        gapComposer5.startReplaceGroup(-1667604662);
                        boolean z18 = addressTypeaheadState3.autofill;
                        ContentType.Companion.getClass();
                        Modifier autofillIfEnabled4 = setAutofillIfEnabled(z18, ContentType.Companion.AddressCountry);
                        String str6 = ((AddressModel.Expanded.Field.Shown) field15).input;
                        InputState inputState = InputState.DISABLED;
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy3) {
                            rememberedValue5 = new MarkerKt$$ExternalSyntheticLambda2(17);
                            gapComposer5.updateRememberedValue(rememberedValue5);
                        }
                        GapComposer gapComposer11 = gapComposer5;
                        companion = companion3;
                        InputFieldKt.InputField(str6, (Function1) rememberedValue5, autofillIfEnabled4, inputState, AddressTypeaheadStateKt.f99lambda$825758231, (Function2) null, (Function2) null, (Function3) null, (String) null, (KeyboardOptions) null, (KeyboardActions) null, (VisualTransformation) null, gapComposer11, 27696, 0, 4064);
                        GapComposer gapComposer12 = gapComposer11;
                        z6 = false;
                        gapComposer12.end(false);
                        gapComposer6 = gapComposer12;
                    } else {
                        companion = companion3;
                        z6 = z4;
                        gapComposer5.startReplaceGroup(-1667229624);
                        gapComposer5.end(z6);
                        gapComposer6 = gapComposer5;
                    }
                    gapComposer6.end(z6);
                    addressTypeaheadState2 = addressTypeaheadState;
                    gapComposer3 = gapComposer6;
                    gapComposer3.end(true);
                    modifier2 = companion;
                    gapComposer = gapComposer3;
                }
            }
            gapComposer2.startReplaceGroup(-1669602116);
            addressTypeaheadState2 = addressTypeaheadState;
            SearchResults(addressTypeaheadState2, list == null ? addressTypeaheadState2.resultSuggestions : list, gapComposer2, (i3 >> 3) & 14);
            gapComposer2.end(r0);
            gapComposer3 = gapComposer2;
            gapComposer3.end(true);
            modifier2 = companion;
            gapComposer = gapComposer3;
        } else {
            addressTypeaheadState2 = addressTypeaheadState;
            gapComposer7.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer7;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(expanded, addressTypeaheadState2, modifier2, i, 18);
        }
    }

    public static final void PostalCodeField(AddressModel.Expanded expanded, AddressTypeaheadState addressTypeaheadState, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1153479251);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer2.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(expanded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(addressTypeaheadState) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            AddressModel.Expanded.Field field = expanded.postalCode;
            boolean z2 = field instanceof AddressModel.Expanded.Field.Shown;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer2.startReplaceGroup(-732752962);
                Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
                boolean z3 = addressTypeaheadState.autofill;
                Country country = addressTypeaheadState.countryCode;
                ContentType.Companion.getClass();
                Modifier then = weight.then(setAutofillIfEnabled(z3, ContentType.Companion.PostalCode));
                AddressModel.Expanded.Field.Shown shown = (AddressModel.Expanded.Field.Shown) field;
                String str = shown.input;
                VisualTransformation postalCodeTransformation = ImageViewCompat.postalCodeTransformation(country);
                String str2 = shown.label;
                int i5 = 3;
                if (str2 == null) {
                    gapComposer2.startReplaceGroup(-732423526);
                    gapComposer2.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer2.startReplaceGroup(-732423525);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1374295558, new ToastKt$$ExternalSyntheticLambda1(str2, i5), gapComposer2);
                    gapComposer2.end(false);
                }
                String str3 = shown.hint;
                int i6 = WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
                KeyboardOptions keyboardOptions = new KeyboardOptions(1, (Boolean) null, (i6 == 1 || i6 == 2 || i6 == 3) ? 1 : 3, z ? 7 : 6, (Boolean) null, 114);
                boolean z4 = (i4 & 896) == 256;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AddressTypeaheadKt$$ExternalSyntheticLambda6(addressTypeaheadState, 1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                companion = companion2;
                InputFieldKt.InputField(str, (Function1) rememberedValue, then, (InputState) null, rememberComposableLambda, (Function2) null, (Function2) null, (Function3) null, str3, keyboardOptions, (KeyboardActions) null, postalCodeTransformation, gapComposer2, 0, 0, 1256);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                companion = companion2;
                gapComposer.startReplaceGroup(-731963857);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddressTypeaheadKt$$ExternalSyntheticLambda14(expanded, addressTypeaheadState, modifier2, z, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    public static final void SearchResults(AddressTypeaheadState addressTypeaheadState, List list, Composer composer, int i) {
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl;
        Function1 function1;
        Object braze$$ExternalSyntheticLambda132;
        boolean z;
        AddressTypeaheadState addressTypeaheadState2 = addressTypeaheadState;
        ?? r15 = (GapComposer) composer;
        r15.startRestartGroup(-204128953);
        int i2 = (i & 6) == 0 ? (r15.changed(addressTypeaheadState2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= r15.changedInstance(list) ? 32 : 16;
        }
        int i3 = i2;
        if (r15.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) r15.consume(CompositionLocalsKt.LocalFocusManager);
            Object rememberedValue = r15.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r15);
                r15.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            boolean changed = r15.changed(list);
            Object rememberedValue2 = r15.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                r15.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            if (list.isEmpty()) {
                r15.startReplaceGroup(469586939);
                r15.end(false);
            } else {
                r15.startReplaceGroup(468357820);
                Object rememberedValue3 = r15.rememberedValue();
                if (rememberedValue3 == obj) {
                    rememberedValue3 = new BringIntoViewRequesterImpl();
                    r15.updateRememberedValue(rememberedValue3);
                }
                BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = (BringIntoViewRequesterImpl) rememberedValue3;
                boolean changedInstance = r15.changedInstance(bringIntoViewRequesterImpl2);
                Object rememberedValue4 = r15.rememberedValue();
                if (changedInstance || rememberedValue4 == obj) {
                    rememberedValue4 = new AddressTypeaheadKt$SearchResults$1$1(bringIntoViewRequesterImpl2, null, 0);
                    r15.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect((Composer) r15, list, (Function2) rememberedValue4);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r15, 0);
                int hashCode = Long.hashCode(r15.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = r15.currentCompositionLocalScope();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier = PlatformKt.materializeModifier(r15, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (r15.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                r15.startReusableNode();
                if (r15.inserting) {
                    r15.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r15.useNode();
                }
                Updater.m576setimpl(r15, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(r15, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(r15, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(r15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(r15, materializeModifier, ComposeUiNode.Companion.SetModifier);
                r15.startReplaceGroup(-966234521);
                int i4 = 0;
                for (Object obj2 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    AddressSearchResult addressSearchResult = (AddressSearchResult) obj2;
                    String obj3 = addressSearchResult.getPrimaryText().toString();
                    Modifier.Companion bringIntoViewRequester = i4 == 0 ? BringIntoViewRequesterKt.bringIntoViewRequester(companion, bringIntoViewRequesterImpl2) : companion;
                    String obj4 = addressSearchResult.getSecondaryText().toString();
                    Integer num = (Integer) mutableState.getValue();
                    if (num != null && num.intValue() == i4) {
                        r15.startReplaceGroup(-175210466);
                        Object rememberedValue5 = r15.rememberedValue();
                        if (rememberedValue5 == obj) {
                            rememberedValue5 = new MarkerKt$$ExternalSyntheticLambda2(14);
                            r15.updateRememberedValue(rememberedValue5);
                        }
                        r15.end(false);
                        bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                        function1 = (Function1) rememberedValue5;
                    } else {
                        r15.startReplaceGroup(-175113126);
                        r15.end(false);
                        bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                        function1 = null;
                    }
                    Modifier.Companion companion2 = companion;
                    boolean changed2 = r15.changed(mutableState) | r15.changed(i4) | r15.changedInstance(focusOwnerImpl) | r15.changedInstance(coroutineScope) | ((i3 & 14) == 4) | r15.changedInstance(addressSearchResult);
                    Object rememberedValue6 = r15.rememberedValue();
                    if (changed2 || rememberedValue6 == obj) {
                        z = false;
                        addressTypeaheadState2 = addressTypeaheadState;
                        braze$$ExternalSyntheticLambda132 = new Braze$$ExternalSyntheticLambda132(i4, focusOwnerImpl, coroutineScope, mutableState, addressTypeaheadState2, addressSearchResult);
                        r15.updateRememberedValue(braze$$ExternalSyntheticLambda132);
                    } else {
                        z = false;
                        braze$$ExternalSyntheticLambda132 = rememberedValue6;
                        addressTypeaheadState2 = addressTypeaheadState;
                    }
                    Function0 function0 = (Function0) braze$$ExternalSyntheticLambda132;
                    if (((Integer) mutableState.getValue()) != null) {
                        function0 = null;
                    }
                    CellDefaultKt.CellSearchResult((Function2) null, obj3, bringIntoViewRequester, function0, obj4, function1, (Composer) r15, 6, 0);
                    obj = obj;
                    bringIntoViewRequesterImpl2 = bringIntoViewRequesterImpl;
                    i4 = i5;
                    companion = companion2;
                }
                Boxes$$ExternalSyntheticOutline1.m((GapComposer) r15, false, true, false);
            }
        } else {
            r15.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r15.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(addressTypeaheadState2, list, i, 27);
        }
    }

    public static final void StateField(AddressModel.Expanded expanded, AddressTypeaheadState addressTypeaheadState, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(242300736);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer2.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(expanded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(addressTypeaheadState) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z2 = expanded.state instanceof AddressModel.Expanded.Field.Shown;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer2.startReplaceGroup(-1458603036);
                Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                boolean z3 = addressTypeaheadState.autofill;
                ContentType.Companion.getClass();
                Modifier then = weight.then(setAutofillIfEnabled(z3, ContentType.Companion.AddressRegion));
                String str = ((AddressModel.Expanded.Field.Shown) expanded.state).input;
                KeyboardOptions keyboardOptions = new KeyboardOptions(2, (Boolean) null, 0, z ? 7 : 6, (Boolean) null, 118);
                boolean z4 = (i5 & 896) == 256;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AddressTypeaheadKt$$ExternalSyntheticLambda6(addressTypeaheadState, 2);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                modifier2 = companion;
                InputFieldKt.InputField(str, (Function1) rememberedValue, then, (InputState) null, Expect_jvmKt.rememberComposableLambda(629374596, new CartBannerViewKt$$ExternalSyntheticLambda2(expanded, i4), gapComposer2), (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, (KeyboardActions) null, (VisualTransformation) null, gapComposer2, 24576, 0, 3560);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                modifier2 = companion;
                gapComposer.startReplaceGroup(-1458139710);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddressTypeaheadKt$$ExternalSyntheticLambda14(expanded, addressTypeaheadState, modifier2, z, i, 1);
        }
    }

    public static final StaticProvidableCompositionLocal getLocalAddressSearcher() {
        return LocalAddressSearcher;
    }

    public static final Modifier setAutofillIfEnabled(boolean z, ContentType contentType) {
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return z ? SemanticsModifierKt.semantics(companion, false, new xg$$ExternalSyntheticLambda9(contentType, 21)) : companion;
    }
}
