package androidx.compose.runtime.tooling;

/* loaded from: classes3.dex */
public final class ParameterSourceInformation {
    public final String inlineClass;
    public final String name;
    public final int sortedIndex;

    public ParameterSourceInformation(int i, String str, String str2) {
        this.sortedIndex = i;
        this.name = str;
        this.inlineClass = str2;
    }

    public /* synthetic */ ParameterSourceInformation(int i, String str, int i2) {
        this(i, (String) null, (i2 & 4) != 0 ? null : str);
    }
}
