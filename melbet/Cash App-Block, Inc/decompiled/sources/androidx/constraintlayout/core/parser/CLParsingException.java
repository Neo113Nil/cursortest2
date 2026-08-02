package androidx.constraintlayout.core.parser;

/* loaded from: classes3.dex */
public final class CLParsingException extends Exception {
    public final String mElementClass;
    public final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
        } else {
            this.mElementClass = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.mReason + " (" + this.mElementClass + " at line 0)");
        return sb.toString();
    }
}
