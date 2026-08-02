package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.google.android.material.R$styleable;
import com.squareup.cash.RealBugReportSenderFactory;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;

/* loaded from: classes4.dex */
public final class ShapeAppearanceModel implements ShapeAppearance {
    public static final RelativeCornerSize PILL = new RelativeCornerSize(0.5f);
    public ResToolsKt topLeftCorner = new RoundedCornerTreatment();
    public ResToolsKt topRightCorner = new RoundedCornerTreatment();
    public ResToolsKt bottomRightCorner = new RoundedCornerTreatment();
    public ResToolsKt bottomLeftCorner = new RoundedCornerTreatment();
    public CornerSize topLeftCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
    public CornerSize topRightCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
    public CornerSize bottomRightCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
    public CornerSize bottomLeftCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
    public Transition.AnonymousClass1 topEdge = new Transition.AnonymousClass1();
    public Transition.AnonymousClass1 rightEdge = new Transition.AnonymousClass1();
    public Transition.AnonymousClass1 bottomEdge = new Transition.AnonymousClass1();
    public Transition.AnonymousClass1 leftEdge = new Transition.AnonymousClass1();

    public static RealBugReportSenderFactory builder(TypedArray typedArray, CornerSize cornerSize) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            CornerSize cornerSize2 = getCornerSize(typedArray, 5, cornerSize);
            CornerSize cornerSize3 = getCornerSize(typedArray, 8, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(typedArray, 9, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(typedArray, 7, cornerSize2);
            CornerSize cornerSize6 = getCornerSize(typedArray, 6, cornerSize2);
            RealBugReportSenderFactory realBugReportSenderFactory = new RealBugReportSenderFactory();
            realBugReportSenderFactory.bugReportService = RetryKt.createCornerTreatment(i2);
            realBugReportSenderFactory.endpoint = cornerSize3;
            realBugReportSenderFactory.sessionManager = RetryKt.createCornerTreatment(i3);
            realBugReportSenderFactory.backStackDumper = cornerSize4;
            realBugReportSenderFactory.tempStorage = RetryKt.createCornerTreatment(i4);
            realBugReportSenderFactory.featureEligibilityDumper = cornerSize5;
            realBugReportSenderFactory.preferences = RetryKt.createCornerTreatment(i5);
            realBugReportSenderFactory.cashDatabase = cornerSize6;
            return realBugReportSenderFactory;
        } finally {
            typedArray.recycle();
        }
    }

    public static CornerSize getCornerSize(TypedArray typedArray, int i, CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final ShapeAppearanceModel getDefaultShape() {
        return this;
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final ShapeAppearanceModel[] getShapeAppearanceModels() {
        return new ShapeAppearanceModel[]{this};
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final ShapeAppearanceModel getShapeForState(int[] iArr) {
        return this;
    }

    public final boolean isRoundRect(RectF rectF) {
        boolean z = this.leftEdge.getClass().equals(Transition.AnonymousClass1.class) && this.rightEdge.getClass().equals(Transition.AnonymousClass1.class) && this.topEdge.getClass().equals(Transition.AnonymousClass1.class) && this.bottomEdge.getClass().equals(Transition.AnonymousClass1.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && (this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment);
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final boolean isStateful() {
        return false;
    }

    public final RealBugReportSenderFactory toBuilder() {
        RealBugReportSenderFactory realBugReportSenderFactory = new RealBugReportSenderFactory();
        realBugReportSenderFactory.bugReportService = this.topLeftCorner;
        realBugReportSenderFactory.sessionManager = this.topRightCorner;
        realBugReportSenderFactory.tempStorage = this.bottomRightCorner;
        realBugReportSenderFactory.preferences = this.bottomLeftCorner;
        realBugReportSenderFactory.endpoint = this.topLeftCornerSize;
        realBugReportSenderFactory.backStackDumper = this.topRightCornerSize;
        realBugReportSenderFactory.featureEligibilityDumper = this.bottomRightCornerSize;
        realBugReportSenderFactory.cashDatabase = this.bottomLeftCornerSize;
        realBugReportSenderFactory.endpointContext = this.topEdge;
        realBugReportSenderFactory.scope = this.rightEdge;
        realBugReportSenderFactory.bugsnagClient = this.bottomEdge;
        realBugReportSenderFactory.recentMoneybotSession = this.leftEdge;
        return realBugReportSenderFactory;
    }

    public final String toString() {
        return "[" + this.topLeftCornerSize + ", " + this.topRightCornerSize + ", " + this.bottomRightCornerSize + ", " + this.bottomLeftCornerSize + "]";
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final ShapeAppearanceModel withCornerSize(RelativeCornerSize relativeCornerSize) {
        RealBugReportSenderFactory builder = toBuilder();
        builder.endpoint = relativeCornerSize;
        builder.backStackDumper = relativeCornerSize;
        builder.featureEligibilityDumper = relativeCornerSize;
        builder.cashDatabase = relativeCornerSize;
        return builder.build();
    }

    @Override // com.google.android.material.shape.ShapeAppearance
    public final ShapeAppearanceModel withCornerSize(float f) {
        RealBugReportSenderFactory builder = toBuilder();
        builder.setAllCornerSizes(f);
        return builder.build();
    }

    public static RealBugReportSenderFactory builder(Context context, AttributeSet attributeSet, int i, int i2, CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return builder(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), cornerSize);
    }

    public static RealBugReportSenderFactory builder(Context context, AttributeSet attributeSet, int i, int i2) {
        return builder(context, attributeSet, i, i2, new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE));
    }
}
