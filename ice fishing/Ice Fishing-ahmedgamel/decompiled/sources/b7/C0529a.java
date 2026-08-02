package b7;

import d7.InterfaceC4465a;
import g6.C4535a;
import g6.InterfaceC4536b;
import k6.C4647a;
import n6.InterfaceC4782h;
import p7.C4853a;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0529a implements InterfaceC4465a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5565a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5566b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5567c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5568d;

    /* renamed from: e, reason: collision with root package name */
    public final C4647a f5569e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5570f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5571g;

    /* renamed from: h, reason: collision with root package name */
    public final C4535a f5572h;
    public final f6.f i;

    public C0529a(C4853a c4853a, Y6.a aVar, long j6, long j9, C4647a c4647a, l6.i iVar, int i, C4535a c4535a, f6.f fVar) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f5565a = c4853a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f5566b = aVar;
        this.f5567c = j6;
        this.f5568d = j9;
        if (c4647a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f5569e = c4647a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f5570f = iVar;
        this.f5571g = i;
        if (c4535a == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f5572h = c4535a;
        this.i = fVar;
    }

    @Override // c7.InterfaceC0556a
    public final l6.i b() {
        return this.f5570f;
    }

    @Override // c7.InterfaceC0556a
    public final f6.g c() {
        return this.i;
    }

    @Override // c7.InterfaceC0556a
    public final long d() {
        return this.f5568d;
    }

    @Override // c7.InterfaceC0556a
    public final int e() {
        return this.f5571g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0529a)) {
            return false;
        }
        C0529a c0529a = (C0529a) obj;
        if (!this.f5565a.equals(c0529a.f5565a) || !this.f5566b.equals(c0529a.f5566b) || this.f5567c != c0529a.f5567c || this.f5568d != c0529a.f5568d || !this.f5569e.equals(c0529a.f5569e) || !this.f5570f.equals(c0529a.f5570f) || this.f5571g != c0529a.f5571g || !this.f5572h.equals(c0529a.f5572h)) {
            return false;
        }
        f6.f fVar = c0529a.i;
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

    @Override // c7.InterfaceC0556a
    public final String f() {
        return null;
    }

    @Override // d7.InterfaceC4465a
    public final InterfaceC4536b g() {
        return this.f5572h;
    }

    @Override // c7.InterfaceC0556a
    public final InterfaceC4782h h() {
        return this.f5569e;
    }

    public final int hashCode() {
        int hashCode = (((this.f5565a.hashCode() ^ 1000003) * 1000003) ^ this.f5566b.hashCode()) * 1000003;
        long j6 = this.f5567c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f5568d;
        int hashCode2 = (((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f5569e.hashCode()) * 1000003) ^ this.f5570f.hashCode()) * (-721379959)) ^ this.f5571g) * 1000003) ^ this.f5572h.hashCode()) * 1000003;
        f6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f37488b).hashCode())) * 1000003;
    }

    @Override // c7.InterfaceC0556a
    public final String i() {
        return null;
    }

    @Override // c7.InterfaceC0556a
    public final long j() {
        return this.f5567c;
    }

    @Override // c7.InterfaceC0556a
    public final C4853a k() {
        return this.f5565a;
    }

    @Override // c7.InterfaceC0556a
    public final Y6.a l() {
        return this.f5566b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f5565a + ", instrumentationScopeInfo=" + this.f5566b + ", timestampEpochNanos=" + this.f5567c + ", observedTimestampEpochNanos=" + this.f5568d + ", spanContext=" + this.f5569e + ", severity=" + this.f5570f + ", severityText=null, totalAttributeCount=" + this.f5571g + ", extendedAttributes=" + this.f5572h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
