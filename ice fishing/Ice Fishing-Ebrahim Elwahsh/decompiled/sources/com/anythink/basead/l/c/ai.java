package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ai extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9408a = "InLine";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9409b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9410c = "AdTitle";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9411d = "Description";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9412e = "Advertiser";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9413f = "Pricing";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9414g = "Survey";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9415h = "Error";
    private static final String i = "Impression";

    /* renamed from: j, reason: collision with root package name */
    private static final String f9416j = "Creatives";

    /* renamed from: k, reason: collision with root package name */
    private static final String f9417k = "Extensions";

    /* renamed from: l, reason: collision with root package name */
    private static final String f9418l = "AdVerifications";

    /* renamed from: m, reason: collision with root package name */
    private c f9419m;

    /* renamed from: n, reason: collision with root package name */
    private d f9420n;

    /* renamed from: o, reason: collision with root package name */
    private u f9421o;

    /* renamed from: p, reason: collision with root package name */
    private f f9422p;

    /* renamed from: q, reason: collision with root package name */
    private aq f9423q;

    /* renamed from: r, reason: collision with root package name */
    private as f9424r;

    /* renamed from: s, reason: collision with root package name */
    private w f9425s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<ah> f9426t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<p> f9427u;

    /* renamed from: v, reason: collision with root package name */
    private y f9428v;

    /* renamed from: w, reason: collision with root package name */
    private e f9429w;

    public ai(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9408a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9409b)) {
                    xmlPullParser.require(2, null, f9409b);
                    this.f9419m = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f9409b);
                } else if (name != null && name.equals(f9410c)) {
                    xmlPullParser.require(2, null, f9410c);
                    this.f9420n = new d(xmlPullParser);
                    xmlPullParser.require(3, null, f9410c);
                } else if (name != null && name.equals(f9411d)) {
                    xmlPullParser.require(2, null, f9411d);
                    this.f9421o = new u(xmlPullParser);
                    xmlPullParser.require(3, null, f9411d);
                } else if (name != null && name.equals(f9412e)) {
                    xmlPullParser.require(2, null, f9412e);
                    this.f9422p = new f(xmlPullParser);
                    xmlPullParser.require(3, null, f9412e);
                } else if (name != null && name.equals(f9413f)) {
                    xmlPullParser.require(2, null, f9413f);
                    this.f9423q = new aq(xmlPullParser);
                    xmlPullParser.require(3, null, f9413f);
                } else if (name != null && name.equals(f9414g)) {
                    xmlPullParser.require(2, null, f9414g);
                    this.f9424r = new as(xmlPullParser);
                    xmlPullParser.require(3, null, f9414g);
                } else if (name != null && name.equals(f9415h)) {
                    xmlPullParser.require(2, null, f9415h);
                    this.f9425s = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9415h);
                } else if (name != null && name.equals(i)) {
                    if (this.f9426t == null) {
                        this.f9426t = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, i);
                    this.f9426t.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, i);
                } else if (name != null && name.equals(f9416j)) {
                    xmlPullParser.require(2, null, f9416j);
                    this.f9427u = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9416j);
                } else if (name != null && name.equals(f9417k)) {
                    xmlPullParser.require(2, null, f9417k);
                    this.f9428v = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f9417k);
                } else if (name == null || !name.equals(f9418l)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9418l);
                    this.f9429w = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f9418l);
                }
            }
        }
    }

    private c h() {
        return this.f9419m;
    }

    private f i() {
        return this.f9422p;
    }

    private aq j() {
        return this.f9423q;
    }

    private as k() {
        return this.f9424r;
    }

    public final d a() {
        return this.f9420n;
    }

    public final u b() {
        return this.f9421o;
    }

    public final w c() {
        return this.f9425s;
    }

    public final ArrayList<ah> d() {
        return this.f9426t;
    }

    public final ArrayList<p> e() {
        return this.f9427u;
    }

    public final y f() {
        return this.f9428v;
    }

    public final e g() {
        return this.f9429w;
    }

    private void a(ArrayList<p> arrayList) {
        this.f9427u = arrayList;
    }
}
