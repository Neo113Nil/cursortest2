package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$QrCodeWidgetTile extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$QrCodeWidgetTile INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$QrCodeWidgetTile("qr-code-widget-tile", 1);
    }
}
