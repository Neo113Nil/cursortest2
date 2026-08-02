package defpackage;

/* loaded from: classes5.dex */
public final class ejp extends bt1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ fjp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejp(fjp fjpVar, int i) {
        super(1, fjpVar.c);
        this.c = i;
        switch (i) {
            case 1:
                this.d = fjpVar;
                super(1, fjpVar.c);
                break;
            default:
                this.d = fjpVar;
                break;
        }
    }

    @Override // defpackage.bt1
    public final void b() {
        fjp fjpVar;
        switch (this.c) {
            case 0:
                fjpVar = this.d;
                try {
                    jkk.c();
                    try {
                        jkk.a();
                        jee jeeVar = jkk.a;
                        jeeVar.getClass();
                        ujp ujpVar = fjpVar.e;
                        if (ujpVar == null) {
                            throw new IllegalStateException("listener unset");
                        }
                        ujpVar.q();
                        jeeVar.getClass();
                        return;
                    } finally {
                        try {
                            jkk.a.getClass();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                }
            default:
                fjpVar = this.d;
                try {
                    jkk.c();
                    try {
                        jkk.a();
                        jee jeeVar2 = jkk.a;
                        jeeVar2.getClass();
                        ujp ujpVar2 = fjpVar.e;
                        if (ujpVar2 == null) {
                            throw new IllegalStateException("listener unset");
                        }
                        ujpVar2.onReady();
                        jeeVar2.getClass();
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
