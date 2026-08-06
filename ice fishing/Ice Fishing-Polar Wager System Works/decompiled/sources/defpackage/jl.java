package defpackage;

/* loaded from: classes.dex */
public final class jl extends defpackage.p90 implements defpackage.vz {
    public final /* synthetic */ defpackage.bm AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl(defpackage.bm bmVar, int i) {
        super(0);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = bmVar;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        switch (this.xiZrDbcSW0) {
            case 0:
                return ((defpackage.kv) this.AARZUJiTa.SH1y5HwkJhh.getValue()).oh6vYeIP;
            default:
                defpackage.hv hvVar = this.AARZUJiTa.IHQe1A4L2xu;
                java.io.File canonicalFile = ((java.io.File) hvVar.oh6vYeIP.IHQe1A4L2xu()).getCanonicalFile();
                synchronized (defpackage.hv.F7NU4MC0GW) {
                    java.lang.String absolutePath = canonicalFile.getAbsolutePath();
                    java.util.LinkedHashSet linkedHashSet = defpackage.hv.r1MBDhnF;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new defpackage.kv(canonicalFile, (defpackage.x91) hvVar.IHQe1A4L2xu.AARZUJiTa(canonicalFile), new defpackage.s4(2, canonicalFile));
        }
    }
}
