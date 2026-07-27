package android.content.Context;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterTextInputEditTextSolarForce9640 extends ViewGroup {
    public FrostHunterAssetManagerPulseStorm5752 FrostHunterAlertDialogAuroraDelta3200;
    public WeakReference FrostHunterCameraXPixelTurboCosmos9814;
    public IBinder FrostHunterFlowMaxDragonHero5809;
    public FrostHunterOnAttachStateChangeListenerSpeedPhoenix8318 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterActivityInfoTitaniumAlphaElite4329 FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLightSensorForceFusion4241;
    public boolean FrostHunterScaleAnimationStrikeSpark5059;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterTextInputEditTextSolarForce9640(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        FrostHunterOnTouchListenerPixelMaxSpectra9429 frostHunterOnTouchListenerPixelMaxSpectra9429 = new FrostHunterOnTouchListenerPixelMaxSpectra9429(2, this);
        addOnAttachStateChangeListener(frostHunterOnTouchListenerPixelMaxSpectra9429);
        FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823 = new FrostHunterMaterialCardViewShadowBlazeBlaze3823(27);
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterTextViewDragonStormMega4297(this).FrostHunterAlphaAnimationNeoCosmos5761.add(frostHunterMaterialCardViewShadowBlazeBlaze3823);
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterOnAttachStateChangeListenerSpeedPhoenix8318(this, frostHunterOnTouchListenerPixelMaxSpectra9429, frostHunterMaterialCardViewShadowBlazeBlaze3823);
    }

    private final void setParentContext(FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite4329) {
        if (this.FrostHunterKeyframeGammaGamma1197 != frostHunterActivityInfoTitaniumAlphaElite4329) {
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterActivityInfoTitaniumAlphaElite4329;
            if (frostHunterActivityInfoTitaniumAlphaElite4329 != null) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = null;
            }
            FrostHunterAssetManagerPulseStorm5752 frostHunterAssetManagerPulseStorm5752 = this.FrostHunterAlertDialogAuroraDelta3200;
            if (frostHunterAssetManagerPulseStorm5752 != null) {
                frostHunterAssetManagerPulseStorm5752.FrostHunterAlphaAnimationNeoCosmos5761();
                this.FrostHunterAlertDialogAuroraDelta3200 = null;
                if (isAttachedToWindow()) {
                    FrostHunterServiceEliteCelestialThunder1757();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.FrostHunterFlowMaxDragonHero5809 != iBinder) {
            this.FrostHunterFlowMaxDragonHero5809 = iBinder;
            this.FrostHunterCameraXPixelTurboCosmos9814 = null;
        }
    }

    public abstract void FrostHunterAlphaAnimationNeoCosmos5761(int i, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068);

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterLightSensorForceFusion4241) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrostHunterActivityInfoTitaniumAlphaElite4329 FrostHunterRemoteConfigSpeedSpeed8566() {
        FrostHunterCameraOlympianLegendUltra6831 frostHunterCameraOlympianLegendUltra6831;
        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615;
        FrostHunterMapPhoenixEpicOmega9434 frostHunterMapPhoenixEpicOmega9434;
        int i;
        FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite4329 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterActivityInfoTitaniumAlphaElite4329 == null) {
            frostHunterActivityInfoTitaniumAlphaElite4329 = FrostHunterColorStateListInflaterShadowSpeedMega1758.FrostHunterConstraintSetCloneMasterUltraRogue2633(this);
            if (frostHunterActivityInfoTitaniumAlphaElite4329 == null) {
                Object parent = getParent();
                while (frostHunterActivityInfoTitaniumAlphaElite4329 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    frostHunterActivityInfoTitaniumAlphaElite4329 = FrostHunterColorStateListInflaterShadowSpeedMega1758.FrostHunterConstraintSetCloneMasterUltraRogue2633(view);
                    parent = view.getParent();
                }
            }
            if (frostHunterActivityInfoTitaniumAlphaElite4329 != null) {
                FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite43292 = (!(frostHunterActivityInfoTitaniumAlphaElite4329 instanceof FrostHunterCameraOlympianLegendUltra6831) || ((FrostHunterInputFilterPulseEpicGamma6868) ((FrostHunterCameraOlympianLegendUltra6831) frostHunterActivityInfoTitaniumAlphaElite4329).FrostHunterTextViewDragonStormMega4297.getValue()).compareTo(FrostHunterInputFilterPulseEpicGamma6868.FrostHunterFlowMaxDragonHero5809) > 0) ? frostHunterActivityInfoTitaniumAlphaElite4329 : null;
                if (frostHunterActivityInfoTitaniumAlphaElite43292 != null) {
                    this.FrostHunterCameraXPixelTurboCosmos9814 = new WeakReference(frostHunterActivityInfoTitaniumAlphaElite43292);
                }
            } else {
                frostHunterActivityInfoTitaniumAlphaElite4329 = null;
            }
            if (frostHunterActivityInfoTitaniumAlphaElite4329 == null) {
                WeakReference weakReference = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (weakReference == null || (frostHunterActivityInfoTitaniumAlphaElite4329 = (FrostHunterActivityInfoTitaniumAlphaElite4329) weakReference.get()) == null || ((frostHunterActivityInfoTitaniumAlphaElite4329 instanceof FrostHunterCameraOlympianLegendUltra6831) && ((FrostHunterInputFilterPulseEpicGamma6868) ((FrostHunterCameraOlympianLegendUltra6831) frostHunterActivityInfoTitaniumAlphaElite4329).FrostHunterTextViewDragonStormMega4297.getValue()).compareTo(FrostHunterInputFilterPulseEpicGamma6868.FrostHunterFlowMaxDragonHero5809) <= 0)) {
                    frostHunterActivityInfoTitaniumAlphaElite4329 = null;
                }
                if (frostHunterActivityInfoTitaniumAlphaElite4329 == null) {
                    if (!isAttachedToWindow()) {
                        FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    FrostHunterActivityInfoTitaniumAlphaElite4329 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterColorStateListInflaterShadowSpeedMega1758.FrostHunterConstraintSetCloneMasterUltraRogue2633(view2);
                    if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                        ((FrostHunterOnPreDrawListenerSpeedEclipseHyperion5970) FrostHunterContentResolverEpicOmega2793.FrostHunterAlphaAnimationNeoCosmos5761.get()).getClass();
                        FrostHunterFCMThunderTitanium1373 frostHunterFCMThunderTitanium1373 = FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
                        FrostHunterSharedFlowTitaniumBeta1713 frostHunterSharedFlowTitaniumBeta1713 = FrostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterTextViewDragonStormMega4297;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            frostHunterCountDownTimerRogueTitan5615 = (FrostHunterCountDownTimerRogueTitan5615) FrostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterTextViewDragonStormMega4297.getValue();
                        } else {
                            frostHunterCountDownTimerRogueTitan5615 = (FrostHunterCountDownTimerRogueTitan5615) FrostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLooperThreadBetaHyperionMax1000.get();
                            if (frostHunterCountDownTimerRogueTitan5615 == null) {
                                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        FrostHunterCountDownTimerRogueTitan5615 FrostHunterFragmentBetaMegaVortex6025 = frostHunterCountDownTimerRogueTitan5615.FrostHunterFragmentBetaMegaVortex6025(frostHunterFCMThunderTitanium1373);
                        FrostHunterFirebaseForceDragon4248 frostHunterFirebaseForceDragon4248 = (FrostHunterFirebaseForceDragon4248) FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterViewPhantomNeo1634);
                        if (frostHunterFirebaseForceDragon4248 != null) {
                            FrostHunterMapPhoenixEpicOmega9434 frostHunterMapPhoenixEpicOmega94342 = new FrostHunterMapPhoenixEpicOmega9434(frostHunterFirebaseForceDragon4248);
                            FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834 = (FrostHunterAudioManagerNovaNovaXAurora2834) frostHunterMapPhoenixEpicOmega94342.FrostHunterAlertDialogAuroraDelta3200;
                            synchronized (frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809) {
                                frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterCameraXPixelTurboCosmos9814 = false;
                                frostHunterMapPhoenixEpicOmega9434 = frostHunterMapPhoenixEpicOmega94342;
                            }
                        } else {
                            frostHunterMapPhoenixEpicOmega9434 = 0;
                        }
                        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236 = new FrostHunterVibratorMegaNovaX1236();
                        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan56152 = (FrostHunterVideoCaptureAuroraCosmos4200) FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197(FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterCameraXTurboCelestialHero5430);
                        if (frostHunterCountDownTimerRogueTitan56152 == null) {
                            frostHunterCountDownTimerRogueTitan56152 = new FrostHunterViewPager2HyperBeta5714();
                            frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterCountDownTimerRogueTitan56152;
                        }
                        if (frostHunterMapPhoenixEpicOmega9434 != 0) {
                            frostHunterFCMThunderTitanium1373 = frostHunterMapPhoenixEpicOmega9434;
                        }
                        FrostHunterCountDownTimerRogueTitan5615 FrostHunterFragmentBetaMegaVortex60252 = FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025(frostHunterFCMThunderTitanium1373).FrostHunterFragmentBetaMegaVortex6025(frostHunterCountDownTimerRogueTitan56152);
                        FrostHunterCameraOlympianLegendUltra6831 frostHunterCameraOlympianLegendUltra68312 = new FrostHunterCameraOlympianLegendUltra6831(FrostHunterFragmentBetaMegaVortex60252);
                        synchronized (frostHunterCameraOlympianLegendUltra68312.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                            i = 1;
                            frostHunterCameraOlympianLegendUltra68312.FrostHunterResourcesTitanHyperVision5823 = true;
                        }
                        FrostHunterContentObserverShadowShadow6344 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterCardViewHyperionAurora3829.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFragmentBetaMegaVortex60252);
                        FrostHunterNotificationSpectraTurbo8770 FrostHunterBundlePulseFusionHero2475 = FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterBundlePulseFusionHero2475(view2);
                        FrostHunterDrawerLayoutEpicFusionShadow4742 FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterBundlePulseFusionHero2475 != null ? FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566() : null;
                        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                            FrostHunterAudioManagerThunderTitan4297.FrostHunterBundlePulseFusionHero2475("ViewTreeLifecycleOwner not found from " + view2);
                            throw new FrostHunterLinearLayoutSolarTurboSpark3070();
                        }
                        view2.addOnAttachStateChangeListener(new FrostHunterLayerDrawableMaxMega7247(view2, frostHunterCameraOlympianLegendUltra68312));
                        FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterContentProviderStormOmegaTitan3432(FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMapPhoenixEpicOmega9434, frostHunterCameraOlympianLegendUltra68312, frostHunterVibratorMegaNovaX1236, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, frostHunterCameraOlympianLegendUltra68312);
                        FrostHunterContentObserverLegendTitaniumForce9178 frostHunterContentObserverLegendTitaniumForce9178 = FrostHunterContentObserverLegendTitaniumForce9178.FrostHunterCameraXPixelTurboCosmos9814;
                        Handler handler = view2.getHandler();
                        int i2 = FrostHunterRunnableSpeedHyperion6925.FrostHunterAlphaAnimationNeoCosmos5761;
                        view2.addOnAttachStateChangeListener(new FrostHunterOnTouchListenerPixelMaxSpectra9429(3, FrostHunterPaintCyberPulse5979.FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterContentObserverLegendTitaniumForce9178, new FrostHunterCountDownTimerCyberVisionTitanium9970(handler, "windowRecomposer cleanup", false).FrostHunterServiceConnectionTurboPhoenixOmega6719, new FrostHunterTextViewAlphaCosmosElite6648(frostHunterCameraOlympianLegendUltra68312, view2, r1, i), 2)));
                        frostHunterCameraOlympianLegendUltra6831 = frostHunterCameraOlympianLegendUltra68312;
                    } else {
                        if (!(FrostHunterConstraintSetCloneMasterUltraRogue2633 instanceof FrostHunterCameraOlympianLegendUltra6831)) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        frostHunterCameraOlympianLegendUltra6831 = (FrostHunterCameraOlympianLegendUltra6831) FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                    r1 = ((FrostHunterInputFilterPulseEpicGamma6868) frostHunterCameraOlympianLegendUltra6831.FrostHunterTextViewDragonStormMega4297.getValue()).compareTo(FrostHunterInputFilterPulseEpicGamma6868.FrostHunterFlowMaxDragonHero5809) > 0 ? frostHunterCameraOlympianLegendUltra6831 : null;
                    if (r1 != null) {
                        this.FrostHunterCameraXPixelTurboCosmos9814 = new WeakReference(r1);
                    }
                    return frostHunterCameraOlympianLegendUltra6831;
                }
            }
        }
        return frostHunterActivityInfoTitaniumAlphaElite4329;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FrostHunterServiceEliteCelestialThunder1757() {
        if (this.FrostHunterAlertDialogAuroraDelta3200 == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.FrostHunterLightSensorForceFusion4241 = true;
                this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterSQLiteShadowHeroRogue7734.FrostHunterAlphaAnimationNeoCosmos5761(this, FrostHunterRemoteConfigSpeedSpeed8566(), new FrostHunterFlatMapAuroraOlympianBeta5874(-656146368, true, new FrostHunterMediaPlayerForcePrime6643(objArr == true ? 1 : 0, this)));
            } finally {
                this.FrostHunterLightSensorForceFusion4241 = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.FrostHunterAlertDialogAuroraDelta3200 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.FrostHunterScaleAnimationStrikeSpark5059 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            FrostHunterServiceEliteCelestialThunder1757();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrostHunterLifecycleBlazeGammaElite2889(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        FrostHunterServiceEliteCelestialThunder1757();
        FrostHunterLevelListDrawableFusionDragonHero2232(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite4329) {
        setParentContext(frostHunterActivityInfoTitaniumAlphaElite4329);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((FrostHunterFilterSpectraTitan5298) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.FrostHunterScaleAnimationStrikeSpark5059 = true;
    }

    public final void setViewCompositionStrategy(FrostHunterGradientDrawableAuroraAurora5526 frostHunterGradientDrawableAuroraAurora5526) {
        FrostHunterOnAttachStateChangeListenerSpeedPhoenix8318 frostHunterOnAttachStateChangeListenerSpeedPhoenix8318 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterOnAttachStateChangeListenerSpeedPhoenix8318 != null) {
            frostHunterOnAttachStateChangeListenerSpeedPhoenix8318.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        ((FrostHunterLiveDataScopeOmegaBeta9836) frostHunterGradientDrawableAuroraAurora5526).getClass();
        FrostHunterOnTouchListenerPixelMaxSpectra9429 frostHunterOnTouchListenerPixelMaxSpectra9429 = new FrostHunterOnTouchListenerPixelMaxSpectra9429(2, this);
        addOnAttachStateChangeListener(frostHunterOnTouchListenerPixelMaxSpectra9429);
        FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823 = new FrostHunterMaterialCardViewShadowBlazeBlaze3823(27);
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterTextViewDragonStormMega4297(this).FrostHunterAlphaAnimationNeoCosmos5761.add(frostHunterMaterialCardViewShadowBlazeBlaze3823);
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterOnAttachStateChangeListenerSpeedPhoenix8318(this, frostHunterOnTouchListenerPixelMaxSpectra9429, frostHunterMaterialCardViewShadowBlazeBlaze3823);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
