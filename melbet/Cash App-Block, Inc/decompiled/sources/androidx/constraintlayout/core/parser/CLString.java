package androidx.constraintlayout.core.parser;

/* loaded from: classes3.dex */
public final class CLString extends CLElement {
    public static CLString from(String str) {
        CLString cLString = new CLString(str.toCharArray());
        cLString.mStart = 0L;
        long length = str.length() - 1;
        if (cLString.mEnd == Long.MAX_VALUE) {
            cLString.mEnd = length;
            CLContainer cLContainer = cLString.mContainer;
            if (cLContainer != null) {
                cLContainer.add(cLString);
            }
        }
        return cLString;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLString) && content().equals(((CLString) obj).content())) {
            return true;
        }
        return super.equals(obj);
    }
}
