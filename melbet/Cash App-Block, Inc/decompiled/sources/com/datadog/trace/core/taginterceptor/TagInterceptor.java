package com.datadog.trace.core.taginterceptor;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.Pair;
import com.datadog.trace.api.env.CapturedEnvironment;
import com.datadog.trace.api.normalize.HttpResourceNames;
import com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString;
import com.datadog.trace.core.DDSpanContext;
import com.google.android.gms.tasks.zzb;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.net.URI;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class TagInterceptor {
    public static final UTF8BytesString NOT_FOUND_RESOURCE_NAME = UTF8BytesString.create("404");
    public final String inferredServiceName;
    public final boolean isServiceNameSetByUser;
    public final zzb ruleFlags;
    public final boolean shouldSet404ResourceName;
    public final boolean shouldSetUrlResourceAsName;
    public final boolean splitByServletContext;
    public final HashSet splitServiceTags;

    public TagInterceptor(zzb zzbVar) {
        Config config = Config.INSTANCE;
        boolean z = config.serviceNameSetByUser;
        String str = (String) CapturedEnvironment.INSTANCE.properties.get("service.name");
        HashSet hashSet = config.splitByTags;
        this.isServiceNameSetByUser = z;
        this.inferredServiceName = str;
        this.splitServiceTags = hashSet;
        this.ruleFlags = zzbVar;
        this.splitByServletContext = hashSet.contains("servlet.context");
        boolean[] zArr = (boolean[]) zzbVar.zza;
        boolean z2 = zArr[1];
        this.shouldSet404ResourceName = z2 && zArr[2] && zArr[3];
        this.shouldSetUrlResourceAsName = z2;
    }

    public static boolean asBoolean(Object obj) {
        if (Boolean.TRUE.equals(obj) || "1".equals(obj)) {
            return true;
        }
        return !Boolean.FALSE.equals(obj) && Boolean.parseBoolean(String.valueOf(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setResourceFromUrl(DDSpanContext dDSpanContext, String str, Object obj) {
        URI create;
        String path;
        Pair pair;
        String obj2 = obj.toString();
        if (obj2 != null) {
            try {
                create = URI.create(obj2);
            } catch (IllegalArgumentException unused) {
            }
            path = create != null ? create.getPath() : null;
            byte b = 1;
            if (path != null) {
                dDSpanContext.setResourceName(HttpResourceNames.DEFAULT_RESOURCE_NAME, (byte) 1);
                return;
            }
            if ("client".equals(dDSpanContext.unsafeTags.get("span.kind"))) {
                if (HttpResourceNames.INSTANCE == null) {
                    HttpResourceNames.INSTANCE = new HttpResourceNames();
                }
                String normalize = HttpResourceNames.INSTANCE.clientAntPatternHttpPathNormalizer.normalize(path.toString());
                if (normalize != null) {
                    b = 4;
                } else {
                    normalize = HttpResourceNames.simpleHttpPathNormalizer.normalize(path.toString());
                }
                pair = new Pair((CharSequence) HttpResourceNames.JOINER_CACHE.computeIfAbsent(new Pair(str, normalize), HttpResourceNames.JOINER), Byte.valueOf(b));
            } else {
                if (HttpResourceNames.INSTANCE == null) {
                    HttpResourceNames.INSTANCE = new HttpResourceNames();
                }
                String normalize2 = HttpResourceNames.INSTANCE.serverAntPatternHttpPathNormalizer.normalize(path.toString());
                if (normalize2 != null) {
                    b = 4;
                } else {
                    normalize2 = HttpResourceNames.simpleHttpPathNormalizer.normalize(path.toString());
                }
                pair = new Pair((CharSequence) HttpResourceNames.JOINER_CACHE.computeIfAbsent(new Pair(str, normalize2), HttpResourceNames.JOINER), Byte.valueOf(b));
            }
            Object obj3 = pair.left;
            if (obj3 != null) {
                dDSpanContext.setResourceName((CharSequence) obj3, ((Byte) pair.right).byteValue());
                return;
            }
            return;
        }
        create = null;
        if (create != null) {
        }
        byte b2 = 1;
        if (path != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean interceptTag(DDSpanContext dDSpanContext, String str, Object obj) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case -1600255323:
                if (str.equals("_dd1.sr.eausr")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1541421527:
                if (str.equals("peer.service")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -688795810:
                if (str.equals("span.type")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -620406091:
                if (str.equals("_dd.measured")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -356226025:
                if (str.equals("manual.drop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -356030291:
                if (str.equals("manual.keep")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -134204663:
                if (str.equals("http.url")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str.equals(BreadcrumbHelper.Category.ERROR)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 282739975:
                if (str.equals("http.method")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 314627620:
                if (str.equals("service.name")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 934168683:
                if (str.equals("resource.name")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 960885172:
                if (str.equals("http.status_code")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1775928319:
                if (str.equals("db.statement")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1798451925:
                if (str.equals("_dd.origin")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1984153269:
                if (str.equals("service")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2146501382:
                if (str.equals("servlet.context")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Number number = null;
        number = null;
        switch (c) {
            case 0:
                if (obj instanceof Number) {
                    number = (Number) obj;
                } else if (obj instanceof String) {
                    try {
                        number = Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                Number number2 = number;
                if (number2 != null) {
                    dDSpanContext.setMetric("_dd1.sr.eausr", number2);
                }
                return true;
            case 1:
                dDSpanContext.setTag("peer.service", "_dd.peer.service.source");
                if (!((boolean[]) this.ruleFlags.zza)[CameraSelector$$ExternalSyntheticOutline0.ordinal(8)]) {
                    return false;
                }
                dDSpanContext.setServiceName(String.valueOf(obj));
                return true;
            case 2:
                if (obj instanceof CharSequence) {
                    return true;
                }
                String.valueOf(obj);
                return true;
            case 3:
                if (((obj instanceof Number) && ((Number) obj).intValue() > 0) || asBoolean(obj)) {
                    if (true != dDSpanContext.measured) {
                        dDSpanContext.measured = true;
                        return true;
                    }
                    return true;
                }
                return false;
            case 4:
                if (((boolean[]) this.ruleFlags.zza)[CameraSelector$$ExternalSyntheticOutline0.ordinal(6)]) {
                    if (asBoolean(obj)) {
                        dDSpanContext.setSamplingPriority(-1, 4);
                        return true;
                    }
                    return true;
                }
                return false;
            case 5:
                if (asBoolean(obj)) {
                    DDSpanContext rootSpanContextOrThis = dDSpanContext.getRootSpanContextOrThis();
                    if (DDSpanContext.SAMPLING_PRIORITY_UPDATER.getAndSet(rootSpanContextOrThis, 2) == -128) {
                        rootSpanContextOrThis.propagationTags.updateTraceSamplingPriority(2, 4);
                        return true;
                    }
                    return true;
                }
                return false;
            case 6:
            case '\b':
                if (this.shouldSetUrlResourceAsName) {
                    if ("http.method".equals(str)) {
                        Object obj2 = dDSpanContext.unsafeTags.get("http.url");
                        if (obj2 != null) {
                            setResourceFromUrl(dDSpanContext, obj.toString(), obj2);
                            return false;
                        }
                    } else if ("http.url".equals(str)) {
                        Object obj3 = dDSpanContext.unsafeTags.get("http.method");
                        setResourceFromUrl(dDSpanContext, obj3 != null ? obj3.toString() : null, obj);
                        return false;
                    }
                }
                return false;
            case 7:
                boolean asBoolean = asBoolean(obj);
                if (dDSpanContext.errorFlagPriority <= 0) {
                    dDSpanContext.errorFlag = asBoolean;
                    dDSpanContext.errorFlagPriority = (byte) 0;
                    return true;
                }
                return true;
            case '\t':
            case 14:
                if (!((boolean[]) this.ruleFlags.zza)[CameraSelector$$ExternalSyntheticOutline0.ordinal(9)]) {
                    return false;
                }
                dDSpanContext.setServiceName(String.valueOf(obj));
                return true;
            case '\n':
                if (((boolean[]) this.ruleFlags.zza)[0] && obj != null) {
                    if (obj instanceof CharSequence) {
                        dDSpanContext.setResourceName((CharSequence) obj, (byte) 5);
                        return true;
                    }
                    dDSpanContext.setResourceName(String.valueOf(obj), (byte) 5);
                    return true;
                }
                return false;
            case 11:
                if (!(obj instanceof Number)) {
                    try {
                        dDSpanContext.httpStatusCode = Short.parseShort(String.valueOf(obj));
                        if (this.shouldSet404ResourceName && dDSpanContext.httpStatusCode == 404) {
                            dDSpanContext.setResourceName(NOT_FOUND_RESOURCE_NAME, (byte) 2);
                            return true;
                        }
                    } catch (Throwable unused2) {
                        break;
                    }
                } else {
                    dDSpanContext.httpStatusCode = ((Number) obj).shortValue();
                    if (this.shouldSet404ResourceName && dDSpanContext.httpStatusCode == 404) {
                        dDSpanContext.setResourceName(NOT_FOUND_RESOURCE_NAME, (byte) 2);
                        return true;
                    }
                }
                return true;
            case '\f':
                if (obj instanceof CharSequence) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() > 0) {
                        dDSpanContext.setResourceName(charSequence, (byte) 5);
                        return true;
                    }
                }
                return true;
            case '\r':
                if (obj instanceof CharSequence) {
                    dDSpanContext.setOrigin((CharSequence) obj);
                    return true;
                }
                dDSpanContext.setOrigin(String.valueOf(obj));
                return true;
            case 15:
                if (this.splitByServletContext || (!this.isServiceNameSetByUser && ((boolean[]) this.ruleFlags.zza)[9] && (dDSpanContext.serviceName.isEmpty() || dDSpanContext.serviceName.equals(this.inferredServiceName) || dDSpanContext.serviceName.equals("unnamed-java-app")))) {
                    String trim = String.valueOf(obj).trim();
                    if (!trim.isEmpty()) {
                        if (trim.equals("/")) {
                            dDSpanContext.setServiceName(Config.INSTANCE.rootContextServiceName);
                            return false;
                        }
                        if (trim.charAt(0) != '/') {
                            dDSpanContext.setServiceName(trim);
                            return false;
                        }
                        if (trim.length() > 1) {
                            dDSpanContext.setServiceName(trim.substring(1));
                            return false;
                        }
                    }
                }
                return false;
            default:
                if (this.splitServiceTags.contains(str)) {
                    dDSpanContext.setServiceName(String.valueOf(obj));
                    return true;
                }
                return false;
        }
    }
}
