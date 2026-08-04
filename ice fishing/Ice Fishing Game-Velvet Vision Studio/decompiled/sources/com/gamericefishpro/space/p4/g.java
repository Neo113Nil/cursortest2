package com.gamericefishpro.space.p4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.l4.w0;
import com.gamericefishpro.space.o4.h;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.q4.s;
import com.gamericefishpro.space.q4.t;
import com.gamericefishpro.space.q4.u;
import com.gamericefishpro.space.q4.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    public final b a(FileInputStream input) throws com.gamericefishpro.space.l4.b {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            com.gamericefishpro.space.o4.e eVarO = com.gamericefishpro.space.o4.e.o(input);
            Intrinsics.checkNotNullExpressionValue(eVarO, "{\n                Prefer…From(input)\n            }");
            e[] pairs = new e[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            e[] pairs2 = (e[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            bVar.b();
            if (pairs2.length > 0) {
                e eVar = pairs2[0];
                throw null;
            }
            Map mapM = eVarO.m();
            Intrinsics.checkNotNullExpressionValue(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String name = (String) entry.getKey();
                i value = (i) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int iC = value.C();
                switch (iC == 0 ? -1 : f.a[com.gamericefishpro.space.i3.e.b(iC)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new com.gamericefishpro.space.l4.b("Value case is null.", 0);
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    default:
                        throw new k();
                    case 1:
                        d key = com.gamericefishpro.space.hj.c.j(name);
                        Boolean boolValueOf = Boolean.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key, "key");
                        bVar.f(key, boolValueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key2 = new d(name);
                        Float fValueOf = Float.valueOf(value.x());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        bVar.f(key2, fValueOf);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key3 = new d(name);
                        Double dValueOf = Double.valueOf(value.w());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        bVar.f(key3, dValueOf);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key4 = new d(name);
                        Integer numValueOf = Integer.valueOf(value.y());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        bVar.f(key4, numValueOf);
                        break;
                    case i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key5 = new d(name);
                        Long lValueOf = Long.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        bVar.f(key5, lValueOf);
                        break;
                    case i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key6 = new d(name);
                        String strA = value.A();
                        Intrinsics.checkNotNullExpressionValue(strA, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        bVar.f(key6, strA);
                        break;
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        d key7 = com.gamericefishpro.space.hj.c.W(name);
                        t tVarN = value.B().n();
                        Intrinsics.checkNotNullExpressionValue(tVarN, "value.stringSet.stringsList");
                        Set setO = CollectionsKt.O(tVarN);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        bVar.f(key7, setO);
                        break;
                    case i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key8 = new d(name);
                        com.gamericefishpro.space.q4.f fVarU = value.u();
                        int size = fVarU.size();
                        if (size == 0) {
                            bArr = u.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            fVarU.f(size, bArr2);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        bVar.f(key8, bArr);
                        break;
                    case 9:
                        throw new com.gamericefishpro.space.l4.b("Value not set.", 0);
                }
            }
            return new b(m0.i(bVar.a()), true);
        } catch (w e) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new com.gamericefishpro.space.l4.b("Unable to parse preferences proto.", e);
        }
    }

    public final Unit b(Object obj, w0 w0Var) throws IOException {
        s sVarA;
        Map mapA = ((b) obj).a();
        com.gamericefishpro.space.o4.c cVarN = com.gamericefishpro.space.o4.e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.a;
            if (value instanceof Boolean) {
                h hVarD = i.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                i.q((i) hVarD.e, zBooleanValue);
                sVarA = hVarD.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                h hVarD2 = i.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                i.r((i) hVarD2.e, fFloatValue);
                sVarA = hVarD2.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                h hVarD3 = i.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                i.o((i) hVarD3.e, dDoubleValue);
                sVarA = hVarD3.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                h hVarD4 = i.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                i.s((i) hVarD4.e, iIntValue);
                sVarA = hVarD4.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                h hVarD5 = i.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                i.l((i) hVarD5.e, jLongValue);
                sVarA = hVarD5.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                h hVarD6 = i.D();
                hVarD6.c();
                i.m((i) hVarD6.e, (String) value);
                sVarA = hVarD6.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                h hVarD7 = i.D();
                com.gamericefishpro.space.o4.f fVarO = com.gamericefishpro.space.o4.g.o();
                fVarO.c();
                com.gamericefishpro.space.o4.g.l((com.gamericefishpro.space.o4.g) fVarO.e, (Set) value);
                hVarD7.c();
                i.n((i) hVarD7.e, (com.gamericefishpro.space.o4.g) fVarO.a());
                sVarA = hVarD7.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                h hVarD8 = i.D();
                byte[] bArr = (byte[]) value;
                com.gamericefishpro.space.q4.f fVarD = com.gamericefishpro.space.q4.f.d(bArr, 0, bArr.length);
                hVarD8.c();
                i.p((i) hVarD8.e, fVarD);
                sVarA = hVarD8.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            cVarN.getClass();
            str.getClass();
            cVarN.c();
            com.gamericefishpro.space.o4.e.l((com.gamericefishpro.space.o4.e) cVarN.e).put(str, (i) sVarA);
        }
        com.gamericefishpro.space.o4.e eVar = (com.gamericefishpro.space.o4.e) cVarN.a();
        int iA = eVar.a(null);
        Logger logger = com.gamericefishpro.space.q4.i.h;
        if (iA > 4096) {
            iA = 4096;
        }
        com.gamericefishpro.space.q4.i iVar = new com.gamericefishpro.space.q4.i(w0Var, iA);
        eVar.b(iVar);
        if (iVar.f > 0) {
            iVar.C0();
        }
        return Unit.a;
    }
}
