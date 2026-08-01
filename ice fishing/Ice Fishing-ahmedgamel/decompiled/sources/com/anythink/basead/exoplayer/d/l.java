package com.anythink.basead.exoplayer.d;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.os.Handler;
import com.anythink.basead.exoplayer.d.j;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements j<k> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f6874g = "cenc";

    /* renamed from: h, reason: collision with root package name */
    private final UUID f6875h;
    private final MediaDrm i;

    private l(UUID uuid) {
        com.anythink.basead.exoplayer.k.a.a(uuid);
        UUID uuid2 = com.anythink.basead.exoplayer.b.bi;
        com.anythink.basead.exoplayer.k.a.a(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (af.f8346a < 27 && com.anythink.basead.exoplayer.b.bj.equals(uuid)) {
            uuid = uuid2;
        }
        this.f6875h = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.i = mediaDrm;
        if (com.anythink.basead.exoplayer.b.bk.equals(uuid) && "ASUS_Z00AD".equals(af.f8349d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static l a(UUID uuid) {
        try {
            return new l(uuid);
        } catch (Exception e9) {
            throw new o(e9);
        }
    }

    private static boolean d() {
        return "ASUS_Z00AD".equals(af.f8349d);
    }

    private k e(byte[] bArr) {
        return new k(new MediaCrypto(this.f6875h, bArr), af.f8346a < 21 && com.anythink.basead.exoplayer.b.bk.equals(this.f6875h) && "L3".equals(a("securityLevel")));
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final j.h b() {
        MediaDrm.ProvisionRequest provisionRequest = this.i.getProvisionRequest();
        return new j.c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final Map<String, String> c(byte[] bArr) {
        return this.i.queryKeyStatus(bArr);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void c() {
        this.i.release();
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final /* synthetic */ k d(byte[] bArr) {
        return new k(new MediaCrypto(this.f6875h, bArr), af.f8346a < 21 && com.anythink.basead.exoplayer.b.bk.equals(this.f6875h) && "L3".equals(a("securityLevel")));
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void a(final j.f<? super k> fVar) {
        this.i.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.anythink.basead.exoplayer.d.l.1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i6, byte[] bArr2) {
                fVar.a(bArr, i);
            }
        });
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void b(byte[] bArr) {
        this.i.provideProvisionResponse(bArr);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void a(final j.g<? super k> gVar) {
        if (af.f8346a >= 23) {
            this.i.setOnKeyStatusChangeListener(gVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.anythink.basead.exoplayer.d.l.2
                @Override // android.media.MediaDrm.OnKeyStatusChangeListener
                public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z3) {
                    ArrayList arrayList = new ArrayList();
                    for (MediaDrm.KeyStatus keyStatus : list) {
                        arrayList.add(new j.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                    }
                }
            }, (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void b(byte[] bArr, byte[] bArr2) {
        this.i.restoreKeys(bArr, bArr2);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final byte[] b(String str) {
        return this.i.getPropertyByteArray(str);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final byte[] a() {
        return this.i.openSession();
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void a(byte[] bArr) {
        this.i.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if ("AFTM".equals(r1) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    @Override // com.anythink.basead.exoplayer.d.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j.d a(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) {
        byte[] bArr3;
        byte[] data;
        int i6 = af.f8346a;
        if (i6 >= 21 || !com.anythink.basead.exoplayer.b.bk.equals(this.f6875h)) {
            if (com.anythink.basead.exoplayer.b.bl.equals(this.f6875h) && "Amazon".equals(af.f8348c)) {
                String str2 = af.f8349d;
                if (!"AFTB".equals(str2)) {
                    if (!"AFTS".equals(str2)) {
                    }
                }
            }
            bArr3 = bArr2;
            if (i6 < 26 && com.anythink.basead.exoplayer.b.bj.equals(this.f6875h) && (com.anythink.basead.exoplayer.k.o.f8448e.equals(str) || com.anythink.basead.exoplayer.k.o.f8459q.equals(str))) {
                str = "cenc";
            }
            MediaDrm.KeyRequest keyRequest = this.i.getKeyRequest(bArr, bArr3, str, i, hashMap);
            data = keyRequest.getData();
            if (com.anythink.basead.exoplayer.b.bj.equals(this.f6875h) && i6 < 27) {
                data = af.c(af.a(data).replace('+', '-').replace('/', '_'));
            }
            return new j.a(data, keyRequest.getDefaultUrl());
        }
        byte[] a9 = com.anythink.basead.exoplayer.e.a.h.a(bArr2, this.f6875h);
        if (a9 != null) {
            bArr3 = a9;
            if (i6 < 26) {
                str = "cenc";
            }
            MediaDrm.KeyRequest keyRequest2 = this.i.getKeyRequest(bArr, bArr3, str, i, hashMap);
            data = keyRequest2.getData();
            if (com.anythink.basead.exoplayer.b.bj.equals(this.f6875h)) {
                data = af.c(af.a(data).replace('+', '-').replace('/', '_'));
            }
            return new j.a(data, keyRequest2.getDefaultUrl());
        }
        bArr3 = bArr2;
        if (i6 < 26) {
        }
        MediaDrm.KeyRequest keyRequest22 = this.i.getKeyRequest(bArr, bArr3, str, i, hashMap);
        data = keyRequest22.getData();
        if (com.anythink.basead.exoplayer.b.bj.equals(this.f6875h)) {
        }
        return new j.a(data, keyRequest22.getDefaultUrl());
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (com.anythink.basead.exoplayer.b.bj.equals(this.f6875h)) {
            bArr2 = a.a(bArr2);
        }
        return this.i.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final String a(String str) {
        return this.i.getPropertyString(str);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void a(String str, String str2) {
        this.i.setPropertyString(str, str2);
    }

    @Override // com.anythink.basead.exoplayer.d.j
    public final void a(String str, byte[] bArr) {
        this.i.setPropertyByteArray(str, bArr);
    }
}
