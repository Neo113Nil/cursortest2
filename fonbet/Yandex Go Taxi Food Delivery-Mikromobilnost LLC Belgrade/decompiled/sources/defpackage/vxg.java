package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class vxg {
    public final Class a;
    public final List b;
    public final puj0 c;
    public final l6e0 d;
    public final String e;

    public vxg(Class cls, Class cls2, Class cls3, List list, puj0 puj0Var, l6e0 l6e0Var) {
        this.a = cls;
        this.b = list;
        this.c = puj0Var;
        this.d = l6e0Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final otj0 a(int i, int i2, xjg xjgVar, cpg cpgVar, mg70 mg70Var) {
        otj0 otj0Var;
        nw01 nw01Var;
        EncodeStrategy encodeStrategy;
        vtj0 vtj0Var;
        otj0 otj0Var2;
        boolean z;
        boolean z2;
        Object sngVar;
        l6e0 l6e0Var = this.d;
        Object a = l6e0Var.a();
        z2a1.e(a, "Argument must not be null");
        List list = (List) a;
        try {
            otj0 b = b(cpgVar, i, i2, mg70Var, list);
            l6e0Var.a0(list);
            b bVar = (b) xjgVar.c;
            DataSource dataSource = (DataSource) xjgVar.b;
            uxg uxgVar = bVar.a;
            Class<?> cls = b.get().getClass();
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                nw01 e = uxgVar.e(cls);
                nw01Var = e;
                otj0Var = e.b(bVar.A, b, bVar.E, bVar.F);
            } else {
                otj0Var = b;
                nw01Var = null;
            }
            if (!b.equals(otj0Var)) {
                b.a();
            }
            if (uxgVar.c.getRegistry().d.a(otj0Var.b()) != null) {
                vtj0Var = uxgVar.c.getRegistry().d.a(otj0Var.b());
                if (vtj0Var == null) {
                    throw new Registry.NoResultEncoderAvailableException(otj0Var.b());
                }
                encodeStrategy = vtj0Var.c(bVar.H);
            } else {
                encodeStrategy = EncodeStrategy.NONE;
                vtj0Var = null;
            }
            khx khxVar = bVar.O;
            ArrayList b2 = uxgVar.b();
            int size = b2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    otj0Var2 = null;
                    z = false;
                    break;
                }
                otj0Var2 = null;
                if (((p430) b2.get(i3)).a.equals(khxVar)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (bVar.G.d(!z, dataSource, encodeStrategy)) {
                if (vtj0Var == null) {
                    throw new Registry.NoResultEncoderAvailableException(otj0Var.get().getClass());
                }
                int i4 = a.c[encodeStrategy.ordinal()];
                if (i4 == 1) {
                    z2 = true;
                    sngVar = new sng(bVar.O, bVar.B);
                } else {
                    if (i4 != 2) {
                        kbs.f(encodeStrategy, "Unknown strategy: ");
                        return otj0Var2;
                    }
                    z2 = true;
                    sngVar = new qtj0(uxgVar.c.getArrayPool(), bVar.O, bVar.B, bVar.E, bVar.F, nw01Var, cls, bVar.H);
                }
                xdz xdzVar = (xdz) xdz.x.a();
                xdzVar.w = false;
                xdzVar.c = z2;
                xdzVar.b = otj0Var;
                wwf wwfVar = bVar.y;
                wwfVar.a = sngVar;
                wwfVar.b = vtj0Var;
                wwfVar.c = xdzVar;
                otj0Var = xdzVar;
            }
            return this.c.b(otj0Var, mg70Var);
        } catch (Throwable th) {
            l6e0Var.a0(list);
            throw th;
        }
    }

    public final otj0 b(cpg cpgVar, int i, int i2, mg70 mg70Var, List list) {
        List list2 = this.b;
        int size = list2.size();
        otj0 otj0Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            rtj0 rtj0Var = (rtj0) list2.get(i3);
            try {
                if (rtj0Var.b(cpgVar.d(), mg70Var)) {
                    otj0Var = rtj0Var.a(cpgVar.d(), i, i2, mg70Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(rtj0Var);
                }
                list.add(e);
            }
            if (otj0Var != null) {
                break;
            }
        }
        if (otj0Var != null) {
            return otj0Var;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
