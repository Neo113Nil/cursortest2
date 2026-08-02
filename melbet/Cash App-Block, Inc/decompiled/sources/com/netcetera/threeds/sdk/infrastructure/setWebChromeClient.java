package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Range;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes5.dex */
public abstract class setWebChromeClient implements setInitialScale {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static long get;
    private final setWebViewRenderProcessClient getWarnings;
    private final setWebViewClient initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2ServiceInstance = 0;
        ThreeDS2Service = 1;
        get = 6921250763014938100L;
    }

    public setWebChromeClient(setWebViewClient setwebviewclient) {
        this(setwebviewclient, new setItemChecked());
    }

    private boolean ThreeDS2Service(int i) {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 43) % 128;
        boolean contains = Range.create(200, Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE)).contains((Range) Integer.valueOf(i));
        int i2 = ThreeDS2ServiceInstance + 83;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return contains;
        }
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public static java.lang.Object[] ThreeDS2ServiceInstance(int r51, int r52) {
        /*
            Method dump skipped, instructions count: 2022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setWebChromeClient.ThreeDS2ServiceInstance(int, int):java.lang.Object[]");
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2;
        int i3 = $11 + 117;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(get ^ (-2776494906517314268L), charArray, i);
        int i4 = 4;
        oncompleted.initialize = 4;
        while (true) {
            int i5 = oncompleted.initialize;
            if (i5 >= initialize.length) {
                objArr[0] = new String(initialize, i4, initialize.length - 4);
                return;
            }
            int i6 = i5 - 4;
            oncompleted.ThreeDS2Service = i6;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i5] ^ initialize[i5 % 4]), Long.valueOf(i6), Long.valueOf(get)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i4;
                } else {
                    i2 = i4;
                    Class cls = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 48, (char) (TextUtils.indexOf("", "") + 27780), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2440);
                    Object[] objArr3 = new Object[1];
                    c(0, (byte) 0, (byte) 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(65 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 14235 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 29) % 128;
                i4 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int i7 = i3 + 4;
        byte[] bArr = $$a;
        int i8 = i2 * 20;
        int i9 = (i * 19) + 84;
        byte[] bArr2 = new byte[23 - i8];
        int i10 = 22 - i8;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i11 = 0;
            int i12 = i7;
            int i13 = i12 + i9 + 2;
            int i14 = i7;
            i4 = i13;
            i5 = i14;
            bArr = bArr3;
            i6 = i11;
            bArr2[i6] = (byte) i4;
            int i15 = i5 + 1;
            if (i6 == i10) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i16 = i4;
            i7 = i15;
            i9 = bArr[i15];
            i11 = i6 + 1;
            bArr3 = bArr;
            i12 = i16;
            int i132 = i12 + i9 + 2;
            int i142 = i7;
            i4 = i132;
            i5 = i142;
            bArr = bArr3;
            i6 = i11;
            bArr2[i6] = (byte) i4;
            int i152 = i5 + 1;
            if (i6 == i10) {
            }
        } else {
            i4 = i9;
            i5 = i7;
            i6 = 0;
            bArr2[i6] = (byte) i4;
            int i1522 = i5 + 1;
            if (i6 == i10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = b * 2;
        int i4 = 112 - (i * 3);
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            i4 = i6;
            int i8 = 0;
            i5++;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private byte[] get(InputStream inputStream) {
        int i = (ThreeDS2ServiceInstance + 87) % 128;
        ThreeDS2Service = i;
        if (inputStream == null) {
            int i2 = i + 31;
            ThreeDS2ServiceInstance = i2 % 128;
            return i2 % 2 != 0 ? new byte[0] : new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            int i3 = ThreeDS2Service + 93;
            ThreeDS2ServiceInstance = i3 % 128;
            int i4 = i3 % 2;
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void init$0() {
        $$a = new byte[]{85, -78, 86, -80, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0, -4, 13};
        $$b = 90;
    }

    public static void init$1() {
        $$d = new byte[]{64, 120, -87, 124};
        $$e = EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE;
    }

    public /* synthetic */ Object clone() {
        int i = ThreeDS2ServiceInstance + 55;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        setInitialScale setinitialscale = get();
        if (i2 == 0) {
            int i3 = 33 / 0;
        }
        int i4 = ThreeDS2Service + 125;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return setinitialscale;
        }
        throw null;
    }

    public abstract setInitialScale getWarnings();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r1 = get(r10.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (ThreeDS2Service(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (ThreeDS2Service(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = new byte[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setSafeBrowsingWhitelist getWarnings(HttpsURLConnection httpsURLConnection) {
        int responseCode;
        byte[] bArr;
        int i = ThreeDS2Service + 67;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            httpsURLConnection.connect();
            responseCode = httpsURLConnection.getResponseCode();
            int i2 = 27 / 0;
        } else {
            httpsURLConnection.connect();
            responseCode = httpsURLConnection.getResponseCode();
        }
        int i3 = responseCode;
        byte[] bArr2 = bArr;
        byte[] bArr3 = get(httpsURLConnection.getErrorStream());
        String str = (String) oj.getWarnings(httpsURLConnection.getResponseMessage(), "");
        String externalForm = httpsURLConnection.getURL().toExternalForm();
        Map<String, String> warnings = getWarnings(httpsURLConnection.getHeaderFields());
        httpsURLConnection.disconnect();
        setTextClassifier settextclassifier = new setTextClassifier(bArr2, bArr3, i3, str, externalForm, warnings);
        this.getWarnings.initialize(settextclassifier);
        ThreeDS2Service = (ThreeDS2ServiceInstance + 75) % 128;
        return settextclassifier;
    }

    public void initialize(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setRequestMethod(this.initialize.ThreeDS2Service());
        Map<String, String> warnings = this.initialize.getWarnings();
        Iterator<String> it = warnings.keySet().iterator();
        ThreeDS2Service = (ThreeDS2ServiceInstance + 51) % 128;
        while (it.hasNext()) {
            int i = ThreeDS2Service + 71;
            ThreeDS2ServiceInstance = i % 128;
            if (i % 2 != 0) {
                String next = it.next();
                httpsURLConnection.setRequestProperty(next, warnings.get(next));
                throw null;
            }
            String next2 = it.next();
            httpsURLConnection.setRequestProperty(next2, warnings.get(next2));
        }
    }

    public setWebChromeClient(setWebViewClient setwebviewclient, setWebViewRenderProcessClient setwebviewrenderprocessclient) {
        this.initialize = setwebviewclient;
        this.getWarnings = setwebviewrenderprocessclient;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInitialScale
    public setWebViewClient ThreeDS2Service() {
        int i = ThreeDS2Service;
        setWebViewClient setwebviewclient = this.initialize;
        ThreeDS2ServiceInstance = (i + 31) % 128;
        return setwebviewclient;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInitialScale
    public setInitialScale get() {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 119) % 128;
        setInitialScale warnings = getWarnings();
        int i = ThreeDS2ServiceInstance + 3;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
        return warnings;
    }

    private Map<String, String> getWarnings(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            ThreeDS2Service = (ThreeDS2ServiceInstance + 93) % 128;
            if (oj.initialize(str) && map.get(str) != null) {
                Iterator<String> it = map.get(str).iterator();
                while (it.hasNext()) {
                    ThreeDS2ServiceInstance = (ThreeDS2Service + 103) % 128;
                    hashMap.put(str, it.next());
                }
            }
        }
        return hashMap;
    }

    public void ThreeDS2ServiceInstance(HttpsURLConnection httpsURLConnection) {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 95) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setInitialScale
    public setSafeBrowsingWhitelist ThreeDS2ServiceInstance() {
        try {
            this.getWarnings.initialize(this.initialize);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(this.initialize.initialize()).openConnection();
            initialize(httpsURLConnection);
            ThreeDS2ServiceInstance(httpsURLConnection);
            setSafeBrowsingWhitelist warnings = getWarnings(httpsURLConnection);
            int i = ThreeDS2ServiceInstance + 119;
            ThreeDS2Service = i % 128;
            if (i % 2 == 0) {
                int i2 = 95 / 0;
            }
            return warnings;
        } catch (MalformedURLException e) {
            throw setTextAlignment.getSDKInfo.initialize(this.initialize.initialize(), e);
        } catch (SocketTimeoutException e2) {
            throw setTextAlignment.ThreeDS2ServiceInitializationCallback.initialize(e2);
        } catch (SSLHandshakeException e3) {
            throw setTextAlignment.cleanup.initialize(e3);
        } catch (IOException e4) {
            throw setTextAlignment.getSDKVersion.initialize(e4);
        } catch (Exception e5) {
            throw setTextAlignment.get.initialize(e5);
        }
    }
}
