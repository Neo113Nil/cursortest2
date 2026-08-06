package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import java.util.Arrays;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3777a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3778b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3779c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3780d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f3781a;

        /* renamed from: b, reason: collision with root package name */
        private String f3782b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f3783c;

        /* renamed from: d, reason: collision with root package name */
        private int f3784d;

        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f3781a, this.f3782b, this.f3783c, this.f3784d);
        }

        public final Builder withName(String str) {
            this.f3781a = str;
            return this;
        }

        public final Builder withType(int i2) {
            this.f3784d = i2;
            return this;
        }

        public final Builder withValue(String str) {
            this.f3782b = str;
            return this;
        }

        public final Builder withValueBytes(byte[] bArr) {
            this.f3783c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(String str, String str2, byte[] bArr, int i2) {
        this.f3777a = str;
        this.f3778b = str2;
        this.f3779c = bArr;
        this.f3780d = i2;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = serviceModuleCounterReport.f3777a;
        }
        if ((i3 & 2) != 0) {
            str2 = serviceModuleCounterReport.f3778b;
        }
        if ((i3 & 4) != 0) {
            bArr = serviceModuleCounterReport.f3779c;
        }
        if ((i3 & 8) != 0) {
            i2 = serviceModuleCounterReport.f3780d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i2);
    }

    public final String component1() {
        return this.f3777a;
    }

    public final String component2() {
        return this.f3778b;
    }

    public final byte[] component3() {
        return this.f3779c;
    }

    public final int component4() {
        return this.f3780d;
    }

    public final ServiceModuleCounterReport copy(String str, String str2, byte[] bArr, int i2) {
        return new ServiceModuleCounterReport(str, str2, bArr, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f3780d == serviceModuleCounterReport.f3780d && i.a(this.f3777a, serviceModuleCounterReport.f3777a) && i.a(this.f3778b, serviceModuleCounterReport.f3778b) && Arrays.equals(this.f3779c, serviceModuleCounterReport.f3779c);
    }

    public final String getName() {
        return this.f3777a;
    }

    public final int getType() {
        return this.f3780d;
    }

    public final String getValue() {
        return this.f3778b;
    }

    public final byte[] getValueBytes() {
        return this.f3779c;
    }

    public int hashCode() {
        int i2 = this.f3780d * 31;
        String str = this.f3777a;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3778b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f3779c;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.f3777a + ", value=" + this.f3778b + ", valueBytes=" + Arrays.toString(this.f3779c) + ", type=" + this.f3780d + ')';
    }
}
