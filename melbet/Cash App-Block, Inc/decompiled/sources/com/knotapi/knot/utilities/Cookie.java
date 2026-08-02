package com.knotapi.knot.utilities;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Cookie {
    public static final String TAG = "Knot:Cookie";
    public String domain;
    public double expires;
    public boolean httpOnly;
    public boolean isSecure;
    public String name;
    public String path;
    public String value;

    public Cookie(String str, String str2, String str3, String str4, double d, boolean z, boolean z2) {
        this.name = str;
        this.value = str2;
        this.path = str3;
        this.domain = str4;
        this.expires = d;
        this.isSecure = z;
        this.httpOnly = z2;
    }

    public static Cookie buildCookie(String str, String str2) {
        String[] split = str.split("=", 2);
        String str3 = null;
        if (split.length != 2) {
            return null;
        }
        String trim = split[0].trim();
        String[] split2 = split[1].split(";");
        String trim2 = split2[0].trim();
        boolean z = false;
        boolean z2 = false;
        for (int i = 1; i < split2.length; i++) {
            String lowerCase = split2[i].trim().toLowerCase();
            if (lowerCase.startsWith("domain=")) {
                str3 = lowerCase.substring(7).trim();
                if (str3.startsWith(".")) {
                    str3 = str3.substring(1);
                }
            } else if (lowerCase.startsWith("path=")) {
                lowerCase.substring(5);
            } else if (lowerCase.equals("secure")) {
                z = true;
            } else if (lowerCase.equals("httponly")) {
                z2 = true;
            }
        }
        if (str3 == null) {
            str3 = Helper.getDomain(str2);
        }
        Calendar.getInstance().add(5, 7);
        return new Cookie(trim, trim2, "/", str3, r12.getTime().getTime(), z, z2);
    }

    public static List<Cookie> mergeAll(List<Cookie> list, List<Cookie> list2) {
        try {
            for (Cookie cookie : list2) {
                Iterator<Cookie> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        list.add(cookie);
                        break;
                    }
                    if (it.next().equals(cookie)) {
                        list.set(i, cookie);
                        break;
                    }
                    i++;
                }
            }
            return (List) list.stream().distinct().collect(Collectors.toList());
        } catch (Exception unused) {
            return list;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Cookie cookie = (Cookie) obj;
            if (Objects.equals(this.name, cookie.getName()) && Objects.equals(this.domain, cookie.getDomain()) && Objects.equals(this.path, cookie.getPath())) {
                return true;
            }
        }
        return false;
    }

    public String getDomain() {
        return this.domain;
    }

    public double getExpires() {
        return this.expires;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.domain, this.path);
    }

    public boolean isHttpOnly() {
        return this.httpOnly;
    }

    public boolean isSecure() {
        return this.isSecure;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExpires(double d) {
        this.expires = d;
    }

    public void setHttpOnly(boolean z) {
        this.httpOnly = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSecure(boolean z) {
        this.isSecure = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put("value", this.value);
            jSONObject.put("domain", this.domain);
            jSONObject.put("path", this.path);
            jSONObject.put("secure", this.isSecure);
            jSONObject.put("httpOnly", this.httpOnly);
            jSONObject.put("expires", this.expires);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toString() {
        return "Name: " + this.name + ", Domain: " + this.domain + ", Path: " + this.path + ", Value: " + this.value;
    }
}
