package defpackage;

import androidx.fragment.app.z;
import com.yandex.pulse.metrics.o;

/* loaded from: classes3.dex */
public final class s40 implements gfu {
    public final /* synthetic */ int a;

    public /* synthetic */ s40(int i) {
        this.a = i;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        switch (this.a) {
            case 0:
                return new y40();
            case 1:
                return new e60();
            case 2:
                return new kz1();
            case 3:
                return new x83();
            case 4:
                return new xv4();
            case 5:
                return new n98();
            case 6:
                return new ida();
            case 7:
                return new yea();
            case 8:
                return new ufa();
            case 9:
                return new gha();
            case 10:
                return new zha();
            case 11:
                return new gwa();
            case 12:
                return new gwa();
            case 13:
                return new leb();
            case 14:
                return new z(true);
            case 15:
                return new fdf();
            case 16:
                return new gdf();
            case 17:
                return new cff();
            case 18:
                return new dff();
            case 19:
                return new fhf();
            case 20:
                return new ghf();
            case 21:
                return new zqj();
            case 22:
                return new ugg();
            case 23:
                return new t5h();
            case 24:
                return new b9i();
            case 25:
                return new z3j();
            case 26:
                if (cls.equals(j6j.class)) {
                    return new j6j();
                }
                xq0.q("Unknown view model");
                return null;
            case 27:
                return new nnl();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zll();
            default:
                return new tam();
        }
    }
}
