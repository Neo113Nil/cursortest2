package com.fillr;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.NamespaceContext;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class l implements Serializable, NamespaceContext {
    public static final List b = Collections.singletonList("xml");
    public static final List c = Collections.singletonList("xmlns");
    public static final boolean d;
    public final HashMap a;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("org.w3c.dom.UserDataHandler", false, Node.class.getClassLoader());
            Node.class.getMethod("getUserData", String.class);
            Node.class.getMethod("setUserData", String.class, Object.class, cls);
            z = true;
        } catch (Throwable unused) {
        }
        d = z;
    }

    public l(HashMap hashMap) {
        this.a = hashMap;
    }

    public static String a(String str, Element element) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        if (d) {
            if ("".equals(str)) {
                str = null;
            }
            return element.lookupNamespaceURI(str);
        }
        HashMap hashMap = new HashMap();
        new n1(hashMap).a(element);
        return new l(hashMap).getNamespaceURI(str);
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getNamespaceURI(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The prefix must not be null.");
            return null;
        }
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        String str2 = (String) this.a.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getPrefix(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The namespace URI must not be null.");
            return null;
        }
        if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
            return "xml";
        }
        if ("http://www.w3.org/2000/xmlns/".equals(str)) {
            return "xmlns";
        }
        for (Map.Entry entry : this.a.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final Iterator getPrefixes(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The namespace URI must not be null.");
            return null;
        }
        if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
            return b.iterator();
        }
        if ("http://www.w3.org/2000/xmlns/".equals(str)) {
            return c.iterator();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (str.equals(entry.getValue())) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.iterator();
    }
}
