package com.squareup.cash.arcade.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class ScreenScaffoldKt {
    public static final StaticProvidableCompositionLocal LocalScaffoldState = new StaticProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(22));

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenScaffoldColumn(Modifier modifier, ScrollState scrollState, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ScrollState scrollState2;
        PaddingValues paddingValues2;
        int i4;
        Function2 function22;
        Modifier modifier3;
        ScrollState scrollState3;
        PaddingValues paddingValues3;
        RecomposeScopeImpl endRestartGroup;
        ScrollState scrollState4;
        Modifier modifier4;
        PaddingValues paddingValues4;
        ScrollState scrollState5;
        PaddingValues zero;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1745391573);
        int i6 = i2 & 1;
        int i7 = 2;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                scrollState2 = scrollState;
                if (gapComposer.changed(scrollState2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                scrollState2 = scrollState;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            scrollState2 = scrollState;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer.changed(paddingValues2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            scrollState4 = ImageKt.rememberScrollState(gapComposer);
                            i3 &= -113;
                        } else {
                            scrollState4 = scrollState2;
                        }
                        if (i8 != 0) {
                            paddingValues2 = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
                        }
                        if (i4 != 0) {
                            PaddingValues paddingValues5 = paddingValues2;
                            modifier4 = modifier5;
                            paddingValues4 = paddingValues5;
                            scrollState5 = scrollState4;
                            function22 = null;
                        } else {
                            PaddingValues paddingValues6 = paddingValues2;
                            modifier4 = modifier5;
                            paddingValues4 = paddingValues6;
                            scrollState5 = scrollState4;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        scrollState5 = scrollState2;
                        paddingValues4 = paddingValues2;
                        modifier4 = modifier2;
                    }
                    gapComposer.endDefaults();
                    if (function22 == null) {
                        gapComposer.startReplaceGroup(-2085664868);
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        zero = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2085601225);
                        gapComposer.end(false);
                        PaddingValues.Companion.getClass();
                        zero = PaddingValues.Companion.getZero();
                    }
                    int i9 = i3 >> 3;
                    ScreenScaffoldGeneric(modifier4, scrollState5, composableLambdaImpl, function22, Expect_jvmKt.rememberComposableLambda(1934720902, new SectionKt$$ExternalSyntheticLambda2(i7, scrollState5, plus(zero, paddingValues4, gapComposer), composableLambdaImpl2), gapComposer), gapComposer, (i3 & 14) | 24576 | (i3 & 112) | (i9 & 896) | (i9 & 7168), 0);
                    paddingValues3 = paddingValues4;
                    modifier3 = modifier4;
                    scrollState3 = scrollState5;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    scrollState3 = scrollState2;
                    paddingValues3 = paddingValues2;
                }
                Function2 function23 = function22;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier3, (ScrollableState) scrollState3, paddingValues3, composableLambdaImpl, function23, (Function) composableLambdaImpl2, i, i2, 11);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            Function2 function232 = function22;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        Function2 function2322 = function22;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenScaffoldGeneric(Modifier modifier, ScrollableState scrollableState, ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i, int i2) {
        int i3;
        Function2 function22;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        scrollableState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2029903177);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(scrollableState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function22 = function2;
            i3 |= gapComposer.changedInstance(function22) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                function23 = function22;
            } else {
                Function2 function24 = i4 != 0 ? null : function22;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ScaffoldState();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ScaffoldState scaffoldState = (ScaffoldState) rememberedValue;
                Updater.CompositionLocalProvider(LocalScaffoldState.defaultProvidedValue$runtime(scaffoldState), Expect_jvmKt.rememberComposableLambda(-39272311, new SwipeToDismissKt$$ExternalSyntheticLambda3(modifier, composableLambdaImpl, scaffoldState, function24, composableLambdaImpl2, scrollableState), gapComposer), gapComposer, 56);
                function23 = function24;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier, (Object) scrollableState, (Object) composableLambdaImpl, (Object) function23, (Object) composableLambdaImpl2, i, i2, 10);
                return;
            }
            return;
        }
        function22 = function2;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenScaffoldLazy(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        Function2 function22;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        LazyListState lazyListState4;
        Modifier modifier3;
        Function2 function24;
        LazyListState lazyListState5;
        PaddingValues zero;
        int i5;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1552299499);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (gapComposer.changed(lazyListState2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            lazyListState2 = lazyListState;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer.changed(paddingValues2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                int i8 = 1;
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            lazyListState4 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
                            i3 &= -113;
                        } else {
                            lazyListState4 = lazyListState2;
                        }
                        paddingValues3 = i7 != 0 ? SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3) : paddingValues2;
                        if (i4 != 0) {
                            modifier3 = modifier4;
                            lazyListState5 = lazyListState4;
                            function24 = null;
                        } else {
                            modifier3 = modifier4;
                            function24 = function22;
                            lazyListState5 = lazyListState4;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        modifier3 = modifier2;
                        function24 = function22;
                        lazyListState5 = lazyListState2;
                        paddingValues3 = paddingValues2;
                    }
                    gapComposer.endDefaults();
                    if (function24 == null) {
                        gapComposer.startReplaceGroup(-640852046);
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        zero = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-640788403);
                        gapComposer.end(false);
                        PaddingValues.Companion.getClass();
                        zero = PaddingValues.Companion.getZero();
                    }
                    int i9 = i3 >> 3;
                    ScreenScaffoldGeneric(modifier3, lazyListState5, composableLambdaImpl, function24, Expect_jvmKt.rememberComposableLambda(-331137232, new SectionKt$$ExternalSyntheticLambda2(i8, lazyListState5, plus(zero, paddingValues3, gapComposer), function1), gapComposer), gapComposer, (i3 & 14) | 24576 | (i3 & 112) | (i9 & 896) | (i9 & 7168), 0);
                    modifier2 = modifier3;
                    lazyListState3 = lazyListState5;
                    function23 = function24;
                } else {
                    gapComposer.skipToGroupEnd();
                    lazyListState3 = lazyListState2;
                    paddingValues3 = paddingValues2;
                    function23 = function22;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier2, (ScrollableState) lazyListState3, paddingValues3, composableLambdaImpl, function23, (Function) function1, i, i2, 10);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            int i82 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        int i822 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final Modifier markAsScaffoldTitle(Modifier modifier, ScreenScaffoldContentScope screenScaffoldContentScope, Composer composer, int i) {
        modifier.getClass();
        screenScaffoldContentScope.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1230818705);
        Modifier markAsScaffoldTitle = ScreenScaffoldContentScope.markAsScaffoldTitle(gapComposer, modifier);
        gapComposer.end(false);
        return markAsScaffoldTitle;
    }

    public static final PaddingValuesImpl plus(PaddingValues paddingValues, PaddingValues paddingValues2, Composer composer) {
        paddingValues.getClass();
        LayoutDirection layoutDirection = (LayoutDirection) ((GapComposer) composer).consume(CompositionLocalsKt.LocalLayoutDirection);
        return new PaddingValuesImpl(SpacerKt.calculateStartPadding(paddingValues2, layoutDirection) + SpacerKt.calculateStartPadding(paddingValues, layoutDirection), paddingValues2.mo267calculateTopPaddingD9Ej5fM() + paddingValues.mo267calculateTopPaddingD9Ej5fM(), SpacerKt.calculateEndPadding(paddingValues2, layoutDirection) + SpacerKt.calculateEndPadding(paddingValues, layoutDirection), paddingValues2.mo264calculateBottomPaddingD9Ej5fM() + paddingValues.mo264calculateBottomPaddingD9Ej5fM());
    }
}
