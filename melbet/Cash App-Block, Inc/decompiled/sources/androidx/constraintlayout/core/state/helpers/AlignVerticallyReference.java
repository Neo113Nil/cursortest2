package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AlignVerticallyReference extends HelperReference {
    public final /* synthetic */ int $r8$classId;
    public float mBias;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlignVerticallyReference(State state, int i, int i2) {
        super(state, i);
        this.$r8$classId = i2;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        int i = this.$r8$classId;
        State state = this.mHelperState;
        ArrayList arrayList = this.mReferences;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ConstraintReference constraints = state.constraints(it.next());
                    constraints.clearVertical();
                    Object obj = this.mTopToTop;
                    if (obj != null) {
                        constraints.topToTop(obj);
                    } else {
                        Object obj2 = this.mTopToBottom;
                        if (obj2 != null) {
                            constraints.mLast = 10;
                            constraints.mTopToBottom = obj2;
                        } else {
                            constraints.topToTop(0);
                        }
                    }
                    Object obj3 = this.mBottomToTop;
                    if (obj3 != null) {
                        constraints.mLast = 12;
                        constraints.mBottomToTop = obj3;
                    } else {
                        Object obj4 = this.mBottomToBottom;
                        if (obj4 != null) {
                            constraints.bottomToBottom(obj4);
                        } else {
                            constraints.bottomToBottom(0);
                        }
                    }
                    float f = this.mBias;
                    if (f != 0.5f) {
                        constraints.mVerticalBias = f;
                    }
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ConstraintReference constraints2 = state.constraints(it2.next());
                    constraints2.clearHorizontal();
                    Object obj5 = this.mStartToStart;
                    if (obj5 != null) {
                        constraints2.startToStart(obj5);
                    } else {
                        Object obj6 = this.mStartToEnd;
                        if (obj6 != null) {
                            constraints2.mLast = 6;
                            constraints2.mStartToEnd = obj6;
                        } else {
                            constraints2.startToStart(0);
                        }
                    }
                    Object obj7 = this.mEndToStart;
                    if (obj7 != null) {
                        constraints2.mLast = 7;
                        constraints2.mEndToStart = obj7;
                    } else {
                        Object obj8 = this.mEndToEnd;
                        if (obj8 != null) {
                            constraints2.endToEnd(obj8);
                        } else {
                            constraints2.endToEnd(0);
                        }
                    }
                    float f2 = this.mBias;
                    if (f2 != 0.5f) {
                        constraints2.mHorizontalBias = f2;
                    }
                }
                break;
        }
    }
}
