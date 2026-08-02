package androidx.constraintlayout.core;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class PriorityGoalRow extends ArrayRow {
    public Recorder.AnonymousClass4 mAccessor;
    public SolverVariable[] mArrayGoals;
    public int mNumGoals;
    public SolverVariable[] mSortArray;

    public final void addToGoal(SolverVariable solverVariable) {
        int i;
        SolverVariable[] solverVariableArr;
        int i2 = this.mNumGoals + 1;
        SolverVariable[] solverVariableArr2 = this.mArrayGoals;
        if (i2 > solverVariableArr2.length) {
            SolverVariable[] solverVariableArr3 = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
            this.mArrayGoals = solverVariableArr3;
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr3, solverVariableArr3.length * 2);
        }
        SolverVariable[] solverVariableArr4 = this.mArrayGoals;
        int i3 = this.mNumGoals;
        solverVariableArr4[i3] = solverVariable;
        int i4 = i3 + 1;
        this.mNumGoals = i4;
        if (i4 > 1 && solverVariableArr4[i3].id > solverVariable.id) {
            int i5 = 0;
            while (true) {
                i = this.mNumGoals;
                solverVariableArr = this.mSortArray;
                if (i5 >= i) {
                    break;
                }
                solverVariableArr[i5] = this.mArrayGoals[i5];
                i5++;
            }
            Arrays.sort(solverVariableArr, 0, i, new ViewPager.AnonymousClass1(5));
            for (int i6 = 0; i6 < this.mNumGoals; i6++) {
                this.mArrayGoals[i6] = this.mSortArray[i6];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final SolverVariable getPivotCandidate(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.mNumGoals; i2++) {
            SolverVariable[] solverVariableArr = this.mArrayGoals;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.id]) {
                Recorder.AnonymousClass4 anonymousClass4 = this.mAccessor;
                anonymousClass4.val$audioErrorConsumer = solverVariable;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector[i3];
                        if (f <= RecyclerView.DECELERATION_RATE) {
                            if (f < RecyclerView.DECELERATION_RATE) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.mGoalStrengthVector[i3];
                            float f3 = ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.mArrayGoals[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final boolean isEmpty() {
        return this.mNumGoals == 0;
    }

    public final void removeGoal(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.mNumGoals) {
            if (this.mArrayGoals[i] == solverVariable) {
                while (true) {
                    int i2 = this.mNumGoals;
                    if (i >= i2 - 1) {
                        this.mNumGoals = i2 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.mArrayGoals;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final String toString() {
        Recorder.AnonymousClass4 anonymousClass4 = this.mAccessor;
        String m = Recorder$$ExternalSyntheticOutline1.m(this.mConstantValue, ") : ", new StringBuilder(" goal -> ("));
        for (int i = 0; i < this.mNumGoals; i++) {
            anonymousClass4.val$audioErrorConsumer = this.mArrayGoals[i];
            m = m + anonymousClass4 + " ";
        }
        return m;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.mVariable;
        if (solverVariable == null) {
            return;
        }
        float[] fArr = solverVariable.mGoalStrengthVector;
        ArrayLinkedVariables arrayLinkedVariables = arrayRow.variables;
        int currentSize = arrayLinkedVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayLinkedVariables.getVariable(i);
            float variableValue = arrayLinkedVariables.getVariableValue(i);
            Recorder.AnonymousClass4 anonymousClass4 = this.mAccessor;
            anonymousClass4.val$audioErrorConsumer = variable;
            if (variable.inGoal) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector;
                    float f = (fArr[i2] * variableValue) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((PriorityGoalRow) anonymousClass4.this$0).removeGoal((SolverVariable) anonymousClass4.val$audioErrorConsumer);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != RecyclerView.DECELERATION_RATE) {
                        float f3 = f2 * variableValue;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector[i3] = f3;
                    } else {
                        ((SolverVariable) anonymousClass4.val$audioErrorConsumer).mGoalStrengthVector[i3] = 0.0f;
                    }
                }
                addToGoal(variable);
            }
            this.mConstantValue = (arrayRow.mConstantValue * variableValue) + this.mConstantValue;
        }
        removeGoal(solverVariable);
    }
}
