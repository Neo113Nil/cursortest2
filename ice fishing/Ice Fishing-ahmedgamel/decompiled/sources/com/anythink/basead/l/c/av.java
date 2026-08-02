package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class av extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10124a = "VAST";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10125b = "Error";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10126c = "Ad";

    /* renamed from: d, reason: collision with root package name */
    private w f10127d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<a> f10128e;

    /* renamed from: f, reason: collision with root package name */
    private String f10129f;

    public av(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10124a);
        this.f10129f = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10125b)) {
                    xmlPullParser.require(2, null, f10125b);
                    this.f10127d = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f10125b);
                } else if (name == null || !name.equals(f10126c)) {
                    ay.b(xmlPullParser);
                } else {
                    if (this.f10128e == null) {
                        this.f10128e = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f10126c);
                    this.f10128e.add(new a(xmlPullParser));
                    xmlPullParser.require(3, null, f10126c);
                }
            }
        }
    }

    private w b() {
        return this.f10127d;
    }

    private String c() {
        return this.f10129f;
    }

    public final ArrayList<a> a() {
        return this.f10128e;
    }
}
