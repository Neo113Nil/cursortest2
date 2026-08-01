package b7;

import d7.InterfaceC4454a;
import g6.C4531a;
import g6.InterfaceC4532b;
import k6.C4636a;
import n6.InterfaceC4766h;
import p7.C4853a;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0521a implements InterfaceC4454a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5415a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5416b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5417c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5418d;

    /* renamed from: e, reason: collision with root package name */
    public final C4636a f5419e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5420f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5421g;

    /* renamed from: h, reason: collision with root package name */
    public final C4531a f5422h;
    public final f6.f i;

    public C0521a(C4853a c4853a, Y6.a aVar, long j6, long j9, C4636a c4636a, l6.i iVar, int i, C4531a c4531a, f6.f fVar) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f5415a = c4853a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f5416b = aVar;
        this.f5417c = j6;
        this.f5418d = j9;
        if (c4636a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f5419e = c4636a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f5420f = iVar;
        this.f5421g = i;
        if (c4531a == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f5422h = c4531a;
        this.i = fVar;
    }

    @Override // c7.InterfaceC0545a
    public final l6.i b() {
        return this.f5420f;
    }

    @Override // c7.InterfaceC0545a
    public final f6.g c() {
        return this.i;
    }

    @Override // c7.InterfaceC0545a
    public final long d() {
        return this.f5418d;
    }

    @Override // c7.InterfaceC0545a
    public final int e() {
        return this.f5421g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0521a)) {
            return false;
        }
        C0521a c0521a = (C0521a) obj;
        if (!this.f5415a.equals(c0521a.f5415a) || !this.f5416b.equals(c0521a.f5416b) || this.f5417c != c0521a.f5417c || this.f5418d != c0521a.f5418d || !this.f5419e.equals(c0521a.f5419e) || !this.f5420f.equals(c0521a.f5420f) || this.f5421g != c0521a.f5421g || !this.f5422h.equals(c0521a.f5422h)) {
            return false;
        }
        f6.f fVar = c0521a.i;
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

    @Override // d7.InterfaceC4454a
    public final InterfaceC4532b g() {
        return this.f5422h;
    }

    @Override // c7.InterfaceC0545a
    public final InterfaceC4766h h() {
        return this.f5419e;
    }

    public final int hashCode() {
        int hashCode = (((this.f5415a.hashCode() ^ 1000003) * 1000003) ^ this.f5416b.hashCode()) * 1000003;
        long j6 = this.f5417c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f5418d;
        int hashCode2 = (((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f5419e.hashCode()) * 1000003) ^ this.f5420f.hashCode()) * (-721379959)) ^ this.f5421g) * 1000003) ^ this.f5422h.hashCode()) * 1000003;
        f6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f37526b).hashCode())) * 1000003;
    }

    @Override // c7.InterfaceC0545a
    public final String i() {
        return null;
    }

    @Override // c7.InterfaceC0545a
    public final long j() {
        return this.f5417c;
    }

    @Override // c7.InterfaceC0545a
    public final C4853a k() {
        return this.f5415a;
    }

    @Override // c7.InterfaceC0545a
    public final Y6.a l() {
        return this.f5416b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f5415a + ", instrumentationScopeInfo=" + this.f5416b + ", timestampEpochNanos=" + this.f5417c + ", observedTimestampEpochNanos=" + this.f5418d + ", spanContext=" + this.f5419e + ", severity=" + this.f5420f + ", severityText=null, totalAttributeCount=" + this.f5421g + ", extendedAttributes=" + this.f5422h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
