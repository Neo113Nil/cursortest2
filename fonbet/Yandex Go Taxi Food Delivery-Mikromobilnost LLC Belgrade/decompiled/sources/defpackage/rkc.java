package defpackage;

/* loaded from: classes2.dex */
public final class rkc extends clc {
    public rkc(String str, png pngVar) {
        super("sendPlatformCapabilityEvent", new qkc(str, pngVar));
    }

    @Override // defpackage.clc
    public final String d(zcx zcxVar) {
        return zcxVar.c(this.b, qkc.Companion.serializer());
    }
}
