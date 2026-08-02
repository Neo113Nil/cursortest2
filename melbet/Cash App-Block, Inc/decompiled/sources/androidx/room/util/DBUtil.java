package androidx.room.util;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.BackHandlerInfo;
import androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1;
import androidx.activity.compose.ComposeBackHandler;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TransactionElement;
import androidx.room.TransactorKt;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.tracing.Trace;
import androidx.work.Configuration;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.size.DimensionKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.datadog.android.api.InternalLogger;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzg;
import com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.IntArrayList;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageSchema;
import com.google.crypto.tink.shaded.protobuf.Schema;
import com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SpacerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.header.PageHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.presenters.BlockersPresenterFactory;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda34;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.localization.LanguageManagerKt;
import com.squareup.cash.mooncake.themes.LetterSpacing;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Sp;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.tax.views.TaxViewFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Views;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.StateFlowKt$mapState$$inlined$map$1;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Handshake$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class DBUtil {
    public static final void BackHandler(boolean z, final Function0 function0, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (gapComposer.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            Object current = LocalNavigationEventDispatcherOwner.getCurrent(gapComposer);
            if (current == null) {
                gapComposer.startReplaceGroup(535274673);
                current = LocalOnBackPressedDispatcherOwner.getCurrent(gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(535271790);
                gapComposer.end(false);
            }
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean changed = gapComposer.changed(current);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                NavigationEventDispatcherOwner navigationEventDispatcherOwner = current instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) current : null;
                NavigationEventDispatcher navigationEventDispatcher = navigationEventDispatcherOwner != null ? navigationEventDispatcherOwner.getNavigationEventDispatcher() : null;
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = current instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) current : null;
                rememberedValue = new BackHandlerDispatcherCompat(navigationEventDispatcher, onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Object obj2 = (BackHandlerDispatcherCompat) rememberedValue;
            long j = gapComposer.compositeKeyHashCode;
            boolean changed2 = gapComposer.changed(obj2) | gapComposer.changed(j);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj3 = rememberedValue2;
            if (changed2 || rememberedValue2 == obj) {
                ComposeBackHandler composeBackHandler = new ComposeBackHandler(new BackHandlerInfo(current, j));
                composeBackHandler.currentOnBackCompleted = new InvalidationTracker$$ExternalSyntheticLambda0(i5);
                gapComposer.updateRememberedValue(composeBackHandler);
                obj3 = composeBackHandler;
            }
            ComposeBackHandler composeBackHandler2 = (ComposeBackHandler) obj3;
            gapComposer.startReplaceGroup(-585307852);
            boolean changedInstance = gapComposer.changedInstance(composeBackHandler2) | ((i3 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj) {
                rememberedValue3 = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(i5, composeBackHandler2, function0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.SideEffect((Function0) rememberedValue3, gapComposer);
            Boolean valueOf = Boolean.valueOf(z3);
            int i6 = i3 & 14;
            boolean changedInstance2 = gapComposer.changedInstance(composeBackHandler2) | (i6 == 4);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj) {
                rememberedValue4 = new BackHandlerKt$$ExternalSyntheticLambda1(composeBackHandler2, z3);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            DimensionKt.LifecycleStartEffect(valueOf, composeBackHandler2, null, (Function1) rememberedValue4, gapComposer, i6);
            boolean changedInstance3 = gapComposer.changedInstance(obj2) | gapComposer.changedInstance(composeBackHandler2);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == obj) {
                rememberedValue5 = new Recomposer$$ExternalSyntheticLambda4(i5, obj2, composeBackHandler2);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.DisposableEffect(obj2, composeBackHandler2, (Function1) rememberedValue5, gapComposer);
            gapComposer.end(false);
            z2 = z3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    DBUtil.BackHandler(z2, function0, (Composer) obj4, updateChangedFlags, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationIcon(final NavigationType navigationType, Modifier modifier, final Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        String str;
        String m;
        String str2;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Modifier semantics;
        Icons icons;
        navigationType.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-226264462);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(navigationType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i4 != 0 ? companion : modifier2;
                Object rememberedValue2 = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                int ordinal = navigationType.ordinal();
                if (ordinal == 0) {
                    str = "NavigationIcon_Back";
                } else if (ordinal == 1) {
                    str = "NavigationIcon_Close";
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    str = "NavigationIcon_None";
                }
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(modifier4, 56.0f, 52.0f);
                NavigationType navigationType2 = NavigationType.NONE;
                boolean z3 = navigationType != navigationType2;
                int ordinal2 = navigationType.ordinal();
                if (ordinal2 == 0) {
                    m = re$$ExternalSyntheticOutline0.m(gapComposer, 1603210947, R.string.back_content_description, gapComposer, false);
                } else if (ordinal2 == 1) {
                    m = re$$ExternalSyntheticOutline0.m(gapComposer, 1603213284, R.string.close_content_description, gapComposer, false);
                } else {
                    if (ordinal2 != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1603209636, false);
                    }
                    gapComposer.startReplaceGroup(-1839924757);
                    gapComposer.end(false);
                    str2 = null;
                    Role role = new Role(0);
                    z = (i3 & 896) != 256;
                    rememberedValue = gapComposer.rememberedValue();
                    int i5 = 3;
                    if (!z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Handshake$$ExternalSyntheticLambda0(i5, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m287sizeVpY3zN4, mutableInteractionSourceImpl, null, z3, str2, role, (Function0) rememberedValue);
                    if (navigationType != navigationType2) {
                        gapComposer.startReplaceGroup(-1839762130);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new SvgDecoder$$ExternalSyntheticLambda0(20);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        Modifier semantics2 = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue3);
                        gapComposer.end(false);
                        semantics = semantics2;
                        z2 = false;
                    } else {
                        gapComposer.startReplaceGroup(-1839678337);
                        String stringResource = Room.stringResource(gapComposer, R.string.back_content_description);
                        String stringResource2 = Room.stringResource(gapComposer, R.string.close_content_description);
                        boolean changed = ((i3 & 14) == 4) | gapComposer.changed(stringResource) | gapComposer.changed(stringResource2);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changed || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new MoleculeKt$$ExternalSyntheticLambda1(3, navigationType, stringResource, stringResource2);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        z2 = false;
                        semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4);
                        gapComposer.end(false);
                    }
                    Modifier testTag = TestTagKt.testTag(m181clickableO2vRcR0.then(semantics), str);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (navigationType != navigationType2) {
                        gapComposer.startReplaceGroup(-1352305703);
                        int ordinal3 = navigationType.ordinal();
                        if (ordinal3 == 0) {
                            icons = Icons.NavigationBack;
                        } else {
                            if (ordinal3 != 1) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return;
                            }
                            icons = Icons.NavigationClose;
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, IndicationKt.indication(SizeKt.m285size3ABfNKs(companion, 24.0f), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9)), ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer, 48, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1351841354);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    modifier3 = modifier4;
                }
                str2 = m;
                Role role2 = new Role(0);
                if ((i3 & 896) != 256) {
                }
                rememberedValue = gapComposer.rememberedValue();
                int i52 = 3;
                if (!z) {
                }
                rememberedValue = new Handshake$$ExternalSyntheticLambda0(i52, function0);
                gapComposer.updateRememberedValue(rememberedValue);
                Modifier m181clickableO2vRcR02 = ImageKt.m181clickableO2vRcR0(m287sizeVpY3zN4, mutableInteractionSourceImpl, null, z3, str2, role2, (Function0) rememberedValue);
                if (navigationType != navigationType2) {
                }
                Modifier testTag2 = TestTagKt.testTag(m181clickableO2vRcR02.then(semantics), str);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, testTag2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.titlebar.TitleBarSubKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        DBUtil.NavigationIcon(NavigationType.this, modifier3, function0, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m1179Rect3MmeM6k(long j, float f) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) - f;
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        return new Rect(intBitsToFloat, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m1180Recttz77jQw(long j, long j2) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        return new Rect(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2));
    }

    public static final void SpacerBetweenSectionLarge(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(204775269);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 32.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpacerKt$$ExternalSyntheticLambda3(modifier, i, i2, i5);
        }
    }

    public static final void SpacerBetweenSectionXLarge(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-266336081);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 64.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 5, (byte) 0);
        }
    }

    public static final void SpacerBetweenSectionXLargeBelowCell(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1570993104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier4, 1.0f), 48.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier3, i, i2, 4, (byte) 0);
        }
    }

    public static final void SpacerWithinSectionMedium(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1025103220);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 16.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpacerKt$$ExternalSyntheticLambda3(modifier, i, i2, i5);
        }
    }

    public static final void SpacerWithinSectionSmall(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1571751198);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 8.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 3, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleBarSub(String str, NavigationType navigationType, Modifier modifier, DynamicColorConfiguration dynamicColorConfiguration, Function0 function0, Modifier modifier2, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        DynamicColorConfiguration dynamicColorConfiguration2;
        int i4;
        Function0 function02;
        int i5;
        Modifier modifier4;
        int i6;
        Function3 function32;
        Modifier modifier5;
        Modifier modifier6;
        DynamicColorConfiguration dynamicColorConfiguration3;
        Function0 function03;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        DynamicColorConfiguration dynamicColorConfiguration4;
        DynamicColorConfiguration dynamicColorConfiguration5;
        Modifier modifier7;
        Function0 function04;
        Modifier modifier8;
        int i7;
        navigationType.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1296194172);
        int i8 = 2;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(navigationType.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier3 = modifier;
            i3 |= gapComposer.changed(modifier3) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dynamicColorConfiguration2 = dynamicColorConfiguration;
                    if (gapComposer.changed(dynamicColorConfiguration2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    dynamicColorConfiguration2 = dynamicColorConfiguration;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                dynamicColorConfiguration2 = dynamicColorConfiguration;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    modifier4 = modifier2;
                    i3 |= gapComposer.changed(modifier4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function32 = function3;
                        i3 |= gapComposer.changedInstance(function32) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                            gapComposer.startDefaults();
                            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                Modifier modifier9 = Modifier.Companion.$$INSTANCE;
                                if (i9 != 0) {
                                    modifier3 = modifier9;
                                }
                                if ((i2 & 8) != 0) {
                                    dynamicColorConfiguration4 = TransactorKt.m1173invokeRGew2ao(0L, 0L, 0L, gapComposer, 7);
                                    i3 &= -7169;
                                } else {
                                    dynamicColorConfiguration4 = dynamicColorConfiguration2;
                                }
                                if (i4 != 0) {
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new DataStoreKey$$ExternalSyntheticLambda0(24);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    function02 = (Function0) rememberedValue;
                                }
                                if (i5 == 0) {
                                    modifier9 = modifier2;
                                }
                                if (i6 != 0) {
                                    dynamicColorConfiguration5 = dynamicColorConfiguration4;
                                    modifier7 = modifier3;
                                    function32 = null;
                                } else {
                                    function32 = function3;
                                    dynamicColorConfiguration5 = dynamicColorConfiguration4;
                                    modifier7 = modifier3;
                                }
                                function04 = function02;
                                modifier8 = modifier9;
                            } else {
                                gapComposer.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                modifier7 = modifier3;
                                dynamicColorConfiguration5 = dynamicColorConfiguration2;
                                function04 = function02;
                                modifier8 = modifier4;
                            }
                            gapComposer.endDefaults();
                            Function3 function34 = function32;
                            TitleBarSub(Expect_jvmKt.rememberComposableLambda(1575271806, new PageHeaderKt$$ExternalSyntheticLambda0(str, i8), gapComposer), navigationType, modifier7, dynamicColorConfiguration5, function04, modifier8, function34, gapComposer, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                            gapComposer = gapComposer;
                            function33 = function34;
                            modifier6 = modifier7;
                            dynamicColorConfiguration3 = dynamicColorConfiguration5;
                            function03 = function04;
                            modifier5 = modifier8;
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier5 = modifier2;
                            modifier6 = modifier3;
                            dynamicColorConfiguration3 = dynamicColorConfiguration2;
                            function03 = function02;
                            function33 = function3;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda1(str, navigationType, modifier6, dynamicColorConfiguration3, function03, modifier5, function33, i, i2, 1);
                            return;
                        }
                        return;
                    }
                    function32 = function3;
                    if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier4 = modifier2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function32 = function3;
                if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            modifier4 = modifier2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function32 = function3;
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        modifier4 = modifier2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function32 = function3;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ExecutorService access$createDefaultExecutor(final boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            public final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                runnable.getClass();
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(z ? "WM.task-" : "androidx.work-");
                m.append(this.threadCount.incrementAndGet());
                return new Thread(runnable, m.toString());
            }
        });
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final float calculateLetterSpacingEm(Context context, TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
        context.getClass();
        LetterSpacing letterSpacing = textThemeInfo.letterSpacing;
        if (!(letterSpacing instanceof LetterSpacing$Companion$Sp)) {
            if (letterSpacing instanceof LetterSpacing$Companion$Em) {
                return ((LetterSpacing$Companion$Em) letterSpacing).value;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return RecyclerView.DECELERATION_RATE;
        }
        float f = ((LetterSpacing$Companion$Sp) letterSpacing).value;
        textThemeInfo.textSize.getClass();
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics()) / Views.sp(context, r3.value);
    }

    public static final void checkContentUriTriggerWorkerLimits(WorkDatabase workDatabase, Configuration configuration, WorkContinuationImpl workContinuationImpl) {
        int i;
        workDatabase.getClass();
        configuration.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(workContinuationImpl);
        int i2 = 0;
        while (!mutableListOf.isEmpty()) {
            List list = ((WorkContinuationImpl) CollectionsKt__MutableCollectionsKt.removeLast(mutableListOf)).mWork;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((OneTimeWorkRequest) it.next()).workSpec.constraints.contentUriTriggers.isEmpty() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int intValue = ((Number) performBlocking(workDatabase.workSpecDao().__db, true, false, new Data$$ExternalSyntheticLambda0(6))).intValue();
        int i3 = configuration.contentUriTriggerWorkersLimit;
        if (intValue + i2 <= i3) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", Recorder$$ExternalSyntheticOutline2.m107m(i3, intValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
    }

    public static RealInitialScreenLoader.MetroFactory create(RealAppMessageManager.MetroFactory metroFactory, Provider provider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, RealCurrentUserSetter.MetroFactory metroFactory2, LambdaProvider lambdaProvider, RealIntentHandler.MetroFactory metroFactory3, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2, RealOnSessionChangeActionsExecutor.MetroFactory metroFactory4, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealTabProvider.MetroFactory metroFactory5, RealFileDownloader.MetroFactory metroFactory6, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, AndroidToaster.MetroFactory metroFactory7, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, LambdaProvider lambdaProvider6, DoubleCheck doubleCheck11, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider7, TaxViewFactory.MetroFactory metroFactory8, InstanceFactory instanceFactory4, LambdaProvider lambdaProvider8, LambdaProvider lambdaProvider9, BrazeInitializer.MetroFactory metroFactory9, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider10, LambdaProvider lambdaProvider11, DoubleCheck doubleCheck12, BorrowUiFactory.MetroFactory metroFactory10, DoubleCheck doubleCheck13) {
        provider.getClass();
        musicViewFactory$MetroFactory.getClass();
        lambdaProvider.getClass();
        metroFactory3.getClass();
        lambdaProvider2.getClass();
        metroFactory4.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory5.getClass();
        metroFactory6.getClass();
        doubleCheck5.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        metroFactory7.getClass();
        lambdaProvider3.getClass();
        doubleCheck8.getClass();
        doubleCheck9.getClass();
        doubleCheck10.getClass();
        lambdaProvider4.getClass();
        lambdaProvider5.getClass();
        lambdaProvider6.getClass();
        doubleCheck11.getClass();
        lambdaProvider7.getClass();
        metroFactory8.getClass();
        lambdaProvider8.getClass();
        lambdaProvider9.getClass();
        metroFactory9.getClass();
        lambdaProvider10.getClass();
        lambdaProvider11.getClass();
        doubleCheck12.getClass();
        metroFactory10.getClass();
        doubleCheck13.getClass();
        return new RealInitialScreenLoader.MetroFactory(metroFactory, provider, musicViewFactory$MetroFactory, metroFactory2, lambdaProvider, metroFactory3, instanceFactory, lambdaProvider2, metroFactory4, doubleCheck, doubleCheck2, doubleCheck3, doubleCheck4, metroFactory5, metroFactory6, doubleCheck5, doubleCheck6, doubleCheck7, metroFactory7, lambdaProvider3, doubleCheck8, doubleCheck9, doubleCheck10, lambdaProvider4, lambdaProvider5, lambdaProvider6, doubleCheck11, instanceFactory2, instanceFactory3, lambdaProvider7, metroFactory8, instanceFactory4, lambdaProvider8, lambdaProvider9, metroFactory9, walletUiFactory$MetroFactory, lambdaProvider10, lambdaProvider11, doubleCheck12, metroFactory10, doubleCheck13);
    }

    public static int decodeBytes(byte[] bArr, int i, ArrayDecoders$Registers arrayDecoders$Registers) {
        int decodeVarint32 = decodeVarint32(bArr, i, arrayDecoders$Registers);
        int i2 = arrayDecoders$Registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            arrayDecoders$Registers.object1 = ByteString.EMPTY;
            return decodeVarint32;
        }
        arrayDecoders$Registers.object1 = ByteString.copyFrom(decodeVarint32, i2, bArr);
        return decodeVarint32 + i2;
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int decodeMessageList(Schema schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        Object newInstance = schema.newInstance();
        Schema schema2 = schema;
        byte[] bArr2 = bArr;
        int i4 = i3;
        ArrayDecoders$Registers arrayDecoders$Registers2 = arrayDecoders$Registers;
        int mergeMessageField = mergeMessageField(newInstance, schema2, bArr2, i2, i4, arrayDecoders$Registers2);
        schema2.makeImmutable(newInstance);
        arrayDecoders$Registers2.object1 = newInstance;
        protobufList.add(newInstance);
        while (mergeMessageField < i4) {
            ArrayDecoders$Registers arrayDecoders$Registers3 = arrayDecoders$Registers2;
            int i5 = i4;
            int decodeVarint32 = decodeVarint32(bArr2, mergeMessageField, arrayDecoders$Registers3);
            if (i != arrayDecoders$Registers3.int1) {
                break;
            }
            byte[] bArr3 = bArr2;
            Schema schema3 = schema2;
            Object newInstance2 = schema3.newInstance();
            mergeMessageField = mergeMessageField(newInstance2, schema3, bArr3, decodeVarint32, i5, arrayDecoders$Registers3);
            schema2 = schema3;
            bArr2 = bArr3;
            i4 = i5;
            arrayDecoders$Registers2 = arrayDecoders$Registers3;
            schema2.makeImmutable(newInstance2);
            arrayDecoders$Registers2.object1 = newInstance2;
            protobufList.add(newInstance2);
        }
        return mergeMessageField;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, ArrayDecoders$Registers arrayDecoders$Registers) {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int decodeVarint64 = decodeVarint64(bArr, i2, arrayDecoders$Registers);
            unknownFieldSetLite.storeField(i, Long.valueOf(arrayDecoders$Registers.long1));
            return decodeVarint64;
        }
        if (i4 == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int decodeVarint32 = decodeVarint32(bArr, i2, arrayDecoders$Registers);
            int i5 = arrayDecoders$Registers.int1;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - decodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(decodeVarint32, i5, bArr));
            }
            return decodeVarint32 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(decodeFixed32(bArr, i2)));
            return i2 + 4;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int i6 = (i & (-8)) | 4;
        int i7 = arrayDecoders$Registers.recursionDepth + 1;
        arrayDecoders$Registers.recursionDepth = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int decodeVarint322 = decodeVarint32(bArr, i2, arrayDecoders$Registers);
            int i9 = arrayDecoders$Registers.int1;
            if (i9 == i6) {
                i8 = i9;
                i2 = decodeVarint322;
                break;
            }
            i2 = decodeUnknownField(i9, bArr, decodeVarint322, i3, newInstance, arrayDecoders$Registers);
            i8 = i9;
        }
        arrayDecoders$Registers.recursionDepth--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, newInstance);
        return i2;
    }

    public static int decodeVarint32(int i, byte[] bArr, int i2, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            arrayDecoders$Registers.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            arrayDecoders$Registers.int1 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            arrayDecoders$Registers.int1 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            arrayDecoders$Registers.int1 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                arrayDecoders$Registers.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i2, arrayDecoders$Registers);
        intArrayList.addInt(arrayDecoders$Registers.int1);
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, arrayDecoders$Registers);
            if (i != arrayDecoders$Registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, arrayDecoders$Registers);
            intArrayList.addInt(arrayDecoders$Registers.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            arrayDecoders$Registers.long1 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        arrayDecoders$Registers.long1 = j2;
        return i3;
    }

    public static final int findParagraphByIndex(int i, List list) {
        int i2;
        int i3 = ((ParagraphInfo) CollectionsKt.last(list)).endIndex;
        if (i > ((ParagraphInfo) CollectionsKt.last(list)).endIndex) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i2);
            char c = paragraphInfo.startIndex > i ? (char) 1 : paragraphInfo.endIndex <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "Found paragraph index ", " should be in range [0, ");
        m2m.append(list.size());
        m2m.append(").\nDebug info: index=");
        m2m.append(i);
        m2m.append(", paragraphs=[");
        m2m.append(ListUtilsKt.fastJoinToString$default(31, null, list, new Navigation$$ExternalSyntheticLambda1(5)));
        m2m.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
        return i2;
    }

    public static final int findParagraphByLineIndex(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            char c = paragraphInfo.startLineIndex > i ? (char) 1 : paragraphInfo.endLineIndex <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByY(ArrayList arrayList, float f) {
        if (f <= RecyclerView.DECELERATION_RATE) {
            return 0;
        }
        if (f >= ((ParagraphInfo) CollectionsKt.last((List) arrayList)).bottom) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2);
            char c = paragraphInfo.top > f ? (char) 1 : paragraphInfo.bottom <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m1181findParagraphsByRangeSbBc2M(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int findParagraphByIndex = findParagraphByIndex(TextRange.m990getMinimpl(j), arrayList); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(findParagraphByIndex);
            if (paragraphInfo.startIndex >= TextRange.m989getMaximpl(j)) {
                return;
            }
            if (paragraphInfo.startIndex != paragraphInfo.endIndex) {
                function1.invoke(paragraphInfo);
            }
        }
    }

    public static final LifecycleOwner get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final CoroutineContext getCoroutineContext(RoomDatabase roomDatabase, boolean z, ContinuationImpl continuationImpl) {
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            return roomDatabase.getCoroutineScope().getCoroutineContext();
        }
        if (continuationImpl.getContext().get(TransactionElement.Key) == null) {
            return z ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext();
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public static HashMap getCountryCodeToRegionCodeMap() {
        HashMap hashMap = new HashMap(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList m = BalanceFeedKt$$ExternalSyntheticOutline0.m(36, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(34, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(33, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(32, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(31, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(30, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(27, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(20, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        m.add("VA");
        hashMap.put(39, m);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(43, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(41, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        m2.add("GG");
        m2.add("IM");
        m2.add("JE");
        hashMap.put(44, m2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(46, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(45, hashMap, arrayList4, 1, "SE"), 2, PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);
        m3.add("SJ");
        hashMap.put(47, m3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(60, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(58, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(57, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(56, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(55, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(54, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(53, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(52, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(51, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(49, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        m4.add("CC");
        m4.add("CX");
        hashMap.put(61, m4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m(211, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(98, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(95, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(94, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(93, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(92, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(91, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(90, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(86, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(84, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(82, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(81, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(66, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(65, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(64, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(63, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        m5.add("EH");
        hashMap.put(Integer.valueOf(EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE), m5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(256, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(255, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(239, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(224, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        m6.add("YT");
        hashMap.put(Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), m6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList m7 = BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        m7.add("TA");
        hashMap.put(Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE), m7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList m8 = BalanceFeedKt$$ExternalSyntheticOutline0.m(357, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(356, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(355, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(354, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(353, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(352, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(351, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(350, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        m8.add("AX");
        hashMap.put(358, m8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList m9 = BalanceFeedKt$$ExternalSyntheticOutline0.m(509, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(508, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(507, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(506, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(505, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(504, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(503, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(HttpStatusCode.BAD_GATEWAY_502, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(501, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(500, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(423, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(421, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(420, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(389, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(387, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(386, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(385, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(383, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(382, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(381, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(380, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(378, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(377, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(376, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(375, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(374, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(373, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(372, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(371, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(Constants.ID_KROGER, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        m9.add("BL");
        m9.add("MF");
        hashMap.put(590, m9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList m10 = BalanceFeedKt$$ExternalSyntheticOutline0.m(598, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(597, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(596, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(595, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(594, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(593, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(592, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        m10.add("BQ");
        hashMap.put(599, m10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, BalanceFeedKt$$ExternalSyntheticOutline0.m(996, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(995, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(994, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(993, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(992, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(979, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(977, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(976, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(975, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(974, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(973, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(972, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(971, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(970, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(968, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(967, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(966, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(965, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(964, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(963, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(962, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(961, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(960, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(888, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(886, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(883, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(882, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(881, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(880, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(878, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(870, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(856, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(855, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(853, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(852, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(850, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(808, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(800, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(692, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(691, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(690, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(689, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(688, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(687, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(686, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(685, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(683, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(682, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(681, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(680, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(679, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(678, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(677, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(676, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(675, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(674, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(673, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(672, hashMap, BalanceFeedKt$$ExternalSyntheticOutline0.m(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static CallbackToFutureAdapter$SafeFuture getFuture(CallbackToFutureAdapter$Resolver callbackToFutureAdapter$Resolver) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = callbackToFutureAdapter$Resolver.getClass();
        try {
            Object attachCompleter = callbackToFutureAdapter$Resolver.attachCompleter(callbackToFutureAdapter$Completer);
            if (attachCompleter == null) {
                return callbackToFutureAdapter$SafeFuture;
            }
            callbackToFutureAdapter$Completer.tag = attachCompleter;
            return callbackToFutureAdapter$SafeFuture;
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
            return callbackToFutureAdapter$SafeFuture;
        }
    }

    public static int indexOf(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final String kebabCase(String str) {
        String replace;
        String replace2;
        String replace3;
        String replace4;
        str.getClass();
        replace = new Regex("(?<=[a-z0-9])(?=[A-Z])").replace(StringsKt.trim(str).toString(), "-");
        replace2 = new Regex("(?<=[A-Z])(?=[A-Z][a-z])").replace(replace, "-");
        replace3 = new Regex("[^a-zA-Z0-9.]").replace(replace2, "-");
        replace4 = new Regex("-+").replace(replace3, "-");
        String lowerCase = StringsKt.trim(replace4, '-').toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String lenientFormat(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(lenientToString(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(lenientToString(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String lenientToString(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("<", str, " threw ");
            m3m.append(e.getClass().getName());
            m3m.append(">");
            return m3m.toString();
        }
    }

    public static /* synthetic */ void log$default(InternalLogger internalLogger, int i, InternalLogger.Target target, Function0 function0, Throwable th, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i2 & 16) != 0) {
            z = false;
        }
        ((zzlj) internalLogger).log(i, target, function0, th2, z, (Map) null);
    }

    public static final DerivedStateFlow mapState(StateFlow stateFlow, Function1 function1) {
        stateFlow.getClass();
        int i = 1;
        return new DerivedStateFlow(new StateFlowKt$$ExternalSyntheticLambda1(function1, stateFlow, i), new StateFlowKt$mapState$$inlined$map$1(stateFlow, function1, i));
    }

    public static final FlowQuery$mapToList$$inlined$map$1 mapToList(Flow flow, CoroutineContext coroutineContext) {
        flow.getClass();
        coroutineContext.getClass();
        return new FlowQuery$mapToList$$inlined$map$1(flow, coroutineContext, 0);
    }

    public static final FinishSetupTileBadgeCounter mapToOne(SafeFlow safeFlow, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return new FinishSetupTileBadgeCounter(4, safeFlow, coroutineContext);
    }

    public static final FlowQuery$mapToList$$inlined$map$1 mapToOneNotNull(Flow flow, CoroutineContext coroutineContext) {
        flow.getClass();
        coroutineContext.getClass();
        return new FlowQuery$mapToList$$inlined$map$1(flow, coroutineContext, 1);
    }

    public static final FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault(SafeFlow safeFlow, Object obj, CoroutineContext coroutineContext) {
        obj.getClass();
        coroutineContext.getClass();
        return new FlowUtil$createFlow$$inlined$map$1(safeFlow, coroutineContext, obj, 1);
    }

    public static final FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull(Flow flow, CoroutineContext coroutineContext) {
        flow.getClass();
        coroutineContext.getClass();
        return new FlowQuery$mapToList$$inlined$map$1(flow, coroutineContext, 2);
    }

    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i, int i2, int i3, ArrayDecoders$Registers arrayDecoders$Registers) {
        MessageSchema messageSchema = (MessageSchema) schema;
        int i4 = arrayDecoders$Registers.recursionDepth + 1;
        arrayDecoders$Registers.recursionDepth = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int parseMessage = messageSchema.parseMessage(obj, bArr, i, i2, i3, arrayDecoders$Registers);
        arrayDecoders$Registers.recursionDepth--;
        arrayDecoders$Registers.object1 = obj;
        return parseMessage;
    }

    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i, int i2, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = decodeVarint32(i4, bArr, i3, arrayDecoders$Registers);
            i4 = arrayDecoders$Registers.int1;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = arrayDecoders$Registers.recursionDepth + 1;
        arrayDecoders$Registers.recursionDepth = i6;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        schema.mergeFrom(obj, bArr, i5, i7, arrayDecoders$Registers);
        arrayDecoders$Registers.recursionDepth--;
        arrayDecoders$Registers.object1 = obj;
        return i7;
    }

    public static final Object performBlocking(RoomDatabase roomDatabase, boolean z, boolean z2, Function1 function1) {
        roomDatabase.getClass();
        roomDatabase.assertNotMainThread();
        roomDatabase.assertNotSuspendingTransaction();
        return Trace.runBlockingUninterruptible(new DBUtil__DBUtil_androidKt$performBlocking$1(roomDatabase, null, function1, z, z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object performSuspending(RoomDatabase roomDatabase, boolean z, TransactorKt$$ExternalSyntheticLambda0 transactorKt$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$1;
        int i;
        if (continuationImpl instanceof DBUtil__DBUtil_androidKt$performSuspending$1) {
            dBUtil__DBUtil_androidKt$performSuspending$1 = (DBUtil__DBUtil_androidKt$performSuspending$1) continuationImpl;
            int i2 = dBUtil__DBUtil_androidKt$performSuspending$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dBUtil__DBUtil_androidKt$performSuspending$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dBUtil__DBUtil_androidKt$performSuspending$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dBUtil__DBUtil_androidKt$performSuspending$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(roomDatabase, null, transactorKt$$ExternalSyntheticLambda0, z);
                        dBUtil__DBUtil_androidKt$performSuspending$1.label = 1;
                        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, dBUtil__DBUtil_androidKt$performSuspending$1);
                        if (useConnection$room_runtime_release != coroutineSingletons) {
                            return useConnection$room_runtime_release;
                        }
                    } else {
                        dBUtil__DBUtil_androidKt$performSuspending$1.L$0 = roomDatabase;
                        dBUtil__DBUtil_androidKt$performSuspending$1.L$1 = transactorKt$$ExternalSyntheticLambda0;
                        dBUtil__DBUtil_androidKt$performSuspending$1.Z$0 = z;
                        dBUtil__DBUtil_androidKt$performSuspending$1.label = 2;
                        obj = getCoroutineContext(roomDatabase, false, dBUtil__DBUtil_androidKt$performSuspending$1);
                    }
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = dBUtil__DBUtil_androidKt$performSuspending$1.Z$0;
                transactorKt$$ExternalSyntheticLambda0 = dBUtil__DBUtil_androidKt$performSuspending$1.L$1;
                roomDatabase = dBUtil__DBUtil_androidKt$performSuspending$1.L$0;
                SafeTrace.throwOnFailure(obj);
                DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(roomDatabase, null, transactorKt$$ExternalSyntheticLambda0, z);
                dBUtil__DBUtil_androidKt$performSuspending$1.L$0 = null;
                dBUtil__DBUtil_androidKt$performSuspending$1.L$1 = null;
                dBUtil__DBUtil_androidKt$performSuspending$1.label = 3;
                Object withContext = JobKt.withContext((CoroutineContext) obj, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, dBUtil__DBUtil_androidKt$performSuspending$1);
                return withContext != coroutineSingletons ? coroutineSingletons : withContext;
            }
        }
        dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuationImpl);
        Object obj2 = dBUtil__DBUtil_androidKt$performSuspending$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dBUtil__DBUtil_androidKt$performSuspending$1.label;
        if (i != 0) {
        }
        DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(roomDatabase, null, transactorKt$$ExternalSyntheticLambda0, z);
        dBUtil__DBUtil_androidKt$performSuspending$1.L$0 = null;
        dBUtil__DBUtil_androidKt$performSuspending$1.L$1 = null;
        dBUtil__DBUtil_androidKt$performSuspending$1.label = 3;
        Object withContext2 = JobKt.withContext((CoroutineContext) obj2, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12, dBUtil__DBUtil_androidKt$performSuspending$1);
        if (withContext2 != coroutineSingletons2) {
        }
    }

    public static final File preferencesDataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return Room.dataStoreFile(context, str + ".preferences_pb");
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery) {
        roomDatabase.getClass();
        supportSQLiteQuery.getClass();
        return roomDatabase.query(supportSQLiteQuery, (CancellationSignal) null);
    }

    public static final RedactedParcelableList redactList(List list) {
        list.getClass();
        return new RedactedParcelableList(list);
    }

    public static final FocusRequester rememberFocusRequesterAndRequestFocus(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
            gapComposer.startReplaceGroup(990244444);
            gapComposer.end(false);
            return focusRequester;
        }
        gapComposer.startReplaceGroup(990182940);
        Unit unit = Unit.INSTANCE;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CashApp$onCreate$1(focusRequester, null, 13);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        gapComposer.end(false);
        return focusRequester;
    }

    public static final void requestFocusCompat(View view, FocusRequester focusRequester) {
        focusRequester.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            view.post(new Task$$ExternalSyntheticLambda0(focusRequester, 5));
        } else {
            FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
        }
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    public static final float m1182resolveBulletTextUnitToPxo2QH7mI(long j, float f, Density density) {
        if (TextUnit.m1057equalsimpl0(j, TextUnit.Unspecified)) {
            return f;
        }
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            return density.mo235toPxR2X_6o(j);
        }
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
            return TextUnit.m1059getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    public static final float m1183resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        float m1059getValueimpl;
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            if (density.getFontScale() <= 1.05d) {
                return density.mo235toPxR2X_6o(j);
            }
            m1059getValueimpl = TextUnit.m1059getValueimpl(j) / TextUnit.m1059getValueimpl(density.mo239toSpkPz2Gy4(f));
        } else {
            if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
                return Float.NaN;
            }
            m1059getValueimpl = TextUnit.m1059getValueimpl(j);
        }
        return m1059getValueimpl * f;
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m1184setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ColorKt.m694toArgb8_81llA(j)), i, i2, 33);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m1185setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(MathKt__MathJVMKt.roundToInt(density.mo235toPxR2X_6o(j)), false), i, i2, 33);
        } else if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(TextUnit.m1059getValueimpl(j)), i, i2, 33);
        }
    }

    /* renamed from: setObject-sGr0YRc, reason: not valid java name */
    public static final void m1186setObjectsGr0YRc(Operations operations2, int i, Object obj) {
        operations2.objectArgs[(operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].objects) + i] = obj;
    }

    /* renamed from: setObjects-EsEZvaA, reason: not valid java name */
    public static final void m1187setObjectsEsEZvaA(Operations operations2, int i, Object obj, int i2, Object obj2) {
        int i3 = operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].objects;
        Object[] objArr = operations2.objectArgs;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final SafeFlow toFlow(Query query) {
        return new SafeFlow(new FlowQuery$asFlow$1(query, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /* renamed from: update-pLxbY9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1188updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions) {
        int i;
        LocaleList localeList;
        int i2;
        int i3;
        int i4 = imeOptions.imeAction;
        int i5 = imeOptions.keyboardType;
        boolean z = imeOptions.singleLine;
        if (i4 != 1) {
            if (i4 == 0) {
                i = 1;
            } else if (i4 == 2) {
                i = 2;
            } else if (i4 == 6) {
                i = 5;
            } else if (i4 == 5) {
                i = 7;
            } else if (i4 == 3) {
                i = 3;
            } else if (i4 == 4) {
                i = 4;
            } else {
                if (i4 != 7) {
                    a$$ExternalSyntheticBUOutline0.m$1("invalid ImeAction");
                    return;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            localeList = imeOptions.hintLocales;
            if (Intrinsics.areEqual(localeList, LocaleList.Empty)) {
            }
            if (i5 != 1) {
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i6 = TextRange.$r8$clinit;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & BodyPartID.bodyIdMax);
            coil3.size.SizeKt.setInitialSurroundingText(editorInfo, charSequence);
            editorInfo.imeOptions |= 33554432;
            if (StylusHandwriting_androidKt.isStylusHandwritingSupported) {
            }
            coil3.size.SizeKt.setStylusHandwritingEnabled(editorInfo, false);
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            localeList = imeOptions.hintLocales;
            if (Intrinsics.areEqual(localeList, LocaleList.Empty)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
                Iterator it = localeList.localeList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.compose.ui.text.intl.Locale) it.next()).platformLocale);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i2 = 2;
                    } else if (i5 == 4) {
                        i2 = 3;
                    } else if (i5 == 5) {
                        i2 = 17;
                    } else if (i5 == 6) {
                        i2 = 33;
                    } else if (i5 == 7) {
                        i2 = EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
                    } else if (i5 == 8) {
                        i2 = 18;
                    } else {
                        if (i5 != 9) {
                            a$$ExternalSyntheticBUOutline0.m$1("Invalid Keyboard Type");
                            return;
                        }
                        i2 = 8194;
                    }
                    editorInfo.inputType = i2;
                    if (!z && (i2 & 1) == 1) {
                        editorInfo.inputType = 131072 | i2;
                        if (imeOptions.imeAction == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = imeOptions.capitalization;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | PKIFailureInfo.certRevoked;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (imeOptions.autoCorrect) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i62 = TextRange.$r8$clinit;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & BodyPartID.bodyIdMax);
                    coil3.size.SizeKt.setInitialSurroundingText(editorInfo, charSequence);
                    editorInfo.imeOptions |= 33554432;
                    if (StylusHandwriting_androidKt.isStylusHandwritingSupported || i5 == 7 || i5 == 8) {
                        coil3.size.SizeKt.setStylusHandwritingEnabled(editorInfo, false);
                    } else {
                        coil3.size.SizeKt.setStylusHandwritingEnabled(editorInfo, true);
                        LanguageManagerKt.setHandwritingGestures(editorInfo);
                        return;
                    }
                }
                editorInfo.imeOptions |= PKIFailureInfo.systemUnavail;
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
                editorInfo.inputType = 131072 | i2;
                if (imeOptions.imeAction == 1) {
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i622 = TextRange.$r8$clinit;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & BodyPartID.bodyIdMax);
            coil3.size.SizeKt.setInitialSurroundingText(editorInfo, charSequence);
            editorInfo.imeOptions |= 33554432;
            if (StylusHandwriting_androidKt.isStylusHandwritingSupported) {
            }
            coil3.size.SizeKt.setStylusHandwritingEnabled(editorInfo, false);
        }
        i = 6;
        editorInfo.imeOptions = i;
        localeList = imeOptions.hintLocales;
        if (Intrinsics.areEqual(localeList, LocaleList.Empty)) {
        }
        if (i5 != 1) {
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i6222 = TextRange.$r8$clinit;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & BodyPartID.bodyIdMax);
        coil3.size.SizeKt.setInitialSurroundingText(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported) {
        }
        coil3.size.SizeKt.setStylusHandwritingEnabled(editorInfo, false);
    }

    public static void zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzg.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza = zzg.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zzc(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : zzg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzd(int i, int i2, String str) {
        if (i < 0) {
            return zzg.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public static /* synthetic */ void log$default(InternalLogger internalLogger, int i, List list, Function0 function0, Throwable th, int i2) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        ((zzlj) internalLogger).log(i, list, function0, th, false, (Map) null);
    }

    public static int decodeVarint32(byte[] bArr, int i, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            arrayDecoders$Registers.int1 = b;
            return i2;
        }
        return decodeVarint32(b, bArr, i2, arrayDecoders$Registers);
    }

    public static BlockersPresenterFactory.MetroFactory create(SetFactory setFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31, InstanceFactory instanceFactory32, InstanceFactory instanceFactory33, InstanceFactory instanceFactory34, InstanceFactory instanceFactory35, InstanceFactory instanceFactory36, InstanceFactory instanceFactory37, InstanceFactory instanceFactory38, InstanceFactory instanceFactory39, InstanceFactory instanceFactory40, InstanceFactory instanceFactory41, InstanceFactory instanceFactory42, InstanceFactory instanceFactory43, InstanceFactory instanceFactory44, InstanceFactory instanceFactory45, InstanceFactory instanceFactory46, InstanceFactory instanceFactory47, InstanceFactory instanceFactory48, InstanceFactory instanceFactory49, InstanceFactory instanceFactory50, InstanceFactory instanceFactory51, InstanceFactory instanceFactory52, InstanceFactory instanceFactory53, InstanceFactory instanceFactory54, InstanceFactory instanceFactory55, InstanceFactory instanceFactory56, InstanceFactory instanceFactory57, InstanceFactory instanceFactory58, LambdaProvider lambdaProvider, InstanceFactory instanceFactory59, InstanceFactory instanceFactory60, InstanceFactory instanceFactory61, InstanceFactory instanceFactory62, InstanceFactory instanceFactory63, InstanceFactory instanceFactory64, InstanceFactory instanceFactory65, InstanceFactory instanceFactory66, InstanceFactory instanceFactory67, InstanceFactory instanceFactory68) {
        doubleCheck.getClass();
        lambdaProvider.getClass();
        return new BlockersPresenterFactory.MetroFactory(setFactory, doubleCheck, instanceFactory, instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25, instanceFactory26, instanceFactory27, instanceFactory28, instanceFactory29, instanceFactory30, instanceFactory31, instanceFactory32, instanceFactory33, instanceFactory34, instanceFactory35, instanceFactory36, instanceFactory37, instanceFactory38, instanceFactory39, instanceFactory40, instanceFactory41, instanceFactory42, instanceFactory43, instanceFactory44, instanceFactory45, instanceFactory46, instanceFactory47, instanceFactory48, instanceFactory49, instanceFactory50, instanceFactory51, instanceFactory52, instanceFactory53, instanceFactory54, instanceFactory55, instanceFactory56, instanceFactory57, instanceFactory58, lambdaProvider, instanceFactory59, instanceFactory60, instanceFactory61, instanceFactory62, instanceFactory63, instanceFactory64, instanceFactory65, instanceFactory66, instanceFactory67, instanceFactory68);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleBarSub(Function2 function2, NavigationType navigationType, Modifier modifier, DynamicColorConfiguration dynamicColorConfiguration, Function0 function0, Modifier modifier2, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        DynamicColorConfiguration dynamicColorConfiguration2;
        int i4;
        Modifier modifier4;
        int i5;
        Function3 function32;
        DynamicColorConfiguration dynamicColorConfiguration3;
        GapComposer gapComposer;
        Modifier modifier5;
        Modifier modifier6;
        RecomposeScopeImpl endRestartGroup;
        DynamicColorConfiguration m1173invokeRGew2ao;
        Modifier modifier7;
        Modifier modifier8;
        int i6;
        function2.getClass();
        navigationType.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1429729652);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(navigationType.ordinal()) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier3 = modifier;
            i3 |= gapComposer2.changed(modifier3) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dynamicColorConfiguration2 = dynamicColorConfiguration;
                    if (gapComposer2.changed(dynamicColorConfiguration2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    dynamicColorConfiguration2 = dynamicColorConfiguration;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                dynamicColorConfiguration2 = dynamicColorConfiguration;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer2.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                modifier4 = modifier2;
            } else {
                modifier4 = modifier2;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer2.changed(modifier4) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
                function32 = function3;
            } else {
                function32 = function3;
                if ((1572864 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(function32) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
            }
            if (!gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer2.startDefaults();
                if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                    gapComposer2.skipToGroupEnd();
                    modifier8 = modifier3;
                    m1173invokeRGew2ao = dynamicColorConfiguration2;
                    modifier7 = modifier4;
                } else {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier modifier9 = i7 != 0 ? companion : modifier3;
                    m1173invokeRGew2ao = (i2 & 8) != 0 ? TransactorKt.m1173invokeRGew2ao(0L, 0L, 0L, gapComposer2, 7) : dynamicColorConfiguration2;
                    if (i4 != 0) {
                        modifier4 = companion;
                    }
                    if (i5 != 0) {
                        function32 = null;
                    }
                    modifier7 = modifier4;
                    modifier8 = modifier9;
                }
                gapComposer2.endDefaults();
                Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(m1173invokeRGew2ao.titleBarIcon, ArcadeThemeKt.LocalIconColor), re$$ExternalSyntheticOutline0.m(m1173invokeRGew2ao.titleBarText, ArcadeThemeKt.LocalTextColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle)}, Expect_jvmKt.rememberComposableLambda(-27209268, new UiContainer$$ExternalSyntheticLambda34(modifier8, navigationType, modifier7, function0, function32, ((Dp) gapComposer2.consume(ArcadeThemeKt.LocalScreenMargin)).value, function2), gapComposer2), gapComposer2, 56);
                dynamicColorConfiguration3 = m1173invokeRGew2ao;
                gapComposer = gapComposer2;
                modifier6 = modifier8;
                modifier5 = modifier7;
            } else {
                gapComposer2.skipToGroupEnd();
                dynamicColorConfiguration3 = dynamicColorConfiguration2;
                gapComposer = gapComposer2;
                modifier5 = modifier4;
                modifier6 = modifier3;
            }
            Function3 function33 = function32;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda1(function2, navigationType, modifier6, dynamicColorConfiguration3, function0, modifier5, function33, i, i2, 2);
                return;
            }
            return;
        }
        modifier3 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if (!gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        Function3 function332 = function32;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
