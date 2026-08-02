package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.Alignment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScanningPulseStyle {
    public final ScanningCardPulseParams cardParams;
    public final ScanningHeartPulseParams heartParams;
    public final ScanningPulseShape shape;
    public final ScanningStarPulseParams starParams;
    public static final ScanningPulseStyle Star = new ScanningPulseStyle(ScanningPulseShape.Star, (ScanningHeartPulseParams) null, (ScanningCardPulseParams) null, 14);
    public static final ScanningPulseStyle Heart = new ScanningPulseStyle(ScanningPulseShape.Heart, new ScanningHeartPulseParams(new ShapeStabilityAnimationParams(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.7f, 5.2f, 6), -8388609, 1), (ScanningCardPulseParams) null, 10);
    public static final ScanningPulseStyle Card = new ScanningPulseStyle(ScanningPulseShape.Card, (ScanningHeartPulseParams) null, new ScanningCardPulseParams(new ShapeStabilityAnimationParams(0.8f, 2.8f, 1.8f, 6.2f, 96), 1), 6);

    public ScanningPulseStyle(ScanningPulseShape scanningPulseShape, ScanningHeartPulseParams scanningHeartPulseParams, ScanningCardPulseParams scanningCardPulseParams, int i) {
        this(scanningPulseShape, new ScanningStarPulseParams(Alignment.Companion.TopCenter, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 240.0f, 0.75f, 1.8f, -0.75f, 3.12f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.52f, 0.58f, 1.27f, 0.53f, 33.4f, 0.05f, 1.7f, 1.2f, 0.05f, 981L, 1.58f, 400.0f, 72.0f, 1, 1.15f, 981L, 0.42f, 157.9f, 1.58f, 400.0f, 1.58f, 400.0f, new ShapeStabilityAnimationParams(1.4f, 4.8f, 2.1f, 8.5f, 96)), (i & 4) != 0 ? new ScanningHeartPulseParams(null, -1, 3) : scanningHeartPulseParams, (i & 8) != 0 ? new ScanningCardPulseParams(null, 3) : scanningCardPulseParams);
    }

    public static ScanningPulseStyle copy$default(ScanningPulseStyle scanningPulseStyle, ScanningStarPulseParams scanningStarPulseParams, ScanningHeartPulseParams scanningHeartPulseParams, ScanningCardPulseParams scanningCardPulseParams, int i) {
        ScanningPulseShape scanningPulseShape = scanningPulseStyle.shape;
        if ((i & 2) != 0) {
            scanningStarPulseParams = scanningPulseStyle.starParams;
        }
        if ((i & 4) != 0) {
            scanningHeartPulseParams = scanningPulseStyle.heartParams;
        }
        if ((i & 8) != 0) {
            scanningCardPulseParams = scanningPulseStyle.cardParams;
        }
        scanningPulseShape.getClass();
        scanningStarPulseParams.getClass();
        scanningHeartPulseParams.getClass();
        scanningCardPulseParams.getClass();
        return new ScanningPulseStyle(scanningPulseShape, scanningStarPulseParams, scanningHeartPulseParams, scanningCardPulseParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningPulseStyle)) {
            return false;
        }
        ScanningPulseStyle scanningPulseStyle = (ScanningPulseStyle) obj;
        return this.shape == scanningPulseStyle.shape && Intrinsics.areEqual(this.starParams, scanningPulseStyle.starParams) && Intrinsics.areEqual(this.heartParams, scanningPulseStyle.heartParams) && Intrinsics.areEqual(this.cardParams, scanningPulseStyle.cardParams);
    }

    public final int hashCode() {
        return this.cardParams.hashCode() + ((this.heartParams.hashCode() + ((this.starParams.hashCode() + (this.shape.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ScanningPulseStyle(shape=" + this.shape + ", starParams=" + this.starParams + ", heartParams=" + this.heartParams + ", cardParams=" + this.cardParams + ")";
    }

    public ScanningPulseStyle(ScanningPulseShape scanningPulseShape, ScanningStarPulseParams scanningStarPulseParams, ScanningHeartPulseParams scanningHeartPulseParams, ScanningCardPulseParams scanningCardPulseParams) {
        scanningHeartPulseParams.getClass();
        scanningCardPulseParams.getClass();
        this.shape = scanningPulseShape;
        this.starParams = scanningStarPulseParams;
        this.heartParams = scanningHeartPulseParams;
        this.cardParams = scanningCardPulseParams;
    }
}
