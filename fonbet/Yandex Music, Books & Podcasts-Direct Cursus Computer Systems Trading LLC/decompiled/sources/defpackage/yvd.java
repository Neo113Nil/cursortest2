package defpackage;

import com.connectsdk.service.command.ServiceCommand;

/* loaded from: classes5.dex */
public abstract class yvd {
    public static final vtd a;
    public static final vtd b;
    public static final vtd c;
    public static final vtd d;
    public static final vtd e;
    public static final vtd f;

    static {
        pn3 pn3Var = vtd.g;
        a = new vtd(pn3Var, "https");
        b = new vtd(pn3Var, "http");
        pn3 pn3Var2 = vtd.e;
        c = new vtd(pn3Var2, ServiceCommand.TYPE_POST);
        d = new vtd(pn3Var2, ServiceCommand.TYPE_GET);
        e = new vtd(xqd.j.a, "application/grpc");
        f = new vtd("te", "trailers");
    }
}
