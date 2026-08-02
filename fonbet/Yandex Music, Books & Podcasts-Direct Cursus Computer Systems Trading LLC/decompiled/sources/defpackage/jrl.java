package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jrl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ krl b;
    public final /* synthetic */ int c;

    public /* synthetic */ jrl(krl krlVar, int i, int i2) {
        this.a = i2;
        this.b = krlVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lrl lrlVar = this.b.g;
                if (lrlVar.V0(25) || lrlVar.V0(33)) {
                    boolean V0 = lrlVar.V0(33);
                    int i = this.c;
                    if (!V0) {
                        lrlVar.E0(i);
                        break;
                    } else {
                        lrlVar.o0(i, 1);
                        break;
                    }
                }
                break;
            default:
                lrl lrlVar2 = this.b.g;
                if (lrlVar2.V0(26) || lrlVar2.V0(34)) {
                    int i2 = this.c;
                    if (i2 == -100) {
                        if (!lrlVar2.V0(34)) {
                            lrlVar2.S(true);
                            break;
                        } else {
                            lrlVar2.D(1, true);
                            break;
                        }
                    } else if (i2 == -1) {
                        if (!lrlVar2.V0(34)) {
                            lrlVar2.E();
                            break;
                        } else {
                            lrlVar2.N(1);
                            break;
                        }
                    } else if (i2 == 1) {
                        if (!lrlVar2.V0(34)) {
                            lrlVar2.Y();
                            break;
                        } else {
                            lrlVar2.F(1);
                            break;
                        }
                    } else if (i2 == 100) {
                        if (!lrlVar2.V0(34)) {
                            lrlVar2.S(false);
                            break;
                        } else {
                            lrlVar2.D(1, false);
                            break;
                        }
                    } else if (i2 == 101) {
                        if (!lrlVar2.V0(34)) {
                            lrlVar2.S(!lrlVar2.p1());
                            break;
                        } else {
                            lrlVar2.D(1, !lrlVar2.p1());
                            break;
                        }
                    } else {
                        dfi.o(i2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                        break;
                    }
                }
                break;
        }
    }
}
