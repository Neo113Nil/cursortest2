package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class av extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9338a = "VAST";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9339b = "Error";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9340c = "Ad";

    /* renamed from: d, reason: collision with root package name */
    private w f9341d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<a> f9342e;

    /* renamed from: f, reason: collision with root package name */
    private String f9343f;

    public av(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9338a);
        this.f9343f = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9339b)) {
                    xmlPullParser.require(2, null, f9339b);
                    this.f9341d = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9339b);
                } else if (name == null || !name.equals(f9340c)) {
                    ay.b(xmlPullParser);
                } else {
                    if (this.f9342e == null) {
                        this.f9342e = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f9340c);
                    this.f9342e.add(new a(xmlPullParser));
                    xmlPullParser.require(3, null, f9340c);
                }
            }
        }
    }

    private w b() {
        return this.f9341d;
    }

    private String c() {
        return this.f9343f;
    }

    public final ArrayList<a> a() {
        return this.f9342e;
    }
}
