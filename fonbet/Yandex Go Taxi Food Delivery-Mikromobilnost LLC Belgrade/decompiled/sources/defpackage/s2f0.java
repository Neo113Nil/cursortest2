package defpackage;

import kotlin.collections.builders.MapBuilder;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;

/* loaded from: classes9.dex */
public abstract class s2f0 {
    public static final MapBuilder a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(qoi0.a(String.class), auu0.a);
        mapBuilder.put(qoi0.a(Character.TYPE), ij9.a);
        mapBuilder.put(qoi0.a(char[].class), xi9.c);
        mapBuilder.put(qoi0.a(Double.TYPE), e6m.a);
        mapBuilder.put(qoi0.a(double[].class), f5m.c);
        mapBuilder.put(qoi0.a(Float.TYPE), nor.a);
        mapBuilder.put(qoi0.a(float[].class), dor.c);
        mapBuilder.put(qoi0.a(Long.TYPE), pnz.a);
        mapBuilder.put(qoi0.a(long[].class), tlz.c);
        mapBuilder.put(qoi0.a(yq11.class), cr11.a);
        mapBuilder.put(qoi0.a(Integer.TYPE), h6w.a);
        mapBuilder.put(qoi0.a(int[].class), q5w.c);
        mapBuilder.put(qoi0.a(tq11.class), xq11.a);
        mapBuilder.put(qoi0.a(Short.TYPE), wvr0.a);
        mapBuilder.put(qoi0.a(short[].class), tvr0.c);
        mapBuilder.put(qoi0.a(pr11.class), tr11.a);
        mapBuilder.put(qoi0.a(Byte.TYPE), m77.a);
        mapBuilder.put(qoi0.a(byte[].class), p67.c);
        mapBuilder.put(qoi0.a(lq11.class), qq11.a);
        mapBuilder.put(qoi0.a(Boolean.TYPE), z96.a);
        mapBuilder.put(qoi0.a(boolean[].class), k96.c);
        mapBuilder.put(qoi0.a(zy11.class), dz11.b);
        mapBuilder.put(qoi0.a(Void.class), wf60.a);
        try {
            g0c a2 = qoi0.a(e3n.class);
            o430 o430Var = e3n.b;
            mapBuilder.put(a2, x3n.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(qoi0.a(zq11.class), br11.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(qoi0.a(uq11.class), wq11.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(qoi0.a(qr11.class), sr11.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(qoi0.a(nq11.class), pq11.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(qoi0.a(Uuid.class), fy21.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            g0c a3 = qoi0.a(Instant.class);
            Instant instant = Instant.a;
            mapBuilder.put(a3, t3w.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = mapBuilder.j();
    }
}
