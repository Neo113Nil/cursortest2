package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class e extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10180a = "Verification";

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<ba> f10181b = new ArrayList<>();

    public e(XmlPullParser xmlPullParser) {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10180a)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10180a);
                    this.f10181b.add(new ba(xmlPullParser));
                    xmlPullParser.require(3, null, f10180a);
                }
            }
        }
    }

    private ArrayList<ba> a() {
        return this.f10181b;
    }
}
