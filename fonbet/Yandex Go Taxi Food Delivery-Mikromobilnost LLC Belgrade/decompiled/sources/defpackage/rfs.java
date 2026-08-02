package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MediaDrmHandler;
import androidx.media3.exoplayer.drm.c;
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
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final class rfs implements mno {
    public static final qir d = new qir(11);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public rfs(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = b87.b;
        d6z.k("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((tw21.a >= 27 || !uuid.equals(b87.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (b87.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString(DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "L3");
        }
    }

    @Override // defpackage.mno
    public final void closeSession(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.mno
    public final rcf createCryptoConfig(byte[] bArr) {
        int i = tw21.a;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, b87.c)) {
            uuid = b87.b;
        }
        return new pfs(uuid, bArr);
    }

    @Override // defpackage.mno
    public final int getCryptoType() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0245, code lost:
    
        if (java.util.Objects.equals(r0, "aidl-1") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        if ("AFTT".equals(r7) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025e  */
    @Override // defpackage.mno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gno getKeyRequest(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        DrmInitData.SchemeData schemeData;
        lg e;
        UUID uuid = this.a;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (b87.d.equals(uuid)) {
                if (tw21.a >= 28 && list.size() > 1) {
                    DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(i3);
                        byte[] bArr3 = schemeData4.data;
                        bArr3.getClass();
                        if (Objects.equals(schemeData4.mimeType, schemeData3.mimeType) && Objects.equals(schemeData4.licenseServerUrl, schemeData3.licenseServerUrl) && vaa1.e(bArr3) != null) {
                            i2 += bArr3.length;
                        }
                    }
                    byte[] bArr4 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr5 = ((DrmInitData.SchemeData) list.get(i5)).data;
                        bArr5.getClass();
                        int length = bArr5.length;
                        System.arraycopy(bArr5, 0, bArr4, i4, length);
                        i4 += length;
                    }
                    schemeData = schemeData3.copyWithData(bArr4);
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i6);
                    byte[] bArr6 = schemeData5.data;
                    bArr6.getClass();
                    lg e2 = vaa1.e(bArr6);
                    int i7 = e2 == null ? -1 : e2.a;
                    int i8 = tw21.a;
                    if ((i8 < 23 && i7 == 0) || (i8 >= 23 && i7 == 1)) {
                        schemeData = schemeData5;
                        break;
                    }
                }
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            }
            byte[] bArr7 = schemeData.data;
            bArr7.getClass();
            UUID uuid2 = b87.e;
            if (uuid2.equals(uuid)) {
                byte[] f = vaa1.f(uuid, bArr7);
                if (f != null) {
                    bArr7 = f;
                }
                ef90 ef90Var = new ef90(bArr7);
                int m = ef90Var.m();
                short o = ef90Var.o();
                short o2 = ef90Var.o();
                if (o == 1 && o2 == 1) {
                    short o3 = ef90Var.o();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String w = ef90Var.w(o3, charset);
                    if (!w.contains("<LA_URL>")) {
                        int indexOf = w.indexOf("</DATA>");
                        if (indexOf == -1) {
                            lk91.j("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        oyr.C(0, indexOf, w, "<LA_URL>https://x</LA_URL>", sb);
                        sb.append(w.substring(indexOf));
                        String sb2 = sb.toString();
                        int i9 = m + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i9);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i9);
                        allocate.putShort(o);
                        allocate.putShort(o2);
                        allocate.putShort((short) (sb2.length() * 2));
                        allocate.put(sb2.getBytes(charset));
                        bArr7 = allocate.array();
                    }
                } else {
                    lk91.h("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr7 = vaa1.c(uuid2, null, bArr7);
            }
            int i10 = tw21.a;
            if (i10 < 27 && Objects.equals(uuid, b87.c) && (e = vaa1.e(bArr7)) != null) {
                bArr7 = vaa1.c(b87.b, (UUID[]) e.d, (byte[]) e.c);
            }
            if (i10 >= 23 || !b87.d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                    String str2 = Build.MODEL;
                    if (!"AFTB".equals(str2)) {
                        if (!"AFTS".equals(str2)) {
                            if (!"AFTM".equals(str2)) {
                            }
                        }
                    }
                }
                String str3 = schemeData.mimeType;
                bArr2 = bArr7;
                str = (i10 >= 26 && b87.c.equals(uuid) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) ? "cenc" : str3;
                schemeData2 = schemeData;
            }
            byte[] f2 = vaa1.f(uuid, bArr7);
            if (f2 != null) {
                bArr7 = f2;
            }
            String str32 = schemeData.mimeType;
            bArr2 = bArr7;
            str = (i10 >= 26 && b87.c.equals(uuid) && ("video/mp4".equals(str32) || "audio/mp4".equals(str32))) ? "cenc" : str32;
            schemeData2 = schemeData;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (b87.c.equals(uuid) && tw21.a < 27) {
            data = tw21.p(data).replace('+', LicenseUtility.SEPARATOR).replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (tw21.a >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null && !TextUtils.isEmpty(schemeData2.licenseServerUrl)) {
                defaultUrl = schemeData2.licenseServerUrl;
            }
            if (tw21.a >= 23) {
                keyRequest.getRequestType();
            }
            return new gno(data, defaultUrl);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            defaultUrl = schemeData2.licenseServerUrl;
        }
        if (tw21.a >= 23) {
        }
        return new gno(data, defaultUrl);
    }

    @Override // defpackage.mno
    public final lno getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new lno(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.mno
    public final byte[] openSession() {
        return this.b.openSession();
    }

    @Override // defpackage.mno
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (b87.c.equals(this.a) && tw21.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(tw21.p(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(CSPDirectoryConstants.SUBDIRECTORY_KEYS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace(LicenseUtility.SEPARATOR, '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace(LicenseUtility.SEPARATOR, '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                lk91.f("ClearKeyUtil", "Failed to adjust response data: ".concat(tw21.p(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.mno
    public final void provideProvisionResponse(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.mno
    public final Map queryKeyStatus(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.mno
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.mno
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        MediaCrypto mediaCrypto;
        boolean equals;
        boolean requiresSecureDecoder;
        int i = tw21.a;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(b87.d);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(b87.c);
            }
            if (equals) {
                requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
                return requiresSecureDecoder;
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, b87.c)) ? uuid : b87.b, bArr);
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
            boolean z = !uuid.equals(b87.c);
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

    @Override // defpackage.mno
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.mno
    public final void setOnEventListener(hno hnoVar) {
        final zgf zgfVar = (zgf) hnoVar;
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: qfs
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                DefaultDrmSessionManager$MediaDrmHandler defaultDrmSessionManager$MediaDrmHandler = ((c) zgfVar.b).y;
                defaultDrmSessionManager$MediaDrmHandler.getClass();
                defaultDrmSessionManager$MediaDrmHandler.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.mno
    public final void setPlayerIdForSession(byte[] bArr, vyc0 vyc0Var) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        if (tw21.a >= 31) {
            try {
                MediaDrm mediaDrm = this.b;
                LogSessionId a = vyc0Var.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (equals) {
                    return;
                }
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                xbm.f(playbackComponent).setLogSessionId(a);
            } catch (UnsupportedOperationException unused2) {
                lk91.j("setLogSessionId failed.");
            }
        }
    }
}
