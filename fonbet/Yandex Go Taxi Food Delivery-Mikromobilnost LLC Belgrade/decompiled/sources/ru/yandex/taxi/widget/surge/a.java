package ru.yandex.taxi.widget.surge;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tlu;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a {
    public final List a;
    public final tlu b;
    public final C0123a c;

    public /* synthetic */ a(int i) {
        this(EmptyList.a, null, new C0123a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tlu tluVar = this.b;
        return this.c.a.hashCode() + ((hashCode + (tluVar == null ? 0 : tluVar.hashCode())) * 31);
    }

    public final String toString() {
        return "HistoryChartState(bars=" + this.a + ", currentValue=" + this.b + ", accessibility=" + this.c + Extension.C_BRAKE;
    }

    /* renamed from: ru.yandex.taxi.widget.surge.a$a, reason: collision with other inner class name */
    public static final class C0123a {
        public final String a;

        public C0123a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0123a) && jl40.l(this.a, ((C0123a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Accessibility(label=", this.a, Extension.C_BRAKE);
        }

        public C0123a() {
            this(0);
        }

        public /* synthetic */ C0123a(int i) {
            this("");
        }
    }

    public a(List list, tlu tluVar, C0123a c0123a) {
        this.a = list;
        this.b = tluVar;
        this.c = c0123a;
    }

    public a() {
        this(0);
    }
}
