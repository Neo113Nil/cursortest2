package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class k3i {
    public final j3i a;
    public final String b;
    public final String c;
    public final sym d;
    public final sym e;
    public final boolean f;

    public k3i(j3i j3iVar, String str, sym symVar, sym symVar2, boolean z) {
        new AtomicReferenceArray(2);
        o2g.O(j3iVar, "type");
        this.a = j3iVar;
        o2g.O(str, "fullMethodName");
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        o2g.O(symVar, "requestMarshaller");
        this.d = symVar;
        o2g.O(symVar2, "responseMarshaller");
        this.e = symVar2;
        this.f = z;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        o2g.O(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        o2g.O(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public static yk3 b() {
        yk3 yk3Var = new yk3();
        yk3Var.b = null;
        yk3Var.c = null;
        return yk3Var;
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.b, "fullMethodName");
        Y.q(this.a, "type");
        Y.t("idempotent", false);
        Y.t("safe", false);
        Y.t("sampledToLocalTracing", this.f);
        Y.q(this.d, "requestMarshaller");
        Y.q(this.e, "responseMarshaller");
        Y.q(null, "schemaDescriptor");
        Y.b = true;
        return Y.toString();
    }
}
