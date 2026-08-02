package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ybf implements arf {
    public final /* synthetic */ int a = 0;
    public final Function0 b;
    public bfu c;
    public final Object d;
    public final Function0 e;
    public final Function0 f;

    public ybf(String str, r71 r71Var, vz vzVar) {
        sxd sxdVar = new sxd(23);
        str.getClass();
        this.d = str;
        this.e = r71Var;
        this.f = vzVar;
        this.b = sxdVar;
    }

    @Override // defpackage.arf
    public final Object getValue() {
        switch (this.a) {
            case 0:
                bfu bfuVar = this.c;
                if (bfuVar != null) {
                    return bfuVar;
                }
                gfu gfuVar = (gfu) ((vz) this.f).invoke();
                jfu jfuVar = ((r71) this.e).b;
                is6 is6Var = (is6) this.b.invoke();
                jfuVar.getClass();
                is6Var.getClass();
                bfu j = new bjt(jfuVar, gfuVar, is6Var).j(ern.a(nb1.class), hrg.r("KeyedViewModelLazy:", nb1.class.getCanonicalName(), StringUtils.PROCESS_POSTFIX_DELIMITER, (String) this.d));
                this.c = j;
                return j;
            default:
                bfu bfuVar2 = this.c;
                if (bfuVar2 != null) {
                    return bfuVar2;
                }
                jfu jfuVar2 = (jfu) this.b.invoke();
                gfu gfuVar2 = (gfu) this.e.invoke();
                is6 is6Var2 = (is6) this.f.invoke();
                jfuVar2.getClass();
                gfuVar2.getClass();
                is6Var2.getClass();
                bjt bjtVar = new bjt(jfuVar2, gfuVar2, is6Var2);
                lm4 lm4Var = (lm4) this.d;
                lm4Var.getClass();
                String f = lm4Var.f();
                if (f == null) {
                    xq0.x("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                bfu j2 = bjtVar.j(lm4Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                this.c = j2;
                return j2;
        }
    }

    @Override // defpackage.arf
    public final boolean isInitialized() {
        switch (this.a) {
            case 0:
                if (this.c != null) {
                }
                break;
            default:
                if (this.c != null) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ ybf(lm4 lm4Var, Function0 function0, Function0 function02) {
        this(lm4Var, function0, function02, new hft(21));
    }

    public ybf(lm4 lm4Var, Function0 function0, Function0 function02, Function0 function03) {
        this.d = lm4Var;
        this.b = function0;
        this.e = function02;
        this.f = function03;
    }
}
