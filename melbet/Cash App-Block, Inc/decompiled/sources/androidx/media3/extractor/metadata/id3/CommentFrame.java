package androidx.media3.extractor.metadata.id3;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CommentFrame extends Id3Frame {
    public final String description;
    public final String language;
    public final String text;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return this.description.equals(commentFrame.description) && this.language.equals(commentFrame.language) && Objects.equals(this.text, commentFrame.text);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.language), 31, this.description);
        String str = this.text;
        return m + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": language=" + this.language + ", description=" + this.description + ", text=" + this.text;
    }
}
