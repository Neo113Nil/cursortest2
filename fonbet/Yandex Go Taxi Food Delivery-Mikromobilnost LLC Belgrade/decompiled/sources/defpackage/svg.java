package defpackage;

import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$LogDetails$DebugPanelLogLevel;

/* loaded from: classes2.dex */
public final class svg {
    public final String a;
    public final String b;
    public final String c;
    public final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public svg(String str, String str2, String str3, DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = debugPanelInfoItem$LogDetails$DebugPanelLogLevel;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svg)) {
            return false;
        }
        svg svgVar = (svg) obj;
        return this.a.equals(svgVar.a) && this.b.equals(svgVar.b) && this.c.equals(svgVar.c) && this.d == svgVar.d && this.e.equals(svgVar.e) && this.f.equals(svgVar.f) && this.g.equals(svgVar.g) && this.h.equals(svgVar.h) && this.i.equals(svgVar.i) && this.j.equals(svgVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogDetails(sessionId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", rawLevel=");
        sb.append(this.e);
        sb.append(", message=");
        sb.append(this.f);
        sb.append(", location=");
        sb.append(this.g);
        sb.append(", function=");
        sb.append(this.h);
        sb.append(", thread=");
        sb.append(this.i);
        sb.append(", threadSequence=");
        return b64.p(sb, this.j, ')');
    }
}
