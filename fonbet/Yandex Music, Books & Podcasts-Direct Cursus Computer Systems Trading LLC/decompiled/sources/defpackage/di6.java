package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class di6 implements xjj, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ uif b;

    public /* synthetic */ di6(uif uifVar, int i) {
        this.a = i;
        this.b = uifVar;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((m40) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((az6) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((az6) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((r37) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((ybg) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    return ((hxo) this.b).equals(((zyc) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return (m40) this.b;
            case 1:
                return (az6) this.b;
            case 2:
                return (az6) this.b;
            case 3:
                return (r37) this.b;
            case 4:
                return (ybg) this.b;
            default:
                return (hxo) this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return ((m40) this.b).hashCode();
            case 1:
                return ((az6) this.b).hashCode();
            case 2:
                return ((az6) this.b).hashCode();
            case 3:
                return ((r37) this.b).hashCode();
            case 4:
                return ((ybg) this.b).hashCode();
            default:
                return ((hxo) this.b).hashCode();
        }
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.a) {
            case 0:
                ((m40) this.b).invoke(obj);
                break;
            case 1:
                ((az6) this.b).invoke(obj);
                break;
            case 2:
                ((az6) this.b).invoke(obj);
                break;
            case 3:
                ((r37) this.b).invoke(obj);
                break;
            case 4:
                ((ybg) this.b).invoke(obj);
                break;
            default:
                ((hxo) this.b).invoke(obj);
                break;
        }
    }
}
