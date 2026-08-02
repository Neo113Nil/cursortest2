package defpackage;

/* loaded from: classes11.dex */
public final class q691 implements i131 {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public lxq d;
    public final jp60 e;

    public /* synthetic */ q691(jp60 jp60Var, int i) {
        this.a = i;
        this.e = jp60Var;
    }

    @Override // defpackage.i131
    public final i131 a(String str) {
        int i = this.a;
        jp60 jp60Var = this.e;
        switch (i) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((b691) jp60Var).g(this.d, str, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((sd91) jp60Var).g(this.d, str, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((yf91) jp60Var).g(this.d, str, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((mg91) jp60Var).g(this.d, str, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            default:
                if (!this.b) {
                    this.b = true;
                    ((os91) jp60Var).g(this.d, str, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.i131
    public final i131 add(boolean z) {
        int i = this.a;
        jp60 jp60Var = this.e;
        switch (i) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((b691) jp60Var).h(this.d, z ? 1 : 0, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((sd91) jp60Var).h(this.d, z ? 1 : 0, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((yf91) jp60Var).h(this.d, z ? 1 : 0, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((mg91) jp60Var).h(this.d, z ? 1 : 0, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            default:
                if (!this.b) {
                    this.b = true;
                    ((os91) jp60Var).h(this.d, z ? 1 : 0, this.c);
                    break;
                } else {
                    ny61.x("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
        }
        return null;
    }
}
