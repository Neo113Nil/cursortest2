package ru.yandex.taxi.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.evu0;
import defpackage.fi7;
import defpackage.qv10;
import defpackage.sq41;
import defpackage.xvz;
import defpackage.yax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 k2\u00020\u0001:\u0002lmBÏ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u001eJ\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b-\u0010.R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010/\u001a\u0004\b&\u00100\"\u0004\b1\u0010!R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010/\u001a\u0004\b\u001d\u00100\"\u0004\b2\u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010/\u001a\u0004\b3\u00100\"\u0004\b4\u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010$\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b9\u0010$\"\u0004\b:\u00108R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b;\u0010$\"\u0004\b<\u00108R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\b=\u0010$\"\u0004\b>\u00108R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\b?\u0010$\"\u0004\b@\u00108R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\bA\u0010$\"\u0004\bB\u00108R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bC\u0010$\"\u0004\bD\u00108R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\bE\u0010$\"\u0004\bF\u00108R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\bG\u0010$\"\u0004\bH\u00108R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\bI\u0010$\"\u0004\bJ\u00108R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010K\u001a\u0004\bU\u0010M\"\u0004\bV\u0010OR\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u001a\u0004\b\u0016\u0010$\"\u0004\bW\u00108R.\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bY\u0010K\u0012\u0004\b\\\u0010]\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR.\u0010`\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010^8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010]\u001a\u0004\bb\u0010cR.\u0010f\u001a\u0004\u0018\u00010e2\b\u0010_\u001a\u0004\u0018\u00010e8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010]\u001a\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lru/yandex/taxi/web/CoreWebViewConfig;", "Landroid/os/Parcelable;", "", "url", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "targetHost", "", "delayedSpinner", "acceptThirdPartyCookies", "ignoreSslError", "localStorageEnabled", "useIntentForNonHttpUrls", "fitWidth", "ignoreDeviceTextSize", "javaScriptCanOpenWindowsAutomatically", "mediaPlaybackRequiresUserGesture", "supportMultipleWindows", "", "userAgentAdditional", "", "headers", "jsScripts", "isCompatibleWithMob", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZLjava/util/List;Ljava/util/Map;Ljava/util/List;Z)V", "Lru/yandex/taxi/web/CoreWebViewConfig$a;", "builder", "(Lru/yandex/taxi/web/CoreWebViewConfig$a;)V", "defaultValue", "getToken", "(Ljava/lang/String;)Ljava/lang/String;", "Lzy11;", "updateUrl", "(Ljava/lang/String;)V", "updateToken", "shouldUseAuthorizationHeader", "()Z", "containsUrl", "getUrl", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "()Ljava/lang/String;", "setUrl", "setToken", "getTargetHost", "setTargetHost", "Z", "getDelayedSpinner", "setDelayedSpinner", "(Z)V", "getAcceptThirdPartyCookies", "setAcceptThirdPartyCookies", "getIgnoreSslError", "setIgnoreSslError", "getLocalStorageEnabled", "setLocalStorageEnabled", "getUseIntentForNonHttpUrls", "setUseIntentForNonHttpUrls", "getFitWidth", "setFitWidth", "getIgnoreDeviceTextSize", "setIgnoreDeviceTextSize", "getJavaScriptCanOpenWindowsAutomatically", "setJavaScriptCanOpenWindowsAutomatically", "getMediaPlaybackRequiresUserGesture", "setMediaPlaybackRequiresUserGesture", "getSupportMultipleWindows", "setSupportMultipleWindows", "Ljava/util/List;", "getUserAgentAdditional", "()Ljava/util/List;", "setUserAgentAdditional", "(Ljava/util/List;)V", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getJsScripts", "setJsScripts", "setCompatibleWithMob", "Lsq41;", "webViewJsInterfaces", "getWebViewJsInterfaces", "setWebViewJsInterfaces", "getWebViewJsInterfaces$annotations", "()V", "Lyax;", "value", "jsPromiseInterface", "Lyax;", "getJsPromiseInterface", "()Lyax;", "getJsPromiseInterface$annotations", "Lfi7;", "callJsInterfaceFactory", "Lfi7;", "getCallJsInterfaceFactory", "()Lfi7;", "getCallJsInterfaceFactory$annotations", "Companion", "a", "ru/yandex/taxi/web/a", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreWebViewConfig implements Parcelable {
    private boolean acceptThirdPartyCookies;
    private fi7 callJsInterfaceFactory;
    private boolean delayedSpinner;
    private boolean fitWidth;
    private Map<String, String> headers;
    private boolean ignoreDeviceTextSize;
    private boolean ignoreSslError;
    private boolean isCompatibleWithMob;
    private boolean javaScriptCanOpenWindowsAutomatically;
    private yax jsPromiseInterface;
    private List<String> jsScripts;
    private boolean localStorageEnabled;
    private boolean mediaPlaybackRequiresUserGesture;
    private boolean supportMultipleWindows;
    private String targetHost;
    private String token;
    private String url;
    private boolean useIntentForNonHttpUrls;
    private List<String> userAgentAdditional;
    private List<sq41> webViewJsInterfaces;
    public static final ru.yandex.taxi.web.a Companion = new ru.yandex.taxi.web.a();
    public static final Parcelable.Creator<CoreWebViewConfig> CREATOR = new Creator();

    public static final class a {
        public sq41 a;
        public String b;
        public String c;
        public HashMap d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public yax k;
        public boolean l;
        public fi7 m;
        public final ArrayList n = new ArrayList();
        public boolean o;

        public final CoreWebViewConfig a() {
            return new CoreWebViewConfig(this, null);
        }

        public final void b(String str, String str2) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, str2);
        }

        public final void c() {
            this.e = true;
        }

        public final void d() {
            this.j = true;
        }

        public final void e(LinkedHashMap linkedHashMap) {
            this.d = linkedHashMap;
        }

        public final void f() {
            this.l = true;
        }

        public final void g() {
            this.g = true;
        }

        public final void h() {
            this.h = true;
        }

        public final void i(String str) {
            this.c = str;
        }

        public final void j(String str) {
            this.b = str;
        }

        public final void k() {
            this.i = true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CoreWebViewConfig(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list, Map map, List list2, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15 != 0 ? r16 : list, (i & 16384) != 0 ? kotlin.collections.b.f() : map, (i & 32768) == 0 ? list2 : r16, (i & 65536) != 0 ? false : z11);
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) == 0 ? str3 : null;
        boolean z12 = (i & 8) != 0 ? false : z;
        boolean z13 = (i & 16) != 0 ? false : z2;
        boolean z14 = (i & 32) != 0 ? false : z3;
        boolean z15 = (i & 64) != 0 ? false : z4;
        boolean z16 = (i & 128) != 0 ? false : z5;
        boolean z17 = (i & 256) != 0 ? false : z6;
        boolean z18 = (i & 512) != 0 ? false : z7;
        boolean z19 = (i & 1024) != 0 ? false : z8;
        boolean z20 = (i & 2048) != 0 ? true : z9;
        boolean z21 = (i & 4096) != 0 ? false : z10;
        int i2 = i & 8192;
        List list3 = EmptyList.a;
    }

    public static final a builder() {
        Companion.getClass();
        return new a();
    }

    public static /* synthetic */ void getCallJsInterfaceFactory$annotations() {
    }

    public static /* synthetic */ void getJsPromiseInterface$annotations() {
    }

    public static /* synthetic */ void getWebViewJsInterfaces$annotations() {
    }

    public final boolean containsUrl() {
        return this.url != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean getAcceptThirdPartyCookies() {
        return this.acceptThirdPartyCookies;
    }

    public final fi7 getCallJsInterfaceFactory() {
        return this.callJsInterfaceFactory;
    }

    public final boolean getDelayedSpinner() {
        return this.delayedSpinner;
    }

    public final boolean getFitWidth() {
        return this.fitWidth;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getIgnoreDeviceTextSize() {
        return this.ignoreDeviceTextSize;
    }

    public final boolean getIgnoreSslError() {
        return this.ignoreSslError;
    }

    public final boolean getJavaScriptCanOpenWindowsAutomatically() {
        return this.javaScriptCanOpenWindowsAutomatically;
    }

    public final yax getJsPromiseInterface() {
        return this.jsPromiseInterface;
    }

    public final List<String> getJsScripts() {
        return this.jsScripts;
    }

    public final boolean getLocalStorageEnabled() {
        return this.localStorageEnabled;
    }

    public final boolean getMediaPlaybackRequiresUserGesture() {
        return this.mediaPlaybackRequiresUserGesture;
    }

    public final boolean getSupportMultipleWindows() {
        return this.supportMultipleWindows;
    }

    public final String getTargetHost() {
        return this.targetHost;
    }

    public final String getToken(String defaultValue) {
        String str = this.token;
        return str == null ? defaultValue : str;
    }

    public final String getUrl(String defaultValue) {
        String str = this.url;
        return (str == null || evu0.J(str)) ? defaultValue : str;
    }

    public final boolean getUseIntentForNonHttpUrls() {
        return this.useIntentForNonHttpUrls;
    }

    public final List<String> getUserAgentAdditional() {
        return this.userAgentAdditional;
    }

    public final List<sq41> getWebViewJsInterfaces() {
        return this.webViewJsInterfaces;
    }

    /* renamed from: isCompatibleWithMob, reason: from getter */
    public final boolean getIsCompatibleWithMob() {
        return this.isCompatibleWithMob;
    }

    public final void setAcceptThirdPartyCookies(boolean z) {
        this.acceptThirdPartyCookies = z;
    }

    public final void setCompatibleWithMob(boolean z) {
        this.isCompatibleWithMob = z;
    }

    public final void setDelayedSpinner(boolean z) {
        this.delayedSpinner = z;
    }

    public final void setFitWidth(boolean z) {
        this.fitWidth = z;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setIgnoreDeviceTextSize(boolean z) {
        this.ignoreDeviceTextSize = z;
    }

    public final void setIgnoreSslError(boolean z) {
        this.ignoreSslError = z;
    }

    public final void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        this.javaScriptCanOpenWindowsAutomatically = z;
    }

    public final void setJsScripts(List<String> list) {
        this.jsScripts = list;
    }

    public final void setLocalStorageEnabled(boolean z) {
        this.localStorageEnabled = z;
    }

    public final void setMediaPlaybackRequiresUserGesture(boolean z) {
        this.mediaPlaybackRequiresUserGesture = z;
    }

    public final void setSupportMultipleWindows(boolean z) {
        this.supportMultipleWindows = z;
    }

    public final void setTargetHost(String str) {
        this.targetHost = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUseIntentForNonHttpUrls(boolean z) {
        this.useIntentForNonHttpUrls = z;
    }

    public final void setUserAgentAdditional(List<String> list) {
        this.userAgentAdditional = list;
    }

    public final void setWebViewJsInterfaces(List<sq41> list) {
        this.webViewJsInterfaces = list;
    }

    public final boolean shouldUseAuthorizationHeader() {
        String str = this.token;
        return !(str == null || evu0.J(str));
    }

    public final void updateToken(String token) {
        this.token = token;
    }

    public final void updateUrl(String url) {
        this.url = url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.token);
        dest.writeString(this.targetHost);
        dest.writeInt(this.delayedSpinner ? 1 : 0);
        dest.writeInt(this.acceptThirdPartyCookies ? 1 : 0);
        dest.writeInt(this.ignoreSslError ? 1 : 0);
        dest.writeInt(this.localStorageEnabled ? 1 : 0);
        dest.writeInt(this.useIntentForNonHttpUrls ? 1 : 0);
        dest.writeInt(this.fitWidth ? 1 : 0);
        dest.writeInt(this.ignoreDeviceTextSize ? 1 : 0);
        dest.writeInt(this.javaScriptCanOpenWindowsAutomatically ? 1 : 0);
        dest.writeInt(this.mediaPlaybackRequiresUserGesture ? 1 : 0);
        dest.writeInt(this.supportMultipleWindows ? 1 : 0);
        dest.writeStringList(this.userAgentAdditional);
        Iterator x = qv10.x(this.headers, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeStringList(this.jsScripts);
        dest.writeInt(this.isCompatibleWithMob ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<CoreWebViewConfig> {
        @Override // android.os.Parcelable.Creator
        public final CoreWebViewConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z18 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z18 = true;
            } else {
                z = false;
            }
            boolean z19 = parcel.readInt() != 0 ? true : z;
            if (parcel.readInt() != 0) {
                z2 = z19;
                z3 = true;
            } else {
                z2 = z19;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
                z5 = true;
            } else {
                z4 = z2;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
                z7 = true;
            } else {
                z6 = z4;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z8 = z6;
                z9 = true;
            } else {
                z8 = z6;
                z9 = z;
            }
            if (parcel.readInt() != 0) {
                z10 = z8;
                z11 = true;
            } else {
                z10 = z8;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z12 = z10;
                z13 = true;
            } else {
                z12 = z10;
                z13 = z;
            }
            if (parcel.readInt() != 0) {
                z14 = z12;
                z15 = true;
            } else {
                z14 = z12;
                z15 = z;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
                z17 = true;
            } else {
                z16 = z14;
                z17 = z;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            boolean z20 = z16;
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                readString2 = readString2;
                readInt = readInt;
                readString = readString;
            }
            return new CoreWebViewConfig(readString, readString2, readString3, z18, z20, z3, z5, z7, z9, z11, z13, z15, z17, createStringArrayList, linkedHashMap, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CoreWebViewConfig[] newArray(int i) {
            return new CoreWebViewConfig[i];
        }
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ CoreWebViewConfig(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public CoreWebViewConfig(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List<String> list, Map<String, String> map, List<String> list2, boolean z11) {
        this.url = str;
        this.token = str2;
        this.targetHost = str3;
        this.delayedSpinner = z;
        this.acceptThirdPartyCookies = z2;
        this.ignoreSslError = z3;
        this.localStorageEnabled = z4;
        this.useIntentForNonHttpUrls = z5;
        this.fitWidth = z6;
        this.ignoreDeviceTextSize = z7;
        this.javaScriptCanOpenWindowsAutomatically = z8;
        this.mediaPlaybackRequiresUserGesture = z9;
        this.supportMultipleWindows = z10;
        this.userAgentAdditional = list;
        this.headers = map;
        this.jsScripts = list2;
        this.isCompatibleWithMob = z11;
        this.webViewJsInterfaces = EmptyList.a;
    }

    public CoreWebViewConfig() {
        this(null, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131071, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CoreWebViewConfig(a aVar) {
        this(r1, r2, null, r4, r5, r6, r7, r8, aVar.j, aVar.l, false, false, false, r14, r3, aVar.n, aVar.o, HProv.ALG_TYPE_SECURECHANNEL, null);
        String str = aVar.b;
        String str2 = aVar.c;
        boolean z = aVar.e;
        boolean z2 = aVar.f;
        boolean z3 = aVar.g;
        boolean z4 = aVar.h;
        boolean z5 = aVar.i;
        Map map = aVar.d;
        map = map == null ? kotlin.collections.b.f() : map;
        List<sq41> list = EmptyList.a;
        sq41 sq41Var = aVar.a;
        this.webViewJsInterfaces = sq41Var != null ? Collections.singletonList(sq41Var) : list;
        this.jsPromiseInterface = aVar.k;
        this.callJsInterfaceFactory = aVar.m;
    }
}
