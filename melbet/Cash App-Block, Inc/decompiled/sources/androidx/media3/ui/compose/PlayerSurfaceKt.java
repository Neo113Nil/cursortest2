package androidx.media3.ui.compose;

import android.view.View;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$Factory$Impl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class PlayerSurfaceKt {
    public static final void PlayerSurface(ExoPlayer exoPlayer, Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(12998269);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changedInstance(exoPlayer) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            Object obj = Composer.Companion.Empty;
            if (i == 1) {
                gapComposer.startReplaceGroup(-1232449568);
                gapComposer.startReplaceGroup(-316851119);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-316847932);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(8, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function1 = (Function1) rememberedValue2;
                gapComposer.end(false);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer));
                    gapComposer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue3 = compositionScopedCoroutineScopeCanceller;
                }
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).coroutineScope;
                gapComposer.startReplaceGroup(-316834021);
                boolean changedInstance = gapComposer.changedInstance(coroutineScope);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == obj) {
                    rememberedValue4 = new PlayerSurfaceKt$$ExternalSyntheticLambda1(coroutineScope, mutableState, 0);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function1 function12 = (Function1) rememberedValue4;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-316803765);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj) {
                    rememberedValue5 = PlayerSurfaceKt$PlayerSurface$1$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                gapComposer.end(false);
                Function2 function2 = (Function2) ((KFunction) rememberedValue5);
                gapComposer.startReplaceGroup(-316802035);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj) {
                    rememberedValue6 = PlayerSurfaceKt$PlayerSurface$2$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                gapComposer.end(false);
                PlayerSurfaceInternal(exoPlayer, modifier, function1, function2, (Function2) ((KFunction) rememberedValue6), function12, gapComposer, (i3 & 14) | 28032 | (i3 & 112), 0);
                gapComposer.end(false);
            } else {
                if (i != 2) {
                    gapComposer.startReplaceGroup(-316790535);
                    gapComposer.end(false);
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unrecognized surface type: "));
                    return;
                }
                gapComposer.startReplaceGroup(-316797472);
                gapComposer.startReplaceGroup(-316795171);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj) {
                    rememberedValue7 = PlayerSurfaceKt$PlayerSurface$3$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                gapComposer.end(false);
                Function1 function13 = (Function1) ((KFunction) rememberedValue7);
                gapComposer.startReplaceGroup(-316793941);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == obj) {
                    rememberedValue8 = PlayerSurfaceKt$PlayerSurface$4$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                gapComposer.end(false);
                Function2 function22 = (Function2) ((KFunction) rememberedValue8);
                gapComposer.startReplaceGroup(-316792211);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (rememberedValue9 == obj) {
                    rememberedValue9 = PlayerSurfaceKt$PlayerSurface$5$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                gapComposer.end(false);
                PlayerSurfaceInternal(exoPlayer, modifier, function13, function22, (Function2) ((KFunction) rememberedValue9), null, gapComposer, (i3 & 14) | 28032 | (i3 & 112), 32);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(exoPlayer, modifier, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerSurfaceInternal(ExoPlayer exoPlayer, Modifier modifier, Function1 function1, Function2 function2, Function2 function22, Function1 function12, Composer composer, int i, int i2) {
        int i3;
        Function2 function23;
        Function1 function13;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function14;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        View view;
        Object zzmhVar;
        boolean z2;
        View view2;
        Function1 function15;
        Function1 function16;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(25948461);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(exoPlayer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function23 = function2;
            i3 |= gapComposer.changedInstance(function23) ? 2048 : 1024;
        } else {
            function23 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            function13 = function12;
            i3 |= gapComposer.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536;
            if ((74899 & i3) == 74898 || !gapComposer.getSkipping()) {
                neverEqualPolicy = Composer.Companion.Empty;
                if (i4 == 0) {
                    gapComposer.startReplaceGroup(-1838626673);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new Navigation$$ExternalSyntheticLambda1(13);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    function14 = (Function1) rememberedValue5;
                    gapComposer.end(false);
                } else {
                    function14 = function13;
                }
                gapComposer.startReplaceGroup(-1838625934);
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-1838622977);
                z = (i3 & 896) != 256;
                rememberedValue2 = gapComposer.rememberedValue();
                if (!z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(5, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function17 = (Function1) rememberedValue2;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-1838621905);
                rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new Navigation$$ExternalSyntheticLambda1(14);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function1 function18 = (Function1) rememberedValue3;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-1838621350);
                rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new DateInputKt$$ExternalSyntheticLambda5(9, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                gapComposer.end(false);
                Function1 function19 = function14;
                AndroidView_androidKt.AndroidView(function17, modifier, function18, null, (Function1) rememberedValue4, gapComposer, (i3 & 112) | 24960, 8);
                view = (View) mutableState.getValue();
                if (view != null) {
                    function15 = function19;
                } else {
                    gapComposer.startReplaceGroup(-898367774);
                    boolean changedInstance = gapComposer.changedInstance(exoPlayer) | ((458752 & i3) == 131072) | gapComposer.changedInstance(view);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new MenuKt$$ExternalSyntheticLambda0(23, exoPlayer, function19, view);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    gapComposer.end(false);
                    Updater.DisposableEffect(view, exoPlayer, (Function1) rememberedValue6, gapComposer);
                    gapComposer.startReplaceGroup(-898353912);
                    boolean changedInstance2 = gapComposer.changedInstance(exoPlayer) | gapComposer.changedInstance(view) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                        z2 = false;
                        Function2 function24 = function23;
                        view2 = view;
                        function15 = function19;
                        zzmhVar = new zzmh(exoPlayer, view2, function24, function22, null, 2);
                        gapComposer.updateRememberedValue(zzmhVar);
                    } else {
                        view2 = view;
                        zzmhVar = rememberedValue7;
                        z2 = false;
                        function15 = function19;
                    }
                    gapComposer.end(z2);
                    Updater.LaunchedEffect(view2, exoPlayer, (Function2) zzmhVar, gapComposer);
                }
                function16 = function15;
            } else {
                gapComposer.skipToGroupEnd();
                function16 = function13;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(exoPlayer, modifier, function1, function2, function22, function16, i, i2);
                return;
            }
            return;
        }
        function13 = function12;
        if ((74899 & i3) == 74898) {
        }
        neverEqualPolicy = Composer.Companion.Empty;
        if (i4 == 0) {
        }
        gapComposer.startReplaceGroup(-1838625934);
        rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == neverEqualPolicy) {
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(-1838622977);
        if ((i3 & 896) != 256) {
        }
        rememberedValue2 = gapComposer.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(5, function1);
        gapComposer.updateRememberedValue(rememberedValue2);
        Function1 function172 = (Function1) rememberedValue2;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(-1838621905);
        rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
        }
        Function1 function182 = (Function1) rememberedValue3;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(-1838621350);
        rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
        }
        gapComposer.end(false);
        Function1 function192 = function14;
        AndroidView_androidKt.AndroidView(function172, modifier, function182, null, (Function1) rememberedValue4, gapComposer, (i3 & 112) | 24960, 8);
        view = (View) mutableState2.getValue();
        if (view != null) {
        }
        function16 = function15;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAppMessage.deepLinkSpecs;
    }

    public static MarkwonConfiguration provideTransactionLoader(RealTransactionLoader$Factory$Impl realTransactionLoader$Factory$Impl, CoroutineScope coroutineScope) {
        CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = realTransactionLoader$Factory$Impl.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
        Flow flow = (Flow) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
        cashAccountDatabaseImpl.getClass();
        flow.getClass();
        coroutineContext.getClass();
        coroutineContext2.getClass();
        MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
        markwonConfiguration.theme = flow;
        markwonConfiguration.syntaxHighlight = coroutineContext;
        markwonConfiguration.linkResolver = coroutineContext2;
        markwonConfiguration.imageDestinationProcessor = coroutineScope;
        markwonConfiguration.spansFactory = cashAccountDatabaseImpl.cashActivityQueries;
        return markwonConfiguration;
    }
}
