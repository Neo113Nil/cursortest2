package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.network.entities.exceptions.NetworkException;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.client.b;

/* loaded from: classes4.dex */
public final class qwu {
    public String a;
    public final rwu b;
    public final u3u c;
    public final boolean d;
    public final twu e;
    public final ICommonController f;
    public final ISdkDispatchers g;

    public qwu(String str, rwu rwuVar, u3u u3uVar, boolean z, twu twuVar, ICommonController iCommonController, ISdkDispatchers iSdkDispatchers) {
        this.a = str;
        this.b = rwuVar;
        this.c = u3uVar;
        this.d = z;
        this.e = twuVar;
        this.f = iCommonController;
        this.g = iSdkDispatchers;
    }

    public final URL a(xwu xwuVar) {
        String str;
        int i;
        e2b1 e2b1Var = xwuVar.b;
        Map map = xwuVar.d;
        if (e2b1Var instanceof zwu) {
            str = b64.j(this.a, ((zwu) e2b1Var).a);
        } else {
            if (!(e2b1Var instanceof axu)) {
                w511.b();
                return null;
            }
            str = ((axu) e2b1Var).a;
        }
        Iterator it = xwuVar.c.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            str = cvu0.v(str, oyr.p("{", (String) entry.getKey(), "}"), (String) entry.getValue(), false);
        }
        if (!map.isEmpty()) {
            str = ((Object) str) + "?";
            for (Object obj : iw00.x(map)) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str2 = i == 0 ? "" : "&";
                str = ((Object) str) + str2 + pair.c() + "=" + pair.f();
                i = i2;
            }
        }
        return new URL(str);
    }

    public final void b(HttpsURLConnection httpsURLConnection, List list) {
        if (list.isEmpty()) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=******");
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mm40 mm40Var = (mm40) it.next();
            this.e.getClass();
            EbsLogger ebsLogger = EbsLogger.INSTANCE;
            if (ebsLogger.getHasData()) {
                ebsLogger.data("HTTPS--->", unr0.p("multipart: name = ", mm40Var.a, ", type = ", mm40Var.b, " "));
            }
            dataOutputStream.writeBytes("--******\r\n");
            dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + mm40Var.a + "\"");
            String str = mm40Var.d;
            if (str != null) {
                dataOutputStream.writeBytes("; filename=\"" + str + "\"");
            }
            dataOutputStream.writeBytes(Constants.LINE_SEPARATOR);
            dataOutputStream.writeBytes("Content-Type: " + mm40Var.b);
            dataOutputStream.writeBytes(Constants.LINE_SEPARATOR);
            dataOutputStream.writeBytes(Constants.LINE_SEPARATOR);
            InputStream inputStream = mm40Var.c;
            dataOutputStream.write(rzo.R(inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192)));
            dataOutputStream.writeBytes(Constants.LINE_SEPARATOR);
        }
        dataOutputStream.writeBytes("--******--\r\n");
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public final ywu c(xwu xwuVar) {
        int responseCode;
        BufferedInputStream bufferedInputStream;
        twu twuVar = this.e;
        try {
            this.f.checkVerifyIntegrity();
            URL a = a(xwuVar);
            Map map = xwuVar.e;
            String protocol = a.getProtocol();
            if (protocol == null || evu0.J(protocol) || !protocol.equals(com.adjust.sdk.Constants.SCHEME)) {
                NetworkException.Companion.getClass();
                throw new NetworkException(403, "", EbsException.NOT_ALLOWED_PROTOCOL_ERROR_CODE, "403 Not allowed protocol: " + protocol + ". Use https");
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a.openConnection();
            this.b.a(httpsURLConnection);
            httpsURLConnection.setRequestMethod(xwuVar.a.name());
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setUseCaches(false);
            twuVar.getClass();
            EbsLogger ebsLogger = EbsLogger.INSTANCE;
            if (ebsLogger.getHasData()) {
                ebsLogger.data("HTTPS--->", "START " + httpsURLConnection.getRequestMethod() + " " + httpsURLConnection.getURL());
            }
            for (Map.Entry entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), a.X((List) entry.getValue(), ";", null, null, null, 62));
            }
            twu.a(map);
            b(httpsURLConnection, xwuVar.g);
            httpsURLConnection.setInstanceFollowRedirects(this.d);
            Object obj = xwuVar.f;
            if (obj != null) {
                httpsURLConnection.setDoOutput(true);
                String h = obj instanceof String ? (String) obj : this.c.h(obj);
                EbsLogger ebsLogger2 = EbsLogger.INSTANCE;
                if (ebsLogger2.getHasData()) {
                    ebsLogger2.data("HTTPS--->", h);
                }
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                if (outputStream != null) {
                    outputStream.write(h.getBytes(uza.a));
                }
            }
            httpsURLConnection.connect();
            int responseCode2 = httpsURLConnection.getResponseCode();
            if ((200 > responseCode2 || responseCode2 >= 300) && (301 > (responseCode = httpsURLConnection.getResponseCode()) || responseCode >= 303)) {
                InputStream errorStream = httpsURLConnection.getErrorStream();
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                try {
                    byte[] R = rzo.R(bufferedInputStream);
                    bufferedInputStream.close();
                    twu.b(httpsURLConnection, R);
                    at50 at50Var = NetworkException.Companion;
                    int responseCode3 = httpsURLConnection.getResponseCode();
                    String responseMessage = httpsURLConnection.getResponseMessage();
                    String str = new String(R, uza.a);
                    at50Var.getClass();
                    throw at50.a(responseCode3, responseMessage, str);
                } finally {
                }
            }
            InputStream inputStream = httpsURLConnection.getInputStream();
            bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
            try {
                byte[] R2 = rzo.R(bufferedInputStream);
                bufferedInputStream.close();
                twu.b(httpsURLConnection, R2);
                String contentType = httpsURLConnection.getContentType();
                String g0 = contentType != null ? evu0.g0(contentType, ";", contentType) : null;
                return new ywu(httpsURLConnection.getResponseCode(), httpsURLConnection.getHeaderFields(), g0 == null ? "" : g0, fsb1.c(httpsURLConnection), new ByteArrayInputStream(R2));
            } finally {
            }
        } catch (Exception e) {
            twuVar.getClass();
            EbsLogger ebsLogger3 = EbsLogger.INSTANCE;
            if (!ebsLogger3.getHasError()) {
                throw e;
            }
            ebsLogger3.error("HTTPS--->", e);
            throw e;
        }
    }

    public final Object d(xwu xwuVar, ContinuationImpl continuationImpl) {
        return tje.k0(this.g.io(), new b(this, xwuVar, null), continuationImpl);
    }

    public final Object e(xwu xwuVar, Class cls) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c(xwuVar).e, uza.a), 8192);
        try {
            Object c = this.c.c(cls, cma1.x0(bufferedReader));
            bufferedReader.close();
            return c;
        } finally {
        }
    }
}
