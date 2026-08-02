package defpackage;

import flex.engine.section.model.ScrollPosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class u5q0 extends z5q0 {
    public final String a;
    public final ScrollPosition b;
    public final int c;
    public final boolean d;

    public u5q0(String str, ScrollPosition scrollPosition, int i, boolean z) {
        this.a = str;
        this.b = scrollPosition;
        this.c = i;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final ScrollPosition d() {
        return this.b;
    }

    public final String toString() {
        return "ScrollToItem(focusId=" + this.a + ", scrollPosition=" + this.b + ", offset=" + this.c + ", animated=" + this.d + Extension.C_BRAKE;
    }
}
