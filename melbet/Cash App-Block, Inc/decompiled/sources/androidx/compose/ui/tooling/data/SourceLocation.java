package androidx.compose.ui.tooling.data;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SourceLocation {
    public final int length;
    public final int lineNumber;
    public final int offset;
    public final int packageHash;
    public final String sourceFile;

    public SourceLocation(int i, int i2, int i3, int i4, String str) {
        this.lineNumber = i;
        this.offset = i2;
        this.length = i3;
        this.sourceFile = str;
        this.packageHash = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) obj;
        return this.lineNumber == sourceLocation.lineNumber && this.offset == sourceLocation.offset && this.length == sourceLocation.length && Intrinsics.areEqual(this.sourceFile, sourceLocation.sourceFile) && this.packageHash == sourceLocation.packageHash;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.length, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.offset, Integer.hashCode(this.lineNumber) * 31, 31), 31);
        String str = this.sourceFile;
        return Integer.hashCode(this.packageHash) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceLocation(lineNumber=");
        sb.append(this.lineNumber);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", sourceFile=");
        sb.append(this.sourceFile);
        sb.append(", packageHash=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.packageHash, ')');
    }
}
