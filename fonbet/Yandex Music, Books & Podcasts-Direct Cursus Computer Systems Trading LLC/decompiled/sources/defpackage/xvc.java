package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xvc implements oqb {
    public static final kac d = new kac(16);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public xvc(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = un3.b;
        vq1.u("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((dvt.a >= 27 || !uuid.equals(un3.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (un3.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // defpackage.oqb
    public final synchronized void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.oqb
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.oqb
    public final nqb c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new nqb(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // defpackage.oqb
    public final byte[] d() {
        return this.b.openSession();
    }

    @Override // defpackage.oqb
    public final void e(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.oqb
    public final void f(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.oqb
    public final void g(final znk znkVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: wvc
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                tt1 tt1Var = ((tl7) znkVar.b).y;
                tt1Var.getClass();
                tt1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.oqb
    public final int h() {
        return 2;
    }

    @Override // defpackage.oqb
    public final void i(byte[] bArr, ndl ndlVar) {
        if (dvt.a >= 31) {
            try {
                rf0.y(this.b, bArr, ndlVar);
            } catch (UnsupportedOperationException unused) {
                vq1.n0("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.oqb
    public final vvc j(byte[] bArr) {
        int i = dvt.a;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, un3.c)) {
            uuid = un3.b;
        }
        return new vvc(uuid, bArr);
    }

    @Override // defpackage.oqb
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.oqb
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (un3.c.equals(this.a) && dvt.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(dvt.r(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                vq1.L("ClearKeyUtil", "Failed to adjust response data: ".concat(dvt.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b8, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024d, code lost:
    
        if (java.util.Objects.equals(r3, "aidl-1") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b2, code lost:
    
        if ("AFTT".equals(r6) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0267  */
    @Override // defpackage.oqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lqb m(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        oqa oqaVar;
        byte[] bArr3;
        anx V;
        UUID uuid = this.a;
        oqa oqaVar2 = null;
        if (list != null) {
            if (un3.d.equals(uuid)) {
                if (dvt.a >= 28 && list.size() > 1) {
                    oqa oqaVar3 = (oqa) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        oqa oqaVar4 = (oqa) list.get(i3);
                        byte[] bArr4 = oqaVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(oqaVar4.d, oqaVar3.d) && Objects.equals(oqaVar4.c, oqaVar3.c) && wyf.V(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = ((oqa) list.get(i5)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i4 += length;
                    }
                    oqaVar = new oqa(oqaVar3.b, oqaVar3.c, oqaVar3.d, bArr5);
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    oqa oqaVar5 = (oqa) list.get(i6);
                    byte[] bArr7 = oqaVar5.e;
                    bArr7.getClass();
                    anx V2 = wyf.V(bArr7);
                    int i7 = V2 == null ? -1 : V2.a;
                    int i8 = dvt.a;
                    if ((i8 < 23 && i7 == 0) || (i8 >= 23 && i7 == 1)) {
                        oqaVar = oqaVar5;
                        break;
                    }
                }
                oqaVar = (oqa) list.get(0);
            } else {
                oqaVar = (oqa) list.get(0);
            }
            byte[] bArr8 = oqaVar.e;
            bArr8.getClass();
            UUID uuid2 = un3.e;
            if (uuid2.equals(uuid)) {
                byte[] W = wyf.W(uuid, bArr8);
                if (W != null) {
                    bArr8 = W;
                }
                d7k d7kVar = new d7k(bArr8);
                int j = d7kVar.j();
                short l = d7kVar.l();
                short l2 = d7kVar.l();
                if (l == 1 && l2 == 1) {
                    short l3 = d7kVar.l();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String t = d7kVar.t(l3, charset);
                    if (!t.contains("<LA_URL>")) {
                        int indexOf = t.indexOf("</DATA>");
                        if (indexOf == -1) {
                            vq1.n0("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        eta.k(0, indexOf, t, "<LA_URL>https://x</LA_URL>", sb);
                        sb.append(t.substring(indexOf));
                        String sb2 = sb.toString();
                        int i9 = j + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i9);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i9);
                        allocate.putShort(l);
                        allocate.putShort(l2);
                        allocate.putShort((short) (sb2.length() * 2));
                        allocate.put(sb2.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    vq1.Y("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = wyf.u(uuid2, null, bArr8);
            }
            int i10 = dvt.a;
            if (i10 < 27 && Objects.equals(uuid, un3.c) && (V = wyf.V(bArr8)) != null) {
                bArr8 = wyf.u(un3.b, (UUID[]) V.d, (byte[]) V.c);
            }
            if (i10 >= 23 || !un3.d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                    String str3 = Build.MODEL;
                    if (!"AFTB".equals(str3)) {
                        if (!"AFTS".equals(str3)) {
                            if (!"AFTM".equals(str3)) {
                            }
                        }
                    }
                }
                bArr3 = bArr8;
                String str4 = oqaVar.d;
                if (i10 < 26 && un3.c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) {
                    str4 = "cenc";
                }
                str = str4;
                bArr2 = bArr3;
                oqaVar2 = oqaVar;
            }
            bArr3 = wyf.W(uuid, bArr8);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (un3.c.equals(uuid) && dvt.a < 27) {
            data = dvt.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (dvt.a >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && oqaVar2 != null) {
                str2 = oqaVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            if (dvt.a >= 23) {
                keyRequest.getRequestType();
            }
            return new lqb(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = oqaVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        if (dvt.a >= 23) {
        }
        return new lqb(defaultUrl, data);
    }

    @Override // defpackage.oqb
    public final boolean n(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = dvt.a;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(un3.d);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(un3.c);
            }
            if (equals) {
                return rf0.w(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, un3.c)) ? uuid : un3.b, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(un3.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }
}
