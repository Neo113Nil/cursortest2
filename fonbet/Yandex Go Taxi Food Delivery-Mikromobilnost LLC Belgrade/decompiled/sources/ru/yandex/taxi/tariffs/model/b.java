package ru.yandex.taxi.tariffs.model;

import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.TariffBranding;
import defpackage.av1;
import defpackage.e4a0;
import defpackage.ex1;
import defpackage.fid0;
import defpackage.gl2;
import defpackage.h73;
import defpackage.i2d0;
import defpackage.i73;
import defpackage.jjj0;
import defpackage.jl40;
import defpackage.lmw0;
import defpackage.njc;
import defpackage.nu1;
import defpackage.pex0;
import defpackage.pnx0;
import defpackage.q8f;
import defpackage.qbx0;
import defpackage.qrq0;
import defpackage.sgx0;
import defpackage.tr40;
import defpackage.umd0;
import defpackage.uy1;
import defpackage.v2h;
import defpackage.w511;
import defpackage.xu1;
import defpackage.xx00;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class b {
    public static final TariffBranding a(pex0 pex0Var, qbx0 qbx0Var) {
        BrandingType brandingType = pex0Var.m0;
        Object obj = null;
        if (brandingType == null) {
            return null;
        }
        Iterator it = qbx0Var.a(pex0Var.s0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TariffBranding tariffBranding = (TariffBranding) next;
            tariffBranding.getClass();
            if (brandingType != BrandingType.OTHER && tariffBranding.a == brandingType) {
                obj = next;
                break;
            }
        }
        return (TariffBranding) obj;
    }

    public static final ArrayList b(pex0 pex0Var) {
        List list = pex0Var.t0.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof nu1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final nu1 c(pex0 pex0Var) {
        ex1 ex1Var;
        a aVar;
        List list;
        Object obj;
        pex0 pex0Var2 = pex0Var.M0;
        if (pex0Var2 == null || (aVar = pex0Var2.t0) == null || (list = aVar.a) == null) {
            ex1Var = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ex1) obj).a() == pex0Var) {
                    break;
                }
            }
            ex1Var = (ex1) obj;
        }
        if (ex1Var instanceof nu1) {
            return (nu1) ex1Var;
        }
        if (!(ex1Var instanceof zu1) && !(ex1Var instanceof av1) && !(ex1Var instanceof q8f) && !(ex1Var instanceof xu1) && !(ex1Var instanceof fid0) && !(ex1Var instanceof v2h) && !(ex1Var instanceof tr40) && !(ex1Var instanceof umd0) && !(ex1Var instanceof i2d0) && !(ex1Var instanceof pnx0) && !(ex1Var instanceof gl2) && !(ex1Var instanceof njc) && !(ex1Var instanceof xx00) && ex1Var != null) {
            w511.b();
        }
        return null;
    }

    public static final av1 d(pex0 pex0Var) {
        ex1 ex1Var;
        a aVar;
        List list;
        Object obj;
        if (pex0Var.O instanceof uy1) {
            pex0 pex0Var2 = pex0Var.M0;
            if (pex0Var2 == null || (aVar = pex0Var2.t0) == null || (list = aVar.a) == null) {
                ex1Var = null;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ex1) obj).a() == pex0Var) {
                        break;
                    }
                }
                ex1Var = (ex1) obj;
            }
            if (ex1Var instanceof av1) {
                return (av1) ex1Var;
            }
            if (!(ex1Var instanceof zu1) && !(ex1Var instanceof fid0) && !(ex1Var instanceof q8f) && !(ex1Var instanceof xu1) && !(ex1Var instanceof v2h) && !(ex1Var instanceof tr40) && !(ex1Var instanceof umd0) && !(ex1Var instanceof i2d0) && !(ex1Var instanceof pnx0) && !(ex1Var instanceof nu1) && !(ex1Var instanceof gl2) && !(ex1Var instanceof njc) && !(ex1Var instanceof xx00) && ex1Var != null) {
                w511.b();
            }
        }
        return null;
    }

    public static final pex0 e(pex0 pex0Var, String str) {
        Object obj;
        Iterator it = k(pex0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((pex0) obj).J0.b.a().equals(str)) {
                break;
            }
        }
        return (pex0) obj;
    }

    public static final pex0 f(pex0 pex0Var, sgx0 sgx0Var) {
        Object obj;
        if (sgx0Var != null && sgx0Var.a(pex0Var)) {
            Iterator it = k(pex0Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                pex0 pex0Var2 = (pex0) obj;
                if (sgx0Var.a(pex0Var2) && sgx0Var.b == pex0Var2.J0.b) {
                    break;
                }
            }
            pex0 pex0Var3 = (pex0) obj;
            if (pex0Var3 != null) {
                return pex0Var3;
            }
        }
        return pex0Var;
    }

    public static final lmw0 g(pex0 pex0Var, String str) {
        Object obj;
        Iterator it = pex0Var.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((lmw0) obj).getName(), str)) {
                break;
            }
        }
        return (lmw0) obj;
    }

    public static final boolean h(pex0 pex0Var) {
        List list = pex0Var.t0.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ex1) it.next()) instanceof nu1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(pex0 pex0Var) {
        return (pex0Var.O instanceof jjj0) || h(pex0Var);
    }

    public static final boolean j(pex0 pex0Var, e4a0 e4a0Var) {
        return pex0Var.d0.isEmpty() || kotlin.collections.a.G(pex0Var.d0, e4a0Var);
    }

    public static final qrq0 k(pex0 pex0Var) {
        pex0 pex0Var2 = pex0Var.M0;
        if (pex0Var.g()) {
            return new h73(2, new TariffDescriptionExtensionsKt$optionsSequence$1(pex0Var, null));
        }
        return pex0Var2 != null ? k(pex0Var2) : new i73(5, pex0Var);
    }
}
