package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperLayer implements WinterFlowRefactoringAgent {
    public final int WinterFlowRouterStructure;

    public WinterFlowMapperLayer(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return WinterFlowRefactoringAgent.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRefactoringAgent)) {
            return false;
        }
        WinterFlowRefactoringAgent winterFlowRefactoringAgent = (WinterFlowRefactoringAgent) obj;
        return this.WinterFlowRouterStructure == winterFlowRefactoringAgent.tag() && WinterFlowObjectQueue.WinterFlowVariableVersionControl.equals(winterFlowRefactoringAgent.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.WinterFlowRouterStructure ^ 14552422) + (WinterFlowObjectQueue.WinterFlowVariableVersionControl.hashCode() ^ 2041407134);
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringAgent
    public final WinterFlowObjectQueue intEncoding() {
        return WinterFlowObjectQueue.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringAgent
    public final int tag() {
        return this.WinterFlowRouterStructure;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.WinterFlowRouterStructure + "intEncoding=" + WinterFlowObjectQueue.WinterFlowVariableVersionControl + ')';
    }
}
