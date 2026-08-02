package androidx.constraintlayout.core;

import androidx.camera.video.Recorder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ArrayRow {
    public final ArrayLinkedVariables variables;
    public SolverVariable mVariable = null;
    public float mConstantValue = RecyclerView.DECELERATION_RATE;
    public final ArrayList mVariablesToUpdate = new ArrayList();
    public boolean mIsSimpleDefinition = false;

    public ArrayRow(Recorder.AnonymousClass3 anonymousClass3) {
        this.variables = new ArrayLinkedVariables(this, anonymousClass3);
    }

    public final void addError(LinearSystem linearSystem, int i) {
        SolverVariable createErrorVariable = linearSystem.createErrorVariable(i);
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        arrayLinkedVariables.put(createErrorVariable, 1.0f);
        arrayLinkedVariables.put(linearSystem.createErrorVariable(i), -1.0f);
    }

    public final void createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.mConstantValue = i;
        }
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        if (z) {
            arrayLinkedVariables.put(solverVariable, 1.0f);
            arrayLinkedVariables.put(solverVariable2, -1.0f);
            arrayLinkedVariables.put(solverVariable3, -1.0f);
        } else {
            arrayLinkedVariables.put(solverVariable, -1.0f);
            arrayLinkedVariables.put(solverVariable2, 1.0f);
            arrayLinkedVariables.put(solverVariable3, 1.0f);
        }
    }

    public final void createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.mConstantValue = i;
        }
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        if (z) {
            arrayLinkedVariables.put(solverVariable, 1.0f);
            arrayLinkedVariables.put(solverVariable2, -1.0f);
            arrayLinkedVariables.put(solverVariable3, 1.0f);
        } else {
            arrayLinkedVariables.put(solverVariable, -1.0f);
            arrayLinkedVariables.put(solverVariable2, 1.0f);
            arrayLinkedVariables.put(solverVariable3, -1.0f);
        }
    }

    public SolverVariable getPivotCandidate(boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == RecyclerView.DECELERATION_RATE && this.variables.getCurrentSize() == 0;
    }

    public final SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        int i;
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        int currentSize = arrayLinkedVariables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < currentSize; i2++) {
            float variableValue = arrayLinkedVariables.getVariableValue(i2);
            if (variableValue < RecyclerView.DECELERATION_RATE) {
                SolverVariable variable = arrayLinkedVariables.getVariable(i2);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((i = variable.mType) == 3 || i == 4) && variableValue < f)) {
                    f = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public final void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.mVariable;
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        if (solverVariable2 != null) {
            arrayLinkedVariables.put(solverVariable2, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float remove = arrayLinkedVariables.remove(solverVariable, true) * (-1.0f);
        this.mVariable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.mConstantValue /= remove;
        int i = arrayLinkedVariables.mHead;
        for (int i2 = 0; i != -1 && i2 < arrayLinkedVariables.mCurrentSize; i2++) {
            float[] fArr = arrayLinkedVariables.mArrayValues;
            fArr[i] = fArr[i] / remove;
            i = arrayLinkedVariables.mArrayNextIndices[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.mVariable == null ? "0" : "" + this.mVariable).concat(" = ");
        if (this.mConstantValue != RecyclerView.DECELERATION_RATE) {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(concat);
            m.append(this.mConstantValue);
            concat = m.toString();
            z = true;
        } else {
            z = false;
        }
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        int currentSize = arrayLinkedVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayLinkedVariables.getVariable(i);
            if (variable != null) {
                float variableValue = arrayLinkedVariables.getVariableValue(i);
                if (variableValue != RecyclerView.DECELERATION_RATE) {
                    String solverVariable = variable.toString();
                    if (!z) {
                        if (variableValue < RecyclerView.DECELERATION_RATE) {
                            concat = concat.concat("- ");
                            variableValue *= -1.0f;
                        }
                        concat = variableValue == 1.0f ? concat.concat(solverVariable) : concat + variableValue + " " + solverVariable;
                        z = true;
                    } else if (variableValue > RecyclerView.DECELERATION_RATE) {
                        concat = concat.concat(" + ");
                        if (variableValue == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        variableValue *= -1.0f;
                        if (variableValue == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat("0.0") : concat;
    }

    public final void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable.isFinalValue) {
            ArrayLinkedVariables arrayLinkedVariables = this.variables;
            float f = arrayLinkedVariables.get(solverVariable);
            this.mConstantValue = (solverVariable.computedValue * f) + this.mConstantValue;
            arrayLinkedVariables.remove(solverVariable, z);
            if (z) {
                solverVariable.removeFromRow(this);
            }
            if (arrayLinkedVariables.getCurrentSize() == 0) {
                this.mIsSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        ArrayLinkedVariables arrayLinkedVariables = this.variables;
        arrayLinkedVariables.getClass();
        float f = arrayLinkedVariables.get(arrayRow.mVariable);
        arrayLinkedVariables.remove(arrayRow.mVariable, z);
        ArrayLinkedVariables arrayLinkedVariables2 = arrayRow.variables;
        int currentSize = arrayLinkedVariables2.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayLinkedVariables2.getVariable(i);
            arrayLinkedVariables.add(variable, arrayLinkedVariables2.get(variable) * f, z);
        }
        this.mConstantValue = (arrayRow.mConstantValue * f) + this.mConstantValue;
        if (z) {
            arrayRow.mVariable.removeFromRow(this);
        }
        if (this.mVariable == null || arrayLinkedVariables.getCurrentSize() != 0) {
            return;
        }
        this.mIsSimpleDefinition = true;
        linearSystem.hasSimpleDefinition = true;
    }
}
