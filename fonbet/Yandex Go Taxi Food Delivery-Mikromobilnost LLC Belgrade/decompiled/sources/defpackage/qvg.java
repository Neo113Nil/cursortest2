package defpackage;

import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;

/* loaded from: classes2.dex */
public final class qvg {
    public final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey a;
    public final String b;

    public qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey, String str) {
        this.a = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;
        this.b = str;
        debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvg)) {
            return false;
        }
        qvg qvgVar = (qvg) obj;
        return this.a == qvgVar.a && jl40.l(this.b, qvgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugPanelGeneralInfo(key=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
