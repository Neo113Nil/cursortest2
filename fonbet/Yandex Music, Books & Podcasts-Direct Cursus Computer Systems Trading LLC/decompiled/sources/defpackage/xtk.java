package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;

/* loaded from: classes.dex */
public final class xtk extends buk {
    @Override // defpackage.buk
    public void p(ztk ztkVar, cqh cqhVar) {
        super.p(ztkVar, cqhVar);
        cqhVar.a.putInt(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, ztkVar.a.getDeviceType());
    }
}
