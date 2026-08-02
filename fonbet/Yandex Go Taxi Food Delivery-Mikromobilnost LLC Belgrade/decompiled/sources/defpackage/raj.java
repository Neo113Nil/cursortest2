package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class raj {
    public static final LinkedHashSet d;
    public final String a;
    public final boolean b;
    public final boolean c;

    static {
        Set f0 = j73.f0(new String[]{"yap_vaz_evo", "yap_vaz_niva", "yap_vaz_lvl2", "yap_vaz_lvl3", "yap_generic", "yap_chiron", "yas_gac_electro"});
        Set f02 = j73.f0(new String[]{"goya", "kuiper", "magritte", "malevich", "nebula", "monet", "yandex_tv_aml950_11_cvte", "yandex_tv_aml962_11_cvte", "yandex_tv_aml950_14_cv", "yandex_tv_aml950_14_cvte", "yandex_tv_hisi351_cvte", "yandex_tv_mt6681_cv", "yandex_tv_mt6681_cvte", "yandex_tv_mt9256_cv", "yandex_tv_mt9256_cvte", "yandex_tv_mt9632_11_cv", "yandex_tv_mt9632_11_cvte", "yandex_tv_mt9632_cv", "yandex_tv_mt9632_cvte", "yandex_tv_rt2842_hikeen", "yandex_tv_rt2861_hikeen", "yandex_tv_rt2871_hikeen", "stb_aml905y4_11_sdmc", "yandexmodule_2", "yandexstation_2", "development"});
        d = v4r0.h(v4r0.h(f0, f02), j73.f0(new String[]{"centaur", "quinglong", "chiron", "starling"}));
    }

    public raj(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final raj a(String str) {
        boolean z = this.c;
        String str2 = this.a;
        if (!z && !d.contains(str)) {
            str2 = g8e.p(str, "_", str2);
        }
        return new raj(str2, this.b, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raj)) {
            return false;
        }
        raj rajVar = (raj) obj;
        return jl40.l(this.a, rajVar.a) && this.b == rajVar.b && this.c == rajVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("DeviceId(value=", this.a, ", unknown=", ", enriched=", this.b), this.c, Extension.C_BRAKE);
    }
}
