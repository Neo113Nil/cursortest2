package com.gamericefishpro.space.q4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final /* synthetic */ int c = 0;
    public final v0 a = v0.f();
    public boolean b;

    static {
        new n(0);
    }

    public n() {
    }

    public static void b(i iVar, m1 m1Var, int i, Object obj) {
        if (m1Var == m1.v) {
            iVar.S0(i, 3);
            ((a) obj).b(iVar);
            iVar.S0(i, 4);
        }
        iVar.S0(i, m1Var.e);
        switch (m1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                iVar.M0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                iVar.K0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                iVar.W0(((Long) obj).longValue());
                break;
            case 3:
                iVar.W0(((Long) obj).longValue());
                break;
            case 4:
                iVar.O0(((Integer) obj).intValue());
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                iVar.M0(((Long) obj).longValue());
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                iVar.K0(((Integer) obj).intValue());
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                iVar.E0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof f)) {
                    iVar.R0((String) obj);
                } else {
                    iVar.I0((f) obj);
                }
                break;
            case 9:
                ((a) obj).b(iVar);
                break;
            case 10:
                a aVar = (a) obj;
                iVar.getClass();
                iVar.U0(((s) aVar).a(null));
                aVar.b(iVar);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    iVar.U0(length);
                    iVar.F0(bArr, 0, length);
                } else {
                    iVar.I0((f) obj);
                }
                break;
            case 12:
                iVar.U0(((Integer) obj).intValue());
                break;
            case 13:
                iVar.O0(((Integer) obj).intValue());
                break;
            case 14:
                iVar.K0(((Integer) obj).intValue());
                break;
            case 15:
                iVar.M0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iVar.U0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iVar.W0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        v0 v0Var = this.a;
        int size = v0Var.d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = v0Var.c(i);
            if (entryC.getValue() instanceof s) {
                s sVar = (s) entryC.getValue();
                sVar.getClass();
                q0 q0Var = q0.c;
                q0Var.getClass();
                q0Var.a(sVar.getClass()).c(sVar);
                sVar.h();
            }
        }
        if (!v0Var.i) {
            if (v0Var.d.size() > 0) {
                v0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = v0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!v0Var.i) {
            v0Var.e = v0Var.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v0Var.e);
            v0Var.w = v0Var.w.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v0Var.w);
            v0Var.i = true;
        }
        this.b = true;
    }

    public final Object clone() {
        n nVar = new n();
        v0 v0Var = this.a;
        if (v0Var.d.size() > 0) {
            Map.Entry entryC = v0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = v0Var.d().iterator();
        if (!it.hasNext()) {
            return nVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public n(int i) {
        a();
        a();
    }
}
