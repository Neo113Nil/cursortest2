package b7;

import c7.InterfaceC0556a;
import f6.C4522a;
import k6.C4647a;
import n6.InterfaceC4782h;
import p7.C4853a;

/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0531c implements InterfaceC0556a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5575a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5576b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5577c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5578d;

    /* renamed from: e, reason: collision with root package name */
    public final C4647a f5579e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5580f;

    /* renamed from: g, reason: collision with root package name */
    public final C4522a f5581g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5582h;
    public final f6.f i;

    public C0531c(C4853a c4853a, Y6.a aVar, long j6, long j9, C4647a c4647a, l6.i iVar, C4522a c4522a, int i, f6.f fVar) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f5575a = c4853a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f5576b = aVar;
        this.f5577c = j6;
        this.f5578d = j9;
        if (c4647a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f5579e = c4647a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f5580f = iVar;
        if (c4522a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f5581g = c4522a;
        this.f5582h = i;
        this.i = fVar;
    }

    @Override // c7.InterfaceC0556a
    public final f6.c a() {
        return this.f5581g;
    }

    @Override // c7.InterfaceC0556a
    public final l6.i b() {
        return this.f5580f;
    }

    @Override // c7.InterfaceC0556a
    public final f6.g c() {
        return this.i;
    }

    @Override // c7.InterfaceC0556a
    public final long d() {
        return this.f5578d;
    }

    @Override // c7.InterfaceC0556a
    public final int e() {
        return this.f5582h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0531c)) {
            return false;
        }
        C0531c c0531c = (C0531c) obj;
        if (!this.f5575a.equals(c0531c.f5575a) || !this.f5576b.equals(c0531c.f5576b) || this.f5577c != c0531c.f5577c || this.f5578d != c0531c.f5578d || !this.f5579e.equals(c0531c.f5579e) || !this.f5580f.equals(c0531c.f5580f) || !this.f5581g.equals(c0531c.f5581g) || this.f5582h != c0531c.f5582h) {
            return false;
        }
        f6.f fVar = c0531c.i;
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

    @Override // c7.InterfaceC0556a
    public final InterfaceC4782h h() {
        return this.f5579e;
    }

    public final int hashCode() {
        int hashCode = (((this.f5575a.hashCode() ^ 1000003) * 1000003) ^ this.f5576b.hashCode()) * 1000003;
        long j6 = this.f5577c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f5578d;
        int hashCode2 = (((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f5579e.hashCode()) * 1000003) ^ this.f5580f.hashCode()) * (-721379959)) ^ this.f5581g.hashCode()) * 1000003) ^ this.f5582h) * 1000003;
        f6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f37488b).hashCode())) * 1000003;
    }

    @Override // c7.InterfaceC0556a
    public final String i() {
        return null;
    }

    @Override // c7.InterfaceC0556a
    public final long j() {
        return this.f5577c;
    }

    @Override // c7.InterfaceC0556a
    public final C4853a k() {
        return this.f5575a;
    }

    @Override // c7.InterfaceC0556a
    public final Y6.a l() {
        return this.f5576b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f5575a + ", instrumentationScopeInfo=" + this.f5576b + ", timestampEpochNanos=" + this.f5577c + ", observedTimestampEpochNanos=" + this.f5578d + ", spanContext=" + this.f5579e + ", severity=" + this.f5580f + ", severityText=null, attributes=" + this.f5581g + ", totalAttributeCount=" + this.f5582h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
