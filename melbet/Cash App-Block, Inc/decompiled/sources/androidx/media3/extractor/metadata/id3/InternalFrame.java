package androidx.media3.extractor.metadata.id3;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class InternalFrame extends Id3Frame {
    public final String description;
    public final String domain;
    public final String text;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return this.description.equals(internalFrame.description) && this.domain.equals(internalFrame.domain) && this.text.equals(internalFrame.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.domain), 31, this.description);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": domain=" + this.domain + ", description=" + this.description;
    }
}
