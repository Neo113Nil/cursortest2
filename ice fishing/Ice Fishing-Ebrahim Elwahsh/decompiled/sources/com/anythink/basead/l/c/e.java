package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class e extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9551a = "Verification";

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<ba> f9552b = new ArrayList<>();

    public e(XmlPullParser xmlPullParser) {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9551a)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9551a);
                    this.f9552b.add(new ba(xmlPullParser));
                    xmlPullParser.require(3, null, f9551a);
                }
            }
        }
    }

    private ArrayList<ba> a() {
        return this.f9552b;
    }
}
