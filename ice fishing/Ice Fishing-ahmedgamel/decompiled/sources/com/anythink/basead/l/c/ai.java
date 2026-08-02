package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ai extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10037a = "InLine";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10038b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10039c = "AdTitle";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10040d = "Description";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10041e = "Advertiser";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10042f = "Pricing";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10043g = "Survey";

    /* renamed from: h, reason: collision with root package name */
    private static final String f10044h = "Error";
    private static final String i = "Impression";

    /* renamed from: j, reason: collision with root package name */
    private static final String f10045j = "Creatives";

    /* renamed from: k, reason: collision with root package name */
    private static final String f10046k = "Extensions";

    /* renamed from: l, reason: collision with root package name */
    private static final String f10047l = "AdVerifications";

    /* renamed from: m, reason: collision with root package name */
    private c f10048m;

    /* renamed from: n, reason: collision with root package name */
    private d f10049n;

    /* renamed from: o, reason: collision with root package name */
    private u f10050o;

    /* renamed from: p, reason: collision with root package name */
    private f f10051p;

    /* renamed from: q, reason: collision with root package name */
    private aq f10052q;

    /* renamed from: r, reason: collision with root package name */
    private as f10053r;

    /* renamed from: s, reason: collision with root package name */
    private w f10054s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<ah> f10055t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<p> f10056u;

    /* renamed from: v, reason: collision with root package name */
    private y f10057v;

    /* renamed from: w, reason: collision with root package name */
    private e f10058w;

    public ai(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10037a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10038b)) {
                    xmlPullParser.require(2, null, f10038b);
                    this.f10048m = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f10038b);
                } else if (name != null && name.equals(f10039c)) {
                    xmlPullParser.require(2, null, f10039c);
                    this.f10049n = new d(xmlPullParser);
                    xmlPullParser.require(3, null, f10039c);
                } else if (name != null && name.equals(f10040d)) {
                    xmlPullParser.require(2, null, f10040d);
                    this.f10050o = new u(xmlPullParser);
                    xmlPullParser.require(3, null, f10040d);
                } else if (name != null && name.equals(f10041e)) {
                    xmlPullParser.require(2, null, f10041e);
                    this.f10051p = new f(xmlPullParser);
                    xmlPullParser.require(3, null, f10041e);
                } else if (name != null && name.equals(f10042f)) {
                    xmlPullParser.require(2, null, f10042f);
                    this.f10052q = new aq(xmlPullParser);
                    xmlPullParser.require(3, null, f10042f);
                } else if (name != null && name.equals(f10043g)) {
                    xmlPullParser.require(2, null, f10043g);
                    this.f10053r = new as(xmlPullParser);
                    xmlPullParser.require(3, null, f10043g);
                } else if (name != null && name.equals(f10044h)) {
                    xmlPullParser.require(2, null, f10044h);
                    this.f10054s = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f10044h);
                } else if (name != null && name.equals(i)) {
                    if (this.f10055t == null) {
                        this.f10055t = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, i);
                    this.f10055t.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, i);
                } else if (name != null && name.equals(f10045j)) {
                    xmlPullParser.require(2, null, f10045j);
                    this.f10056u = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10045j);
                } else if (name != null && name.equals(f10046k)) {
                    xmlPullParser.require(2, null, f10046k);
                    this.f10057v = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f10046k);
                } else if (name == null || !name.equals(f10047l)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10047l);
                    this.f10058w = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f10047l);
                }
            }
        }
    }

    private c h() {
        return this.f10048m;
    }

    private f i() {
        return this.f10051p;
    }

    private aq j() {
        return this.f10052q;
    }

    private as k() {
        return this.f10053r;
    }

    public final d a() {
        return this.f10049n;
    }

    public final u b() {
        return this.f10050o;
    }

    public final w c() {
        return this.f10054s;
    }

    public final ArrayList<ah> d() {
        return this.f10055t;
    }

    public final ArrayList<p> e() {
        return this.f10056u;
    }

    public final y f() {
        return this.f10057v;
    }

    public final e g() {
        return this.f10058w;
    }

    private void a(ArrayList<p> arrayList) {
        this.f10056u = arrayList;
    }
}
