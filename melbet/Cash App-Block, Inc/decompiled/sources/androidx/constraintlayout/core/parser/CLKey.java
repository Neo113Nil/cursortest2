package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class CLKey extends CLContainer {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || content().equals(((CLKey) obj).content())) {
            return super.equals(obj);
        }
        return false;
    }
}
