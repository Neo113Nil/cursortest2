package com.anythink.basead.mraid;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    Context f10393a;

    /* renamed from: c, reason: collision with root package name */
    MraidBaseWebView f10395c;

    /* renamed from: d, reason: collision with root package name */
    protected Pattern f10396d;

    /* renamed from: e, reason: collision with root package name */
    protected String f10397e;

    /* renamed from: f, reason: collision with root package name */
    List<String> f10398f = new ArrayList(Arrays.asList("open", com.anythink.expressad.foundation.d.d.cs, "unload", "useCustomClose", "expand"));

    /* renamed from: b, reason: collision with root package name */
    Handler f10394b = new Handler(Looper.getMainLooper(), this);

    /* renamed from: com.anythink.basead.mraid.a$a, reason: collision with other inner class name */
    public class C0044a {

        /* renamed from: a, reason: collision with root package name */
        public Object f10399a;

        /* renamed from: b, reason: collision with root package name */
        public String f10400b;

        /* renamed from: c, reason: collision with root package name */
        public String f10401c;

        /* renamed from: d, reason: collision with root package name */
        public String f10402d;

        /* renamed from: e, reason: collision with root package name */
        public String f10403e;

        /* renamed from: f, reason: collision with root package name */
        public String f10404f;

        public C0044a() {
        }
    }

    public a(Context context) {
        this.f10393a = context;
    }

    private void a(Pattern pattern) {
        this.f10396d = pattern;
    }

    private void c(String str) {
        this.f10397e = str;
    }

    private C0044a d(String str) {
        Set<String> unmodifiableSet;
        if (str == null) {
            return null;
        }
        C0044a c0044a = new C0044a();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(com.anythink.expressad.foundation.d.d.f19381s)) {
            return null;
        }
        String host = parse.getHost();
        c0044a.f10401c = host;
        if (!this.f10398f.contains(host) && this.f10395c != null) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f10395c, host);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f10395c, host, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : unmodifiableSet) {
                jSONObject.put(str2, parse.getQueryParameter(str2));
            }
            c0044a.f10402d = jSONObject.toString();
            return c0044a;
        } catch (Exception e9) {
            e9.printStackTrace();
            return c0044a;
        }
    }

    public final void b(String str) {
        C0044a d9;
        Object jsObject;
        char c9;
        if (TextUtils.isEmpty(str) || (d9 = d(str)) == null || (jsObject = this.f10395c.getJsObject(d9.f10400b)) == null || !(jsObject instanceof h)) {
            return;
        }
        try {
            String str2 = d9.f10401c;
            switch (str2.hashCode()) {
                case -1289167206:
                    if (str2.equals("expand")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -840442113:
                    if (str2.equals("unload")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3417674:
                    if (str2.equals("open")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 94756344:
                    if (str2.equals(com.anythink.expressad.foundation.d.d.cs)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1614272768:
                    if (str2.equals("useCustomClose")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            String str3 = "{}";
            if (c9 == 0) {
                h hVar = (h) jsObject;
                if (!TextUtils.isEmpty(d9.f10402d)) {
                    str3 = d9.f10402d;
                }
                hVar.a(str3);
                return;
            }
            if (c9 == 1) {
                TextUtils.isEmpty(d9.f10402d);
                ((h) jsObject).a();
                return;
            }
            if (c9 == 2) {
                TextUtils.isEmpty(d9.f10402d);
                ((h) jsObject).b();
                return;
            }
            if (c9 == 3) {
                h hVar2 = (h) jsObject;
                if (!TextUtils.isEmpty(d9.f10402d)) {
                    str3 = d9.f10402d;
                }
                hVar2.b(str3);
                return;
            }
            if (c9 != 4) {
                return;
            }
            h hVar3 = (h) jsObject;
            if (!TextUtils.isEmpty(d9.f10402d)) {
                str3 = d9.f10402d;
            }
            hVar3.c(str3);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    private void a(MraidBaseWebView mraidBaseWebView) {
        this.f10395c = mraidBaseWebView;
    }

    public final boolean a(String str) {
        if (!com.anythink.core.express.d.d.a(str)) {
            return false;
        }
        this.f10396d = com.anythink.core.express.d.d.b(str);
        this.f10397e = str;
        return true;
    }

    private String a() {
        return this.f10397e;
    }

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private void a(C0044a c0044a) {
        char c9;
        Object jsObject = this.f10395c.getJsObject(c0044a.f10400b);
        if (jsObject != null && (jsObject instanceof h)) {
            try {
                String str = c0044a.f10401c;
                switch (str.hashCode()) {
                    case -1289167206:
                        if (str.equals("expand")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -840442113:
                        if (str.equals("unload")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 3417674:
                        if (str.equals("open")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 94756344:
                        if (str.equals(com.anythink.expressad.foundation.d.d.cs)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1614272768:
                        if (str.equals("useCustomClose")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                String str2 = "{}";
                if (c9 == 0) {
                    h hVar = (h) jsObject;
                    if (!TextUtils.isEmpty(c0044a.f10402d)) {
                        str2 = c0044a.f10402d;
                    }
                    hVar.a(str2);
                    return;
                }
                if (c9 == 1) {
                    TextUtils.isEmpty(c0044a.f10402d);
                    ((h) jsObject).a();
                    return;
                }
                if (c9 == 2) {
                    TextUtils.isEmpty(c0044a.f10402d);
                    ((h) jsObject).b();
                    return;
                }
                if (c9 == 3) {
                    h hVar2 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0044a.f10402d)) {
                        str2 = c0044a.f10402d;
                    }
                    hVar2.b(str2);
                    return;
                }
                if (c9 != 4) {
                    return;
                }
                h hVar3 = (h) jsObject;
                if (!TextUtils.isEmpty(c0044a.f10402d)) {
                    str2 = c0044a.f10402d;
                }
                hVar3.c(str2);
            } catch (Throwable unused) {
            }
        }
    }
}
