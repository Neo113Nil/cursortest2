package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ai extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9251a = "InLine";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9252b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9253c = "AdTitle";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9254d = "Description";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9255e = "Advertiser";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9256f = "Pricing";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9257g = "Survey";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9258h = "Error";
    private static final String i = "Impression";

    /* renamed from: j, reason: collision with root package name */
    private static final String f9259j = "Creatives";

    /* renamed from: k, reason: collision with root package name */
    private static final String f9260k = "Extensions";

    /* renamed from: l, reason: collision with root package name */
    private static final String f9261l = "AdVerifications";

    /* renamed from: m, reason: collision with root package name */
    private c f9262m;

    /* renamed from: n, reason: collision with root package name */
    private d f9263n;

    /* renamed from: o, reason: collision with root package name */
    private u f9264o;

    /* renamed from: p, reason: collision with root package name */
    private f f9265p;

    /* renamed from: q, reason: collision with root package name */
    private aq f9266q;

    /* renamed from: r, reason: collision with root package name */
    private as f9267r;

    /* renamed from: s, reason: collision with root package name */
    private w f9268s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<ah> f9269t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<p> f9270u;

    /* renamed from: v, reason: collision with root package name */
    private y f9271v;

    /* renamed from: w, reason: collision with root package name */
    private e f9272w;

    public ai(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9251a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9252b)) {
                    xmlPullParser.require(2, null, f9252b);
                    this.f9262m = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f9252b);
                } else if (name != null && name.equals(f9253c)) {
                    xmlPullParser.require(2, null, f9253c);
                    this.f9263n = new d(xmlPullParser);
                    xmlPullParser.require(3, null, f9253c);
                } else if (name != null && name.equals(f9254d)) {
                    xmlPullParser.require(2, null, f9254d);
                    this.f9264o = new u(xmlPullParser);
                    xmlPullParser.require(3, null, f9254d);
                } else if (name != null && name.equals(f9255e)) {
                    xmlPullParser.require(2, null, f9255e);
                    this.f9265p = new f(xmlPullParser);
                    xmlPullParser.require(3, null, f9255e);
                } else if (name != null && name.equals(f9256f)) {
                    xmlPullParser.require(2, null, f9256f);
                    this.f9266q = new aq(xmlPullParser);
                    xmlPullParser.require(3, null, f9256f);
                } else if (name != null && name.equals(f9257g)) {
                    xmlPullParser.require(2, null, f9257g);
                    this.f9267r = new as(xmlPullParser);
                    xmlPullParser.require(3, null, f9257g);
                } else if (name != null && name.equals(f9258h)) {
                    xmlPullParser.require(2, null, f9258h);
                    this.f9268s = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9258h);
                } else if (name != null && name.equals(i)) {
                    if (this.f9269t == null) {
                        this.f9269t = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, i);
                    this.f9269t.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, i);
                } else if (name != null && name.equals(f9259j)) {
                    xmlPullParser.require(2, null, f9259j);
                    this.f9270u = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9259j);
                } else if (name != null && name.equals(f9260k)) {
                    xmlPullParser.require(2, null, f9260k);
                    this.f9271v = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f9260k);
                } else if (name == null || !name.equals(f9261l)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9261l);
                    this.f9272w = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f9261l);
                }
            }
        }
    }

    private c h() {
        return this.f9262m;
    }

    private f i() {
        return this.f9265p;
    }

    private aq j() {
        return this.f9266q;
    }

    private as k() {
        return this.f9267r;
    }

    public final d a() {
        return this.f9263n;
    }

    public final u b() {
        return this.f9264o;
    }

    public final w c() {
        return this.f9268s;
    }

    public final ArrayList<ah> d() {
        return this.f9269t;
    }

    public final ArrayList<p> e() {
        return this.f9270u;
    }

    public final y f() {
        return this.f9271v;
    }

    public final e g() {
        return this.f9272w;
    }

    private void a(ArrayList<p> arrayList) {
        this.f9270u = arrayList;
    }
}
