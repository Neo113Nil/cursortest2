package defpackage;

/* loaded from: classes12.dex */
public final class vlc implements wlc {
    public final Object a;

    public vlc(Object obj) {
        this.a = obj;
        if ((obj instanceof Integer) || (obj instanceof String) || (obj instanceof Boolean)) {
            return;
        }
        w511.f(oyr.p("Command value type=", qoi0.a(obj.getClass()).d(), " is not supported"));
        throw null;
    }
}
