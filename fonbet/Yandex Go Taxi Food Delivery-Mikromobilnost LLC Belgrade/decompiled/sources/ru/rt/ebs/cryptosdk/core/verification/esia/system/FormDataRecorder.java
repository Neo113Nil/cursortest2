package ru.rt.ebs.cryptosdk.core.verification.esia.system;

import android.webkit.JavascriptInterface;
import defpackage.cvu0;
import defpackage.g4s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/system/FormDataRecorder;", "", "<init>", "()V", "", "url", "formData", "Lzy11;", "processFormData", "(Ljava/lang/String;Ljava/lang/String;)V", "body", "interceptRequestBody", "getAndClearData", "(Ljava/lang/String;)Ljava/lang/String;", "getLastBodyAndClear", "", "requestBodyMap", "Ljava/util/Map;", "formDataMap", "Companion", "g4s", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FormDataRecorder {
    public static final g4s Companion = new g4s();
    public static final String interfaceName = "formDataRecorder";
    private Map<String, String> requestBodyMap = new LinkedHashMap();
    private Map<String, String> formDataMap = new LinkedHashMap();

    public final String getAndClearData(String url) {
        Object obj;
        String remove;
        Iterator<T> it = this.formDataMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (url.equals(str) || cvu0.s(url, str, false)) {
                break;
            }
        }
        String str2 = (String) obj;
        return (str2 == null || (remove = this.formDataMap.remove(str2)) == null) ? "" : remove;
    }

    public final String getLastBodyAndClear(String url) {
        Object obj;
        Iterator<T> it = this.requestBodyMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (url.equals(str) || cvu0.s(url, str, false)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return this.requestBodyMap.remove(str2);
        }
        return null;
    }

    @JavascriptInterface
    public final void interceptRequestBody(String url, String body) {
        this.requestBodyMap.put(url, body);
    }

    @JavascriptInterface
    public final void processFormData(String url, String formData) {
        this.formDataMap.put(url, formData);
    }
}
