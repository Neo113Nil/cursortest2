package androidx.compose.ui.tooling.data;

import java.util.List;

/* loaded from: classes3.dex */
public final class SourceInformationContext {
    public final boolean isCall;
    public final List locations;
    public final String name;
    public int nextLocation;
    public final int packageHash;
    public final List parameters;
    public final int repeatOffset;
    public final String sourceFile;

    public SourceInformationContext(String str, String str2, int i, List list, int i2, List list2, boolean z, boolean z2) {
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i;
        this.locations = list;
        this.repeatOffset = i2;
        this.parameters = list2;
        this.isCall = z;
    }
}
