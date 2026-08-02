package androidx.constraintlayout.compose;

import androidx.biometric.BiometricPrompt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public int childId;
    public final ArrayList childrenRefs;
    public BiometricPrompt referencesObject;

    public final class ConstrainAsModifier extends TestTagKt implements ParentDataModifier {
        public final Function1 constrainBlock;
        public final ConstrainedLayoutReference ref;

        public ConstrainAsModifier(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
            this.ref = constrainedLayoutReference;
            this.constrainBlock = function1;
        }

        public final boolean equals(Object obj) {
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return this.constrainBlock == (constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        public final int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object modifyParentData(Density density, Object obj) {
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }
    }

    public ConstraintLayoutScope() {
        super(null);
        this.childId = 0;
        this.childrenRefs = new ArrayList();
    }

    public static Modifier constrainAs(Modifier modifier, ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        return modifier.then(new ConstrainAsModifier(constrainedLayoutReference, function1));
    }

    public final ConstrainedLayoutReference createRef() {
        int i = this.childId;
        this.childId = i + 1;
        ArrayList arrayList = this.childrenRefs;
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) CollectionsKt.getOrNull(i, arrayList);
        if (constrainedLayoutReference != null) {
            return constrainedLayoutReference;
        }
        ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
        arrayList.add(constrainedLayoutReference2);
        return constrainedLayoutReference2;
    }

    public final BiometricPrompt createRefs() {
        BiometricPrompt biometricPrompt = this.referencesObject;
        if (biometricPrompt != null) {
            return biometricPrompt;
        }
        BiometricPrompt biometricPrompt2 = new BiometricPrompt(this, 23);
        this.referencesObject = biometricPrompt2;
        return biometricPrompt2;
    }

    public final void reset() {
        this.containerObject.mElements.clear();
        this.childId = 0;
    }
}
