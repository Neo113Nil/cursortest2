package defpackage;

import com.connectsdk.service.command.ServiceCommand;

/* loaded from: classes3.dex */
public enum b0i {
    Registration("registration"),
    Request(ServiceCommand.TYPE_REQ),
    Response("response"),
    Observe("observe"),
    Unobserve("unobserve");

    public final String a;

    b0i(String str) {
        this.a = str;
    }
}
