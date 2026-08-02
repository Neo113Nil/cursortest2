package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class uvx0 implements jmx {
    public static final tvx0 Companion = new tvx0();
    public final String a;
    public final String b;
    public final String c;
    public final zzs d;
    public final zzs e;
    public final String f;
    public final String g;
    public final Boolean h;

    public /* synthetic */ uvx0(int i, String str, String str2, String str3, zzs zzsVar, zzs zzsVar2, String str4, String str5, Boolean bool) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, svx0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = zzsVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = zzsVar2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
    }

    @Override // defpackage.jmx
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.g;
    }

    public final Boolean c() {
        return this.h;
    }

    @Override // defpackage.jmx
    public final String getService() {
        return this.b;
    }

    public uvx0(zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4) {
        Boolean bool = Boolean.TRUE;
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = zzsVar;
        this.e = zzsVar2;
        this.f = str3;
        this.g = str4;
        this.h = bool;
    }
}
