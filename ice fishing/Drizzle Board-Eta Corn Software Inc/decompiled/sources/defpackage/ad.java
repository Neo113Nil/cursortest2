package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ad extends cd implements v9, g9 {
    public static final /* synthetic */ long jb9XjC4I = b1.qoPGr6Ce.objectFieldOffset(ad.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final h9 P7K7Inc8;
    public final Object Qr9iLBAD;
    public final n9 VgvYg0wo;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object b2ZJblxo;

    public ad(n9 n9Var, h9 h9Var) {
        super(-1);
        this.VgvYg0wo = n9Var;
        this.P7K7Inc8 = h9Var;
        this.b2ZJblxo = fn.Qr9iLBAD;
        this.Qr9iLBAD = w30.ZyZthT5G(h9Var.wxUZMvaN());
    }

    @Override // defpackage.v9
    public final v9 MdtA4re8() {
        return this.P7K7Inc8;
    }

    @Override // defpackage.g9
    public final void P7K7Inc8(Object obj) {
        Throwable qoPGr6Ce = l30.qoPGr6Ce(obj);
        Object c7Var = qoPGr6Ce == null ? obj : new c7(qoPGr6Ce, false);
        h9 h9Var = this.P7K7Inc8;
        l9 wxUZMvaN = h9Var.wxUZMvaN();
        n9 n9Var = this.VgvYg0wo;
        if (n9Var.gjV1z5T1(wxUZMvaN)) {
            this.b2ZJblxo = c7Var;
            this.wxUZMvaN = 0;
            n9Var.RXQxj5Oe(h9Var.wxUZMvaN(), this);
            return;
        }
        cg qoPGr6Ce2 = kc0.qoPGr6Ce();
        if (qoPGr6Ce2.wxUZMvaN >= 4294967296L) {
            this.b2ZJblxo = c7Var;
            this.wxUZMvaN = 0;
            qoPGr6Ce2.lwWCatUu(this);
            return;
        }
        qoPGr6Ce2.U0LaHZX7(true);
        try {
            l9 wxUZMvaN2 = h9Var.wxUZMvaN();
            Object gmkaJpmS = w30.gmkaJpmS(wxUZMvaN2, this.Qr9iLBAD);
            try {
                h9Var.P7K7Inc8(obj);
                while (qoPGr6Ce2.Mq3SeTnW()) {
                }
            } finally {
                w30.FXJmAAN1(wxUZMvaN2, gmkaJpmS);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.cd
    public final Object ow5vqvCr() {
        Object obj = this.b2ZJblxo;
        this.b2ZJblxo = fn.Qr9iLBAD;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.VgvYg0wo + ", " + ra.zCflySGU(this.P7K7Inc8) + ']';
    }

    @Override // defpackage.g9
    public final l9 wxUZMvaN() {
        return this.P7K7Inc8.wxUZMvaN();
    }

    @Override // defpackage.cd
    public final g9 VgvYg0wo() {
        return this;
    }
}
