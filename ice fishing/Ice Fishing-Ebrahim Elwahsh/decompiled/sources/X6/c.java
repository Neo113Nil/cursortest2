package X6;

import b6.C0530a;
import g6.C4531a;
import j6.InterfaceC4606h;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class c implements Y6.a {

    /* renamed from: a, reason: collision with root package name */
    public final C4707a f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f3841b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3842c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3843d;

    /* renamed from: e, reason: collision with root package name */
    public final C4531a f3844e;

    /* renamed from: f, reason: collision with root package name */
    public final h6.i f3845f;

    /* renamed from: g, reason: collision with root package name */
    public final C0530a f3846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3847h;
    public final b6.f i;

    public c(C4707a c4707a, U6.a aVar, long j9, long j10, C4531a c4531a, h6.i iVar, C0530a c0530a, int i, b6.f fVar) {
        if (c4707a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f3840a = c4707a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f3841b = aVar;
        this.f3842c = j9;
        this.f3843d = j10;
        if (c4531a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f3844e = c4531a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f3845f = iVar;
        if (c0530a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3846g = c0530a;
        this.f3847h = i;
        this.i = fVar;
    }

    @Override // Y6.a
    public final b6.c a() {
        return this.f3846g;
    }

    @Override // Y6.a
    public final h6.i b() {
        return this.f3845f;
    }

    @Override // Y6.a
    public final b6.g c() {
        return this.i;
    }

    @Override // Y6.a
    public final long d() {
        return this.f3843d;
    }

    @Override // Y6.a
    public final int e() {
        return this.f3847h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f3840a.equals(cVar.f3840a) || !this.f3841b.equals(cVar.f3841b) || this.f3842c != cVar.f3842c || this.f3843d != cVar.f3843d || !this.f3844e.equals(cVar.f3844e) || !this.f3845f.equals(cVar.f3845f) || !this.f3846g.equals(cVar.f3846g) || this.f3847h != cVar.f3847h) {
            return false;
        }
        b6.f fVar = cVar.i;
        b6.f fVar2 = this.i;
        if (fVar2 == null) {
            if (fVar != null) {
                return false;
            }
        } else if (!fVar2.equals(fVar)) {
            return false;
        }
        return true;
    }

    @Override // Y6.a
    public final String f() {
        return null;
    }

    @Override // Y6.a
    public final InterfaceC4606h h() {
        return this.f3844e;
    }

    public final int hashCode() {
        int hashCode = (((this.f3840a.hashCode() ^ 1000003) * 1000003) ^ this.f3841b.hashCode()) * 1000003;
        long j9 = this.f3842c;
        int i = (hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f3843d;
        int hashCode2 = (((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f3844e.hashCode()) * 1000003) ^ this.f3845f.hashCode()) * (-721379959)) ^ this.f3846g.hashCode()) * 1000003) ^ this.f3847h) * 1000003;
        b6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f5570b).hashCode())) * 1000003;
    }

    @Override // Y6.a
    public final String i() {
        return null;
    }

    @Override // Y6.a
    public final long j() {
        return this.f3842c;
    }

    @Override // Y6.a
    public final C4707a k() {
        return this.f3840a;
    }

    @Override // Y6.a
    public final U6.a l() {
        return this.f3841b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f3840a + ", instrumentationScopeInfo=" + this.f3841b + ", timestampEpochNanos=" + this.f3842c + ", observedTimestampEpochNanos=" + this.f3843d + ", spanContext=" + this.f3844e + ", severity=" + this.f3845f + ", severityText=null, attributes=" + this.f3846g + ", totalAttributeCount=" + this.f3847h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
