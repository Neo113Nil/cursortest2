package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i) {
        composer.startReplaceableGroup(-873615933);
        ComposerKt.sourceInformation(composer, "C(rememberAndroidExternalSurfaceState)190@7150L24,191@7186L47:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0065  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m206AndroidExternalSurface58FFMhA(Modifier modifier, boolean z, long j, int i, boolean z2, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        Modifier.Companion companion;
        long j3;
        boolean z5;
        boolean changed;
        Object rememberedValue;
        final boolean z6;
        final boolean z7;
        final int i9;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(640888974);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)288@12167L37,290@12210L1032:AndroidExternalSurface.android.kt#71ulvw");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j2 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            i8 = startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                        }
                        if ((374491 & i4) == 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    j2 = IntSize.INSTANCE.m5909getZeroYbymL2g();
                                }
                                if (i5 != 0) {
                                    i6 = AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc();
                                }
                                j3 = j2;
                                if (i7 != 0) {
                                    z5 = false;
                                    int i13 = i4;
                                    final int i14 = i6;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                                    }
                                    final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                                    Function1<Context, SurfaceView> function12 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final SurfaceView invoke(Context context) {
                                            SurfaceView surfaceView = new SurfaceView(context);
                                            Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                                            AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState;
                                            function13.invoke(androidExternalSurfaceState);
                                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                            return surfaceView;
                                        }
                                    };
                                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SurfaceView surfaceView) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                            invoke2(surfaceView);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1909066533);
                                    changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i14) | startRestartGroup.changed(z5);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final long j4 = j3;
                                        final boolean z8 = z3;
                                        final boolean z9 = z5;
                                        rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                                invoke2(surfaceView);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SurfaceView surfaceView) {
                                                if (!IntSize.m5902equalsimpl0(j4, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                                                    surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j4), IntSize.m5903getHeightimpl(j4));
                                                } else {
                                                    surfaceView.getHolder().setSizeFromLayout();
                                                }
                                                surfaceView.getHolder().setFormat(z8 ? -1 : -3);
                                                int i15 = i14;
                                                if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                                                    surfaceView.setZOrderOnTop(false);
                                                } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                                                    surfaceView.setZOrderMediaOverlay(true);
                                                } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                                                    surfaceView.setZOrderOnTop(true);
                                                }
                                                surfaceView.setSecure(z9);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) rememberedValue, startRestartGroup, ((i13 << 3) & 112) | 384, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j2 = j3;
                                    z6 = z3;
                                    modifier2 = companion;
                                    z7 = z5;
                                    i9 = i14;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                companion = modifier2;
                                j3 = j2;
                            }
                            z5 = z4;
                            int i132 = i4;
                            final int i142 = i6;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                            Function1<Context, SurfaceView> function122 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final SurfaceView invoke(Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2;
                                    function13.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }
                            };
                            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SurfaceView surfaceView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1909066533);
                            changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i142) | startRestartGroup.changed(z5);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            final long j42 = j3;
                            final boolean z82 = z3;
                            final boolean z92 = z5;
                            rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SurfaceView surfaceView) {
                                    if (!IntSize.m5902equalsimpl0(j42, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                                        surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j42), IntSize.m5903getHeightimpl(j42));
                                    } else {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    }
                                    surfaceView.getHolder().setFormat(z82 ? -1 : -3);
                                    int i15 = i142;
                                    if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z92);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function122, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22, null, (Function1) rememberedValue, startRestartGroup, ((i132 << 3) & 112) | 384, 8);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j2 = j3;
                            z6 = z3;
                            modifier2 = companion;
                            z7 = z5;
                            i9 = i142;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z3;
                            i9 = i6;
                            z7 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final long j5 = j2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    AndroidExternalSurface_androidKt.m206AndroidExternalSurface58FFMhA(Modifier.this, z6, j5, i9, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i4 |= i8;
                    if ((374491 & i4) == 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    j3 = j2;
                    if (i7 != 0) {
                    }
                    z5 = z4;
                    int i1322 = i4;
                    final int i1422 = i6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                    Function1<Context, SurfaceView> function1222 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState22;
                            function13.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }
                    };
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1909066533);
                    changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i1422) | startRestartGroup.changed(z5);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    final long j422 = j3;
                    final boolean z822 = z3;
                    final boolean z922 = z5;
                    rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m5902equalsimpl0(j422, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j422), IntSize.m5903getHeightimpl(j422));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z822 ? -1 : -3);
                            int i15 = i1422;
                            if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z922);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function1222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$222, null, (Function1) rememberedValue, startRestartGroup, ((i1322 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j2 = j3;
                    z6 = z3;
                    modifier2 = companion;
                    z7 = z5;
                    i9 = i1422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                if ((i3 & 32) != 0) {
                }
                i4 |= i8;
                if ((374491 & i4) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                j3 = j2;
                if (i7 != 0) {
                }
                z5 = z4;
                int i13222 = i4;
                final int i14222 = i6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                Function1<Context, SurfaceView> function12222 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState222;
                        function13.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }
                };
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.startReplaceableGroup(-1909066533);
                changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i14222) | startRestartGroup.changed(z5);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                final long j4222 = j3;
                final boolean z8222 = z3;
                final boolean z9222 = z5;
                rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m5902equalsimpl0(j4222, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j4222), IntSize.m5903getHeightimpl(j4222));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z8222 ? -1 : -3);
                        int i15 = i14222;
                        if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z9222);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function12222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2222, null, (Function1) rememberedValue, startRestartGroup, ((i13222 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                j2 = j3;
                z6 = z3;
                modifier2 = companion;
                z7 = z5;
                i9 = i14222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((i3 & 32) != 0) {
            }
            i4 |= i8;
            if ((374491 & i4) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            j3 = j2;
            if (i7 != 0) {
            }
            z5 = z4;
            int i132222 = i4;
            final int i142222 = i6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
            Function1<Context, SurfaceView> function122222 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final SurfaceView invoke(Context context) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                    AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2222;
                    function13.invoke(androidExternalSurfaceState);
                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                    return surfaceView;
                }
            };
            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }
            };
            startRestartGroup.startReplaceableGroup(-1909066533);
            changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i142222) | startRestartGroup.changed(z5);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            final long j42222 = j3;
            final boolean z82222 = z3;
            final boolean z92222 = z5;
            rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                    if (!IntSize.m5902equalsimpl0(j42222, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                        surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j42222), IntSize.m5903getHeightimpl(j42222));
                    } else {
                        surfaceView.getHolder().setSizeFromLayout();
                    }
                    surfaceView.getHolder().setFormat(z82222 ? -1 : -3);
                    int i15 = i142222;
                    if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                        surfaceView.setZOrderOnTop(false);
                    } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                        surfaceView.setZOrderMediaOverlay(true);
                    } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                        surfaceView.setZOrderOnTop(true);
                    }
                    surfaceView.setSecure(z92222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function122222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22222, null, (Function1) rememberedValue, startRestartGroup, ((i132222 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            j2 = j3;
            z6 = z3;
            modifier2 = companion;
            z7 = z5;
            i9 = i142222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((i3 & 32) != 0) {
        }
        i4 |= i8;
        if ((374491 & i4) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        j3 = j2;
        if (i7 != 0) {
        }
        z5 = z4;
        int i1322222 = i4;
        final int i1422222 = i6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
        Function1<Context, SurfaceView> function1222222 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SurfaceView invoke(Context context) {
                SurfaceView surfaceView = new SurfaceView(context);
                Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState22222;
                function13.invoke(androidExternalSurfaceState);
                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                return surfaceView;
            }
        };
        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SurfaceView surfaceView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                invoke2(surfaceView);
                return Unit.INSTANCE;
            }
        };
        startRestartGroup.startReplaceableGroup(-1909066533);
        changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i1422222) | startRestartGroup.changed(z5);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j422222 = j3;
        final boolean z822222 = z3;
        final boolean z922222 = z5;
        rememberedValue = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                invoke2(surfaceView);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SurfaceView surfaceView) {
                if (!IntSize.m5902equalsimpl0(j422222, IntSize.INSTANCE.m5909getZeroYbymL2g())) {
                    surfaceView.getHolder().setFixedSize(IntSize.m5904getWidthimpl(j422222), IntSize.m5903getHeightimpl(j422222));
                } else {
                    surfaceView.getHolder().setSizeFromLayout();
                }
                surfaceView.getHolder().setFormat(z822222 ? -1 : -3);
                int i15 = i1422222;
                if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m202getBehindB_4ceCc())) {
                    surfaceView.setZOrderOnTop(false);
                } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m203getMediaOverlayB_4ceCc())) {
                    surfaceView.setZOrderMediaOverlay(true);
                } else if (AndroidExternalSurfaceZOrder.m198equalsimpl0(i15, AndroidExternalSurfaceZOrder.INSTANCE.m204getOnTopB_4ceCc())) {
                    surfaceView.setZOrderOnTop(true);
                }
                surfaceView.setSecure(z922222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(function1222222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$222222, null, (Function1) rememberedValue, startRestartGroup, ((i1322222 << 3) & 112) | 384, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = j3;
        z6 = z3;
        modifier2 = companion;
        z7 = z5;
        i9 = i1422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i) {
        composer.startReplaceableGroup(-1057437053);
        ComposerKt.sourceInformation(composer, "C(rememberAndroidEmbeddedExternalSurfaceState)384@15036L24,385@15072L55:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0065  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m205AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j, float[] fArr, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        Modifier.Companion companion;
        float[] fArr2;
        final long j3;
        final float[] fArr3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(217541314);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)455@18917L45,457@18968L796:AndroidExternalSurface.android.kt#71ulvw");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if (i4 == 8 || (46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = IntSize.INSTANCE.m5909getZeroYbymL2g();
                        i3 &= -897;
                    }
                    fArr2 = i4 == 0 ? null : fArr;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr2 = fArr;
                    companion = modifier2;
                }
                int i8 = i3;
                final boolean z3 = z2;
                final long j4 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(217541314, i8, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                }
                final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                final float[] fArr4 = fArr2;
                AndroidView_androidKt.AndroidView(new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = AndroidEmbeddedExternalSurfaceState.this;
                        long j5 = j4;
                        Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                        androidEmbeddedExternalSurfaceState.m194setSurfaceSizeozmzZPI(j5);
                        function12.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }
                }, companion, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }
                }, null, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m5902equalsimpl0(j4, IntSize.INSTANCE.m5909getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m5904getWidthimpl(j4), IntSize.m5903getHeightimpl(j4));
                        }
                        rememberAndroidEmbeddedExternalSurfaceState.m194setSurfaceSizeozmzZPI(j4);
                        textureView.setOpaque(z3);
                        float[] fArr5 = fArr4;
                        if (fArr5 != null) {
                            matrix = rememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m3277setFromEL8BTi8(matrix, fArr5);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                }, startRestartGroup, ((i8 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                j3 = j4;
                fArr3 = fArr2;
            } else {
                startRestartGroup.skipToGroupEnd();
                fArr3 = fArr;
                companion = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final boolean z4 = z2;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        AndroidExternalSurface_androidKt.m205AndroidEmbeddedExternalSurfacesv6N_fY(Modifier.this, z4, j3, fArr3, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 8) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 == 0) {
        }
        int i82 = i3;
        final boolean z32 = z2;
        final long j42 = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
        final float[] fArr42 = fArr2;
        AndroidView_androidKt.AndroidView(new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final TextureView invoke(Context context) {
                TextureView textureView = new TextureView(context);
                AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = AndroidEmbeddedExternalSurfaceState.this;
                long j5 = j42;
                Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                androidEmbeddedExternalSurfaceState.m194setSurfaceSizeozmzZPI(j5);
                function12.invoke(androidEmbeddedExternalSurfaceState);
                textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                return textureView;
            }
        }, companion, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextureView textureView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                invoke2(textureView);
                return Unit.INSTANCE;
            }
        }, null, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                invoke2(textureView);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextureView textureView) {
                Matrix matrix;
                SurfaceTexture surfaceTexture;
                if (!IntSize.m5902equalsimpl0(j42, IntSize.INSTANCE.m5909getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize(IntSize.m5904getWidthimpl(j42), IntSize.m5903getHeightimpl(j42));
                }
                rememberAndroidEmbeddedExternalSurfaceState2.m194setSurfaceSizeozmzZPI(j42);
                textureView.setOpaque(z32);
                float[] fArr5 = fArr42;
                if (fArr5 != null) {
                    matrix = rememberAndroidEmbeddedExternalSurfaceState2.getMatrix();
                    AndroidMatrixConversions_androidKt.m3277setFromEL8BTi8(matrix, fArr5);
                } else {
                    matrix = null;
                }
                textureView.setTransform(matrix);
            }
        }, startRestartGroup, ((i82 << 3) & 112) | 384, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z32;
        j3 = j42;
        fArr3 = fArr2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
