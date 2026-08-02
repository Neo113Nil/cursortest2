package androidx.compose.runtime.tooling;

import java.util.List;

/* loaded from: classes3.dex */
public final class SourceInformation {
    public final String functionName;
    public final boolean isCall;
    public final boolean isInline;
    public final List locations;
    public final String packageHash;
    public final List parameters;
    public final String sourceFile;

    public SourceInformation(String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        this.isCall = z;
        this.isInline = z2;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
    }
}
