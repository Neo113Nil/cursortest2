package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.quasar.glagol.State;

/* loaded from: classes3.dex */
public final class egd extends ggd {
    public final String a;
    public final v68 b;
    public final List c;
    public final int d;
    public final String e;
    public final State f;
    public final unl g;
    public final boolean h;

    public egd(String str, v68 v68Var, List list, int i, String str2, State state, unl unlVar) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = v68Var;
        this.c = list;
        this.d = i;
        this.e = str2;
        this.f = state;
        this.g = unlVar;
        hgd[] hgdVarArr = hgd.a;
        this.h = list.contains("muzpult");
    }

    @Override // defpackage.ggd
    public final String a() {
        String deviceId = this.b.getDeviceId();
        deviceId.getClass();
        return deviceId;
    }

    @Override // defpackage.ggd
    public final String b() {
        String name = this.b.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.ggd
    public final String c() {
        return this.b.getPlatform();
    }

    @Override // defpackage.ggd
    public final boolean d() {
        return this.b.isAccessible();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egd)) {
            return false;
        }
        egd egdVar = (egd) obj;
        return Intrinsics.d(this.a, egdVar.a) && this.b.equals(egdVar.b) && Intrinsics.d(this.c, egdVar.c) && this.d == egdVar.d && this.e.equals(egdVar.e) && this.f.equals(egdVar.f) && Intrinsics.d(this.g, egdVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + k5r.c(f1d.a(this.d, k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e)) * 31;
        unl unlVar = this.g;
        return hashCode + (unlVar == null ? 0 : unlVar.hashCode());
    }

    public final String toString() {
        String str;
        v68 v68Var = this.b;
        String platform = v68Var.getPlatform();
        if (platform != null) {
            String lowerCase = platform.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            str = c.k(lowerCase);
        } else {
            str = "GlagolDevice";
        }
        String deviceId = v68Var.getDeviceId();
        deviceId.getClass();
        boolean z = false;
        unl unlVar = this.g;
        if (unlVar != null && unlVar.hasPause()) {
            z = true;
        }
        Long timeSinceLastVoiceActivity = this.f.getTimeSinceLastVoiceActivity();
        long longValue = timeSinceLastVoiceActivity != null ? timeSinceLastVoiceActivity.longValue() : Long.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(id=");
        sb.append(deviceId);
        sb.append(", playing=");
        sb.append(z);
        sb.append(", muzpult=");
        sb.append(this.h);
        sb.append(", active=");
        return hrg.m(longValue, "s)", sb);
    }
}
