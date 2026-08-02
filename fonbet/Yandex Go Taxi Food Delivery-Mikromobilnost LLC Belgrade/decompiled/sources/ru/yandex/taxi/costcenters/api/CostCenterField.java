package ru.yandex.taxi.costcenters.api;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwe;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.m3e;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/costcenters/api/CostCenterField;", "", "Companion", "a", "InputFormat", "ru/yandex/taxi/costcenters/api/a", "iwe", "go-client-android.features.cost_center:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CostCenterField {
    public static final iwe Companion = new iwe();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final InputFormat e;
    public final List f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/costcenters/api/CostCenterField$InputFormat;", "", "Companion", "ru/yandex/taxi/costcenters/api/d", BaseDatabaseHelper.TYPE_TEXT, "MIXED", "SELECT", "go-client-android.features.cost_center:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class InputFormat {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InputFormat[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final InputFormat MIXED;
        public static final InputFormat SELECT;
        public static final InputFormat TEXT;

        static {
            InputFormat inputFormat = new InputFormat(BaseDatabaseHelper.TYPE_TEXT, 0);
            TEXT = inputFormat;
            InputFormat inputFormat2 = new InputFormat("MIXED", 1);
            MIXED = inputFormat2;
            InputFormat inputFormat3 = new InputFormat("SELECT", 2);
            SELECT = inputFormat3;
            InputFormat[] inputFormatArr = {inputFormat, inputFormat2, inputFormat3};
            $VALUES = inputFormatArr;
            $ENTRIES = kotlin.enums.a.a(inputFormatArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(29));
        }

        public static InputFormat valueOf(String str) {
            return (InputFormat) Enum.valueOf(InputFormat.class, str);
        }

        public static InputFormat[] values() {
            return (InputFormat[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new m3e(26)), null, kotlin.a.b(lazyThreadSafetyMode, new m3e(27)), kotlin.a.b(lazyThreadSafetyMode, new m3e(28))};
    }

    public /* synthetic */ CostCenterField(int i, String str, String str2, List list, boolean z, InputFormat inputFormat, List list2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = InputFormat.MIXED;
        } else {
            this.e = inputFormat;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final List getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostCenterField)) {
            return false;
        }
        CostCenterField costCenterField = (CostCenterField) obj;
        return jl40.l(this.a, costCenterField.a) && jl40.l(this.b, costCenterField.b) && jl40.l(this.c, costCenterField.c) && this.d == costCenterField.d && this.e == costCenterField.e && jl40.l(this.f, costCenterField.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CostCenterField(fieldId=", this.a, ", title=", this.b, ", orderFlows=");
        nzs.p(v, this.c, ", isRequired=", this.d, ", format=");
        v.append(this.e);
        v.append(", items=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/costcenters/api/CostCenterField$a;", "", "Companion", "ru/yandex/taxi/costcenters/api/b", "ru/yandex/taxi/costcenters/api/c", "go-client-android.features.cost_center:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("CostCenterItem(name=", this.a, Extension.C_BRAKE);
        }

        public a(String str) {
            this.a = str;
        }

        public a() {
            this("");
        }
    }

    public CostCenterField() {
        this(false, null, null, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, kotlin.collections.EmptyList] */
    public CostCenterField(boolean z, InputFormat inputFormat, ArrayList arrayList, int i) {
        z = (i & 8) != 0 ? false : z;
        inputFormat = (i & 16) != 0 ? InputFormat.MIXED : inputFormat;
        int i2 = i & 32;
        ?? r0 = EmptyList.a;
        arrayList = i2 != 0 ? r0 : arrayList;
        this.a = "";
        this.b = "";
        this.c = r0;
        this.d = z;
        this.e = inputFormat;
        this.f = arrayList;
    }
}
