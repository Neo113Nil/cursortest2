package ru.yandex.taxi.tariffs.model;

import defpackage.h73;
import defpackage.jl40;
import defpackage.pex0;
import defpackage.tse0;
import defpackage.wu1;
import defpackage.yw01;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class a {
    public final List a;

    public /* synthetic */ a(int i) {
        this(EmptyList.a);
    }

    public final pex0 a(wu1 wu1Var) {
        Object obj;
        yw01 d = d();
        Iterator it = d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = d.b.invoke(it.next());
            if (jl40.l(((pex0) obj).O, wu1Var)) {
                break;
            }
        }
        return (pex0) obj;
    }

    public final pex0 b(String str) {
        Object obj;
        yw01 d = d();
        Iterator it = d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = d.b.invoke(it.next());
            if (((pex0) obj).J0.b.a().equals(str)) {
                break;
            }
        }
        return (pex0) obj;
    }

    public final pex0 c(String str) {
        Object obj;
        wu1 wu1Var;
        yw01 d = d();
        Iterator it = d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = d.b.invoke(it.next());
            if (((pex0) obj).P) {
                break;
            }
        }
        pex0 pex0Var = (pex0) obj;
        if (jl40.l((pex0Var == null || (wu1Var = pex0Var.O) == null) ? null : wu1Var.a(), str)) {
            return pex0Var;
        }
        return null;
    }

    public final yw01 d() {
        return new yw01(new h73(1, this.a), AltOptions$optionsSequence$1.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("AltOptions(alternatives=", Extension.C_BRAKE, this.a);
    }

    public a() {
        this(0);
    }

    public a(List list) {
        this.a = list;
    }
}
