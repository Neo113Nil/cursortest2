package defpackage;

/* loaded from: classes4.dex */
public final class zax {
    public final ytx0 a;

    public zax(ytx0 ytx0Var) {
        this.a = ytx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zax) && this.a == ((zax) obj).a;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) - 564770708) * 31) + 1648397968;
    }

    public final String toString() {
        return "JsScriptConfig(jsAppBridge=" + this.a + ", jsAppBridgeName=TaxiAppBridge, script=javascript:\nwindow.taxi = window.taxi || {};\nwindow.taxi.app = window.TaxiAppBridge;)";
    }
}
