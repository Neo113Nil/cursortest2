package com.anythink.expressad.atsignalcommon.windvane;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class MvBridge extends AbsFeedBackForH5 {
    public void getDeviceInfo(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello fail");
            f.a().b(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void getTitle(Object obj, String str) {
        b bVar = (b) obj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello succ");
            f.a().a(obj, jSONObject.toString());
            f.a().a(bVar, "receiveMessage", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void openWindow(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello succ");
            f.a().a(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }
}
