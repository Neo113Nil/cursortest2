package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public abstract class zfu0 {

    public static final class a extends zfu0 {
        @Override // defpackage.zfu0
        public final void a(ArrayList arrayList) {
        }

        @Override // defpackage.zfu0
        public final Address b() {
            return PlainAddress.a;
        }

        @Override // defpackage.zfu0
        public final boolean c() {
            return true;
        }

        @Override // defpackage.zfu0
        public final boolean d() {
            return false;
        }

        @Override // defpackage.zfu0
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.zfu0
        public final String f() {
            return "";
        }

        @Override // defpackage.zfu0
        public final String g() {
            return "";
        }

        @Override // defpackage.zfu0
        public final String h() {
            return "";
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public static final class b extends zfu0 {
        @Override // defpackage.zfu0
        public final void a(ArrayList arrayList) {
        }

        @Override // defpackage.zfu0
        public final Address b() {
            return PlainAddress.a;
        }

        @Override // defpackage.zfu0
        public final boolean c() {
            return false;
        }

        @Override // defpackage.zfu0
        public final boolean d() {
            return true;
        }

        @Override // defpackage.zfu0
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        @Override // defpackage.zfu0
        public final String f() {
            return null;
        }

        @Override // defpackage.zfu0
        public final String g() {
            return null;
        }

        @Override // defpackage.zfu0
        public final String h() {
            return null;
        }

        public final int hashCode() {
            return b.class.hashCode();
        }
    }

    public abstract void a(ArrayList arrayList);

    public abstract Address b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract String f();

    public abstract String g();

    public abstract String h();
}
