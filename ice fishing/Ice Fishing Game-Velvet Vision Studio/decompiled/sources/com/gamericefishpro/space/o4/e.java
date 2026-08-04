package com.gamericefishpro.space.o4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d4.z;
import com.gamericefishpro.space.q4.f0;
import com.gamericefishpro.space.q4.o0;
import com.gamericefishpro.space.q4.q;
import com.gamericefishpro.space.q4.q0;
import com.gamericefishpro.space.q4.r;
import com.gamericefishpro.space.q4.s;
import com.gamericefishpro.space.q4.s0;
import com.gamericefishpro.space.q4.t0;
import com.gamericefishpro.space.q4.w;
import com.gamericefishpro.space.q4.x0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {
    private static final e DEFAULT_INSTANCE;
    private static volatile o0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private f0 preferences_ = f0.e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        s.j(e.class, eVar);
    }

    public static f0 l(e eVar) {
        f0 f0Var = eVar.preferences_;
        if (!f0Var.d) {
            eVar.preferences_ = f0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((q) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        com.gamericefishpro.space.q4.h hVar = new com.gamericefishpro.space.q4.h(fileInputStream);
        com.gamericefishpro.space.q4.k kVarA = com.gamericefishpro.space.q4.k.a();
        s sVarI = eVar.i();
        try {
            q0 q0Var = q0.c;
            q0Var.getClass();
            t0 t0VarA = q0Var.a(sVarI.getClass());
            z zVar = (z) hVar.e;
            if (zVar == null) {
                zVar = new z(hVar);
            }
            t0VarA.g(sVarI, zVar, kVarA);
            t0VarA.c(sVarI);
            if (s.f(sVarI, true)) {
                return (e) sVarI;
            }
            throw new w(new x0().getMessage());
        } catch (w e) {
            if (e.d) {
                throw new w(e.getMessage(), e);
            }
            throw e;
        } catch (x0 e2) {
            throw new w(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof w) {
                throw ((w) e3.getCause());
            }
            throw new w(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof w) {
                throw ((w) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // com.gamericefishpro.space.q4.s
    public final Object c(int i) {
        o0 rVar;
        switch (com.gamericefishpro.space.i3.e.b(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new s0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case i.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                o0 o0Var = PARSER;
                if (o0Var != null) {
                    return o0Var;
                }
                synchronized (e.class) {
                    try {
                        rVar = PARSER;
                        if (rVar == null) {
                            rVar = new r();
                            PARSER = rVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
