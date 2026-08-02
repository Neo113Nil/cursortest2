package com.fillr;

import com.fillr.browsersdk.model.FillrWebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class n1 {
    public static n1 _instance;
    public HashMap a;

    public n1(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public static n1 getInstance() {
        if (_instance == null) {
            n1 n1Var = new n1();
            n1Var.a = new HashMap();
            _instance = n1Var;
        }
        return _instance;
    }

    public void a(Node node) {
        Node parentNode = node.getParentNode();
        if (parentNode != null) {
            a(parentNode);
        }
        short nodeType = node.getNodeType();
        if (nodeType == 1 || nodeType == 9) {
            NamedNodeMap attributes = node.getAttributes();
            for (int i = 0; attributes != null && i < attributes.getLength(); i++) {
                Node item = attributes.item(i);
                if ("http://www.w3.org/2000/xmlns/".equals(item.getNamespaceURI())) {
                    String localName = item.getLocalName();
                    if ("xmlns".equals(localName)) {
                        localName = "";
                    }
                    this.a.put(localName, item.getNodeValue());
                }
            }
        }
    }

    public FillrWebView getTrackedWebView(Object obj) {
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            FillrWebView fillrWebView = (FillrWebView) ((Map.Entry) it.next()).getValue();
            if (fillrWebView != null) {
                WeakReference weakReference = fillrWebView.mWebView;
                if ((weakReference != null ? weakReference.get() : null) == obj) {
                    return fillrWebView;
                }
            }
            if (fillrWebView != null && obj != null) {
                WeakReference weakReference2 = fillrWebView.mWebView;
                if (obj.equals(weakReference2 != null ? weakReference2.get() : null)) {
                    return fillrWebView;
                }
            }
        }
    }

    public FillrWebView getWebViewForId(String str) {
        for (Map.Entry entry : this.a.entrySet()) {
            if (((UUID) entry.getKey()).toString().equals(str)) {
                return (FillrWebView) entry.getValue();
            }
        }
        return null;
    }

    public String getWebviewReference(FillrWebView fillrWebView) {
        String str;
        boolean z;
        HashMap hashMap = this.a;
        if (hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                FillrWebView fillrWebView2 = (FillrWebView) entry.getValue();
                if (fillrWebView2 != null && fillrWebView2.equals(fillrWebView)) {
                    str = ((UUID) entry.getKey()).toString();
                    hashMap.put((UUID) entry.getKey(), fillrWebView);
                    z = true;
                    break;
                }
            }
        }
        str = null;
        z = false;
        if (z) {
            return str;
        }
        UUID randomUUID = UUID.randomUUID();
        hashMap.put(randomUUID, fillrWebView);
        return randomUUID.toString();
    }

    public n1(HashMap hashMap) {
        this.a = hashMap;
    }
}
