package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pd1 implements defpackage.la1 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;

    public pd1(int i) {
        this.ZpBGe2uQfcn8 = i;
        switch (i) {
            case 2:
                this.giKS3J6vZuNy = new defpackage.l21(17);
                this.fWTAfUmVKrZq = new defpackage.rj0(16);
                break;
            case 4:
                this.giKS3J6vZuNy = new defpackage.ho0(new java.lang.ref.Reference[16]);
                this.fWTAfUmVKrZq = new java.lang.ref.ReferenceQueue();
                break;
        }
    }

    @Override // defpackage.la1
    public int JhCgjQRTAOCT(int i) {
        do {
            i = ((defpackage.rw0) this.fWTAfUmVKrZq).GE9mJIPrb8gP(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(((java.lang.CharSequence) this.giKS3J6vZuNy).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.la1
    public int ZpBGe2uQfcn8(int i) {
        do {
            i = ((defpackage.rw0) this.fWTAfUmVKrZq).GE9mJIPrb8gP(i);
            if (i == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(((java.lang.CharSequence) this.giKS3J6vZuNy).charAt(i)));
        return i;
    }

    @Override // defpackage.la1
    public int fWTAfUmVKrZq(int i) {
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.giKS3J6vZuNy;
        do {
            i = ((defpackage.rw0) this.fWTAfUmVKrZq).e6mdH7fiFuta(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.la1
    public int giKS3J6vZuNy(int i) {
        do {
            i = ((defpackage.rw0) this.fWTAfUmVKrZq).e6mdH7fiFuta(i);
            if (i == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(((java.lang.CharSequence) this.giKS3J6vZuNy).charAt(i - 1)));
        return i;
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 5:
                return "Bounds{lower=" + ((defpackage.v80) this.giKS3J6vZuNy) + " upper=" + ((defpackage.v80) this.fWTAfUmVKrZq) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pd1(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
        this.fWTAfUmVKrZq = obj2;
    }

    public pd1(android.view.WindowInsetsAnimation.Bounds bounds) {
        android.graphics.Insets lowerBound;
        android.graphics.Insets upperBound;
        this.ZpBGe2uQfcn8 = 5;
        lowerBound = bounds.getLowerBound();
        this.giKS3J6vZuNy = defpackage.v80.fWTAfUmVKrZq(lowerBound);
        upperBound = bounds.getUpperBound();
        this.fWTAfUmVKrZq = defpackage.v80.fWTAfUmVKrZq(upperBound);
    }
}
