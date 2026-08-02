package defpackage;

/* loaded from: classes2.dex */
public final class vkc extends clc {
    public vkc(String str, png pngVar) {
        super("sendPlatformCapabilityState", new ukc(str, pngVar));
    }

    @Override // defpackage.clc
    public final String d(zcx zcxVar) {
        return zcxVar.c(this.b, ukc.Companion.serializer());
    }
}
