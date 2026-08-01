package b7;

import c7.InterfaceC0545a;
import f6.C4512a;
import k6.C4636a;
import n6.InterfaceC4766h;
import p7.C4853a;

/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0523c implements InterfaceC0545a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5425a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5427c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5428d;

    /* renamed from: e, reason: collision with root package name */
    public final C4636a f5429e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5430f;

    /* renamed from: g, reason: collision with root package name */
    public final C4512a f5431g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5432h;
    public final f6.f i;

    public C0523c(C4853a c4853a, Y6.a aVar, long j6, long j9, C4636a c4636a, l6.i iVar, C4512a c4512a, int i, f6.f fVar) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f5425a = c4853a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f5426b = aVar;
        this.f5427c = j6;
        this.f5428d = j9;
        if (c4636a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f5429e = c4636a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f5430f = iVar;
        if (c4512a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f5431g = c4512a;
        this.f5432h = i;
        this.i = fVar;
    }

    @Override // c7.InterfaceC0545a
    public final f6.c a() {
        return this.f5431g;
    }

    @Override // c7.InterfaceC0545a
    public final l6.i b() {
        return this.f5430f;
    }

    @Override // c7.InterfaceC0545a
    public final f6.g c() {
        return this.i;
    }

    @Override // c7.InterfaceC0545a
    public final long d() {
        return this.f5428d;
    }

    @Override // c7.InterfaceC0545a
    public final int e() {
        return this.f5432h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0523c)) {
            return false;
        }
        C0523c c0523c = (C0523c) obj;
        if (!this.f5425a.equals(c0523c.f5425a) || !this.f5426b.equals(c0523c.f5426b) || this.f5427c != c0523c.f5427c || this.f5428d != c0523c.f5428d || !this.f5429e.equals(c0523c.f5429e) || !this.f5430f.equals(c0523c.f5430f) || !this.f5431g.equals(c0523c.f5431g) || this.f5432h != c0523c.f5432h) {
            return false;
        }
        f6.f fVar = c0523c.i;
        f6.f fVar2 = this.i;
        if (fVar2 == null) {
            if (fVar != null) {
                return false;
            }
        } else if (!fVar2.equals(fVar)) {
            return false;
        }
        return true;
    }

    @Override // c7.InterfaceC0545a
    public final String f() {
        return null;
    }

    @Override // c7.InterfaceC0545a
    public final InterfaceC4766h h() {
        return this.f5429e;
    }

    public final int hashCode() {
        int hashCode = (((this.f5425a.hashCode() ^ 1000003) * 1000003) ^ this.f5426b.hashCode()) * 1000003;
        long j6 = this.f5427c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f5428d;
        int hashCode2 = (((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f5429e.hashCode()) * 1000003) ^ this.f5430f.hashCode()) * (-721379959)) ^ this.f5431g.hashCode()) * 1000003) ^ this.f5432h) * 1000003;
        f6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f37526b).hashCode())) * 1000003;
    }

    @Override // c7.InterfaceC0545a
    public final String i() {
        return null;
    }

    @Override // c7.InterfaceC0545a
    public final long j() {
        return this.f5427c;
    }

    @Override // c7.InterfaceC0545a
    public final C4853a k() {
        return this.f5425a;
    }

    @Override // c7.InterfaceC0545a
    public final Y6.a l() {
        return this.f5426b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f5425a + ", instrumentationScopeInfo=" + this.f5426b + ", timestampEpochNanos=" + this.f5427c + ", observedTimestampEpochNanos=" + this.f5428d + ", spanContext=" + this.f5429e + ", severity=" + this.f5430f + ", severityText=null, attributes=" + this.f5431g + ", totalAttributeCount=" + this.f5432h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
