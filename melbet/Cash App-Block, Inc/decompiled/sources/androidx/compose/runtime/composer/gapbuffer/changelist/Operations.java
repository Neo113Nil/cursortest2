package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadt;
import com.squareup.util.Strings;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes.dex */
public final class Operations extends Strings {
    public int intArgsSize;
    public int objectArgsSize;
    public int opCodesSize;
    public Operation[] opCodes = new Operation[16];
    public int[] intArgs = new int[16];
    public Object[] objectArgs = new Object[16];

    public final class OpIterator {
        public int intIdx;
        public int objIdx;
        public int opIdx;

        public OpIterator() {
        }

        public final int getInt(int i) {
            return Operations.this.intArgs[this.intIdx + i];
        }

        /* renamed from: getObject-PtL-UHM, reason: not valid java name */
        public final Object m580getObjectPtLUHM(int i) {
            return Operations.this.objectArgs[this.objIdx + i];
        }
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        Arrays.fill(this.objectArgs, 0, this.objectArgsSize, (Object) null);
        this.objectArgsSize = 0;
    }

    public final void executeAndFlushAllPendingOperations(Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
        if (this.opCodesSize != 0) {
            OpIterator opIterator = new OpIterator();
            while (true) {
                Operations operations2 = Operations.this;
                Operation operation2 = operations2.opCodes[opIterator.opIdx];
                GapAnchor groupAnchor = operation2.getGroupAnchor(opIterator);
                Applier applier2 = applier;
                SlotWriter slotWriter2 = slotWriter;
                RememberEventDispatcher rememberEventDispatcher2 = rememberEventDispatcher;
                OperationErrorContext operationErrorContext2 = operationErrorContext;
                try {
                    operation2.execute(opIterator, applier2, slotWriter2, rememberEventDispatcher2, operationErrorContext2);
                    int i = opIterator.opIdx;
                    int i2 = operations2.opCodesSize;
                    if (i < i2) {
                        Operation operation3 = operations2.opCodes[i];
                        opIterator.intIdx += operation3.ints;
                        opIterator.objIdx += operation3.objects;
                        int i3 = i + 1;
                        opIterator.opIdx = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        applier = applier2;
                        slotWriter = slotWriter2;
                        rememberEventDispatcher = rememberEventDispatcher2;
                        operationErrorContext = operationErrorContext2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    zzadt.access$attachComposeStackTrace(th, operationErrorContext2, slotWriter2, groupAnchor);
                    throw th;
                }
            }
        }
        clear();
    }

    public final boolean isEmpty() {
        return this.opCodesSize == 0;
    }

    public final void pushOp(Operation operation2) {
        int i = this.opCodesSize;
        Operation[] operationArr = this.opCodes;
        if (i == operationArr.length) {
            Operation[] operationArr2 = new Operation[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(operationArr, 0, operationArr2, 0, i);
            this.opCodes = operationArr2;
        }
        int i2 = this.intArgsSize;
        int i3 = operation2.ints;
        int i4 = operation2.objects;
        int i5 = i2 + i3;
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ArraysKt___ArraysJvmKt.copyInto(0, iArr, 0, length, iArr2);
            this.intArgs = iArr2;
        }
        int i7 = this.objectArgsSize + i4;
        Object[] objArr = this.objectArgs;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.objectArgs = objArr2;
        }
        Operation[] operationArr3 = this.opCodes;
        int i9 = this.opCodesSize;
        this.opCodesSize = i9 + 1;
        operationArr3[i9] = operation2;
        this.intArgsSize += operation2.ints;
        this.objectArgsSize += i4;
    }
}
