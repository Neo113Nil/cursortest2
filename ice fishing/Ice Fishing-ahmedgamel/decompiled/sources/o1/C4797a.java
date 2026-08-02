package o1;

import G3.e;
import O.C0349t;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.anythink.expressad.video.module.a.a.m;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.W4;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import k1.C4639a;
import n1.C4764a;
import n1.f;
import n1.g;
import n1.j;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC5050e;
import u.C5049d;
import u.C5051f;
import z.i;
import z.n;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4797a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39714a = 3;

    /* renamed from: b, reason: collision with root package name */
    public Object f39715b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39716c;

    public /* synthetic */ C4797a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        i iVar;
        char c9;
        n nVar = new n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e9) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e9);
                } catch (XmlPullParserException e10) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e10);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c10 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c10 = '\t';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c10 = '\b';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f42083d.f42111a = true;
                                    break;
                                case 3:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f42083d.f42126h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42081b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42084e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42083d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42082c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    z.b.a(context, xmlResourceParser, iVar.f42085f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            if (c9 == 0) {
                                ((SparseArray) this.f39716c).put(identifier, nVar);
                                return;
                            } else if (c9 == 1 || c9 == 2 || c9 == 3) {
                                nVar.f42181c.put(Integer.valueOf(iVar.f42080a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f39716c).put(identifier, nVar);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c A[LOOP:0: B:2:0x0004->B:57:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bumptech.glide.manager.n b(C4800d c4800d) {
        Object obj;
        C4639a c4639a;
        String str;
        int i;
        int i4;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            C4798b c4798b = null;
            try {
                W4 w42 = c4800d.f39733D;
                if (w42 == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e9) {
                        e = e9;
                        e = e;
                        obj = null;
                        if (e instanceof SocketTimeoutException) {
                        }
                        str = (String) c4639a.f38564b;
                        C0349t c0349t = c4800d.f39732C;
                        i = c0349t.f2221a;
                        try {
                            g gVar = (g) c4639a.f38565c;
                            i4 = c0349t.f2222b + 1;
                            c0349t.f2222b = i4;
                            c0349t.f2221a = ((int) (i * 1.0f)) + i;
                            if (i4 > 1) {
                            }
                        } catch (g e10) {
                            c4800d.a(str + "-timeout-giveup [timeout=" + i + "]");
                            throw e10;
                        }
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = w42.f29112b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j6 = w42.f29114d;
                    if (j6 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j6)));
                    }
                    map = hashMap;
                }
            } catch (IOException e11) {
                e = e11;
            }
            try {
                C4798b q8 = ((e) this.f39715b).q(c4800d, map);
                try {
                    int i6 = q8.f39718a;
                    List unmodifiableList = Collections.unmodifiableList(q8.f39719b);
                    if (i6 == 304) {
                        SystemClock.elapsedRealtime();
                        return com.bumptech.glide.d.t(c4800d, unmodifiableList);
                    }
                    InputStream inputStream = (InputStream) q8.f39721d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    byte[] w3 = inputStream != null ? com.bumptech.glide.d.w(inputStream, q8.f39720c, (C4798b) this.f39716c) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j.f39639a || elapsedRealtime2 > m.ai) {
                        j.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", c4800d, Long.valueOf(elapsedRealtime2), w3 != null ? Integer.valueOf(w3.length) : "null", Integer.valueOf(i6), Integer.valueOf(c4800d.f39732C.f2222b));
                    }
                    if (i6 < 200 || i6 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new com.bumptech.glide.manager.n(w3, false, unmodifiableList);
                } catch (IOException e12) {
                    e = e12;
                    obj = null;
                    c4798b = q8;
                    if (e instanceof SocketTimeoutException) {
                        c4639a = new C4639a("socket", new C4764a(), 1);
                    } else {
                        boolean z6 = e instanceof MalformedURLException;
                        String str3 = c4800d.f39738u;
                        if (z6) {
                            throw new RuntimeException("Bad URL " + str3, e);
                        }
                        if (c4798b == null) {
                            throw new f(e);
                        }
                        int i9 = c4798b.f39718a;
                        j.c("Unexpected response code %d for %s", Integer.valueOf(i9), str3);
                        if (obj != null) {
                            List<n1.d> unmodifiableList2 = Collections.unmodifiableList(c4798b.f39719b);
                            SystemClock.elapsedRealtime();
                            if (unmodifiableList2 != null) {
                                if (unmodifiableList2.isEmpty()) {
                                    Map map2 = Collections.EMPTY_MAP;
                                } else {
                                    TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                    for (n1.d dVar : unmodifiableList2) {
                                        treeMap.put(dVar.f39626a, dVar.f39627b);
                                    }
                                }
                            }
                            if (unmodifiableList2 != null) {
                                Collections.unmodifiableList(unmodifiableList2);
                            }
                            if (i9 != 401 && i9 != 403) {
                                if (i9 < 400 || i9 > 499) {
                                    throw new C4764a();
                                }
                                throw new n1.c();
                            }
                            c4639a = new C4639a("auth", new C4764a(), 1);
                        } else {
                            c4639a = new C4639a("network", new C4764a(), 1);
                        }
                    }
                    str = (String) c4639a.f38564b;
                    C0349t c0349t2 = c4800d.f39732C;
                    i = c0349t2.f2221a;
                    g gVar2 = (g) c4639a.f38565c;
                    i4 = c0349t2.f2222b + 1;
                    c0349t2.f2222b = i4;
                    c0349t2.f2221a = ((int) (i * 1.0f)) + i;
                    if (i4 > 1) {
                        throw gVar2;
                    }
                    c4800d.a(str + "-retry [timeout=" + i + "]");
                }
            } catch (IOException e13) {
                e = e13;
                e = e;
                obj = null;
                if (e instanceof SocketTimeoutException) {
                }
                str = (String) c4639a.f38564b;
                C0349t c0349t22 = c4800d.f39732C;
                i = c0349t22.f2221a;
                g gVar22 = (g) c4639a.f38565c;
                i4 = c0349t22.f2222b + 1;
                c0349t22.f2222b = i4;
                c0349t22.f2221a = ((int) (i * 1.0f)) + i;
                if (i4 > 1) {
                }
            }
            c4800d.a(str + "-retry [timeout=" + i + "]");
        }
    }

    public String toString() {
        switch (this.f39714a) {
            case 2:
                String str = "[ ";
                if (((C5051f) this.f39715b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder b9 = AbstractC5050e.b(str);
                        b9.append(((C5051f) this.f39715b).f40937A[i]);
                        b9.append(" ");
                        str = b9.toString();
                    }
                }
                StringBuilder c9 = AbstractC5050e.c(str, "] ");
                c9.append((C5051f) this.f39715b);
                return c9.toString();
            default:
                return super.toString();
        }
    }

    public C4797a(C2889Yb c2889Yb, C2889Yb c2889Yb2) {
        this.f39716c = c2889Yb;
        this.f39715b = c2889Yb2;
    }

    public C4797a(C5049d c5049d) {
        this.f39716c = c5049d;
    }

    public C4797a(e eVar) {
        C4798b c4798b = new C4798b();
        this.f39715b = eVar;
        this.f39716c = c4798b;
    }
}
