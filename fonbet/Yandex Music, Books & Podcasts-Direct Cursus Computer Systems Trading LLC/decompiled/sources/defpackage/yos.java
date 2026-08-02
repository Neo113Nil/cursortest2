package defpackage;

/* loaded from: classes.dex */
public final class yos extends zgu {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public yos(zos zosVar, int i) {
        this.a = 0;
        this.d = zosVar;
        this.c = i;
        this.b = false;
    }

    @Override // defpackage.zgu, defpackage.ygu
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.zgu, defpackage.ygu
    public final void b() {
        switch (this.a) {
            case 0:
                ((zos) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ygu yguVar = ((xgu) this.d).d;
                    if (yguVar != null) {
                        yguVar.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ygu
    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((zos) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                xgu xguVar = (xgu) this.d;
                if (i == xguVar.a.size()) {
                    ygu yguVar = xguVar.d;
                    if (yguVar != null) {
                        yguVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    xguVar.e = false;
                    break;
                }
                break;
        }
    }

    public yos(xgu xguVar) {
        this.a = 1;
        this.d = xguVar;
        this.b = false;
        this.c = 0;
    }
}
