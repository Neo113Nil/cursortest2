package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class GuidelineReference implements Facade, Reference {
    public Guideline mGuidelineWidget;
    public String mKey;
    public int mOrientation;
    public final State mState;
    public int mStart = -1;
    public int mEnd = -1;
    public float mPercent = RecyclerView.DECELERATION_RATE;

    public GuidelineReference(State state) {
        this.mState = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i = this.mStart;
        if (i != -1) {
            Guideline guideline = this.mGuidelineWidget;
            if (i <= -1) {
                guideline.getClass();
                return;
            }
            guideline.mRelativePercent = -1.0f;
            guideline.mRelativeBegin = i;
            guideline.mRelativeEnd = -1;
            return;
        }
        int i2 = this.mEnd;
        Guideline guideline2 = this.mGuidelineWidget;
        if (i2 != -1) {
            if (i2 <= -1) {
                guideline2.getClass();
                return;
            }
            guideline2.mRelativePercent = -1.0f;
            guideline2.mRelativeBegin = -1;
            guideline2.mRelativeEnd = i2;
            return;
        }
        float f = this.mPercent;
        if (f <= -1.0f) {
            guideline2.getClass();
            return;
        }
        guideline2.mRelativePercent = f;
        guideline2.mRelativeBegin = -1;
        guideline2.mRelativeEnd = -1;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final ConstraintWidget getConstraintWidget() {
        if (this.mGuidelineWidget == null) {
            this.mGuidelineWidget = new Guideline();
        }
        return this.mGuidelineWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Object getKey() {
        return this.mKey;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.mGuidelineWidget = (Guideline) constraintWidget;
        } else {
            this.mGuidelineWidget = null;
        }
    }
}
