package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes6.dex */
public final class gl7 implements jb7, vyi {
    public final hl7 a;
    public final pt0 b;
    public final uif c;
    public final boolean d;
    public final ngl e;
    public final jyr f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public gl7(hl7 hl7Var, pt0 pt0Var, Function0 function0) {
        hl7Var.getClass();
        pt0Var.getClass();
        this.a = hl7Var;
        this.b = pt0Var;
        this.c = (uif) function0;
        this.d = hl7Var.f;
        this.e = hl7Var.b;
        this.f = btf.b(new rs6(19, this));
        this.g = true;
    }

    @Override // defpackage.jb7
    public final va7 K(DataSourceParameters dataSourceParameters, PlaybackParameters playbackParameters) {
        Function0 dl7Var;
        int i;
        hl7 hl7Var = this.a;
        cnm cnmVar = (cnm) hl7Var.e;
        Object obj = cnmVar.b;
        if (obj == null) {
            obj = cnmVar.c;
        }
        if (obj == null) {
            cnmVar.a();
        }
        liq liqVar = cnmVar.b;
        t8w t8wVar = (t8w) ((cnm) hl7Var.e).d.getValue();
        boolean z = dataSourceParameters.getCanWriteToCache() || dataSourceParameters.getCanReadFromCache();
        poj pojVar = new poj((pyi) this.f.getValue());
        pojVar.b = null;
        pojVar.e = dataSourceParameters.getTransferListener();
        pojVar.f = new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
        boolean z2 = this.g;
        vdg vdgVar = new vdg(pojVar, z2, "DefaultDataSourceFactoryCreator");
        if (!z) {
            return vdgVar;
        }
        boolean z3 = (liqVar == null || t8wVar == null) ? false : true;
        if (z && !z3) {
            String str = (liqVar == null && t8wVar == null) ? "Can not read/write cache, cache and cacheKeyFactory are null" : liqVar == null ? "Can not read/write cache, cache is null" : "Can not read/write cache, cacheKeyFactory is null";
            if (this.d) {
                wvs.p(str);
                return null;
            }
            ngl.r(this.e, "DefaultDataSourceFactoryCreator", "checkCacheIsSatisfied", str, null, new Object[0], 8);
            return vdgVar;
        }
        r8w r8wVar = new r8w();
        r8wVar.a = liqVar;
        r8wVar.d = t8wVar;
        if (dataSourceParameters.getCanReadFromUpstream()) {
            i = hl7Var.c ? 11 : 3;
            dl7Var = new t03(9, this, liqVar, vdgVar);
        } else {
            dl7Var = new dl7(liqVar, 0);
            i = 1;
        }
        r8wVar.f = new zk7(0, dl7Var);
        r8wVar.b = new zk7(1, dataSourceParameters.getCanReadFromCache() ? new el7(this, liqVar, 0) : new dl7(liqVar, 1));
        el7 el7Var = dataSourceParameters.getCanWriteToCache() ? new el7(this, liqVar, 1) : null;
        n nVar = el7Var != null ? new n(26, el7Var) : null;
        r8wVar.c = nVar;
        r8wVar.e = nVar == null;
        r8wVar.g = i;
        r8wVar.i = z2;
        if (hl7Var.a) {
            r8wVar.h = new fl7();
        }
        return r8wVar;
    }

    @Override // defpackage.ib7
    public final va7 b(t6t t6tVar) {
        ngl.r(this.e, "DefaultDataSourceFactoryCreator", "create(TransferListener?)", "This method is deprecated. Use `create(DataSourceParameters, PlaybackParameters?)` instead. Falling back to create(\n        DataSourceParameters,\n        PlaybackParameters?,\n    ) with defaults.", null, new Object[0], 8);
        return K(gld.f(new az6(7, t6tVar)), null);
    }

    @Override // defpackage.vyi
    public final String d() {
        return "DefaultDataSourceFactoryCreator";
    }

    @Override // defpackage.vyi
    public final boolean g() {
        return this.g;
    }
}
