package com.gamericefishpro.space.t0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y0 {
    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static com.gamericefishpro.space.b0.i d(r rVar) {
        com.gamericefishpro.space.b0.i iVar = new com.gamericefishpro.space.b0.i();
        rVar.k0(iVar);
        return iVar;
    }

    public static ClassCastException e(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void k(int i, int i2, int i3, int i4, int i5) {
        com.gamericefishpro.space.i.a.h(i);
        com.gamericefishpro.space.i.a.h(i2);
        com.gamericefishpro.space.i.a.h(i3);
        com.gamericefishpro.space.i.a.h(i4);
        com.gamericefishpro.space.i.a.h(i5);
    }

    public static void l(long j, StringBuilder sb, String str) {
        sb.append((Object) com.gamericefishpro.space.o1.s.j(j));
        sb.append(str);
    }
}
