package com.fillr.browsersdk.tls.utils;

import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.browsersdk.utilities.FillrUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.brotli.dec.BrotliInputStream;

/* loaded from: classes4.dex */
public final class HttpParser {
    public static final Pattern CSP_META_TAG_REGEX_PATTERN;
    public static final HashSet EMPTY_RESPONSE_CODES;
    public static final String[] FRAME_OPTIONS_FILTER;
    public static final byte[] NEWLINE;
    public static final String NEWLINE_STR;
    public final ByteArrayOutputStream bodyBuffer;
    public final CountDownLatch completionSignal;
    public String cspMetaTag;
    public ArrayList headers;
    public boolean incomplete;
    public boolean parsedAllHeaders;
    public String request;
    public final Socket socket;
    public int socketTimeout;
    public InputStream source;
    public final SimpleDecoder.AnonymousClass1 worker;
    public static final ThreadPoolExecutor PARSER_POOL = new ThreadPoolExecutor(40, 80, 30000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2048));
    public static final String EMPTY_LINE = "__fillr_blank_line__" + Math.random();

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00d7, code lost:
    
        if (r5 > 16777216) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: -$$Nest$mparse, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1938$$Nest$mparse(HttpParser httpParser) {
        String statusCode;
        String str;
        int i;
        ?? r5;
        InputStream inputStream;
        Socket socket;
        ByteArrayOutputStream byteArrayOutputStream = httpParser.bodyBuffer;
        httpParser.getHeaders();
        if (!httpParser.parsedAllHeaders) {
            httpParser.incomplete = true;
        }
        String request = httpParser.getRequest();
        String headerValue = httpParser.getHeaderValue("Content-Length");
        String headerValue2 = httpParser.getHeaderValue("Transfer-Encoding");
        String headerValue3 = httpParser.getHeaderValue("Content-Encoding");
        String headerValue4 = httpParser.getHeaderValue("Content-Type");
        boolean z = TextUtils.isEmpty(headerValue4) || headerValue4.toLowerCase().contains("html");
        boolean z2 = "gzip".equalsIgnoreCase(headerValue3) || "br".equalsIgnoreCase(headerValue3);
        boolean isEmpty = TextUtils.isEmpty(headerValue);
        HashSet hashSet = EMPTY_RESPONSE_CODES;
        if ((((isEmpty || "0".equals(headerValue)) && TextUtils.isEmpty(headerValue2)) || TextUtils.isEmpty(request) || !request.toLowerCase().contains("http/")) && ((statusCode = httpParser.getStatusCode()) == null || hashSet.contains(statusCode))) {
            SVG svg = Fillr.getInstance().fillrConfig;
            return;
        }
        if ("identity".equalsIgnoreCase(headerValue2)) {
            headerValue2 = null;
        }
        ?? r4 = 16777216;
        r4 = 16777216;
        ?? r42 = 16777216;
        try {
            i = Integer.parseInt(headerValue);
        } catch (Throwable unused) {
            str = headerValue;
            i = Integer.MAX_VALUE;
        }
        if (i <= 16777216) {
            str = headerValue;
            r5 = i;
            try {
                socket = httpParser.socket;
                if (socket != null && z2) {
                    socket.setSoTimeout(20000);
                    httpParser.socketTimeout = 20000;
                }
                if (TextUtils.isEmpty(headerValue2) && headerValue2.endsWith("chunked")) {
                    httpParser.readChunked(byteArrayOutputStream, headerValue2);
                    headerValue2 = httpParser.getHeaderValue("Transfer-Encoding");
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                } else {
                    SVG svg3 = Fillr.getInstance().fillrConfig;
                    readToBuffer(httpParser.source, byteArrayOutputStream, r5);
                    if (TextUtils.isEmpty(str) && byteArrayOutputStream.size() > 0) {
                        httpParser.replaceHeader("Content-Length", Integer.toString(byteArrayOutputStream.size()));
                    }
                }
            } catch (Exception unused2) {
                SVG svg4 = Fillr.getInstance().fillrConfig;
            }
            byteArrayOutputStream.size();
            SVG svg5 = Fillr.getInstance().fillrConfig;
            if (r5 != 2147483647 && byteArrayOutputStream.size() < r5) {
                httpParser.incomplete = true;
            }
            if (z || !TextUtils.isEmpty(headerValue2) || !z2) {
                if (z2) {
                    return;
                }
                SVG svg6 = Fillr.getInstance().fillrConfig;
                return;
            }
            try {
                try {
                    SVG svg7 = Fillr.getInstance().fillrConfig;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    r42 = new ByteArrayInputStream(byteArray);
                    try {
                        if ("gzip".equalsIgnoreCase(headerValue3)) {
                            try {
                                inputStream = new GZIPInputStream(r42);
                            } catch (IOException e) {
                                e = e;
                                inputStream = null;
                                e.getMessage();
                                SVG svg8 = Fillr.getInstance().fillrConfig;
                                closeStreams(new Closeable[]{inputStream, r42});
                                r42 = r42;
                                r5 = inputStream;
                                return;
                            } catch (Throwable th) {
                                th = th;
                                r5 = 0;
                                closeStreams(new Closeable[]{r5, r42});
                                throw th;
                            }
                        } else {
                            inputStream = new BrotliInputStream(r42);
                        }
                        try {
                            byteArrayOutputStream.reset();
                            readToBuffer(inputStream, byteArrayOutputStream, Integer.MAX_VALUE);
                            httpParser.replaceHeader("Content-Encoding", null);
                            httpParser.replaceHeader("Content-Length", Integer.toString(byteArrayOutputStream.size()));
                            int length = byteArray.length;
                            byteArrayOutputStream.size();
                            SVG svg9 = Fillr.getInstance().fillrConfig;
                            closeStreams(new Closeable[]{inputStream, r42});
                            r42 = r42;
                            r5 = inputStream;
                        } catch (IOException e2) {
                            e = e2;
                            e.getMessage();
                            SVG svg82 = Fillr.getInstance().fillrConfig;
                            closeStreams(new Closeable[]{inputStream, r42});
                            r42 = r42;
                            r5 = inputStream;
                            return;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e4) {
                e = e4;
                r42 = 0;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                r42 = 0;
                r5 = 0;
            }
            return;
        }
        try {
            str = headerValue;
            try {
                r4 = new RuntimeException("Maximum content-length exceeded; targetLength=" + i + ", maxLength=16777216");
                throw r4;
            } catch (Throwable unused3) {
                String statusCode2 = httpParser.getStatusCode();
                if (statusCode2 != null && !hashSet.contains(statusCode2)) {
                    r42 = r4;
                    r5 = i;
                    if (!TextUtils.isEmpty(str)) {
                        r42 = r4;
                        r5 = i;
                    }
                    socket = httpParser.socket;
                    if (socket != null) {
                        socket.setSoTimeout(20000);
                        httpParser.socketTimeout = 20000;
                    }
                    if (TextUtils.isEmpty(headerValue2)) {
                    }
                    SVG svg32 = Fillr.getInstance().fillrConfig;
                    readToBuffer(httpParser.source, byteArrayOutputStream, r5);
                    if (TextUtils.isEmpty(str)) {
                        httpParser.replaceHeader("Content-Length", Integer.toString(byteArrayOutputStream.size()));
                    }
                    byteArrayOutputStream.size();
                    SVG svg52 = Fillr.getInstance().fillrConfig;
                    if (r5 != 2147483647) {
                        httpParser.incomplete = true;
                    }
                    if (z) {
                    }
                    if (z2) {
                    }
                }
                SVG svg10 = Fillr.getInstance().fillrConfig;
            }
        } catch (Throwable unused4) {
            str = headerValue;
        }
    }

    static {
        String str;
        byte[] bArr = {13, 10};
        NEWLINE = bArr;
        HashSet hashSet = new HashSet();
        EMPTY_RESPONSE_CODES = hashSet;
        CSP_META_TAG_REGEX_PATTERN = Pattern.compile("(?i)(<\\s*meta\\s*http-equiv\\s*=\\s*['\"]Content-Security-Policy['\"][^>]*?)(script-src.*?;)");
        FRAME_OPTIONS_FILTER = new String[]{"/SecurePay/"};
        hashSet.add("100");
        hashSet.add("101");
        hashSet.add("102");
        hashSet.add("103");
        hashSet.add("202");
        hashSet.add("204");
        hashSet.add("205");
        hashSet.add("208");
        hashSet.add("301");
        hashSet.add("302");
        hashSet.add("303");
        hashSet.add("304");
        hashSet.add("307");
        hashSet.add("308");
        try {
            str = new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            str = new String(NEWLINE);
        }
        NEWLINE_STR = str;
    }

    public HttpParser(Socket socket, InputStream inputStream, String str, String str2) {
        this.completionSignal = new CountDownLatch(1);
        this.source = inputStream;
        this.socket = socket;
        this.bodyBuffer = new ByteArrayOutputStream();
        this.incomplete = false;
        this.parsedAllHeaders = false;
        try {
            this.socketTimeout = socket.getSoTimeout();
        } catch (Exception unused) {
            this.socketTimeout = 20000;
        }
        SimpleDecoder.AnonymousClass1 anonymousClass1 = new SimpleDecoder.AnonymousClass1(this, 5);
        this.worker = anonymousClass1;
        PARSER_POOL.execute(anonymousClass1);
    }

    public static void closeStreams(Closeable... closeableArr) {
        if (closeableArr.length < 1) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                    SVG svg = Fillr.getInstance().fillrConfig;
                }
            }
        }
    }

    public static String encodedString(String str) {
        return TextUtils.isEmpty(str) ? str : new String(str.getBytes(), "ISO-8859-1");
    }

    public static boolean isRequestLine(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase().startsWith("http/") || str.toLowerCase().contains(" http/");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r0[2].toLowerCase().matches("^http/[0-9]\\.[0-9]+$") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isValidRequestOrStatusLine(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split(" ");
                boolean matches = split[0].toLowerCase().matches("(get|head|post|put|delete|connect|options|trace|patch)");
                if (split.length == 3 && matches) {
                }
            } catch (Exception unused) {
                SVG svg = Fillr.getInstance().fillrConfig;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split2 = str.split(" [0-9]{3} ");
        return split2.length == 2 && split2[0].toLowerCase().matches("^http/[0-9]\\.[0-9]+$");
    }

    public static void readToBuffer(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, int i) {
        int min = Math.min(i, 1024);
        byte[] bArr = new byte[min];
        int i2 = min;
        int i3 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i2);
            if (read == -1) {
                return;
            }
            synchronized (byteArrayOutputStream) {
                i3 += read;
                try {
                    byteArrayOutputStream.write(bArr, 0, read);
                    if (i3 >= i) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = Math.min(i - i3, min);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r11.split("\\?").length <= 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String sanitizeUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.matches("^[a-z0-9]{1,12}://.*$")) {
            return str;
        }
        String[] split = str.split("(?i)https?://");
        if (split.length == 3) {
            String str2 = split[1];
            String str3 = split[2];
            String str4 = str.split("://")[0];
            if (str2.endsWith("/")) {
                if (str.split(str4 + "://").length == 3) {
                }
            }
            if (!str2.contains("/") && str3.contains("/") && str2.contains(str3.split("/")[0])) {
                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str2, "/");
                m108m.append(str3.split("/", 2)[1]);
                str2 = m108m.toString();
            }
            if (!str2.contains("?") && str3.contains("?") && str2.contains(str3.split("\\?")[0])) {
                StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str2, "?");
                m108m2.append(str3.split("\\?", 2)[1]);
                str2 = m108m2.toString();
            }
            String m = Recorder$$ExternalSyntheticOutline2.m(str4, "://", str2);
            SVG svg = Fillr.getInstance().fillrConfig;
            return m;
        }
        return str;
    }

    public static List splitLongHeader(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(":")) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        String substring = str.substring(0, str.indexOf(":"));
        for (String str2 : str.substring(str.indexOf(":") + 1).trim().split("; ")) {
            if (stringBuffer.length() < 1) {
                stringBuffer.append(str2);
            } else if (Boxes$$ExternalSyntheticOutline1.m(stringBuffer.length(), 2, str2) <= 8000) {
                stringBuffer.append("; ");
                stringBuffer.append(str2);
            } else {
                if ("Location".equalsIgnoreCase(substring)) {
                    stringBuffer = new StringBuffer(sanitizeUrl(stringBuffer.toString()));
                }
                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(substring, ": ");
                m108m.append(stringBuffer.toString());
                arrayList.add(m108m.toString());
                stringBuffer.setLength(0);
            }
        }
        if ("Location".equalsIgnoreCase(substring)) {
            stringBuffer = new StringBuffer(sanitizeUrl(stringBuffer.toString()));
        }
        if (stringBuffer.length() > 0) {
            StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(substring, ": ");
            m108m2.append(stringBuffer.toString());
            arrayList.add(m108m2.toString());
        }
        if (arrayList.size() > 1) {
            arrayList.size();
            SVG svg = Fillr.getInstance().fillrConfig;
        }
        return arrayList;
    }

    public static String unquote(String str) {
        return TextUtils.isEmpty(str) ? str : (str.startsWith("'") || str.startsWith("\"")) ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str) : str;
    }

    public static int widgetInsertionPoint(String str) {
        Matcher matcher = Pattern.compile("(?i)<\\s*/\\s*head\\s*>").matcher(str);
        if (matcher.find()) {
            return matcher.start();
        }
        Matcher matcher2 = Pattern.compile("(?i)<\\s*/\\s*body\\s*>").matcher(str);
        if (matcher2.find()) {
            return matcher2.start();
        }
        Matcher matcher3 = Pattern.compile("(?i)<\\s*/\\s*script\\s*>").matcher(str);
        int i = -1;
        while (matcher3.find()) {
            i = matcher3.end();
        }
        return i;
    }

    public final void addCspNonceIfRequired() {
        String headerValue = getHeaderValue("Content-Security-Policy");
        if (TextUtils.isEmpty(headerValue) || !headerValue.contains("script-src")) {
            return;
        }
        try {
            String str = headerValue.split("script-src")[1].split(";")[0];
            if (str.contains("unsafe-inline") || str.contains("nonce")) {
                return;
            }
            replaceHeader("Content-Security-Policy", headerValue.replaceFirst("(script-src[^;]*);", "$1".concat(" 'nonce-" + UUID.randomUUID().toString() + "';")));
            SVG svg = Fillr.getInstance().fillrConfig;
        } catch (Exception unused) {
        }
    }

    public final String checkForAndChangeCspMetaTag(String str) {
        if (TextUtils.isEmpty(getHeaderValue("Content-Security-Policy"))) {
            try {
                String[] split = str.split("(?i)<\\s*/\\s*head\\s*>", 2);
                String str2 = split.length == 2 ? split[0] : null;
                if (!TextUtils.isEmpty(str2)) {
                    Matcher matcher = CSP_META_TAG_REGEX_PATTERN.matcher(str2);
                    if (matcher.find() && matcher.groupCount() >= 2 && !TextUtils.isEmpty(matcher.group(2))) {
                        String group = matcher.group(2);
                        if (!group.contains("unsafe-inline") && !group.contains("nonce")) {
                            String replaceFirst = group.replaceFirst("(script-src[^;]*);", "$1".concat(" 'nonce-" + UUID.randomUUID().toString() + "';"));
                            StringBuilder sb = new StringBuilder("$1");
                            sb.append(replaceFirst);
                            String replaceFirst2 = str.replaceFirst("(?i)(<\\s*meta\\s*http-equiv\\s*=\\s*['\"]Content-Security-Policy['\"][^>]*?)(script-src.*?;)", sb.toString());
                            this.cspMetaTag = replaceFirst;
                            SVG svg = Fillr.getInstance().fillrConfig;
                            return replaceFirst2;
                        }
                        if (group.contains("nonce")) {
                            this.cspMetaTag = group;
                            SVG svg2 = Fillr.getInstance().fillrConfig;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public final String getHeaderLines() {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) getHeaders()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(NEWLINE_STR);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final String getHeaderValue(String str) {
        if (str.contains(":")) {
            str = str.replace(":", "");
        }
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = ((ArrayList) getHeaders()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (str3.toLowerCase().startsWith(str.toLowerCase() + ":")) {
                    str2 = str3;
                    break;
                }
            }
        }
        return TextUtils.isEmpty(str2) ? str2 : str2.substring(str2.indexOf(":") + 1).trim();
    }

    public final synchronized List getHeaders() {
        boolean z;
        try {
            if (this.headers == null) {
                getRequest();
                this.headers = new ArrayList();
                while (true) {
                    z = true;
                    String readLine = readLine(true);
                    if (readLine != null) {
                        if (TextUtils.isEmpty(readLine.trim()) || EMPTY_LINE.equals(readLine)) {
                            break;
                        }
                        if (this.headers.isEmpty() && "HTTP/1.1 502 No Status Line".equals(this.request) && isRequestLine(readLine)) {
                            SVG svg = Fillr.getInstance().fillrConfig;
                            this.request = readLine;
                        } else {
                            SVG svg2 = Fillr.getInstance().fillrConfig;
                            this.headers.addAll(splitLongHeader(readLine));
                        }
                    } else {
                        break;
                    }
                }
                if (!this.request.contains("1.0") && this.headers.size() <= 0) {
                    z = false;
                }
                this.parsedAllHeaders = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.headers;
    }

    public final String getMethod() {
        getRequest();
        if (TextUtils.isEmpty(this.request) || this.request.toLowerCase().startsWith("http/")) {
            return null;
        }
        return this.request.split(" ")[0];
    }

    public final synchronized String getRequest() {
        String str;
        int i = 2;
        while (true) {
            try {
                str = this.request;
                if (str != null || i <= 0) {
                    break;
                }
                String readLine = readLine(false);
                this.request = readLine;
                i--;
                if (readLine != null && readLine.split(" ").length > 2) {
                    String str2 = this.request;
                    String str3 = NEWLINE_STR;
                    if (!str2.contains(str3) && !isValidRequestOrStatusLine(this.request)) {
                        String str4 = new String(new byte[]{13});
                        String str5 = new String(new byte[]{10});
                        String[] split = this.request.split(" ");
                        if (!split[2].contains(str4)) {
                            if (split[2].contains(str5)) {
                            }
                        }
                        SVG svg = Fillr.getInstance().fillrConfig;
                        boolean contains = split[2].contains(str4);
                        String str6 = this.request;
                        this.request = contains ? str6.replace(str4, str3) : str6.replace(str5, str3);
                        this.source = new ByteArrayInputStream(this.request.getBytes());
                        this.request = null;
                    }
                }
                if (this.request != null) {
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                } else if (i > 0) {
                    SVG svg3 = Fillr.getInstance().fillrConfig;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str == null) {
            SVG svg4 = Fillr.getInstance().fillrConfig;
            this.request = "HTTP/1.1 502 No Status Line";
        }
        return this.request;
    }

    public final String getStatusCode() {
        getRequest();
        if (TextUtils.isEmpty(this.request) || !this.request.toLowerCase().startsWith("http/")) {
            return null;
        }
        return this.request.split(" ")[1];
    }

    public final boolean hasRequestLine() {
        String request = getRequest();
        return (TextUtils.isEmpty(request) || "HTTP/1.1 502 No Status Line".equals(request) || !isRequestLine(request)) ? false : true;
    }

    public final boolean isMethod(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(getMethod());
    }

    public final boolean isWebsocket() {
        waitForParse();
        return !this.incomplete && "Upgrade".equalsIgnoreCase(getHeaderValue("Connection")) && "websocket".equalsIgnoreCase(getHeaderValue("Upgrade"));
    }

    public final void readChunked(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int i;
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("chunked")) {
            SVG svg = Fillr.getInstance().fillrConfig;
            return;
        }
        if (str.contains(", ")) {
            SVG svg2 = Fillr.getInstance().fillrConfig;
        }
        SVG svg3 = Fillr.getInstance().fillrConfig;
        int i2 = 0;
        while (true) {
            String readLine = readLine(false);
            if (readLine == null) {
                break;
            }
            try {
                i = Integer.parseInt(readLine.trim(), 16);
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 1) {
                break;
            }
            i2 += i;
            if (i2 > 16777216) {
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Maximum chunked content-length exceeded; totalSize=", ", maxSize=16777216"));
                return;
            }
            synchronized (byteArrayOutputStream) {
                for (int i3 = i; i3 > 0; i3--) {
                    try {
                        int read = this.source.read();
                        if (read == -1) {
                            throw new IOException("Unexpected error when decoding chunked content; expectedSize=" + i + ", actualSize=" + (i - i3));
                        }
                        byteArrayOutputStream.write(read);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String readLine2 = readLine(false);
            if (readLine2 != null && !TextUtils.isEmpty(readLine2.trim())) {
                SVG svg4 = Fillr.getInstance().fillrConfig;
            }
        }
        replaceHeader("Transfer-Encoding", str.replaceAll("(\\, )?chunked", ""));
        replaceHeader("Content-Length", Integer.toString(this.bodyBuffer.size()));
        str.replaceAll("(\\, )?chunked", "");
        SVG svg5 = Fillr.getInstance().fillrConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r8 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r0.size() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r0.write(com.fillr.browsersdk.tls.utils.HttpParser.EMPTY_LINE.getBytes());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String readLine(boolean z) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z2 = false;
        while (true) {
            try {
                int read = this.source.read();
                if (read == -1) {
                    break;
                }
                Socket socket = this.socket;
                if (socket != null && (i = this.socketTimeout) > 20000 && i != 20000) {
                    socket.setSoTimeout(20000);
                    this.socketTimeout = 20000;
                }
                if (read == 13 && !z2) {
                    z2 = true;
                } else {
                    if (read == 10 && z2) {
                        break;
                    }
                    if (z2) {
                        byteArrayOutputStream.write(13);
                    }
                    z2 = read == 13;
                    byteArrayOutputStream.write(read);
                }
            } catch (Exception unused) {
                byteArrayOutputStream.size();
                SVG svg = Fillr.getInstance().fillrConfig;
            }
        }
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public final byte[] recompress(String str) {
        String substring;
        String substring2;
        GZIPOutputStream gZIPOutputStream;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        if (!hasRequestLine() || str.length() < 10240 || !TextUtils.isEmpty(getHeaderValue("Content-Encoding"))) {
            return str.getBytes("ISO-8859-1");
        }
        StringBuilder sb = new StringBuilder();
        String str2 = NEWLINE_STR;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, str2);
        int indexOf = str.indexOf(m);
        if (indexOf < 0 || m.length() + indexOf >= str.length()) {
            return str.getBytes("ISO-8859-1");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                substring = str.substring(0, m.length() + indexOf);
                substring2 = str.substring(indexOf + m.length());
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(substring2.getBytes("ISO-8859-1"));
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String replaceAll = substring.replaceAll("(?im)^\\s*content-length\\:\\s[0-9]+", "Content-Length: " + byteArray.length + str2 + "Content-Encoding: gzip");
            byte[] bytes = replaceAll.getBytes("ISO-8859-1");
            byte[] bArr = new byte[replaceAll.length() + byteArray.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(byteArray, 0, bArr, bytes.length, byteArray.length);
            StringBuilder sb2 = new StringBuilder("Successfully recompressed data, originalSize=");
            sb2.append(substring2.length());
            sb2.append(", compressedSize=");
            sb2.append(byteArray.length);
            SVG svg = Fillr.getInstance().fillrConfig;
            try {
                byteArrayOutputStream.close();
                gZIPOutputStream.close();
            } catch (IOException unused2) {
            }
            return bArr;
        } catch (Exception unused3) {
            gZIPOutputStream2 = gZIPOutputStream;
            SVG svg2 = Fillr.getInstance().fillrConfig;
            byte[] bytes2 = str.getBytes("ISO-8859-1");
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
            } catch (IOException unused4) {
            }
            return bytes2;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
            } catch (IOException unused5) {
            }
            throw th;
        }
    }

    public final void replaceHeader(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = ((ArrayList) getHeaders()).iterator();
        while (it.hasNext()) {
            if (((String) it.next()).toLowerCase().startsWith(str.toLowerCase() + ":")) {
                it.remove();
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.headers.addAll(splitLongHeader(str + ": " + str2));
    }

    public final String scriptTagForCsp(String str) {
        String[] strArr;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.cspMetaTag)) {
                return "<script type='text/javascript'>";
            }
            str = this.cspMetaTag;
        }
        String[] split = str.split(";");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strArr = new String[0];
                break;
            }
            strArr = split[i].trim().split(" ");
            if ("script-src".equalsIgnoreCase(unquote(strArr[0]))) {
                break;
            }
            i++;
        }
        for (String str2 : strArr) {
            String unquote = unquote(str2);
            if (unquote.startsWith("nonce-")) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<script type='text/javascript' nonce='", unquote.replace("nonce-", ""), "'>");
            }
        }
        return "<script type='text/javascript'>";
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[Catch: all -> 0x01cf, TryCatch #2 {all -> 0x01cf, blocks: (B:16:0x004b, B:17:0x004f, B:21:0x0057, B:23:0x0067, B:25:0x0070, B:31:0x0080, B:34:0x008f, B:54:0x0099, B:56:0x00a1, B:36:0x00c1, B:38:0x00cb, B:40:0x00d5, B:44:0x00dd, B:42:0x00eb, B:46:0x00ee, B:48:0x0104, B:51:0x0109, B:60:0x00b0, B:62:0x01a7, B:64:0x01b0, B:67:0x01b9, B:69:0x01be, B:75:0x01ce, B:19:0x0050, B:20:0x0056), top: B:15:0x004b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: all -> 0x01cf, TryCatch #2 {all -> 0x01cf, blocks: (B:16:0x004b, B:17:0x004f, B:21:0x0057, B:23:0x0067, B:25:0x0070, B:31:0x0080, B:34:0x008f, B:54:0x0099, B:56:0x00a1, B:36:0x00c1, B:38:0x00cb, B:40:0x00d5, B:44:0x00dd, B:42:0x00eb, B:46:0x00ee, B:48:0x0104, B:51:0x0109, B:60:0x00b0, B:62:0x01a7, B:64:0x01b0, B:67:0x01b9, B:69:0x01be, B:75:0x01ce, B:19:0x0050, B:20:0x0056), top: B:15:0x004b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109 A[Catch: all -> 0x01cf, TryCatch #2 {all -> 0x01cf, blocks: (B:16:0x004b, B:17:0x004f, B:21:0x0057, B:23:0x0067, B:25:0x0070, B:31:0x0080, B:34:0x008f, B:54:0x0099, B:56:0x00a1, B:36:0x00c1, B:38:0x00cb, B:40:0x00d5, B:44:0x00dd, B:42:0x00eb, B:46:0x00ee, B:48:0x0104, B:51:0x0109, B:60:0x00b0, B:62:0x01a7, B:64:0x01b0, B:67:0x01b9, B:69:0x01be, B:75:0x01ce, B:19:0x0050, B:20:0x0056), top: B:15:0x004b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] toBytes(HttpParser httpParser) {
        String str;
        byte[] byteArray;
        boolean z;
        String statusCode;
        int widgetInsertionPoint;
        waitForParse();
        Fillr fillr = Fillr.getInstance();
        String headerValue = httpParser.getHeaderValue("Accept");
        String headerValue2 = httpParser.getHeaderValue("X-Requested-With");
        String headerValue3 = getHeaderValue("Content-Type");
        if (headerValue2 == null) {
            headerValue2 = "";
        }
        if (TextUtils.isEmpty(headerValue) || TextUtils.isEmpty(headerValue3) || fillr == null || ((FillrWidget) fillr.getWidgetManager().iv) == null || (str = ((FillrWidget) fillr.getWidgetManager().iv).mWidgetJavaScript) == null || str.length() <= 0) {
            return toBytes();
        }
        try {
            synchronized (this.bodyBuffer) {
                byteArray = this.bodyBuffer.toByteArray();
            }
            boolean isWebContentLikelyHtml = FillrUtils.isWebContentLikelyHtml(new String(byteArray, "ISO-8859-1"), headerValue3);
            if (!headerValue.contains("html") && !headerValue.contains("text/*") && !headerValue.contains("*/*")) {
                z = false;
                if (isWebContentLikelyHtml && z && !headerValue2.toLowerCase().contains("xmlhttprequest")) {
                    statusCode = getStatusCode();
                    if (!TextUtils.isEmpty(statusCode)) {
                        try {
                            if (Integer.parseInt(statusCode) >= 400) {
                                httpParser.getRequest();
                                SVG svg = Fillr.getInstance().fillrConfig;
                                return toBytes();
                            }
                        } catch (Exception e) {
                            e.getMessage();
                            httpParser.getRequest();
                            SVG svg2 = Fillr.getInstance().fillrConfig;
                            return this.toBytes();
                        }
                    }
                    if (!TextUtils.isEmpty(getHeaderValue("X-Frame-Options"))) {
                        String request = httpParser.getRequest();
                        String[] strArr = FRAME_OPTIONS_FILTER;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (request.contains(strArr[i])) {
                                httpParser.getRequest();
                                SVG svg3 = Fillr.getInstance().fillrConfig;
                                replaceHeader("X-Frame-Options", null);
                                break;
                            }
                            i++;
                        }
                    }
                    addCspNonceIfRequired();
                    String checkForAndChangeCspMetaTag = checkForAndChangeCspMetaTag(new String(toBytes(), "ISO-8859-1"));
                    widgetInsertionPoint = widgetInsertionPoint(checkForAndChangeCspMetaTag);
                    if (widgetInsertionPoint >= 0) {
                        return recompress(checkForAndChangeCspMetaTag);
                    }
                    String str2 = checkForAndChangeCspMetaTag.substring(0, widgetInsertionPoint) + encodedString(scriptTagForCsp(getHeaderValue("Content-Security-Policy"))) + encodedString(Fillr.getInstance().getWidgetManager().buildPayloadForUrl(getHeaderValue("Host") + getRequest())) + encodedString("</script>") + checkForAndChangeCspMetaTag.substring(widgetInsertionPoint);
                    String replaceAll = str2.replaceAll("(?i)content-length\\:\\s[0-9]+", "Content-Length: " + (((str2.getBytes().length - getRequest().getBytes().length) - getHeaderLines().getBytes().length) - (NEWLINE.length * 3)));
                    httpParser.getRequest();
                    SVG svg4 = Fillr.getInstance().fillrConfig;
                    return recompress(replaceAll);
                }
                if (!headerValue3.startsWith("text/") && !headerValue3.contains("javascript")) {
                    return toBytes();
                }
                return recompress(new String(toBytes(), "ISO-8859-1"));
            }
            z = true;
            if (isWebContentLikelyHtml) {
                statusCode = getStatusCode();
                if (!TextUtils.isEmpty(statusCode)) {
                }
                if (!TextUtils.isEmpty(getHeaderValue("X-Frame-Options"))) {
                }
                addCspNonceIfRequired();
                String checkForAndChangeCspMetaTag2 = checkForAndChangeCspMetaTag(new String(toBytes(), "ISO-8859-1"));
                widgetInsertionPoint = widgetInsertionPoint(checkForAndChangeCspMetaTag2);
                if (widgetInsertionPoint >= 0) {
                }
            }
            if (!headerValue3.startsWith("text/")) {
                return toBytes();
            }
            return recompress(new String(toBytes(), "ISO-8859-1"));
        } catch (Throwable unused) {
            SVG svg5 = Fillr.getInstance().fillrConfig;
            return this.toBytes();
        }
    }

    public final void waitForParse() {
        try {
            this.completionSignal.await();
        } catch (InterruptedException unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }

    public HttpParser(Socket socket) {
        this(socket, socket.getInputStream(), "fillr.proxy", null);
    }

    public final byte[] toBytes() {
        byte[] byteArray;
        waitForParse();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (hasRequestLine()) {
                StringBuilder sb = new StringBuilder();
                sb.append(getRequest());
                String str = NEWLINE_STR;
                sb.append(str);
                sb.append(getHeaderLines());
                sb.append(str);
                sb.append(str);
                byteArrayOutputStream.write(sb.toString().getBytes());
                if (this.bodyBuffer.size() > 0) {
                    synchronized (this.bodyBuffer) {
                        byteArray = this.bodyBuffer.toByteArray();
                    }
                    byteArrayOutputStream.write(byteArray);
                }
            } else {
                byteArrayOutputStream.write(getRequest().getBytes());
            }
        } catch (Throwable unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
